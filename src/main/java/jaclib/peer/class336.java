package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/wl")
public class class336 {

    @OriginalMember(owner = "client!jaclib/peer/wl", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field4887 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/wl", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field4885;

    @OriginalMember(owner = "client!jaclib/peer/wl", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field4886;

    @OriginalMember(owner = "client!jaclib/peer/wl", name = "a", descriptor = "(I)V")
    public final void method2058(int arg0) {
        this.method2059((byte) 34);
        if (arg0 <= -10) {
            while (this.field4885 != null) {
                this.method2061(this.field4885, -2538);
            }
            this.method2059((byte) 13);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/wl", name = "a", descriptor = "(B)V")
    private final void method2059(byte arg0) {
        while (true) {
            Reference var2 = this.field4887.poll();
            if (var2 == null) {
                if (arg0 < 11) {
                    this.method2058(89);
                }
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method2061(var3, -2538);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/wl", name = "b", descriptor = "(I)V")
    public final void method2060(int arg0) {
        if (arg0 < 89) {
            this.field4885 = null;
        }
        this.method2059((byte) 74);
    }

    @OriginalMember(owner = "client!jaclib/peer/wl", name = "a", descriptor = "(Ljaclib/peer/PeerReference;I)V")
    private final void method2061(PeerReference arg0, int arg1) {
        arg0.method2067((byte) -122);
        if (arg1 != -2538) {
            this.field4887 = null;
        }
        if (this.field4886 == arg0) {
            this.field4886 = arg0.field4889;
        }
        if (this.field4885 == arg0) {
            this.field4885 = arg0.field4890;
        }
        if (arg0.field4889 != null) {
            arg0.field4889.field4890 = arg0.field4890;
        }
        if (arg0.field4890 != null) {
            arg0.field4890.field4889 = arg0.field4889;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/wl", name = "a", descriptor = "(ILjaclib/peer/PeerReference;)V")
    public final void method2062(int arg0, PeerReference arg1) {
        if (arg0 != -26734) {
            this.method2061(null, 13);
        }
        arg1.field4890 = this.field4885;
        arg1.field4889 = null;
        if (this.field4886 == null) {
            this.field4886 = arg1;
        } else {
            this.field4885.field4889 = arg1;
        }
        this.field4885 = arg1;
    }
}
