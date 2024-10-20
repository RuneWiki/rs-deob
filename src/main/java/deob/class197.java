package deob;

@ObfuscatedName("gv")
public class class197 {

    public class197() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cu.n(III)I")
    public static int method1954(int arg0, int arg1) {
        class171 var2 = (class171) class171.field1940.method4167((long) arg0);
        class171 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field1939.method4710(4, arg0);
            class171 var5 = new class171();
            if (var4 != null) {
                var5.method3019(new class400(var4), arg0);
            }
            var5.method3018();
            class171.field1940.method4169(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        if (var3 == null) {
            return arg1;
        } else if (var3.field1935 >= 0) {
            return var3.field1935 | 0xFF000000;
        } else if (var3.field1933 >= 0) {
            int var7 = method2495(Statics.field2331.method3991(var3.field1933), 96);
            return class211.field2351[var7] | 0xFF000000;
        } else if (var3.field1943 == 16711935) {
            return arg1;
        } else {
            int var8 = var3.field1936;
            int var9 = var3.field1931;
            int var10 = var3.field1938;
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
            int var14 = method2495(var11, 96);
            return class211.field2351[var14] | 0xFF000000;
        }
    }

    @ObfuscatedName("eq.c(III)I")
    public static int method2495(int arg0, int arg1) {
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
