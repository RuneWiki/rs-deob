package deob;

@ObfuscatedName("hc")
public class class221 implements class220 {

    @ObfuscatedName("hc.e")
    public static final class221 field2773 = new class221("", 10);

    @ObfuscatedName("hc.n")
    public static final class221 field2764 = new class221("", 11);

    @ObfuscatedName("hc.g")
    public static final class221 field2765 = new class221("", 12);

    @ObfuscatedName("hc.y")
    public static final class221 field2766 = new class221("", 13);

    @ObfuscatedName("hc.w")
    public static final class221 field2767 = new class221("", 14);

    @ObfuscatedName("hc.k")
    public static final class221 field2763 = new class221("", 15, new class7[] { class7.field188, class7.field188 }, (class7[]) null);

    @ObfuscatedName("hc.v")
    public static final class221 field2768 = new class221("", 16, new class7[] { class7.field188, class7.field188 }, (class7[]) null);

    @ObfuscatedName("hc.z")
    public static final class221 field2769 = new class221("", 17, new class7[] { class7.field188, class7.field188 }, (class7[]) null);

    @ObfuscatedName("hc.r")
    public static final class221 field2771 = new class221("", 73, true, true);

    @ObfuscatedName("hc.u")
    public static final class221 field2772 = new class221("", 76, true, false);

    @ObfuscatedName("hc.d")
    public final int field2770;

    public class221(String arg0, int arg1) {
        this(arg0, arg1, false, (class7[]) null, false, (class7[]) null);
    }

    public class221(String arg0, int arg1, boolean arg2, boolean arg3) {
        this(arg0, arg1, arg2, (class7[]) null, arg3, (class7[]) null);
    }

    public class221(String arg0, int arg1, class7[] arg2, class7[] arg3) {
        this(arg0, arg1, arg2 != null, arg2, arg3 != null, arg3);
    }

    public class221(String arg0, int arg1, boolean arg2, class7[] arg3, boolean arg4, class7[] arg5) {
        this.field2770 = arg1;
    }

    @ObfuscatedName("cj.y(Lhc;I)Z")
    public static boolean method1564(class221 arg0) {
        return field2773 == arg0 || field2764 == arg0 || field2765 == arg0 || field2766 == arg0 || field2767 == arg0 || field2763 == arg0 || field2768 == arg0 || field2769 == arg0;
    }

    @ObfuscatedName("hc.e(I)I")
    public int method6() {
        return this.field2770;
    }
}
