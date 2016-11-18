<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Add New Comment</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <span>${error}</span>
        <form method="POST" action="CreatePost">
            New Comment: <textarea  name="comment" ></textarea><br />

            <br />
            <input type="submit" value="Submit" />
        </form>
        <a href="ShowList">View Posts</a>
    </body>
</html>