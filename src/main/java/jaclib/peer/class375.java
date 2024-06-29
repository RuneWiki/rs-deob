package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/dba")
public class class375 {

    @OriginalMember(owner = "client!jaclib/peer/dba", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field5372 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/dba", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field5371;

    @OriginalMember(owner = "client!jaclib/peer/dba", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field5373;

    @OriginalMember(owner = "client!jaclib/peer/dba", name = "a", descriptor = "(Ljaclib/peer/PeerReference;I)V")
    private final void method2326(PeerReference arg0, int arg1) {
        arg0.method2324((byte) 84);
        if (arg1 != 12600) {
            return;
        }
        if (this.field5373 == arg0) {
            this.field5373 = arg0.field5369;
        }
        if (this.field5371 == arg0) {
            this.field5371 = arg0.field5370;
        }
        if (arg0.field5369 != null) {
            arg0.field5369.field5370 = arg0.field5370;
        }
        if (arg0.field5370 != null) {
            arg0.field5370.field5369 = arg0.field5369;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/dba", name = "a", descriptor = "(I)V")
    private final void method2327(int arg0) {
        if (arg0 >= -74) {
            return;
        }
        while (true) {
            Reference var2 = this.field5372.poll();
            if (var2 == null) {
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method2326(var3, 12600);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/dba", name = "a", descriptor = "(Z)V")
    public final void method2328(boolean arg0) {
        if (arg0) {
            this.method2327(-85);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/dba", name = "b", descriptor = "(Z)V")
    public final void method2329(boolean arg0) {
        this.method2327(-103);
        if (!arg0) {
            while (this.field5371 != null) {
                this.method2326(this.field5371, 12600);
            }
            this.method2327(-101);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/dba", name = "a", descriptor = "(ILjaclib/peer/PeerReference;)V")
    public final void method2330(int arg0, PeerReference arg1) {
        arg1.field5369 = null;
        if (arg0 != -30117) {
            this.field5371 = null;
        }
        arg1.field5370 = this.field5371;
        if (this.field5373 == null) {
            this.field5373 = arg1;
        } else {
            this.field5371.field5369 = arg1;
        }
        this.field5371 = arg1;
    }
}
