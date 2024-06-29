package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/NativeBuffer")
public class NativeBuffer implements Buffer, Source {
   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "a",
      descriptor = "I"
   )
   private int field10239 = -1;
   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "b",
      descriptor = "J"
   )
   private long field10238;

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "getAddress",
      descriptor = "()J",
      line = 5
   )
   public final long getAddress() {
      return this.field10238;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "a",
      descriptor = "(JI)V",
      line = 12
   )
   protected final void method5096(long arg0, int arg1) {
      this.field10239 = arg1;
      this.field10238 = arg0;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "getSize",
      descriptor = "()I",
      line = 20
   )
   public final int getSize() {
      return this.field10239;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "a",
      descriptor = "([BIII)V",
      line = 28
   )
   public void method3821(byte[] arg0, int arg1, int arg2, int arg3) {
      if (this.field10239 < arg2 + arg3 | ~arg2 > -1 | arg1 + arg3 > arg0.length | ~arg1 > -1 | arg0 == null | this.field10238 == 0L) {
         throw new RuntimeException();
      } else {
         this.put(this.field10238, arg0, arg1, arg2, arg3);
      }
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
