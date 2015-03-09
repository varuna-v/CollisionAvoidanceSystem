package cas;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.JComboBox;

import Ertsys.*;

public class AlterPathDisplay extends JPanel
{
	private List<Aircraft> _aircrafts;
	private JComboBox cbxIdentities;
	private JTextField txtTargetHeight;
	public JButton btnConfirm;
	private JLabel lblError;
	
	public AlterPathDisplay(List<Aircraft> aircrafts)
	{
		setLayout(new GridLayout(3, 2, 2, 2));
		
		add(new JLabel("Identification: "));
		
		configureIdentitiesComboBox(aircrafts);
		add(cbxIdentities);
		
		add(new JLabel("Target altitude: "));
		
		txtTargetHeight = new JTextField();
		add(txtTargetHeight);
		
		btnConfirm = new JButton("Confirm");
		add(btnConfirm);
		
		lblError = new JLabel();
		lblError.setForeground(Color.RED);
		
		setBorder(BorderFactory.createLoweredBevelBorder());
	}	
	
	public void update(List<Aircraft> aircrafts)
	{
		configureIdentitiesComboBox(aircrafts);
	}
	
	public AlterPathPair getDataToAlterPath(CASystem system)
	{
		String sTargetHeight = txtTargetHeight.getText();
		if (sTargetHeight == "") 
		{
			lblError.setText("Enter target height");
			return null;
		}
		
		double targetHeight;
		try
		{
			targetHeight = Double.parseDouble(sTargetHeight);
		}
		catch (Exception ex)
		{
			lblError.setText("Target height must be a real number");
			return null;
		}

		return new AlterPathPair(String.valueOf(cbxIdentities.getSelectedItem()), targetHeight);
		
	}
	
	private void configureIdentitiesComboBox(List<Aircraft> aircrafts)
	{
		if (cbxIdentities == null) { cbxIdentities = new JComboBox(); }
		cbxIdentities.removeAllItems();
		if (aircrafts != null) 
		{
			for(Aircraft aircraft : aircrafts)
			{
				String id = aircraft.identification.toString();
				String sId = id.substring(4, id.length()-1);
				cbxIdentities.addItem(sId);
			}
			cbxIdentities.setEnabled(true);
		}
		else
		{
			cbxIdentities.setEnabled(false);
		}
	}
}