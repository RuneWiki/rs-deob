package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/hr")
public class class615 {

    @OriginalMember(owner = "client!jaclib/peer/hr", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field8677 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/hr", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8676;

    @OriginalMember(owner = "client!jaclib/peer/hr", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8678;

    @OriginalMember(owner = "client!jaclib/peer/hr", name = "a", descriptor = "(BLjaclib/peer/PeerReference;)V")
    private final void method3452(byte arg0, PeerReference arg1) {
        arg1.method3450(0);
        if (this.field8678 == arg1) {
            this.field8678 = arg1.field8675;
        }
        if (this.field8676 == arg1) {
            this.field8676 = arg1.field8674;
        }
        if (arg1.field8675 != null) {
            arg1.field8675.field8674 = arg1.field8674;
        }
        int var3 = 60 % ((arg0 + 13) / 50);
        if (arg1.field8674 != null) {
            arg1.field8674.field8675 = arg1.field8675;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/hr", name = "a", descriptor = "(I)V")
    private final void method3453(int arg0) {
        while (true) {
            Reference var2 = this.field8677.poll();
            if (var2 == null) {
                if (arg0 > -35) {
                    this.field8677 = null;
                }
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3452((byte) -64, var3);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/hr", name = "b", descriptor = "(I)V")
    public final void method3454(int arg0) {
        this.method3453(-93);
        if (arg0 != 20522) {
            this.field8676 = null;
        }
        while (this.field8676 != null) {
            this.method3452((byte) -99, this.field8676);
        }
        this.method3453(-117);
    }

    @OriginalMember(owner = "client!jaclib/peer/hr", name = "c", descriptor = "(I)V")
    public final void method3455(int arg0) {
        if (arg0 <= 102) {
            this.method3452((byte) -87, null);
        }
        this.method3453(-75);
    }

    @OriginalMember(owner = "client!jaclib/peer/hr", name = "b", descriptor = "(BLjaclib/peer/PeerReference;)V")
    public final void method3456(byte arg0, PeerReference arg1) {
        if (arg0 < 22) {
            this.method3453(74);
        }
        arg1.field8674 = this.field8676;
        arg1.field8675 = null;
        if (this.field8678 == null) {
            this.field8678 = arg1;
        } else {
            this.field8676.field8675 = arg1;
        }
        this.field8676 = arg1;
    }
}
