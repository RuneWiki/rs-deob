package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/ik")
public class class571 {

    @OriginalMember(owner = "client!jaclib/peer/ik", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field7972 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/ik", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field7971;

    @OriginalMember(owner = "client!jaclib/peer/ik", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field7973;

    @OriginalMember(owner = "client!jaclib/peer/ik", name = "a", descriptor = "(B)V")
    public final void method3215(byte arg0) {
        this.method3218((byte) 34);
        while (this.field7971 != null) {
            this.method3219(115, this.field7971);
        }
        this.method3218((byte) 34);
        if (arg0 != 51) {
            this.method3218((byte) 40);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/ik", name = "a", descriptor = "(Ljaclib/peer/PeerReference;I)V")
    public final void method3216(PeerReference arg0, int arg1) {
        arg0.field7969 = this.field7971;
        if (arg1 != 20378) {
            return;
        }
        arg0.field7970 = null;
        if (this.field7973 == null) {
            this.field7973 = arg0;
        } else {
            this.field7971.field7970 = arg0;
        }
        this.field7971 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/peer/ik", name = "a", descriptor = "(I)V")
    public final void method3217(int arg0) {
        this.method3218((byte) 34);
        if (arg0 != -31873) {
            this.field7972 = null;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/ik", name = "b", descriptor = "(B)V")
    private final void method3218(byte arg0) {
        while (true) {
            Reference var2 = this.field7972.poll();
            if (var2 == null) {
                if (arg0 != 34) {
                    this.field7972 = null;
                }
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3219(121, var3);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/ik", name = "a", descriptor = "(ILjaclib/peer/PeerReference;)V")
    private final void method3219(int arg0, PeerReference arg1) {
        arg1.method3213(0);
        if (this.field7971 == arg1) {
            this.field7971 = arg1.field7969;
        }
        if (arg0 <= 94) {
            return;
        }
        if (this.field7973 == arg1) {
            this.field7973 = arg1.field7970;
        }
        if (arg1.field7970 != null) {
            arg1.field7970.field7969 = arg1.field7969;
        }
        if (arg1.field7969 != null) {
            arg1.field7969.field7970 = arg1.field7970;
        }
    }
}
