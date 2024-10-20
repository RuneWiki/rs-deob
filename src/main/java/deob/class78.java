package deob;

@ObfuscatedName("cr")
public class class78 extends class225 {

    @ObfuscatedName("cr.aj")
    public int field978;

    @ObfuscatedName("cr.al")
    public int field977;

    @ObfuscatedName("cr.ac")
    public int field983;

    @ObfuscatedName("cr.ab")
    public int field980;

    @ObfuscatedName("cr.an")
    public int field981;

    @ObfuscatedName("cr.ao")
    public int field979;

    @ObfuscatedName("cr.av")
    public class206 field985;

    @ObfuscatedName("cr.aq")
    public int field984;

    @ObfuscatedName("cr.ap")
    public int field982;

    public class78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class225 arg8) {
        this.field978 = arg0;
        this.field977 = arg1;
        this.field983 = arg2;
        this.field980 = arg3;
        this.field981 = arg4;
        this.field979 = arg5;
        if (arg6 != -1) {
            this.field985 = class206.method5217(arg6);
            this.field984 = 0;
            this.field982 = client.field494 - 1;
            if (this.field985.field2277 == 0 && arg8 != null && arg8 instanceof class78) {
                class78 var10 = (class78) arg8;
                if (this.field985 == var10.field985) {
                    this.field984 = var10.field984;
                    this.field982 = var10.field982;
                    return;
                }
            }
            if (arg7 && this.field985.field2263 != -1) {
                if (this.field985.method3694()) {
                    this.field984 = (int) (Math.random() * (double) this.field985.method3695());
                } else {
                    this.field984 = (int) (Math.random() * (double) this.field985.field2276.length);
                    this.field982 -= (int) (Math.random() * (double) this.field985.field2264[this.field984]);
                }
            }
        }
    }

    @ObfuscatedName("cr.al(I)Lix;")
    public final class231 method1936() {
        if (this.field985 != null) {
            int var1 = client.field494 - this.field982;
            if (var1 > 100 && this.field985.field2263 > 0) {
                var1 = 100;
            }
            if (this.field985.method3694()) {
                int var2 = this.field985.method3695();
                this.field984 += var1;
                var1 = 0;
                if (this.field984 >= var2) {
                    this.field984 = var2 - this.field985.field2263;
                    if (this.field984 < 0 || this.field984 > var2) {
                        this.field985 = null;
                    }
                }
            } else {
                label69: {
                    do {
                        do {
                            if (var1 <= this.field985.field2264[this.field984]) {
                                break label69;
                            }
                            var1 -= this.field985.field2264[this.field984];
                            this.field984++;
                        } while (this.field984 < this.field985.field2276.length);
                        this.field984 -= this.field985.field2263;
                    } while (this.field984 >= 0 && this.field984 < this.field985.field2276.length);
                    this.field985 = null;
                }
            }
            this.field982 = client.field494 - var1;
        }
        class203 var3 = Statics.method4396(this.field978);
        if (var3.field2129 != null) {
            var3 = var3.method3545();
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field983 == 1 || this.field983 == 3) {
            var4 = var3.field2141;
            var5 = var3.field2174;
        } else {
            var4 = var3.field2174;
            var5 = var3.field2141;
        }
        int var6 = (var4 >> 1) + this.field981;
        int var7 = (var4 + 1 >> 1) + this.field981;
        int var8 = (var5 >> 1) + this.field979;
        int var9 = (var5 + 1 >> 1) + this.field979;
        int[][] var10 = class80.field1000[this.field980];
        int var11 = var10[var6][var8] + var10[var7][var8] + var10[var6][var9] + var10[var7][var9] >> 2;
        int var12 = (this.field981 << 7) + (var4 << 6);
        int var13 = (this.field979 << 7) + (var5 << 6);
        return var3.method3546(this.field977, this.field983, var10, var12, var11, var13, this.field985, this.field984);
    }
}
