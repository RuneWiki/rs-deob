package deob;

@ObfuscatedName("av")
public class class27 {

    public class27() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aa.f(IIB)I")
    public static int method560(int arg0, int arg1) {
        class275 var2 = (class275) class275.field3602.method3737((long) arg0);
        class275 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3609.method4289(4, arg0);
            class275 var5 = new class275();
            if (var4 != null) {
                var5.method4889(new class185(var4), arg0);
            }
            var5.method4888();
            class275.field3602.method3744(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        if (var3 == null) {
            return arg1;
        } else if (var3.field3601 >= 0) {
            return var3.field3601 | 0xFF000000;
        } else if (var3.field3599 >= 0) {
            int var7 = method677(Statics.field1724.method2411(var3.field3599), 96);
            return class125.field1745[var7] | 0xFF000000;
        } else if (var3.field3598 == 16711935) {
            return arg1;
        } else {
            int var8 = var3.field3603;
            int var9 = var3.field3604;
            int var10 = var3.field3596;
            if (var10 > 179) {
                var9 /= 2;
            }
            if (var10 > 192) {
                var9 /= 2;
            }
            if (var10 > 217) {
                var9 /= 2;
            }
            if (var10 > 243) {
                var9 /= 2;
            }
            int var11 = var10 / 2 + (var8 / 4 << 10) + (var9 / 32 << 7);
            int var14 = method677(var11, 96);
            return class125.field1745[var14] | 0xFF000000;
        }
    }

    @ObfuscatedName("ab.l(III)I")
    public static int method677(int arg0, int arg1) {
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
