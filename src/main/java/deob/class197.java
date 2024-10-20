package deob;

@ObfuscatedName("gq")
public class class197 {

    public class197() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("br.l(III)I")
    public static int method1968(int arg0, int arg1) {
        class171 var2 = (class171) class171.field1933.method4223((long) arg0);
        class171 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field1943.method4756(4, arg0);
            class171 var5 = new class171();
            if (var4 != null) {
                var5.method3089(new class401(var4), arg0);
            }
            var5.method3074();
            class171.field1933.method4225(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        if (var3 == null) {
            return arg1;
        } else if (var3.field1942 >= 0) {
            return var3.field1942 | 0xFF000000;
        } else if (var3.field1935 >= 0) {
            int var7 = method1501(Statics.field2346.method4043(var3.field1935), 96);
            return class211.field2350[var7] | 0xFF000000;
        } else if (var3.field1934 == 16711935) {
            return arg1;
        } else {
            int var8 = method4669(var3.field1938, var3.field1944, var3.field1939);
            int var9 = method1501(var8, 96);
            return class211.field2350[var9] | 0xFF000000;
        }
    }

    @ObfuscatedName("client.q(III)I")
    public static int method1501(int arg0, int arg1) {
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

    @ObfuscatedName("jv.f(IIIB)I")
    public static int method4669(int arg0, int arg1, int arg2) {
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
