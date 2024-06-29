package jaclib.peer;

import java.lang.ref.WeakReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/PeerReference")
public abstract class PeerReference extends WeakReference {

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "peer", descriptor = "J")
    private long peer;

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    public PeerReference field8132;

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    public PeerReference field8133;

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "(Z)Z", line = 5)
    public final boolean method3259(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            return this.peer != 0L;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "setPeer", descriptor = "(J)V", line = 16)
    public final void setPeer(long arg0) {
        this.method3260(71);
        this.peer = arg0;
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "<init>", descriptor = "(Ljaclib/peer/Peer;Ljaclib/peer/wn;)V", line = 26)
    public PeerReference(Peer arg0, class569 arg1) {
        super(arg0, arg1.field8128);
        arg1.method3252(this, 18734);
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "(I)J", line = 35)
    public final long method3260(int arg0) {
        if (arg0 < 47) {
            this.releasePeer(-39L);
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

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "releasePeer", descriptor = "(J)J")
    protected abstract long releasePeer(long arg0);
}
