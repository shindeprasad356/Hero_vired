addressString = "19216801"

# Split the string into 4 parts of 3 digits each
parts = [addressString[i:i+3] for i in range(0, len(addressString), 3)]

# Convert each part to an integer
parts = [int(part) for part in parts]

# Check if each part is a valid IP address component
for part in parts:
    if part < 0 or part > 255:
        print("Invalid IP Address")
        break
else:
    # Join the parts with periods to create the IP address
    ipAddress = ".".join(str(part) for part in parts)
    print("IP Address =", ipAddress)