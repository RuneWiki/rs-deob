package deob;

@ObfuscatedName("aj")
public class class38 {

    public class38() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("am.a(III)I")
    public static int method311(int arg0, int arg1) {
        class260 var2 = Statics.method3940(arg0);
        if (var2 == null) {
            return arg1;
        } else if (var2.field3593 >= 0) {
            return var2.field3593 | 0xFF000000;
        } else if (var2.field3602 >= 0) {
            int var3 = method4756(Statics.field2031.method2149(var2.field3602), 96);
            return class137.field2034[var3] | 0xFF000000;
        } else if (var2.field3591 == 16711935) {
            return arg1;
        } else {
            int var4 = Statics.method92(var2.field3601, var2.field3596, var2.field3597);
            int var5 = method4756(var4, 96);
            return class137.field2034[var5] | 0xFF000000;
        }
    }

    @ObfuscatedName("kl.j(IIB)I")
    public static int method4756(int arg0, int arg1) {
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
