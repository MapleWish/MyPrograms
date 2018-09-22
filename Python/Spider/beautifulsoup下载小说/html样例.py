from bs4 import BeautifulSoup

html = """
<html>
<head>
<title>Jack_Cui</title>
</head>
<body>
<p class="title" name="blog"><b>My Blog</b></p>
<li><!--注释--></li>
<a href="http://blog.csdn.net/c406495762/article/details/58716886" class="sister" id="link1">Python3网络爬虫(一)：利用urllib进行简单的网页抓取</a><br/>
<a href="http://blog.csdn.net/c406495762/article/details/59095864" class="sister" id="link2">Python3网络爬虫(二)：利用urllib.urlopen发送数据</a><br/>
<a href="http://blog.csdn.net/c406495762/article/details/59488464" class="sister" id="link3">Python3网络爬虫(三)：urllib.error异常</a><br/>
</body>
</html>
"""
print(html)
#创建使用lxml解析器创建一个Beautiful Soup对象
soup = BeautifulSoup(html, 'lxml')

#Tag包括内容

#将a标签表示出来
print(soup.a)
#<a class="sister" href="http://blog.csdn.net/c406495762/article/details/58716886" id="link1">Python3网络爬虫(一)：利用urllib进行简单的网页抓取</a>
#将a标签所有属性以字典表示
print(soup.a.attrs)
#{'href': 'http://blog.csdn.net/c406495762/article/details/58716886', 'class': ['sister'], 'id': 'link1'}
#打印标签a中属性
print(soup.a["class"])
#['sister']

#NavigableString

#获取标签的内部文字
print(soup.a.string)
#Python3网络爬虫(一)：利用urllib进行简单的网页抓取

#contests

#将标签以列表的形式打印出来(包括换行)
print(soup.body.contents)
#['\n', <p class="title" name="blog"><b>My Blog</b></p>, '\n', <li><!--注释--></li>, '\n', <a class="sister" href="http://blog.csdn.net/c406495762/article/details/58716886" id="link1">Python3网络爬虫(一)：利用urllib进行简单的网页抓取</a>, <br/>, '\n', <a class="sister" href="http://blog.csdn.net/c406495762/article/details/59095864" id="link2">Python3网络爬虫(二)：利用urllib.urlopen发送数据</a>, <br/>, '\n', <a class="sister" href="http://blog.csdn.net/c406495762/article/details/59488464" id="link3">Python3网络爬虫(三)：urllib.error异常</a>, <br/>, '\n']
print(soup.body.contents[1])
#<p class="title" name="blog"><b>My Blog</b></p>

#children
#它是list生成器对象
print(soup.body.children)
print(type(soup.body.children))
#通过遍历获取所有子节点
for child in soup.body.children:
     print(child)
'''
<p class="title" name="blog"><b>My Blog</b></p>


<li><!--注释--></li>


<a class="sister" href="http://blog.csdn.net/c406495762/article/details/58716886" id="link1">Python3网络爬虫(一)：利用urllib进行简单的网页抓取</a>
<br/>


<a class="sister" href="http://blog.csdn.net/c406495762/article/details/59095864" id="link2">Python3网络爬虫(二)：利用urllib.urlopen发送数据</a>
<br/>


<a class="sister" href="http://blog.csdn.net/c406495762/article/details/59488464" id="link3">Python3网络爬虫(三)：urllib.error异常</a>
<br/>
'''

#搜索文档树
    #find_all(name, attrs, recursive, text, limit, **kwargs)：
    #find_all() 方法搜索当前tag的所有tag子节点,并判断是否符合过滤器的条件。

    #表示包含所有标签'a'(name)的列表
print(soup.find_all('a'))
#[<a class="sister" href="http://blog.csdn.net/c406495762/article/details/58716886" id="link1">Python3网络爬虫(一)：利用urllib进行简单的网页抓取</a>, <a class="sister" href="http://blog.csdn.net/c406495762/article/details/59095864" id="link2">Python3网络爬虫(二)：利用urllib.urlopen发送数据</a>, <a class="sister" href="http://blog.csdn.net/c406495762/article/details/59488464" id="link3">Python3网络爬虫(三)：urllib.error异常</a>]

    #支持正则表达式
import re
for tag in soup.find_all(re.compile("^b")):
     print(tag)
#</body>
#<b>My Blog</b>
#<br/>
#<br/>
#<br/>

    #支持列表
print(soup.find_all(['title','b']))
#[<title>Jack_Cui</title>, <b>My Blog</b>]

    #传递True
for tag in soup.find_all(True):
     print(tag.name)

     #attrs 参数
     #定义一个字典参数来搜索包含特殊属性的tag
print(soup.find_all(attrs={"class": "title"}))
     #attrs为一个字典，所以这里也需要用字典作为匹配

     #recursive参数

     #调用tag的 find_all() 方法时,Beautiful Soup会检索当前tag的所有子孙节点,如果只想搜索tag的直接子节点,
     #可以使用参数 recursive=False。

     #text参数
     
     #通过 text 参数可以搜搜文档中的字符串内容，与 name 参数的可选值一样, text 参数接受字符串 , 正则表达式 , 列表, True。
print(soup.find_all(text="Python3网络爬虫(三)：urllib.error异常"))
     #['Python3网络爬虫(三)：urllib.error异常']

     # limit参数

     # find_all() 方法返回全部的搜索结构,如果文档树很大那么搜索会很慢.
     # 如果我们不需要全部结果,可以使用 limit 参数限制返回结果的数量.
     # 效果与SQL中的limit关键字类似,当搜索到的结果数量达到 limit 的限制时,就停止搜索返回结果。
print(soup.find_all("a", limit=2))
     #[<a class="sister" href="http://blog.csdn.net/c406495762/article/details/58716886" id="link1">Python3网络爬虫(一)：利用urllib进行简单的网页抓取</a>, <a class="sister" href="http://blog.csdn.net/c406495762/article/details/59095864" id="link2">Python3网络爬虫(二)：利用urllib.urlopen发送数据</a>]

     # kwargs参数
     #查找所有的拥有相同元素的tag

     # 如果传入 class 参数,Beautiful Soup 会搜索每个 class 属性为 title 的 tag 。kwargs 接收字符串，正则表达式
print(soup.find_all(class_="title"))
     # [<p class="title" name="blog"><b>My Blog</b></p>]

     #name为标签的一个属性
     #在find_all内 name表示的是 tag 名称