from selenium import webdriver
from selenium.webdriver.common.keys import Keys

driver = webdriver.Chrome()
# driver.get 方法会打开请求的URL
driver.get("http://www.python.org")
assert "Python" in driver.title
elem = driver.find_element_by_name("q")
    #或者
         ### from selenium.webdriver.common.by import By
         ### elem = driver.find_element(By.NAME, "q")
# WebDriver 提供了许多寻找网页元素的方法，
# 譬如 find_element_by_* 的方法。例如一个输入框可以通过 find_element_by_name 方法寻找 tag 中的的 name 属性来确定。
elem.send_keys("pycon")
elem.send_keys(Keys.RETURN)
# WebDriver 会等待页面完全加载完成之后才会返回
print(driver.page_source)
'''
element = driver.find_element_by_name("passwd") #指的是tag中的name属性
element = driver.find_elements_by_tag_name("input")  #指的是名为name的tag
'''

