'''
urlopen的data参数
我们可以使用data参数，向服务器发送数据。根据HTTP规范，GET用于信息获取，POST是向服务器提交数据的一种请求，再换句话说：

    从客户端向服务器提交数据使用POST；

    从服务器获得数据到客户端使用GET(GET也可以提交，暂不考虑)。

    如果没有设置urlopen()函数的data参数，HTTP请求采用GET方式，也就是我们从服务器获取信息，如果我们设置data参数，HTTP请求采用POST方式，也就是我们向服务器传递数据。

    data参数有自己的格式，它是一个基于application/x-www.form-urlencoded的格式，具体格式我们不用了解， 因为我们可以使用urllib.parse.urlencode()函数将字符串自动转换成上面所说的格式。
'''

from urllib import request
from urllib import parse
import json

Request_URL = "http://fanyi.youdao.com/translate?smartresult=dict&smartresult=rule"
Form_Data ={'i': 'Bob',
            'from': 'AUTO',
            'to': 'AUTO',
            'smartresult': 'dict',
            'client': 'fanyideskweb',
            'salt': '1534219535558',
            'sign': '9 bff0552c1a3f299636b11cf47f47b6b',
            'doctype': 'json',
            'version': '2.1',
            'keyfrom': 'fanyi.web',
            'action': 'FY_BY_CLICKBUTTION',
            'typoResult': 'false'}

data = parse.urlencode(Form_Data).encode('utf-8')

response = request.urlopen(Request_URL, data)

response = request.urlopen(Request_URL, data)

html = response.read().decode('utf-8')

translate_results = json.loads(html)

translate_results = translate_results['translateResult'][0][0]['tgt']

print ('翻译结果是:',translate_results)