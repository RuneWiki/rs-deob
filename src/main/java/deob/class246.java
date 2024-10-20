package deob;

@ObfuscatedName("ir")
public class class246 implements class245 {

    @ObfuscatedName("ir.d")
    public static final class246 field2969 = new class246("", 10);

    @ObfuscatedName("ir.z")
    public static final class246 field2964 = new class246("", 11);

    @ObfuscatedName("ir.n")
    public static final class246 field2963 = new class246("", 12);

    @ObfuscatedName("ir.r")
    public static final class246 field2973 = new class246("", 13);

    @ObfuscatedName("ir.e")
    public static final class246 field2965 = new class246("", 14);

    @ObfuscatedName("ir.y")
    public static final class246 field2968 = new class246("", 15, new class7[] { class7.field150, class7.field150 }, (class7[]) null);

    @ObfuscatedName("ir.k")
    public static final class246 field2966 = new class246("", 16, new class7[] { class7.field150, class7.field150 }, (class7[]) null);

    @ObfuscatedName("ir.s")
    public static final class246 field2970 = new class246("", 17, new class7[] { class7.field150, class7.field150 }, (class7[]) null);

    @ObfuscatedName("ir.p")
    public static final class246 field2971 = new class246("", 73, true, true);

    @ObfuscatedName("ir.x")
    public static final class246 field2972 = new class246("", 76, true, false);

    @ObfuscatedName("ir.m")
    public final int field2967;

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
        this.field2967 = arg1;
    }

    @ObfuscatedName("bp.n(Lir;I)Z")
    public static boolean method1090(class246 arg0) {
        return field2969 == arg0 || field2964 == arg0 || field2963 == arg0 || field2973 == arg0 || field2965 == arg0 || field2968 == arg0 || field2966 == arg0 || field2970 == arg0;
    }

    @ObfuscatedName("ir.d(I)I")
    public int method12() {
        return this.field2967;
    }
}
