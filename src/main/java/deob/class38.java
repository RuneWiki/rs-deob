package deob;

@ObfuscatedName("ah")
public class class38 {

    public class38() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ba.n(III)I")
    public static int method1380(int arg0, int arg1) {
        class260 var2 = class260.method18(arg0);
        if (var2 == null) {
            return arg1;
        } else if (var2.field3601 >= 0) {
            return var2.field3601 | 0xFF000000;
        } else if (var2.field3600 >= 0) {
            int var3 = method661(Statics.field2040.method2199(var2.field3600), 96);
            return class137.field2024[var3] | 0xFF000000;
        } else if (var2.field3604 == 16711935) {
            return arg1;
        } else {
            int var4 = var2.field3602;
            int var5 = var2.field3603;
            int var6 = var2.field3596;
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
            int var10 = method661(var7, 96);
            return class137.field2024[var10] | 0xFF000000;
        }
    }

    @ObfuscatedName("az.p(III)I")
    public static int method661(int arg0, int arg1) {
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
