package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("kg")
public class class292 implements class289 {

    @ObfuscatedName("kg.f")
    public static final class292 field3702 = new class292("", 0, new class288[] { class288.field3674 });

    @ObfuscatedName("kg.e")
    public static final class292 field3691 = new class292("", 1, new class288[] { class288.field3672, class288.field3674 });

    @ObfuscatedName("kg.v")
    public static final class292 field3692 = new class292("", 2, new class288[] { class288.field3672, class288.field3673, class288.field3674 });

    @ObfuscatedName("kg.y")
    public static final class292 field3693 = new class292("", 3, new class288[] { class288.field3672 });

    @ObfuscatedName("kg.j")
    public static final class292 field3698 = new class292("", 4);

    @ObfuscatedName("kg.o")
    public static final class292 field3695 = new class292("", 5, new class288[] { class288.field3672, class288.field3674 });

    @ObfuscatedName("kg.m")
    public static final class292 field3696 = new class292("", 6, new class288[] { class288.field3674 });

    @ObfuscatedName("kg.r")
    public static final class292 field3697 = new class292("", 8, new class288[] { class288.field3672, class288.field3674 });

    @ObfuscatedName("kg.h")
    public static final class292 field3694 = new class292("", 9, new class288[] { class288.field3672, class288.field3673 });

    @ObfuscatedName("kg.d")
    public static final class292 field3699 = new class292("", 10, new class288[] { class288.field3672 });

    @ObfuscatedName("kg.z")
    public static final class292 field3700 = new class292("", 11, new class288[] { class288.field3672 });

    @ObfuscatedName("kg.b")
    public static final class292 field3701 = new class292("", 12, new class288[] { class288.field3672, class288.field3674 });

    @ObfuscatedName("kg.i")
    public static final class292 field3705 = new class292("", 13, new class288[] { class288.field3672 });

    @ObfuscatedName("kg.k")
    public final int field3690;

    @ObfuscatedName("kg.g")
    public final Set field3704 = new HashSet();

    static {
        method4700();
    }

    @ObfuscatedName("kg.o(I)[Lkg;")
    public static class292[] method4700() {
        return new class292[] { field3702, field3694, field3697, field3700, field3695, field3705, field3692, field3691, field3701, field3696, field3699, field3693, field3698 };
    }

    public class292(String arg0, int arg1) {
        this.field3690 = arg1;
    }

    public class292(String arg0, int arg1, class288[] arg2) {
        this.field3690 = arg1;
        class288[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class288 var6 = var4[var5];
            this.field3704.add(var6);
        }
    }

    @ObfuscatedName("kg.f(I)I")
    public int method238() {
        return this.field3690;
    }
}
