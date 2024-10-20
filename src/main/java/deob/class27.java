package deob;

@ObfuscatedName("ai")
public class class27 {

    public class27() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.w(IIB)I")
    public static int method123(int arg0, int arg1) {
        class273 var2 = class273.method2969(arg0);
        if (var2 == null) {
            return arg1;
        } else if (var2.field3541 >= 0) {
            return var2.field3541 | 0xFF000000;
        } else if (var2.field3543 >= 0) {
            int var3 = Statics.method88(Statics.field1713.method2373(var2.field3543), 96);
            return class123.field1722[var3] | 0xFF000000;
        } else if (var2.field3539 == 16711935) {
            return arg1;
        } else {
            int var4 = var2.field3547;
            int var5 = var2.field3544;
            int var6 = var2.field3545;
            if (var6 > 179) {
                var5 /= 2;
            }
            if (var6 > 192) {
                var5 /= 2;
            }
            if (var6 > 217) {
                var5 /= 2;
            }
            if (var6 > 243) {
                var5 /= 2;
            }
            int var7 = var6 / 2 + (var4 / 4 << 10) + (var5 / 32 << 7);
            int var10 = Statics.method88(var7, 96);
            return class123.field1722[var10] | 0xFF000000;
        }
    }
}
