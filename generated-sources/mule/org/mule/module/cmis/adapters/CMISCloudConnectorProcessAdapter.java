
package org.mule.module.cmis.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.module.cmis.CMISCloudConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>CMISCloudConnectorProcessAdapter</code> is a wrapper around {@link CMISCloudConnector } that enables custom processing strategies.
 * 
 */
@Generated(value = "Mule DevKit Version 3.5.0-SNAPSHOT", date = "2014-04-15T03:23:24-05:00", comments = "Build master.1915.dd1962d")
public class CMISCloudConnectorProcessAdapter
    extends CMISCloudConnectorLifecycleAdapter
    implements ProcessAdapter<CMISCloudConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, CMISCloudConnectorCapabilitiesAdapter> getProcessTemplate() {
        final CMISCloudConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,CMISCloudConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, CMISCloudConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, CMISCloudConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
