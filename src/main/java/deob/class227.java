package deob;

@ObfuscatedName("hf")
public class class227 implements class226 {

    @ObfuscatedName("hf.b")
    public static final class227 field2853 = new class227("", 10);

    @ObfuscatedName("hf.s")
    public static final class227 field2854 = new class227("", 11);

    @ObfuscatedName("hf.r")
    public static final class227 field2855 = new class227("", 12);

    @ObfuscatedName("hf.g")
    public static final class227 field2860 = new class227("", 13);

    @ObfuscatedName("hf.x")
    public static final class227 field2857 = new class227("", 14);

    @ObfuscatedName("hf.f")
    public static final class227 field2858 = new class227("", 15, new class7[] { class7.field67, class7.field67 }, (class7[]) null);

    @ObfuscatedName("hf.u")
    public static final class227 field2859 = new class227("", 16, new class7[] { class7.field67, class7.field67 }, (class7[]) null);

    @ObfuscatedName("hf.t")
    public static final class227 field2856 = new class227("", 17, new class7[] { class7.field67, class7.field67 }, (class7[]) null);

    @ObfuscatedName("hf.k")
    public static final class227 field2863 = new class227("", 73, true, true);

    @ObfuscatedName("hf.n")
    public static final class227 field2862 = new class227("", 76, true, false);

    @ObfuscatedName("hf.d")
    public final int field2861;

    public class227(String arg0, int arg1) {
        this(arg0, arg1, false, (class7[]) null, false, (class7[]) null);
    }

    public class227(String arg0, int arg1, boolean arg2, boolean arg3) {
        this(arg0, arg1, arg2, (class7[]) null, arg3, (class7[]) null);
    }

    public class227(String arg0, int arg1, class7[] arg2, class7[] arg3) {
        this(arg0, arg1, arg2 != null, arg2, arg3 != null, arg3);
    }

    public class227(String arg0, int arg1, boolean arg2, class7[] arg3, boolean arg4, class7[] arg5) {
        this.field2861 = arg1;
    }

    @ObfuscatedName("em.r(Lhf;B)Z")
    public static boolean method2704(class227 arg0) {
        return field2853 == arg0 || field2854 == arg0 || field2855 == arg0 || field2860 == arg0 || field2857 == arg0 || field2858 == arg0 || field2859 == arg0 || field2856 == arg0;
    }

    @ObfuscatedName("hf.b(B)I")
    public int method8() {
        return this.field2861;
    }
}
