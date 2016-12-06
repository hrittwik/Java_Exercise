
public class TestMedicine {
   public static void main( String [] args ) {
   // go ahead and make this an main Object so gain virtual functionality
   // and at the same time invoke the method of this Object, TestMedicine
       new TestMedicine().init();

   }

   private void init() {

       Medicine [] meds = new Medicine[ 10 ];
       meds[0] = new Medicine( "Asprin", "Pharmacupa");
       meds[1] = new Medicine( "Placebo", "Bayun");
       meds[2] = new Medicine( "Placebo", "Bayun");
       meds[3] = new Medicine( "Placebo", "Bayun");
       meds[4] = new Medicine( "Placebo", "Bayun");
       meds[5] = new Syrup();
       meds[6] = new Medicine( "Placebo", "Bayun");
       meds[7] = new Medicine( "Placebo", "Bayun");
       meds[8] = new Medicine( "Placebo", "Bayun");
       meds[9] = new Medicine( "Ointment", "Horsehelper");

       for( int i = 0; i< meds.length; i++) {
           meds[i].displayLabel(); // this will invoke the method of the Object medicine
       }
   }
}
