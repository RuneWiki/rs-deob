package deob;

@ObfuscatedName("hy")
public class class220 implements class219 {

    @ObfuscatedName("hy.w")
    public static final class220 field2780 = new class220("", 10);

    @ObfuscatedName("hy.s")
    public static final class220 field2779 = new class220("", 11);

    @ObfuscatedName("hy.q")
    public static final class220 field2781 = new class220("", 12);

    @ObfuscatedName("hy.o")
    public static final class220 field2782 = new class220("", 13);

    @ObfuscatedName("hy.g")
    public static final class220 field2783 = new class220("", 14);

    @ObfuscatedName("hy.v")
    public static final class220 field2786 = new class220("", 15, new class7[] { class7.field78, class7.field78 }, (class7[]) null);

    @ObfuscatedName("hy.p")
    public static final class220 field2785 = new class220("", 16, new class7[] { class7.field78, class7.field78 }, (class7[]) null);

    @ObfuscatedName("hy.e")
    public static final class220 field2784 = new class220("", 17, new class7[] { class7.field78, class7.field78 }, (class7[]) null);

    @ObfuscatedName("hy.d")
    public static final class220 field2787 = new class220("", 73, true, true);

    @ObfuscatedName("hy.x")
    public static final class220 field2788 = new class220("", 76, true, false);

    @ObfuscatedName("hy.z")
    public final int field2789;

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
        this.field2789 = arg1;
    }

    @ObfuscatedName("k.g(Lhy;I)Z")
    public static boolean method145(class220 arg0) {
        return field2780 == arg0 || field2779 == arg0 || field2781 == arg0 || field2782 == arg0 || field2783 == arg0 || field2786 == arg0 || field2785 == arg0 || field2784 == arg0;
    }

    @ObfuscatedName("hy.w(B)I")
    public int method13() {
        return this.field2789;
    }
}
