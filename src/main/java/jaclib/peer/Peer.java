package jaclib.peer;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/Peer")
public abstract class Peer {

    // $FF: synthetic field
    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "Ljava/lang/Class;")
    public static Class field9347;

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "reference", descriptor = "Ljaclib/peer/PeerReference;")
    protected PeerReference reference;

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "(I)Z", line = 6)
    public final boolean method3748(int arg0) {
        if (arg0 > -73) {
            init(null);
        }
        return this.reference.method3750((byte) -54);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 15)
    public static Class method3749(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        init(field9347 == null ? (field9347 = method3749("jaclib.peer.PeerReference")) : field9347);
    }

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "()J", line = 19)
    protected long method2769() {
        return this.reference.method3751(0);
    }

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "<init>", descriptor = "()V", line = 25)
    protected Peer() {
    }

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "init", descriptor = "(Ljava/lang/Class;)V")
    private static final native void init(Class arg0);
}
