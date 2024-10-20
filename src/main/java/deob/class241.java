package deob;

@ObfuscatedName("ik")
public class class241 {

    public class241() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ab.s(III)I")
    public static int method423(int arg0, int arg1) {
        class189 var2 = (class189) class189.field2154.method4599((long) arg0);
        class189 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field2155.method5179(4, arg0);
            class189 var5 = new class189();
            if (var4 != null) {
                var5.method3366(new class444(var4), arg0);
            }
            var5.method3369();
            class189.field2154.method4600(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        if (var3 == null) {
            return arg1;
        } else if (var3.field2147 >= 0) {
            return var3.field2147 | 0xFF000000;
        } else if (var3.field2153 >= 0) {
            int var7 = Statics.field2348.method3896(var3.field2153);
            byte var8 = 96;
            int var9;
            if (var7 == -2) {
                var9 = 12345678;
            } else if (var7 == -1) {
                if (var8 < 0) {
                    var8 = 0;
                } else if (var8 > 127) {
                    var8 = 127;
                }
                int var10 = 127 - var8;
                var9 = var10;
            } else {
                int var11 = (var7 & 0x7F) * var8 / 128;
                if (var11 < 2) {
                    var11 = 2;
                } else if (var11 > 126) {
                    var11 = 126;
                }
                var9 = (var7 & 0xFF80) + var11;
            }
            return class201.field2358[var9] | 0xFF000000;
        } else if (var3.field2146 == 16711935) {
            return arg1;
        } else {
            int var13 = var3.field2150;
            int var14 = var3.field2144;
            int var15 = var3.field2152;
            if (var15 > 179) {
                var14 /= 2;
            }
            if (var15 > 192) {
                var14 /= 2;
            }
            if (var15 > 217) {
                var14 /= 2;
            }
            if (var15 > 243) {
                var14 /= 2;
            }
            int var16 = var15 / 2 + (var13 / 4 << 10) + (var14 / 32 << 7);
            int var19 = method198(var16, 96);
            return class201.field2358[var19] | 0xFF000000;
        }
    }

    @ObfuscatedName("r.h(III)I")
    public static int method198(int arg0, int arg1) {
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
