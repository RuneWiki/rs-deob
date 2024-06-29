package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "[B"
   )
   private byte[] field10264;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "c",
      descriptor = "I"
   )
   private int field10265;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "e",
      descriptor = "I"
   )
   private int field10266;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "d",
      descriptor = "I"
   )
   private int field10267;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "Ljaclib/memory/Buffer;"
   )
   private Buffer field10268;

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(F)V"
   )
   public final void method5098(float arg0) {
      if (~(this.field10267 + 3) <= ~this.field10264.length) {
         this.method5102();
      }

      int var2 = floatToRawIntBits(arg0);
      this.field10264[this.field10267++] = (byte)(var2 >> 24);
      this.field10264[this.field10267++] = (byte)(var2 >> 16);
      this.field10264[this.field10267++] = (byte)(var2 >> 8);
      this.field10264[this.field10267++] = (byte)var2;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method5099(int arg0) {
      if (~(this.field10267 + 1) <= ~this.field10264.length) {
         this.method5102();
      }

      this.field10264[this.field10267++] = (byte)arg0;
      this.field10264[this.field10267++] = (byte)(arg0 >> 8);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "c",
      descriptor = "()I"
   )
   public final int method5100() {
      return this.field10265 - -this.field10267;
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
      name = "getLSB",
      descriptor = "(I)B"
   )
   private static final native byte getLSB(int arg0);

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
      name = "e",
      descriptor = "(I)V"
   )
   public final void method5101(int arg0) {
      if (~(this.field10267 - -3) <= ~this.field10264.length) {
         this.method5102();
      }

      this.field10264[this.field10267++] = (byte)(arg0 >> 16);
      this.field10264[this.field10267++] = (byte)(arg0 >> 8);
      this.field10264[this.field10267++] = (byte)arg0;
      this.field10264[this.field10267++] = (byte)(arg0 >> 24);
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
      descriptor = "()V"
   )
   public final void method5102() {
      if (~this.field10267 < -1) {
         if (~(this.field10267 + this.field10265) < ~this.field10266) {
            throw new RuntimeException();
         } else {
            this.field10268.method3733(this.field10264, 0, this.field10265, this.field10267);
            this.field10265 += this.field10267;
            this.field10267 = 0;
         }
      }
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method5103(int arg0) {
      if (~(this.field10267 + 1) <= ~this.field10264.length) {
         this.method5102();
      }

      this.field10264[this.field10267++] = (byte)(arg0 >> 8);
      this.field10264[this.field10267++] = (byte)arg0;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "<init>",
      descriptor = "(Ljaclib/memory/Buffer;II)V"
   )
   public Stream(Buffer arg0, int arg1, int arg2) {
      this(~arg0.getSize() <= -4097 ? 4096 : arg0.getSize());
      this.method5107(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "(F)V"
   )
   public final void method5104(float arg0) {
      if (this.field10264.length <= this.field10267 + 3) {
         this.method5102();
      }

      int var2 = floatToRawIntBits(arg0);
      this.field10264[this.field10267++] = (byte)var2;
      this.field10264[this.field10267++] = (byte)(var2 >> 8);
      this.field10264[this.field10267++] = (byte)(var2 >> 16);
      this.field10264[this.field10267++] = (byte)(var2 >> 24);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5105(int arg0) {
      if (~this.field10267 <= ~this.field10264.length) {
         this.method5102();
      }

      this.field10264[this.field10267++] = (byte)arg0;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "()Z"
   )
   public static final boolean method5106() {
      return getLSB(-65536) == -1;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(Ljaclib/memory/Buffer;II)V"
   )
   private final void method5107(Buffer arg0, int arg1, int arg2) {
      this.method5102();
      this.field10268 = arg0;
      this.field10266 = arg1 - -arg2;
      this.field10265 = arg1;
      if (this.field10266 > arg0.getSize()) {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method5108(int arg0, int arg1, int arg2, int arg3) {
      if (this.field10267 - -3 >= this.field10264.length) {
         this.method5102();
      }

      this.field10264[this.field10267++] = (byte)arg2;
      this.field10264[this.field10267++] = (byte)arg1;
      this.field10264[this.field10267++] = (byte)arg0;
      this.field10264[this.field10267++] = (byte)arg3;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method5109(int arg0) {
      if (this.field10267 - -3 >= this.field10264.length) {
         this.method5102();
      }

      this.field10264[this.field10267++] = (byte)arg0;
      this.field10264[this.field10267++] = (byte)(arg0 >> 8);
      this.field10264[this.field10267++] = (byte)(arg0 >> 16);
      this.field10264[this.field10267++] = (byte)(arg0 >> 24);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method5110(int arg0) {
      this.method5102();
      this.field10265 = arg0;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "(IIII)V"
   )
   public final void method5111(int arg0, int arg1, int arg2, int arg3) {
      if (this.field10267 - -3 >= this.field10264.length) {
         this.method5102();
      }

      this.field10264[this.field10267++] = (byte)arg0;
      this.field10264[this.field10267++] = (byte)arg1;
      this.field10264[this.field10267++] = (byte)arg2;
      this.field10264[this.field10267++] = (byte)arg3;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "<init>",
      descriptor = "(I)V"
   )
   private Stream(int arg0) {
      this.field10264 = new byte[arg0];
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(Ljaclib/memory/Buffer;)V"
   )
   public final void method5112(Buffer arg0) {
      this.method5107(arg0, 0, arg0.getSize());
   }
}
