package deob;

@ObfuscatedName("lz")
public class class300 {

    public class300() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("nm.ab(III)I")
    public static int method5919(int arg0, int arg1) {
        class263 var2 = class263.method4476(arg0);
        if (var2 == null) {
            return arg1;
        } else if (var2.field2853 >= 0) {
            int var3 = Statics.method6351(var2.field2857, var2.field2858, var2.field2859);
            int var4 = method2908(var3, 96);
            return class181.field1940[var4] | 0xFF000000;
        } else if (var2.field2856 >= 0) {
            int var5 = method2908(class181.field1943.field2264.method3846(var2.field2856), 96);
            return class181.field1940[var5] | 0xFF000000;
        } else if (var2.field2851 == 16711935) {
            return arg1;
        } else {
            int var6 = Statics.method6351(var2.field2854, var2.field2855, var2.field2848);
            int var7 = method2908(var6, 96);
            return class181.field1940[var7] | 0xFF000000;
        }
    }

    @ObfuscatedName("ev.ay(III)I")
    public static int method2908(int arg0, int arg1) {
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
