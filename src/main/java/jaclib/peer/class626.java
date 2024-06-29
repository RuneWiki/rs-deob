package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/fl")
public class class626 {

    @OriginalMember(owner = "client!jaclib/peer/fl", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field8685 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/fl", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8684;

    @OriginalMember(owner = "client!jaclib/peer/fl", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8686;

    @OriginalMember(owner = "client!jaclib/peer/fl", name = "a", descriptor = "(Z)V", line = 5)
    public final void method3496(boolean arg0) {
        this.method3499(-49);
        while (this.field8686 != null) {
            this.method3498(this.field8686, -32427);
        }
        if (arg0) {
            this.field8685 = null;
        }
        this.method3499(-52);
    }

    @OriginalMember(owner = "client!jaclib/peer/fl", name = "a", descriptor = "(Ljaclib/peer/PeerReference;B)V", line = 21)
    public final void method3497(PeerReference arg0, byte arg1) {
        arg0.field8682 = null;
        arg0.field8683 = this.field8686;
        if (this.field8684 == null) {
            this.field8684 = arg0;
        } else {
            this.field8686.field8682 = arg0;
        }
        this.field8686 = arg0;
        if (arg1 <= 47) {
            this.field8686 = null;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/fl", name = "a", descriptor = "(Ljaclib/peer/PeerReference;I)V", line = 38)
    private final void method3498(PeerReference arg0, int arg1) {
        arg0.method3493(arg1 + 32545);
        if (this.field8686 == arg0) {
            this.field8686 = arg0.field8683;
        }
        if (this.field8684 == arg0) {
            this.field8684 = arg0.field8682;
        }
        if (arg1 != -32427) {
            this.method3498(null, -90);
        }
        if (arg0.field8682 != null) {
            arg0.field8682.field8683 = arg0.field8683;
        }
        if (arg0.field8683 != null) {
            arg0.field8683.field8682 = arg0.field8682;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/fl", name = "a", descriptor = "(I)V", line = 67)
    private final void method3499(int arg0) {
        while (true) {
            Reference var2 = this.field8685.poll();
            if (var2 == null) {
                if (arg0 > -1) {
                    this.method3497(null, (byte) -63);
                }
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3498(var3, -32427);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/fl", name = "b", descriptor = "(I)V", line = 86)
    public final void method3500(int arg0) {
        if (arg0 != 942) {
            this.field8686 = null;
        }
        this.method3499(-58);
    }
}
