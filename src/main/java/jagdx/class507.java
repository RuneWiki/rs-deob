package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/kt")
public class class507 {
   @OriginalMember(
      owner = "client!jagdx/kt",
      name = "b",
      descriptor = "(II)Z",
      line = 22
   )
   public static final boolean method3795(int arg0, int arg1) {
      if (arg1 >= -1) {
         return false;
      } else {
         return 0 <= arg0;
      }
   }

   @OriginalMember(
      owner = "client!jagdx/kt",
      name = "a",
      descriptor = "(II)Z",
      line = 45
   )
   public static final boolean method3796(int arg0, int arg1) {
      if (arg0 != 0) {
         return true;
      } else {
         return arg1 < 0;
      }
   }
}
