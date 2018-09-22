from urllib import request
from bs4 import BeautifulSoup

download_url = "http://www.biqukan.com/1_1094/5403177.html"
head = {}
head['User-Agent'] = 'Mozilla/5.0 (Linux; Android 4.1.1; Nexus 7 Build/JRO03D) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166  Safari/535.19'

download_req = request.Request(url=download_url, headers=head)
download_response = request.urlopen(download_req)
download_html = download_response.read().decode('gbk', 'ignore')

soup = BeautifulSoup(download_html, 'lxml')
texts = soup.find_all(id='content', class_='showtxt')
soup_text = BeautifulSoup(str(texts), 'lxml')

#div中的文本将text中的'\xa0'替换
#通过beautifulsoup解析出div，然后通过text提起内容
#text是提取文本，string是提取标签的内容
#div标签下还有很多br标签。所以使用string是提取不出来的，需要使用text。
################ 疑问 打出来是<br/> 为什么用'\xa0'##########
print(soup_text.div.text.replace('\xa0',''))