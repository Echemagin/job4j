package ru.job4j.oop;

public class Point {

    /**
     * Поле координаты x точки
     */
    private int x;

    /**
     * Поле координаты y точки
     */
    private int y;

    /**
     * Поле координаты z точки
     */
    private int z;

    /**
     * Конструктор принимающий координаты точки на плоскости
     * @param x - координата точки по оси абсцисс
     * @param y - координата точки по оси ординат
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Констуктор принимающий координаты точки в пространстве
     * @param x - координата точки по оси абсцисс
     * @param y - координата точки по оси ординат
     * @param z - координата точки по оси аппликат
     */
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Метод для рассчета расстояния между точками на плоскости
     * @param that - точка до которой меряется расстояние
     * @return - расстояние от одной точки до другой
     */
    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    /**
     * Метод для рассчета расстояния между точками в пространстве
     * @param that - точка до которой меряется расстояние
     * @return - расстояние от одной точки до другой
     */
    public double distance3d(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x ,2) + Math.pow(this.y - that.y ,2) + Math.pow(this.z - that.z ,2));
    }
}
