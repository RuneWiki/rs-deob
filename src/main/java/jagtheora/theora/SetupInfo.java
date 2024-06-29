package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/theora/SetupInfo")
public class SetupInfo extends SimplePeer {

    @OriginalMember(owner = "client!jagtheora/theora/SetupInfo", name = "decodeHeader", descriptor = "(Ljagtheora/theora/TheoraInfo;Ljagtheora/theora/TheoraComment;Ljagtheora/ogg/OggPacket;)I")
    public final native int decodeHeader(TheoraInfo arg0, TheoraComment arg1, OggPacket arg2);

    @OriginalMember(owner = "client!jagtheora/theora/SetupInfo", name = "clear", descriptor = "()V")
    protected final native void clear();
}
