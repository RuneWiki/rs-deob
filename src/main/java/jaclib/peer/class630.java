package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/bea")
public class class630 {

    @OriginalMember(owner = "client!jaclib/peer/bea", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field8503 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/bea", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8501;

    @OriginalMember(owner = "client!jaclib/peer/bea", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8502;

    @OriginalMember(owner = "client!jaclib/peer/bea", name = "a", descriptor = "(B)V", line = 6)
    public final void method3485(byte arg0) {
        this.method3488((byte) -82);
        while (this.field8502 != null) {
            this.method3489(-54, this.field8502);
        }
        this.method3488((byte) -31);
        if (arg0 > -53) {
            this.method3486((byte) -126);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/bea", name = "b", descriptor = "(B)V", line = 21)
    public final void method3486(byte arg0) {
        int var2 = 37 / ((arg0 + 68) / 54);
        this.method3488((byte) -15);
    }

    @OriginalMember(owner = "client!jaclib/peer/bea", name = "a", descriptor = "(ZLjaclib/peer/PeerReference;)V", line = 29)
    public final void method3487(boolean arg0, PeerReference arg1) {
        if (!arg0) {
            this.field8501 = null;
        }
        arg1.field8505 = this.field8502;
        arg1.field8506 = null;
        if (this.field8501 == null) {
            this.field8501 = arg1;
        } else {
            this.field8502.field8506 = arg1;
        }
        this.field8502 = arg1;
    }

    @OriginalMember(owner = "client!jaclib/peer/bea", name = "c", descriptor = "(B)V", line = 49)
    private final void method3488(byte arg0) {
        while (true) {
            Reference var2 = this.field8503.poll();
            if (var2 == null) {
                int var4 = -124 / ((arg0 - 54) / 58);
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3489(-72, var3);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/bea", name = "a", descriptor = "(ILjaclib/peer/PeerReference;)V", line = 67)
    private final void method3489(int arg0, PeerReference arg1) {
        arg1.method3492(-23);
        if (this.field8501 == arg1) {
            this.field8501 = arg1.field8506;
        }
        if (this.field8502 == arg1) {
            this.field8502 = arg1.field8505;
        }
        if (arg1.field8506 != null) {
            arg1.field8506.field8505 = arg1.field8505;
        }
        if (arg0 >= -49) {
            this.field8501 = null;
        }
        if (arg1.field8505 != null) {
            arg1.field8505.field8506 = arg1.field8506;
        }
    }
}
