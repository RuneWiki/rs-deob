package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/theora/TheoraInfo")
public class TheoraInfo extends SimplePeer {

    @OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "versionMajor", descriptor = "B")
    public byte versionMajor;

    @OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "versionMinor", descriptor = "B")
    public byte versionMinor;

    @OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "versionSubMinor", descriptor = "B")
    public byte versionSubMinor;

    @OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "aspectDenominator", descriptor = "I")
    public int aspectDenominator;

    @OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "aspectNumerator", descriptor = "I")
    public int aspectNumerator;

    @OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "colourSpace", descriptor = "I")
    public int colourSpace;

    @OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "fpsDenominator", descriptor = "I")
    public int fpsDenominator;

    @OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "fpsNumerator", descriptor = "I")
    public int fpsNumerator;

    @OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "frameHeight", descriptor = "I")
    public int frameHeight;

    @OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "frameWidth", descriptor = "I")
    public int frameWidth;

    @OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "picHeight", descriptor = "I")
    public int picHeight;

    @OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "picWidth", descriptor = "I")
    public int picWidth;

    @OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "picX", descriptor = "I")
    public int picX;

    @OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "picY", descriptor = "I")
    public int picY;

    @OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "pixelFormat", descriptor = "I")
    public int pixelFormat;

    @OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "initFields", descriptor = "()V")
    private static final native void initFields();

    @OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "clear", descriptor = "()V")
    protected final native void clear();

    @OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "init", descriptor = "()V")
    private final native void init();

    @OriginalMember(owner = "client!jagtheora/theora/TheoraInfo", name = "<init>", descriptor = "()V")
    public TheoraInfo() {
        this.init();
        if (this.method5418()) {
            throw new IllegalStateException();
        }
    }

    static {
        initFields();
    }
}
