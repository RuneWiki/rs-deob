package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/cv")
public class class587 {

    @OriginalMember(owner = "client!jaclib/peer/cv", name = "b", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field8433 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/cv", name = "a", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8432;

    @OriginalMember(owner = "client!jaclib/peer/cv", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field8434;

    @OriginalMember(owner = "client!jaclib/peer/cv", name = "a", descriptor = "(I)V", line = 7)
    public final void method3430(int arg0) {
        this.method3431((byte) 16);
        while (this.field8434 != null) {
            this.method3432(arg0 ^ 0xFFFFC7D7, this.field8434);
        }
        if (arg0 != -16501) {
            this.method3433((byte) 89);
        }
        this.method3431((byte) 16);
    }

    @OriginalMember(owner = "client!jaclib/peer/cv", name = "a", descriptor = "(B)V", line = 24)
    private final void method3431(byte arg0) {
        while (true) {
            Reference var2 = this.field8433.poll();
            if (var2 == null) {
                if (arg0 != 16) {
                    this.field8433 = null;
                }
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method3432(30812, var3);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/cv", name = "a", descriptor = "(ILjaclib/peer/PeerReference;)V", line = 43)
    private final void method3432(int arg0, PeerReference arg1) {
        arg1.method3428(0);
        if (arg0 != 30812) {
            this.method3433((byte) 82);
        }
        if (this.field8432 == arg1) {
            this.field8432 = arg1.field8430;
        }
        if (this.field8434 == arg1) {
            this.field8434 = arg1.field8431;
        }
        if (arg1.field8430 != null) {
            arg1.field8430.field8431 = arg1.field8431;
        }
        if (arg1.field8431 != null) {
            arg1.field8431.field8430 = arg1.field8430;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/cv", name = "b", descriptor = "(B)V", line = 69)
    public final void method3433(byte arg0) {
        this.method3431((byte) 16);
        if (arg0 != 29) {
            this.method3432(-109, null);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/cv", name = "a", descriptor = "(BLjaclib/peer/PeerReference;)V", line = 79)
    public final void method3434(byte arg0, PeerReference arg1) {
        arg1.field8431 = this.field8434;
        arg1.field8430 = null;
        if (this.field8432 == null) {
            this.field8432 = arg1;
        } else {
            this.field8434.field8430 = arg1;
        }
        if (arg0 >= -75) {
            this.field8433 = null;
        }
        this.field8434 = arg1;
    }
}
