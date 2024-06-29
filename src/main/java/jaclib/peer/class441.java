package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/iw")
public class class441 {

    @OriginalMember(owner = "client!jaclib/peer/iw", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field5788 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/iw", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field5787;

    @OriginalMember(owner = "client!jaclib/peer/iw", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field5789;

    @OriginalMember(owner = "client!jaclib/peer/iw", name = "a", descriptor = "(I)V", line = 8)
    private final void method2541(int arg0) {
        while (true) {
            Reference var2 = this.field5788.poll();
            if (var2 == null) {
                if (arg0 != -2698) {
                    this.field5788 = null;
                }
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method2542(var3, 760);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/iw", name = "a", descriptor = "(Ljaclib/peer/PeerReference;I)V", line = 29)
    private final void method2542(PeerReference arg0, int arg1) {
        arg0.method2537(-121);
        if (this.field5789 == arg0) {
            this.field5789 = arg0.field5785;
        }
        if (arg1 != 760) {
            this.method2543(4);
        }
        if (this.field5787 == arg0) {
            this.field5787 = arg0.field5784;
        }
        if (arg0.field5784 != null) {
            arg0.field5784.field5785 = arg0.field5785;
        }
        if (arg0.field5785 != null) {
            arg0.field5785.field5784 = arg0.field5784;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/iw", name = "b", descriptor = "(I)V", line = 55)
    public final void method2543(int arg0) {
        this.method2541(-2698);
        while (this.field5789 != null) {
            this.method2542(this.field5789, 760);
        }
        this.method2541(-2698);
        if (arg0 > -47) {
            this.field5787 = null;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/iw", name = "c", descriptor = "(I)V", line = 69)
    public final void method2544(int arg0) {
        this.method2541(-2698);
        if (arg0 != 9592) {
            this.field5787 = null;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/iw", name = "a", descriptor = "(Ljaclib/peer/PeerReference;B)V", line = 84)
    public final void method2545(PeerReference arg0, byte arg1) {
        arg0.field5784 = null;
        arg0.field5785 = this.field5789;
        if (this.field5787 == null) {
            this.field5787 = arg0;
        } else {
            this.field5789.field5784 = arg0;
        }
        this.field5789 = arg0;
        if (arg1 != -88) {
            this.field5787 = null;
        }
    }
}
