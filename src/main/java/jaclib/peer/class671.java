package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/faa")
public class class671 {

    @OriginalMember(owner = "client!jaclib/peer/faa", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field9111 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/faa", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9109;

    @OriginalMember(owner = "client!jaclib/peer/faa", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9110;

    @OriginalMember(owner = "client!jaclib/peer/faa", name = "a", descriptor = "(Ljaclib/peer/PeerReference;I)V", line = 8)
    public final void method3668(PeerReference arg0, int arg1) {
        arg0.field9114 = this.field9110;
        if (arg1 != 5808) {
            return;
        }
        arg0.field9113 = null;
        if (this.field9109 == null) {
            this.field9109 = arg0;
        } else {
            this.field9110.field9113 = arg0;
        }
        this.field9110 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/peer/faa", name = "a", descriptor = "(Z)V", line = 26)
    public final void method3669(boolean arg0) {
        this.method3671(32);
        if (arg0) {
            this.method3668(null, -49);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/faa", name = "a", descriptor = "(ILjaclib/peer/PeerReference;)V", line = 36)
    private final void method3670(int arg0, PeerReference arg1) {
        arg1.method3676(arg0 ^ 0x59D6);
        if (arg0 != 29665) {
            return;
        }
        if (this.field9110 == arg1) {
            this.field9110 = arg1.field9114;
        }
        if (this.field9109 == arg1) {
            this.field9109 = arg1.field9113;
        }
        if (arg1.field9113 != null) {
            arg1.field9113.field9114 = arg1.field9114;
        }
        if (arg1.field9114 != null) {
            arg1.field9114.field9113 = arg1.field9113;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/faa", name = "a", descriptor = "(I)V", line = 61)
    private final void method3671(int arg0) {
        while (true) {
            Reference var2 = this.field9111.poll();
            if (var2 == null) {
                int var4 = 38 / ((-arg0 - 32) / 53);
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3670(29665, var3);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/faa", name = "b", descriptor = "(Z)V", line = 80)
    public final void method3672(boolean arg0) {
        this.method3671(-120);
        while (this.field9110 != null) {
            this.method3670(29665, this.field9110);
        }
        if (!arg0) {
            this.method3671(-88);
        }
    }
}
