package jagtheora.ogg;

import jagtheora.misc.SimplePeer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/ogg/OggStreamState")
public class OggStreamState extends SimplePeer {

    @OriginalMember(owner = "client!jagtheora/ogg/OggStreamState", name = "<init>", descriptor = "(I)V", line = 13)
    public OggStreamState(int arg0) {
        if (!this.init(arg0)) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!jagtheora/ogg/OggStreamState", name = "packetOut", descriptor = "(Ljagtheora/ogg/OggPacket;)I")
    public final native int packetOut(OggPacket arg0);

    @OriginalMember(owner = "client!jagtheora/ogg/OggStreamState", name = "packetPeek", descriptor = "(Ljagtheora/ogg/OggPacket;)I")
    public final native int packetPeek(OggPacket arg0);

    @OriginalMember(owner = "client!jagtheora/ogg/OggStreamState", name = "packetPeek", descriptor = "()I")
    public final native int packetPeek();

    @OriginalMember(owner = "client!jagtheora/ogg/OggStreamState", name = "resetSerialNo", descriptor = "(I)Z")
    public final native boolean resetSerialNo(int arg0);

    @OriginalMember(owner = "client!jagtheora/ogg/OggStreamState", name = "reset", descriptor = "()Z")
    public final native boolean reset();

    @OriginalMember(owner = "client!jagtheora/ogg/OggStreamState", name = "pageIn", descriptor = "(Ljagtheora/ogg/OggPage;)Z")
    public final native boolean pageIn(OggPage arg0);

    @OriginalMember(owner = "client!jagtheora/ogg/OggStreamState", name = "packetOut", descriptor = "()I")
    public final native int packetOut();

    @OriginalMember(owner = "client!jagtheora/ogg/OggStreamState", name = "isEOS", descriptor = "()Z")
    public final native boolean isEOS();

    @OriginalMember(owner = "client!jagtheora/ogg/OggStreamState", name = "init", descriptor = "(I)Z")
    private final native boolean init(int arg0);

    @OriginalMember(owner = "client!jagtheora/ogg/OggStreamState", name = "clear", descriptor = "()V")
    protected final native void clear();
}
