package deob;

@ObfuscatedName("hk")
public class class223 implements class222 {

    @ObfuscatedName("hk.w")
    public static final class223 field2805 = new class223("", 10);

    @ObfuscatedName("hk.o")
    public static final class223 field2797 = new class223("", 11);

    @ObfuscatedName("hk.x")
    public static final class223 field2799 = new class223("", 12);

    @ObfuscatedName("hk.k")
    public static final class223 field2796 = new class223("", 13);

    @ObfuscatedName("hk.f")
    public static final class223 field2804 = new class223("", 14);

    @ObfuscatedName("hk.i")
    public static final class223 field2801 = new class223("", 15, new class7[] { class7.field104, class7.field104 }, (class7[]) null);

    @ObfuscatedName("hk.j")
    public static final class223 field2802 = new class223("", 16, new class7[] { class7.field104, class7.field104 }, (class7[]) null);

    @ObfuscatedName("hk.m")
    public static final class223 field2803 = new class223("", 17, new class7[] { class7.field104, class7.field104 }, (class7[]) null);

    @ObfuscatedName("hk.u")
    public static final class223 field2798 = new class223("", 73, true, true);

    @ObfuscatedName("hk.r")
    public static final class223 field2807 = new class223("", 76, true, false);

    @ObfuscatedName("hk.v")
    public final int field2806;

    public class223(String arg0, int arg1) {
        this(arg0, arg1, false, (class7[]) null, false, (class7[]) null);
    }

    public class223(String arg0, int arg1, boolean arg2, boolean arg3) {
        this(arg0, arg1, arg2, (class7[]) null, arg3, (class7[]) null);
    }

    public class223(String arg0, int arg1, class7[] arg2, class7[] arg3) {
        this(arg0, arg1, arg2 != null, arg2, arg3 != null, arg3);
    }

    public class223(String arg0, int arg1, boolean arg2, class7[] arg3, boolean arg4, class7[] arg5) {
        this.field2806 = arg1;
    }

    @ObfuscatedName("fz.k(Lhk;S)Z")
    public static boolean method3090(class223 arg0) {
        return field2805 == arg0 || field2797 == arg0 || field2799 == arg0 || field2796 == arg0 || field2804 == arg0 || field2801 == arg0 || field2802 == arg0 || field2803 == arg0;
    }

    @ObfuscatedName("hk.w(I)I")
    public int method12() {
        return this.field2806;
    }
}
