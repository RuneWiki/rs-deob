package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ga")
public class class186 {

    @ObfuscatedName("ga.g")
    public static int field2752 = 0;

    @ObfuscatedName("ga.q")
    public static class126 field2744 = new class126(4096);

    @ObfuscatedName("ga.d")
    public static int field2746 = 0;

    @ObfuscatedName("ga.k")
    public static class126 field2762 = new class126(32);

    @ObfuscatedName("ga.j")
    public static int field2748 = 0;

    @ObfuscatedName("ga.s")
    public static class121 field2749 = new class121();

    @ObfuscatedName("ga.o")
    public static class126 field2742 = new class126(4096);

    @ObfuscatedName("ga.a")
    public static int field2751 = 0;

    @ObfuscatedName("ga.c")
    public static class126 field2763 = new class126(4096);

    @ObfuscatedName("ga.m")
    public static int field2753 = 0;

    @ObfuscatedName("ga.u")
    public static class154 field2755 = new class154(8);

    @ObfuscatedName("ga.z")
    public static int field2756 = 0;

    @ObfuscatedName("ga.w")
    public static CRC32 field2757 = new CRC32();

    @ObfuscatedName("ga.v")
    public static class185[] field2759 = new class185[256];

    @ObfuscatedName("ga.f")
    public static byte field2747 = 0;

    @ObfuscatedName("ga.l")
    public static int field2750 = 0;

    @ObfuscatedName("ga.t")
    public static int field2761 = 0;

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("l.g(Lgm;II)V")
    public static void method213(class185 arg0, int arg1) {
        if (Statics.field2091 == null) {
            method3011((class185) null, 255, 255, 0, (byte) 0, true);
            field2759[arg1] = arg0;
        } else {
            Statics.field2091.field2098 = arg1 * 8 + 5;
            int var2 = Statics.field2091.method2598();
            int var3 = Statics.field2091.method2598();
            arg0.method3121(var2, var3);
        }
    }

    @ObfuscatedName("fi.x(Lgm;IIIBZI)V")
    public static void method3011(class185 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class182 var8 = (class182) field2744.method2199(var6);
        if (var8 != null) {
            return;
        }
        class182 var9 = (class182) field2762.method2199(var6);
        if (var9 != null) {
            return;
        }
        class182 var10 = (class182) field2742.method2199(var6);
        if (var10 == null) {
            if (!arg5) {
                class182 var11 = (class182) field2763.method2199(var6);
                if (var11 != null) {
                    return;
                }
            }
            class182 var12 = new class182();
            var12.field2700 = arg0;
            var12.field2697 = arg3;
            var12.field2698 = arg4;
            if (arg5) {
                field2744.method2189(var12, var6);
                field2746++;
            } else {
                field2749.method2129(var12);
                field2742.method2189(var12, var6);
                field2751++;
            }
        } else if (arg5) {
            var10.method2265();
            field2744.method2189(var10, var6);
            field2751--;
            field2746++;
        }
    }

    @ObfuscatedName("aq.q(III)V")
    public static void method856(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class182 var4 = (class182) field2742.method2199(var2);
        if (var4 != null) {
            field2749.method2131(var4);
        }
    }

    @ObfuscatedName("bx.d(IIB)I")
    public static int method1081(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2754 != null && Statics.field2754.field1885 == var2 ? Statics.field2117.field2098 * 99 / (Statics.field2117.field2092.length - Statics.field2754.field2698) + 1 : 0;
    }

    @ObfuscatedName("cc.k(ZZI)I")
    public static int method1593(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2748 + field2746;
        }
        if (arg1) {
            var2 += field2753 + field2751;
        }
        return var2;
    }

    @ObfuscatedName("cd.j(I)V")
    public static void method1598() {
        if (Statics.field2758 != null) {
            Statics.field2758.method1921();
        }
    }
}
