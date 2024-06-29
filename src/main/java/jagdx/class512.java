package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/es")
public class class512 {
   @OriginalMember(
      owner = "client!jagdx/es",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method3718(int arg0, int arg1) {
      if (arg1 != 2005530519) {
         return false;
      } else {
         return arg0 >= 0;
      }
   }

   @OriginalMember(
      owner = "client!jagdx/es",
      name = "b",
      descriptor = "(II)Z"
   )
   public static final boolean method3719(int arg0, int arg1) {
      if (arg1 != -2005530586) {
         return true;
      } else {
         return arg0 < 0;
      }
   }
}
