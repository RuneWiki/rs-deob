package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "e",
      descriptor = "[B"
   )
   private byte[] field10508;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "d",
      descriptor = "I"
   )
   private int field10509;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "I"
   )
   private int field10510;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "c",
      descriptor = "I"
   )
   private int field10512;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "Ljaclib/memory/Buffer;"
   )
   private Buffer field10511;

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "(F)V"
   )
   public final void method5084(float arg0) {
      if (~(this.field10509 + 3) <= ~this.field10508.length) {
         this.method5085();
      }

      int var2 = floatToRawIntBits(arg0);
      this.field10508[this.field10509++] = (byte)(var2 >> 24);
      this.field10508[this.field10509++] = (byte)(var2 >> 16);
      this.field10508[this.field10509++] = (byte)(var2 >> 8);
      this.field10508[this.field10509++] = (byte)var2;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "()V"
   )
   public final void method5085() {
      if (~this.field10509 < -1) {
         if (this.field10510 + this.field10509 > this.field10512) {
            throw new RuntimeException();
         } else {
            this.field10511.method3792(this.field10508, 0, this.field10510, this.field10509);
            this.field10510 += this.field10509;
            this.field10509 = 0;
         }
      }
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "<init>",
      descriptor = "(Ljaclib/memory/Buffer;II)V"
   )
   public Stream(Buffer arg0, int arg1, int arg2) {
      this(arg0.getSize() < 4096 ? arg0.getSize() : 4096);
      this.method5086(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "floatToRawIntBits",
      descriptor = "(F)I"
   )
   public static final native int floatToRawIntBits(float arg0);

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(Ljaclib/memory/Buffer;II)V"
   )
   private final void method5086(Buffer arg0, int arg1, int arg2) {
      this.method5085();
      this.field10510 = arg1;
      this.field10512 = arg1 - -arg2;
      this.field10511 = arg0;
      if (~this.field10512 < ~arg0.getSize()) {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method5087(int arg0) {
      if (this.field10508.length <= this.field10509 + 1) {
         this.method5085();
      }

      this.field10508[this.field10509++] = (byte)(arg0 >> 8);
      this.field10508[this.field10509++] = (byte)arg0;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "<init>",
      descriptor = "(Ljaclib/memory/Buffer;)V"
   )
   public Stream(Buffer arg0) {
      this(arg0, 0, arg0.getSize());
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5088(int arg0) {
      if (~(this.field10509 + 1) <= ~this.field10508.length) {
         this.method5085();
      }

      this.field10508[this.field10509++] = (byte)arg0;
      this.field10508[this.field10509++] = (byte)(arg0 >> 8);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(F)V"
   )
   public final void method5089(float arg0) {
      if (this.field10508.length <= this.field10509 - -3) {
         this.method5085();
      }

      int var2 = floatToRawIntBits(arg0);
      this.field10508[this.field10509++] = (byte)var2;
      this.field10508[this.field10509++] = (byte)(var2 >> 8);
      this.field10508[this.field10509++] = (byte)(var2 >> 16);
      this.field10508[this.field10509++] = (byte)(var2 >> 24);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "()I"
   )
   public final int method5090() {
      return this.field10510 + this.field10509;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method5091(int arg0, int arg1, int arg2, int arg3) {
      if (this.field10508.length <= this.field10509 + 3) {
         this.method5085();
      }

      this.field10508[this.field10509++] = (byte)arg2;
      this.field10508[this.field10509++] = (byte)arg1;
      this.field10508[this.field10509++] = (byte)arg0;
      this.field10508[this.field10509++] = (byte)arg3;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method5092(int arg0) {
      if (this.field10508.length <= this.field10509 - -3) {
         this.method5085();
      }

      this.field10508[this.field10509++] = (byte)(arg0 >> 16);
      this.field10508[this.field10509++] = (byte)(arg0 >> 8);
      this.field10508[this.field10509++] = (byte)arg0;
      this.field10508[this.field10509++] = (byte)(arg0 >> 24);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(Ljaclib/memory/Buffer;)V"
   )
   public final void method5093(Buffer arg0) {
      this.method5086(arg0, 0, arg0.getSize());
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method5094(int arg0) {
      if (this.field10509 - -3 >= this.field10508.length) {
         this.method5085();
      }

      this.field10508[this.field10509++] = (byte)arg0;
      this.field10508[this.field10509++] = (byte)(arg0 >> 8);
      this.field10508[this.field10509++] = (byte)(arg0 >> 16);
      this.field10508[this.field10509++] = (byte)(arg0 >> 24);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method5095(int arg0) {
      if (~this.field10509 <= ~this.field10508.length) {
         this.method5085();
      }

      this.field10508[this.field10509++] = (byte)arg0;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method5096(int arg0) {
      this.method5085();
      this.field10510 = arg0;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "<init>",
      descriptor = "()V"
   )
   public Stream() {
      this(4096);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "(IIII)V"
   )
   public final void method5097(int arg0, int arg1, int arg2, int arg3) {
      if (this.field10509 + 3 >= this.field10508.length) {
         this.method5085();
      }

      this.field10508[this.field10509++] = (byte)arg0;
      this.field10508[this.field10509++] = (byte)arg1;
      this.field10508[this.field10509++] = (byte)arg2;
      this.field10508[this.field10509++] = (byte)arg3;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "getLSB",
      descriptor = "(I)B"
   )
   private static final native byte getLSB(int arg0);

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "c",
      descriptor = "()Z"
   )
   public static final boolean method5098() {
      return getLSB(-65536) == -1;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "<init>",
      descriptor = "(I)V"
   )
   private Stream(int arg0) {
      this.field10508 = new byte[arg0];
   }
}
