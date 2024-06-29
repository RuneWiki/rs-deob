package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/ge")
public class class703 {

    @OriginalMember(owner = "client!jaclib/peer/ge", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field9861 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/ge", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9859;

    @OriginalMember(owner = "client!jaclib/peer/ge", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9860;

    @OriginalMember(owner = "client!jaclib/peer/ge", name = "a", descriptor = "(B)V", line = 8)
    private final void method3937(byte arg0) {
        while (true) {
            Reference var2 = this.field9861.poll();
            if (var2 == null) {
                if (arg0 >= -32) {
                    this.method3941(-52, null);
                }
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3941(116, var3);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/ge", name = "b", descriptor = "(B)V", line = 27)
    public final void method3938(byte arg0) {
        this.method3937((byte) -44);
        while (this.field9860 != null) {
            this.method3941(117, this.field9860);
        }
        this.method3937((byte) -72);
        if (arg0 < 39) {
            this.method3941(-23, null);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/ge", name = "a", descriptor = "(Z)V", line = 41)
    public final void method3939(boolean arg0) {
        if (arg0) {
            this.method3937((byte) -56);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/ge", name = "a", descriptor = "(Ljaclib/peer/PeerReference;Z)V", line = 58)
    public final void method3940(PeerReference arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        arg0.field9857 = null;
        arg0.field9858 = this.field9860;
        if (this.field9859 == null) {
            this.field9859 = arg0;
        } else {
            this.field9860.field9857 = arg0;
        }
        this.field9860 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/peer/ge", name = "a", descriptor = "(ILjaclib/peer/PeerReference;)V", line = 75)
    private final void method3941(int arg0, PeerReference arg1) {
        arg1.method3934(2450);
        if (this.field9859 == arg1) {
            this.field9859 = arg1.field9857;
        }
        if (this.field9860 == arg1) {
            this.field9860 = arg1.field9858;
        }
        if (arg0 < 26) {
            return;
        }
        if (arg1.field9857 != null) {
            arg1.field9857.field9858 = arg1.field9858;
        }
        if (arg1.field9858 != null) {
            arg1.field9858.field9857 = arg1.field9857;
        }
    }
}
