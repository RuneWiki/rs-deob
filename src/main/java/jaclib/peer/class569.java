package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/wn")
public class class569 {

    @OriginalMember(owner = "client!jaclib/peer/wn", name = "a", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field8128 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/wn", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8129;

    @OriginalMember(owner = "client!jaclib/peer/wn", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8130;

    @OriginalMember(owner = "client!jaclib/peer/wn", name = "a", descriptor = "(Z)V", line = 5)
    public final void method3251(boolean arg0) {
        this.method3254(22009);
        while (this.field8129 != null) {
            this.method3255(true, this.field8129);
        }
        this.method3254(22009);
        if (arg0) {
            this.method3251(false);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/wn", name = "a", descriptor = "(Ljaclib/peer/PeerReference;I)V", line = 19)
    public final void method3252(PeerReference arg0, int arg1) {
        arg0.field8132 = null;
        arg0.field8133 = this.field8129;
        if (this.field8130 == null) {
            this.field8130 = arg0;
        } else {
            this.field8129.field8132 = arg0;
        }
        if (arg1 == 18734) {
            this.field8129 = arg0;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/wn", name = "b", descriptor = "(Z)V", line = 38)
    public final void method3253(boolean arg0) {
        if (arg0) {
            this.field8128 = null;
        }
        this.method3254(22009);
    }

    @OriginalMember(owner = "client!jaclib/peer/wn", name = "a", descriptor = "(I)V", line = 51)
    private final void method3254(int arg0) {
        while (true) {
            Reference var2 = this.field8128.poll();
            if (var2 == null) {
                if (arg0 != 22009) {
                    this.field8130 = null;
                }
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3255(true, var3);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/wn", name = "a", descriptor = "(ZLjaclib/peer/PeerReference;)V", line = 70)
    private final void method3255(boolean arg0, PeerReference arg1) {
        arg1.method3260(84);
        if (this.field8130 == arg1) {
            this.field8130 = arg1.field8132;
        }
        if (this.field8129 == arg1) {
            this.field8129 = arg1.field8133;
        }
        if (arg1.field8132 != null) {
            arg1.field8132.field8133 = arg1.field8133;
        }
        if (arg0 && arg1.field8133 != null) {
            arg1.field8133.field8132 = arg1.field8132;
        }
    }
}
