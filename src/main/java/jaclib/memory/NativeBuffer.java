package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/NativeBuffer")
public class NativeBuffer implements Buffer, Source {
   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "b",
      descriptor = "I"
   )
   private int field10270 = -1;
   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "a",
      descriptor = "J"
   )
   private long field10269;

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "a",
      descriptor = "([BIII)V",
      line = 4
   )
   public void method3733(byte[] arg0, int arg1, int arg2, int arg3) {
      if (arg1 < 0 | arg0 == null | this.field10269 == 0L | arg0.length < arg1 + arg3 | ~arg2 > -1 | ~(arg2 + arg3) < ~this.field10270) {
         throw new RuntimeException();
      } else {
         this.put(this.field10269, arg0, arg1, arg2, arg3);
      }
   }

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "a",
      descriptor = "(JI)V",
      line = 16
   )
   protected final void method5113(long arg0, int arg1) {
      this.field10269 = arg0;
      this.field10270 = arg1;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "getSize",
      descriptor = "()I",
      line = 25
   )
   public final int getSize() {
      return this.field10270;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "getAddress",
      descriptor = "()J",
      line = 34
   )
   public final long getAddress() {
      return this.field10269;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "get",
      descriptor = "(J[BIII)V"
   )
   private final native void get(long arg0, byte[] arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "put",
      descriptor = "(J[BIII)V"
   )
   private final native void put(long arg0, byte[] arg1, int arg2, int arg3, int arg4);
}
