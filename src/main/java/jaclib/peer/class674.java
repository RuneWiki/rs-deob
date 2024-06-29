package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/uca")
public class class674 {

    @OriginalMember(owner = "client!jaclib/peer/uca", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field9351 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/uca", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9350;

    @OriginalMember(owner = "client!jaclib/peer/uca", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9352;

    @OriginalMember(owner = "client!jaclib/peer/uca", name = "a", descriptor = "(I)V")
    public final void method3752(int arg0) {
        this.method3753((byte) -71);
        int var2 = -23 % ((-arg0) / 36);
    }

    @OriginalMember(owner = "client!jaclib/peer/uca", name = "a", descriptor = "(B)V")
    private final void method3753(byte arg0) {
        while (true) {
            Reference var2 = this.field9351.poll();
            if (var2 == null) {
                if (arg0 >= -61) {
                    this.field9352 = null;
                }
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3754(var3, -9808);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/uca", name = "a", descriptor = "(Ljaclib/peer/PeerReference;I)V")
    private final void method3754(PeerReference arg0, int arg1) {
        arg0.method3751(0);
        if (arg1 != -9808) {
            return;
        }
        if (this.field9352 == arg0) {
            this.field9352 = arg0.field9348;
        }
        if (this.field9350 == arg0) {
            this.field9350 = arg0.field9349;
        }
        if (arg0.field9349 != null) {
            arg0.field9349.field9348 = arg0.field9348;
        }
        if (arg0.field9348 != null) {
            arg0.field9348.field9349 = arg0.field9349;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/uca", name = "a", descriptor = "(BLjaclib/peer/PeerReference;)V")
    public final void method3755(byte arg0, PeerReference arg1) {
        if (arg0 < 86) {
            this.field9351 = null;
        }
        arg1.field9348 = this.field9352;
        arg1.field9349 = null;
        if (this.field9350 == null) {
            this.field9350 = arg1;
        } else {
            this.field9352.field9349 = arg1;
        }
        this.field9352 = arg1;
    }

    @OriginalMember(owner = "client!jaclib/peer/uca", name = "b", descriptor = "(I)V")
    public final void method3756(int arg0) {
        if (arg0 != -13759) {
            this.field9352 = null;
        }
        this.method3753((byte) -102);
        while (this.field9352 != null) {
            this.method3754(this.field9352, -9808);
        }
        this.method3753((byte) -109);
    }
}
