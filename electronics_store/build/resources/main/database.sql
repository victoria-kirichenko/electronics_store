CREATE TABLE products (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    stock_quantity INT NOT NULL,
    category_id INT NOT NULL,
    image_path VARCHAR(255) NOT NULL,
    manufacturer VARCHAR(255) NOT NULL
);

INSERT INTO Products (name, description, price, stock_quantity, category_id, image_path, manufacturer)
VALUES
    ('Ноутбук Maibenben X556 черный', 'Full HD (1920x1080), IPS, AMD Ryzen 5 5600H, ядра: 6 х 3.3 ГГц, RAM 16 ГБ, SSD 512 ГБ, GeForce RTX 3050 для ноутбуков 4 ГБ, Linux', 73999.0, 20, 2, '/images_pois/1.jpg', 'Maibenben'),
    ('Ноутбук Apple MacBook Air серый', '2560x1600, IPS, Apple M1, ядра: 4 + 4 х 3.2 ГГц, RAM 8 ГБ, SSD 256 ГБ, Apple M1 7-core , macOS', 95699.0, 15, 2, '/images_pois/2.jpg', 'Apple'),
    ('Ноутбук Apple MacBook Air серебристый', '2880x1864, IPS, Apple M2, ядра: 4 + 4 х 2.4 ГГц, RAM 8 ГБ, SSD 256 ГБ, Apple M2 10-core , macOS', 154599.0, 25, 2, '/images_pois/3.png', 'Apple'),
    ('Ноутбук ASUS ZenBook 14X OLED UX3404VA-M9015W серый', '2880x1800, OLED, Intel Core i7 13700H, ядра: 6 + 8 х 2.4 ГГц, RAM 16 ГБ, SSD 1024 ГБ, Intel Iris Xe Graphics , Windows 11 Home', 148999.0, 18, 2, '/images_pois/4.jpg', 'ASUS'),
    ('Ноутбук HUAWEI MateBook D 14 MDF-X серый', 'Full HD (1920x1080), IPS, Intel Core i3-1215U, ядра: 2 + 4 х 1.2 ГГц, RAM 8 ГБ, SSD 256 ГБ, Intel UHD Graphics , Windows 11 Home Single Language', 49999.0, 30, 2, '/images_pois/5.jpg', 'HUAWEI'),
    ('Ноутбук HUAWEI MateBook X Pro MRGF-X белый', '3120x2080, LTPS, Intel Core i7-1260P, ядра: 4 + 8 х 2.1 ГГц, RAM 16 ГБ, SSD 1000 ГБ, Intel Iris Xe Graphics , Windows 11 Home Single Language', 149999.0, 22, 2, '/images_pois/6.jpg', 'HUAWEI'),
    ('Смартфон HUAWEI nova Y61 64 ГБ зеленый', 'Характеристики: ядер - 8x(2 ГГц), 6 ГБ, 2 SIM, IPS, 1600x720, камера 50+2+2 Мп, NFC, 4G, GPS, 5000 мА*ч, Описание: Смартфон HUAWEI nova Y61 64 ГБ оснащен экраном 6.52" на основе технологии IPS...', 11999.0, 50, 1, '/images_pois/7.jpg', 'HUAWEI'),
    ('Смартфон HUAWEI nova 9 SE 128 ГБ голубой', 'Характеристики: ядер - 8x(2.4 ГГц), 8 ГБ, 2 SIM, IPS, 2388x1080, камера 108+8+2+2 Мп, NFC, 4G, GPS, 4000 мА*ч, Описание: Смартфон HUAWEI nova 9 SE 128 ГБ одновременно сочетает в себе стильный...', 17999.0, 50, 1, '/images_pois/8.jpg', 'HUAWEI'),
    ('Смартфон Apple iPhone 14 128 ГБ фиолетовый', 'Характеристики: ядер - 6x(3.23 ГГц), 6 ГБ, 1 SIM, OLED, 2532x1170, камера 12+12 Мп, NFC, 5G, GPS, Описание: Apple iPhone 14 базируются на однокристальной системе A15 Bionic...', 89099.00, 50, 1, '/images_pois/9.jpg', 'Apple'),
    ('Смартфон Samsung Galaxy S23 Ultra 256 ГБ розовый', 'Характеристики: ядер - 8x(3.2 ГГц), 8 ГБ, 2 SIM, Dynamic AMOLED 2X, 3088x1440, камера 200+12+10+10 Мп, NFC, 5G, GPS, 5000 мА*ч, Описание: Смартфон Samsung Galaxy S23 Ultra розового цвета имеет высокопрочный...', 104999.00, 50, 1, '/images_pois/10.jpg', 'Samsung'),
    ('Смартфон Samsung Galaxy Z Flip5 512 ГБ зеленый', 'Характеристики: ядер - 8x(3.36 ГГц), 8 ГБ, 1 SIM, Dynamic AMOLED 2X, 2640x1080, камера 12+12 Мп, NFC, 5G, GPS, 3700 мА*ч, Описание: Смартфон Samsung Galaxy Z Flip5 512 ГБ выполнен в зеленом раскладном корпусе с...', 107199.00, 50, 1, '/images_pois/11.jpg', 'Samsung'),
    ('Смартфон Apple iPhone 15 Pro Max 1024 ГБ синий', 'Характеристики: ядер - 6x(3.78 ГГц), 8 ГБ, 2 SIM, OLED, 2796x1290, камера 48+12+12 Мп, NFC, 5G, GPS, 4441 мА*ч, Описание: Аппаратной основой Apple iPhone 15 Pro Max стал 3-нанометровый чипсет A17 Pro...', 250799.00, 50, 1, '/images_pois/12.jpg', 'Apple'),
    ('Проводная гарнитура Black Shark Goblin X1 черный', 'Характеристики: 2.0, поддержка Nintendo Switch, PS4, PS5, Xbox one, охватывающие, 20 Гц - 20000 Гц, 32Ω, проводной, кабель - 2.2 м, Описание: Проводная гарнитура Black Shark Goblin X1 предназначена для совместного использования с игровыми консолями разных производителей...', 1999.00, 50, 3, '/images_pois/13.jpg', 'Black Shark Goblin'),
    ('Наушники Apple AirPods Pro (2nd gen) MagSafe Case USB-C (MTJV3)', 'Характеристики: , Описание: Наушники Apple AirPods Pro (MTJV3) — модель типа вкладыши в корпус из пластика, амбушюры сделаны из силикона. Благодаря стандарту IPX4 модель не боится попадания воды. Девайс поддерживает опцию беспроводного соединения с источником звука за счет наличия встроенного Bluetooth-адаптера версии 5.3...', 29999.00, 50, 3, '/images_pois/14.png', 'Apple'),
    ('Наушники полноразмерные Bluetooth Sony WH-1000XM4 Black', 'Характеристики: , Описание: Накладные наушники Bluetooth Sony WH-1000XM4 Black оборудованы активным шумоподавлением для комфортного прослушивания музыки без посторонних звуков. Выполнены из металла и пластика. Амбушюры и внутренняя часть оголовья обтянуты экокожей...', 35999.00, 50, 3, '/images_pois/15.png', 'Sony'),
    ('Наушники полноразмерные Bluetooth Apple AirPods Max Silver (MGYJ3)', 'Характеристики: , Описание: AirPods Max полностью меняют представление о полноразмерных наушниках. Драйвер, разработанный Apple, способен воспроизводить звук высокой чёткости. Каждая деталь, от оголовья до амбушюров, разработана для полного комфорта. Передовая функция активного шумоподавления блокирует внешние шумы, а «Прозрачный режим» позволяет слышать окружающий мир...', 74999.00, 50, 3, '/images_pois/16.png', 'Apple'),
    ('Наушники-вкладыши Philips TAE1105 белые', 'Характеристики: , Описание: Наушники-вкладыши Philips TAE1105 работают в частотном диапазоне от 1 до 20 кГц. Модель закрытого типа обладает динамиками диаметром 8,6 мм. Показатель чувствительности составляет 102 дБ. Устройство со встроенным микрофоном может использоваться в качестве гарнитуры во время звонков или онлайн-совещаний...', 1190.00, 50, 3, '/images_pois/17.png', 'Philips');

CREATE TABLE admins (
    id SERIAL PRIMARY KEY,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);

INSERT INTO admins (email, password) VALUES
    ('admin1@example.com', '123'),
    ('admin2@example.com', '456'),
    ('admin3@example.com', '789');

CREATE TABLE orders (
    id SERIAL PRIMARY KEY,
    mobile_phone VARCHAR(255) NOT NULL,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    product_id INTEGER NOT NULL,
	quantity INTEGER NOT NULL,
    FOREIGN KEY (product_id) REFERENCES products(id)
);


