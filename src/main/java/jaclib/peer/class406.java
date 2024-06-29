package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/io")
public class class406 {

    @OriginalMember(owner = "client!jaclib/peer/io", name = "a", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field5888 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/io", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field5889;

    @OriginalMember(owner = "client!jaclib/peer/io", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field5890;

    @OriginalMember(owner = "client!jaclib/peer/io", name = "b", descriptor = "(I)V")
    public final void method3183(int arg0) {
        if (arg0 >= -120) {
            this.field5890 = null;
        }
        this.method3187(9379);
        while (this.field5890 != null) {
            this.method3184(-24978, this.field5890);
        }
        this.method3187(9379);
    }

    @OriginalMember(owner = "client!jaclib/peer/io", name = "a", descriptor = "(ILjaclib/peer/PeerReference;)V")
    private final void method3184(int arg0, PeerReference arg1) {
        arg1.method3177((byte) 117);
        if (this.field5890 == arg1) {
            this.field5890 = arg1.field5885;
        }
        if (this.field5889 == arg1) {
            this.field5889 = arg1.field5886;
        }
        if (arg1.field5886 != null) {
            arg1.field5886.field5885 = arg1.field5885;
        }
        if (arg0 != -24978) {
            this.method3186(111);
        }
        if (arg1.field5885 != null) {
            arg1.field5885.field5886 = arg1.field5886;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/io", name = "a", descriptor = "(Ljaclib/peer/PeerReference;I)V")
    public final void method3185(PeerReference arg0, int arg1) {
        arg0.field5885 = this.field5890;
        if (arg1 != -4755) {
            this.method3184(-56, null);
        }
        arg0.field5886 = null;
        if (this.field5889 == null) {
            this.field5889 = arg0;
        } else {
            this.field5890.field5886 = arg0;
        }
        this.field5890 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/peer/io", name = "a", descriptor = "(I)V")
    public final void method3186(int arg0) {
        if (arg0 == -15351) {
            this.method3187(9379);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/io", name = "c", descriptor = "(I)V")
    private final void method3187(int arg0) {
        while (true) {
            Reference var2 = this.field5888.poll();
            if (var2 == null) {
                if (arg0 != 9379) {
                    this.field5889 = null;
                }
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3184(-24978, var3);
        }
    }
}
