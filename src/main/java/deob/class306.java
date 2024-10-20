package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("ks")
public class class306 implements class303 {

    @ObfuscatedName("ks.i")
    public static final class306 field3804 = new class306("", 0, new class302[] { class302.field3770 });

    @ObfuscatedName("ks.w")
    public static final class306 field3792 = new class306("", 1, new class302[] { class302.field3771, class302.field3770 });

    @ObfuscatedName("ks.s")
    public static final class306 field3793 = new class306("", 2, new class302[] { class302.field3771, class302.field3768, class302.field3770 });

    @ObfuscatedName("ks.a")
    public static final class306 field3794 = new class306("", 3, new class302[] { class302.field3771 });

    @ObfuscatedName("ks.o")
    public static final class306 field3795 = new class306("", 4);

    @ObfuscatedName("ks.g")
    public static final class306 field3797 = new class306("", 5, new class302[] { class302.field3771, class302.field3770 });

    @ObfuscatedName("ks.e")
    public static final class306 field3808 = new class306("", 6, new class302[] { class302.field3770 });

    @ObfuscatedName("ks.p")
    public static final class306 field3791 = new class306("", 8, new class302[] { class302.field3771, class302.field3770 });

    @ObfuscatedName("ks.j")
    public static final class306 field3799 = new class306("", 9, new class302[] { class302.field3771, class302.field3768 });

    @ObfuscatedName("ks.b")
    public static final class306 field3800 = new class306("", 10, new class302[] { class302.field3771 });

    @ObfuscatedName("ks.x")
    public static final class306 field3801 = new class306("", 11, new class302[] { class302.field3771 });

    @ObfuscatedName("ks.y")
    public static final class306 field3802 = new class306("", 12, new class302[] { class302.field3771, class302.field3770 });

    @ObfuscatedName("ks.k")
    public static final class306 field3803 = new class306("", 13, new class302[] { class302.field3771 });

    @ObfuscatedName("ks.t")
    public final int field3798;

    @ObfuscatedName("ks.l")
    public final Set field3805 = new HashSet();

    static {
        method4957();
    }

    @ObfuscatedName("ks.i(B)[Lks;")
    public static class306[] method4957() {
        return new class306[] { field3803, field3804, field3802, field3791, field3793, field3797, field3792, field3808, field3794, field3800, field3795, field3799, field3801 };
    }

    public class306(String arg0, int arg1) {
        this.field3798 = arg1;
    }

    public class306(String arg0, int arg1, class302[] arg2) {
        this.field3798 = arg1;
        class302[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class302 var6 = var4[var5];
            this.field3805.add(var6);
        }
    }

    @ObfuscatedName("ks.w(I)I")
    public int method38() {
        return this.field3798;
    }
}
