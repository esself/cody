print("--- Shopping Cart list ---")
cart = ["Eggs", "Bread", "Cereal", "Soy sauce", "Ketchup"]
print("Your cart:", cart)
print("Frist item:", cart[0])
print("Last item:", cart[-1])
print("Items 1-3:", cart[1:4])
print("\n--- Current Cart ---")
for i, item in enumerate(cart) :
    print(i + 1, ",", item)

item_to_find = "Eggs"
if item_to_find in cart:
    print(item_to_find, "is in the cart")
else:
    print(item_to_find, "is not in the cart")
print("Is Oil in cart?", "Oil" not in cart)

new_item = input("\nAdd a new item: ")
cart.append(new_item) # to add something new to the cart
print("Updated cart: ", cart)

remove_item = input("Remove an item from cart: ")
if remove_item in cart:
    cart.remove(remove_item)
    print("Removed. Updated cart", cart)
else:
    print(remove_item, "was not removed form the cart")
del cart[0] # deletes the first item int the cart 
print("After del cart[0], cart:")
print("\n--- Summary ---")
print("Total items in cart:",len(cart))