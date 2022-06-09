import tkinter as tk

class Gui():
    def __init__(self):
        self.window = tk.Tk()
        self.input = None
        greeting = tk.Label(text="Search for something:")
        greeting.pack()

        global user_input
        user_input = tk.Entry(self.window)

        submit_button = tk.Button(
            text="Submit",
            command=self.get_entry_fields
        )

        user_input.pack()
        submit_button.pack()
        tk.mainloop()

    
    def get_entry_fields(self):
        self.input = user_input.get()
        self.window.quit()