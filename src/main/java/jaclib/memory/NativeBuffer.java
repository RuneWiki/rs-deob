package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/NativeBuffer")
public class NativeBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "a", descriptor = "I")
    private int field8543 = -1;

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "b", descriptor = "J")
    private long field8544;

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "put", descriptor = "(J[BIII)V")
    private final native void put(long arg0, byte[] arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "getSize", descriptor = "()I")
    public final int getSize() {
        return this.field8543;
    }

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "a", descriptor = "(JI)V")
    protected final void method3430(long arg0, int arg1) {
        this.field8543 = arg1;
        this.field8544 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "getAddress", descriptor = "()J")
    public final long getAddress() {
        return this.field8544;
    }

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "get", descriptor = "(J[BIII)V")
    private final native void get(long arg0, byte[] arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "a", descriptor = "([BIII)V")
    public void method2562(byte[] arg0, int arg1, int arg2, int arg3) {
        if (this.field8543 < arg2 + arg3 | arg1 + arg3 > arg0.length | arg1 < 0 | arg0 == null | this.field8544 == 0L | arg2 < 0) {
            throw new RuntimeException();
        }
        this.put(this.field8544, arg0, arg1, arg2, arg3);
    }
}
