package jaclib.peer;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/Peer")
public abstract class Peer {
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "a",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field10230;
   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "reference",
      descriptor = "Ljaclib/peer/PeerReference;"
   )
   protected PeerReference reference;

   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "init",
      descriptor = "(Ljava/lang/Class;)V"
   )
   private static final native void init(Class arg0);

   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "a",
      descriptor = "()J"
   )
   protected long method3740() {
      return this.reference.method5121((byte)75);
   }

   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method5117(int arg0) {
      if (arg0 != 27043) {
         init((Class)null);
      }

      return this.reference.method5122(-96);
   }

   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "<init>",
      descriptor = "()V"
   )
   protected Peer() {
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method5118(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   static {
      init(field10230 == null ? (field10230 = method5118(method5120(method5119("x6mn(py~g$`y^g$`\u0005kd$`2`a$")))) : field10230);
   }

   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5119(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 65);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5120(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 65;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
