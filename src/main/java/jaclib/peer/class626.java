package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/bda")
public class class626 {

    @OriginalMember(owner = "client!jaclib/peer/bda", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field9053 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/bda", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9052;

    @OriginalMember(owner = "client!jaclib/peer/bda", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9054;

    @OriginalMember(owner = "client!jaclib/peer/bda", name = "a", descriptor = "(I)V")
    public final void method3590(int arg0) {
        this.method3592(10633);
        if (arg0 != 2340) {
            this.field9053 = null;
        }
        while (this.field9052 != null) {
            this.method3594(this.field9052, (byte) -75);
        }
        this.method3592(arg0 ^ 0x20AD);
    }

    @OriginalMember(owner = "client!jaclib/peer/bda", name = "a", descriptor = "(Ljaclib/peer/PeerReference;B)V")
    public final void method3591(PeerReference arg0, byte arg1) {
        arg0.field9051 = this.field9052;
        arg0.field9050 = null;
        if (this.field9054 == null) {
            this.field9054 = arg0;
        } else {
            this.field9052.field9050 = arg0;
        }
        this.field9052 = arg0;
        if (arg1 != 64) {
            this.field9054 = null;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/bda", name = "b", descriptor = "(I)V")
    private final void method3592(int arg0) {
        if (arg0 != 10633) {
            return;
        }
        while (true) {
            Reference var2 = this.field9053.poll();
            if (var2 == null) {
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3594(var3, (byte) -38);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/bda", name = "c", descriptor = "(I)V")
    public final void method3593(int arg0) {
        if (arg0 != -12435) {
            this.field9054 = null;
        }
        this.method3592(arg0 ^ 0xFFFFE6E4);
    }

    @OriginalMember(owner = "client!jaclib/peer/bda", name = "b", descriptor = "(Ljaclib/peer/PeerReference;B)V")
    private final void method3594(PeerReference arg0, byte arg1) {
        arg0.method3589(-79);
        if (this.field9052 == arg0) {
            this.field9052 = arg0.field9051;
        }
        if (arg1 >= -14) {
            return;
        }
        if (this.field9054 == arg0) {
            this.field9054 = arg0.field9050;
        }
        if (arg0.field9050 != null) {
            arg0.field9050.field9051 = arg0.field9051;
        }
        if (arg0.field9051 != null) {
            arg0.field9051.field9050 = arg0.field9050;
        }
    }
}
