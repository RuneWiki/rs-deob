package jaclib.peer;

import java.lang.ref.WeakReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/PeerReference")
public abstract class PeerReference extends WeakReference {

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "peer", descriptor = "J")
    private long peer;

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    public PeerReference field5264;

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    public PeerReference field5265;

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "<init>", descriptor = "(Ljaclib/peer/Peer;Ljaclib/peer/mk;)V", line = 7)
    public PeerReference(Peer arg0, class375 arg1) {
        super(arg0, arg1.field5260);
        arg1.method2235(this, -95);
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "(B)Z", line = 16)
    public final boolean method2243(byte arg0) {
        if (arg0 == 6) {
            return this.peer != 0L;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "setPeer", descriptor = "(J)V", line = 27)
    public final void setPeer(long arg0) {
        this.method2244(-124);
        this.peer = arg0;
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "a", descriptor = "(I)J", line = 36)
    public final long method2244(int arg0) {
        int var2 = -25 / ((arg0 + 74) / 47);
        long var3;
        if (this.peer == 0L) {
            var3 = 0L;
        } else {
            var3 = this.releasePeer(this.peer);
            this.peer = 0L;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jaclib/peer/PeerReference", name = "releasePeer", descriptor = "(J)J")
    protected abstract long releasePeer(long arg0);
}
