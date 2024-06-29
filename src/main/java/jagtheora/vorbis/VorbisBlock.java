package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/vorbis/VorbisBlock")
public class VorbisBlock extends SimplePeer {

    @OriginalMember(owner = "client!jagtheora/vorbis/VorbisBlock", name = "clear", descriptor = "()V")
    protected final native void clear();

    @OriginalMember(owner = "client!jagtheora/vorbis/VorbisBlock", name = "<init>", descriptor = "(Ljagtheora/vorbis/DSPState;)V")
    public VorbisBlock(DSPState arg0) {
        this.init(arg0);
        if (this.method4067()) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!jagtheora/vorbis/VorbisBlock", name = "synthesis", descriptor = "(Ljagtheora/ogg/OggPacket;)I")
    public final native int synthesis(OggPacket arg0);

    @OriginalMember(owner = "client!jagtheora/vorbis/VorbisBlock", name = "init", descriptor = "(Ljagtheora/vorbis/DSPState;)V")
    private final native void init(DSPState arg0);
}
