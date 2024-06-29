package jaclib.peer;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/IUnknown")
public class IUnknown extends Peer {

    @OriginalMember(owner = "client!jaclib/peer/IUnknown", name = "AddRef", descriptor = "()J")
    public final native long AddRef();

    @OriginalMember(owner = "client!jaclib/peer/IUnknown", name = "a", descriptor = "(B)J")
    public final long method3306(byte arg0) {
        int var2 = 89 / ((86 - arg0) / 37);
        return super.method2447();
    }

    @OriginalMember(owner = "client!jaclib/peer/IUnknown", name = "<init>", descriptor = "(Ljaclib/peer/fk;)V")
    protected IUnknown(class578 arg0) {
        this.reference = new IUnknownReference(this, arg0);
    }
}
