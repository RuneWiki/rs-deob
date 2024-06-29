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
   private int field5978 = -1;
   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "a",
      descriptor = "J"
   )
   private long field5979;

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "get",
      descriptor = "(J[BIII)V"
   )
   private final native void get(long arg0, byte[] arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "getAddress",
      descriptor = "()J"
   )
   public final long getAddress() {
      return this.field5979;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "a",
      descriptor = "([BIII)V"
   )
   public void method3134(byte[] arg0, int arg1, int arg2, int arg3) {
      if (~arg2 > -1 | ~this.field5979 == -1L | arg0 == null | arg1 < 0 | arg1 + arg3 > arg0.length | ~(arg2 + arg3) < ~this.field5978) {
         throw new RuntimeException();
      } else {
         this.put(this.field5979, arg0, arg1, arg2, arg3);
      }
   }

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "put",
      descriptor = "(J[BIII)V"
   )
   private final native void put(long arg0, byte[] arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "a",
      descriptor = "(JI)V"
   )
   protected final void method3189(long arg0, int arg1) {
      this.field5979 = arg0;
      this.field5978 = arg1;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "getSize",
      descriptor = "()I"
   )
   public final int getSize() {
      return this.field5978;
   }
}
