package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("kw")
public class class306 implements class303 {

    @ObfuscatedName("kw.l")
    public static final class306 field3820 = new class306("", 0, new class302[] { class302.field3782 });

    @ObfuscatedName("kw.q")
    public static final class306 field3818 = new class306("", 1, new class302[] { class302.field3783, class302.field3782 });

    @ObfuscatedName("kw.f")
    public static final class306 field3806 = new class306("", 2, new class302[] { class302.field3783, class302.field3781, class302.field3782 });

    @ObfuscatedName("kw.j")
    public static final class306 field3807 = new class306("", 3, new class302[] { class302.field3783 });

    @ObfuscatedName("kw.m")
    public static final class306 field3808 = new class306("", 4);

    @ObfuscatedName("kw.k")
    public static final class306 field3809 = new class306("", 5, new class302[] { class302.field3783, class302.field3782 });

    @ObfuscatedName("kw.t")
    public static final class306 field3810 = new class306("", 6, new class302[] { class302.field3782 });

    @ObfuscatedName("kw.a")
    public static final class306 field3812 = new class306("", 8, new class302[] { class302.field3783, class302.field3782 });

    @ObfuscatedName("kw.e")
    public static final class306 field3816 = new class306("", 9, new class302[] { class302.field3783, class302.field3781 });

    @ObfuscatedName("kw.i")
    public static final class306 field3813 = new class306("", 10, new class302[] { class302.field3783 });

    @ObfuscatedName("kw.y")
    public static final class306 field3814 = new class306("", 11, new class302[] { class302.field3783 });

    @ObfuscatedName("kw.w")
    public static final class306 field3804 = new class306("", 12, new class302[] { class302.field3783, class302.field3782 });

    @ObfuscatedName("kw.g")
    public static final class306 field3815 = new class306("", 13, new class302[] { class302.field3783 });

    @ObfuscatedName("kw.v")
    public final int field3817;

    @ObfuscatedName("kw.s")
    public final Set field3811 = new HashSet();

    public class306(String arg0, int arg1) {
        this.field3817 = arg1;
    }

    public class306(String arg0, int arg1, class302[] arg2) {
        this.field3817 = arg1;
        class302[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class302 var6 = var4[var5];
            this.field3811.add(var6);
        }
    }

    @ObfuscatedName("kw.l(I)I")
    public int method36() {
        return this.field3817;
    }
}
