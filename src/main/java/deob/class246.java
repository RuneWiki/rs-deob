package deob;

@ObfuscatedName("iw")
public class class246 implements class245 {

    @ObfuscatedName("iw.t")
    public static final class246 field2966 = new class246("", 10);

    @ObfuscatedName("iw.q")
    public static final class246 field2965 = new class246("", 11);

    @ObfuscatedName("iw.i")
    public static final class246 field2958 = new class246("", 12);

    @ObfuscatedName("iw.a")
    public static final class246 field2959 = new class246("", 13);

    @ObfuscatedName("iw.l")
    public static final class246 field2956 = new class246("", 14);

    @ObfuscatedName("iw.b")
    public static final class246 field2961 = new class246("", 15, new class7[] { class7.field211, class7.field211 }, (class7[]) null);

    @ObfuscatedName("iw.e")
    public static final class246 field2957 = new class246("", 16, new class7[] { class7.field211, class7.field211 }, (class7[]) null);

    @ObfuscatedName("iw.x")
    public static final class246 field2963 = new class246("", 17, new class7[] { class7.field211, class7.field211 }, (class7[]) null);

    @ObfuscatedName("iw.p")
    public static final class246 field2964 = new class246("", 73, true, true);

    @ObfuscatedName("iw.g")
    public static final class246 field2960 = new class246("", 76, true, false);

    @ObfuscatedName("iw.n")
    public final int field2962;

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
        this.field2962 = arg1;
    }

    @ObfuscatedName("gs.a(Liw;I)Z")
    public static boolean method3171(class246 arg0) {
        return field2966 == arg0 || field2965 == arg0 || field2958 == arg0 || field2959 == arg0 || field2956 == arg0 || field2961 == arg0 || field2957 == arg0 || field2963 == arg0;
    }

    @ObfuscatedName("iw.t(B)I")
    public int method12() {
        return this.field2962;
    }
}
