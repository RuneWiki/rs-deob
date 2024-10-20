package deob;

@ObfuscatedName("ab")
public class class38 {

    public class38() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.s(IIB)I")
    public static int method4(int arg0, int arg1) {
        class271 var2 = class271.method2983(arg0);
        if (var2 == null) {
            return arg1;
        } else if (var2.field3670 >= 0) {
            return var2.field3670 | 0xFF000000;
        } else if (var2.field3668 >= 0) {
            int var3 = Statics.field1915.method2401(var2.field3668);
            byte var4 = 96;
            int var5;
            if (var3 == -2) {
                var5 = 12345678;
            } else if (var3 == -1) {
                if (var4 < 0) {
                    var4 = 0;
                } else if (var4 > 127) {
                    var4 = 127;
                }
                int var6 = 127 - var4;
                var5 = var6;
            } else {
                int var7 = (var3 & 0x7F) * var4 / 128;
                if (var7 < 2) {
                    var7 = 2;
                } else if (var7 > 126) {
                    var7 = 126;
                }
                var5 = (var3 & 0xFF80) + var7;
            }
            return class134.field1914[var5] | 0xFF000000;
        } else if (var2.field3673 == 16711935) {
            return arg1;
        } else {
            int var9 = var2.field3665;
            int var10 = var2.field3671;
            int var11 = var2.field3672;
            if (var11 > 179) {
                var10 /= 2;
            }
            if (var11 > 192) {
                var10 /= 2;
            }
            if (var11 > 217) {
                var10 /= 2;
            }
            if (var11 > 243) {
                var10 /= 2;
            }
            int var12 = var11 / 2 + (var9 / 4 << 10) + (var10 / 32 << 7);
            int var15 = method232(var12, 96);
            return class134.field1914[var15] | 0xFF000000;
        }
    }

    @ObfuscatedName("aq.g(III)I")
    public static int method232(int arg0, int arg1) {
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
