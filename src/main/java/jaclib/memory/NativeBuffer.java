package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/NativeBuffer")
public class NativeBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "a", descriptor = "I")
    private int field9107 = -1;

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "b", descriptor = "J")
    private long field9108;

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "a", descriptor = "([BIII)V", line = 4)
    public void method2899(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg0.length < arg1 + arg3 | this.field9108 == 0L | arg0 == null | arg1 < 0 | arg2 < 0 | this.field9107 < (arg2 + arg3)) {
            throw new RuntimeException();
        }
        this.put(this.field9108, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "getSize", descriptor = "()I", line = 16)
    public final int getSize() {
        return this.field9107;
    }

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "getAddress", descriptor = "()J", line = 24)
    public final long getAddress() {
        return this.field9108;
    }

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "a", descriptor = "(JI)V", line = 36)
    protected final void method3667(long arg0, int arg1) {
        this.field9107 = arg1;
        this.field9108 = arg0;
    }

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "put", descriptor = "(J[BIII)V")
    private final native void put(long arg0, byte[] arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "get", descriptor = "(J[BIII)V")
    private final native void get(long arg0, byte[] arg1, int arg2, int arg3, int arg4);
}
