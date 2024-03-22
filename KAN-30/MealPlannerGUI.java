import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MealPlannerGUI extends JFrame {
    private JTable mealTable;

    public MealPlannerGUI() {
        setTitle("Meal Planner");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 400); // Increased size of the frame



        // Initialize the table model with an empty data array and column names
        DefaultTableModel tableModel = new DefaultTableModel(new Object[0][8], new String[]{"Time", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Cells are not editable
            }
        };

        // Populate the "Time" column with time values from 12 am to 12 pm
        for (int i = 0; i < 24; i++) {
            String time = String.format("%02d:00", i % 12 == 0 ? 12 : i % 12); // Format hours from 1 to 12
            if (i < 12) {
                tableModel.addRow(new Object[]{time + " AM"}); // Add time with AM suffix
            } else {
                tableModel.addRow(new Object[]{time + " PM"}); // Add time with PM suffix
            }
        }

        // Initialize the JTable with the table model
        mealTable = new JTable(tableModel);

        // Set column width for "Time" column
        mealTable.getColumnModel().getColumn(0).setPreferredWidth(70);

        // Add the JTable to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(mealTable);

        // Add the JScrollPane to the content pane using BorderLayout
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MealPlannerGUI mealPlannerGUI = new MealPlannerGUI();
            mealPlannerGUI.setVisible(true);
        });
    }
}
