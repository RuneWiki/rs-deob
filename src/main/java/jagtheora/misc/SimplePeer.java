package jagtheora.misc;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/misc/SimplePeer")
public abstract class SimplePeer {

    @OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "peer", descriptor = "J")
    private long peer;

    static {
        init();
    }

    @OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "a", descriptor = "()Z", line = 4)
    public final boolean method993() {
        return this.peer == 0L;
    }

    @OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "finalize", descriptor = "()V", line = 13)
    protected final void finalize() throws Throwable {
        if (!this.method993()) {
            this.method994();
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "setPeer", descriptor = "(J)V", line = 35)
    private final void setPeer(long arg0) {
        this.peer = arg0;
    }

    @OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "b", descriptor = "()V", line = 44)
    public final void method994() {
        if (!this.method993()) {
            this.clear();
        }
    }

    @OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "clear", descriptor = "()V")
    protected abstract void clear();

    @OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "init", descriptor = "()V")
    private static final native void init();
}
