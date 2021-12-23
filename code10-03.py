from tkinter import *
window = Tk()

lable1 = Label(window, text ="COOKBOKK!!!!Python을")
lable2 = Label(window, text ="아프지마 강희야", font =("궁서체",30),
           fg = "blue")
label3 = Label(window, text="공부 중 입니다.", bg = "magenta",
               width =20, height = 5, anchor =SE)


lable1.pack()
lable2.pack()
label3.pack()
window.mainloop()