package net.bruhitsalex.branchlockdesktop.ui.settings.tasks;

import net.bruhitsalex.branchlockdesktop.processing.Processing;
import net.bruhitsalex.branchlockdesktop.ui.settings.AbstractOptionPanel;

import javax.swing.*;

public class ShuffleClassMembersPane extends AbstractOptionPanel {

    private JCheckBox enabledBox;

    public ShuffleClassMembersPane() {
        super("Shuffle Class Members");
    }

    @Override
    public void initComponents() {
        components.add(enabledBox = new JCheckBox("Enabled"));
    }

    @Override
    public void setOptionFromConfig() {
        enabledBox.setSelected(Processing.getConfig().getTasks().isShuffleClassMembers());
    }

}
