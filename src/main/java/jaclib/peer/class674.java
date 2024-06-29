package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/gca")
public class class674 {

    @OriginalMember(owner = "client!jaclib/peer/gca", name = "a", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field9433 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/gca", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9434;

    @OriginalMember(owner = "client!jaclib/peer/gca", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9435;

    @OriginalMember(owner = "client!jaclib/peer/gca", name = "a", descriptor = "(ZLjaclib/peer/PeerReference;)V")
    public final void method3800(boolean arg0, PeerReference arg1) {
        arg1.field9438 = null;
        arg1.field9437 = this.field9434;
        if (!arg0) {
            this.field9434 = null;
        }
        if (this.field9435 == null) {
            this.field9435 = arg1;
        } else {
            this.field9434.field9438 = arg1;
        }
        this.field9434 = arg1;
    }

    @OriginalMember(owner = "client!jaclib/peer/gca", name = "a", descriptor = "(BLjaclib/peer/PeerReference;)V")
    private final void method3801(byte arg0, PeerReference arg1) {
        if (arg0 > -106) {
            this.method3804(2);
        }
        arg1.method3808((byte) 75);
        if (this.field9435 == arg1) {
            this.field9435 = arg1.field9438;
        }
        if (this.field9434 == arg1) {
            this.field9434 = arg1.field9437;
        }
        if (arg1.field9438 != null) {
            arg1.field9438.field9437 = arg1.field9437;
        }
        if (arg1.field9437 != null) {
            arg1.field9437.field9438 = arg1.field9438;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/gca", name = "a", descriptor = "(B)V")
    public final void method3802(byte arg0) {
        this.method3803(arg0 - 3);
        if (arg0 != -72) {
            this.method3804(31);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/gca", name = "a", descriptor = "(I)V")
    private final void method3803(int arg0) {
        if (arg0 > -50) {
            this.field9435 = null;
        }
        while (true) {
            Reference var2 = this.field9433.poll();
            if (var2 == null) {
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3801((byte) -125, var3);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/gca", name = "b", descriptor = "(I)V")
    public final void method3804(int arg0) {
        if (arg0 != 22591) {
            this.method3802((byte) 57);
        }
        this.method3803(-85);
        while (this.field9434 != null) {
            this.method3801((byte) -113, this.field9434);
        }
        this.method3803(arg0 ^ 0xFFFFA79E);
    }
}
