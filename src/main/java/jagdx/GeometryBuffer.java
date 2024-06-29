package jagdx;

import jaclib.memory.Buffer;
import jaclib.peer.class709;
import jaclib.peer.class710;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/GeometryBuffer")
public class GeometryBuffer extends class710 implements Buffer {
   @OriginalMember(
      owner = "client!jagdx/GeometryBuffer",
      name = "a",
      descriptor = "([BIII)V",
      line = 8
   )
   public final void method548(byte[] arg0, int arg1, int arg2, int arg3) {
      if (!(~(arg1 - -arg3) < ~arg0.length | ~arg1 > -1 | arg0 == null | arg2 < 0) && ~this.getSize() <= ~(arg2 + arg3)) {
         this.putub(arg0, arg1, arg2, arg3);
      } else {
         throw new class73();
      }
   }

   @OriginalMember(
      owner = "client!jagdx/GeometryBuffer",
      name = "<init>",
      descriptor = "(Ljaclib/peer/jv;)V",
      line = 20
   )
   public GeometryBuffer(class709 arg0) {
      super(arg0);
      this.init();
   }

   @OriginalMember(
      owner = "client!jagdx/GeometryBuffer",
      name = "getSize",
      descriptor = "()I"
   )
   public final native int getSize();

   @OriginalMember(
      owner = "client!jagdx/GeometryBuffer",
      name = "getub",
      descriptor = "([BIII)V"
   )
   private final native void getub(byte[] arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!jagdx/GeometryBuffer",
      name = "putub",
      descriptor = "([BIII)V"
   )
   private final native void putub(byte[] arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!jagdx/GeometryBuffer",
      name = "init",
      descriptor = "()V"
   )
   private final native void init();

   @OriginalMember(
      owner = "client!jagdx/GeometryBuffer",
      name = "getAddress",
      descriptor = "()J"
   )
   public final native long getAddress();
}
