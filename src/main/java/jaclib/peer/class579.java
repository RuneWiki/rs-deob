package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/of")
public class class579 {

    @OriginalMember(owner = "client!jaclib/peer/of", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field8532 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/of", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8531;

    @OriginalMember(owner = "client!jaclib/peer/of", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8533;

    @OriginalMember(owner = "client!jaclib/peer/of", name = "a", descriptor = "(B)V", line = 7)
    public final void method3461(byte arg0) {
        this.method3464((byte) -114);
        if (arg0 != 123) {
            this.field8533 = null;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/of", name = "a", descriptor = "(I)V", line = 17)
    public final void method3462(int arg0) {
        if (arg0 > -39) {
            this.field8532 = null;
        }
        this.method3464((byte) -114);
        while (this.field8531 != null) {
            this.method3463(this.field8531, 127);
        }
        this.method3464((byte) -114);
    }

    @OriginalMember(owner = "client!jaclib/peer/of", name = "a", descriptor = "(Ljaclib/peer/PeerReference;I)V", line = 31)
    private final void method3463(PeerReference arg0, int arg1) {
        arg0.method3459((byte) 100);
        if (this.field8531 == arg0) {
            this.field8531 = arg0.field8529;
        }
        if (this.field8533 == arg0) {
            this.field8533 = arg0.field8530;
        }
        if (arg1 <= 122) {
            return;
        }
        if (arg0.field8530 != null) {
            arg0.field8530.field8529 = arg0.field8529;
        }
        if (arg0.field8529 != null) {
            arg0.field8529.field8530 = arg0.field8530;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/of", name = "b", descriptor = "(B)V", line = 59)
    private final void method3464(byte arg0) {
        while (true) {
            Reference var2 = this.field8532.poll();
            if (var2 == null) {
                if (arg0 != -114) {
                    this.field8532 = null;
                }
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3463(var3, arg0 + 240);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/of", name = "a", descriptor = "(ILjaclib/peer/PeerReference;)V", line = 80)
    public final void method3465(int arg0, PeerReference arg1) {
        arg1.field8530 = null;
        if (arg0 != -15512) {
            this.field8532 = null;
        }
        arg1.field8529 = this.field8531;
        if (this.field8533 == null) {
            this.field8533 = arg1;
        } else {
            this.field8531.field8530 = arg1;
        }
        this.field8531 = arg1;
    }
}
