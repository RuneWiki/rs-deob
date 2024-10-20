package deob;

@ObfuscatedName("w")
public class class14 extends class95 {

    @ObfuscatedName("w.i")
    public int field220;

    @ObfuscatedName("w.b")
    public int field206;

    @ObfuscatedName("w.r")
    public int field207;

    @ObfuscatedName("w.l")
    public int field221;

    @ObfuscatedName("w.s")
    public int field209;

    @ObfuscatedName("w.d")
    public int field210;

    @ObfuscatedName("w.e")
    public class35 field211;

    @ObfuscatedName("w.u")
    public int field205;

    @ObfuscatedName("w.q")
    public int field215;

    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class95 arg8) {
        this.field220 = arg0;
        this.field206 = arg1;
        this.field207 = arg2;
        this.field221 = arg3;
        this.field209 = arg4;
        this.field210 = arg5;
        if (arg6 != -1) {
            this.field211 = class35.method708(arg6);
            this.field205 = 0;
            this.field215 = client.field735 - 1;
            if (this.field211.field886 == 0 && arg8 != null && arg8 instanceof class14) {
                class14 var10 = (class14) arg8;
                if (this.field211 == var10.field211) {
                    this.field205 = var10.field205;
                    this.field215 = var10.field215;
                    return;
                }
            }
            if (arg7 && this.field211.field888 != -1) {
                this.field205 = (int) (Math.random() * (double) this.field211.field901.length);
                this.field215 -= (int) (Math.random() * (double) this.field211.field890[this.field205]);
            }
        }
    }

    @ObfuscatedName("w.b(I)Ldt;")
    public final class113 method26() {
        if (this.field211 != null) {
            int var1 = client.field735 - this.field215;
            if (var1 > 100 && this.field211.field888 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field211.field890[this.field205]) {
                            break label47;
                        }
                        var1 -= this.field211.field890[this.field205];
                        this.field205++;
                    } while (this.field205 < this.field211.field901.length);
                    this.field205 -= this.field211.field888;
                } while (this.field205 >= 0 && this.field205 < this.field211.field901.length);
                this.field211 = null;
            }
            this.field215 = client.field735 - var1;
        }
        class33 var2 = Statics.method2776(this.field220);
        if (var2.field855 != null) {
            var2 = var2.method662();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field207 == 1 || this.field207 == 3) {
            var3 = var2.field830;
            var4 = var2.field819;
        } else {
            var3 = var2.field819;
            var4 = var2.field830;
        }
        int var5 = (var3 >> 1) + this.field209;
        int var6 = (var3 + 1 >> 1) + this.field209;
        int var7 = (var4 >> 1) + this.field210;
        int var8 = (var4 + 1 >> 1) + this.field210;
        int[][] var9 = class9.field122[this.field221];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field209 << 7) + (var3 << 6);
        int var12 = (this.field210 << 7) + (var4 << 6);
        return var2.method657(this.field206, this.field207, var9, var11, var10, var12, this.field211, this.field205);
    }
}
