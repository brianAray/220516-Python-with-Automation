from selenium.webdriver.chrome.webdriver import WebDriver
from selenium.webdriver.common.by import By

class RegistrationPage():

    def __init__(self, driver: WebDriver):
        self.driver = driver

    def registration_button(self):
        return self.driver.find_element(By.ID, "registration_button")

    def username_input(self):
        return self.driver.find_element(By.ID, "username")

    def password_input(self):
        return self.driver.find_element(By.ID, "password")

    def first_name_input(self):
        return self.driver.find_element(By.ID, "first_name")

    def last_name_input(self):
        return self.driver.find_element(By.ID, "last_name")
    
    def submit_button(self):
        return self.driver.find_element(By.ID, "submit_button")