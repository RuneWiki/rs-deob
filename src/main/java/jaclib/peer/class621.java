package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/ow")
public class class621 {

    @OriginalMember(owner = "client!jaclib/peer/ow", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field8616 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/ow", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8614;

    @OriginalMember(owner = "client!jaclib/peer/ow", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8615;

    @OriginalMember(owner = "client!jaclib/peer/ow", name = "a", descriptor = "(I)V")
    private final void method3447(int arg0) {
        if (arg0 != 16042) {
            return;
        }
        while (true) {
            Reference var2 = this.field8616.poll();
            if (var2 == null) {
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3450(var3, -21325);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/ow", name = "a", descriptor = "(B)V")
    public final void method3448(byte arg0) {
        this.method3447(16042);
        while (this.field8614 != null) {
            this.method3450(this.field8614, -21325);
        }
        this.method3447(16042);
        if (arg0 <= 90) {
            this.method3447(109);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/ow", name = "b", descriptor = "(I)V")
    public final void method3449(int arg0) {
        if (arg0 > -41) {
            this.field8616 = null;
        }
        this.method3447(16042);
    }

    @OriginalMember(owner = "client!jaclib/peer/ow", name = "a", descriptor = "(Ljaclib/peer/PeerReference;I)V")
    private final void method3450(PeerReference arg0, int arg1) {
        arg0.method3456(0);
        if (this.field8615 == arg0) {
            this.field8615 = arg0.field8619;
        }
        if (this.field8614 == arg0) {
            this.field8614 = arg0.field8618;
        }
        if (arg0.field8619 != null) {
            arg0.field8619.field8618 = arg0.field8618;
        }
        if (arg1 == -21325 && arg0.field8618 != null) {
            arg0.field8618.field8619 = arg0.field8619;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/ow", name = "a", descriptor = "(BLjaclib/peer/PeerReference;)V")
    public final void method3451(byte arg0, PeerReference arg1) {
        arg1.field8618 = this.field8614;
        arg1.field8619 = null;
        if (this.field8615 == null) {
            this.field8615 = arg1;
        } else {
            this.field8614.field8619 = arg1;
        }
        this.field8614 = arg1;
        if (arg0 <= 35) {
            this.method3448((byte) -58);
        }
    }
}
