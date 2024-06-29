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
   private int field10514 = -1;
   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "a",
      descriptor = "J"
   )
   private long field10513;

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "get",
      descriptor = "(J[BIII)V"
   )
   private final native void get(long arg0, byte[] arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "a",
      descriptor = "(JI)V"
   )
   protected final void method5099(long arg0, int arg1) {
      this.field10514 = arg1;
      this.field10513 = arg0;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "getAddress",
      descriptor = "()J"
   )
   public final long getAddress() {
      return this.field10513;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "a",
      descriptor = "([BIII)V"
   )
   public void method3792(byte[] arg0, int arg1, int arg2, int arg3) {
      if (arg2 + arg3 > this.field10514 | arg0.length < arg1 + arg3 | arg0 == null | this.field10513 == 0L | ~arg1 > -1 | ~arg2 > -1) {
         throw new RuntimeException();
      } else {
         this.put(this.field10513, arg0, arg1, arg2, arg3);
      }
   }

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "getSize",
      descriptor = "()I"
   )
   public final int getSize() {
      return this.field10514;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "put",
      descriptor = "(J[BIII)V"
   )
   private final native void put(long arg0, byte[] arg1, int arg2, int arg3, int arg4);
}
