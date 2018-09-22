import urllib.request
import urllib.parse
import json

while (1):
    words = input('请输入您需要翻译的内容:')
    url = 'http://fanyi.youdao.com/translate?smartresult=dict&smartresult=rule'
    '''
    更高级版本（但反爬虫）
    url = 'http://fanyi.youdao.com/translate_o?smartresult=dict&smartresult=rule'
    破解链接
    https://blog.csdn.net/nunchakushuang/article/details/75294947
    '''
    data={}
    data['i'] = words
    data['from'] = 'AUTO'
    data['to'] = 'AUTO'
    data['smartresult'] = 'dict'
    data['client'] = 'fanyideskweb'
    data['doctype'] = 'json'
    data['version'] = '2.1'
    data['keyfrom'] = 'fanyi.web'
    data['action'] = 'FY_BY_CLICKBUTTION'
    data['typoResult'] = 'true'


    data = urllib.parse.urlencode(data).encode('utf-8')

    response = urllib.request.urlopen(url, data)

    html = response.read().decode('utf-8')

    translate_results = json.loads(html)
    #找到翻译结果，load函数能将str转换成dict类型
    translate_results = translate_results['translateResult'][0][0]['tgt']
    #打印翻译信息
    print("翻译的结果是：%s" % translate_results)
