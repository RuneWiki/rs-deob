package jaclib.peer;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/IUnknown")
public class IUnknown extends Peer {

    @OriginalMember(owner = "client!jaclib/peer/IUnknown", name = "a", descriptor = "(Z)J")
    public final long method3176(boolean arg0) {
        if (!arg0) {
            this.method3176(false);
        }
        return super.method3145();
    }

    @OriginalMember(owner = "client!jaclib/peer/IUnknown", name = "AddRef", descriptor = "()J")
    public final native long AddRef();

    @OriginalMember(owner = "client!jaclib/peer/IUnknown", name = "<init>", descriptor = "(Ljaclib/peer/io;)V")
    protected IUnknown(class406 arg0) {
        this.reference = new IUnknownReference(this, arg0);
    }
}
