package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/pe")
public class class576 {

    @OriginalMember(owner = "client!jaclib/peer/pe", name = "a", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field8414 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/pe", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8415;

    @OriginalMember(owner = "client!jaclib/peer/pe", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8416;

    @OriginalMember(owner = "client!jaclib/peer/pe", name = "a", descriptor = "(I)V")
    private final void method3356(int arg0) {
        int var2 = 54 % ((arg0 + 21) / 39);
        while (true) {
            Reference var3 = this.field8414.poll();
            if (var3 == null) {
                return;
            }
            PeerReference var4 = (PeerReference) var3;
            this.method3357(var4, (byte) 12);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/pe", name = "a", descriptor = "(Ljaclib/peer/PeerReference;B)V")
    private final void method3357(PeerReference arg0, byte arg1) {
        arg0.method3353(0);
        if (this.field8415 == arg0) {
            this.field8415 = arg0.field8413;
        }
        int var3 = 111 / ((arg1 - 74) / 37);
        if (this.field8416 == arg0) {
            this.field8416 = arg0.field8412;
        }
        if (arg0.field8413 != null) {
            arg0.field8413.field8412 = arg0.field8412;
        }
        if (arg0.field8412 != null) {
            arg0.field8412.field8413 = arg0.field8413;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/pe", name = "a", descriptor = "(ILjaclib/peer/PeerReference;)V")
    public final void method3358(int arg0, PeerReference arg1) {
        if (arg0 != -13821) {
            return;
        }
        arg1.field8412 = this.field8416;
        arg1.field8413 = null;
        if (this.field8415 == null) {
            this.field8415 = arg1;
        } else {
            this.field8416.field8413 = arg1;
        }
        this.field8416 = arg1;
    }

    @OriginalMember(owner = "client!jaclib/peer/pe", name = "b", descriptor = "(I)V")
    public final void method3359(int arg0) {
        int var2 = -68 % ((-arg0 - 47) / 34);
        this.method3356(-88);
    }

    @OriginalMember(owner = "client!jaclib/peer/pe", name = "c", descriptor = "(I)V")
    public final void method3360(int arg0) {
        this.method3356(105);
        if (arg0 != -27803) {
            this.field8416 = null;
        }
        while (this.field8416 != null) {
            this.method3357(this.field8416, (byte) 120);
        }
        this.method3356(41);
    }
}
