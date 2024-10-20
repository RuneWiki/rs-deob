package deob;

@ObfuscatedName("hh")
public class class220 implements class219 {

    @ObfuscatedName("hh.d")
    public static final class220 field2771 = new class220("", 10);

    @ObfuscatedName("hh.q")
    public static final class220 field2775 = new class220("", 11);

    @ObfuscatedName("hh.x")
    public static final class220 field2776 = new class220("", 12);

    @ObfuscatedName("hh.y")
    public static final class220 field2770 = new class220("", 13);

    @ObfuscatedName("hh.e")
    public static final class220 field2769 = new class220("", 14);

    @ObfuscatedName("hh.f")
    public static final class220 field2772 = new class220("", 15, new class7[] { class7.field93, class7.field93 }, (class7[]) null);

    @ObfuscatedName("hh.v")
    public static final class220 field2779 = new class220("", 16, new class7[] { class7.field93, class7.field93 }, (class7[]) null);

    @ObfuscatedName("hh.t")
    public static final class220 field2774 = new class220("", 17, new class7[] { class7.field93, class7.field93 }, (class7[]) null);

    @ObfuscatedName("hh.i")
    public static final class220 field2773 = new class220("", 73, true, true);

    @ObfuscatedName("hh.r")
    public static final class220 field2768 = new class220("", 76, true, false);

    @ObfuscatedName("hh.g")
    public final int field2777;

    public class220(String arg0, int arg1) {
        this(arg0, arg1, false, (class7[]) null, false, (class7[]) null);
    }

    public class220(String arg0, int arg1, boolean arg2, boolean arg3) {
        this(arg0, arg1, arg2, (class7[]) null, arg3, (class7[]) null);
    }

    public class220(String arg0, int arg1, class7[] arg2, class7[] arg3) {
        this(arg0, arg1, arg2 != null, arg2, arg3 != null, arg3);
    }

    public class220(String arg0, int arg1, boolean arg2, class7[] arg3, boolean arg4, class7[] arg5) {
        this.field2777 = arg1;
    }

    @ObfuscatedName("m.e(Lhh;I)Z")
    public static boolean method142(class220 arg0) {
        return field2771 == arg0 || field2775 == arg0 || field2776 == arg0 || field2770 == arg0 || field2769 == arg0 || field2772 == arg0 || field2779 == arg0 || field2774 == arg0;
    }

    @ObfuscatedName("hh.d(I)I")
    public int method8() {
        return this.field2777;
    }
}
