package com.figure.service;

import com.figure.model.Figure;

public class FigureService {




    public double calculateFigureArea(Figure figure) {
        if (figure.getValue() <= 0) {
            throw new IllegalArgumentException("El valor del radio o lado debe ser mayor que cero");
        } else {
            if ("circulo".equals(figure.getName())) {
                double value = Math.PI * figure.getValue() * figure.getValue();
                System.out.println("El área del " + figure.getName()+ " es "+ (int)Math.round(value) + " unidades");
                return value;
            } else if ("cuadrado".equals(figure.getName())) {
                double value = figure.getValue() * figure.getValue();
                System.out.println("El área del " + figure.getName()+ " es "+ (int)Math.round(value) + " unidades");
                return value;
            } else {
                throw new IllegalArgumentException("Figura no reconocida: " + figure.getName() + " no es posible de calcular");
            }


        }

    }

}
