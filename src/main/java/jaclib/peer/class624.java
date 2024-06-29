package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/pi")
public class class624 {

    @OriginalMember(owner = "client!jaclib/peer/pi", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field8815 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/pi", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8814;

    @OriginalMember(owner = "client!jaclib/peer/pi", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8816;

    @OriginalMember(owner = "client!jaclib/peer/pi", name = "a", descriptor = "(ILjaclib/peer/PeerReference;)V")
    public final void method3638(int arg0, PeerReference arg1) {
        if (arg0 != 20054) {
            this.method3638(-9, null);
        }
        arg1.field8812 = this.field8814;
        arg1.field8813 = null;
        if (this.field8816 == null) {
            this.field8816 = arg1;
        } else {
            this.field8814.field8813 = arg1;
        }
        this.field8814 = arg1;
    }

    @OriginalMember(owner = "client!jaclib/peer/pi", name = "a", descriptor = "(Z)V")
    public final void method3639(boolean arg0) {
        this.method3640((byte) -75);
        while (this.field8814 != null) {
            this.method3641(this.field8814, (byte) -8);
        }
        this.method3640((byte) -40);
        if (arg0) {
            this.field8816 = null;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/pi", name = "a", descriptor = "(B)V")
    private final void method3640(byte arg0) {
        if (arg0 > -39) {
            return;
        }
        while (true) {
            Reference var2 = this.field8815.poll();
            if (var2 == null) {
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3641(var3, (byte) -8);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/pi", name = "a", descriptor = "(Ljaclib/peer/PeerReference;B)V")
    private final void method3641(PeerReference arg0, byte arg1) {
        if (arg1 != -8) {
            this.field8816 = null;
        }
        arg0.method3636((byte) -16);
        if (this.field8816 == arg0) {
            this.field8816 = arg0.field8813;
        }
        if (this.field8814 == arg0) {
            this.field8814 = arg0.field8812;
        }
        if (arg0.field8813 != null) {
            arg0.field8813.field8812 = arg0.field8812;
        }
        if (arg0.field8812 != null) {
            arg0.field8812.field8813 = arg0.field8813;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/pi", name = "a", descriptor = "(I)V")
    public final void method3642(int arg0) {
        if (arg0 != 12906) {
            this.field8814 = null;
        }
        this.method3640((byte) -81);
    }
}
