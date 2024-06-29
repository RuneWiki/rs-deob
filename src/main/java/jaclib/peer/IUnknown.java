package jaclib.peer;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/IUnknown")
public class IUnknown extends Peer {

    @OriginalMember(owner = "client!jaclib/peer/IUnknown", name = "AddRef", descriptor = "()J")
    public final native long AddRef();

    @OriginalMember(owner = "client!jaclib/peer/IUnknown", name = "b", descriptor = "(B)J")
    public final long method2063(byte arg0) {
        int var2 = 8 / ((arg0 + 36) / 34);
        return super.method2065();
    }

    @OriginalMember(owner = "client!jaclib/peer/IUnknown", name = "<init>", descriptor = "(Ljaclib/peer/wl;)V")
    protected IUnknown(class336 arg0) {
        this.reference = new IUnknownReference(this, arg0);
    }
}
