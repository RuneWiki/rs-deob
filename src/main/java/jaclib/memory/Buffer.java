package jaclib.memory;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Buffer")
public interface Buffer {

    @OriginalMember(owner = "client!jaclib/memory/Buffer", name = "getAddress", descriptor = "()J")
    long getAddress();

    @OriginalMember(owner = "client!jaclib/memory/Buffer", name = "a", descriptor = "([BIII)V")
    void method2587(byte[] arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jaclib/memory/Buffer", name = "getSize", descriptor = "()I")
    int getSize();
}
