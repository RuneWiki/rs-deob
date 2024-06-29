package jaclib.memory.heap;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/heap/NativeHeap")
public class NativeHeap {
   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeap",
      name = "a",
      descriptor = "I"
   )
   private int field10262;
   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeap",
      name = "b",
      descriptor = "Z"
   )
   private boolean field10263;
   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeap",
      name = "peer",
      descriptor = "J"
   )
   public long peer;

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeap",
      name = "finalize",
      descriptor = "()V",
      line = 6
   )
   protected final synchronized void finalize() throws Throwable {
      super.finalize();
      this.method5097();
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeap",
      name = "b",
      descriptor = "()Z",
      line = 17
   )
   public final synchronized boolean method5095() {
      return this.field10263;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeap",
      name = "<init>",
      descriptor = "(I)V",
      line = 26
   )
   public NativeHeap(int arg0) {
      this.field10262 = arg0;
      this.allocateHeap(this.field10262);
      this.field10263 = true;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeap",
      name = "a",
      descriptor = "(IZ)Ljaclib/memory/heap/NativeHeapBuffer;",
      line = 38
   )
   public final NativeHeapBuffer method5096(int arg0, boolean arg1) {
      if (!this.field10263) {
         throw new IllegalStateException();
      } else {
         return new NativeHeapBuffer(this, this.allocateBuffer(arg0, arg1), arg0);
      }
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeap",
      name = "a",
      descriptor = "()V",
      line = 49
   )
   public final synchronized void method5097() {
      if (this.field10263) {
         this.deallocateHeap();
      }

      this.field10263 = false;
   }

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeap",
      name = "deallocateBuffer",
      descriptor = "(I)V"
   )
   public final synchronized native void deallocateBuffer(int arg0);

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeap",
      name = "deallocateHeap",
      descriptor = "()V"
   )
   private final native void deallocateHeap();

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeap",
      name = "get",
      descriptor = "(I[BIII)V"
   )
   public final synchronized native void get(int arg0, byte[] arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeap",
      name = "put",
      descriptor = "(I[BIII)V"
   )
   public final synchronized native void put(int arg0, byte[] arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeap",
      name = "allocateBuffer",
      descriptor = "(IZ)I"
   )
   public final synchronized native int allocateBuffer(int arg0, boolean arg1);

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeap",
      name = "getBufferAddress",
      descriptor = "(I)J"
   )
   public final synchronized native long getBufferAddress(int arg0);

   @OriginalMember(
      owner = "client!jaclib/memory/heap/NativeHeap",
      name = "allocateHeap",
      descriptor = "(I)V"
   )
   private final native void allocateHeap(int arg0);
}
