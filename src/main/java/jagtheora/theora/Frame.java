package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/theora/Frame")
public class Frame extends SimplePeer {

    @OriginalMember(owner = "client!jagtheora/theora/Frame", name = "a", descriptor = "I")
    public int field10760;

    @OriginalMember(owner = "client!jagtheora/theora/Frame", name = "b", descriptor = "I")
    public int field10759;

    @OriginalMember(owner = "client!jagtheora/theora/Frame", name = "pixels", descriptor = "[I")
    public int[] pixels;

    @OriginalMember(owner = "client!jagtheora/theora/Frame", name = "<init>", descriptor = "(II)V")
    public Frame(int arg0, int arg1) {
        this.field10760 = arg0;
        this.field10759 = arg1;
        this.pixels = new int[this.field10760 * this.field10759];
    }

    @OriginalMember(owner = "client!jagtheora/theora/Frame", name = "init", descriptor = "()V")
    private static final native void init();

    @OriginalMember(owner = "client!jagtheora/theora/Frame", name = "clear", descriptor = "()V")
    protected final native void clear();

    static {
        init();
    }
}
