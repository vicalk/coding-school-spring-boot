<#import "/spring.ftl" as spring/>

<head>
  <title>Login</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>

<div class="container" style="margin-top:30px">
<div class="col-md-4">
    <div class="panel panel-default">
  <div class="panel-heading"><h3 class="panel-title"><strong>Sign In </strong></h3></div>
  <div class="panel-body">
   <form role="form">
  <div class="form-group">
    <label for="exampleInputEmail1">Email:</label>
    <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter email">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password:</label>
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>
  <button type="submit" class="btn btn-sm btn-default">Sign in</button>
</form>
  </div>
</div>
</div>
