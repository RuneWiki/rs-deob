package deob;

@ObfuscatedName("aa")
public class class38 {

    public class38() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ab.i(III)I")
    public static int method262(int arg0, int arg1) {
        class261 var2 = class261.method985(arg0);
        if (var2 == null) {
            return arg1;
        } else if (var2.field3590 >= 0) {
            return var2.field3590 | 0xFF000000;
        } else if (var2.field3588 >= 0) {
            int var3 = method2958(Statics.field2042.method2188(var2.field3588), 96);
            return class136.field2041[var3] | 0xFF000000;
        } else if (var2.field3587 == 16711935) {
            return arg1;
        } else {
            int var4 = method166(var2.field3591, var2.field3593, var2.field3585);
            int var5 = method2958(var4, 96);
            return class136.field2041[var5] | 0xFF000000;
        }
    }

    @ObfuscatedName("fl.j(III)I")
    public static int method2958(int arg0, int arg1) {
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

    @ObfuscatedName("x.a(IIIB)I")
    public static int method166(int arg0, int arg1, int arg2) {
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
