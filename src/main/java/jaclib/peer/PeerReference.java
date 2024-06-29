package jaclib.peer;

import java.lang.ref.WeakReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/PeerReference")
public abstract class PeerReference extends WeakReference {

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "peer", descriptor = "J")
    private long peer;

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    public PeerReference field9341;

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    public PeerReference field9342;

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "(I)J")
    public final long method3799(int arg0) {
        if (arg0 != 0) {
            this.setPeer(26L);
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

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "<init>", descriptor = "(Ljaclib/peer/Peer;Ljaclib/peer/jaa;)V")
    public PeerReference(Peer arg0, class672 arg1) {
        super(arg0, arg1.field9343);
        arg1.method3805(this, -31112);
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "setPeer", descriptor = "(J)V")
    public final void setPeer(long arg0) {
        this.method3799(0);
        this.peer = arg0;
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "b", descriptor = "(I)Z")
    public final boolean method3800(int arg0) {
        if (arg0 >= -108) {
            this.field9342 = null;
        }
        return this.peer != 0L;
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "releasePeer", descriptor = "(J)J")
    protected abstract long releasePeer(long arg0);
}
