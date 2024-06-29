package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/bba")
public class class760 {
   @OriginalMember(
      owner = "client!jagdx/bba",
      name = "a",
      descriptor = "(ZI)Z"
   )
   public static final boolean method5513(boolean arg0, int arg1) {
      if (arg0) {
         return true;
      } else {
         return arg1 < 0;
      }
   }

   @OriginalMember(
      owner = "client!jagdx/bba",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method5514(int arg0, int arg1) {
      if (arg0 != 25060) {
         return true;
      } else {
         return 0 <= arg1;
      }
   }
}
