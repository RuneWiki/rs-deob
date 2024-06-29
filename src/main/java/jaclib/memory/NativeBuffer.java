package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/NativeBuffer")
public class NativeBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "a", descriptor = "I")
    private int field8768 = -1;

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "b", descriptor = "J")
    private long field8769;

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "a", descriptor = "([BIII)V", line = 6)
    public void method2506(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 0 | this.field8769 == 0L | arg0 == null | arg1 < 0 | (arg1 + arg3) > arg0.length | arg2 + arg3 > this.field8768) {
            throw new RuntimeException();
        }
        this.put(this.field8769, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "getAddress", descriptor = "()J", line = 17)
    public final long getAddress() {
        return this.field8769;
    }

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "a", descriptor = "(JI)V", line = 28)
    protected final void method3460(long arg0, int arg1) {
        this.field8769 = arg0;
        this.field8768 = arg1;
    }

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "getSize", descriptor = "()I", line = 41)
    public final int getSize() {
        return this.field8768;
    }

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "put", descriptor = "(J[BIII)V")
    private final native void put(long arg0, byte[] arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "get", descriptor = "(J[BIII)V")
    private final native void get(long arg0, byte[] arg1, int arg2, int arg3, int arg4);
}
