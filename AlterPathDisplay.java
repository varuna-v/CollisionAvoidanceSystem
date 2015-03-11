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
	//private JComboBox cbxIdentities;
	private JTextField txtIdentity;
	private JTextField txtTargetHeight;
	public JButton btnConfirm;
	private JLabel lblError;
	
	public AlterPathDisplay(List<Aircraft> aircrafts)
	{
		setLayout(new GridLayout(3, 2, 2, 2));
		_aircrafts = aircrafts;
		add(new JLabel("Identity: "));
		
		//configureIdentitiesComboBox(aircrafts);
		//add(cbxIdentities);
		txtIdentity = new JTextField();
		add(txtIdentity);
		
		add(new JLabel("Target altitude: "));
		
		txtTargetHeight = new JTextField();
		add(txtTargetHeight);
		
		btnConfirm = new JButton("Confirm");
		add(btnConfirm);
		
		lblError = new JLabel();
		lblError.setForeground(Color.RED);
		add(lblError);
		
		setBorder(BorderFactory.createLoweredBevelBorder());
	}	
	
	public void update(List<Aircraft> aircrafts)
	{
		_aircrafts = aircrafts;
	}
	
	public AlterPathPair getDataToAlterPath(CASystem system)
	{
		String sTargetHeight = txtTargetHeight.getText();
		if (sTargetHeight.equals("")) 
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

		String sIdentity = txtIdentity.getText();
		if (sIdentity.equals(""))
		{
			lblError.setText("Enter aircraft identity");
			return null;
		}
		
		if (!doesAircraftWithIdentityExist(sIdentity))
		{
			lblError.setText("Enter valid aircraft identity");
			return null;
		}
		
		lblError.setText("");
		
		return new AlterPathPair(sIdentity, targetHeight);
		
	}
	
	private boolean doesAircraftWithIdentityExist(String identity)
	{
		if (_aircrafts != null)
		{
			for (Aircraft aircraft : _aircrafts)
				if (_eSystem._lJavaString(aircraft.identification).equals(identity))
					return true;
		}
		return false;
	}
	
//	private void configureIdentitiesComboBox(List<Aircraft> aircrafts)
//	{
//		if (cbxIdentities == null) { cbxIdentities = new JComboBox(); }
//		
//		if (aircrafts != null) 
//		{
//			DefaultComboBoxModel model = (DefaultComboBoxModel)cbxIdentities.getModel(); 
//			for(Aircraft aircraft : aircrafts)
//			{
//				String id = aircraft.identification.toString();
//				String sId = id.substring(4, id.length()-1).replaceAll(",", "");
//				if (model.getIndexOf(sId) == -1)
//					cbxIdentities.addItem(sId);
//			}
//			
//			cbxIdentities.setEnabled(true);
//		}
//		else
//		{
//			cbxIdentities.removeAllItems();
//			cbxIdentities.setEnabled(false);
//		}
//	}
}