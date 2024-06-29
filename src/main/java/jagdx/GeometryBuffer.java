package jagdx;

import jaclib.memory.Buffer;
import jaclib.peer.class702;
import jaclib.peer.class703;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/GeometryBuffer")
public class GeometryBuffer extends class703 implements Buffer {
   @OriginalMember(
      owner = "client!jagdx/GeometryBuffer",
      name = "a",
      descriptor = "([BIII)V",
      line = 9
   )
   public final void method3733(byte[] arg0, int arg1, int arg2, int arg3) {
      if (!(~arg2 > -1 | ~arg1 > -1 | arg0 == null | arg0.length < arg1 - -arg3) && ~this.getSize() <= ~(arg2 + arg3)) {
         this.putub(arg0, arg1, arg2, arg3);
      } else {
         throw new class511();
      }
   }

   @OriginalMember(
      owner = "client!jagdx/GeometryBuffer",
      name = "<init>",
      descriptor = "(Ljaclib/peer/pga;)V",
      line = 20
   )
   public GeometryBuffer(class702 arg0) {
      super(arg0);
      this.init();
   }

   @OriginalMember(
      owner = "client!jagdx/GeometryBuffer",
      name = "getAddress",
      descriptor = "()J"
   )
   public final native long getAddress();

   @OriginalMember(
      owner = "client!jagdx/GeometryBuffer",
      name = "init",
      descriptor = "()V"
   )
   private final native void init();

   @OriginalMember(
      owner = "client!jagdx/GeometryBuffer",
      name = "getub",
      descriptor = "([BIII)V"
   )
   private final native void getub(byte[] arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!jagdx/GeometryBuffer",
      name = "getSize",
      descriptor = "()I"
   )
   public final native int getSize();

   @OriginalMember(
      owner = "client!jagdx/GeometryBuffer",
      name = "putub",
      descriptor = "([BIII)V"
   )
   private final native void putub(byte[] arg0, int arg1, int arg2, int arg3);
}
