package deob;

@ObfuscatedName("l")
public class class14 extends class94 {

    @ObfuscatedName("l.g")
    public int field197;

    @ObfuscatedName("l.m")
    public int field198;

    @ObfuscatedName("l.v")
    public int field208;

    @ObfuscatedName("l.r")
    public int field200;

    @ObfuscatedName("l.n")
    public int field201;

    @ObfuscatedName("l.i")
    public int field202;

    @ObfuscatedName("l.s")
    public class34 field203;

    @ObfuscatedName("l.w")
    public int field204;

    @ObfuscatedName("l.d")
    public int field205;

    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class94 arg8) {
        this.field197 = arg0;
        this.field198 = arg1;
        this.field208 = arg2;
        this.field200 = arg3;
        this.field201 = arg4;
        this.field202 = arg5;
        if (arg6 != -1) {
            this.field203 = class34.method1536(arg6);
            this.field204 = 0;
            this.field205 = client.field476 - 1;
            if (this.field203.field884 == 0 && arg8 != null && arg8 instanceof class14) {
                class14 var10 = (class14) arg8;
                if (this.field203 == var10.field203) {
                    this.field204 = var10.field204;
                    this.field205 = var10.field205;
                    return;
                }
            }
            if (arg7 && this.field203.field874 != -1) {
                this.field204 = (int) (Math.random() * (double) this.field203.field870.length);
                this.field205 -= (int) (Math.random() * (double) this.field203.field872[this.field204]);
            }
        }
    }

    @ObfuscatedName("l.m(B)Ldf;")
    public final class112 method30() {
        if (this.field203 != null) {
            int var1 = client.field476 - this.field205;
            if (var1 > 100 && this.field203.field874 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field203.field872[this.field204]) {
                            break label47;
                        }
                        var1 -= this.field203.field872[this.field204];
                        this.field204++;
                    } while (this.field204 < this.field203.field870.length);
                    this.field204 -= this.field203.field874;
                } while (this.field204 >= 0 && this.field204 < this.field203.field870.length);
                this.field203 = null;
            }
            this.field205 = client.field476 - var1;
        }
        class32 var2 = class32.method54(this.field197);
        if (var2.field846 != null) {
            var2 = var2.method638();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field208 == 1 || this.field208 == 3) {
            var3 = var2.field821;
            var4 = var2.field819;
        } else {
            var3 = var2.field819;
            var4 = var2.field821;
        }
        int var5 = (var3 >> 1) + this.field201;
        int var6 = (var3 + 1 >> 1) + this.field201;
        int var7 = (var4 >> 1) + this.field202;
        int var8 = (var4 + 1 >> 1) + this.field202;
        int[][] var9 = class9.field126[this.field200];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field201 << 7) + (var3 << 6);
        int var12 = (this.field202 << 7) + (var4 << 6);
        return var2.method636(this.field198, this.field208, var9, var11, var10, var12, this.field203, this.field204);
    }
}
