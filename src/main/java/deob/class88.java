package deob;

@ObfuscatedName("cb")
public class class88 extends class200 {

    @ObfuscatedName("cb.f")
    public int field1080;

    @ObfuscatedName("cb.e")
    public int field1086;

    @ObfuscatedName("cb.v")
    public int field1079;

    @ObfuscatedName("cb.y")
    public int field1088;

    @ObfuscatedName("cb.j")
    public int field1083;

    @ObfuscatedName("cb.o")
    public int field1084;

    @ObfuscatedName("cb.m")
    public class158 field1085;

    @ObfuscatedName("cb.r")
    public int field1082;

    @ObfuscatedName("cb.h")
    public int field1087;

    public class88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class200 arg8) {
        this.field1080 = arg0;
        this.field1086 = arg1;
        this.field1079 = arg2;
        this.field1088 = arg3;
        this.field1083 = arg4;
        this.field1084 = arg5;
        if (arg6 != -1) {
            this.field1085 = class158.method3363(arg6);
            this.field1082 = 0;
            this.field1087 = client.field631 - 1;
            if (this.field1085.field1895 == 0 && arg8 != null && arg8 instanceof class88) {
                class88 var10 = (class88) arg8;
                if (this.field1085 == var10.field1085) {
                    this.field1082 = var10.field1082;
                    this.field1087 = var10.field1087;
                    return;
                }
            }
            if (arg7 && this.field1085.field1888 != -1) {
                this.field1082 = (int) (Math.random() * (double) this.field1085.field1882.length);
                this.field1087 -= (int) (Math.random() * (double) this.field1085.field1884[this.field1082]);
            }
        }
    }

    @ObfuscatedName("cb.e(I)Lgd;")
    public final class206 method1758() {
        if (this.field1085 != null) {
            int var1 = client.field631 - this.field1087;
            if (var1 > 100 && this.field1085.field1888 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1085.field1884[this.field1082]) {
                            break label47;
                        }
                        var1 -= this.field1085.field1884[this.field1082];
                        this.field1082++;
                    } while (this.field1082 < this.field1085.field1882.length);
                    this.field1082 -= this.field1085.field1888;
                } while (this.field1082 >= 0 && this.field1082 < this.field1085.field1882.length);
                this.field1085 = null;
            }
            this.field1087 = client.field631 - var1;
        }
        class155 var2 = class155.method1864(this.field1080);
        if (var2.field1798 != null) {
            var2 = var2.method2712();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1079 == 1 || this.field1079 == 3) {
            var3 = var2.field1773;
            var4 = var2.field1772;
        } else {
            var3 = var2.field1772;
            var4 = var2.field1773;
        }
        int var5 = (var3 >> 1) + this.field1083;
        int var6 = (var3 + 1 >> 1) + this.field1083;
        int var7 = (var4 >> 1) + this.field1084;
        int var8 = (var4 + 1 >> 1) + this.field1084;
        int[][] var9 = class90.field1099[this.field1088];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1083 << 7) + (var3 << 6);
        int var12 = (this.field1084 << 7) + (var4 << 6);
        return var2.method2710(this.field1086, this.field1079, var9, var11, var10, var12, this.field1085, this.field1082);
    }
}
