package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "c",
      descriptor = "[B"
   )
   private byte[] field5264;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "I"
   )
   private int field5265;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "I"
   )
   private int field5266;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "d",
      descriptor = "I"
   )
   private int field5267;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "e",
      descriptor = "Ljaclib/memory/Buffer;"
   )
   private Buffer field5263;

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "<init>",
      descriptor = "(Ljaclib/memory/Buffer;II)V"
   )
   public Stream(Buffer arg0, int arg1, int arg2) {
      this(~arg0.getSize() > -4097 ? arg0.getSize() : 4096);
      this.method2998(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "()Z"
   )
   public static final boolean method2990() {
      return getLSB(-65536) == -1;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method2991(int arg0, int arg1, int arg2, int arg3) {
      if (this.field5264.length <= this.field5266 + 3) {
         this.method2995();
      }

      this.field5264[this.field5266++] = (byte)arg2;
      this.field5264[this.field5266++] = (byte)arg1;
      this.field5264[this.field5266++] = (byte)arg0;
      this.field5264[this.field5266++] = (byte)arg3;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method2992(int arg0) {
      if (this.field5266 + 1 >= this.field5264.length) {
         this.method2995();
      }

      this.field5264[this.field5266++] = (byte)arg0;
      this.field5264[this.field5266++] = (byte)(arg0 >> 8);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2993(int arg0) {
      if (this.field5266 >= this.field5264.length) {
         this.method2995();
      }

      this.field5264[this.field5266++] = (byte)arg0;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(F)V"
   )
   public final void method2994(float arg0) {
      if (~this.field5264.length >= ~(this.field5266 - -3)) {
         this.method2995();
      }

      int var2 = floatToRawIntBits(arg0);
      this.field5264[this.field5266++] = (byte)(var2 >> 24);
      this.field5264[this.field5266++] = (byte)(var2 >> 16);
      this.field5264[this.field5266++] = (byte)(var2 >> 8);
      this.field5264[this.field5266++] = (byte)var2;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "()V"
   )
   public final void method2995() {
      if (this.field5266 > 0) {
         if (this.field5265 < this.field5267 + this.field5266) {
            throw new RuntimeException();
         } else {
            this.field5263.method231(this.field5264, 0, this.field5267, this.field5266);
            this.field5267 += this.field5266;
            this.field5266 = 0;
         }
      }
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "c",
      descriptor = "()I"
   )
   public final int method2996() {
      return this.field5267 + this.field5266;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "(F)V"
   )
   public final void method2997(float arg0) {
      if (~(this.field5266 + 3) <= ~this.field5264.length) {
         this.method2995();
      }

      int var2 = floatToRawIntBits(arg0);
      this.field5264[this.field5266++] = (byte)var2;
      this.field5264[this.field5266++] = (byte)(var2 >> 8);
      this.field5264[this.field5266++] = (byte)(var2 >> 16);
      this.field5264[this.field5266++] = (byte)(var2 >> 24);
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
      name = "<init>",
      descriptor = "()V"
   )
   public Stream() {
      this(4096);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(Ljaclib/memory/Buffer;II)V"
   )
   private final void method2998(Buffer arg0, int arg1, int arg2) {
      this.method2995();
      this.field5263 = arg0;
      this.field5267 = arg1;
      this.field5265 = arg1 + arg2;
      if (~this.field5265 < ~arg0.getSize()) {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method2999(int arg0) {
      if (~this.field5264.length >= ~(this.field5266 + 3)) {
         this.method2995();
      }

      this.field5264[this.field5266++] = (byte)arg0;
      this.field5264[this.field5266++] = (byte)(arg0 >> 8);
      this.field5264[this.field5266++] = (byte)(arg0 >> 16);
      this.field5264[this.field5266++] = (byte)(arg0 >> 24);
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
      descriptor = "(Ljaclib/memory/Buffer;)V"
   )
   public final void method3000(Buffer arg0) {
      this.method2998(arg0, 0, arg0.getSize());
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "getLSB",
      descriptor = "(I)B"
   )
   private static final native byte getLSB(int arg0);

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "(IIII)V"
   )
   public final void method3001(int arg0, int arg1, int arg2, int arg3) {
      if (this.field5264.length <= this.field5266 + 3) {
         this.method2995();
      }

      this.field5264[this.field5266++] = (byte)arg0;
      this.field5264[this.field5266++] = (byte)arg1;
      this.field5264[this.field5266++] = (byte)arg2;
      this.field5264[this.field5266++] = (byte)arg3;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3002(int arg0) {
      if (~this.field5264.length >= ~(this.field5266 + 1)) {
         this.method2995();
      }

      this.field5264[this.field5266++] = (byte)(arg0 >> 8);
      this.field5264[this.field5266++] = (byte)arg0;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method3003(int arg0) {
      if (this.field5264.length <= this.field5266 - -3) {
         this.method2995();
      }

      this.field5264[this.field5266++] = (byte)(arg0 >> 16);
      this.field5264[this.field5266++] = (byte)(arg0 >> 8);
      this.field5264[this.field5266++] = (byte)arg0;
      this.field5264[this.field5266++] = (byte)(arg0 >> 24);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "<init>",
      descriptor = "(I)V"
   )
   private Stream(int arg0) {
      this.field5264 = new byte[arg0];
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method3004(int arg0) {
      this.method2995();
      this.field5267 = arg0;
   }
}
