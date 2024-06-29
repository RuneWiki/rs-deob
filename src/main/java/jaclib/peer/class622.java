package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/tc")
public class class622 {

    @OriginalMember(owner = "client!jaclib/peer/tc", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field8786 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/tc", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8784;

    @OriginalMember(owner = "client!jaclib/peer/tc", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8785;

    @OriginalMember(owner = "client!jaclib/peer/tc", name = "a", descriptor = "(Ljaclib/peer/PeerReference;I)V", line = 5)
    public final void method3486(PeerReference arg0, int arg1) {
        if (arg1 != 1875) {
            this.method3489(true, null);
        }
        arg0.field8782 = null;
        arg0.field8783 = this.field8784;
        if (this.field8785 == null) {
            this.field8785 = arg0;
        } else {
            this.field8784.field8782 = arg0;
        }
        this.field8784 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/peer/tc", name = "a", descriptor = "(Z)V", line = 23)
    public final void method3487(boolean arg0) {
        this.method3490(true);
        while (this.field8784 != null) {
            this.method3489(true, this.field8784);
        }
        this.method3490(arg0);
    }

    @OriginalMember(owner = "client!jaclib/peer/tc", name = "a", descriptor = "(I)V", line = 35)
    public final void method3488(int arg0) {
        if (arg0 != -21326) {
            this.method3490(false);
        }
        this.method3490(true);
    }

    @OriginalMember(owner = "client!jaclib/peer/tc", name = "a", descriptor = "(ZLjaclib/peer/PeerReference;)V", line = 46)
    private final void method3489(boolean arg0, PeerReference arg1) {
        arg1.method3484(0);
        if (this.field8784 == arg1) {
            this.field8784 = arg1.field8783;
        }
        if (this.field8785 == arg1) {
            this.field8785 = arg1.field8782;
        }
        if (!arg0) {
            this.method3487(true);
        }
        if (arg1.field8782 != null) {
            arg1.field8782.field8783 = arg1.field8783;
        }
        if (arg1.field8783 != null) {
            arg1.field8783.field8782 = arg1.field8782;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/tc", name = "b", descriptor = "(Z)V", line = 76)
    private final void method3490(boolean arg0) {
        while (true) {
            Reference var2 = this.field8786.poll();
            if (var2 == null) {
                if (!arg0) {
                    this.field8784 = null;
                }
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3489(true, var3);
        }
    }
}
