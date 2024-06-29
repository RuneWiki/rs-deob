package jagtheora.misc;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/misc/SimplePeer")
public abstract class SimplePeer {

    @OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "peer", descriptor = "J")
    private long peer;

    @OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "clear", descriptor = "()V")
    protected abstract void clear();

    @OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "a", descriptor = "()V")
    public final void method3996() {
        if (!this.method3997()) {
            this.clear();
        }
    }

    @OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (!this.method3997()) {
            this.method3996();
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "init", descriptor = "()V")
    private static final native void init();

    @OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "setPeer", descriptor = "(J)V")
    private final void setPeer(long arg0) {
        this.peer = arg0;
    }

    @OriginalMember(owner = "client!jagtheora/misc/SimplePeer", name = "b", descriptor = "()Z")
    public final boolean method3997() {
        return this.peer == 0L;
    }

    static {
        init();
    }
}
