catalogue = [
 "Gone Girl",
 "Little Women",
 "Oliver Twist",
 "The Alchemist",
 "The Way Of Kings"
]

def show_catalogue():
    print('\n--- Library Catalogue (' + str(len(catalogue)) + ' books) ---')
    if len(catalogue) == 0:
        print('   (no books in catalogue)   ')
        return
    for i, book in enumerate(catalogue):
        print(" ", i + i, ".", book)

while True:
    print("\n====== Library Menu ======")
    print("1. View all library books")
    print("2. Search for a book")
    print("3. Add a book")
    print("4. Remove a book")
    print("5. View a book by posititon")
    print("6. Sort a catalogue")
    print("7. Catalogue statistics")
    print("8. Quit")

    choice = input("Enter choice (1-8): ").strip()
    if not choice.isdigit() or not (1 <= int(choice) <= 8):
        print("Invalid choice. Enter a number 1 to 8.")
        continue
    choice = int(choice)

    if choice == 1:
        show_catalogue()

    elif choice == 2:
        query = input("Enter title to search: ").strip().lower()
        found = [b for b in catalogue if query in b.lower()]
        if found:
            print("Found", len(found), "result(s):")
            for b in found: print(" -", b)
        else:
            print('No book matching "' + query + '" found.')

    elif choice == 3:
        new_book = input("Enter book title to remove: ").strip()
        if catalogue.count(new_book) > 0:
            print('"'+ new_book + '"is already in the catalogue.')
        else:
            catalogue.append(new_book)
            print("Added:", new_book)

    elif choice == 4:
        del_book = input("Enter title to remove: ").strip()
        if del_book in catalogue:
            pos = catalogue.index(del_book)
            print('Removed "' + del_book + '" (was at position', pos + 1, ')')
        else:
            print('"' + del_book + '" not found in caatalogue.')

    elif choice == 5:
        show_catalogue()
        pos_input = input("Enter position number: ").strip()
        if pos_input.isdigit():
            pos = int(pos_input) - 1
            if 0 <= pos < len(catalogue):
                print("Book at postion", int(pos_input))
            else:
                print("Postion out of range.")
        else:
            print("Please enter a valid nummber.")

    elif choice == 6:
        catalogue.sort()
        print("Catalogue sorted alphabetically.")
        show_catalogue()

    elif choice == 7:
        print("\n---Catalogue Statistics ---")
        print("Total books    :", len(catalogue))
        if len(catalogue) > 0:
            s = sorted(catalogue)
            print("First alphabetically:", s[0])
            print("Last alphabetically:", s[-1])
    
    elif choice == 8:
        print("Goodbye! Catalogue saved with", len(catalogue), "books,")
        break 