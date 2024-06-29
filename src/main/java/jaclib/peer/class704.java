package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/qd")
public class class704 {

    @OriginalMember(owner = "client!jaclib/peer/qd", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field10109 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/qd", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field10110;

    @OriginalMember(owner = "client!jaclib/peer/qd", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field10111;

    @OriginalMember(owner = "client!jaclib/peer/qd", name = "b", descriptor = "(Ljaclib/peer/PeerReference;B)V")
    private final void method5118(PeerReference arg0, byte arg1) {
        arg0.method5116(0);
        if (this.field10110 == arg0) {
            this.field10110 = arg0.field10108;
        }
        if (this.field10111 == arg0) {
            this.field10111 = arg0.field10107;
        }
        if (arg0.field10108 != null) {
            arg0.field10108.field10107 = arg0.field10107;
        }
        if (arg0.field10107 != null) {
            arg0.field10107.field10108 = arg0.field10108;
        }
        if (arg1 != 85) {
            this.field10109 = null;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/qd", name = "c", descriptor = "(I)V")
    private final void method5119(int arg0) {
        if (arg0 != 7823) {
            this.field10109 = null;
        }
        while (true) {
            Reference var2 = this.field10109.poll();
            if (var2 == null) {
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method5118(var3, (byte) 85);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/qd", name = "a", descriptor = "(I)V")
    public final void method5120(int arg0) {
        this.method5119(7823);
        while (this.field10111 != null) {
            this.method5118(this.field10111, (byte) 85);
        }
        if (arg0 < 14) {
            this.method5119(86);
        }
        this.method5119(7823);
    }

    @OriginalMember(owner = "client!jaclib/peer/qd", name = "b", descriptor = "(I)V")
    public final void method5121(int arg0) {
        this.method5119(7823);
        if (arg0 > -93) {
            this.field10110 = null;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/qd", name = "a", descriptor = "(Ljaclib/peer/PeerReference;B)V")
    public final void method5122(PeerReference arg0, byte arg1) {
        arg0.field10108 = null;
        arg0.field10107 = this.field10111;
        if (this.field10110 == null) {
            this.field10110 = arg0;
        } else {
            this.field10111.field10108 = arg0;
        }
        this.field10111 = arg0;
        if (arg1 < 28) {
            this.method5122(null, (byte) 14);
        }
    }
}
