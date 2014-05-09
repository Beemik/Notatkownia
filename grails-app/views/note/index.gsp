<!DOCTYPE html>
<html>
<head>
	<title>Notatkownia</title>
    <blueprint:resources/>
	<link href="${resource(dir: 'css', file: 'app.css')}" type="text/css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<h1 class="span-24 last">Notatkownia</h1>
		<div class="span-24 last">
			<div class="span-16">
				<h2>Notes</h2>
			</div>
			<div class="span-4">
				<ul class="actions"><li>New</li></ul>
			</div>
			<div class="span-4 last"></div>
		</div>
		<div class="span-20">
			<g:render template="noteCard" collection="${notes}" var="note"/>
		</div>
		<div class="span-4 last">
			<dl class="sidebar">                         
				<dt>Persons</dt>
				<dd>
					<ul>
						<g:each in="${persons}" var="person">
							<li>${person.name}</li>
						</g:each>
					</ul>
				</dd>
			</dl>
		</div>
	</div>
</body>
</html>