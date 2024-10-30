package jaclib.memory.heap;

import deob.ObfuscatedName;
import jaclib.memory.Buffer;
import jaclib.memory.Source;

public class NativeHeapBuffer implements Buffer, Source {

    @ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.e")
    public final int field412;

    @ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.n")
    public final NativeHeap field413;

    @ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.m")
    public final int field414;

    @ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.k")
    public boolean field415 = true;

    public NativeHeapBuffer(NativeHeap arg0, int arg1, int arg2) {
        this.field413 = arg0;
        this.field414 = arg1;
        this.field412 = arg2;
    }

    @ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.p()Z")
    public final synchronized boolean method81() {
        return this.field413.method92() && this.field415;
    }

    @ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.n()J")
    public final long method50() {
        return this.field413.getBufferAddress(this.field414);
    }

    @ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.e()I")
    public final int method49() {
        return this.field412;
    }

    @ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.m([BIII)V")
    public final synchronized void method9(byte[] arg0, int arg1, int arg2, int arg3) {
        if (!this.method81() | arg0 == null | arg1 < 0 | arg1 + arg3 > arg0.length | arg2 < 0 | arg2 + arg3 > this.field412) {
            throw new RuntimeException();
        }
        this.field413.put(this.field414, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("jaclib/memory/heap/NativeHeapBuffer.d()V")
    public final synchronized void method82() {
        if (this.method81()) {
            this.field413.deallocateBuffer(this.field414);
        }
        this.field415 = false;
    }

    public final synchronized void finalize() throws Throwable {
        super.finalize();
        this.method82();
    }
}
