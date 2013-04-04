package actions;

import net.sourceforge.stripes.action.*;

@UrlBinding("/some/{myValue}")
public class SomeActionBean implements ActionBean {
   private ActionBeanContext context;

   private int myValue;

   @DefaultHandler
   public Resolution view() {
       System.out.println(myValue);
       // forward to a path that doesn't start with a "/" raises sourcePage not found
       // instead of a validation error
       return new ForwardResolution("unknown.jsp");
   }

   @Override
   public ActionBeanContext getContext() {
       return context;
   }

   @Override
   public void setContext(ActionBeanContext context) {
       this.context = context;
   }

   public int getMyValue() {
       return myValue;
   }

   public void setMyValue(int myValue) {
       this.myValue = myValue;
   }
}
