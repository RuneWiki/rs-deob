package deob;

@ObfuscatedName("cn")
public class class88 extends class177 {

    @ObfuscatedName("cn.f")
    public int field1082;

    @ObfuscatedName("cn.o")
    public int field1072;

    @ObfuscatedName("cn.u")
    public int field1078;

    @ObfuscatedName("cn.p")
    public int field1074;

    @ObfuscatedName("cn.b")
    public int field1073;

    @ObfuscatedName("cn.e")
    public int field1076;

    @ObfuscatedName("cn.k")
    public class298 field1077;

    @ObfuscatedName("cn.g")
    public int field1081;

    @ObfuscatedName("cn.h")
    public int field1079;

    public class88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class177 arg8) {
        this.field1082 = arg0;
        this.field1072 = arg1;
        this.field1078 = arg2;
        this.field1074 = arg3;
        this.field1073 = arg4;
        this.field1076 = arg5;
        if (arg6 != -1) {
            this.field1077 = class298.method3795(arg6);
            this.field1081 = 0;
            this.field1079 = client.field611 - 1;
            if (this.field1077.field3708 == 0 && arg8 != null && arg8 instanceof class88) {
                class88 var10 = (class88) arg8;
                if (this.field1077 == var10.field1077) {
                    this.field1081 = var10.field1081;
                    this.field1079 = var10.field1079;
                    return;
                }
            }
            if (arg7 && this.field1077.field3715 != -1) {
                this.field1081 = (int) (Math.random() * (double) this.field1077.field3712.length);
                this.field1079 -= (int) (Math.random() * (double) this.field1077.field3714[this.field1081]);
            }
        }
    }

    @ObfuscatedName("cn.o(I)Lgv;")
    public final class183 method1649() {
        if (this.field1077 != null) {
            int var1 = client.field611 - this.field1079;
            if (var1 > 100 && this.field1077.field3715 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1077.field3714[this.field1081]) {
                            break label47;
                        }
                        var1 -= this.field1077.field3714[this.field1081];
                        this.field1081++;
                    } while (this.field1081 < this.field1077.field3712.length);
                    this.field1081 -= this.field1077.field3715;
                } while (this.field1081 >= 0 && this.field1081 < this.field1077.field3712.length);
                this.field1077 = null;
            }
            this.field1079 = client.field611 - var1;
        }
        class295 var2 = class295.method182(this.field1082);
        if (var2.field3630 != null) {
            var2 = var2.method4611();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1078 == 1 || this.field1078 == 3) {
            var3 = var2.field3588;
            var4 = var2.field3604;
        } else {
            var3 = var2.field3604;
            var4 = var2.field3588;
        }
        int var5 = (var3 >> 1) + this.field1073;
        int var6 = (var3 + 1 >> 1) + this.field1073;
        int var7 = (var4 >> 1) + this.field1076;
        int var8 = (var4 + 1 >> 1) + this.field1076;
        int[][] var9 = class90.field1090[this.field1074];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1073 << 7) + (var3 << 6);
        int var12 = (this.field1076 << 7) + (var4 << 6);
        return var2.method4604(this.field1072, this.field1078, var9, var11, var10, var12, this.field1077, this.field1081);
    }
}
