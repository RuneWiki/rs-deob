package jaclib.peer;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/IUnknown")
public class IUnknown extends Peer {

    @OriginalMember(owner = "client!jaclib/peer/IUnknown", name = "b", descriptor = "(I)J", line = 6)
    public final long method3355(int arg0) {
        return arg0 == -11385 ? super.method2340() : -42L;
    }

    @OriginalMember(owner = "client!jaclib/peer/IUnknown", name = "<init>", descriptor = "(Ljaclib/peer/pe;)V", line = 14)
    protected IUnknown(class576 arg0) {
        this.reference = new IUnknownReference(this, arg0);
    }

    @OriginalMember(owner = "client!jaclib/peer/IUnknown", name = "AddRef", descriptor = "()J")
    public final native long AddRef();
}
