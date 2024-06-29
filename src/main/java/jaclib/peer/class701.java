package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/mba")
public class class701 {

    @OriginalMember(owner = "client!jaclib/peer/mba", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field9671 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/mba", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9669;

    @OriginalMember(owner = "client!jaclib/peer/mba", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9670;

    @OriginalMember(owner = "client!jaclib/peer/mba", name = "a", descriptor = "(ILjaclib/peer/PeerReference;)V", line = 8)
    private final void method3920(int arg0, PeerReference arg1) {
        arg1.method3919(0);
        if (arg0 <= 104) {
            this.field9670 = null;
        }
        if (this.field9670 == arg1) {
            this.field9670 = arg1.field9668;
        }
        if (this.field9669 == arg1) {
            this.field9669 = arg1.field9667;
        }
        if (arg1.field9668 != null) {
            arg1.field9668.field9667 = arg1.field9667;
        }
        if (arg1.field9667 != null) {
            arg1.field9667.field9668 = arg1.field9668;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/mba", name = "a", descriptor = "(B)V", line = 35)
    private final void method3921(byte arg0) {
        while (true) {
            Reference var2 = this.field9671.poll();
            if (var2 == null) {
                if (arg0 != -95) {
                    this.method3924((byte) 100);
                }
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3920(118, var3);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/mba", name = "a", descriptor = "(Ljaclib/peer/PeerReference;B)V", line = 53)
    public final void method3922(PeerReference arg0, byte arg1) {
        if (arg1 > -28) {
            this.field9670 = null;
        }
        arg0.field9667 = this.field9669;
        arg0.field9668 = null;
        if (this.field9670 == null) {
            this.field9670 = arg0;
        } else {
            this.field9669.field9668 = arg0;
        }
        this.field9669 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/peer/mba", name = "a", descriptor = "(Z)V", line = 70)
    public final void method3923(boolean arg0) {
        if (!arg0) {
            this.method3921((byte) -95);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/mba", name = "b", descriptor = "(B)V", line = 89)
    public final void method3924(byte arg0) {
        int var2 = -84 / ((arg0 + 35) / 43);
        this.method3921((byte) -95);
        while (this.field9669 != null) {
            this.method3920(117, this.field9669);
        }
        this.method3921((byte) -95);
    }
}
