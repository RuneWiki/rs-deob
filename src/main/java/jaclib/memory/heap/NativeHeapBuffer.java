package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public class NativeHeapBuffer implements Buffer, Source {
   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "b",
      descriptor = "Z"
   )
   private boolean field10218 = true;
   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "c",
      descriptor = "I"
   )
   private int field10217;
   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "a",
      descriptor = "I"
   )
   public int field10220;
   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "d",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   private NativeHeap field10219;

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "a",
      descriptor = "([BIII)V"
   )
   public final synchronized void method3739(byte[] arg0, int arg1, int arg2, int arg3) {
      if (~arg1 > -1 | arg0 == null | !this.method5096() | arg0.length < arg1 - -arg3 | arg2 < 0 | ~(arg2 + arg3) < ~this.field10220) {
         throw new RuntimeException();
      } else {
         this.field10219.put(this.field10217, arg0, arg1, arg2, arg3);
      }
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "b",
      descriptor = "()Z"
   )
   private final synchronized boolean method5096() {
      return this.field10219.method5099() && this.field10218;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "a",
      descriptor = "()V"
   )
   private final synchronized void method5097() {
      if (this.method5096()) {
         this.field10219.deallocateBuffer(this.field10217);
      }

      this.field10218 = false;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "finalize",
      descriptor = "()V"
   )
   protected final synchronized void finalize() throws Throwable {
      super.finalize();
      this.method5097();
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "<init>",
      descriptor = "(Ljaclib/memory/heap/NativeHeap;II)V"
   )
   public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
      this.field10217 = arg1;
      this.field10220 = arg2;
      this.field10219 = arg0;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "getAddress",
      descriptor = "()J"
   )
   public final long getAddress() {
      return this.field10219.getBufferAddress(this.field10217);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "getSize",
      descriptor = "()I"
   )
   public final int getSize() {
      return this.field10220;
   }
}
