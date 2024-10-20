package deob;

@ObfuscatedName("if")
public class class258 {

    public class258() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ez.f(III)I")
    public static int method3098(int arg0, int arg1) {
        class202 var2 = (class202) class202.field2278.method5028((long) arg0);
        class202 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field2273.method5990(4, arg0);
            class202 var5 = new class202();
            if (var4 != null) {
                var5.method3740(new class474(var4), arg0);
            }
            var5.method3727();
            class202.field2278.method5027(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        if (var3 == null) {
            return arg1;
        } else if (var3.field2272 >= 0) {
            int var7 = var3.field2276;
            int var8 = var3.field2271;
            int var9 = var3.field2277;
            if (var9 > 179) {
                var8 /= 2;
            }
            if (var9 > 192) {
                var8 /= 2;
            }
            if (var9 > 217) {
                var8 /= 2;
            }
            if (var9 > 243) {
                var8 /= 2;
            }
            int var10 = var9 / 2 + (var7 / 4 << 10) + (var8 / 32 << 7);
            int var13 = method2240(var10, 96);
            return class217.field2511[var13] | 0xFF000000;
        } else if (var3.field2270 >= 0) {
            int var14 = method2240(Statics.field2512.method4304(var3.field2270), 96);
            return class217.field2511[var14] | 0xFF000000;
        } else if (var3.field2268 == 16711935) {
            return arg1;
        } else {
            int var15 = var3.field2274;
            int var16 = var3.field2269;
            int var17 = var3.field2275;
            if (var17 > 179) {
                var16 /= 2;
            }
            if (var17 > 192) {
                var16 /= 2;
            }
            if (var17 > 217) {
                var16 /= 2;
            }
            if (var17 > 243) {
                var16 /= 2;
            }
            int var18 = var17 / 2 + (var15 / 4 << 10) + (var16 / 32 << 7);
            int var21 = method2240(var18, 96);
            return class217.field2511[var21] | 0xFF000000;
        }
    }

    @ObfuscatedName("ck.w(III)I")
    public static int method2240(int arg0, int arg1) {
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
