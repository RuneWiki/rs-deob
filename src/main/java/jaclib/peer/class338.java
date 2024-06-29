package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/aaa")
public class class338 {

    @OriginalMember(owner = "client!jaclib/peer/aaa", name = "c", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field4366 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/aaa", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field4364;

    @OriginalMember(owner = "client!jaclib/peer/aaa", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field4365;

    @OriginalMember(owner = "client!jaclib/peer/aaa", name = "a", descriptor = "(I)V")
    public final void method1936(int arg0) {
        if (arg0 != -28275) {
            this.field4364 = null;
        }
        this.method1940(arg0 ^ 0xFFFFC6BB);
    }

    @OriginalMember(owner = "client!jaclib/peer/aaa", name = "a", descriptor = "(ILjaclib/peer/PeerReference;)V")
    public final void method1937(int arg0, PeerReference arg1) {
        arg1.field4368 = this.field4364;
        if (arg0 != 11343) {
            this.method1939(-11);
        }
        arg1.field4369 = null;
        if (this.field4365 == null) {
            this.field4365 = arg1;
        } else {
            this.field4364.field4369 = arg1;
        }
        this.field4364 = arg1;
    }

    @OriginalMember(owner = "client!jaclib/peer/aaa", name = "a", descriptor = "(Ljaclib/peer/PeerReference;I)V")
    private final void method1938(PeerReference arg0, int arg1) {
        arg0.method1946(0);
        if (this.field4364 == arg0) {
            this.field4364 = arg0.field4368;
        }
        if (this.field4365 == arg0) {
            this.field4365 = arg0.field4369;
        }
        if (arg0.field4369 != null) {
            arg0.field4369.field4368 = arg0.field4368;
        }
        if (arg0.field4368 != null) {
            arg0.field4368.field4369 = arg0.field4369;
        }
        if (arg1 != 3537) {
            this.field4364 = null;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/aaa", name = "b", descriptor = "(I)V")
    public final void method1939(int arg0) {
        this.method1940(22326);
        while (this.field4364 != null) {
            this.method1938(this.field4364, 3537);
        }
        if (arg0 != 7622) {
            this.field4365 = null;
        }
        this.method1940(arg0 + 14704);
    }

    @OriginalMember(owner = "client!jaclib/peer/aaa", name = "c", descriptor = "(I)V")
    private final void method1940(int arg0) {
        if (arg0 != 22326) {
            this.method1939(-8);
        }
        while (true) {
            Reference var2 = this.field4366.poll();
            if (var2 == null) {
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method1938(var3, arg0 ^ 0x5AE7);
        }
    }
}
