package com.seongend.sout.service;

import com.seongend.sout.dto.CommentRequestDto;
import com.seongend.sout.dto.CommentResponseDto;
import com.seongend.sout.entity.Comment;
import com.seongend.sout.entity.Post;
import com.seongend.sout.entity.User;
import com.seongend.sout.repository.CommentRepository;
import com.seongend.sout.repository.PostRepository;
import com.seongend.sout.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final PostRepository postRepository;
    private final CommentRepository commentRepository;
    private final UserRepository userRepository;

    public CommentResponseDto createComments(Long postId, CommentRequestDto requestDto, Long userId) throws NullPointerException {

        Post post = postRepository.findById(postId).orElse(null);
        if (post == null)
            throw new NullPointerException("해당 게시글 정보가 존재하지 않습니다.");

        Comment comment = new Comment(post, requestDto, userId);
        commentRepository.save(comment);
        User user = userRepository.findById(userId).orElseThrow(
                () -> new NullPointerException("사용자가 없습니다"));
        return new CommentResponseDto(comment.getId(),
                                    user.getNickname(),
                                    requestDto.getContent(),
                                    comment.getModifiedAt(),
                                    user.getUsername());
    }

    public Long deleteComments(Long commentId) {
        commentRepository.deleteById(commentId);
        return commentId;
    }
}
