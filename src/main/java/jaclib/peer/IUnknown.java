package jaclib.peer;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/IUnknown")
public class IUnknown extends Peer {

    @OriginalMember(owner = "client!jaclib/peer/IUnknown", name = "a", descriptor = "(B)J")
    public final long method3883(byte arg0) {
        return arg0 <= 66 ? 100L : super.method2919();
    }

    @OriginalMember(owner = "client!jaclib/peer/IUnknown", name = "AddRef", descriptor = "()J")
    public final native long AddRef();

    @OriginalMember(owner = "client!jaclib/peer/IUnknown", name = "<init>", descriptor = "(Ljaclib/peer/qr;)V")
    protected IUnknown(class674 arg0) {
        this.reference = new IUnknownReference(this, arg0);
    }
}
