package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/cga")
public class class71 {
   @OriginalMember(
      owner = "client!jagdx/cga",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method549(int arg0, int arg1) {
      if (arg1 <= 0) {
         method549(83, -22);
      }

      return ~arg0 > -1;
   }

   @OriginalMember(
      owner = "client!jagdx/cga",
      name = "a",
      descriptor = "(IB)Z"
   )
   public static final boolean method550(int arg0, byte arg1) {
      if (arg1 != -80) {
         return true;
      } else {
         return arg0 >= 0;
      }
   }
}
