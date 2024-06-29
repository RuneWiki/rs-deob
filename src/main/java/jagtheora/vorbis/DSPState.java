package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/vorbis/DSPState")
public class DSPState extends SimplePeer {

    @OriginalMember(owner = "client!jagtheora/vorbis/DSPState", name = "<init>", descriptor = "(Ljagtheora/vorbis/VorbisInfo;)V", line = 9)
    public DSPState(VorbisInfo arg0) {
        this.init(arg0);
        if (this.method4128()) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!jagtheora/vorbis/DSPState", name = "pcmOut", descriptor = "(I)[[F")
    public final native float[][] pcmOut(int arg0);

    @OriginalMember(owner = "client!jagtheora/vorbis/DSPState", name = "clear", descriptor = "()V")
    protected final native void clear();

    @OriginalMember(owner = "client!jagtheora/vorbis/DSPState", name = "init", descriptor = "(Ljagtheora/vorbis/VorbisInfo;)V")
    private final native void init(VorbisInfo arg0);

    @OriginalMember(owner = "client!jagtheora/vorbis/DSPState", name = "granuleTime", descriptor = "()D")
    public final native double granuleTime();

    @OriginalMember(owner = "client!jagtheora/vorbis/DSPState", name = "read", descriptor = "(I)V")
    public final native void read(int arg0);

    @OriginalMember(owner = "client!jagtheora/vorbis/DSPState", name = "blockIn", descriptor = "(Ljagtheora/vorbis/VorbisBlock;)V")
    public final native void blockIn(VorbisBlock arg0);
}
