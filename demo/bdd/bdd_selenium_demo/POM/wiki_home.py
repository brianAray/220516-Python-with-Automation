from selenium.webdriver.chrome.webdriver import WebDriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select

class WikiHome:
    
    def __init__(self, driver: WebDriver):
        """This class is injected with a driver on intialization"""
        self.driver = driver

    def english(self):
        element = self.driver.find_element(By.ID, "js-link-box-en")
        return element

    def french(self):
        element = self.driver.find_element(By.XPATH, '//*[@id="js-link-box-fr"]')
        return element

    def search_bar(self):
        return self.driver.find_element(By.ID, "searchInput")

    def language_selector(self):
        return Select(self.driver.find_element(By.ID, "searchLanguage"))

    def search_button(self):
        return self.driver.find_element(By.XPATH, '//*[@id="search-form"]/fieldset/button')