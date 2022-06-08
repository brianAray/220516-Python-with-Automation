def save_image(response, image_name):
    with open(image_name, "wb") as f:
        f.write(response.data)

    print("Images were downloaded!")
