package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Stream")
public class Stream {
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "d",
      descriptor = "[B"
   )
   private byte[] field10681;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "I"
   )
   private int field10682;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "e",
      descriptor = "I"
   )
   private int field10683;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "c",
      descriptor = "I"
   )
   private int field10684;
   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "Ljaclib/memory/Buffer;"
   )
   private Buffer field10680;

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(Ljaclib/memory/Buffer;)V"
   )
   public final void method5240(Buffer arg0) {
      this.method5246(arg0, 0, arg0.getSize());
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(F)V"
   )
   public final void method5241(float arg0) {
      if (~this.field10681.length >= ~(this.field10682 + 3)) {
         this.method5253();
      }

      int var2 = floatToRawIntBits(arg0);
      this.field10681[this.field10682++] = (byte)var2;
      this.field10681[this.field10682++] = (byte)(var2 >> 8);
      this.field10681[this.field10682++] = (byte)(var2 >> 16);
      this.field10681[this.field10682++] = (byte)(var2 >> 24);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method5242(int arg0) {
      if (~this.field10681.length >= ~(this.field10682 + 1)) {
         this.method5253();
      }

      this.field10681[this.field10682++] = (byte)(arg0 >> 8);
      this.field10681[this.field10682++] = (byte)arg0;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method5243(int arg0) {
      if (this.field10681.length <= this.field10682 + 3) {
         this.method5253();
      }

      this.field10681[this.field10682++] = (byte)(arg0 >> 16);
      this.field10681[this.field10682++] = (byte)(arg0 >> 8);
      this.field10681[this.field10682++] = (byte)arg0;
      this.field10681[this.field10682++] = (byte)(arg0 >> 24);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "(IIII)V"
   )
   public final void method5244(int arg0, int arg1, int arg2, int arg3) {
      if (this.field10681.length <= this.field10682 - -3) {
         this.method5253();
      }

      this.field10681[this.field10682++] = (byte)arg0;
      this.field10681[this.field10682++] = (byte)arg1;
      this.field10681[this.field10682++] = (byte)arg2;
      this.field10681[this.field10682++] = (byte)arg3;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5245(int arg0) {
      if (this.field10681.length <= this.field10682) {
         this.method5253();
      }

      this.field10681[this.field10682++] = (byte)arg0;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "(Ljaclib/memory/Buffer;II)V"
   )
   private final void method5246(Buffer arg0, int arg1, int arg2) {
      this.method5253();
      this.field10680 = arg0;
      this.field10683 = arg1 + arg2;
      this.field10684 = arg1;
      if (this.field10683 > arg0.getSize()) {
         throw new RuntimeException();
      }
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
   public final void method5247(int arg0, int arg1, int arg2, int arg3) {
      if (~(this.field10682 + 3) <= ~this.field10681.length) {
         this.method5253();
      }

      this.field10681[this.field10682++] = (byte)arg2;
      this.field10681[this.field10682++] = (byte)arg1;
      this.field10681[this.field10682++] = (byte)arg0;
      this.field10681[this.field10682++] = (byte)arg3;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "(F)V"
   )
   public final void method5248(float arg0) {
      if (this.field10682 + 3 >= this.field10681.length) {
         this.method5253();
      }

      int var2 = floatToRawIntBits(arg0);
      this.field10681[this.field10682++] = (byte)(var2 >> 24);
      this.field10681[this.field10682++] = (byte)(var2 >> 16);
      this.field10681[this.field10682++] = (byte)(var2 >> 8);
      this.field10681[this.field10682++] = (byte)var2;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "a",
      descriptor = "()Z"
   )
   public static final boolean method5249() {
      return getLSB(-65536) == -1;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method5250(int arg0) {
      this.method5253();
      this.field10684 = arg0;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method5251(int arg0) {
      if (~this.field10681.length >= ~(this.field10682 + 1)) {
         this.method5253();
      }

      this.field10681[this.field10682++] = (byte)arg0;
      this.field10681[this.field10682++] = (byte)(arg0 >> 8);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method5252(int arg0) {
      if (this.field10681.length <= this.field10682 - -3) {
         this.method5253();
      }

      this.field10681[this.field10682++] = (byte)arg0;
      this.field10681[this.field10682++] = (byte)(arg0 >> 8);
      this.field10681[this.field10682++] = (byte)(arg0 >> 16);
      this.field10681[this.field10682++] = (byte)(arg0 >> 24);
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
      descriptor = "(Ljaclib/memory/Buffer;II)V"
   )
   public Stream(Buffer arg0, int arg1, int arg2) {
      this(~arg0.getSize() > -4097 ? arg0.getSize() : 4096);
      this.method5246(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "b",
      descriptor = "()V"
   )
   public final void method5253() {
      if (this.field10682 > 0) {
         if (~this.field10683 > ~(this.field10684 + this.field10682)) {
            throw new RuntimeException();
         } else {
            this.field10680.method548(this.field10681, 0, this.field10684, this.field10682);
            this.field10684 += this.field10682;
            this.field10682 = 0;
         }
      }
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "<init>",
      descriptor = "(I)V"
   )
   private Stream(int arg0) {
      this.field10681 = new byte[arg0];
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
      descriptor = "()I"
   )
   public final int method5254() {
      return this.field10684 - -this.field10682;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/Stream",
      name = "<init>",
      descriptor = "(Ljaclib/memory/Buffer;)V"
   )
   public Stream(Buffer arg0) {
      this(arg0, 0, arg0.getSize());
   }
}
