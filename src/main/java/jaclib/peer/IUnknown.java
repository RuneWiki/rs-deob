package jaclib.peer;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/IUnknown")
public class IUnknown extends Peer {

    @OriginalMember(owner = "client!jaclib/peer/IUnknown", name = "b", descriptor = "(I)J", line = 6)
    public final long method2211(int arg0) {
        int var2 = -50 % ((90 - arg0) / 33);
        return super.method2212();
    }

    @OriginalMember(owner = "client!jaclib/peer/IUnknown", name = "<init>", descriptor = "(Ljaclib/peer/ku;)V", line = 13)
    protected IUnknown(class360 arg0) {
        this.reference = new IUnknownReference(this, arg0);
    }

    @OriginalMember(owner = "client!jaclib/peer/IUnknown", name = "AddRef", descriptor = "()J")
    public final native long AddRef();
}
