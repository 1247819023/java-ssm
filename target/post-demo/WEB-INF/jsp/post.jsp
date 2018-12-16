<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文章列表</title>
</head>
<body>

<form action="/" method="post">
    <input type="text" name="post_caption" placeholder="标题"/>
    <select name="author_id">
        <option value=""> 请选择</option>
        <c:forEach items="${pAuthors}" var="author">
        <option value="${author.author_id}">
            ${author.author_name}
        </option>
        </c:forEach>
    </select>
    <input type="text" name="post_content" placeholder="内容" />
    <input type="submit"/>
</form>

<ul>
    <c:forEach items="${pPostList}" var="post">
        <li>${post.post_id}, ${post.author_id}, ${post.post_caption}
            , ${post.post_content}, ${post.post_time}
            <a href="/del/${post.post_id}">删除</a></a> </li>
    </c:forEach>
</ul>

<div>
    <p>总共有 ${pageInfo.pages} 页，总共有 ${pageInfo.total}</p>
    <p>当前是第 ${pageInfo.pageNum} 页</p>
    <c:forEach begin="1" end="${pageInfo.pages}" var="p">
        <a href="/?page=${p}">第 ${p} 页 </a>
    </c:forEach>
</div>

</body>
</html>
