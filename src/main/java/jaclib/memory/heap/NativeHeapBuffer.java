package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public class NativeHeapBuffer implements Buffer, Source {
   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "a",
      descriptor = "Z"
   )
   private boolean field10679 = true;
   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "c",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   private NativeHeap field10677;
   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "d",
      descriptor = "I"
   )
   public int field10678;
   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "b",
      descriptor = "I"
   )
   private int field10676;

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "finalize",
      descriptor = "()V",
      line = 4
   )
   protected final synchronized void finalize() throws Throwable {
      super.finalize();
      this.method5239();
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "b",
      descriptor = "()Z",
      line = 17
   )
   private final synchronized boolean method5238() {
      return this.field10677.method5235() && this.field10679;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "getSize",
      descriptor = "()I",
      line = 24
   )
   public final int getSize() {
      return this.field10678;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "getAddress",
      descriptor = "()J",
      line = 31
   )
   public final long getAddress() {
      return this.field10677.getBufferAddress(this.field10676);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "a",
      descriptor = "([BIII)V",
      line = 39
   )
   public final synchronized void method548(byte[] arg0, int arg1, int arg2, int arg3) {
      if (arg2 < 0 | ~arg1 > -1 | !this.method5238() | arg0 == null | ~arg0.length > ~(arg1 + arg3) | arg2 + arg3 > this.field10678) {
         throw new RuntimeException();
      } else {
         this.field10677.put(this.field10676, arg0, arg1, arg2, arg3);
      }
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "a",
      descriptor = "()V",
      line = 49
   )
   private final synchronized void method5239() {
      if (this.method5238()) {
         this.field10677.deallocateBuffer(this.field10676);
      }

      this.field10679 = false;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "<init>",
      descriptor = "(Ljaclib/memory/heap/NativeHeap;II)V",
      line = 63
   )
   public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
      this.field10677 = arg0;
      this.field10678 = arg2;
      this.field10676 = arg1;
   }
}
