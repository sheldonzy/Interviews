def largest_prime_factor(number):
    div = 2
    while number > div:
        if number % div == 0 and number / div > 1:
            number /= div
            div = 2
        else:
            div += 1
    return number
