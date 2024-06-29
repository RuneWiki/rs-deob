package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/wf")
public class class669 {

    @OriginalMember(owner = "client!jaclib/peer/wf", name = "a", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field9395 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/wf", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9396;

    @OriginalMember(owner = "client!jaclib/peer/wf", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9397;

    @OriginalMember(owner = "client!jaclib/peer/wf", name = "a", descriptor = "(B)V", line = 6)
    public final void method3777(byte arg0) {
        int var2 = 110 % ((arg0 + 17) / 60);
        this.method3780(15165);
    }

    @OriginalMember(owner = "client!jaclib/peer/wf", name = "a", descriptor = "(BLjaclib/peer/PeerReference;)V", line = 15)
    public final void method3778(byte arg0, PeerReference arg1) {
        if (arg0 != -55) {
            this.field9395 = null;
        }
        arg1.field9399 = this.field9396;
        arg1.field9400 = null;
        if (this.field9397 == null) {
            this.field9397 = arg1;
        } else {
            this.field9396.field9400 = arg1;
        }
        this.field9396 = arg1;
    }

    @OriginalMember(owner = "client!jaclib/peer/wf", name = "a", descriptor = "(ILjaclib/peer/PeerReference;)V", line = 32)
    private final void method3779(int arg0, PeerReference arg1) {
        arg1.method3785(true);
        if (this.field9396 == arg1) {
            this.field9396 = arg1.field9399;
        }
        if (this.field9397 == arg1) {
            this.field9397 = arg1.field9400;
        }
        if (arg1.field9400 != null) {
            arg1.field9400.field9399 = arg1.field9399;
        }
        if (arg0 != 16087) {
            this.method3781((byte) -98);
        }
        if (arg1.field9399 != null) {
            arg1.field9399.field9400 = arg1.field9400;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/wf", name = "a", descriptor = "(I)V", line = 61)
    private final void method3780(int arg0) {
        while (true) {
            Reference var2 = this.field9395.poll();
            if (var2 == null) {
                if (arg0 != 15165) {
                    this.field9397 = null;
                }
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3779(16087, var3);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/wf", name = "b", descriptor = "(B)V", line = 82)
    public final void method3781(byte arg0) {
        this.method3780(15165);
        while (this.field9396 != null) {
            this.method3779(16087, this.field9396);
        }
        this.method3780(15165);
        int var2 = -105 / ((arg0 - 71) / 32);
    }
}
