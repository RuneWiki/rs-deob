package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/vorbis/VorbisInfo")
public class VorbisInfo extends SimplePeer {

    @OriginalMember(owner = "client!jagtheora/vorbis/VorbisInfo", name = "channels", descriptor = "I")
    public int channels;

    @OriginalMember(owner = "client!jagtheora/vorbis/VorbisInfo", name = "rate", descriptor = "I")
    public int rate;

    static {
        initFields();
    }

    @OriginalMember(owner = "client!jagtheora/vorbis/VorbisInfo", name = "<init>", descriptor = "()V", line = 11)
    public VorbisInfo() {
        this.init();
        if (this.method4005()) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!jagtheora/vorbis/VorbisInfo", name = "headerIn", descriptor = "(Ljagtheora/vorbis/VorbisComment;Ljagtheora/ogg/OggPacket;)I")
    public final native int headerIn(VorbisComment arg0, OggPacket arg1);

    @OriginalMember(owner = "client!jagtheora/vorbis/VorbisInfo", name = "initFields", descriptor = "()V")
    private static final native void initFields();

    @OriginalMember(owner = "client!jagtheora/vorbis/VorbisInfo", name = "clear", descriptor = "()V")
    protected final native void clear();

    @OriginalMember(owner = "client!jagtheora/vorbis/VorbisInfo", name = "init", descriptor = "()V")
    private final native void init();
}
