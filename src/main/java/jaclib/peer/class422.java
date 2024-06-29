package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/hea")
public class class422 {

    @OriginalMember(owner = "client!jaclib/peer/hea", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field5942 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/hea", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field5940;

    @OriginalMember(owner = "client!jaclib/peer/hea", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field5941;

    @OriginalMember(owner = "client!jaclib/peer/hea", name = "a", descriptor = "(I)V")
    public final void method2627(int arg0) {
        if (arg0 != -23514) {
            this.field5941 = null;
        }
        this.method2629(false);
    }

    @OriginalMember(owner = "client!jaclib/peer/hea", name = "a", descriptor = "(Ljaclib/peer/PeerReference;I)V")
    public final void method2628(PeerReference arg0, int arg1) {
        arg0.field5944 = this.field5941;
        arg0.field5943 = null;
        if (this.field5940 == null) {
            this.field5940 = arg0;
        } else {
            this.field5941.field5943 = arg0;
        }
        if (arg1 != -26806) {
            this.method2628(null, -105);
        }
        this.field5941 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/peer/hea", name = "a", descriptor = "(Z)V")
    private final void method2629(boolean arg0) {
        while (true) {
            Reference var2 = this.field5942.poll();
            if (var2 == null) {
                if (arg0) {
                    this.method2631(false, null);
                }
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method2631(!arg0, var3);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/hea", name = "b", descriptor = "(I)V")
    public final void method2630(int arg0) {
        if (arg0 != -27744) {
            this.method2627(106);
        }
        this.method2629(false);
        while (this.field5941 != null) {
            this.method2631(true, this.field5941);
        }
        this.method2629(false);
    }

    @OriginalMember(owner = "client!jaclib/peer/hea", name = "a", descriptor = "(ZLjaclib/peer/PeerReference;)V")
    private final void method2631(boolean arg0, PeerReference arg1) {
        arg1.method2632(arg0);
        if (this.field5940 == arg1) {
            this.field5940 = arg1.field5943;
        }
        if (this.field5941 == arg1) {
            this.field5941 = arg1.field5944;
        }
        if (arg1.field5943 != null) {
            arg1.field5943.field5944 = arg1.field5944;
        }
        if (arg1.field5944 != null) {
            arg1.field5944.field5943 = arg1.field5943;
        }
        if (!arg0) {
            this.field5941 = null;
        }
    }
}
