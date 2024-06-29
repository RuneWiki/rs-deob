package jaclib.peer;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/Peer")
public abstract class Peer {

    // $FF: synthetic field
    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "Ljava/lang/Class;")
    public static Class field8781;

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "reference", descriptor = "Ljaclib/peer/PeerReference;")
    protected PeerReference reference;

    // $FF: synthetic method
    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 4)
    public static Class method3482(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        init(field8781 == null ? (field8781 = method3482("jaclib.peer.PeerReference")) : field8781);
    }

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "(I)Z", line = 9)
    public final boolean method3481(int arg0) {
        return arg0 == 28436 ? this.reference.method3485(arg0 - 28436) : true;
    }

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "<init>", descriptor = "()V", line = 18)
    protected Peer() {
    }

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "()J", line = 22)
    protected long method2509() {
        return this.reference.method3484(0);
    }

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "init", descriptor = "(Ljava/lang/Class;)V")
    private static final native void init(Class arg0);
}
