package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/rh")
public class class670 {

    @OriginalMember(owner = "client!jaclib/peer/rh", name = "a", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field9528 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/rh", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9529;

    @OriginalMember(owner = "client!jaclib/peer/rh", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9530;

    @OriginalMember(owner = "client!jaclib/peer/rh", name = "a", descriptor = "(I)V", line = 5)
    public final void method3825(int arg0) {
        if (arg0 == 9234) {
            this.method3828(arg0 ^ 0xFFFFDBA1);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/rh", name = "a", descriptor = "(Ljaclib/peer/PeerReference;B)V", line = 17)
    private final void method3826(PeerReference arg0, byte arg1) {
        if (arg1 < 62) {
            return;
        }
        arg0.method3832(-87);
        if (this.field9530 == arg0) {
            this.field9530 = arg0.field9533;
        }
        if (this.field9529 == arg0) {
            this.field9529 = arg0.field9532;
        }
        if (arg0.field9533 != null) {
            arg0.field9533.field9532 = arg0.field9532;
        }
        if (arg0.field9532 != null) {
            arg0.field9532.field9533 = arg0.field9533;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/rh", name = "a", descriptor = "(Z)V", line = 43)
    public final void method3827(boolean arg0) {
        this.method3828(-102);
        if (arg0) {
            while (this.field9529 != null) {
                this.method3826(this.field9529, (byte) 65);
            }
            this.method3828(-104);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/rh", name = "b", descriptor = "(I)V", line = 58)
    private final void method3828(int arg0) {
        if (arg0 > -11) {
            this.field9530 = null;
        }
        while (true) {
            Reference var2 = this.field9528.poll();
            if (var2 == null) {
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3826(var3, (byte) 82);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/rh", name = "b", descriptor = "(Ljaclib/peer/PeerReference;B)V", line = 85)
    public final void method3829(PeerReference arg0, byte arg1) {
        arg0.field9532 = this.field9529;
        arg0.field9533 = null;
        if (this.field9530 == null) {
            this.field9530 = arg0;
        } else {
            this.field9529.field9533 = arg0;
        }
        if (arg1 == -38) {
            this.field9529 = arg0;
        }
    }
}
