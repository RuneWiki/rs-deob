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
   public static Class field5963;
   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "reference",
      descriptor = "Ljaclib/peer/PeerReference;"
   )
   protected PeerReference reference;

   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "a",
      descriptor = "()J"
   )
   protected long method3133() {
      return this.reference.method3159(-117);
   }

   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "init",
      descriptor = "(Ljava/lang/Class;)V"
   )
   private static final native void init(Class arg0);

   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "<init>",
      descriptor = "()V"
   )
   protected Peer() {
   }

   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method3160(boolean arg0) {
      if (!arg0) {
         this.method3160(true);
      }

      return this.reference.method3158(false);
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method3161(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   static {
      init(field5963 == null ? (field5963 = method3161(method3163(method3162("\u0002xY\u001cl\n7J\u0015`\u001a7j\u0015`\u001aK_\u0016`\u001a|T\u0013`")))) : field5963);
   }

   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3162(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jaclib/peer/Peer",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3163(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
