package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/er")
public class class420 {

    @OriginalMember(owner = "client!jaclib/peer/er", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field5837 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/er", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field5835;

    @OriginalMember(owner = "client!jaclib/peer/er", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field5836;

    @OriginalMember(owner = "client!jaclib/peer/er", name = "a", descriptor = "(B)V", line = 7)
    private final void method2568(byte arg0) {
        int var2 = -40 % ((arg0 - 19) / 49);
        while (true) {
            Reference var3 = this.field5837.poll();
            if (var3 == null) {
                return;
            }
            PeerReference var4 = (PeerReference) var3;
            this.method2570(var4, -14535);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/er", name = "a", descriptor = "(Ljaclib/peer/PeerReference;I)V", line = 28)
    public final void method2569(PeerReference arg0, int arg1) {
        arg0.field5832 = null;
        arg0.field5833 = this.field5835;
        if (arg1 != 24234) {
            this.method2572(true);
        }
        if (this.field5836 == null) {
            this.field5836 = arg0;
        } else {
            this.field5835.field5832 = arg0;
        }
        this.field5835 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/peer/er", name = "b", descriptor = "(Ljaclib/peer/PeerReference;I)V", line = 45)
    private final void method2570(PeerReference arg0, int arg1) {
        if (arg1 != -14535) {
            return;
        }
        arg0.method2564(true);
        if (this.field5836 == arg0) {
            this.field5836 = arg0.field5832;
        }
        if (this.field5835 == arg0) {
            this.field5835 = arg0.field5833;
        }
        if (arg0.field5832 != null) {
            arg0.field5832.field5833 = arg0.field5833;
        }
        if (arg0.field5833 != null) {
            arg0.field5833.field5832 = arg0.field5832;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/er", name = "b", descriptor = "(B)V", line = 77)
    public final void method2571(byte arg0) {
        this.method2568((byte) -35);
        if (arg0 != -78) {
            this.method2572(false);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/er", name = "a", descriptor = "(Z)V", line = 88)
    public final void method2572(boolean arg0) {
        this.method2568((byte) -111);
        while (this.field5835 != null) {
            this.method2570(this.field5835, -14535);
        }
        this.method2568((byte) -110);
        if (!arg0) {
            this.field5836 = null;
        }
    }
}
