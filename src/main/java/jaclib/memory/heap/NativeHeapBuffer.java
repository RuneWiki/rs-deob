package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeapBuffer")
public class NativeHeapBuffer implements Buffer, Source {
   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "d",
      descriptor = "Z"
   )
   private boolean field10259 = true;
   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "a",
      descriptor = "I"
   )
   public int field10258;
   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "c",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   private NativeHeap field10260;
   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "b",
      descriptor = "I"
   )
   private int field10261;

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "a",
      descriptor = "([BIII)V"
   )
   public final synchronized void method3733(byte[] arg0, int arg1, int arg2, int arg3) {
      if (!this.method5093() | arg0 == null | arg1 < 0 | arg1 + arg3 > arg0.length | ~arg2 > -1 | ~this.field10258 > ~(arg2 - -arg3)) {
         throw new RuntimeException();
      } else {
         this.field10260.put(this.field10261, arg0, arg1, arg2, arg3);
      }
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "b",
      descriptor = "()Z"
   )
   private final synchronized boolean method5093() {
      return this.field10260.method5095() && this.field10259;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "a",
      descriptor = "()V"
   )
   private final synchronized void method5094() {
      if (this.method5093()) {
         this.field10260.deallocateBuffer(this.field10261);
      }

      this.field10259 = false;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "getSize",
      descriptor = "()I"
   )
   public final int getSize() {
      return this.field10258;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "getAddress",
      descriptor = "()J"
   )
   public final long getAddress() {
      return this.field10260.getBufferAddress(this.field10261);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "finalize",
      descriptor = "()V"
   )
   protected final synchronized void finalize() throws Throwable {
      super.finalize();
      this.method5094();
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "<init>",
      descriptor = "(Ljaclib/memory/heap/NativeHeap;II)V"
   )
   public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
      this.field10258 = arg2;
      this.field10260 = arg0;
      this.field10261 = arg1;
   }
}
