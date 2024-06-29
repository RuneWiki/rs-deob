package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/ca")
public class class617 {

    @OriginalMember(owner = "client!jaclib/peer/ca", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field8548 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/ca", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8546;

    @OriginalMember(owner = "client!jaclib/peer/ca", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8547;

    @OriginalMember(owner = "client!jaclib/peer/ca", name = "a", descriptor = "(Ljaclib/peer/PeerReference;I)V")
    private final void method3433(PeerReference arg0, int arg1) {
        if (arg1 != -23765) {
            this.method3437((byte) -50);
        }
        arg0.method3438((byte) -102);
        if (this.field8547 == arg0) {
            this.field8547 = arg0.field8550;
        }
        if (this.field8546 == arg0) {
            this.field8546 = arg0.field8549;
        }
        if (arg0.field8550 != null) {
            arg0.field8550.field8549 = arg0.field8549;
        }
        if (arg0.field8549 != null) {
            arg0.field8549.field8550 = arg0.field8550;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/ca", name = "b", descriptor = "(Ljaclib/peer/PeerReference;I)V")
    public final void method3434(PeerReference arg0, int arg1) {
        arg0.field8550 = null;
        if (arg1 != 4220) {
            this.field8548 = null;
        }
        arg0.field8549 = this.field8546;
        if (this.field8547 == null) {
            this.field8547 = arg0;
        } else {
            this.field8546.field8550 = arg0;
        }
        this.field8546 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/peer/ca", name = "a", descriptor = "(B)V")
    private final void method3435(byte arg0) {
        if (arg0 <= 92) {
            return;
        }
        while (true) {
            Reference var2 = this.field8548.poll();
            if (var2 == null) {
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3433(var3, -23765);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/ca", name = "a", descriptor = "(Z)V")
    public final void method3436(boolean arg0) {
        if (arg0) {
            this.field8547 = null;
        }
        this.method3435((byte) 122);
    }

    @OriginalMember(owner = "client!jaclib/peer/ca", name = "b", descriptor = "(B)V")
    public final void method3437(byte arg0) {
        this.method3435((byte) 108);
        if (arg0 != -86) {
            this.method3433(null, -54);
        }
        while (this.field8546 != null) {
            this.method3433(this.field8546, -23765);
        }
        this.method3435((byte) 122);
    }
}
