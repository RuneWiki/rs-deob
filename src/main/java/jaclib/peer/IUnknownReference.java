package jaclib.peer;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/IUnknownReference")
public class IUnknownReference extends PeerReference {

    @OriginalMember(owner = "client!jaclib/peer/IUnknownReference", name = "<init>", descriptor = "(Ljaclib/peer/IUnknown;Ljaclib/peer/hr;)V", line = 5)
    public IUnknownReference(IUnknown arg0, class615 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jaclib/peer/IUnknownReference", name = "releasePeer", descriptor = "(J)J")
    protected final native long releasePeer(long arg0);
}
