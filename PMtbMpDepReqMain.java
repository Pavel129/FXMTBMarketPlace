package com.maritimebank.FXMTBMarketPlace;

import java.util.Collections;
import java.util.Map;
import ru.inversion.fx.form.ViewContext;
import ru.inversion.fx.app.BaseApp;
import ru.inversion.fx.form.FXFormLauncher;
import ru.inversion.tc.TaskContext;

/**
 *
 * @author  Grigorev
 * @since   Wed Mar 09 10:47:29 MSK 2022
 */
public class PMtbMpDepReqMain extends BaseApp 
{
    
    @Override
    protected void showMainWindow () 
    {
        showViewMtbMpDepReq (getPrimaryViewContext (), new TaskContext (), Collections.emptyMap ());
    }

    @Override
    public String getAppID () 
    {
        return "XXI.PMTBMPDEPREQ"; 
    }
    
    public static void main (String[] args) 
    {
        launch (args);
    }

    public static void showViewMtbMpDepReq (ViewContext vc, TaskContext tc, Map<String, Object> p) 
    {
        new FXFormLauncher<> (tc, vc, ViewMtbMpDepReqController.class)
            .initProperties (p)
            .show ();
    }
    
}

