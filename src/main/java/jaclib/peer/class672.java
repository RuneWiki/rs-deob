package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/jaa")
public class class672 {

    @OriginalMember(owner = "client!jaclib/peer/jaa", name = "a", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field9343 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/jaa", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9344;

    @OriginalMember(owner = "client!jaclib/peer/jaa", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field9345;

    @OriginalMember(owner = "client!jaclib/peer/jaa", name = "a", descriptor = "(B)V")
    public final void method3802(byte arg0) {
        this.method3806(-16615);
        int var2 = 110 % ((64 - arg0) / 60);
    }

    @OriginalMember(owner = "client!jaclib/peer/jaa", name = "a", descriptor = "(Ljaclib/peer/PeerReference;B)V")
    private final void method3803(PeerReference arg0, byte arg1) {
        arg0.method3799(0);
        if (this.field9345 == arg0) {
            this.field9345 = arg0.field9341;
        }
        if (this.field9344 == arg0) {
            this.field9344 = arg0.field9342;
        }
        if (arg0.field9341 != null) {
            arg0.field9341.field9342 = arg0.field9342;
        }
        if (arg0.field9342 != null) {
            arg0.field9342.field9341 = arg0.field9341;
        }
        if (arg1 != 69) {
            this.field9344 = null;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/jaa", name = "b", descriptor = "(B)V")
    public final void method3804(byte arg0) {
        if (arg0 >= -122) {
            this.method3804((byte) 116);
        }
        this.method3806(-16615);
        while (this.field9344 != null) {
            this.method3803(this.field9344, (byte) 69);
        }
        this.method3806(-16615);
    }

    @OriginalMember(owner = "client!jaclib/peer/jaa", name = "a", descriptor = "(Ljaclib/peer/PeerReference;I)V")
    public final void method3805(PeerReference arg0, int arg1) {
        arg0.field9342 = this.field9344;
        arg0.field9341 = null;
        if (this.field9345 == null) {
            this.field9345 = arg0;
        } else {
            this.field9344.field9341 = arg0;
        }
        this.field9344 = arg0;
        if (arg1 != -31112) {
            this.method3805(null, 1);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/jaa", name = "a", descriptor = "(I)V")
    private final void method3806(int arg0) {
        while (true) {
            Reference var2 = this.field9343.poll();
            if (var2 == null) {
                if (arg0 != -16615) {
                    this.method3803(null, (byte) 127);
                }
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3803(var3, (byte) 69);
        }
    }
}
