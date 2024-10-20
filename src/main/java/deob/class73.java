package deob;

@ObfuscatedName("bj")
public class class73 extends class198 {

    @ObfuscatedName("bj.c")
    public int field944;

    @ObfuscatedName("bj.b")
    public int field945;

    @ObfuscatedName("bj.p")
    public int field946;

    @ObfuscatedName("bj.m")
    public int field947;

    @ObfuscatedName("bj.t")
    public int field948;

    @ObfuscatedName("bj.s")
    public int field951;

    @ObfuscatedName("bj.j")
    public class183 field950;

    @ObfuscatedName("bj.w")
    public int field953;

    @ObfuscatedName("bj.n")
    public int field952;

    public class73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class198 arg8) {
        this.field944 = arg0;
        this.field945 = arg1;
        this.field946 = arg2;
        this.field947 = arg3;
        this.field948 = arg4;
        this.field951 = arg5;
        if (arg6 != -1) {
            this.field950 = class183.method2402(arg6);
            this.field953 = 0;
            this.field952 = client.field481 - 1;
            if (this.field950.field2079 == 0 && arg8 != null && arg8 instanceof class73) {
                class73 var10 = (class73) arg8;
                if (this.field950 == var10.field950) {
                    this.field953 = var10.field953;
                    this.field952 = var10.field952;
                    return;
                }
            }
            if (arg7 && this.field950.field2089 != -1) {
                if (this.field950.method3381()) {
                    this.field953 = (int) (Math.random() * (double) this.field950.method3338());
                } else {
                    this.field953 = (int) (Math.random() * (double) this.field950.field2099.length);
                    this.field952 -= (int) (Math.random() * (double) this.field950.field2081[this.field953]);
                }
            }
        }
    }

    @ObfuscatedName("bj.b(I)Lgo;")
    public final class204 method1860() {
        if (this.field950 != null) {
            int var1 = client.field481 - this.field952;
            if (var1 > 100 && this.field950.field2089 > 0) {
                var1 = 100;
            }
            if (this.field950.method3381()) {
                int var2 = this.field950.method3338();
                this.field953 += var1;
                var1 = 0;
                if (this.field953 >= var2) {
                    this.field953 = var2 - this.field950.field2089;
                    if (this.field953 < 0 || this.field953 > var2) {
                        this.field950 = null;
                    }
                }
            } else {
                label69: {
                    do {
                        do {
                            if (var1 <= this.field950.field2081[this.field953]) {
                                break label69;
                            }
                            var1 -= this.field950.field2081[this.field953];
                            this.field953++;
                        } while (this.field953 < this.field950.field2099.length);
                        this.field953 -= this.field950.field2089;
                    } while (this.field953 >= 0 && this.field953 < this.field950.field2099.length);
                    this.field950 = null;
                }
            }
            this.field952 = client.field481 - var1;
        }
        class180 var3 = class180.method2760(this.field944);
        if (var3.field1981 != null) {
            var3 = var3.method3208();
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field946 == 1 || this.field946 == 3) {
            var4 = var3.field1968;
            var5 = var3.field1967;
        } else {
            var4 = var3.field1967;
            var5 = var3.field1968;
        }
        int var6 = (var4 >> 1) + this.field948;
        int var7 = (var4 + 1 >> 1) + this.field948;
        int var8 = (var5 >> 1) + this.field951;
        int var9 = (var5 + 1 >> 1) + this.field951;
        int[][] var10 = class75.field972[this.field947];
        int var11 = var10[var6][var8] + var10[var7][var8] + var10[var6][var9] + var10[var7][var9] >> 2;
        int var12 = (this.field948 << 7) + (var4 << 6);
        int var13 = (this.field951 << 7) + (var5 << 6);
        return var3.method3184(this.field945, this.field946, var10, var12, var11, var13, this.field950, this.field953);
    }
}
