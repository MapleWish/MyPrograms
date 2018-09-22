from urllib import request

response = request.urlopen('http://fanyi.baidu.com/')
html = response.read()
'''使用decode对网站进行解码'''
html = html.decode("utf-8")
print (html)