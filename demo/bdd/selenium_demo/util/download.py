import urllib3

def get_response(url):
    http = urllib3.PoolManager()

    r = http.request('GET', url)
    if r.status == 200:
        return r
    else:
        return None