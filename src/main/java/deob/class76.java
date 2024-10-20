package deob;

@ObfuscatedName("ct")
public class class76 extends class225 {

    @ObfuscatedName("ct.af")
    public int field980;

    @ObfuscatedName("ct.an")
    public int field981;

    @ObfuscatedName("ct.aw")
    public int field976;

    @ObfuscatedName("ct.ac")
    public int field975;

    @ObfuscatedName("ct.au")
    public int field977;

    @ObfuscatedName("ct.ab")
    public int field979;

    @ObfuscatedName("ct.aq")
    public class204 field987;

    @ObfuscatedName("ct.al")
    public int field978;

    @ObfuscatedName("ct.at")
    public int field982;

    public class76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class225 arg8) {
        this.field980 = arg0;
        this.field981 = arg1;
        this.field976 = arg2;
        this.field975 = arg3;
        this.field977 = arg4;
        this.field979 = arg5;
        if (arg6 != -1) {
            this.field987 = class204.method2139(arg6);
            this.field978 = 0;
            this.field982 = client.field602 - 1;
            if (this.field987.field2315 == 0 && arg8 != null && arg8 instanceof class76) {
                class76 var10 = (class76) arg8;
                if (this.field987 == var10.field987) {
                    this.field978 = var10.field978;
                    this.field982 = var10.field982;
                    return;
                }
            }
            if (arg7 && this.field987.field2301 != -1) {
                if (this.field987.method3816()) {
                    this.field978 = (int) (Math.random() * (double) this.field987.method3817());
                } else {
                    this.field978 = (int) (Math.random() * (double) this.field987.field2300.length);
                    this.field982 -= (int) (Math.random() * (double) this.field987.field2304[this.field978]);
                }
            }
        }
    }

    @ObfuscatedName("ct.an(B)Lit;")
    public final class232 method1921() {
        if (this.field987 != null) {
            int var1 = client.field602 - this.field982;
            if (var1 > 100 && this.field987.field2301 > 0) {
                var1 = 100;
            }
            if (this.field987.method3816()) {
                int var2 = this.field987.method3817();
                this.field978 += var1;
                var1 = 0;
                if (this.field978 >= var2) {
                    this.field978 = var2 - this.field987.field2301;
                    if (this.field978 < 0 || this.field978 > var2) {
                        this.field987 = null;
                    }
                }
            } else {
                label69: {
                    do {
                        do {
                            if (var1 <= this.field987.field2304[this.field978]) {
                                break label69;
                            }
                            var1 -= this.field987.field2304[this.field978];
                            this.field978++;
                        } while (this.field978 < this.field987.field2300.length);
                        this.field978 -= this.field987.field2301;
                    } while (this.field978 >= 0 && this.field978 < this.field987.field2300.length);
                    this.field987 = null;
                }
            }
            this.field982 = client.field602 - var1;
        }
        class201 var3 = Statics.method3057(this.field980);
        if (var3.field2198 != null) {
            var3 = var3.method3669();
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field976 == 1 || this.field976 == 3) {
            var4 = var3.field2173;
            var5 = var3.field2172;
        } else {
            var4 = var3.field2172;
            var5 = var3.field2173;
        }
        int var6 = (var4 >> 1) + this.field977;
        int var7 = (var4 + 1 >> 1) + this.field977;
        int var8 = (var5 >> 1) + this.field979;
        int var9 = (var5 + 1 >> 1) + this.field979;
        int[][] var10 = class78.field1002[this.field975];
        int var11 = var10[var6][var8] + var10[var7][var8] + var10[var6][var9] + var10[var7][var9] >> 2;
        int var12 = (this.field977 << 7) + (var4 << 6);
        int var13 = (this.field979 << 7) + (var5 << 6);
        return var3.method3667(this.field981, this.field976, var10, var12, var11, var13, this.field987, this.field978);
    }
}
