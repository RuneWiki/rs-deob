package jagtheora.ogg;

import jagtheora.misc.SimplePeer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/ogg/OggSyncState")
public class OggSyncState extends SimplePeer {

    @OriginalMember(owner = "client!jagtheora/ogg/OggSyncState", name = "write", descriptor = "([BI)Z")
    public final native boolean write(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!jagtheora/ogg/OggSyncState", name = "<init>", descriptor = "()V")
    public OggSyncState() {
        this.init();
        if (this.method4128()) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!jagtheora/ogg/OggSyncState", name = "pageOut", descriptor = "(Ljagtheora/ogg/OggPage;)I")
    public final native int pageOut(OggPage arg0);

    @OriginalMember(owner = "client!jagtheora/ogg/OggSyncState", name = "clear", descriptor = "()V")
    protected final native void clear();

    @OriginalMember(owner = "client!jagtheora/ogg/OggSyncState", name = "pageSeek", descriptor = "(Ljagtheora/ogg/OggPage;)J")
    public final native long pageSeek(OggPage arg0);

    @OriginalMember(owner = "client!jagtheora/ogg/OggSyncState", name = "reset", descriptor = "()Z")
    public final native boolean reset();

    @OriginalMember(owner = "client!jagtheora/ogg/OggSyncState", name = "init", descriptor = "()V")
    private final native void init();
}
