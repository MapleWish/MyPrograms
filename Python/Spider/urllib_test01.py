from urllib import request

response = request.urlopen('http://fanyi.baidu.com')
html = response.read()
print (html)