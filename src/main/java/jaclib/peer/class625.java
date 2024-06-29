package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/am")
public class class625 {

    @OriginalMember(owner = "client!jaclib/peer/am", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field8731 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/am", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8729;

    @OriginalMember(owner = "client!jaclib/peer/am", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8730;

    @OriginalMember(owner = "client!jaclib/peer/am", name = "a", descriptor = "(B)V", line = 7)
    public final void method3438(byte arg0) {
        if (arg0 < -50) {
            this.method3442(119);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/am", name = "a", descriptor = "(Ljaclib/peer/PeerReference;B)V", line = 17)
    public final void method3439(PeerReference arg0, byte arg1) {
        arg0.field8728 = this.field8730;
        arg0.field8727 = null;
        if (this.field8729 == null) {
            this.field8729 = arg0;
        } else {
            this.field8730.field8727 = arg0;
        }
        if (arg1 >= 119) {
            this.field8730 = arg0;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/am", name = "b", descriptor = "(Ljaclib/peer/PeerReference;B)V", line = 34)
    private final void method3440(PeerReference arg0, byte arg1) {
        arg0.method3437((byte) 101);
        if (this.field8730 == arg0) {
            this.field8730 = arg0.field8728;
        }
        if (arg1 != -26) {
            return;
        }
        if (this.field8729 == arg0) {
            this.field8729 = arg0.field8727;
        }
        if (arg0.field8727 != null) {
            arg0.field8727.field8728 = arg0.field8728;
        }
        if (arg0.field8728 != null) {
            arg0.field8728.field8727 = arg0.field8727;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/am", name = "b", descriptor = "(B)V", line = 59)
    public final void method3441(byte arg0) {
        this.method3442(117);
        while (this.field8730 != null) {
            this.method3440(this.field8730, (byte) -26);
        }
        if (arg0 >= -5) {
            this.method3442(-7);
        }
        this.method3442(90);
    }

    @OriginalMember(owner = "client!jaclib/peer/am", name = "a", descriptor = "(I)V", line = 73)
    private final void method3442(int arg0) {
        if (arg0 <= 56) {
            this.field8729 = null;
        }
        while (true) {
            Reference var2 = this.field8731.poll();
            if (var2 == null) {
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3440(var3, (byte) -26);
        }
    }
}
