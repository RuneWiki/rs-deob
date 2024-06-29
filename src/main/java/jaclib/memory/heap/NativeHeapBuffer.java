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
   private boolean field10228 = true;
   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "a",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   private NativeHeap field10229;
   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "c",
      descriptor = "I"
   )
   private int field10230;
   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "d",
      descriptor = "I"
   )
   public int field10227;

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "getSize",
      descriptor = "()I",
      line = 7
   )
   public final int getSize() {
      return this.field10227;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "getAddress",
      descriptor = "()J",
      line = 14
   )
   public final long getAddress() {
      return this.field10229.getBufferAddress(this.field10230);
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "finalize",
      descriptor = "()V",
      line = 21
   )
   protected final synchronized void finalize() throws Throwable {
      super.finalize();
      this.method5076();
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "<init>",
      descriptor = "(Ljaclib/memory/heap/NativeHeap;II)V",
      line = 35
   )
   public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
      this.field10229 = arg0;
      this.field10230 = arg1;
      this.field10227 = arg2;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "a",
      descriptor = "()V",
      line = 45
   )
   private final synchronized void method5076() {
      if (this.method5077()) {
         this.field10229.deallocateBuffer(this.field10230);
      }

      this.field10228 = false;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "b",
      descriptor = "()Z",
      line = 56
   )
   private final synchronized boolean method5077() {
      return this.field10229.method5079() && this.field10228;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeapBuffer",
      name = "a",
      descriptor = "([BIII)V",
      line = 63
   )
   public final synchronized void method3821(byte[] arg0, int arg1, int arg2, int arg3) {
      if (~arg2 > -1 | arg0 == null | !this.method5077() | arg1 < 0 | arg1 - -arg3 > arg0.length | arg2 + arg3 > this.field10227) {
         throw new RuntimeException();
      } else {
         this.field10229.put(this.field10230, arg0, arg1, arg2, arg3);
      }
   }
}
