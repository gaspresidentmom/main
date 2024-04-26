<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Detail List Page</h1>
    <br>
    <a href="writeForm">글 작성하기</a>
    <table border="1">
        <tr>
            <th>bno</th><td>${list.bno}</td>
        </tr>
        <tr>
            <th>title </th><td>${list.title}</td>
        </tr>
        <tr>
            <th>content </th><td>${list.content}</td>
        </tr>
        <tr>
            <th>writer </th><td>${list.writer}</td>
        </tr>
        <tr>    
            <th>regdate</th><td>${list.regdate}</td>
        </tr>
        <tr>
            <td rowspan="2"><a href="delete?bno=${list.bno}">삭제하기</a></td>
        </tr>
    </table>
</body>
</html>