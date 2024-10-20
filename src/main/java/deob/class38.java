package deob;

@ObfuscatedName("ac")
public class class38 {

    public class38() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jm.e(IIB)I")
    public static int method4537(int arg0, int arg1) {
        class261 var2 = class261.method3795(arg0);
        if (var2 == null) {
            return arg1;
        } else if (var2.field3586 >= 0) {
            return var2.field3586 | 0xFF000000;
        } else if (var2.field3590 >= 0) {
            int var3 = method64(Statics.field2014.method2196(var2.field3590), 96);
            return class138.field2010[var3] | 0xFF000000;
        } else if (var2.field3583 == 16711935) {
            return arg1;
        } else {
            int var4 = var2.field3587;
            int var5 = var2.field3588;
            int var6 = var2.field3589;
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
            int var10 = method64(var7, 96);
            return class138.field2010[var10] | 0xFF000000;
        }
    }

    @ObfuscatedName("s.n(III)I")
    public static int method64(int arg0, int arg1) {
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
