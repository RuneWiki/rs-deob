package jaclib.peer;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/NativeHeapPeerReference")
public class NativeHeapPeerReference extends PeerReference {

    @OriginalMember(owner = "client!jaclib/peer/NativeHeapPeerReference", name = "releasePeer", descriptor = "(J)J")
    protected final native long releasePeer(long arg0);

    @OriginalMember(owner = "client!jaclib/peer/NativeHeapPeerReference", name = "<init>", descriptor = "(Ljaclib/peer/gga;Ljaclib/peer/ku;)V")
    public NativeHeapPeerReference(class361 arg0, class360 arg1) {
        super(arg0, arg1);
    }
}
