from selenium.webdriver.chrome.webdriver import WebDriver
from selenium.webdriver.common.by import By

class Loginpage():

    def __init__(self, driver: WebDriver):
        self.driver = driver

    def registration_button(self):
        return self.driver.find_element(By.ID, "registration_button")
