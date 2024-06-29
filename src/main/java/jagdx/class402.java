package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/rd")
public class class402 {
   @OriginalMember(
      owner = "client!jagdx/rd",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method3144(int arg0, int arg1) {
      if (arg0 != -2005530595) {
         method3145(-2, (byte)42);
      }

      return -1 >= ~arg1;
   }

   @OriginalMember(
      owner = "client!jagdx/rd",
      name = "a",
      descriptor = "(IB)Z"
   )
   public static final boolean method3145(int arg0, byte arg1) {
      if (arg1 != 123) {
         method3145(35, (byte)76);
      }

      return ~arg0 > -1;
   }
}
