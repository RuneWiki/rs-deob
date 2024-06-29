package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/naa")
public class class623 {

    @OriginalMember(owner = "client!jaclib/peer/naa", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field8970 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/naa", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8968;

    @OriginalMember(owner = "client!jaclib/peer/naa", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8969;

    @OriginalMember(owner = "client!jaclib/peer/naa", name = "a", descriptor = "(Ljaclib/peer/PeerReference;B)V")
    public final void method3588(PeerReference arg0, byte arg1) {
        arg0.field8973 = null;
        arg0.field8972 = this.field8969;
        if (arg1 != 91) {
            this.field8970 = null;
        }
        if (this.field8968 == null) {
            this.field8968 = arg0;
        } else {
            this.field8969.field8973 = arg0;
        }
        this.field8969 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/peer/naa", name = "a", descriptor = "(Ljaclib/peer/PeerReference;I)V")
    private final void method3589(PeerReference arg0, int arg1) {
        arg0.method3595(true);
        if (arg1 != 23735) {
            this.method3591(-23);
        }
        if (this.field8969 == arg0) {
            this.field8969 = arg0.field8972;
        }
        if (this.field8968 == arg0) {
            this.field8968 = arg0.field8973;
        }
        if (arg0.field8973 != null) {
            arg0.field8973.field8972 = arg0.field8972;
        }
        if (arg0.field8972 != null) {
            arg0.field8972.field8973 = arg0.field8973;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/naa", name = "a", descriptor = "(I)V")
    public final void method3590(int arg0) {
        int var2 = 43 % ((-arg0 - 54) / 56);
        this.method3591(-17941);
        while (this.field8969 != null) {
            this.method3589(this.field8969, 23735);
        }
        this.method3591(-17941);
    }

    @OriginalMember(owner = "client!jaclib/peer/naa", name = "b", descriptor = "(I)V")
    private final void method3591(int arg0) {
        while (true) {
            Reference var2 = this.field8970.poll();
            if (var2 == null) {
                if (arg0 != -17941) {
                    this.method3592(-86);
                }
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3589(var3, 23735);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/naa", name = "c", descriptor = "(I)V")
    public final void method3592(int arg0) {
        if (arg0 != 25632) {
            this.field8969 = null;
        }
        this.method3591(-17941);
    }
}
