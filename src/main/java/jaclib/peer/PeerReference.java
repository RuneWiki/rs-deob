package jaclib.peer;

import java.lang.ref.WeakReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/PeerReference")
public abstract class PeerReference extends WeakReference {

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "peer", descriptor = "J")
    private long peer;

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    public PeerReference field4889;

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    public PeerReference field4890;

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "releasePeer", descriptor = "(J)J")
    protected abstract long releasePeer(long arg0);

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "<init>", descriptor = "(Ljaclib/peer/Peer;Ljaclib/peer/wl;)V")
    public PeerReference(Peer arg0, class336 arg1) {
        super(arg0, arg1.field4887);
        arg1.method2062(-26734, this);
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "(B)J")
    public final long method2067(byte arg0) {
        int var2 = -60 % ((arg0 + 51) / 57);
        long var3;
        if (this.peer == 0L) {
            var3 = 0L;
        } else {
            var3 = this.releasePeer(this.peer);
            this.peer = 0L;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "(Z)Z")
    public final boolean method2068(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            return this.peer != 0L;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "setPeer", descriptor = "(J)V")
    public final void setPeer(long arg0) {
        this.method2067((byte) -125);
        this.peer = arg0;
    }
}
