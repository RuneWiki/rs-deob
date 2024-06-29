package jagdx;

import jaclib.peer.class406;
import jaclib.peer.class407;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/VertexElementCollection")
public class VertexElementCollection extends class407 {
   @OriginalMember(
      owner = "client!jagdx/VertexElementCollection",
      name = "addElement",
      descriptor = "(IIIIII)V"
   )
   public final native void addElement(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!jagdx/VertexElementCollection",
      name = "reset",
      descriptor = "()V"
   )
   public final native void reset();

   @OriginalMember(
      owner = "client!jagdx/VertexElementCollection",
      name = "init",
      descriptor = "()V"
   )
   private final native void init();

   @OriginalMember(
      owner = "client!jagdx/VertexElementCollection",
      name = "<init>",
      descriptor = "(Ljaclib/peer/aj;)V"
   )
   public VertexElementCollection(class406 arg0) {
      super(arg0);
      this.init();
   }

   @OriginalMember(
      owner = "client!jagdx/VertexElementCollection",
      name = "finish",
      descriptor = "()V"
   )
   public final native void finish();
}
