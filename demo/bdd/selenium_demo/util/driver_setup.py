from selenium import webdriver
from selenium.webdriver.chrome.service import Service

def setup_chrome_driver():
    ser = Service("Drivers/chromedriver.exe")
    op =  webdriver.ChromeOptions()
    driver = webdriver.Chrome(service=ser, options=op)
    driver.implicitly_wait(4)
    return driver