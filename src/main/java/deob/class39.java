package deob;

@ObfuscatedName("ad")
public class class39 {

    public class39() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ed.d(III)I")
    public static int method2908(int arg0, int arg1) {
        class287 var2 = class287.method729(arg0);
        if (var2 == null) {
            return arg1;
        } else if (var2.field3746 >= 0) {
            return var2.field3746 | 0xFF000000;
        } else if (var2.field3744 >= 0) {
            int var3 = method2(Statics.field1941.method2394(var2.field3744), 96);
            return class135.field1919[var3] | 0xFF000000;
        } else if (var2.field3743 == 16711935) {
            return arg1;
        } else {
            int var4 = Statics.method332(var2.field3750, var2.field3741, var2.field3749);
            int var5 = method2(var4, 96);
            return class135.field1919[var5] | 0xFF000000;
        }
    }

    @ObfuscatedName("z.z(III)I")
    public static int method2(int arg0, int arg1) {
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
