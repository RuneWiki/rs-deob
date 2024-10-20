package deob;

@ObfuscatedName("my")
public class class315 {

    @ObfuscatedName("my.at")
    public static int[] field3403;

    static {
        new Object();
        field3403 = new int[33];
        field3403[0] = 0;
        int var0 = 2;
        for (int var1 = 1; var1 < 33; var1++) {
            field3403[var1] = var0 - 1;
            var0 += var0;
        }
    }

    public class315() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ib.at(II)I")
    public static int method3908(int arg0) {
        return field3403[arg0];
    }

    @ObfuscatedName("en.ah(II)I")
    public static int method2792(int arg0) {
        int var1 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var2 = (var1 >>> 2 & 0x33333333) + (var1 & 0x33333333);
        int var3 = (var2 >>> 4) + var2 & 0xF0F0F0F;
        int var4 = (var3 >>> 8) + var3;
        int var5 = (var4 >>> 16) + var4;
        return var5 & 0xFF;
    }

    @ObfuscatedName("dw.ar(IIII)I")
    public static int method2326(int arg0, int arg1, int arg2) {
        int var3 = method3908(arg2 - arg1 + 1);
        int var4 = var3 << arg1;
        return arg0 & ~var4;
    }

    @ObfuscatedName("ho.ao(IIIB)I")
    public static int method3496(int arg0, int arg1, int arg2) {
        int var3 = method3908(arg2 - arg1 + 1);
        int var4 = var3 << arg1;
        return arg0 | var4;
    }

    @ObfuscatedName("hl.ab(II)I")
    public static int method3369(int arg0) {
        int var6 = arg0 - 1;
        int var1 = var6 | var6 >>> 1;
        int var2 = var1 | var1 >>> 2;
        int var3 = var2 | var2 >>> 4;
        int var4 = var3 | var3 >>> 8;
        int var5 = var4 | var4 >>> 16;
        return var5 + 1;
    }

    @ObfuscatedName("dz.au(IB)I")
    public static int method2407(int arg0) {
        int var1 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var1 += 16;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var1 += 8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var1 += 4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var1 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var1++;
        }
        return arg0 + var1;
    }

    @ObfuscatedName("nz.aa(III)I")
    public static int method6206(int arg0, int arg1) {
        int var2 = 0;
        while (arg1 > 0) {
            var2 = var2 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
            arg1--;
        }
        return var2;
    }

    @ObfuscatedName("hq.ac(III)I")
    public static int method3374(int arg0, int arg1) {
        int var2 = arg0 >>> 31;
        return (arg0 + var2) / arg1 - var2;
    }
}
