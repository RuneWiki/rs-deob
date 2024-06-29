package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/theora/Frame")
public class Frame extends SimplePeer {

    @OriginalMember(owner = "client!jagtheora/theora/Frame", name = "a", descriptor = "I")
    public int field9931;

    @OriginalMember(owner = "client!jagtheora/theora/Frame", name = "b", descriptor = "I")
    public int field9932;

    @OriginalMember(owner = "client!jagtheora/theora/Frame", name = "pixels", descriptor = "[I")
    public int[] pixels;

    static {
        init();
    }

    @OriginalMember(owner = "client!jagtheora/theora/Frame", name = "<init>", descriptor = "(II)V", line = 7)
    public Frame(int arg0, int arg1) {
        this.field9931 = arg0;
        this.field9932 = arg1;
        this.pixels = new int[this.field9932 * this.field9931];
    }

    @OriginalMember(owner = "client!jagtheora/theora/Frame", name = "init", descriptor = "()V")
    private static final native void init();

    @OriginalMember(owner = "client!jagtheora/theora/Frame", name = "clear", descriptor = "()V")
    protected final native void clear();
}
