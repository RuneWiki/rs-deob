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
   private boolean field10502 = true;
   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "b",
      descriptor = "I"
   )
   private int field10503;
   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "a",
      descriptor = "I"
   )
   public int field10505;
   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "c",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   private NativeHeap field10504;

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "a",
      descriptor = "([BIII)V"
   )
   public final synchronized void method3792(byte[] arg0, int arg1, int arg2, int arg3) {
      if (~arg2 > -1 | arg1 < 0 | !this.method5080() | arg0 == null | ~(arg1 + arg3) < ~arg0.length | arg2 + arg3 > this.field10505) {
         throw new RuntimeException();
      } else {
         this.field10504.put(this.field10503, arg0, arg1, arg2, arg3);
      }
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "getAddress",
      descriptor = "()J"
   )
   public final long getAddress() {
      return this.field10504.getBufferAddress(this.field10503);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "getSize",
      descriptor = "()I"
   )
   public final int getSize() {
      return this.field10505;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "a",
      descriptor = "()V"
   )
   private final synchronized void method5079() {
      if (this.method5080()) {
         this.field10504.deallocateBuffer(this.field10503);
      }

      this.field10502 = false;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "b",
      descriptor = "()Z"
   )
   private final synchronized boolean method5080() {
      return this.field10504.method5081() && this.field10502;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "<init>",
      descriptor = "(Ljaclib/memory/heap/NativeHeap;II)V"
   )
   public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
      this.field10503 = arg1;
      this.field10505 = arg2;
      this.field10504 = arg0;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "finalize",
      descriptor = "()V"
   )
   protected final synchronized void finalize() throws Throwable {
      super.finalize();
      this.method5079();
   }
}
