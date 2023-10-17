<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>T-shirt Shop</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            border: 1px solid black;
            text-align: left;
            padding: 8px;
        }
    </style>
    <script>
        // JavaScript function to calculate total price
        function calculateTotal() {
            let prices = document.getElementsByName("price");
            let quantities = document.getElementsByName("quantity");
            let total = 0;

            for (let i = 0; i < prices.length; i++) {
                if (quantities[i].checked) {
                    total += parseFloat(prices[i].value) * parseInt(quantities[i].value);
                }
            }

            document.getElementById("totalPrice").innerHTML = "Total Price: $" + total.toFixed(2);
        }
    </script>
</head>
<body>
    <h1>T-shirt Shop</h1>
    <table>
        <tr>
            <th>Image</th>
            <th>Price</th>
            <th>Quantity</th>
        </tr>
        <tr>
            <td><img src="tshirt_image.jpg" alt="T-shirt" width="100" height="100"></td>
            <td>$10.00</td>
            <td><input type="checkbox" name="quantity" value="1" onclick="calculateTotal()"></td>
        </tr>
        <tr>
            <td><img src="tshirt_image.jpg" alt="T-shirt" width="100" height="100"></td>
            <td>$20.00</td>
            <td><input type="checkbox" name="quantity" value="2" onclick="calculateTotal()"></td>
        </tr>
        <tr>
            <td><img src="tshirt_image.jpg" alt="T-shirt" width="100" height="100"></td>
            <td>$30.00</td>
            <td><input type="checkbox" name="quantity" value="3" onclick="calculateTotal()"></td>
        </tr>
    </table>
    <div id="totalPrice">Total Price: $0.00</div>
</body>
</html>
