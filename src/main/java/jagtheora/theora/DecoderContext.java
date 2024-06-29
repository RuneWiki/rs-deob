package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagtheora/theora/DecoderContext")
public class DecoderContext extends SimplePeer {
   @OriginalMember(
      owner = "client!jagtheora/theora/DecoderContext",
      name = "granuleTime",
      descriptor = "(Ljagtheora/theora/GranulePos;)D"
   )
   public final native double granuleTime(GranulePos arg0);

   @OriginalMember(
      owner = "client!jagtheora/theora/DecoderContext",
      name = "init",
      descriptor = "(Ljagtheora/theora/TheoraInfo;Ljagtheora/theora/SetupInfo;)V"
   )
   private final native void init(TheoraInfo arg0, SetupInfo arg1);

   @OriginalMember(
      owner = "client!jagtheora/theora/DecoderContext",
      name = "setGranulePosition",
      descriptor = "(J)I"
   )
   public final native int setGranulePosition(long arg0);

   @OriginalMember(
      owner = "client!jagtheora/theora/DecoderContext",
      name = "<init>",
      descriptor = "(Ljagtheora/theora/TheoraInfo;Ljagtheora/theora/SetupInfo;)V"
   )
   public DecoderContext(TheoraInfo arg0, SetupInfo arg1) {
      this.init(arg0, arg1);
      if (this.method5404()) {
         throw new IllegalArgumentException("");
      }
   }

   @OriginalMember(
      owner = "client!jagtheora/theora/DecoderContext",
      name = "setPostProcessingLevel",
      descriptor = "(I)I"
   )
   public final native int setPostProcessingLevel(int arg0);

   @OriginalMember(
      owner = "client!jagtheora/theora/DecoderContext",
      name = "clear",
      descriptor = "()V"
   )
   protected final native void clear();

   @OriginalMember(
      owner = "client!jagtheora/theora/DecoderContext",
      name = "getMaxPostProcessingLevel",
      descriptor = "()I"
   )
   public final native int getMaxPostProcessingLevel();

   @OriginalMember(
      owner = "client!jagtheora/theora/DecoderContext",
      name = "granuleFrame",
      descriptor = "(Ljagtheora/theora/GranulePos;)J"
   )
   public final native long granuleFrame(GranulePos arg0);

   @OriginalMember(
      owner = "client!jagtheora/theora/DecoderContext",
      name = "decodeFrame",
      descriptor = "(Ljagtheora/theora/Frame;)I"
   )
   public final native int decodeFrame(Frame arg0);

   @OriginalMember(
      owner = "client!jagtheora/theora/DecoderContext",
      name = "decodePacketIn",
      descriptor = "(Ljagtheora/ogg/OggPacket;Ljagtheora/theora/GranulePos;)I"
   )
   public final native int decodePacketIn(OggPacket arg0, GranulePos arg1);
}
