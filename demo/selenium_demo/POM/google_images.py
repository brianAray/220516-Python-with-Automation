from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys

class GoogleImage():
    def __init__(self, driver):
        self.driver = driver
        self.search_input = self.driver.find_element(By.NAME, "q")

    def search(self, input):
        self.search_input.send_keys(input)
        self.search_input.send_keys(Keys.ENTER)
    
    def get_img_url(self, max):
        image_elements = self.driver.find_elements(By.CLASS_NAME, "rg_i")
        image_urls = []
        counter = 0
        for img in image_elements:
            img.click()
            actual_image = self.driver.find_elements(By.CLASS_NAME, 'n3VNCb')
            url = actual_image[0].get_attribute("src")

            if url.startswith("https"):
                counter += 1
                image_urls.append(url)
            if counter >= max:
                return image_urls
