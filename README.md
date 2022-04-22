### Community




<details>
  <summary>
    <code>GET</code> 
    <code><b>/articles</b></code> 
    <code>(게시글 리스트 조회)</code>
  </summary>

##### Header

> | name   | Description      | Required |
> |--------|------------------|-----------|
> | `Authorization` |   사용자 인증 수단, 액세스 토큰 값     | O |
##### Responses

> | name   |  type      | Description      | Required |
> |--------|------------|----------------|---|
> | `elements` |  Integer[]  | 게시글 ID 목록     | O |

</details>


<details>
  <summary>
    <code>GET</code> 
    <code><b>/articles/{articleId}/comments</b></code> 
    <code>(댓글 리스트 조회)</code>
  </summary>

##### Header

> | name   | Description      | Required |
> |--------|------------------|-----------|
> | `Authorization` |   사용자 인증 수단, 액세스 토큰 값     | O |
##### Responses

> | name   |  type      | Description      | Required |
> |--------|------------|----------------|---|
> | `elements` |  Integer[]  | 댓글 ID 목록     | O |

</details>

<details>
  <summary>
    <code>GET</code> 
    <code><b>/articles/{articleId}/comments/{commentId}</b></code> 
    <code>(댓글 조회)</code>
  </summary>

##### Header

> | name   | Description      | Required |
> |--------|------------------|-----------|
> | `Authorization` |   사용자 인증 수단, 액세스 토큰 값     | O |
##### Responses

> | name   |  type      | Description      | Required |
> |--------|------------|----------------|---|
> | `content` |  String  | 댓글 내용     | O |
> | `blockYn` |  String  | 블록 유무    | O |

</details>


<details>
  <summary>
    <code>GET</code> 
    <code><b>/articles/{articleId}</b></code> 
    <code>(게시글 조회)</code>
  </summary>

##### Header

> | name   | Description      | Required |
> |--------|------------------|-----------|
> | `Authorization` |   사용자 인증 수단, 액세스 토큰 값     | O |
##### Responses

> | name   |  type      | Description      | Required |
> |--------|------------|----------------|---|
> | `title` |  String  | 게시글 제목     | O |
> | `content` |  String  | 게시글 내용     | O |
> | `blockYn` |  String  | 블록 유무    | O |

</details>

<br>

<details>
  <summary>
    <code>POST</code> 
    <code><b>/articles</b></code> 
    <code>(게시글 작성)</code>
  </summary>

##### Header

> | name   | Description      | Required |
> |--------|------------------|-----------|
> | `Authorization` |   사용자 인증 수단, 액세스 토큰 값     | O |
##### Parameters

> | name   |  type      | Description      | Required |
> |--------|------------|----------------|---|
> | `title` |  String  | 게시글 제목     | O |
> | `content` |  String  | 게시글 내용     | O |

##### Responses

> | name   |  type      | Description      | Required |
> |--------|------------|----------------|---|
> | `articleId` |  Integer  | 게시글 ID     | O |

</details>


<details>
  <summary>
    <code>POST</code> 
    <code><b>/articles/{articleId}</b></code> 
    <code>(댓글 작성)</code>
  </summary>

##### Header

> | name   | Description      | Required |
> |--------|------------------|-----------|
> | `Authorization` |   사용자 인증 수단, 액세스 토큰 값     | O |
##### Parameters

> | name   |  type      | Description      | Required |
> |--------|------------|----------------|---|
> | `content` |  String  | 댓글 내용     | O |

##### Responses

> | name   |  type      | Description      | Required |
> |--------|------------|----------------|---|
> | `commentId` |  Integer  | 게시글 ID     | O |

</details>


<br>


<details>
  <summary>
    <code>PATCH</code> 
    <code><b>/articles/{articleId}</b></code> 
    <code>(게시글 숨김 처리)</code>
  </summary>

##### Header

> | name   | Description      | Required |
> |--------|------------------|-----------|
> | `Authorization` |   사용자 인증 수단, 액세스 토큰 값     | O |
##### Parameters

> | name   |  type      | Description      | Required |
> |--------|------------|----------------|---|
> | `comment` |  String  | 블록 사유     |  |

##### Responses

> | name   |  type      | Description      | Required |
> |--------|------------|----------------|---|
> | `articleId` |  Integer  | 게시글 ID     | O |

</details>


<details>
  <summary>
    <code>PATCH</code> 
    <code><b>/articles/{articleId}/{commentId}</b></code> 
    <code>(댓글 숨김 처리)</code>
  </summary>

##### Header

> | name   | Description      | Required |
> |--------|------------------|-----------|
> | `Authorization` |   사용자 인증 수단, 액세스 토큰 값     | O |
##### Parameters

> | name   |  type      | Description      | Required |
> |--------|------------|----------------|---|
> | `comment` |  String  | 블록 사유     |  |

##### Responses

> | name   |  type      | Description      | Required |
> |--------|------------|----------------|---|
> | `commentId` |  Integer  | 게시글 ID     | O |

</details>
