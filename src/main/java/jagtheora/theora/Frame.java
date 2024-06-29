package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/theora/Frame")
public class Frame extends SimplePeer {

    @OriginalMember(owner = "client!jagtheora/theora/Frame", name = "a", descriptor = "I")
    public int field10245;

    @OriginalMember(owner = "client!jagtheora/theora/Frame", name = "b", descriptor = "I")
    public int field10246;

    @OriginalMember(owner = "client!jagtheora/theora/Frame", name = "pixels", descriptor = "[I")
    public int[] pixels;

    @OriginalMember(owner = "client!jagtheora/theora/Frame", name = "init", descriptor = "()V")
    private static final native void init();

    @OriginalMember(owner = "client!jagtheora/theora/Frame", name = "clear", descriptor = "()V")
    protected final native void clear();

    @OriginalMember(owner = "client!jagtheora/theora/Frame", name = "<init>", descriptor = "(II)V")
    public Frame(int arg0, int arg1) {
        this.field10245 = arg0;
        this.field10246 = arg1;
        this.pixels = new int[this.field10246 * this.field10245];
    }

    static {
        init();
    }
}
