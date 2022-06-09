from util.driver_setup import setup_chrome_driver
from POM.google_images import GoogleImage
from util.download import get_response
from util.file_functions import save_image
from graphics.user_input_gui import Gui

def main():

    gui = Gui()
    search_term = gui.input
    driver = setup_chrome_driver()

    driver.get("https://images.google.com/")
    webpage = GoogleImage(driver)

    webpage.search(search_term)

    urls = webpage.get_img_url(4)
    counter = 0
    for url in urls:
        response = get_response(url)
        if response:
            counter += 1
            save_image(response, f"{search_term}_{counter}.jpg")

    driver.quit()

if __name__ == "__main__":
    main()