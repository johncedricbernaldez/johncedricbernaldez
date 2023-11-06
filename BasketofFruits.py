class Basket:
    def __init__(self):
        self.items = []

    def is_empty(self):
        return len(self.items) == 0

    def push(self, item):
        self.items.append(item)

    def pop(self):
        if not self.is_empty():
            return self.items.pop()
        else:
            return "Basket is empty."

    def peek(self):
        if not self.is_empty():
            return self.items[-1]
        else:
            return "Basket is empty."

    def size(self):
        return len(self.items)


basket = Basket()

num_fruits = int(input("Enter the number of fruits you would like to catch: "))

for _ in range(num_fruits):
    choice = input("Press A for apple, O for orange, M for mango, or G for guava: ").upper()
    if choice == 'A':
        basket.push("Apple")
    elif choice == 'O':
        basket.push("Orange")
    elif choice == 'M':
        basket.push("Mango")
    elif choice == 'G':
        basket.push("Guava")
    else:
        print("Invalid choice. Please try again.")
        continue

print("Fruits in the basket:", basket.items)

while not basket.is_empty():
    option = input("Enter E to start eating a fruit: ").upper()
    if option == 'E':
        eaten_fruit = basket.pop()
        print("Eating", eaten_fruit)
        if not basket.is_empty():
            print("Fruits remaining in the basket:", basket.items)
        else:
            print("No More Fruits")
    else:
        print("Invalid choice. Please try again.")