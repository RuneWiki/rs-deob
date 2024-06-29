package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/ku")
public class class360 {

    @OriginalMember(owner = "client!jaclib/peer/ku", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field5123 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/ku", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field5122;

    @OriginalMember(owner = "client!jaclib/peer/ku", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field5124;

    @OriginalMember(owner = "client!jaclib/peer/ku", name = "a", descriptor = "(BLjaclib/peer/PeerReference;)V")
    public final void method2206(byte arg0, PeerReference arg1) {
        arg1.field5126 = null;
        if (arg0 != -111) {
            this.method2210(null, -111);
        }
        arg1.field5127 = this.field5124;
        if (this.field5122 == null) {
            this.field5122 = arg1;
        } else {
            this.field5124.field5126 = arg1;
        }
        this.field5124 = arg1;
    }

    @OriginalMember(owner = "client!jaclib/peer/ku", name = "a", descriptor = "(Z)V")
    private final void method2207(boolean arg0) {
        while (true) {
            Reference var2 = this.field5123.poll();
            if (var2 == null) {
                if (arg0) {
                    this.method2207(true);
                }
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method2210(var3, 14090);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/ku", name = "a", descriptor = "(I)V")
    public final void method2208(int arg0) {
        if (arg0 != 21348) {
            this.method2210(null, 6);
        }
        this.method2207(false);
    }

    @OriginalMember(owner = "client!jaclib/peer/ku", name = "a", descriptor = "(B)V")
    public final void method2209(byte arg0) {
        this.method2207(false);
        while (this.field5124 != null) {
            this.method2210(this.field5124, 14090);
        }
        this.method2207(false);
        int var2 = 83 / ((68 - arg0) / 34);
    }

    @OriginalMember(owner = "client!jaclib/peer/ku", name = "a", descriptor = "(Ljaclib/peer/PeerReference;I)V")
    private final void method2210(PeerReference arg0, int arg1) {
        arg0.method2215(false);
        if (this.field5124 == arg0) {
            this.field5124 = arg0.field5127;
        }
        if (this.field5122 == arg0) {
            this.field5122 = arg0.field5126;
        }
        if (arg0.field5126 != null) {
            arg0.field5126.field5127 = arg0.field5127;
        }
        if (arg0.field5127 != null) {
            arg0.field5127.field5126 = arg0.field5126;
        }
        if (arg1 != 14090) {
            this.method2206((byte) -8, null);
        }
    }
}
