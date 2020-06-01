DROP TABLE IF EXISTS equipment_details;

CREATE TABLE equipment_details (
	equipment_id INT AUTO_INCREMENT PRIMARY KEY,
	customer_id INT,
	name VARCHAR(30) NOT NULL,
	type VARCHAR(30) NOT NULL,
	mac_address VARCHAR(30) NOT NULL,
	active CHAR NOT NULL
);
	
INSERT INTO equipment_details (customer_id, name, type, mac_address, active) VALUES
	(1, 'Galaxy S20', 'Mobile', '00:FF', 'Y'),
	(2, 'iPhone 11', 'Mobile', '00:AA', 'Y'),
	(2, 'iPad Mini', 'Tablet', '00:AA', 'N'),
	(3, 'Motorella Razr', 'Mobile', '00:CC', 'Y'),
	(4, 'Pixel 4', 'Mobile', '00:BB', 'N'),
	(4, 'Nest', 'Router', '00:BB', 'Y');
	
	