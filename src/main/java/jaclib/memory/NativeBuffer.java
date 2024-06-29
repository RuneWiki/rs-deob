package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/NativeBuffer")
public class NativeBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "b", descriptor = "I")
    private int field9884 = -1;

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "a", descriptor = "J")
    private long field9883;

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "a", descriptor = "([BIII)V", line = 4)
    public void method2972(byte[] arg0, int arg1, int arg2, int arg3) {
        if ((arg2 + arg3) > this.field9884 | arg2 < 0 | arg1 + arg3 > arg0.length | arg1 < 0 | this.field9883 == 0L | arg0 == null) {
            throw new RuntimeException();
        }
        this.put(this.field9883, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "getSize", descriptor = "()I", line = 15)
    public final int getSize() {
        return this.field9884;
    }

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "getAddress", descriptor = "()J", line = 22)
    public final long getAddress() {
        return this.field9883;
    }

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "a", descriptor = "(JI)V", line = 30)
    protected final void method3963(long arg0, int arg1) {
        this.field9883 = arg0;
        this.field9884 = arg1;
    }

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "get", descriptor = "(J[BIII)V")
    private final native void get(long arg0, byte[] arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "put", descriptor = "(J[BIII)V")
    private final native void put(long arg0, byte[] arg1, int arg2, int arg3, int arg4);
}
