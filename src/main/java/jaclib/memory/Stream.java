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
   private byte[] field10223;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "e",
      descriptor = "I"
   )
   private int field10224;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "I"
   )
   private int field10225;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "c",
      descriptor = "I"
   )
   private int field10227;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "d",
      descriptor = "Ljaclib/memory/Buffer;"
   )
   private Buffer field10226;

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "c",
      descriptor = "()Z"
   )
   public static final boolean method5101() {
      return ~getLSB(-65536) == 0;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method5102(int arg0) {
      if (~this.field10223.length >= ~(this.field10227 - -1)) {
         this.method5109();
      }

      this.field10223[this.field10227++] = (byte)arg0;
      this.field10223[this.field10227++] = (byte)(arg0 >> 8);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method5103(int arg0, int arg1, int arg2, int arg3) {
      if (~(this.field10227 + 3) <= ~this.field10223.length) {
         this.method5109();
      }

      this.field10223[this.field10227++] = (byte)arg2;
      this.field10223[this.field10227++] = (byte)arg1;
      this.field10223[this.field10227++] = (byte)arg0;
      this.field10223[this.field10227++] = (byte)arg3;
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
      name = "<init>",
      descriptor = "(Ljaclib/memory/Buffer;II)V"
   )
   public Stream(Buffer arg0, int arg1, int arg2) {
      this(~arg0.getSize() > -4097 ? arg0.getSize() : 4096);
      this.method5111(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(F)V"
   )
   public final void method5104(float arg0) {
      if (this.field10223.length <= this.field10227 - -3) {
         this.method5109();
      }

      int var2 = floatToRawIntBits(arg0);
      this.field10223[this.field10227++] = (byte)(var2 >> 24);
      this.field10223[this.field10227++] = (byte)(var2 >> 16);
      this.field10223[this.field10227++] = (byte)(var2 >> 8);
      this.field10223[this.field10227++] = (byte)var2;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "()I"
   )
   public final int method5105() {
      return this.field10227 + this.field10224;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method5106(int arg0) {
      if (~(this.field10227 - -3) <= ~this.field10223.length) {
         this.method5109();
      }

      this.field10223[this.field10227++] = (byte)arg0;
      this.field10223[this.field10227++] = (byte)(arg0 >> 8);
      this.field10223[this.field10227++] = (byte)(arg0 >> 16);
      this.field10223[this.field10227++] = (byte)(arg0 >> 24);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "(IIII)V"
   )
   public final void method5107(int arg0, int arg1, int arg2, int arg3) {
      if (this.field10223.length <= this.field10227 + 3) {
         this.method5109();
      }

      this.field10223[this.field10227++] = (byte)arg0;
      this.field10223[this.field10227++] = (byte)arg1;
      this.field10223[this.field10227++] = (byte)arg2;
      this.field10223[this.field10227++] = (byte)arg3;
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
   public final void method5108(int arg0) {
      if (this.field10227 >= this.field10223.length) {
         this.method5109();
      }

      this.field10223[this.field10227++] = (byte)arg0;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "floatToRawIntBits",
      descriptor = "(F)I"
   )
   public static final native int floatToRawIntBits(float arg0);

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "()V"
   )
   public final void method5109() {
      if (~this.field10227 < -1) {
         if (~this.field10225 > ~(this.field10227 + this.field10224)) {
            throw new RuntimeException();
         } else {
            this.field10226.method3739(this.field10223, 0, this.field10224, this.field10227);
            this.field10224 += this.field10227;
            this.field10227 = 0;
         }
      }
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method5110(int arg0) {
      this.method5109();
      this.field10224 = arg0;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(Ljaclib/memory/Buffer;II)V"
   )
   private final void method5111(Buffer arg0, int arg1, int arg2) {
      this.method5109();
      this.field10225 = arg1 + arg2;
      this.field10226 = arg0;
      this.field10224 = arg1;
      if (this.field10225 > arg0.getSize()) {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method5112(int arg0) {
      if (~this.field10223.length >= ~(this.field10227 + 3)) {
         this.method5109();
      }

      this.field10223[this.field10227++] = (byte)(arg0 >> 16);
      this.field10223[this.field10227++] = (byte)(arg0 >> 8);
      this.field10223[this.field10227++] = (byte)arg0;
      this.field10223[this.field10227++] = (byte)(arg0 >> 24);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5113(int arg0) {
      if (~(this.field10227 - -1) <= ~this.field10223.length) {
         this.method5109();
      }

      this.field10223[this.field10227++] = (byte)(arg0 >> 8);
      this.field10223[this.field10227++] = (byte)arg0;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "(F)V"
   )
   public final void method5114(float arg0) {
      if (~(this.field10227 + 3) <= ~this.field10223.length) {
         this.method5109();
      }

      int var2 = floatToRawIntBits(arg0);
      this.field10223[this.field10227++] = (byte)var2;
      this.field10223[this.field10227++] = (byte)(var2 >> 8);
      this.field10223[this.field10227++] = (byte)(var2 >> 16);
      this.field10223[this.field10227++] = (byte)(var2 >> 24);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(Ljaclib/memory/Buffer;)V"
   )
   public final void method5115(Buffer arg0) {
      this.method5111(arg0, 0, arg0.getSize());
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
      descriptor = "(I)V"
   )
   private Stream(int arg0) {
      this.field10223 = new byte[arg0];
   }
}
