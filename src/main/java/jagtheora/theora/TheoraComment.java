package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/theora/TheoraComment")
public class TheoraComment extends SimplePeer {

    @OriginalMember(owner = "client!jagtheora/theora/TheoraComment", name = "clear", descriptor = "()V")
    protected final native void clear();

    @OriginalMember(owner = "client!jagtheora/theora/TheoraComment", name = "init", descriptor = "()V")
    private final native void init();

    @OriginalMember(owner = "client!jagtheora/theora/TheoraComment", name = "<init>", descriptor = "()V")
    public TheoraComment() {
        this.init();
        if (this.method4008()) {
            throw new IllegalStateException();
        }
    }
}
