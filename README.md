<h3 align="center"><b>ð° í­íī99 6ėĢžė°Ļ 12í ëŊļëíëĄė íļ ð°</b></h3>
	
<h4 align="center">ð 2021.12.06 ~ 2021.12.11</h4>
<br>

---

<h3><b>ðŦ íëĄė íļ ėę° ðŦ</b></h3>
ę°ë°ė ė ëģī ęģĩė  ėŧĪëŪĪëí°! ę°ë°ėëĪė ėīëĄąė ęŋęŋëëĪ..â­
<br>Front-End Git Repository : https://github.com/mtae616/sout-FrontEnd

<br><br>

<h3><b>ð íëĄė íļ ėė°ėė ð</b></h3>
https://www.youtube.com/watch?v=Ltmke9IyPXo
<br>

---

<br>
<h3 align="center"><b>ð  Tech Stack ð </b></h3>
<p align="center">
<img src="https://img.shields.io/badge/github-181717?style=flat&logo=github&logoColor=white"></a>&nbsp;&nbsp;&nbsp;
<img src="https://img.shields.io/badge/MySQL-005C84?style=flat&logo=mysql&logoColor=white"></a>&nbsp;&nbsp;&nbsp; 
<img src="https://img.shields.io/badge/Springboot-47?style=flat&logo=Springboot&logoColor=white"/></a>&nbsp;&nbsp;&nbsp; 
<img src="https://img.shields.io/badge/Java-ED8B00?style=flat&logo=java&logoColor=white"/></a>&nbsp;&nbsp;&nbsp;
<img src="https://img.shields.io/badge/JWT-000000?style=flat&logo=JSON%20web%20tokens&logoColor=white"></a>&nbsp;&nbsp;&nbsp;
<img src="https://img.shields.io/badge/Swagger-85EA2D?style=flat&logo=Swagger&logoColor=white"></a>&nbsp;&nbsp;&nbsp;
<img src="https://img.shields.io/badge/gradle-02303A?style=flat&logo=gradle&logoColor=white"></a>&nbsp;&nbsp;&nbsp;
<img src="https://img.shields.io/badge/Amazon_AWS-FF9900?style=flat&logo=amazonaws&logoColor=white"></a>&nbsp;&nbsp;&nbsp;
<img src="https://img.shields.io/badge/Notion-000000?style=flat&logo=notion&logoColor=white"></a>&nbsp;&nbsp;&nbsp;

<br><br>
<h3 align="center"><b>ð Project Directory Structure ð</b></h3>
<pre>
<code>
/com.seongend.sout
  âââ/config
     âââ /SwaggerConfig.java
  âââ/controller
     âââ /CommentController.java
     âââ /HomeController.java
     âââ /KakaoUserController.java
     âââ /PostController.java
     âââ /UserController.java
  âââ/dto
     âââ /CommentRequestDto.java
     âââ /CommentResponseDto.java
     âââ /KakaoUserInfoDto.java
     âââ /PostRequestDto.java
     âââ /PostResponseDto.java
     âââ /SignupRequestDto.java
     âââ /UserInfoDto.java
  âââ/entity
     âââ /Comment.java
     âââ /Post.java
     âââ /Timestamped.java
     âââ /User.java
  âââ/repository
     âââ /CommentRepository.java
     âââ /PostRepository.java
     âââ /UserRepository.java
  âââ/security
     âââ /filter
         âââ /FormLoginFilter.java
         âââ /JwtAuthFilter.java
     âââ /jwt
         âââ /HeaderTokenExtractor.java
         âââ /JwtDecoder.java
         âââ /JwtPreProcessingToken.java
         âââ /JwtTokenUtils.java
     âââ /provider
         âââ /FormLoginAuthProvider.java
         âââ /JWTAuthProvider.java
     âââ /FilterSkipMatcher.java
     âââ /FormLoginSuccessHandler.java
     âââ /UserDetailsImpl.java
     âââ /UserDetailsServiceImpl.java
     âââ /WebSecurityConfig.java
  âââ/service
     âââ /CommentService.java
     âââ /HomeService.java
     âââ /KakaoUserService.java
     âââ /PostService.java
     âââ /UserService.java
  âââ/timeconversion
     âââ /TimeConversion.java
  âââ/validator
     âââ /UserInfoValidator.java
  âââ/SoutApplication.java
</code>
</pre>
<br>

---

<h3 align="center"><b>ðĒ Entity Relationship Diagram ðĒ</b></h3>
<p align="center"><img src="https://user-images.githubusercontent.com/57797592/145665724-4b516321-0d66-47e4-834b-e8aee8221664.png" /></p>

<br>
<h3 align="center"><b>ð· API Table ð·</b></h3>

### **User**

| **URI** | **RequestBody** | **ResponseBody** |
| --- | --- | --- |
| POST /user/login | {username : " ", password : " " } | {token : " "} |
| POST /user/signup | {email : " ", nickname : " ", interest : " ", password : " "} | Â  |
| POST /userinfo | ?token="token" | {email : " ", nickname : " ", interest : " ", password : " "} |

### **Posts**

| **URI** | **RequestBody** | **ResponseBody** |
| --- | --- | --- |
| GET / | ?page="pagenum"&size="size" | \[{email : " ", nickname : " ", interest : " ", content: " ", postId : "", modifiedAt : "", url : "", commentList: \[{nickname : " ", content : " ", modifiedAt : ""}\]}\] |
| GET /search | search?keyword\="keyword"&page="pagenum"&size="size" | \[{ email : " ", nickname : " ", interest : " ", content: " ", postId : "", modifiedAt : "", url : "" commentList: \[{ nickname : " ", content : " ", modifiedAt : "" }\] |
| POST /newpost | { content: " ", url : " "} , ?token\="token" | {email : " ", nickname : " ", interest : " ", content: " ", postId : "", modifiedAt : "", url : "", commentList: [{nickname : " ", content : " ", modifiedAt : ""}]} |
| PUT /newpost/{postId} | { content: " ", url : " "} , ?token\="token" | Â  |
| DELETE /api/{postId} | ?token\="token" | Â  |

### **Comment**

| **URI** | **RequestBody** | **ResponseBody** |
| --- | --- | --- |
| POST /api/{postId}/comment | {content : " "}, ?value="token" | {nickname : " ", content : " ", modifiedAt : "", email : "", commentId : ""} |
| DELETE /api/{postId}/{commentId} | ?value="token" | Â  |

### **Profile**

| **URI** | **RequestBody** | **ResponseBody** |
| --- | --- | --- |
| PUT /setting/profile | {email : " ", nickname : " ", interest : " ", password : " "} , ?value="token" | Â  |
| GET /user/kakao/callback | ?code="code" | {token : " "} |

---

<h3 align="center"><b>ðĻðŧâðĪâðĻðŧ Members ðĻðŧâðĪâðĻðŧ</b></h3>
<br>
<table align="center">
    <tr>
        <td align="center">
        <a href="https://diddl.tistory.com/">ėėąė</a>
        </td>
        <td align="center">
        <a href="https://velog.io/@davidko">ęģ ėąëē</a>
        </td>
        <td align="center">
        <a href="https://www.notion.so/99-6-12-a6a6f7372d9d4d5a93af8803be40330e">ėąíīėļ</a>
        </td>
    </tr>
    <tr>
        <th width="25%" align="center">:spider_web: BACK-END
        </th>
        <th width="25%" align="center">:spider_web: BACK-END
        </th>
        <th width="25%" align="center">:spider_web: BACK-END 
        </th>
    </tr>
</table>
<br>

---

<h3 align="center"><b>â Trouble Shooting â</b></h3>
<br>
<details>
    <summary>
       <b>ëęļėī ëŽë Īėë íŽėĪíļë ė­ė ę° ëė§ ėë ëŽļė  ë°ė</b>
    </summary>
    <br><b>íīęē°: ëęļ ė  ė­ė  í íŽėĪíļ ė­ė </b>
    <br>ë°Đė 1: Entity ėĪęģ ė JPA ėë°ĐíĨ ęīęģëĄ ėĪęģ ė, casecade.all ėĪė ė íĩíī íīęē° ę°ëĨ
    <br>ë°Đė 2: Entity ėĪęģ ė JPA ëĻë°ĐíĨ ęīęģëĄ ėĪęģ ė, ëęļė ëĻžė  ė­ė í í, íŽėĪíļ ė­ė 
    <br>íėŽ íëĄė íļė ęē―ė° ėēė Entity ėĪęģ ė, ëĻë°ĐíĨėžëĄ ėĪęģíėŽ ë°Đė 2ëēė íĩíī ëŽļė ëĨž íīęē°íėëĪ. ėīë ëŊ ėĪę°ė ėĪęģė  ėĪëĨëĄ ėļíī ë°ėíë ëŽļė ëĨž ęēŠėīëģīėëë° ėīëŽí ëŽļė ëĨž ęēŠėžëĐ° ėēė Entity ėĪęģė ėĪėėąė ėėęģ , ëĪėëķí° íėīëļ ę°ė ęīęģëĨž ė ėę°íīė ėĪęģíīėžęē ëĪë ęēė ëęžëĪ..

```java
    @Transactional
    public Long deletePosts(Long postId) {
        Post post = postRepository.findById(postId).orElseThrow(() -> new IllegalArgumentException("ęēėëŽžėī ėėĩëëĪ."));
        commentRepository.deleteAllByPost(post);
        postRepository.deleteById(postId);
        return postId;
    }

```

</details>
	
<details>
    <summary>
        <b>deleteAllByIdxIn íļėķ ė entitymanagerę° ėë ëŽļė  ë°ė</b>
    </summary>

```java
javax.persistence.TransactionRequiredException: No EntityManager with actual transaction available for current thread - cannot reliably process 'remove' call

```

<br><b>íīęē° : @Transactional</b>
<br> ëŽļė  ë°ė ėėļ: deleteAllByIdíĻė íļėķ ė, EntityManagerę° íļėķėī ëëë° JPA Repositoryė ėë ęļ°ëģļė  íĻėëĪė ëŠĻë @Transactional ėīëļíėīėėī ëķėīėë ęēęģžë ëĪëĨīęē
@Transactionalėī ëķėīėë deleteAllByIdëžë íĻėë ė°ūė ėę° ėėëĪ. -> ę·ļë ëĪëĐī ė°ëĶŽę° deleteAllByIdëžë íĻėëĨž íļėķ ė @Transactional ėīëļíėīėė ë°ëė ëķėŽėĪėžë§ EntityManagerę° íļėķėī ëëĪ.


```java    
    @Transactional //ėī ėīëļíėīėė ë°ëė ëķėž ęē
    public Long deletePosts(Long postId) {
    ...
        commentRepository.deleteAllByPost(post); //deleteAllByPostíĻė íļėķ
    ...
    }

```

</details>
	
<details>
    <summary>
        <b>localhost:8080/swagger-ui.html 405 Error ę·ļë°ë° localhost:8080/swagger-resourcesë ëŽļė ę° ėėī ëėę°</b>
    </summary>
<br>ëŽļė  ë°ė ėėļ : URI ėĪė  ė root URI ëĪėė ë°ëĄ Path VariableëĄ ë°ėžëĐī swagger-uiė GET POST ėėē­ė BlockíëĪ. -> swagger ėėēīė ëēę·ļ? ëŽļė ëĄ ėėëĻ
<br><b>íīęē° : /{postId} -> /api/{postId} ėīë°ėėžëĄ ëŠĻë ėė </b>

```java
    @DeleteMapping("/api/{postId}")
    @PostMapping("/api/{postId}/comment")
    @DeleteMapping("/api/{postId}/{commentId}")
    // ėī 3ęĩ°ë°ė URI ėė  ps. ėī ëŽļė  ė§ė§ ėëŽīëĶŽ ėģë ėëėė.. íīęē°íëë° 10ėę° ęąļë ļėīė.. ę°ė ëŽļė ëĄ íīęē°íėĻëĪëĐī STAR ęļ°ëíĐëëĪ..â
```

</details>

<details>
    <summary>
        <b>CORSëŽļė  : frontėė HttpResponse 200ėžëĄ ëėė ė ė ėëíë, ėëēėė ëīë ĪėĪ tokenę°ėī íĪëėė ëģīėīė§ ėë ëŽļė  ë°ė</b>
    </summary>
    <br>íīęē° : CORS ėĪė ėė addExposedHeaderëĄ Authorization ę°ė ëģīėīëëĄ ėĪė íīėĪ.
    
```java
public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        ... ėëĩ
        configuration.addExposedHeader("Authorization");
        ... ėëĩ
        return source;
    }

```

</details>
