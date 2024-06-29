package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/NativeBuffer")
public class NativeBuffer implements Buffer, Source {

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "b", descriptor = "I")
    private int field5825 = -1;

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "a", descriptor = "J")
    private long field5824;

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "getSize", descriptor = "()I")
    public final int getSize() {
        return this.field5825;
    }

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "getAddress", descriptor = "()J")
    public final long getAddress() {
        return this.field5824;
    }

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "a", descriptor = "(JI)V")
    protected final void method2557(long arg0, int arg1) {
        this.field5824 = arg0;
        this.field5825 = arg1;
    }

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "a", descriptor = "([BIII)V")
    public void method2556(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null | this.field5824 == 0L | arg1 < 0 | arg0.length < arg1 + arg3 | arg2 < 0 | this.field5825 < (arg2 + arg3)) {
            throw new RuntimeException();
        }
        this.put(this.field5824, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "get", descriptor = "(J[BIII)V")
    private final native void get(long arg0, byte[] arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jaclib/memory/NativeBuffer", name = "put", descriptor = "(J[BIII)V")
    private final native void put(long arg0, byte[] arg1, int arg2, int arg3, int arg4);
}
