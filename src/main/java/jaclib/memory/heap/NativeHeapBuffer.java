package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public class NativeHeapBuffer implements Buffer, Source {
   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "c",
      descriptor = "Z"
   )
   private boolean field5972 = true;
   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "a",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   private NativeHeap field5969;
   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "d",
      descriptor = "I"
   )
   private int field5970;
   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "b",
      descriptor = "I"
   )
   public int field5971;

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "b",
      descriptor = "()Z"
   )
   private final synchronized boolean method3172() {
      return this.field5969.method3171() && this.field5972;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "finalize",
      descriptor = "()V"
   )
   protected final synchronized void finalize() throws Throwable {
      super.finalize();
      this.method3173();
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "getAddress",
      descriptor = "()J"
   )
   public final long getAddress() {
      return this.field5969.getBufferAddress(this.field5970);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "getSize",
      descriptor = "()I"
   )
   public final int getSize() {
      return this.field5971;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "a",
      descriptor = "([BIII)V"
   )
   public final synchronized void method3134(byte[] arg0, int arg1, int arg2, int arg3) {
      if (~arg1 > -1 | !this.method3172() | arg0 == null | ~arg0.length > ~(arg1 - -arg3) | arg2 < 0 | arg2 + arg3 > this.field5971) {
         throw new RuntimeException();
      } else {
         this.field5969.put(this.field5970, arg0, arg1, arg2, arg3);
      }
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "a",
      descriptor = "()V"
   )
   private final synchronized void method3173() {
      if (this.method3172()) {
         this.field5969.deallocateBuffer(this.field5970);
      }

      this.field5972 = false;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "<init>",
      descriptor = "(Ljaclib/memory/heap/NativeHeap;II)V"
   )
   public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
      this.field5969 = arg0;
      this.field5970 = arg1;
      this.field5971 = arg2;
   }
}
