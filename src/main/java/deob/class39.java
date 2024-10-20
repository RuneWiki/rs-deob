package deob;

@ObfuscatedName("av")
public class class39 {

    public class39() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fd.o(III)I")
    public static int method3032(int arg0, int arg1) {
        class287 var2 = class287.method1829(arg0);
        if (var2 == null) {
            return arg1;
        } else if (var2.field3750 >= 0) {
            return var2.field3750 | 0xFF000000;
        } else if (var2.field3744 >= 0) {
            int var3 = method235(Statics.field1950.method2351(var2.field3744), 96);
            return class135.field1959[var3] | 0xFF000000;
        } else if (var2.field3743 == 16711935) {
            return arg1;
        } else {
            int var4 = var2.field3751;
            int var5 = var2.field3748;
            int var6 = var2.field3749;
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
            int var10 = method235(var7, 96);
            return class135.field1959[var10] | 0xFF000000;
        }
    }

    @ObfuscatedName("ap.k(III)I")
    public static int method235(int arg0, int arg1) {
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
