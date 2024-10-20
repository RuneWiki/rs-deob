package deob;

@ObfuscatedName("x")
public class class14 extends class94 {

    @ObfuscatedName("x.b")
    public int field247;

    @ObfuscatedName("x.c")
    public int field233;

    @ObfuscatedName("x.j")
    public int field232;

    @ObfuscatedName("x.i")
    public int field235;

    @ObfuscatedName("x.k")
    public int field240;

    @ObfuscatedName("x.q")
    public int field237;

    @ObfuscatedName("x.t")
    public class34 field246;

    @ObfuscatedName("x.v")
    public int field239;

    @ObfuscatedName("x.y")
    public int field238;

    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class94 arg8) {
        this.field247 = arg0;
        this.field233 = arg1;
        this.field232 = arg2;
        this.field235 = arg3;
        this.field240 = arg4;
        this.field237 = arg5;
        if (arg6 != -1) {
            this.field246 = Statics.method61(arg6);
            this.field239 = 0;
            this.field238 = client.field489 - 1;
            if (this.field246.field897 == 0 && arg8 != null && arg8 instanceof class14) {
                class14 var10 = (class14) arg8;
                if (this.field246 == var10.field246) {
                    this.field239 = var10.field239;
                    this.field238 = var10.field238;
                    return;
                }
            }
            if (arg7 && this.field246.field890 != -1) {
                this.field239 = (int) (Math.random() * (double) this.field246.field891.length);
                this.field238 -= (int) (Math.random() * (double) this.field246.field888[this.field239]);
            }
        }
    }

    @ObfuscatedName("x.c(I)Ldr;")
    public final class112 method13() {
        if (this.field246 != null) {
            int var1 = client.field489 - this.field238;
            if (var1 > 100 && this.field246.field890 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field246.field888[this.field239]) {
                            break label47;
                        }
                        var1 -= this.field246.field888[this.field239];
                        this.field239++;
                    } while (this.field239 < this.field246.field891.length);
                    this.field239 -= this.field246.field890;
                } while (this.field239 >= 0 && this.field239 < this.field246.field891.length);
                this.field246 = null;
            }
            this.field238 = client.field489 - var1;
        }
        class32 var2 = class32.method46(this.field247);
        if (var2.field851 != null) {
            var2 = var2.method630();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field232 == 1 || this.field232 == 3) {
            var3 = var2.field826;
            var4 = var2.field825;
        } else {
            var3 = var2.field825;
            var4 = var2.field826;
        }
        int var5 = (var3 >> 1) + this.field240;
        int var6 = (var3 + 1 >> 1) + this.field240;
        int var7 = (var4 >> 1) + this.field237;
        int var8 = (var4 + 1 >> 1) + this.field237;
        int[][] var9 = class9.field149[this.field235];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field240 << 7) + (var3 << 6);
        int var12 = (this.field237 << 7) + (var4 << 6);
        return var2.method628(this.field233, this.field232, var9, var11, var10, var12, this.field246, this.field239);
    }
}
