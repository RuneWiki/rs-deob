package deob;

@ObfuscatedName("hd")
public class class223 implements class222 {

    @ObfuscatedName("hd.s")
    public static final class223 field2811 = new class223("", 10);

    @ObfuscatedName("hd.c")
    public static final class223 field2813 = new class223("", 11);

    @ObfuscatedName("hd.f")
    public static final class223 field2808 = new class223("", 12);

    @ObfuscatedName("hd.m")
    public static final class223 field2809 = new class223("", 13);

    @ObfuscatedName("hd.h")
    public static final class223 field2807 = new class223("", 14);

    @ObfuscatedName("hd.t")
    public static final class223 field2812 = new class223("", 15, new class7[] { class7.field70, class7.field70 }, (class7[]) null);

    @ObfuscatedName("hd.p")
    public static final class223 field2814 = new class223("", 16, new class7[] { class7.field70, class7.field70 }, (class7[]) null);

    @ObfuscatedName("hd.d")
    public static final class223 field2810 = new class223("", 17, new class7[] { class7.field70, class7.field70 }, (class7[]) null);

    @ObfuscatedName("hd.n")
    public static final class223 field2806 = new class223("", 73, true, true);

    @ObfuscatedName("hd.z")
    public static final class223 field2815 = new class223("", 76, true, false);

    @ObfuscatedName("hd.o")
    public final int field2816;

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
        this.field2816 = arg1;
    }

    @ObfuscatedName("ez.h(Lhd;B)Z")
    public static boolean method2703(class223 arg0) {
        return field2811 == arg0 || field2813 == arg0 || field2808 == arg0 || field2809 == arg0 || field2807 == arg0 || field2812 == arg0 || field2814 == arg0 || field2810 == arg0;
    }

    @ObfuscatedName("hd.s(I)I")
    public int method16() {
        return this.field2816;
    }
}
