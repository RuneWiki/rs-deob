package deob;

@ObfuscatedName("iv")
public class class246 implements class245 {

    @ObfuscatedName("iv.g")
    public static final class246 field2961 = new class246("", 10);

    @ObfuscatedName("iv.e")
    public static final class246 field2962 = new class246("", 11);

    @ObfuscatedName("iv.b")
    public static final class246 field2963 = new class246("", 12);

    @ObfuscatedName("iv.z")
    public static final class246 field2970 = new class246("", 13);

    @ObfuscatedName("iv.n")
    public static final class246 field2964 = new class246("", 14);

    @ObfuscatedName("iv.l")
    public static final class246 field2965 = new class246("", 15, new class7[] { class7.field113, class7.field113 }, (class7[]) null);

    @ObfuscatedName("iv.s")
    public static final class246 field2966 = new class246("", 16, new class7[] { class7.field113, class7.field113 }, (class7[]) null);

    @ObfuscatedName("iv.y")
    public static final class246 field2967 = new class246("", 17, new class7[] { class7.field113, class7.field113 }, (class7[]) null);

    @ObfuscatedName("iv.c")
    public static final class246 field2968 = new class246("", 73, true, true);

    @ObfuscatedName("iv.h")
    public static final class246 field2969 = new class246("", 76, true, false);

    @ObfuscatedName("iv.i")
    public final int field2960;

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
        this.field2960 = arg1;
    }

    @ObfuscatedName("et.n(Liv;B)Z")
    public static boolean method2940(class246 arg0) {
        return field2961 == arg0 || field2962 == arg0 || field2963 == arg0 || field2970 == arg0 || field2964 == arg0 || field2965 == arg0 || field2966 == arg0 || field2967 == arg0;
    }

    @ObfuscatedName("iv.g(S)I")
    public int method15() {
        return this.field2960;
    }
}
