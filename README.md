# blog-zupper-api

#Exemplo de endpoint:

- List all blogs:

curl: localhost:8080/api/blogs
method: get

- Create blog

curl: localhost:8080/api/blog
method: post
Content-Type: application/json

Payload:

{
    "name": "Washington Wiltenburg",
    "nickname": "@cumpadi",
    "title": "Boxe na veia",
    "description": "Não sou do grupo é o tchan mas sou o cumpadi."
}
