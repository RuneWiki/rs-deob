package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/pba")
public class class703 {

    @OriginalMember(owner = "client!jaclib/peer/pba", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field9900 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/pba", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9899;

    @OriginalMember(owner = "client!jaclib/peer/pba", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9901;

    @OriginalMember(owner = "client!jaclib/peer/pba", name = "a", descriptor = "(B)V", line = 5)
    public final void method3998(byte arg0) {
        this.method4001(arg0 - 22496);
        while (this.field9899 != null) {
            this.method4002(-105, this.field9899);
        }
        this.method4001(-22448);
        if (arg0 != 48) {
            this.field9900 = null;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/pba", name = "b", descriptor = "(B)V", line = 21)
    public final void method3999(byte arg0) {
        this.method4001(-22448);
        if (arg0 > -41) {
            this.field9899 = null;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/pba", name = "a", descriptor = "(ILjaclib/peer/PeerReference;)V", line = 31)
    public final void method4000(int arg0, PeerReference arg1) {
        arg1.field9898 = null;
        arg1.field9897 = this.field9899;
        if (arg0 != -15128) {
            return;
        }
        if (this.field9901 == null) {
            this.field9901 = arg1;
        } else {
            this.field9899.field9898 = arg1;
        }
        this.field9899 = arg1;
    }

    @OriginalMember(owner = "client!jaclib/peer/pba", name = "a", descriptor = "(I)V", line = 49)
    private final void method4001(int arg0) {
        if (arg0 != -22448) {
            this.method4001(-19);
        }
        while (true) {
            Reference var2 = this.field9900.poll();
            if (var2 == null) {
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method4002(-87, var3);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/pba", name = "b", descriptor = "(ILjaclib/peer/PeerReference;)V", line = 71)
    private final void method4002(int arg0, PeerReference arg1) {
        if (arg0 >= -70) {
            return;
        }
        arg1.method3997(-8405);
        if (this.field9899 == arg1) {
            this.field9899 = arg1.field9897;
        }
        if (this.field9901 == arg1) {
            this.field9901 = arg1.field9898;
        }
        if (arg1.field9898 != null) {
            arg1.field9898.field9897 = arg1.field9897;
        }
        if (arg1.field9897 != null) {
            arg1.field9897.field9898 = arg1.field9898;
        }
    }
}
