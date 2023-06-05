package com.maritimebank.FXMTBMarketPlace;

import ru.inversion.bicomp.pref.PriviledgeBundle;

public class POptions extends PriviledgeBundle {
	
	public POptions(){}
	
	enum Actions{
		VIEW_MDR(-17),
		SEND_MDE(-18),
		LINK_CUS(-19);
		private final int act_id;
		Actions(int i){
			act_id=i;
		}
		public int id(){
			return act_id;
		}
	}
	
	@Override
	public int[] getActionList() {
		return new int[] {
				 Actions.VIEW_MDR.act_id// -17 // view reestr
				,Actions.SEND_MDE.act_id// -18 // send_event
				,Actions.LINK_CUS.act_id// -19 // link_customer
		};
	}
	
	@Override
	public String[] getRoleList() {
		return new String [] {"ODB_ADM"};
	}
	
}