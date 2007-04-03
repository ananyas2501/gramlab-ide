/*
 * Unitex
 *
 * Copyright (C) 2001-2007 Universit� de Marne-la-Vall�e <unitex@univ-mlv.fr>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA.
 *
 */

package fr.umlv.unitex;

import java.util.*;
import javax.swing.*;
import javax.swing.plaf.metal.*;



/**
 * This is the main class of the Unitex system.
 * 
 * @author S�bastien Paumier
 */

public class Unitex {

	/**
	 * Starts Unitex. Shows a <code>SplashScreen</code> with the Unitex logo
	 * and then creates a <code>UnitexFrame</code>.
	 *  
	 */
	public static void main(String[] args) {
		/*JFrame ff=new JFrame("toto");
		ff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ff.setSize(600,600);
		XMLmodel x1=new XMLmodelImpl(43,43);
		XMLmodel x2=new XMLmodelImpl(86,52);
		XAlignModel model=new XAlignModelImpl(x1,x2);
		ff.setContentPane(new XAlignPane(x1,x2,model));
		ff.setVisible(true);*/
		
		Locale.setDefault(Locale.ENGLISH);
		try {
			javax.swing.plaf.metal.MetalLookAndFeel
					.setCurrentTheme(new OceanTheme());
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (UnsupportedLookAndFeelException e) {
			System.out
					.println("Metal Look & Feel not supported on this platform. \nProgram Terminated");
			System.exit(0);
		} catch (IllegalAccessException e) {
			System.out
					.println("Metal Look & Feel could not be accessed. \nProgram Terminated");
			System.exit(0);
		} catch (ClassNotFoundException e) {
			System.out
					.println("Your version of Java does not contain all the classes required by Unitex.\nProgram Terminated");
			System.exit(0);
		} catch (InstantiationException e) {
			System.out
					.println("Metal Look & Feel could not be instantiated. \nProgram Terminated");
			System.exit(0);
		} catch (Exception e) {
			System.out.println("Unexpected error. \nProgram Terminated");
			e.printStackTrace();
			System.exit(0);
		}
		new SplashScreen(new ImageIcon(Unitex.class.getResource("Unitex.jpg")),
				1500);
		Config.initConfig(args.length==1?args[0]:null);
		JFrame frame = new UnitexFrame();
		frame.setVisible(true);
	}
	
	
	
	
}