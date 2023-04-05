<!DOCTYPE html>
<html>
<head>
	<title>Змейка</title>
	<style>
		canvas {
			border: 1px solid #000;
		}
	</style>
</head>
<body>
	<canvas id="canvas" width="400" height="400"></canvas>
	<script src="snake.js"></script>
</body>
</html>

// Получаем элементы canvas и контекст для рисования
const canvas = document.getElementById("canvas");
const ctx = canvas.getContext("2d");

// Задаем размер клетки змейки и количество клеток на поле
const gridSize = 10;
const gridCount = canvas.width / gridSize;

// Задаем начальную позицию змейки
let snakeX = 0;
let snakeY = 0;

// Задаем начальное направление движения змейки
let direction = "right";

// Задаем начальную длину змейки
let snakeLength = 1;

// Генерируем случайную позицию для еды змейки
let foodX = Math.floor(Math.random() * gridCount) * gridSize;
let foodY = Math.floor(Math.random() * gridCount) * gridSize;

// Функция рисования змейки
function drawSnake() {
	ctx.fillStyle = "#000";
	ctx.fillRect(snakeX, snakeY, gridSize, gridSize);
}

// Функция обработки движения змейки
function moveSnake() {
	// Изменяем позицию змейки в зависимости от направления
	if (direction === "right") {
		snakeX += gridSize;
	} else if (direction === "left") {
		snakeX -= gridSize;
	} else if (direction === "up") {
		snakeY -= gridSize;
	} else if (direction === "down") {
		snakeY += gridSize;
	}

	// Проверяем, не вышла ли змейка за пределы поля
	if (snakeX < 0 || snakeX >= canvas.width || snakeY < 0 || snakeY >= canvas.height) {
		alert("Game over!");
		location.reload();
	}

	// Проверяем, не пересекла ли змейка свое тело
	for (let i = 1; i < snakeLength; i++) {
		if (snakeX === snake[i].x && snakeY === snake[i].y) {
			alert("Game over!");
			location.reload();
		}
	}

	// Добавляем новую голову змейки в начало массива
	snake.unshift({ x: snakeX, y: snakeY });

	// Удаляем хвост змейки, если ее длина превысила заданную
	if (snake.length > snakeLength) {
		snake.pop();
	}

	// Проверяем, не съела ли змейка еду
	if (snakeX === foodX && snakeY === foodY) {
		snakeLength++;
		foodX = Math.floor(Math.random() * gridCount) * gridSize;
		foodY = Math.floor(Math.random() * gridCount) * gridSize;
	}

	// Рисуем



import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(getResult(25, 15));  // "Можно идти гулять"
        System.out.println(getResult(18, 5));   // "Можно идти гулять"
        System.out.println(getResult(50, 20));  // "Можно идти гулять"
        System.out.println(getResult(30, 35));  // "Оставайтесь дома"
        System.out.println(getResult(60, -15)); // "Оставайтесь дома"
    }

    public static String getResult(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }


    public class main {
        public static void main(String[] args) {
            test(23, 10);
            test(generateRandomAge(), 10);
        }

        public static void test(int age, int temperature) {
            System.out.println("Возраст: " + age + ", температура: " + temperature);
            System.out.println(getResult(age, temperature));
            System.out.println();
        }

        public static String getResult(int age, int temperature) {
            if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
                return "Можно идти гулять";
            } else if (age < 20 && temperature >= 0 && temperature <= 28) {
                return "Можно идти гулять";
            } else if (age > 45 && temperature >= -10 && temperature <= 25) {
                return "Можно идти гулять";
            } else {
                return "Оставайтесь дома";
            }
        }

        public static int generateRandomAge() {
            Random random = new Random();
            return random.nextInt(100);
        }
    }


}

