package net.bruhitsalex.branchlockdesktop.ui;

import net.bruhitsalex.branchlockdesktop.processing.Processing;
import net.bruhitsalex.branchlockdesktop.ui.processing.ProcessingPane;
import net.bruhitsalex.branchlockdesktop.ui.settings.LogPane;
import net.bruhitsalex.branchlockdesktop.ui.settings.SettingsConfigOutputPane;
import net.bruhitsalex.branchlockdesktop.ui.utils.UIUtils;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private JPanel mainPanel;
    private ProcessingPane proccessingPane;
    private SettingsConfigOutputPane settingsConfigOutputPane;

    public MainWindow() {
        setTitle("Branchlock Desktop");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        try {
            setIconImage(ImageIO.read(getClass().getClassLoader().getResource("images/icon.png")));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        setSize(new Dimension(1280, 720));
        setPreferredSize(new Dimension(1280, 720));
        initComponents();
        LogPane.addLine(LogPane.Type.GUI, "UI created.");
        Processing.updatePanelOptions();

        UIUtils.centreWindow(this);
        LogPane.addLine(LogPane.Type.GUI, "Window opened.");
        pack();
    }

    private void initComponents() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        getContentPane().add(mainPanel);

        JSplitPane splitPane = new JSplitPane();
        splitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setResizeWeight(0.15);

        proccessingPane = new ProcessingPane();
        splitPane.setLeftComponent(proccessingPane);
        settingsConfigOutputPane = new SettingsConfigOutputPane();
        splitPane.setRightComponent(settingsConfigOutputPane);

        mainPanel.add(splitPane, BorderLayout.CENTER);
    }

}
