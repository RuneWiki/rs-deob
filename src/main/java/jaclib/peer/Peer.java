package jaclib.peer;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/Peer")
public abstract class Peer {

    // $FF: synthetic field
    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "Ljava/lang/Class;")
    public static Class field9398;

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "reference", descriptor = "Ljaclib/peer/PeerReference;")
    protected PeerReference reference;

    // $FF: synthetic method
    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 4)
    public static Class method3783(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        init(field9398 == null ? (field9398 = method3783("jaclib.peer.PeerReference")) : field9398);
    }

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "(I)Z", line = 9)
    public final boolean method3782(int arg0) {
        if (arg0 != 32422) {
            init(null);
        }
        return this.reference.method3784(-5316);
    }

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "<init>", descriptor = "()V", line = 18)
    protected Peer() {
    }

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "()J", line = 22)
    protected long method2906() {
        return this.reference.method3785(true);
    }

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "init", descriptor = "(Ljava/lang/Class;)V")
    private static final native void init(Class arg0);
}
