package deob;

@ObfuscatedName("ha")
public class class220 implements class219 {

    @ObfuscatedName("ha.i")
    public static final class220 field2792 = new class220("", 10);

    @ObfuscatedName("ha.h")
    public static final class220 field2784 = new class220("", 11);

    @ObfuscatedName("ha.u")
    public static final class220 field2783 = new class220("", 12);

    @ObfuscatedName("ha.q")
    public static final class220 field2786 = new class220("", 13);

    @ObfuscatedName("ha.g")
    public static final class220 field2787 = new class220("", 14);

    @ObfuscatedName("ha.v")
    public static final class220 field2788 = new class220("", 15, new class7[] { class7.field155, class7.field155 }, (class7[]) null);

    @ObfuscatedName("ha.t")
    public static final class220 field2789 = new class220("", 16, new class7[] { class7.field155, class7.field155 }, (class7[]) null);

    @ObfuscatedName("ha.p")
    public static final class220 field2790 = new class220("", 17, new class7[] { class7.field155, class7.field155 }, (class7[]) null);

    @ObfuscatedName("ha.l")
    public static final class220 field2794 = new class220("", 73, true, true);

    @ObfuscatedName("ha.a")
    public static final class220 field2785 = new class220("", 76, true, false);

    @ObfuscatedName("ha.k")
    public final int field2793;

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
        this.field2793 = arg1;
    }

    @ObfuscatedName("fe.g(Lha;I)Z")
    public static boolean method3160(class220 arg0) {
        return field2792 == arg0 || field2784 == arg0 || field2783 == arg0 || field2786 == arg0 || field2787 == arg0 || field2788 == arg0 || field2789 == arg0 || field2790 == arg0;
    }

    @ObfuscatedName("ha.i(I)I")
    public int method7() {
        return this.field2793;
    }
}
