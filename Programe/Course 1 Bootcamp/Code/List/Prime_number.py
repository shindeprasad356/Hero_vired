#  Select Prime numbers from List Elements using filter().

def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

listNums = [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]

prime_nums = list(filter(lambda x: is_prime(x), listNums))

print("List of numbers:", listNums)
print("List of prime numbers:", prime_nums)