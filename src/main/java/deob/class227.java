package deob;

@ObfuscatedName("ho")
public class class227 implements class226 {

    @ObfuscatedName("ho.d")
    public static final class227 field2872 = new class227("", 10);

    @ObfuscatedName("ho.x")
    public static final class227 field2866 = new class227("", 11);

    @ObfuscatedName("ho.k")
    public static final class227 field2873 = new class227("", 12);

    @ObfuscatedName("ho.z")
    public static final class227 field2865 = new class227("", 13);

    @ObfuscatedName("ho.v")
    public static final class227 field2869 = new class227("", 14);

    @ObfuscatedName("ho.m")
    public static final class227 field2868 = new class227("", 15, new class7[] { class7.field155, class7.field155 }, (class7[]) null);

    @ObfuscatedName("ho.b")
    public static final class227 field2871 = new class227("", 16, new class7[] { class7.field155, class7.field155 }, (class7[]) null);

    @ObfuscatedName("ho.t")
    public static final class227 field2870 = new class227("", 17, new class7[] { class7.field155, class7.field155 }, (class7[]) null);

    @ObfuscatedName("ho.p")
    public static final class227 field2867 = new class227("", 73, true, true);

    @ObfuscatedName("ho.r")
    public static final class227 field2874 = new class227("", 76, true, false);

    @ObfuscatedName("ho.l")
    public final int field2875;

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
        this.field2875 = arg1;
    }

    @ObfuscatedName("h.v(Lho;I)Z")
    public static boolean method160(class227 arg0) {
        return field2872 == arg0 || field2866 == arg0 || field2873 == arg0 || field2865 == arg0 || field2869 == arg0 || field2868 == arg0 || field2871 == arg0 || field2870 == arg0;
    }

    @ObfuscatedName("ho.d(I)I")
    public int method18() {
        return this.field2875;
    }
}
