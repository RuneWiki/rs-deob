package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/NativeBuffer")
public class NativeBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "a", descriptor = "I")
    private int field8679 = -1;

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "b", descriptor = "J")
    private long field8680;

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "getSize", descriptor = "()I", line = 4)
    public final int getSize() {
        return this.field8679;
    }

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "a", descriptor = "(JI)V", line = 14)
    protected final void method3490(long arg0, int arg1) {
        this.field8680 = arg0;
        this.field8679 = arg1;
    }

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "getAddress", descriptor = "()J", line = 26)
    public final long getAddress() {
        return this.field8680;
    }

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "a", descriptor = "([BIII)V", line = 37)
    public void method2548(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 + arg3 > arg0.length | arg1 < 0 | arg0 == null | this.field8680 == 0L | arg2 < 0 | (arg2 + arg3) > this.field8679) {
            throw new RuntimeException();
        }
        this.put(this.field8680, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "get", descriptor = "(J[BIII)V")
    private final native void get(long arg0, byte[] arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "put", descriptor = "(J[BIII)V")
    private final native void put(long arg0, byte[] arg1, int arg2, int arg3, int arg4);
}
