email = input("email : ")
host = '@naver.com'

done = email + host
fhand = open('email.txt','a')
fhand.write('\n' + done)

fhand.close()
