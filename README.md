# E-commerce Application Backend

This is a Java-based backend application for an e-commerce platform. The application provides essential functionalities for user management, product handling, and order processing. Below is a detailed description of the implemented features and instructions for setting up and running the application.

## Features

### User Management
- **Registration**: Allows users to create an account by providing necessary details. 
- **Login**: Authenticates users with their credentials.
- **JWT Authorization**: Secures API endpoints using JSON Web Tokens (JWT) for authorization.
- **Role Management**: Assigns roles to users (e.g., `USER`, `ADMIN`), determining their access level within the application.
- **User Editing**: Allows admins to edit user details.
- **User Deletion**: Enables the removal of user accounts.

### Product Management
- **Product Creation**: Enables admins to create new products, specifying details like name, description, price, etc.
- **Image Upload**: Supports uploading product images in `BLOB` format.
- **Category Management**: Allows the creation of product categories to organize products effectively.
- **Product Editing**: Admins can update product details as necessary.
- **Automatic Stock Adjustment**: The application automatically decreases the stock quantity of products after an order is confirmed.
- **Comprehensive Product Search**: Users can search for products using various criteria, including:
  - By name
  - By brand
  - By category
  - By brand and name
  - By category and brand

### Shopping Cart and Orders
- **Add to Cart**: Users can add products to their shopping cart.
- **Automatic Cart Total Calculation**: The total cost of items in the cart is automatically calculated.
- **Order Confirmation**: Once users are ready, they can confirm their order, moving items from the cart to an order.
- **Order Status Management**: Tracks and updates the status of orders (e.g., `PENDING`, `SHIPPED`, `DELIVERED`).

### Exception Handling
- **Comprehensive Exception Handling**: The application handles various exceptions, ensuring robust and user-friendly error messages and responses.

### Technologies Used

- **Spring Boot**: Core framework for building the application.
- **Spring Security**: For handling authentication and authorization.
- **JWT**: For securing API endpoints.
- **JPA/Hibernate**: For database interactions.
- **MySQL**: Default database (configurable).
- **Maven**: For project management and dependency handling.
