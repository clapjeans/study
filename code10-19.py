from tkinter import *
from tkinter.simpledialog import *

window = Tk()
window.geometry("400x400")


label1 = Label(window,text="입력된값")
label1.pack()


value = askinteger("확대배수","주사위(1~6)을 입력하세요",
                   minvalue =1 , maxvalue=6)

label1.configure(text= str(value))
window.mainloop()