package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/ep")
public class class421 {

    @OriginalMember(owner = "client!jaclib/peer/ep", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field6012 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/ep", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field6010;

    @OriginalMember(owner = "client!jaclib/peer/ep", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field6011;

    @OriginalMember(owner = "client!jaclib/peer/ep", name = "a", descriptor = "(Z)V")
    public final void method2578(boolean arg0) {
        if (arg0) {
            this.method2582((byte) -62);
        }
        this.method2582((byte) -58);
        while (this.field6011 != null) {
            this.method2579(this.field6011, -20076);
        }
        this.method2582((byte) -58);
    }

    @OriginalMember(owner = "client!jaclib/peer/ep", name = "a", descriptor = "(Ljaclib/peer/PeerReference;I)V")
    private final void method2579(PeerReference arg0, int arg1) {
        arg0.method2574((byte) -89);
        if (this.field6010 == arg0) {
            this.field6010 = arg0.field6008;
        }
        if (this.field6011 == arg0) {
            this.field6011 = arg0.field6007;
        }
        if (arg0.field6008 != null) {
            arg0.field6008.field6007 = arg0.field6007;
        }
        if (arg1 == -20076 && arg0.field6007 != null) {
            arg0.field6007.field6008 = arg0.field6008;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/ep", name = "a", descriptor = "(B)V")
    public final void method2580(byte arg0) {
        int var2 = -6 % ((arg0 - 76) / 36);
        this.method2582((byte) -58);
    }

    @OriginalMember(owner = "client!jaclib/peer/ep", name = "a", descriptor = "(ILjaclib/peer/PeerReference;)V")
    public final void method2581(int arg0, PeerReference arg1) {
        arg1.field6007 = this.field6011;
        arg1.field6008 = null;
        if (this.field6010 == null) {
            this.field6010 = arg1;
        } else {
            this.field6011.field6008 = arg1;
        }
        if (arg0 != -10286) {
            this.method2581(77, null);
        }
        this.field6011 = arg1;
    }

    @OriginalMember(owner = "client!jaclib/peer/ep", name = "b", descriptor = "(B)V")
    private final void method2582(byte arg0) {
        if (arg0 != -58) {
            this.method2579(null, -114);
        }
        while (true) {
            Reference var2 = this.field6012.poll();
            if (var2 == null) {
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method2579(var3, -20076);
        }
    }
}
