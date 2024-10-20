package deob;

@ObfuscatedName("gk")
public class class184 {

    public class184() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dk.s(III)I")
    public static int method2119(int arg0, int arg1) {
        class158 var2 = (class158) class158.field1843.method3927((long) arg0);
        class158 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field1855.method4459(4, arg0);
            class158 var5 = new class158();
            if (var4 != null) {
                var5.method2801(new class385(var4), arg0);
            }
            var5.method2800();
            class158.field1843.method3929(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        if (var3 == null) {
            return arg1;
        } else if (var3.field1848 >= 0) {
            return var3.field1848 | 0xFF000000;
        } else if (var3.field1856 >= 0) {
            int var7 = method1960(Statics.field2269.method3742(var3.field1856), 96);
            return class198.field2268[var7] | 0xFF000000;
        } else if (var3.field1844 == 16711935) {
            return arg1;
        } else {
            int var8 = method1897(var3.field1847, var3.field1849, var3.field1850);
            int var9 = method1960(var8, 96);
            return class198.field2268[var9] | 0xFF000000;
        }
    }

    @ObfuscatedName("cq.t(III)I")
    public static int method1960(int arg0, int arg1) {
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

    @ObfuscatedName("cf.v(IIIS)I")
    public static int method1897(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }
}
