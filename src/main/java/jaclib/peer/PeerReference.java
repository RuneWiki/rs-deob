package jaclib.peer;

import java.lang.ref.WeakReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/PeerReference")
public abstract class PeerReference extends WeakReference {

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "peer", descriptor = "J")
    private long peer;

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    public PeerReference field9348;

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    public PeerReference field9349;

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "<init>", descriptor = "(Ljaclib/peer/Peer;Ljaclib/peer/uca;)V", line = 4)
    public PeerReference(Peer arg0, class674 arg1) {
        super(arg0, arg1.field9351);
        arg1.method3755((byte) 119, this);
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "(B)Z", line = 15)
    public final boolean method3750(byte arg0) {
        if (arg0 != -54) {
            this.peer = 113L;
        }
        return this.peer != 0L;
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "(I)J", line = 27)
    public final long method3751(int arg0) {
        if (arg0 != 0) {
            this.method3751(-96);
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

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "setPeer", descriptor = "(J)V", line = 46)
    public final void setPeer(long arg0) {
        this.method3751(0);
        this.peer = arg0;
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "releasePeer", descriptor = "(J)J")
    protected abstract long releasePeer(long arg0);
}
