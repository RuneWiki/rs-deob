package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/sq")
public class class508 {
   @OriginalMember(
      owner = "client!jagdx/sq",
      name = "a",
      descriptor = "(IB)Z",
      line = 16
   )
   public static final boolean method3766(int arg0, byte arg1) {
      if (arg1 != -44) {
         return true;
      } else {
         return -1 >= ~arg0;
      }
   }

   @OriginalMember(
      owner = "client!jagdx/sq",
      name = "a",
      descriptor = "(IZ)Z",
      line = 37
   )
   public static final boolean method3767(int arg0, boolean arg1) {
      if (arg1) {
         return false;
      } else {
         return 0 > arg0;
      }
   }
}
