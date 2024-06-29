package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/fk")
public class class578 {

    @OriginalMember(owner = "client!jaclib/peer/fk", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field7954 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/fk", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field7953;

    @OriginalMember(owner = "client!jaclib/peer/fk", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field7955;

    @OriginalMember(owner = "client!jaclib/peer/fk", name = "a", descriptor = "(I)V")
    public final void method3307(int arg0) {
        this.method3308(false);
        while (this.field7955 != null) {
            this.method3309(this.field7955, arg0 ^ 0x526B);
        }
        if (arg0 != -21036) {
            this.field7955 = null;
        }
        this.method3308(false);
    }

    @OriginalMember(owner = "client!jaclib/peer/fk", name = "a", descriptor = "(Z)V")
    private final void method3308(boolean arg0) {
        while (true) {
            Reference var2 = this.field7954.poll();
            if (var2 == null) {
                if (arg0) {
                    this.method3310(null, -5);
                }
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3309(var3, -55);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/fk", name = "a", descriptor = "(Ljaclib/peer/PeerReference;I)V")
    private final void method3309(PeerReference arg0, int arg1) {
        arg0.method3305(0);
        if (this.field7953 == arg0) {
            this.field7953 = arg0.field7951;
        }
        if (this.field7955 == arg0) {
            this.field7955 = arg0.field7952;
        }
        if (arg0.field7951 != null) {
            arg0.field7951.field7952 = arg0.field7952;
        }
        if (arg0.field7952 != null) {
            arg0.field7952.field7951 = arg0.field7951;
        }
        if (arg1 > -14) {
            this.field7955 = null;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/fk", name = "b", descriptor = "(Ljaclib/peer/PeerReference;I)V")
    public final void method3310(PeerReference arg0, int arg1) {
        arg0.field7951 = null;
        arg0.field7952 = this.field7955;
        if (this.field7953 == null) {
            this.field7953 = arg0;
        } else {
            this.field7955.field7951 = arg0;
        }
        if (arg1 == -5239) {
            this.field7955 = arg0;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/fk", name = "b", descriptor = "(I)V")
    public final void method3311(int arg0) {
        if (arg0 < 63) {
            this.field7953 = null;
        }
        this.method3308(false);
    }
}
