{{define "page"}}
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Login - Hypermind</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="The login page of Hypermind.">
    <meta name="author" content="hyper-carrot">

    {{template "header-import"}}
    {{template "js-import"}}
    <style>
      body {
        padding-top: 40px;
        padding-bottom: 40px;
        background-color: #f5f5f5;
      }

      .form-signin {
        max-width: 300px;
        padding: 19px 29px 29px;
        margin: 0 auto 20px;
        background-color: #fff;
        border: 1px solid #e5e5e5;
        -webkit-border-radius: 5px;
           -moz-border-radius: 5px;
                border-radius: 5px;
        -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);
           -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);
                box-shadow: 0 1px 2px rgba(0,0,0,.05);
      }
      .form-signin .form-signin-heading,
      .form-signin .checkbox {
        margin-bottom: 10px;
      }
      .form-signin input[type="text"],
      .form-signin input[type="password"] {
        font-size: 16px;
        height: auto;
        margin-bottom: 15px;
        padding: 7px 9px;
      }
    </style>
  </head>
<body>
    <div class="container">
      <form class="form-signin" action="http://{{.serverAddr}}:{{.serverPort}}/login" method="post">
        <h2 class="form-signin-heading">Please sign in</h2>
        {{if .hint}}
        <i class="icon-warning-sign"></i><span class>{{.hint}}</span>
        {{end}}
        <input type="text" name="loginName" class="input-block-level" placeholder="Login name">
        <input type="password" name="password" class="input-block-level" placeholder="Password">
        <input type="hidden" name="token" value="{{.token}}">
        <label class="checkbox">
          <input type="checkbox" name="remember-me" value="y"> Remember me
        </label>
        <button class="btn btn-primary" type="submit">Sign in</button>
        <a href="/" class="btn btn-warning">Give up</a>
      </form>

    </div>

  </body>
</html>
{{end}}
