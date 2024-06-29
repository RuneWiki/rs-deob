package jaclib.peer;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/Peer")
public abstract class Peer {

    // $FF: synthetic field
    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "Ljava/lang/Class;")
    public static Class field10189;

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "reference", descriptor = "Ljaclib/peer/PeerReference;")
    protected PeerReference reference;

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "<init>", descriptor = "()V")
    protected Peer() {
    }

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "(Z)Z")
    public final boolean method5115(boolean arg0) {
        return arg0 ? this.reference.method5119((byte) 92) : true;
    }

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "()J")
    protected long method3848() {
        return this.reference.method5120((byte) -124);
    }

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "init", descriptor = "(Ljava/lang/Class;)V")
    private static final native void init(Class arg0);

    // $FF: synthetic method
    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method5116(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        init(field10189 == null ? (field10189 = method5116(method5118(method5117("|85\u0001Ltw&\b@dw\u0006\b@d\u000b3\u000b@d<8\u000e@")))) : field10189);
    }

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5117(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x25);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5118(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 22;
                    break;
                case 1:
                    var10005 = 89;
                    break;
                case 2:
                    var10005 = 86;
                    break;
                case 3:
                    var10005 = 109;
                    break;
                default:
                    var10005 = 37;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
