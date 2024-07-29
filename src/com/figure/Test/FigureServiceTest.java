package com.figure.Test;

import com.figure.model.Figure;
import com.figure.service.FigureService;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class FigureServiceTest {
    private final FigureService CALCULATE_FIGURE = new FigureService();

    @Test
    public void calculateCircle() {
        // arrange
        Figure circle1 = new Figure("circulo", 6);

        //act
        double value = CALCULATE_FIGURE.calculateFigureArea(circle1);

        //assert
        assertEquals(113.09733552923255, value);
    }

    @Test
    public void calculateSquare() {
        // arrange

        Figure square = new Figure("cuadrado", 6);

        //act
        double value = CALCULATE_FIGURE.calculateFigureArea(square);

        //assert
        assertEquals(36, value);
    }

    @Test
    public void incorrectCValue() {
        // arrange

        Figure circle2 = new Figure("circulo", 0);

        // Act & Assert
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> CALCULATE_FIGURE.calculateFigureArea(circle2)
        );

        assertEquals("El valor del radio o lado debe ser mayor que cero", thrown.getMessage());
    }

    @Test
    public void incorrectCName() {
        // arrange

        Figure circle2 = new Figure("triangulo", 5);

        // Act & Assert
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> CALCULATE_FIGURE.calculateFigureArea(circle2)
        );

        assertEquals("Figura no reconocida: triangulo no es posible de calcular", thrown.getMessage());
    }


}