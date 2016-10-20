<#-- @ftlvariable name="articleTitle" type="java.lang.String" -->
<#-- @ftlvariable name="articleContent" type="java.lang.String" -->
<#-- @ftlvariable name="articleTag" type="java.lang.String" -->
<#-- @ftlvariable name="articleDate" type="java.lang.String" -->
<#-- @ftlvariable name="articleAuthor" type="java.lang.String" -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <#--<link rel="icon" href="../../favicon.ico">-->
    <link href="https://fonts.googleapis.com/css?family=Noto+Sans:400,700" rel="stylesheet">

    <title>Blog</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="<@spring.url '/css/bootstrap.min.css' />" />

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">

    <!-- Custom styles for this template -->
    <link href="<@spring.url '/css/styles.css' />" rel="stylesheet">
</head>

<body>

<div class="container">
    <div class="row">
        <div class="blog-post">
            <h2 class="blog-post-title">${articleTitle}</h2>

            <div class="blog-post-meta">
                <span>By ${articleAuthor}</span>
                <i class="fa fa-tag" aria-hidden="true"></i> <span>${articleTag}</span> |
                <i class="fa fa-calendar" aria-hidden="true"></i><span> ${articleDate}</span>
            </div>

            <hr>
            ${articleContent}
        </div>
    </div><!-- /.row -->
</div><!-- /.container -->

</body>
</html>