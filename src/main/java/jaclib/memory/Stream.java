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
   private byte[] field5973;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "e",
      descriptor = "I"
   )
   private int field5974;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "d",
      descriptor = "I"
   )
   private int field5975;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "c",
      descriptor = "I"
   )
   private int field5977;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "Ljaclib/memory/Buffer;"
   )
   private Buffer field5976;

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method3174(int arg0) {
      if (this.field5973.length <= this.field5977 - -3) {
         this.method3187();
      }

      this.field5973[this.field5977++] = (byte)(arg0 >> 16);
      this.field5973[this.field5977++] = (byte)(arg0 >> 8);
      this.field5973[this.field5977++] = (byte)arg0;
      this.field5973[this.field5977++] = (byte)(arg0 >> 24);
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
      descriptor = "(IIII)V"
   )
   public final void method3175(int arg0, int arg1, int arg2, int arg3) {
      if (~this.field5973.length >= ~(this.field5977 - -3)) {
         this.method3187();
      }

      this.field5973[this.field5977++] = (byte)arg0;
      this.field5973[this.field5977++] = (byte)arg1;
      this.field5973[this.field5977++] = (byte)arg2;
      this.field5973[this.field5977++] = (byte)arg3;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3176(int arg0) {
      this.method3187();
      this.field5975 = arg0;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method3177(int arg0) {
      if (~this.field5973.length >= ~(this.field5977 - -3)) {
         this.method3187();
      }

      this.field5973[this.field5977++] = (byte)arg0;
      this.field5973[this.field5977++] = (byte)(arg0 >> 8);
      this.field5973[this.field5977++] = (byte)(arg0 >> 16);
      this.field5973[this.field5977++] = (byte)(arg0 >> 24);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3178(int arg0) {
      if (~this.field5973.length >= ~(this.field5977 + 1)) {
         this.method3187();
      }

      this.field5973[this.field5977++] = (byte)arg0;
      this.field5973[this.field5977++] = (byte)(arg0 >> 8);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(F)V"
   )
   public final void method3179(float arg0) {
      if (~this.field5973.length >= ~(this.field5977 - -3)) {
         this.method3187();
      }

      int var2 = floatToRawIntBits(arg0);
      this.field5973[this.field5977++] = (byte)var2;
      this.field5973[this.field5977++] = (byte)(var2 >> 8);
      this.field5973[this.field5977++] = (byte)(var2 >> 16);
      this.field5973[this.field5977++] = (byte)(var2 >> 24);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "(IIII)V"
   )
   public final void method3180(int arg0, int arg1, int arg2, int arg3) {
      if (~this.field5973.length >= ~(this.field5977 + 3)) {
         this.method3187();
      }

      this.field5973[this.field5977++] = (byte)arg2;
      this.field5973[this.field5977++] = (byte)arg1;
      this.field5973[this.field5977++] = (byte)arg0;
      this.field5973[this.field5977++] = (byte)arg3;
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
      name = "f",
      descriptor = "(I)V"
   )
   public final void method3181(int arg0) {
      if (this.field5977 + 1 >= this.field5973.length) {
         this.method3187();
      }

      this.field5973[this.field5977++] = (byte)(arg0 >> 8);
      this.field5973[this.field5977++] = (byte)arg0;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "()I"
   )
   public final int method3182() {
      return this.field5977 + this.field5975;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "<init>",
      descriptor = "(Ljaclib/memory/Buffer;II)V"
   )
   public Stream(Buffer arg0, int arg1, int arg2) {
      this(arg0.getSize() >= 4096 ? 4096 : arg0.getSize());
      this.method3184(arg0, arg1, arg2);
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
      descriptor = "(I)V"
   )
   private Stream(int arg0) {
      this.field5973 = new byte[arg0];
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method3183(int arg0) {
      if (this.field5973.length <= this.field5977) {
         this.method3187();
      }

      this.field5973[this.field5977++] = (byte)arg0;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(Ljaclib/memory/Buffer;II)V"
   )
   private final void method3184(Buffer arg0, int arg1, int arg2) {
      this.method3187();
      this.field5975 = arg1;
      this.field5974 = arg1 + arg2;
      this.field5976 = arg0;
      if (~this.field5974 < ~arg0.getSize()) {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "floatToRawIntBits",
      descriptor = "(F)I"
   )
   public static final native int floatToRawIntBits(float arg0);

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "c",
      descriptor = "()Z"
   )
   public static final boolean method3185() {
      return ~getLSB(-65536) == 0;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "(F)V"
   )
   public final void method3186(float arg0) {
      if (~(this.field5977 - -3) <= ~this.field5973.length) {
         this.method3187();
      }

      int var2 = floatToRawIntBits(arg0);
      this.field5973[this.field5977++] = (byte)(var2 >> 24);
      this.field5973[this.field5977++] = (byte)(var2 >> 16);
      this.field5973[this.field5977++] = (byte)(var2 >> 8);
      this.field5973[this.field5977++] = (byte)var2;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "()V"
   )
   public final void method3187() {
      if (this.field5977 > 0) {
         if (this.field5977 + this.field5975 > this.field5974) {
            throw new RuntimeException();
         } else {
            this.field5976.method3134(this.field5973, 0, this.field5975, this.field5977);
            this.field5975 += this.field5977;
            this.field5977 = 0;
         }
      }
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(Ljaclib/memory/Buffer;)V"
   )
   public final void method3188(Buffer arg0) {
      this.method3184(arg0, 0, arg0.getSize());
   }
}
