package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/vorbis/VorbisComment")
public class VorbisComment extends SimplePeer {

    @OriginalMember(owner = "client!jagtheora/vorbis/VorbisComment", name = "<init>", descriptor = "()V")
    public VorbisComment() {
        this.init();
        if (this.method5402()) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!jagtheora/vorbis/VorbisComment", name = "init", descriptor = "()V")
    private final native void init();

    @OriginalMember(owner = "client!jagtheora/vorbis/VorbisComment", name = "clear", descriptor = "()V")
    protected final native void clear();
}
