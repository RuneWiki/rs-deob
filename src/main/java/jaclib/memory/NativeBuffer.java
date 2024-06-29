package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/NativeBuffer")
public class NativeBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "b", descriptor = "I")
    private int field8602 = -1;

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "a", descriptor = "J")
    private long field8601;

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "a", descriptor = "([BIII)V", line = 7)
    public void method2437(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 0 | this.field8601 == 0L | arg0 == null | arg0.length < arg1 + arg3 | arg2 < 0 | arg2 + arg3 > this.field8602) {
            throw new RuntimeException();
        }
        this.put(this.field8601, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "getAddress", descriptor = "()J", line = 19)
    public final long getAddress() {
        return this.field8601;
    }

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "getSize", descriptor = "()I", line = 27)
    public final int getSize() {
        return this.field8602;
    }

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "a", descriptor = "(JI)V", line = 34)
    protected final void method3426(long arg0, int arg1) {
        this.field8601 = arg0;
        this.field8602 = arg1;
    }

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "get", descriptor = "(J[BIII)V")
    private final native void get(long arg0, byte[] arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "put", descriptor = "(J[BIII)V")
    private final native void put(long arg0, byte[] arg1, int arg2, int arg3, int arg4);
}
