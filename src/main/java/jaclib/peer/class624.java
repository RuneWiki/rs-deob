package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/jv")
public class class624 {

    @OriginalMember(owner = "client!jaclib/peer/jv", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field8762 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/jv", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8761;

    @OriginalMember(owner = "client!jaclib/peer/jv", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8763;

    @OriginalMember(owner = "client!jaclib/peer/jv", name = "a", descriptor = "(B)V")
    public final void method3487(byte arg0) {
        if (arg0 != 116) {
            this.field8762 = null;
        }
        this.method3489((byte) 42);
    }

    @OriginalMember(owner = "client!jaclib/peer/jv", name = "a", descriptor = "(ILjaclib/peer/PeerReference;)V")
    private final void method3488(int arg0, PeerReference arg1) {
        arg1.method3494(-14186);
        if (this.field8763 == arg1) {
            this.field8763 = arg1.field8766;
        }
        if (arg0 != -31202) {
            this.method3491(70, null);
        }
        if (this.field8761 == arg1) {
            this.field8761 = arg1.field8765;
        }
        if (arg1.field8765 != null) {
            arg1.field8765.field8766 = arg1.field8766;
        }
        if (arg1.field8766 != null) {
            arg1.field8766.field8765 = arg1.field8765;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/jv", name = "b", descriptor = "(B)V")
    private final void method3489(byte arg0) {
        while (true) {
            Reference var2 = this.field8762.poll();
            if (var2 == null) {
                if (arg0 != 42) {
                    this.method3488(-124, null);
                }
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3488(arg0 - 31244, var3);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/jv", name = "c", descriptor = "(B)V")
    public final void method3490(byte arg0) {
        if (arg0 != -84) {
            this.method3488(-53, null);
        }
        this.method3489((byte) 42);
        while (this.field8763 != null) {
            this.method3488(-31202, this.field8763);
        }
        this.method3489((byte) 42);
    }

    @OriginalMember(owner = "client!jaclib/peer/jv", name = "b", descriptor = "(ILjaclib/peer/PeerReference;)V")
    public final void method3491(int arg0, PeerReference arg1) {
        arg1.field8765 = null;
        arg1.field8766 = this.field8763;
        if (arg0 != 19852) {
            this.method3488(60, null);
        }
        if (this.field8761 == null) {
            this.field8761 = arg1;
        } else {
            this.field8763.field8765 = arg1;
        }
        this.field8763 = arg1;
    }
}
