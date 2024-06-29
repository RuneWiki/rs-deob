package jagtheora.ogg;

import jagtheora.misc.SimplePeer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/ogg/OggPacket")
public class OggPacket extends SimplePeer {

    @OriginalMember(owner = "client!jagtheora/ogg/OggPacket", name = "isVorbis", descriptor = "()Z")
    public final native boolean isVorbis();

    @OriginalMember(owner = "client!jagtheora/ogg/OggPacket", name = "isHeader", descriptor = "()I")
    public final native int isHeader();

    @OriginalMember(owner = "client!jagtheora/ogg/OggPacket", name = "isKeyFrame", descriptor = "()I")
    public final native int isKeyFrame();

    @OriginalMember(owner = "client!jagtheora/ogg/OggPacket", name = "getData", descriptor = "()[B")
    public final native byte[] getData();

    @OriginalMember(owner = "client!jagtheora/ogg/OggPacket", name = "clear", descriptor = "()V")
    protected final native void clear();

    @OriginalMember(owner = "client!jagtheora/ogg/OggPacket", name = "isTheora", descriptor = "()Z")
    public final native boolean isTheora();
}
