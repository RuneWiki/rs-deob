package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/qr")
public class class674 {

    @OriginalMember(owner = "client!jaclib/peer/qr", name = "a", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field9403 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/qr", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9404;

    @OriginalMember(owner = "client!jaclib/peer/qr", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9405;

    @OriginalMember(owner = "client!jaclib/peer/qr", name = "a", descriptor = "(Ljaclib/peer/PeerReference;B)V")
    public final void method3874(PeerReference arg0, byte arg1) {
        if (arg1 <= 120) {
            this.method3875(null, 2);
        }
        arg0.field9408 = null;
        arg0.field9407 = this.field9404;
        if (this.field9405 == null) {
            this.field9405 = arg0;
        } else {
            this.field9404.field9408 = arg0;
        }
        this.field9404 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/peer/qr", name = "a", descriptor = "(Ljaclib/peer/PeerReference;I)V")
    private final void method3875(PeerReference arg0, int arg1) {
        arg0.method3881(false);
        if (this.field9404 == arg0) {
            this.field9404 = arg0.field9407;
        }
        if (this.field9405 == arg0) {
            this.field9405 = arg0.field9408;
        }
        if (arg0.field9408 != null) {
            arg0.field9408.field9407 = arg0.field9407;
        }
        int var3 = -11 % ((-arg1 - 87) / 39);
        if (arg0.field9407 != null) {
            arg0.field9407.field9408 = arg0.field9408;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/qr", name = "a", descriptor = "(I)V")
    public final void method3876(int arg0) {
        if (arg0 == -17898) {
            this.method3877(arg0 + 2418);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/qr", name = "b", descriptor = "(I)V")
    private final void method3877(int arg0) {
        if (arg0 != -15480) {
            return;
        }
        while (true) {
            Reference var2 = this.field9403.poll();
            if (var2 == null) {
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3875(var3, arg0 + 15579);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/qr", name = "c", descriptor = "(I)V")
    public final void method3878(int arg0) {
        if (arg0 != 28501) {
            return;
        }
        this.method3877(arg0 - 43981);
        while (this.field9404 != null) {
            this.method3875(this.field9404, -128);
        }
        this.method3877(-15480);
    }
}
