

from tkinter import *
from tkinter import messagebox


def keyEvent(event) :
    messagebox.showinfo("키보드 이벤트", "눌린 키" +
                        chr(event.keycode))

#메인코드 부분
window = Tk()

window.bind("<Key>", keyEvent)

window.mainloop()