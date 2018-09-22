from urllib import request

req = request.urlopen('http://fanyi.baidu.com/')
print('**********************************************')
print("geturl打印信息:", req.geturl())  #返回的为url字符串
print('**********************************************')
print('info打印信息:', req.info())  #返回的为meta元信息，服务器信息
print('**********************************************')
print("getcode", req.getcode())  #返回的为http的状态码 , 200表示请求成功
print('**********************************************')
