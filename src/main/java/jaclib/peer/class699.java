package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/in")
public class class699 {

    @OriginalMember(owner = "client!jaclib/peer/in", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field9887 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/in", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9885;

    @OriginalMember(owner = "client!jaclib/peer/in", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9886;

    @OriginalMember(owner = "client!jaclib/peer/in", name = "a", descriptor = "(B)V", line = 6)
    private final void method3964(byte arg0) {
        if (arg0 != -110) {
            this.field9887 = null;
        }
        while (true) {
            Reference var2 = this.field9887.poll();
            if (var2 == null) {
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3965(var3, (byte) 87);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/in", name = "a", descriptor = "(Ljaclib/peer/PeerReference;B)V", line = 27)
    private final void method3965(PeerReference arg0, byte arg1) {
        arg0.method3972(0);
        if (arg1 != 87) {
            this.field9885 = null;
        }
        if (this.field9886 == arg0) {
            this.field9886 = arg0.field9890;
        }
        if (this.field9885 == arg0) {
            this.field9885 = arg0.field9889;
        }
        if (arg0.field9889 != null) {
            arg0.field9889.field9890 = arg0.field9890;
        }
        if (arg0.field9890 != null) {
            arg0.field9890.field9889 = arg0.field9889;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/in", name = "a", descriptor = "(I)V", line = 50)
    public final void method3966(int arg0) {
        if (arg0 > -56) {
            this.method3966(25);
        }
        this.method3964((byte) -110);
        while (this.field9886 != null) {
            this.method3965(this.field9886, (byte) 87);
        }
        this.method3964((byte) -110);
    }

    @OriginalMember(owner = "client!jaclib/peer/in", name = "b", descriptor = "(B)V", line = 64)
    public final void method3967(byte arg0) {
        this.method3964((byte) -110);
        if (arg0 <= 91) {
            this.method3965(null, (byte) 26);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/in", name = "a", descriptor = "(ILjaclib/peer/PeerReference;)V", line = 77)
    public final void method3968(int arg0, PeerReference arg1) {
        arg1.field9890 = this.field9886;
        arg1.field9889 = null;
        if (arg0 != 14262) {
            return;
        }
        if (this.field9885 == null) {
            this.field9885 = arg1;
        } else {
            this.field9886.field9889 = arg1;
        }
        this.field9886 = arg1;
    }
}
