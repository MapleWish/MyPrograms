# -*- coding: UTF-8 -*-
from urllib import request
from urllib import error

if __name__ == "__main__":
    #一个不存在的连接
    url = "http://www.iloveyou.com/"
    req = request.Request(url)
    try:
        response = request.urlopen(req)
        html = response.read().decode('utf-8')
        print(html)
    #URLError有reason
    #HTTPError有code
    except error.URLError as e:
        print(e.reason)

#结果:[Errno 11002] getaddrinfo failed