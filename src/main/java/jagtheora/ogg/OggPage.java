package jagtheora.ogg;

import jagtheora.misc.SimplePeer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/ogg/OggPage")
public class OggPage extends SimplePeer {

    @OriginalMember(owner = "client!jagtheora/ogg/OggPage", name = "clear", descriptor = "()V")
    protected final native void clear();

    @OriginalMember(owner = "client!jagtheora/ogg/OggPage", name = "isContinued", descriptor = "()Z")
    public final native boolean isContinued();

    @OriginalMember(owner = "client!jagtheora/ogg/OggPage", name = "getVersion", descriptor = "()I")
    public final native int getVersion();

    @OriginalMember(owner = "client!jagtheora/ogg/OggPage", name = "isEOS", descriptor = "()Z")
    public final native boolean isEOS();

    @OriginalMember(owner = "client!jagtheora/ogg/OggPage", name = "isBOS", descriptor = "()Z")
    public final native boolean isBOS();

    @OriginalMember(owner = "client!jagtheora/ogg/OggPage", name = "getCompletedPackets", descriptor = "()I")
    public final native int getCompletedPackets();

    @OriginalMember(owner = "client!jagtheora/ogg/OggPage", name = "getSerialNumber", descriptor = "()I")
    public final native int getSerialNumber();

    @OriginalMember(owner = "client!jagtheora/ogg/OggPage", name = "getGranulePos", descriptor = "()J")
    public final native long getGranulePos();

    @OriginalMember(owner = "client!jagtheora/ogg/OggPage", name = "getPageNumber", descriptor = "()J")
    public final native long getPageNumber();
}
