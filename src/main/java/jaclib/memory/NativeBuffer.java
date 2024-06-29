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
   private int field10228 = -1;
   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "b",
      descriptor = "J"
   )
   private long field10229;

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "getAddress",
      descriptor = "()J"
   )
   public final long getAddress() {
      return this.field10229;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "get",
      descriptor = "(J[BIII)V"
   )
   private final native void get(long arg0, byte[] arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "a",
      descriptor = "([BIII)V"
   )
   public void method3739(byte[] arg0, int arg1, int arg2, int arg3) {
      if (arg0.length < arg1 + arg3 | ~this.field10229 == -1L | arg0 == null | ~arg1 > -1 | arg2 < 0 | this.field10228 < arg2 - -arg3) {
         throw new RuntimeException();
      } else {
         this.put(this.field10229, arg0, arg1, arg2, arg3);
      }
   }

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "a",
      descriptor = "(JI)V"
   )
   protected final void method5116(long arg0, int arg1) {
      this.field10229 = arg0;
      this.field10228 = arg1;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "getSize",
      descriptor = "()I"
   )
   public final int getSize() {
      return this.field10228;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/NativeBuffer",
      name = "put",
      descriptor = "(J[BIII)V"
   )
   private final native void put(long arg0, byte[] arg1, int arg2, int arg3, int arg4);
}
