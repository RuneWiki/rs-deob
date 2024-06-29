package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/bw")
public class class701 {

    @OriginalMember(owner = "client!jaclib/peer/bw", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field10193 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/bw", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field10192;

    @OriginalMember(owner = "client!jaclib/peer/bw", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field10194;

    @OriginalMember(owner = "client!jaclib/peer/bw", name = "a", descriptor = "(B)V")
    public final void method5122(byte arg0) {
        this.method5124(-32045);
        int var2 = 64 / ((74 - arg0) / 35);
    }

    @OriginalMember(owner = "client!jaclib/peer/bw", name = "b", descriptor = "(ILjaclib/peer/PeerReference;)V")
    public final void method5123(int arg0, PeerReference arg1) {
        arg1.field10191 = null;
        arg1.field10190 = this.field10192;
        int var3 = -50 % ((arg0 + 2) / 54);
        if (this.field10194 == null) {
            this.field10194 = arg1;
        } else {
            this.field10192.field10191 = arg1;
        }
        this.field10192 = arg1;
    }

    @OriginalMember(owner = "client!jaclib/peer/bw", name = "a", descriptor = "(I)V")
    private final void method5124(int arg0) {
        while (true) {
            Reference var2 = this.field10193.poll();
            if (var2 == null) {
                if (arg0 != -32045) {
                    this.method5125(-116, null);
                }
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method5125(arg0 ^ 0xFFFFBB6A, var3);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/bw", name = "a", descriptor = "(ILjaclib/peer/PeerReference;)V")
    private final void method5125(int arg0, PeerReference arg1) {
        if (arg0 != 14777) {
            return;
        }
        arg1.method5120((byte) -73);
        if (this.field10192 == arg1) {
            this.field10192 = arg1.field10190;
        }
        if (this.field10194 == arg1) {
            this.field10194 = arg1.field10191;
        }
        if (arg1.field10191 != null) {
            arg1.field10191.field10190 = arg1.field10190;
        }
        if (arg1.field10190 != null) {
            arg1.field10190.field10191 = arg1.field10191;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/bw", name = "b", descriptor = "(I)V")
    public final void method5126(int arg0) {
        this.method5124(-32045);
        while (this.field10192 != null) {
            this.method5125(14777, this.field10192);
        }
        this.method5124(-32045);
        int var2 = 14 / ((-arg0 - 78) / 48);
    }
}
