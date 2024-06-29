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
   private byte[] field10234;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "c",
      descriptor = "I"
   )
   private int field10233;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "e",
      descriptor = "I"
   )
   private int field10236;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "I"
   )
   private int field10237;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "d",
      descriptor = "Ljaclib/memory/Buffer;"
   )
   private Buffer field10235;

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method5081(int arg0) {
      if (this.field10234.length <= this.field10236 + 3) {
         this.method5086();
      }

      this.field10234[this.field10236++] = (byte)arg0;
      this.field10234[this.field10236++] = (byte)(arg0 >> 8);
      this.field10234[this.field10236++] = (byte)(arg0 >> 16);
      this.field10234[this.field10236++] = (byte)(arg0 >> 24);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "(F)V"
   )
   public final void method5082(float arg0) {
      if (~this.field10234.length >= ~(this.field10236 - -3)) {
         this.method5086();
      }

      int var2 = floatToRawIntBits(arg0);
      this.field10234[this.field10236++] = (byte)(var2 >> 24);
      this.field10234[this.field10236++] = (byte)(var2 >> 16);
      this.field10234[this.field10236++] = (byte)(var2 >> 8);
      this.field10234[this.field10236++] = (byte)var2;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "c",
      descriptor = "()I"
   )
   public final int method5083() {
      return this.field10237 - -this.field10236;
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
      name = "d",
      descriptor = "(I)V"
   )
   public final void method5084(int arg0) {
      if (~this.field10234.length >= ~this.field10236) {
         this.method5086();
      }

      this.field10234[this.field10236++] = (byte)arg0;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "<init>",
      descriptor = "(Ljaclib/memory/Buffer;II)V"
   )
   public Stream(Buffer arg0, int arg1, int arg2) {
      this(~arg0.getSize() <= -4097 ? 4096 : arg0.getSize());
      this.method5087(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method5085(int arg0) {
      this.method5086();
      this.field10237 = arg0;
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
      descriptor = "()V"
   )
   public final void method5086() {
      if (this.field10236 > 0) {
         if (this.field10233 < this.field10237 - -this.field10236) {
            throw new RuntimeException();
         } else {
            this.field10235.method3821(this.field10234, 0, this.field10237, this.field10236);
            this.field10237 += this.field10236;
            this.field10236 = 0;
         }
      }
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(Ljaclib/memory/Buffer;II)V"
   )
   private final void method5087(Buffer arg0, int arg1, int arg2) {
      this.method5086();
      this.field10235 = arg0;
      this.field10237 = arg1;
      this.field10233 = arg1 + arg2;
      if (~this.field10233 < ~arg0.getSize()) {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "(IIII)V"
   )
   public final void method5088(int arg0, int arg1, int arg2, int arg3) {
      if (~this.field10234.length >= ~(this.field10236 - -3)) {
         this.method5086();
      }

      this.field10234[this.field10236++] = (byte)arg0;
      this.field10234[this.field10236++] = (byte)arg1;
      this.field10234[this.field10236++] = (byte)arg2;
      this.field10234[this.field10236++] = (byte)arg3;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method5089(int arg0, int arg1, int arg2, int arg3) {
      if (this.field10236 - -3 >= this.field10234.length) {
         this.method5086();
      }

      this.field10234[this.field10236++] = (byte)arg2;
      this.field10234[this.field10236++] = (byte)arg1;
      this.field10234[this.field10236++] = (byte)arg0;
      this.field10234[this.field10236++] = (byte)arg3;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "()Z"
   )
   public static final boolean method5090() {
      return ~getLSB(-65536) == 0;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(F)V"
   )
   public final void method5091(float arg0) {
      if (this.field10236 + 3 >= this.field10234.length) {
         this.method5086();
      }

      int var2 = floatToRawIntBits(arg0);
      this.field10234[this.field10236++] = (byte)var2;
      this.field10234[this.field10236++] = (byte)(var2 >> 8);
      this.field10234[this.field10236++] = (byte)(var2 >> 16);
      this.field10234[this.field10236++] = (byte)(var2 >> 24);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(Ljaclib/memory/Buffer;)V"
   )
   public final void method5092(Buffer arg0) {
      this.method5087(arg0, 0, arg0.getSize());
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method5093(int arg0) {
      if (this.field10236 - -1 >= this.field10234.length) {
         this.method5086();
      }

      this.field10234[this.field10236++] = (byte)arg0;
      this.field10234[this.field10236++] = (byte)(arg0 >> 8);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "floatToRawIntBits",
      descriptor = "(F)I"
   )
   public static final native int floatToRawIntBits(float arg0);

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "<init>",
      descriptor = "(I)V"
   )
   private Stream(int arg0) {
      this.field10234 = new byte[arg0];
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "getLSB",
      descriptor = "(I)B"
   )
   private static final native byte getLSB(int arg0);

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method5094(int arg0) {
      if (~(this.field10236 + 1) <= ~this.field10234.length) {
         this.method5086();
      }

      this.field10234[this.field10236++] = (byte)(arg0 >> 8);
      this.field10234[this.field10236++] = (byte)arg0;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5095(int arg0) {
      if (~this.field10234.length >= ~(this.field10236 + 3)) {
         this.method5086();
      }

      this.field10234[this.field10236++] = (byte)(arg0 >> 16);
      this.field10234[this.field10236++] = (byte)(arg0 >> 8);
      this.field10234[this.field10236++] = (byte)arg0;
      this.field10234[this.field10236++] = (byte)(arg0 >> 24);
   }
}
