package jaclib.peer;

import java.lang.ref.WeakReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/PeerReference")
public abstract class PeerReference extends WeakReference {

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "peer", descriptor = "J")
    private long peer;

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    public PeerReference field9437;

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    public PeerReference field9438;

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "(B)Z", line = 5)
    public final boolean method3807(byte arg0) {
        if (arg0 != 62) {
            this.setPeer(12L);
        }
        return this.peer != 0L;
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "b", descriptor = "(B)J", line = 16)
    public final long method3808(byte arg0) {
        if (arg0 < 58) {
            this.setPeer(105L);
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

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "setPeer", descriptor = "(J)V", line = 36)
    public final void setPeer(long arg0) {
        this.method3808((byte) 85);
        this.peer = arg0;
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "<init>", descriptor = "(Ljaclib/peer/Peer;Ljaclib/peer/gca;)V", line = 43)
    public PeerReference(Peer arg0, class674 arg1) {
        super(arg0, arg1.field9433);
        arg1.method3800(true, this);
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "releasePeer", descriptor = "(J)J")
    protected abstract long releasePeer(long arg0);
}
