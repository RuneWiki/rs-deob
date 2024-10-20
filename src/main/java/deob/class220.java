package deob;

@ObfuscatedName("hh")
public class class220 implements class219 {

    @ObfuscatedName("hh.d")
    public static final class220 field2807 = new class220("", 10);

    @ObfuscatedName("hh.k")
    public static final class220 field2798 = new class220("", 11);

    @ObfuscatedName("hh.e")
    public static final class220 field2799 = new class220("", 12);

    @ObfuscatedName("hh.p")
    public static final class220 field2800 = new class220("", 13);

    @ObfuscatedName("hh.q")
    public static final class220 field2801 = new class220("", 14);

    @ObfuscatedName("hh.s")
    public static final class220 field2805 = new class220("", 15, new class7[] { class7.field232, class7.field232 }, (class7[]) null);

    @ObfuscatedName("hh.r")
    public static final class220 field2803 = new class220("", 16, new class7[] { class7.field232, class7.field232 }, (class7[]) null);

    @ObfuscatedName("hh.g")
    public static final class220 field2804 = new class220("", 17, new class7[] { class7.field232, class7.field232 }, (class7[]) null);

    @ObfuscatedName("hh.v")
    public static final class220 field2806 = new class220("", 73, true, true);

    @ObfuscatedName("hh.t")
    public static final class220 field2802 = new class220("", 76, true, false);

    @ObfuscatedName("hh.y")
    public final int field2797;

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
        this.field2797 = arg1;
    }

    @ObfuscatedName("bw.e(Lhh;I)Z")
    public static boolean method1089(class220 arg0) {
        return field2807 == arg0 || field2798 == arg0 || field2799 == arg0 || field2800 == arg0 || field2801 == arg0 || field2805 == arg0 || field2803 == arg0 || field2804 == arg0;
    }

    @ObfuscatedName("hh.d(B)I")
    public int method12() {
        return this.field2797;
    }
}
