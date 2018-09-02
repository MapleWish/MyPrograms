from urllib import request

response = request.urlopen('http://fanyi.baidu.com/')
html = response.read()
html = html.decode("utf-8")
print (html)