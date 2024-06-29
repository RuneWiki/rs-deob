package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/pb")
public class class570 {

    @OriginalMember(owner = "client!jaclib/peer/pb", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field8448 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/pb", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8446;

    @OriginalMember(owner = "client!jaclib/peer/pb", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8447;

    @OriginalMember(owner = "client!jaclib/peer/pb", name = "a", descriptor = "(Z)V")
    public final void method3341(boolean arg0) {
        this.method3343((byte) 119);
        while (this.field8446 != null) {
            this.method3344(this.field8446, -25400);
        }
        this.method3343((byte) 2);
        if (!arg0) {
            this.method3345(63);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/pb", name = "a", descriptor = "(ILjaclib/peer/PeerReference;)V")
    public final void method3342(int arg0, PeerReference arg1) {
        arg1.field8449 = null;
        arg1.field8450 = this.field8446;
        if (arg0 < 105) {
            return;
        }
        if (this.field8447 == null) {
            this.field8447 = arg1;
        } else {
            this.field8446.field8449 = arg1;
        }
        this.field8446 = arg1;
    }

    @OriginalMember(owner = "client!jaclib/peer/pb", name = "a", descriptor = "(B)V")
    private final void method3343(byte arg0) {
        int var2 = -97 / ((arg0 + 70) / 33);
        while (true) {
            Reference var3 = this.field8448.poll();
            if (var3 == null) {
                return;
            }
            PeerReference var4 = (PeerReference) var3;
            this.method3344(var4, -25400);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/pb", name = "a", descriptor = "(Ljaclib/peer/PeerReference;I)V")
    private final void method3344(PeerReference arg0, int arg1) {
        arg0.method3347((byte) -44);
        if (arg1 != -25400) {
            this.field8448 = null;
        }
        if (this.field8447 == arg0) {
            this.field8447 = arg0.field8449;
        }
        if (this.field8446 == arg0) {
            this.field8446 = arg0.field8450;
        }
        if (arg0.field8449 != null) {
            arg0.field8449.field8450 = arg0.field8450;
        }
        if (arg0.field8450 != null) {
            arg0.field8450.field8449 = arg0.field8449;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/pb", name = "a", descriptor = "(I)V")
    public final void method3345(int arg0) {
        if (arg0 != -13691) {
            this.method3342(-12, null);
        }
        this.method3343((byte) -106);
    }
}
