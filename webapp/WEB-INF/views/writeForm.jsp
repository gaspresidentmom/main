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
    <h1>글 작성하기</h1>
    <br>
    <table border="1">
        <form action="write" method="post">
        <tr>
            <th>title </th>
            <td><input type="text" name="title"></td>
        </tr>    
        <tr>
            <th>content </th>
            <td><textarea  name="content" rows="20" cols="50"></textarea></td>
        </tr>
        <tr>
            <th>writer </th>
            <td><input type="text" name="writer"></td>
        </tr>
        <tr>
            <th>regdate</th>
            <td><input type="date" name="regdate"></td>
        </tr>
        <tr>
            <td><input type="submit" value="등록"></td>
        </tr>
        </form>
    </table>

</body>
</html>