package fieldCalculator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kamil on 2018-06-11.
 */
public class ContainerForFigure {
    private List<Figure> listOfAllFigure;
    private CreateFigure createFigure;

    public ContainerForFigure() {
        listOfAllFigure = new ArrayList<>();
        createFigure = new CreateFigure();
    }

    public void addFigureToList(Figure figure) {
        listOfAllFigure.add(figure);
    }

    public void removeFigureFromList(int figureId) {
        if (figureId < 0 || figureId > listOfAllFigure.size())
            System.err.println("A figure with this Id does not exist");
        else
            listOfAllFigure.remove(figureId);
    }

    public void removeFigureFromList(Figure figure) {
        listOfAllFigure.remove(figure);
    }

    public void updateFigure(int figureId) {
        if (listOfAllFigure.get(figureId) instanceof Triangle) {
            listOfAllFigure.set(figureId, createFigure.create("Triangle"));
        }
        if (listOfAllFigure.get(figureId) instanceof Circle) {
            listOfAllFigure.set(figureId, createFigure.create("Circle"));
        }
        if (listOfAllFigure.get(figureId) instanceof Square) {
            listOfAllFigure.set(figureId, createFigure.create("Square"));
        }
    }

    public boolean showAllFigure() {
        boolean isEmpty = false;
        if (listOfAllFigure.size() == 0) {
            System.err.println("List of figures is empty");
            isEmpty = true;
        } else {
            for (int i = 0; i < listOfAllFigure.size(); i++) {

                System.out.println("Figure id: " + i);
                listOfAllFigure.get(i).print();
                System.out.println();
            }
        }
        return isEmpty;
    }
}
