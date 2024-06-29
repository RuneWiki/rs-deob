package jaclib.peer;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/IUnknown")
public class IUnknown extends Peer {

    @OriginalMember(owner = "client!jaclib/peer/IUnknown", name = "<init>", descriptor = "(Ljaclib/peer/hb;)V")
    protected IUnknown(class673 arg0) {
        this.reference = new IUnknownReference(this, arg0);
    }

    @OriginalMember(owner = "client!jaclib/peer/IUnknown", name = "AddRef", descriptor = "()J")
    public final native long AddRef();

    @OriginalMember(owner = "client!jaclib/peer/IUnknown", name = "a", descriptor = "(I)J")
    public final long method3799(int arg0) {
        if (arg0 != 9275) {
            this.method3799(-95);
        }
        return super.method2857();
    }
}
