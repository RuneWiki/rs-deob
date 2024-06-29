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
   public static Class field10240;
   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "reference",
      descriptor = "Ljaclib/peer/PeerReference;"
   )
   protected PeerReference reference;

   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "a",
      descriptor = "()J",
      line = 5
   )
   protected long method3822() {
      return this.reference.method5102(64);
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 11
   )
   public static Class method5098(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   static {
      init(field10240 == null ? (field10240 = method5098(method5100(method5099("0 b\u001aC8oq\u0013O(oQ\u0013O(\u0013d\u0010O($o\u0015O")))) : field10240);
   }

   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "a",
      descriptor = "(Z)Z",
      line = 17
   )
   public final boolean method5097(boolean arg0) {
      return arg0 ? true : this.reference.method5101(0);
   }

   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "<init>",
      descriptor = "()V",
      line = 25
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
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5099(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5100(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 1;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
