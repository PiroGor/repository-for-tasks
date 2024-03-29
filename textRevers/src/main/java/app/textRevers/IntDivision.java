package app.textRevers;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anastasiia Nudha
 * @version 0.1.0
 * @since 0.0.1
 */
public class IntDivision {

    /**
     * Method name: makeDivision
     *
     * @param dividend The number to be divided.
     * @param divisor  The number by which to divide.
     * @return (String) Step by step result of division into a column.
     *
     *                                  Inside the function: 1. Checking the
     *                                  numbers, to fit all conditions of dividing.
     *                                  2. Find the module of both numbers and split
     *                                  the dividend on atomic numbers. 3. Place
     *                                  digit to memory and look is it possible to
     *                                  subtract it on divisor, if it not take one
     *                                  more digit in memory until we can subtract.
     *                                  4. When find a digit to subtract start
     *                                  calculation and add writing them to
     *                                  calculation String. 5. Repeat this steps
     *                                  until we get one digit in memory that can`t
     *                                  be subtracted or we receive 0.
     */
    public static String divide(int dividend, int divisor) {

        String[] digits;
        StringBuilder lastReminder = new StringBuilder();
        StringBuilder multiply = new StringBuilder();
        Integer reminderNumber;
        Integer multiplyResult;
        Integer subtractionResult;
        StringBuilder calculations = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        StringBuilder reminder = new StringBuilder();
        ComponentsForDividing components = new ComponentsForDividing(dividend,divisor);

        if (divisor == 0) {
            return "Divisor cannot be 0, division by zero";
        }


        if ((dividend < 0) ^ (divisor < 0)) {
            answer.append("-");
        }

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        if (dividend < divisor) {
            return "" + dividend + "/" + divisor + "=0";
        }

        digits = String.valueOf(dividend).split("");

        for (int i = 0; i < digits.length; i++) {
            reminder.append(digits[i]);
            reminderNumber = Integer.parseInt(reminder.toString());

            if (reminderNumber >= divisor) {
                subtractionResult = reminderNumber % divisor;
                multiplyResult = reminderNumber / divisor * divisor;
                lastReminder.setLength(0);
                multiply.setLength(0);
                lastReminder.append(String.format("%" + (i + 2) + "s", "_" + reminderNumber));
                multiply.append(String.format("%" + (i + 2) + "d", multiplyResult));
                Integer amountOfTabulations = lastReminder.length() - calculateDigit(multiplyResult);

                calculations.append(lastReminder).append("\n");
                calculations.append(multiply).append("\n");
                calculations.append(makeDivider(reminderNumber, amountOfTabulations)).append("\n");

                answer.append(reminderNumber / divisor);

                reminder.replace(0, reminder.length(), subtractionResult.toString());
                reminderNumber = Integer.parseInt(reminder.toString());
            } else {
                if (i >= calculateDigit(divisor)) {
                    answer.append(0);
                }
            }

            if (i == (digits.length - 1)) {
                calculations.append(String.format("%" + (i + 2) + "s", reminderNumber)).append("\n");
            }
        }

        return viewCalculations(components, calculations, answer);
    }

    /**
     * Method name: makeDivider
     *
     * @param reminderNumber      Number we keep in memory to subtract.
     * @param amountOfTabulations How many tabs we need to fill in.
     * @return (String) Line to fit ladder like view.
     */
    private static String makeDivider(Integer reminderNumber, Integer amountOfTabulations) {
        return assemblyString(amountOfTabulations, ' ')
                + assemblyString(calculateDigit(reminderNumber), '-');
    }

    /**
     * Method name: viewCalculations
     *
     * @param components         The numbers to be divided and by which to divide.
     * @param devideCalculations Step by step calculations that we did.
     * @param devideAnswer       Answer we receive after calculations.
     * @return (String) Whole column division.
     *
     *         Inside the function: 1. Divide String on three sections. 2. If we
     *         have a new like making tabulation to create a ladder like view. 3.
     *         Insert all the numbers on their places. 3. Claim section borders. 4.
     */
    private static String viewCalculations(ComponentsForDividing components, StringBuilder devideCalculations,
                                           StringBuilder devideAnswer) {
        int[] sectionBorders = new int[3];
        int massiveCell = 0;

        for (int loopIndex = 0; loopIndex < devideCalculations.length(); loopIndex++) {
            if (devideCalculations.charAt(loopIndex) == '\n') {
                sectionBorders[massiveCell] = loopIndex;
                massiveCell++;
            }

            if (massiveCell == 3) {
                break;
            }
        }

        int numberOfSymbols = calculateDigit(components.getDividend()) + 1 - sectionBorders[0];

        devideCalculations.insert(sectionBorders[2],
                assemblyString(numberOfSymbols, ' ') + "|" + devideAnswer.toString());
        devideCalculations.insert(sectionBorders[1],
                assemblyString(numberOfSymbols, ' ') + "|" + assemblyString(devideAnswer.length(), '-'));
        devideCalculations.insert(sectionBorders[0], "|" + components.getDivisor());
        devideCalculations.replace(1, sectionBorders[0], components.getDividend().toString());

        return devideCalculations.toString();
    }

    /**
     * Method name: assemblyString
     *
     * @param numberOfSymbols Numbers we receive during calculations.
     * @param delimiter       Delimiter between numbers.
     * @return (String) Line with numbers we write after subtraction.
     *
     *         Inside the function: 1. Creating new line. 2. Fill it with numbers.
     */
    private static String assemblyString(int numberOfSymbols, char delimiter) {
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < numberOfSymbols; i++) {
            newString.append(delimiter);
        }
        return newString.toString();
    }

    /**
     * Method name: calculateDigit
     *
     * @param dividend Number we keep in memory to subtract.
     * @return (int) Number after subtraction.
     */
    private static int calculateDigit(int dividend) {
        return (int) Math.log10(dividend) + 1;
    }


}