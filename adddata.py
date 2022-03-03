f = open("C:\python\새파일.txt",'a')
for i in range(11, 20):
     data = "%d번째 줄입니다.\n" % i
     f.write(data)
f.close()
f = open("C:\python\새파일.txt",'r')
data =f.read()
print(data)
f.close()