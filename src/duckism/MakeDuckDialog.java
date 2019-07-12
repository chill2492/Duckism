package duckism;

import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("javadoc")
public class MakeDuckDialog
    extends JDialog
{

    DuckFactory              factory             = DuckFactory.getInstance();
    // Fields

    // Duck panel
    private final JPanel     duckPanel           = new JPanel();
    private final JLabel     duckLabel           = new JLabel("Duck");
    private final String[]   duckStrings         =
        { "Mallard", "Redhead", "Rubber", "Decoy", "Goose" };
    private final JComboBox  duckOptions         = new JComboBox(duckStrings);

    // Bling panel
    private final JPanel     blingPanel          = new JPanel();

    private final JLabel     starLabel           = new JLabel("Star");
    private final JLabel     moonLabel           = new JLabel("Moon");
    private final JLabel     crossLabel          = new JLabel("Cross");

    private final JLabel     starCountLabel      = new JLabel("0");
    private final JLabel     moonCountLabel      = new JLabel("0");
    private final JLabel     crossCountLabel     = new JLabel("0");

    private final JButton    addStarButton       = new JButton("+");
    private final JButton    addMoonButton       = new JButton("+");
    private final JButton    addCrossButton      = new JButton("+");

    private final JButton    subtractStarButton  = new JButton("-");
    private final JButton    subtractMoonButton  = new JButton("-");
    private final JButton    subtractCrossButton = new JButton("-");

    private final GridLayout blingLayout         = new GridLayout(3, 4);

    // Button panel
    private final JPanel     buttonPanel         = new JPanel();
    private final JButton    okayButton          = new JButton("Okay");
    private final JButton    cancelButton        = new JButton("Cancel");

    // Stored Data
    private String           duckType            = "Mallard";
    private int              starCount           = 0;
    private int              moonCount           = 0;
    private int              crossCount          = 0;


    // Constructor
    public MakeDuckDialog(DuckSimModel model, DuckSimView view)
    {
        this.getContentPane()
            .setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

        // add duck panel
        duckPanel.add(duckLabel);
        duckOptions.addActionListener(e -> {
            JComboBox cb = (JComboBox)e.getSource();
            duckType = (String)cb.getSelectedItem();
        });
        duckPanel.add(duckOptions);
        this.add(duckPanel);

        // add cross bling panel
        blingPanel.add(crossLabel);
        blingPanel.add(crossCountLabel);
        blingPanel.add(addCrossButton);
        {
            addCrossButton.addActionListener(e -> {
                if ((crossCount + starCount + moonCount) < 3)
                {
                    crossCount++;
                    crossCountLabel.setText("" + crossCount);
                }
            });

            blingPanel.add(subtractCrossButton);
            subtractCrossButton.addActionListener(e -> {
                if (crossCount > 0)
                {
                    crossCount--;
                    crossCountLabel.setText("" + crossCount);
                }
            });
        }
        // add star bling
        blingPanel.add(starLabel);
        blingPanel.add(starCountLabel);
        blingPanel.add(addStarButton);
        {
            addStarButton.addActionListener(e -> {
                if ((crossCount + starCount + moonCount) < 3)
                {
                    starCount++;
                    starCountLabel.setText("" + starCount);
                }
            });

            blingPanel.add(subtractStarButton);
            subtractStarButton.addActionListener(e -> {
                if (starCount > 0)
                {
                    starCount--;
                    starCountLabel.setText("" + starCount);
                }
            });
        }

        // add moon bling
        blingPanel.add(moonLabel);
        blingPanel.add(moonCountLabel);
        blingPanel.add(addMoonButton);
        {
            addMoonButton.addActionListener(e -> {
                if ((crossCount + starCount + moonCount) < 3)
                {
                    moonCount++;
                    moonCountLabel.setText("" + moonCount);
                }
            });

            blingPanel.add(subtractMoonButton);
            subtractMoonButton.addActionListener(e -> {
                if (moonCount > 0)
                {
                    moonCount--;
                    moonCountLabel.setText("" + moonCount);
                }
            });
        }

        blingPanel.setLayout(blingLayout);
        this.add(blingPanel);

        // add button panel
        cancelButton.addActionListener(e -> {
            this.dispose();
        });
        buttonPanel.add(cancelButton);
        okayButton.addActionListener(e -> {
            // makeDuckDialog
            Duck duck = null;
            duck =
                factory.createDuck(duckType, starCount, moonCount, crossCount);
            if (duck != null)
            {
                model.addNewDuck(duck);

            }
            view.repaint();
            this.dispose();
        });
        buttonPanel.add(okayButton);
        this.add(buttonPanel);
    }


    // Public Methods
    public String getDuckType()
    {
        return duckType;
    }
}
