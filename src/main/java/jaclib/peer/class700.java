package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/bd")
public class class700 {

    @OriginalMember(owner = "client!jaclib/peer/bd", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field9743 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/bd", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9742;

    @OriginalMember(owner = "client!jaclib/peer/bd", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9744;

    @OriginalMember(owner = "client!jaclib/peer/bd", name = "a", descriptor = "(I)V", line = 6)
    public final void method3958(int arg0) {
        this.method3961(arg0 ^ 0x66D8);
        while (this.field9742 != null) {
            this.method3962(this.field9742, -14190);
        }
        this.method3961(arg0 ^ 0x668D);
        if (arg0 != 26288) {
            this.method3959(null, false);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/bd", name = "a", descriptor = "(Ljaclib/peer/PeerReference;Z)V", line = 20)
    public final void method3959(PeerReference arg0, boolean arg1) {
        arg0.field9746 = null;
        arg0.field9747 = this.field9742;
        if (this.field9744 == null) {
            this.field9744 = arg0;
        } else {
            this.field9742.field9746 = arg0;
        }
        if (arg1) {
            this.field9742 = null;
        }
        this.field9742 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/peer/bd", name = "a", descriptor = "(B)V", line = 38)
    public final void method3960(byte arg0) {
        this.method3961(103);
        int var2 = -122 / ((arg0 - 19) / 46);
    }

    @OriginalMember(owner = "client!jaclib/peer/bd", name = "b", descriptor = "(I)V", line = 51)
    private final void method3961(int arg0) {
        while (true) {
            Reference var2 = this.field9743.poll();
            if (var2 == null) {
                if (arg0 <= 54) {
                    this.field9742 = null;
                }
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3962(var3, -14190);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/bd", name = "a", descriptor = "(Ljaclib/peer/PeerReference;I)V", line = 71)
    private final void method3962(PeerReference arg0, int arg1) {
        if (arg1 != -14190) {
            return;
        }
        arg0.method3965(true);
        if (this.field9744 == arg0) {
            this.field9744 = arg0.field9746;
        }
        if (this.field9742 == arg0) {
            this.field9742 = arg0.field9747;
        }
        if (arg0.field9746 != null) {
            arg0.field9746.field9747 = arg0.field9747;
        }
        if (arg0.field9747 != null) {
            arg0.field9747.field9746 = arg0.field9746;
        }
    }
}
