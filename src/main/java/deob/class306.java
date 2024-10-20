package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("ki")
public class class306 implements class303 {

    @ObfuscatedName("ki.n")
    public static final class306 field3812 = new class306("", 0, new class302[] { class302.field3783 });

    @ObfuscatedName("ki.c")
    public static final class306 field3801 = new class306("", 1, new class302[] { class302.field3782, class302.field3783 });

    @ObfuscatedName("ki.m")
    public static final class306 field3800 = new class306("", 2, new class302[] { class302.field3782, class302.field3784, class302.field3783 });

    @ObfuscatedName("ki.k")
    public static final class306 field3810 = new class306("", 3, new class302[] { class302.field3782 });

    @ObfuscatedName("ki.o")
    public static final class306 field3804 = new class306("", 4);

    @ObfuscatedName("ki.g")
    public static final class306 field3805 = new class306("", 5, new class302[] { class302.field3782, class302.field3783 });

    @ObfuscatedName("ki.z")
    public static final class306 field3802 = new class306("", 6, new class302[] { class302.field3783 });

    @ObfuscatedName("ki.a")
    public static final class306 field3807 = new class306("", 8, new class302[] { class302.field3782, class302.field3783 });

    @ObfuscatedName("ki.u")
    public static final class306 field3808 = new class306("", 9, new class302[] { class302.field3782, class302.field3784 });

    @ObfuscatedName("ki.e")
    public static final class306 field3809 = new class306("", 10, new class302[] { class302.field3782 });

    @ObfuscatedName("ki.l")
    public static final class306 field3814 = new class306("", 11, new class302[] { class302.field3782 });

    @ObfuscatedName("ki.y")
    public static final class306 field3811 = new class306("", 12, new class302[] { class302.field3782, class302.field3783 });

    @ObfuscatedName("ki.v")
    public static final class306 field3803 = new class306("", 13, new class302[] { class302.field3782 });

    @ObfuscatedName("ki.f")
    public final int field3813;

    @ObfuscatedName("ki.s")
    public final Set field3806 = new HashSet();

    static {
        method4942();
    }

    @ObfuscatedName("ki.n(I)[Lki;")
    public static class306[] method4942() {
        return new class306[] { field3811, field3801, field3814, field3803, field3804, field3809, field3805, field3802, field3808, field3812, field3810, field3807, field3800 };
    }

    public class306(String arg0, int arg1) {
        this.field3813 = arg1;
    }

    public class306(String arg0, int arg1, class302[] arg2) {
        this.field3813 = arg1;
        class302[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class302 var6 = var4[var5];
            this.field3806.add(var6);
        }
    }

    @ObfuscatedName("ki.c(I)I")
    public int method42() {
        return this.field3813;
    }
}
