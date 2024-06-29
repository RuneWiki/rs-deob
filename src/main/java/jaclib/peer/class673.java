package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/hb")
public class class673 {

    @OriginalMember(owner = "client!jaclib/peer/hb", name = "a", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field9185 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/hb", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9186;

    @OriginalMember(owner = "client!jaclib/peer/hb", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9187;

    @OriginalMember(owner = "client!jaclib/peer/hb", name = "a", descriptor = "(B)V")
    public final void method3800(byte arg0) {
        this.method3802(21492);
        while (this.field9186 != null) {
            this.method3804(19236, this.field9186);
        }
        if (arg0 != 13) {
            this.field9187 = null;
        }
        this.method3802(21492);
    }

    @OriginalMember(owner = "client!jaclib/peer/hb", name = "a", descriptor = "(Ljaclib/peer/PeerReference;I)V")
    public final void method3801(PeerReference arg0, int arg1) {
        arg0.field9183 = this.field9186;
        arg0.field9184 = null;
        if (this.field9187 == null) {
            this.field9187 = arg0;
        } else {
            this.field9186.field9184 = arg0;
        }
        if (arg1 != -22143) {
            this.method3802(71);
        }
        this.field9186 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/peer/hb", name = "a", descriptor = "(I)V")
    private final void method3802(int arg0) {
        while (true) {
            Reference var2 = this.field9185.poll();
            if (var2 == null) {
                if (arg0 != 21492) {
                    this.method3800((byte) -70);
                }
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3804(19236, var3);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/hb", name = "b", descriptor = "(B)V")
    public final void method3803(byte arg0) {
        this.method3802(arg0 + 21574);
        if (arg0 != -82) {
            this.field9187 = null;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/hb", name = "a", descriptor = "(ILjaclib/peer/PeerReference;)V")
    private final void method3804(int arg0, PeerReference arg1) {
        arg1.method3798(false);
        if (arg0 != 19236) {
            this.method3804(-104, null);
        }
        if (this.field9186 == arg1) {
            this.field9186 = arg1.field9183;
        }
        if (this.field9187 == arg1) {
            this.field9187 = arg1.field9184;
        }
        if (arg1.field9184 != null) {
            arg1.field9184.field9183 = arg1.field9183;
        }
        if (arg1.field9183 != null) {
            arg1.field9183.field9184 = arg1.field9184;
        }
    }
}
