package jaclib.peer;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/Peer")
public abstract class Peer {

    // $FF: synthetic field
    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "Ljava/lang/Class;")
    public static Class field9856;

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "reference", descriptor = "Ljaclib/peer/PeerReference;")
    protected PeerReference reference;

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "init", descriptor = "(Ljava/lang/Class;)V")
    private static final native void init(Class arg0);

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "<init>", descriptor = "()V")
    protected Peer() {
    }

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "(B)Z")
    public final boolean method3932(byte arg0) {
        if (arg0 != -91) {
            this.method2981();
        }
        return this.reference.method3935(-70);
    }

    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "()J")
    protected long method2981() {
        return this.reference.method3934(2450);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!jaclib/peer/Peer", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3933(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        init(field9856 == null ? (field9856 = method3933("jaclib.peer.PeerReference")) : field9856);
    }
}
