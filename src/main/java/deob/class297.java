package deob;

@ObfuscatedName("lf")
public class class297 {

    public class297() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jl.ak(III)I")
    public static int method4746(int arg0, int arg1) {
        class226 var2 = (class226) class226.field2395.method5570((long) arg0);
        class226 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field2390.method6573(4, arg0);
            class226 var5 = new class226();
            if (var4 != null) {
                var5.method3993(new class546(var4), arg0);
            }
            var5.method3994();
            class226.field2395.method5564(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        if (var3 == null) {
            return arg1;
        } else if (var3.field2392 >= 0) {
            int var7 = Statics.method3420(var3.field2404, var3.field2399, var3.field2400);
            int var8 = method3071(var7, 96);
            return class248.field2666[var8] | 0xFF000000;
        } else if (var3.field2402 >= 0) {
            int var9 = method3071(class248.field2670.field2978.method4752(var3.field2402), 96);
            return class248.field2666[var9] | 0xFF000000;
        } else if (var3.field2391 == 16711935) {
            return arg1;
        } else {
            int var10 = Statics.method3420(var3.field2398, var3.field2396, var3.field2397);
            int var11 = method3071(var10, 96);
            return class248.field2666[var11] | 0xFF000000;
        }
    }

    @ObfuscatedName("fj.al(III)I")
    public static int method3071(int arg0, int arg1) {
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
