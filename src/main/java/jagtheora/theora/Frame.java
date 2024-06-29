package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/theora/Frame")
public class Frame extends SimplePeer {

    @OriginalMember(owner = "client!jagtheora/theora/Frame", name = "a", descriptor = "I")
    public int field1977;

    @OriginalMember(owner = "client!jagtheora/theora/Frame", name = "b", descriptor = "I")
    public int field1978;

    @OriginalMember(owner = "client!jagtheora/theora/Frame", name = "pixels", descriptor = "[I")
    public int[] pixels;

    static {
        init();
    }

    @OriginalMember(owner = "client!jagtheora/theora/Frame", name = "<init>", descriptor = "(II)V", line = 8)
    public Frame(int arg0, int arg1) {
        this.field1977 = arg1;
        this.field1978 = arg0;
        this.pixels = new int[this.field1978 * this.field1977];
    }

    @OriginalMember(owner = "client!jagtheora/theora/Frame", name = "clear", descriptor = "()V")
    protected final native void clear();

    @OriginalMember(owner = "client!jagtheora/theora/Frame", name = "init", descriptor = "()V")
    private static final native void init();
}
