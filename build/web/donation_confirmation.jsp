<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Thank You for Your Donation</title>
        <style>
            body {
                font-family: 'Helvetica Neue', Arial, sans-serif;
                background-color: #f9f9f9;
                margin: 0;
                padding: 0;
                text-align: center; /* Center content horizontally */
            }

            .container {
                max-width: 800px;
                margin: 40px auto; /* Center the container */
                padding: 20px;
                background-color: #ffffff;
                border: 1px solid #ddd;
                border-radius: 8px;
                box-shadow: 0 8px 16px rgba(0, 0, 0, 0.1); /* Add subtle shadow */
            }

            h1 {
                color: #4CAF50; /* Green color for a positive vibe */
            }

            p {
                color: #333; /* Dark gray for text */
                font-size: 1.1em; /* Slightly larger text */
            }

            .thank-you-image img {
                max-width: 100%; /* Ensure the image scales properly */
                border-radius: 8px;
                box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* Soft shadow for the image */
            }

            a {
                color: #4CAF50; /* Consistent color for links */
                text-decoration: none; /* No underline on links */
            }

            a:hover {
                text-decoration: underline; /* Underline on hover for better UX */
            }

        </style>
    </head>
    <body>
        <div class="container">
            <div class="thank-you-image">
                <img src="https://example.com/thank-you-image.jpg" alt="Thank You" />
            </div>

            <h1>Thank You, <%= request.getAttribute("name")%>!</h1>

            <p>
                Your generous donation of $<%= request.getAttribute("amount")%> will help us support
                underprivileged children with educational resources.
            </p>

            <p>
                We appreciate your support! If you'd like to stay updated with our work, follow us on
                social media or sign up for our newsletter.
            </p>

            <p>
                <a href="/Adv_Java_mini_project">Return to Home</a>
            </p>
        </div>
    </body>
</html>
