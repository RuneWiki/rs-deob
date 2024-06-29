package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/mk")
public class class375 {

    @OriginalMember(owner = "client!jaclib/peer/mk", name = "a", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field5260 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/mk", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field5261;

    @OriginalMember(owner = "client!jaclib/peer/mk", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field5262;

    @OriginalMember(owner = "client!jaclib/peer/mk", name = "a", descriptor = "(Ljaclib/peer/PeerReference;I)V")
    public final void method2235(PeerReference arg0, int arg1) {
        arg0.field5264 = null;
        arg0.field5265 = this.field5262;
        if (this.field5261 == null) {
            this.field5261 = arg0;
        } else {
            this.field5262.field5264 = arg0;
        }
        int var3 = -34 / ((arg1 + 36) / 50);
        this.field5262 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/peer/mk", name = "b", descriptor = "(Ljaclib/peer/PeerReference;I)V")
    private final void method2236(PeerReference arg0, int arg1) {
        arg0.method2244(arg1 + 24871);
        if (this.field5262 == arg0) {
            this.field5262 = arg0.field5265;
        }
        if (this.field5261 == arg0) {
            this.field5261 = arg0.field5264;
        }
        if (arg1 != -24995) {
            this.method2238(-54);
        }
        if (arg0.field5264 != null) {
            arg0.field5264.field5265 = arg0.field5265;
        }
        if (arg0.field5265 != null) {
            arg0.field5265.field5264 = arg0.field5264;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/mk", name = "a", descriptor = "(B)V")
    private final void method2237(byte arg0) {
        while (true) {
            Reference var2 = this.field5260.poll();
            if (var2 == null) {
                int var4 = 118 % ((arg0 - 29) / 57);
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method2236(var3, -24995);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/mk", name = "a", descriptor = "(I)V")
    public final void method2238(int arg0) {
        if (arg0 == -9377) {
            this.method2237((byte) 86);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/mk", name = "b", descriptor = "(I)V")
    public final void method2239(int arg0) {
        this.method2237((byte) -57);
        while (this.field5262 != null) {
            this.method2236(this.field5262, -24995);
        }
        this.method2237((byte) 127);
        if (arg0 != -3147) {
            this.field5262 = null;
        }
    }
}
