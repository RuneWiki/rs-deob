package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/vo")
public class class246 {

    @OriginalMember(owner = "client!jaclib/peer/vo", name = "a", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field3329 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/vo", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field3330;

    @OriginalMember(owner = "client!jaclib/peer/vo", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field3331;

    @OriginalMember(owner = "client!jaclib/peer/vo", name = "a", descriptor = "(I)V", line = 5)
    public final void method1539(int arg0) {
        if (arg0 < 44) {
            return;
        }
        this.method1543((byte) 67);
        while (this.field3331 != null) {
            this.method1541(true, this.field3331);
        }
        this.method1543((byte) 77);
    }

    @OriginalMember(owner = "client!jaclib/peer/vo", name = "a", descriptor = "(ILjaclib/peer/PeerReference;)V", line = 19)
    public final void method1540(int arg0, PeerReference arg1) {
        arg1.field3333 = null;
        int var3 = 18 / ((arg0 - 56) / 47);
        arg1.field3334 = this.field3331;
        if (this.field3330 == null) {
            this.field3330 = arg1;
        } else {
            this.field3331.field3333 = arg1;
        }
        this.field3331 = arg1;
    }

    @OriginalMember(owner = "client!jaclib/peer/vo", name = "a", descriptor = "(ZLjaclib/peer/PeerReference;)V", line = 35)
    private final void method1541(boolean arg0, PeerReference arg1) {
        if (!arg0) {
            this.method1541(true, null);
        }
        arg1.method1548(0);
        if (this.field3330 == arg1) {
            this.field3330 = arg1.field3333;
        }
        if (this.field3331 == arg1) {
            this.field3331 = arg1.field3334;
        }
        if (arg1.field3333 != null) {
            arg1.field3333.field3334 = arg1.field3334;
        }
        if (arg1.field3334 != null) {
            arg1.field3334.field3333 = arg1.field3333;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/vo", name = "a", descriptor = "(B)V", line = 60)
    public final void method1542(byte arg0) {
        if (arg0 != 13) {
            this.method1542((byte) 33);
        }
        this.method1543((byte) 61);
    }

    @OriginalMember(owner = "client!jaclib/peer/vo", name = "b", descriptor = "(B)V", line = 75)
    private final void method1543(byte arg0) {
        while (true) {
            Reference var2 = this.field3329.poll();
            if (var2 == null) {
                if (arg0 < 56) {
                    this.field3331 = null;
                }
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method1541(true, var3);
        }
    }
}
