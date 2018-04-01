/*CREATE DATABASE product_db;*/
INSERT INTO supplier
(ID, Name, TaxNumber, EmailAddress, WebAddress, DayPhone, MobilePhone)VALUES('1', 'Sunsational Beach Rentals', NULL, 'anita@sunsational.com', 'www.sunsational.com', '+17273671991', NULL);
INSERT INTO address_components
(ID, PostalCode, Country, Region, City, Street)
VALUES
('1', '33706', 'US', 'Florida', 'Treasure Island', '11360 Gulf Blvd.');
INSERT INTO product
(ID, SupplierID, Name, Currency, Latitude, Longitude, AddressComponentsID, Phone)
VALUES
('1', '1', 'South Beach Condo Hotel', 'USD', '27.7729684', '-82.7737742', '1', '727-367-1991');
INSERT INTO image
(ID, product_id, name, url)
VALUES
('1', '1', 'SB1.jpg', 'https://s3.amazonaws.com/mybookingpal/pictures/nopms/nopms/1234760135/A857B85D3765714351AF415A5710777F'),
('2', '1', 'Hammocks.jpg', 'https://s3.amazonaws.com/mybookingpal/pictures/nopms/nopms/1234760135/7378EF9A6E98DCA74B601A5ECB0A0635');
