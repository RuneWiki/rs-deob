package deob;

@ObfuscatedName("iu")
public class class246 implements class245 {

    @ObfuscatedName("iu.o")
    public static final class246 field2977 = new class246("", 10);

    @ObfuscatedName("iu.k")
    public static final class246 field2970 = new class246("", 11);

    @ObfuscatedName("iu.t")
    public static final class246 field2966 = new class246("", 12);

    @ObfuscatedName("iu.d")
    public static final class246 field2971 = new class246("", 13);

    @ObfuscatedName("iu.h")
    public static final class246 field2968 = new class246("", 14);

    @ObfuscatedName("iu.m")
    public static final class246 field2969 = new class246("", 15, new class7[] { class7.field48, class7.field48 }, (class7[]) null);

    @ObfuscatedName("iu.z")
    public static final class246 field2972 = new class246("", 16, new class7[] { class7.field48, class7.field48 }, (class7[]) null);

    @ObfuscatedName("iu.i")
    public static final class246 field2967 = new class246("", 17, new class7[] { class7.field48, class7.field48 }, (class7[]) null);

    @ObfuscatedName("iu.u")
    public static final class246 field2964 = new class246("", 73, true, true);

    @ObfuscatedName("iu.x")
    public static final class246 field2973 = new class246("", 76, true, false);

    @ObfuscatedName("iu.y")
    public final int field2974;

    public class246(String arg0, int arg1) {
        this(arg0, arg1, false, (class7[]) null, false, (class7[]) null);
    }

    public class246(String arg0, int arg1, boolean arg2, boolean arg3) {
        this(arg0, arg1, arg2, (class7[]) null, arg3, (class7[]) null);
    }

    public class246(String arg0, int arg1, class7[] arg2, class7[] arg3) {
        this(arg0, arg1, arg2 != null, arg2, arg3 != null, arg3);
    }

    public class246(String arg0, int arg1, boolean arg2, class7[] arg3, boolean arg4, class7[] arg5) {
        this.field2974 = arg1;
    }

    @ObfuscatedName("jy.t(Liu;B)Z")
    public static boolean method4536(class246 arg0) {
        return field2977 == arg0 || field2970 == arg0 || field2966 == arg0 || field2971 == arg0 || field2968 == arg0 || field2969 == arg0 || field2972 == arg0 || field2967 == arg0;
    }

    @ObfuscatedName("iu.o(I)I")
    public int method8() {
        return this.field2974;
    }
}
