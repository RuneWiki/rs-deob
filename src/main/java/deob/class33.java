package deob;

@ObfuscatedName("ay")
public class class33 {

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jx.c(III)I")
    public static int method4717(int arg0, int arg1) {
        class259 var2 = class259.method1023(arg0);
        if (var2 == null) {
            return arg1;
        } else if (var2.field3500 >= 0) {
            return var2.field3500 | 0xFF000000;
        } else if (var2.field3507 >= 0) {
            int var3 = method3802(Statics.field1777.method2544(var2.field3507), 96);
            return class131.field1776[var3] | 0xFF000000;
        } else if (var2.field3498 == 16711935) {
            return arg1;
        } else {
            int var4 = var2.field3503;
            int var5 = var2.field3504;
            int var6 = var2.field3505;
            if (var6 > 179) {
                var5 /= 2;
            }
            if (var6 > 192) {
                var5 /= 2;
            }
            if (var6 > 217) {
                var5 /= 2;
            }
            if (var6 > 243) {
                var5 /= 2;
            }
            int var7 = var6 / 2 + (var4 / 4 << 10) + (var5 / 32 << 7);
            int var10 = method3802(var7, 96);
            return class131.field1776[var10] | 0xFF000000;
        }
    }

    @ObfuscatedName("hw.t(IIB)I")
    public static int method3802(int arg0, int arg1) {
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 0) {
                arg1 = 0;
            } else if (arg1 > 127) {
                arg1 = 127;
            }
            return 127 - arg1;
        } else {
            int var3 = (arg0 & 0x7F) * arg1 / 128;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }
}
