package jagex3.jagmisc;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagex3/jagmisc/jagmisc")
public class jagmisc {

    @OriginalMember(owner = "client!jagex3/jagmisc/jagmisc", name = "ping0", descriptor = "(BBBBJ)I")
    private static native int ping0(byte arg0, byte arg1, byte arg2, byte arg3, long arg4);

    @OriginalMember(owner = "client!jagex3/jagmisc/jagmisc", name = "getTotalPhysicalMemory", descriptor = "()J")
    public static native long getTotalPhysicalMemory();

    @OriginalMember(owner = "client!jagex3/jagmisc/jagmisc", name = "getAvailablePhysicalMemory", descriptor = "()J")
    public static native long getAvailablePhysicalMemory();

    @OriginalMember(owner = "client!jagex3/jagmisc/jagmisc", name = "quit", descriptor = "()V")
    public static void quit() {
        Quit0();
    }

    @OriginalMember(owner = "client!jagex3/jagmisc/jagmisc", name = "ping", descriptor = "(BBBBJ)I")
    public static int ping(byte arg0, byte arg1, byte arg2, byte arg3, long arg4) throws Throwable {
        int var6 = ping0(arg0, arg1, arg2, arg3, arg4);
        if (var6 < 0) {
            throw new Exception(String.valueOf(var6));
        }
        return var6;
    }

    @OriginalMember(owner = "client!jagex3/jagmisc/jagmisc", name = "init", descriptor = "()Z")
    public static native boolean init();

    @OriginalMember(owner = "client!jagex3/jagmisc/jagmisc", name = "nanoTime", descriptor = "()J")
    public static native long nanoTime();

    @OriginalMember(owner = "client!jagex3/jagmisc/jagmisc", name = "Quit0", descriptor = "()V")
    private static native void Quit0();
}
