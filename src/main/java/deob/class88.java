package deob;

@ObfuscatedName("cn")
public class class88 extends class199 {

    @ObfuscatedName("cn.v")
    public int field1100;

    @ObfuscatedName("cn.n")
    public int field1107;

    @ObfuscatedName("cn.f")
    public int field1102;

    @ObfuscatedName("cn.y")
    public int field1098;

    @ObfuscatedName("cn.p")
    public int field1105;

    @ObfuscatedName("cn.j")
    public int field1101;

    @ObfuscatedName("cn.r")
    public class157 field1103;

    @ObfuscatedName("cn.b")
    public int field1104;

    @ObfuscatedName("cn.d")
    public int field1097;

    public class88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class199 arg8) {
        this.field1100 = arg0;
        this.field1107 = arg1;
        this.field1102 = arg2;
        this.field1098 = arg3;
        this.field1105 = arg4;
        this.field1101 = arg5;
        if (arg6 != -1) {
            this.field1103 = class157.method2030(arg6);
            this.field1104 = 0;
            this.field1097 = client.field650 - 1;
            if (this.field1103.field1892 == 0 && arg8 != null && arg8 instanceof class88) {
                class88 var10 = (class88) arg8;
                if (this.field1103 == var10.field1103) {
                    this.field1104 = var10.field1104;
                    this.field1097 = var10.field1097;
                    return;
                }
            }
            if (arg7 && this.field1103.field1878 != -1) {
                this.field1104 = (int) (Math.random() * (double) this.field1103.field1879.length);
                this.field1097 -= (int) (Math.random() * (double) this.field1103.field1881[this.field1104]);
            }
        }
    }

    @ObfuscatedName("cn.n(B)Lgr;")
    public final class205 method1710() {
        if (this.field1103 != null) {
            int var1 = client.field650 - this.field1097;
            if (var1 > 100 && this.field1103.field1878 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1103.field1881[this.field1104]) {
                            break label47;
                        }
                        var1 -= this.field1103.field1881[this.field1104];
                        this.field1104++;
                    } while (this.field1104 < this.field1103.field1879.length);
                    this.field1104 -= this.field1103.field1878;
                } while (this.field1104 >= 0 && this.field1104 < this.field1103.field1879.length);
                this.field1103 = null;
            }
            this.field1097 = client.field650 - var1;
        }
        class154 var2 = class154.method175(this.field1100);
        if (var2.field1794 != null) {
            var2 = var2.method2720();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1102 == 1 || this.field1102 == 3) {
            var3 = var2.field1803;
            var4 = var2.field1791;
        } else {
            var3 = var2.field1791;
            var4 = var2.field1803;
        }
        int var5 = (var3 >> 1) + this.field1105;
        int var6 = (var3 + 1 >> 1) + this.field1105;
        int var7 = (var4 >> 1) + this.field1101;
        int var8 = (var4 + 1 >> 1) + this.field1101;
        int[][] var9 = class90.field1128[this.field1098];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1105 << 7) + (var3 << 6);
        int var12 = (this.field1101 << 7) + (var4 << 6);
        return var2.method2759(this.field1107, this.field1102, var9, var11, var10, var12, this.field1103, this.field1104);
    }
}
