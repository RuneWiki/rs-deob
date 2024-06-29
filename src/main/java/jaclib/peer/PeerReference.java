package jaclib.peer;

import java.lang.ref.WeakReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/PeerReference")
public abstract class PeerReference extends WeakReference {

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "peer", descriptor = "J")
    private long peer;

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    public PeerReference field8505;

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    public PeerReference field8506;

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "(I)J")
    public final long method3492(int arg0) {
        if (arg0 >= 0) {
            return 26L;
        }
        long var2;
        if (this.peer == 0L) {
            var2 = 0L;
        } else {
            var2 = this.releasePeer(this.peer);
            this.peer = 0L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "setPeer", descriptor = "(J)V")
    public final void setPeer(long arg0) {
        this.method3492(-14);
        this.peer = arg0;
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "(Z)Z")
    public final boolean method3493(boolean arg0) {
        if (arg0) {
            return this.peer != 0L;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "<init>", descriptor = "(Ljaclib/peer/Peer;Ljaclib/peer/bea;)V")
    public PeerReference(Peer arg0, class630 arg1) {
        super(arg0, arg1.field8503);
        arg1.method3487(true, this);
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "releasePeer", descriptor = "(J)J")
    protected abstract long releasePeer(long arg0);
}
