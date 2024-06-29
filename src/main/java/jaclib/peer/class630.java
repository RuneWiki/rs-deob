package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/dj")
public class class630 {

    @OriginalMember(owner = "client!jaclib/peer/dj", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field8553 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/dj", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8551;

    @OriginalMember(owner = "client!jaclib/peer/dj", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8552;

    @OriginalMember(owner = "client!jaclib/peer/dj", name = "a", descriptor = "(B)V", line = 6)
    private final void method3537(byte arg0) {
        int var2 = -118 % ((-arg0) / 56);
        while (true) {
            Reference var3 = this.field8553.poll();
            if (var3 == null) {
                return;
            }
            PeerReference var4 = (PeerReference) var3;
            this.method3541((byte) -41, var4);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/dj", name = "b", descriptor = "(B)V", line = 26)
    public final void method3538(byte arg0) {
        this.method3537((byte) -108);
        if (arg0 <= 79) {
            this.method3537((byte) -108);
        }
        while (this.field8552 != null) {
            this.method3541((byte) -41, this.field8552);
        }
        this.method3537((byte) -124);
    }

    @OriginalMember(owner = "client!jaclib/peer/dj", name = "c", descriptor = "(B)V", line = 41)
    public final void method3539(byte arg0) {
        this.method3537((byte) -63);
        if (arg0 != 43) {
            this.field8553 = null;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/dj", name = "a", descriptor = "(ZLjaclib/peer/PeerReference;)V", line = 51)
    public final void method3540(boolean arg0, PeerReference arg1) {
        arg1.field8549 = this.field8552;
        arg1.field8550 = null;
        if (this.field8551 == null) {
            this.field8551 = arg1;
        } else {
            this.field8552.field8550 = arg1;
        }
        if (!arg0) {
            this.field8552 = arg1;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/dj", name = "a", descriptor = "(BLjaclib/peer/PeerReference;)V", line = 68)
    private final void method3541(byte arg0, PeerReference arg1) {
        arg1.method3535(arg0 + 30849);
        if (this.field8551 == arg1) {
            this.field8551 = arg1.field8550;
        }
        if (this.field8552 == arg1) {
            this.field8552 = arg1.field8549;
        }
        if (arg1.field8550 != null) {
            arg1.field8550.field8549 = arg1.field8549;
        }
        if (arg1.field8549 != null) {
            arg1.field8549.field8550 = arg1.field8550;
        }
        if (arg0 != -41) {
            this.field8552 = null;
        }
    }
}
