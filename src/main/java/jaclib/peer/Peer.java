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
   public static Class field5249;
   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "reference",
      descriptor = "Ljaclib/peer/PeerReference;"
   )
   protected PeerReference reference;

   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "<init>",
      descriptor = "()V"
   )
   protected Peer() {
   }

   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "init",
      descriptor = "(Ljava/lang/Class;)V"
   )
   private static final native void init(Class arg0);

   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method2972(int arg0) {
      if (arg0 != -21735) {
         this.method2972(-73);
      }

      return this.reference.method2978((byte)-125);
   }

   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "a",
      descriptor = "()J"
   )
   protected long method2973() {
      return this.reference.method2977(0);
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method2974(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   static {
      init(field5249 == null ? (field5249 = method2974(method2976(method2975("2c-A&:,>H**,\u001eH**P+K**g N*")))) : field5249);
   }

   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2975(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2976(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
