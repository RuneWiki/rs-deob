package jagdx;

import jaclib.memory.Buffer;
import jaclib.peer.class702;
import jaclib.peer.class703;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/PixelBuffer")
public class PixelBuffer extends class703 implements Buffer {
   @OriginalMember(
      owner = "client!jagdx/PixelBuffer",
      name = "a",
      descriptor = "([IIII)V",
      line = 5
   )
   public final void method3735(int[] arg0, int arg1, int arg2, int arg3) {
      if (!(-1 < ~arg2 | arg0 == null | arg1 < 0 | ~(arg1 + arg3) < ~arg0.length) && arg2 - -(arg3 * 4) <= this.getSize()) {
         this.puti(arg0, arg1, arg2, arg3);
      } else {
         throw new class511();
      }
   }

   @OriginalMember(
      owner = "client!jagdx/PixelBuffer",
      name = "a",
      descriptor = "([BIII)V",
      line = 15
   )
   public final void method3733(byte[] arg0, int arg1, int arg2, int arg3) {
      if (!(arg0.length < arg1 + arg3 | -1 < ~arg1 | arg0 == null | ~arg2 > -1) && ~(arg2 + arg3) >= ~this.getSize()) {
         this.putub(arg0, arg1, arg2, arg3);
      } else {
         throw new class511();
      }
   }

   @OriginalMember(
      owner = "client!jagdx/PixelBuffer",
      name = "getAddress",
      descriptor = "()J",
      line = 28
   )
   public final long getAddress() {
      return 0L;
   }

   @OriginalMember(
      owner = "client!jagdx/PixelBuffer",
      name = "<init>",
      descriptor = "(Ljaclib/peer/pga;)V",
      line = 38
   )
   public PixelBuffer(class702 arg0) {
      super(arg0);
      this.init();
   }

   @OriginalMember(
      owner = "client!jagdx/PixelBuffer",
      name = "b",
      descriptor = "([IIII)V",
      line = 47
   )
   public final void method3736(int[] arg0, int arg1, int arg2, int arg3) {
      if (!(arg2 < 0 | arg1 + arg3 > arg0.length | -1 < ~arg1 | arg0 == null) && this.getSize() >= arg3 * 4 + arg2) {
         this.geti(arg0, arg1, arg2, arg3);
      } else {
         throw new class511();
      }
   }

   @OriginalMember(
      owner = "client!jagdx/PixelBuffer",
      name = "putub",
      descriptor = "([BIII)V"
   )
   private final native void putub(byte[] arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!jagdx/PixelBuffer",
      name = "getSize",
      descriptor = "()I"
   )
   public final native int getSize();

   @OriginalMember(
      owner = "client!jagdx/PixelBuffer",
      name = "getRowPitch",
      descriptor = "()I"
   )
   public final native int getRowPitch();

   @OriginalMember(
      owner = "client!jagdx/PixelBuffer",
      name = "geti",
      descriptor = "([IIII)V"
   )
   private final native void geti(int[] arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!jagdx/PixelBuffer",
      name = "puti",
      descriptor = "([IIII)V"
   )
   private final native void puti(int[] arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!jagdx/PixelBuffer",
      name = "getSlicePitch",
      descriptor = "()I"
   )
   public final native int getSlicePitch();

   @OriginalMember(
      owner = "client!jagdx/PixelBuffer",
      name = "init",
      descriptor = "()V"
   )
   private final native void init();

   @OriginalMember(
      owner = "client!jagdx/PixelBuffer",
      name = "getub",
      descriptor = "([BIII)V"
   )
   private final native void getub(byte[] arg0, int arg1, int arg2, int arg3);
}
