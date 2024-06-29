package jaclib.peer;

import java.lang.ref.WeakReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/PeerReference")
public abstract class PeerReference extends WeakReference {

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "peer", descriptor = "J")
    private long peer;

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    public PeerReference field5784;

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    public PeerReference field5785;

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method2536(int arg0) {
        if (arg0 != 0) {
            this.field5785 = null;
        }
        return this.peer != 0L;
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "<init>", descriptor = "(Ljaclib/peer/Peer;Ljaclib/peer/iw;)V", line = 14)
    public PeerReference(Peer arg0, class441 arg1) {
        super(arg0, arg1.field5788);
        arg1.method2545(this, (byte) -88);
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "setPeer", descriptor = "(J)V", line = 23)
    public final void setPeer(long arg0) {
        this.method2537(-128);
        this.peer = arg0;
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "b", descriptor = "(I)J", line = 35)
    public final long method2537(int arg0) {
        long var2;
        if (this.peer == 0L) {
            var2 = 0L;
        } else {
            var2 = this.releasePeer(this.peer);
            this.peer = 0L;
        }
        if (arg0 >= -106) {
            this.releasePeer(56L);
        }
        return var2;
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "releasePeer", descriptor = "(J)J")
    protected abstract long releasePeer(long arg0);
}
