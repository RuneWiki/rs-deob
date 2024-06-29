package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/jd")
public class class339 {

    @OriginalMember(owner = "client!jaclib/peer/jd", name = "a", descriptor = "Ljava/lang/ref/ReferenceQueue;")
    public ReferenceQueue field4703 = new ReferenceQueue();

    @OriginalMember(owner = "client!jaclib/peer/jd", name = "b", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field4704;

    @OriginalMember(owner = "client!jaclib/peer/jd", name = "c", descriptor = "Ljaclib/peer/PeerReference;")
    private PeerReference field4705;

    @OriginalMember(owner = "client!jaclib/peer/jd", name = "a", descriptor = "(Ljaclib/peer/PeerReference;B)V")
    public final void method2018(PeerReference arg0, byte arg1) {
        arg0.field4702 = null;
        arg0.field4701 = this.field4705;
        if (this.field4704 == null) {
            this.field4704 = arg0;
        } else {
            this.field4705.field4702 = arg0;
        }
        if (arg1 == 8) {
            this.field4705 = arg0;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/jd", name = "a", descriptor = "(I)V")
    public final void method2019(int arg0) {
        this.method2021(15119);
        if (arg0 != 15977) {
            this.method2020(28, null);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/jd", name = "a", descriptor = "(ILjaclib/peer/PeerReference;)V")
    private final void method2020(int arg0, PeerReference arg1) {
        arg1.method2016(-5352);
        int var3 = 102 / ((-arg0 - 50) / 59);
        if (this.field4705 == arg1) {
            this.field4705 = arg1.field4701;
        }
        if (this.field4704 == arg1) {
            this.field4704 = arg1.field4702;
        }
        if (arg1.field4702 != null) {
            arg1.field4702.field4701 = arg1.field4701;
        }
        if (arg1.field4701 != null) {
            arg1.field4701.field4702 = arg1.field4702;
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/jd", name = "b", descriptor = "(I)V")
    private final void method2021(int arg0) {
        while (true) {
            Reference var2 = this.field4703.poll();
            if (var2 == null) {
                if (arg0 != 15119) {
                    this.method2020(-99, null);
                }
                return;
            }
            PeerReference var3 = (PeerReference) var2;
            this.method2020(arg0 - 15080, var3);
        }
    }

    @OriginalMember(owner = "client!jaclib/peer/jd", name = "c", descriptor = "(I)V")
    public final void method2022(int arg0) {
        this.method2021(15119);
        while (this.field4705 != null) {
            this.method2020(-120, this.field4705);
        }
        if (arg0 == 14821) {
            this.method2021(15119);
        }
    }
}
