package com.company;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

 class OSProject {
    JFrame mainFrame = new JFrame("Operating System Project");
    JLabel inputLabel = new JLabel("Input");
    JLabel algoLabel = new JLabel("Algorithm");
    JLabel outputLabel = new JLabel("Output");
    JLabel arrivalLabel = new JLabel("Arrival Times");
    JLabel burstLabel = new JLabel("Burst Times");
    JTextField arrivalTextField = new JTextField(" eg. 0 2 4 6 8");
    JTextField burstTextField = new JTextField(" eg. 5 2 3 6 4");

    JButton solveButton = new JButton("Solve");
    String[] choices = {" Select An Algorithm ", " First Come First Serve ", " Shortest Job First (Preemptive) ", " Shortest Job First (Non-Preemptive) "};
    String[] tags = {"FCFS", "SJF", "SJF"};
    int choice = 0;

    public OSProject() {
        inputLabel.setFont(new Font(Font.SERIF, Font.BOLD, 30));
        inputLabel.setBounds(20, 20, 250, 50);
        mainFrame.add(inputLabel);

        algoLabel.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
        algoLabel.setBounds(20, 70, 250, 50);
        mainFrame.add(algoLabel);

        JComboBox<String> dropDownMenu = new JComboBox<>(choices);
        dropDownMenu.setBounds(20, 110, 300, 40);
        dropDownMenu.setFocusable(false);
        dropDownMenu.setBackground(Color.decode("#f5f5f5"));
        mainFrame.add(dropDownMenu);

        arrivalLabel.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
        arrivalLabel.setBounds(20, 150, 250, 50);
        mainFrame.add(arrivalLabel);

        arrivalTextField.setBounds(20, 190, 300, 40);
        arrivalTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (arrivalTextField.getText().equals(" eg. 0 2 4 6 8")) {
                    arrivalTextField.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (arrivalTextField.getText().equals("")) {
                    arrivalTextField.setText(" eg. 0 2 4 6 8");
                }
            }
        });
        mainFrame.add(arrivalTextField);

        burstLabel.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
        burstLabel.setBounds(20, 230, 250, 50);
        mainFrame.add(burstLabel);

        burstTextField.setBounds(20, 270, 300, 40);
        burstTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (burstTextField.getText().equals(" eg. 5 2 3 6 4")) {
                    burstTextField.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (burstTextField.getText().equals("")) {
                    burstTextField.setText(" eg. 5 2 3 6 4");
                }
            }
        });
        mainFrame.add(burstTextField);

        solveButton.setBounds(20, 350, 70, 40);
        solveButton.setBackground(Color.decode("#2784fe"));
        solveButton.setForeground(Color.WHITE);
        solveButton.setFocusable(false);

        mainFrame.add(solveButton);

        solveButton.addActionListener(e -> {
            choice = dropDownMenu.getSelectedIndex();

            if (choice == 0) {
                JOptionPane.showMessageDialog(mainFrame, "Please Select Valid Algorithm", "Alert", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String at = arrivalTextField.getText().trim();
            String bt = burstTextField.getText().trim();

            String[] arrivalTimes = at.split(" ", 10);
            String[] burstTimes = bt.split(" ", 10);

            if (arrivalTimes.length != burstTimes.length) {
                JOptionPane.showMessageDialog(mainFrame, "Please Enter Equal Number of Arrival Time and Burst Time", "Alert", JOptionPane.ERROR_MESSAGE);
                return;
            }
            getReadyForCalculations(arrivalTimes, burstTimes, choice);
        });
        mainFrame.getContentPane().setBackground(Color.decode("#EAE7DC"));
        mainFrame.setResizable(false);
        mainFrame.setLayout(null);
        mainFrame.setBounds(500, 100, 800, 500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);

    }

    public static void main(String[] args) {
        new OSProject();
    }

    void getReadyForCalculations(String[] arrival, String[] burst, int choice) {

        int[] arrivalTimes = new int[arrival.length];
        int[] burstTimes = new int[burst.length];

        for (int i = 0; i < arrival.length; i++) {
            arrivalTimes[i] = Integer.parseInt(arrival[i]);
            burstTimes[i] = Integer.parseInt(burst[i]);
        }

        if (choice == 1)
            calculateFCFS(arrivalTimes, burstTimes);
        else if (choice == 2) {
            calculateSJF_Pre(arrivalTimes, burstTimes);
        } else if (choice == 3) {
            calculateSJF_NonPre(arrivalTimes, burstTimes);
        }
    }

    void calculateFCFS(int[] ar, int[] bt) {
        int size = ar.length;
        int[] pid = new int[size];
        int[] ct = new int[size];
        int[] ta = new int[size];
        int[] wt = new int[size];
        int temp;
        float avgWt = 0, avgTa = 0;

        for (int i = 0; i < size; i++) {
            pid[i] = i + 1;
        }

//sorting according to arrival times
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - (i + 1); j++) {
                if (ar[j] > ar[j + 1]) {
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                    temp = bt[j];
                    bt[j] = bt[j + 1];
                    bt[j + 1] = temp;
                    temp = pid[j];
                    pid[j] = pid[j + 1];
                    pid[j + 1] = temp;
                }
            }
        }
// finding completion times
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                ct[i] = ar[i] + bt[i];
            } else {
                if (ar[i] > ct[i - 1]) {
                    ct[i] = ar[i] + bt[i];
                } else
                    ct[i] = ct[i - 1] + bt[i];
            }
            ta[i] = ct[i] - ar[i];
            wt[i] = ta[i] - bt[i];
            avgWt += wt[i];
            avgTa += ta[i];
        }
        makeTable(ar, bt, ct, ta, wt, avgTa / size, avgWt / size);
    }

    void calculateSJF_Pre(int[] at, int[] bt) {

        int size = at.length;
        int[] ct = new int[size];
        int[] ta = new int[size];
        int[] wt = new int[size];
        int[] f = new int[size];
        int[] k = new int[size];
        int i, st = 0, tot = 0;
        float avgWt = 0, avgTa = 0;

        for (i = 0; i < size; i++) {
            k[i] = bt[i];
            f[i] = 0;
        }

        while (true) {
            int min = 99, c = size;
            if (tot == size)
                break;

            for (i = 0; i < size; i++) {
                if ((at[i] <= st) && (f[i] == 0) && (bt[i] < min)) {
                    min = bt[i];
                    c = i;
                }
            }

            if (c == size)
                st++;
            else {
                bt[c]--;
                st++;
                if (bt[c] == 0) {
                    ct[c] = st;
                    f[c] = 1;
                    tot++;
                }
            }
        }

        for (i = 0; i < size; i++) {
            ta[i] = ct[i] - at[i];
            wt[i] = ta[i] - k[i];
            avgWt += wt[i];
            avgTa += ta[i];
        }

        makeTable(at, bt, ct, ta, wt, avgWt / size, avgTa / size);
    }

    void calculateSJF_NonPre(int[] at, int[] bt) {
        int size = at.length;

        int[] ct = new int[size];
        int[] ta = new int[size];
        int[] wt = new int[size];
        int[] f = new int[size];
        int st = 0, tot = 0;
        float avgWt = 0, avgTa = 0;

        for (int i = 0; i < size; i++) {
            f[i] = 0;
        }
        while (true) {
            int c = size, min = 999;
            if (tot == size)
                break;
            for (int i = 0; i < size; i++) {
                if ((at[i] <= st) && (f[i] == 0) && (bt[i] < min)) {
                    min = bt[i];
                    c = i;
                }

            }
            if (c == size)
                st++;
            else {
                ct[c] = st + bt[c];
                st += bt[c];
                ta[c] = ct[c] - at[c];
                wt[c] = ta[c] - bt[c];
                f[c] = 1;
                tot++;
            }
        }
        for (int i = 0; i < size; i++) {
            avgWt += wt[i];
            avgTa += ta[i];
        }
        makeTable(at, bt, ct, ta, wt, (avgTa / size), (avgWt / size));
    }

    void makeTable(int[] at, int[] bt, int[] ct, int[] ta, int[] wt, float avgTAT, float avgWT) {

        mainFrame.dispose();
        JFrame resultFrame = new JFrame("Results");
        resultFrame.setLayout(null);
        resultFrame.setBounds(400, 200, 850, 500);

        outputLabel.setFont(new Font(Font.SERIF, Font.BOLD, 30));
        outputLabel.setBounds(30, 20, 250, 50);
        resultFrame.add(outputLabel);

        JButton tag = new JButton(tags[choice - 1]);
        tag.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
        tag.setBounds(750, 20, 50, 30);
        tag.setFocusable(false);
        tag.setBorder(null);
        resultFrame.add(tag);


        String[] column = {"JOB", "ARRIVAL TIME", "BURST TIME", "FINISH TIME", "TURN AROUND TIME", "WAITING TIME"};
        JTable table = new JTable();
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(column);
        table.setModel(dtm);
        resultFrame.add(table);
        dtm.addRow(column);
        for (int i = 0; i < at.length; i++) {
            char c = (char) ((char) i + 65);
            String[] tempData = {String.valueOf(c), String.valueOf(at[i]), String.valueOf(bt[i]), String.valueOf(ct[i]), String.valueOf(ta[i]), String.valueOf(wt[i])};
            dtm.addRow(tempData);
        }
        table.setBounds(40, 80, 750, 180);

        mainFrame.getComponentAt(20, 400);
        System.out.println(avgTAT);
        System.out.println(avgWT);


        JButton reset = new JButton("Reset");
        reset.setBounds(750, 350, 70, 40);
        reset.setBackground(Color.decode("#2784fe"));
        reset.setForeground(Color.WHITE);
        reset.setFocusable(false);

        resultFrame.add(reset);


        reset.addActionListener(e -> {
            resultFrame.dispose();
            new OSProject();
        });

        resultFrame.setVisible(true);
        resultFrame.getContentPane().setBackground(Color.decode("#EAE7DC"));
        resultFrame.setResizable(false);
        resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        resultFrame.setVisible(true);
    }
}



