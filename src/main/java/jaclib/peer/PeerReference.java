package jaclib.peer;

import java.lang.ref.WeakReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/PeerReference")
public abstract class PeerReference extends WeakReference {

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "peer", descriptor = "J")
    private long peer;

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    public PeerReference field5832;

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    public PeerReference field5833;

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "setPeer", descriptor = "(J)V", line = 5)
    public final void setPeer(long arg0) {
        this.method2564(true);
        this.peer = arg0;
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "<init>", descriptor = "(Ljaclib/peer/Peer;Ljaclib/peer/er;)V", line = 13)
    public PeerReference(Peer arg0, class420 arg1) {
        super(arg0, arg1.field5837);
        arg1.method2569(this, 24234);
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "(B)Z", line = 22)
    public final boolean method2563(byte arg0) {
        if (arg0 > -77) {
            return false;
        } else {
            return this.peer != 0L;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "(Z)J", line = 35)
    public final long method2564(boolean arg0) {
        long var2;
        if (this.peer == 0L) {
            var2 = 0L;
        } else {
            var2 = this.releasePeer(this.peer);
            this.peer = 0L;
        }
        return arg0 ? var2 : -12L;
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "releasePeer", descriptor = "(J)J")
    protected abstract long releasePeer(long arg0);
}
