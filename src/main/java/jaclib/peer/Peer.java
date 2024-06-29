package jaclib.peer;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/Peer")
public abstract class Peer {

    // $FF: synthetic field
    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "Ljava/lang/Class;")
    public static Class field8411;

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "reference", descriptor = "Ljaclib/peer/PeerReference;")
    protected PeerReference reference;

    // $FF: synthetic method
    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 4)
    public static Class method3352(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        init(field8411 == null ? (field8411 = method3352("jaclib.peer.PeerReference")) : field8411);
    }

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "()J", line = 8)
    protected long method2340() {
        return this.reference.method3353(0);
    }

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "<init>", descriptor = "()V", line = 14)
    protected Peer() {
    }

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "(I)Z", line = 19)
    public final boolean method3351(int arg0) {
        return arg0 == 20969 ? this.reference.method3354(106) : true;
    }

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "init", descriptor = "(Ljava/lang/Class;)V")
    private static final native void init(Class arg0);
}
