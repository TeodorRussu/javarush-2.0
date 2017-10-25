package com.javarush.task.task25.task2503;

import java.util.LinkedList;
import java.util.List;

<<<<<<< HEAD
public enum Column implements Columnable {
=======
public enum Column implements Columnable{
>>>>>>> 7defc761c64c11807484c27048e1438b8af48d88
    Customer("Customer"),
    BankName("Bank Name"),
    AccountNumber("Account Number"),
    Amount("Available Amount");

    private String columnName;

<<<<<<< HEAD
    @Override
    public String getColumnName() {
        return this.columnName;
    }
    @Override
    public boolean isShown() {
        if (realOrder[this.ordinal()] == -1 ) {
            return false;
        } else { return true; }
    }

    @Override
    public void hide() {
        int startNumberToChange = realOrder[this.ordinal()];
        realOrder[this.ordinal()] = -1;
        for (int i = 0; i < realOrder.length; i++) {
            if ( realOrder[i] > startNumberToChange) {
                realOrder[i]--;
            }
        }
    }


=======
>>>>>>> 7defc761c64c11807484c27048e1438b8af48d88
    private static int[] realOrder;

    private Column(String columnName) {
        this.columnName = columnName;
    }

    /**
     * Задает новый порядок отображения колонок, который хранится в массиве realOrder.
     * realOrder[индекс в энуме] = порядок отображения; -1, если колонка не отображается.
     *
     * @param newOrder новая последовательность колонок, в которой они будут отображаться в таблице
     * @throws IllegalArgumentException при дубликате колонки
     */
    public static void configureColumns(Column... newOrder) {
        realOrder = new int[values().length];
        for (Column column : values()) {
            realOrder[column.ordinal()] = -1;
            boolean isFound = false;

            for (int i = 0; i < newOrder.length; i++) {
                if (column == newOrder[i]) {
                    if (isFound) {
                        throw new IllegalArgumentException("Column '" + column.columnName + "' is already configured.");
                    }
                    realOrder[column.ordinal()] = i;
                    isFound = true;
                }
            }
        }
    }

    /**
     * Вычисляет и возвращает список отображаемых колонок в сконфигурированом порядке (см. метод configureColumns)
     * Используется поле realOrder.
     *
     * @return список колонок
     */
    public static List<Column> getVisibleColumns() {
        List<Column> result = new LinkedList<>();
<<<<<<< HEAD
        Column[] list = Column.values();
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++){
                if (realOrder[j] == i) {
                    result.add(list[j]);
                    break;
                }
            }
        }

        return result;
    }
}
=======

        return result;
    }

    @Override
    public String getColumnName() {
        return null;
    }

    @Override
    public boolean isShown() {
        if ()
        return false;
    }

    @Override
    public void hide() {

    }
}
>>>>>>> 7defc761c64c11807484c27048e1438b8af48d88
