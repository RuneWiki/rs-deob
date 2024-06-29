package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/k")
public class class419 {

    @OriginalMember(owner = "client!jaclib/peer/k", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field6168 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/k", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field6167;

    @OriginalMember(owner = "client!jaclib/peer/k", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field6169;

    @OriginalMember(owner = "client!jaclib/peer/k", name = "a", descriptor = "(I)V")
    public final void method2594(int arg0) {
        this.method2598(127);
        if (arg0 != 12002) {
            this.method2598(-42);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/k", name = "a", descriptor = "(Ljaclib/peer/PeerReference;Z)V")
    public final void method2595(PeerReference arg0, boolean arg1) {
        arg0.field6171 = this.field6169;
        arg0.field6170 = null;
        if (!arg1) {
            this.method2595(null, true);
        }
        if (this.field6167 == null) {
            this.field6167 = arg0;
        } else {
            this.field6169.field6170 = arg0;
        }
        this.field6169 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/peer/k", name = "b", descriptor = "(I)V")
    public final void method2596(int arg0) {
        this.method2598(-107);
        while (this.field6169 != null) {
            this.method2597(true, this.field6169);
        }
        if (arg0 != 408) {
            this.field6169 = null;
        }
        this.method2598(124);
    }

    @OriginalMember(owner = "client!jaclib/peer/k", name = "a", descriptor = "(ZLjaclib/peer/PeerReference;)V")
    private final void method2597(boolean arg0, PeerReference arg1) {
        arg1.method2599(!arg0);
        if (this.field6167 == arg1) {
            this.field6167 = arg1.field6170;
        }
        if (this.field6169 == arg1) {
            this.field6169 = arg1.field6171;
        }
        if (!arg0) {
            this.method2597(true, null);
        }
        if (arg1.field6170 != null) {
            arg1.field6170.field6171 = arg1.field6171;
        }
        if (arg1.field6171 != null) {
            arg1.field6171.field6170 = arg1.field6170;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/k", name = "c", descriptor = "(I)V")
    private final void method2598(int arg0) {
        int var2 = -23 / ((60 - arg0) / 63);
        while (true) {
            Reference var3 = this.field6168.poll();
            if (var3 == null) {
                return;
            }
            PeerReference var4 = (PeerReference) var3;
            this.method2597(true, var4);
        }
    }
}
