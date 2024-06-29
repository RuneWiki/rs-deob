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
   public static Class field10271;
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
      descriptor = "(Z)Z"
   )
   public final boolean method5114(boolean arg0) {
      if (!arg0) {
         this.reference = (PeerReference)null;
      }

      return this.reference.method5118(-52);
   }

   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "a",
      descriptor = "()J"
   )
   protected long method3734() {
      return this.reference.method5119(0);
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
   public static Class method5115(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   static {
      init(field10271 == null ? (field10271 = method5115(method5117(method5116("g\u0003\u0019SLoL\nZ@\u007fL*Z@\u007f0\u001fY@\u007f\u0007\u0014\\@")))) : field10271);
   }

   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5116(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5117(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 13;
            break;
         case 1:
            var10005 = 98;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
