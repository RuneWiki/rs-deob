package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/hk")
public class class699 {

    @OriginalMember(owner = "client!jaclib/peer/hk", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field9270 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/hk", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9269;

    @OriginalMember(owner = "client!jaclib/peer/hk", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9271;

    @OriginalMember(owner = "client!jaclib/peer/hk", name = "a", descriptor = "(Ljaclib/peer/PeerReference;I)V", line = 7)
    public final void method3811(PeerReference arg0, int arg1) {
        arg0.field9273 = null;
        arg0.field9274 = this.field9269;
        if (arg1 != 30072) {
            this.field9269 = null;
        }
        if (this.field9271 == null) {
            this.field9271 = arg0;
        } else {
            this.field9269.field9273 = arg0;
        }
        this.field9269 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/peer/hk", name = "a", descriptor = "(I)V", line = 24)
    public final void method3812(int arg0) {
        this.method3814(arg0 - 53781);
        while (this.field9269 != null) {
            this.method3815(-6, this.field9269);
        }
        this.method3814(-27171);
        if (arg0 != 26610) {
            this.method3814(47);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/hk", name = "a", descriptor = "(B)V", line = 38)
    public final void method3813(byte arg0) {
        if (arg0 == 95) {
            this.method3814(-27171);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/hk", name = "b", descriptor = "(I)V", line = 50)
    private final void method3814(int arg0) {
        if (arg0 != -27171) {
            return;
        }
        while (true) {
            Reference var2 = this.field9270.poll();
            if (var2 == null) {
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3815(-127, var3);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/hk", name = "a", descriptor = "(ILjaclib/peer/PeerReference;)V", line = 72)
    private final void method3815(int arg0, PeerReference arg1) {
        int var3 = -4 / ((-arg0 - 76) / 43);
        arg1.method3818(0);
        if (this.field9271 == arg1) {
            this.field9271 = arg1.field9273;
        }
        if (this.field9269 == arg1) {
            this.field9269 = arg1.field9274;
        }
        if (arg1.field9273 != null) {
            arg1.field9273.field9274 = arg1.field9274;
        }
        if (arg1.field9274 != null) {
            arg1.field9274.field9273 = arg1.field9273;
        }
    }
}
