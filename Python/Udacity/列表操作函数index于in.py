#index
# <list>.index(value)
#不同于字符串的find 在于 找不到时 会返回error 而不是 -1

p = [1, 2, 3]

print(p.index(4))

#ValueError: 4 is not in list

#in
#<value> in <list>
#value 是否在 list 中 ，ture or false

print(6 in p)
#False
