package deob;

@ObfuscatedName("bw")
public class class73 extends class214 {

    @ObfuscatedName("bw.l")
    public int field966;

    @ObfuscatedName("bw.q")
    public int field959;

    @ObfuscatedName("bw.f")
    public int field960;

    @ObfuscatedName("bw.j")
    public int field965;

    @ObfuscatedName("bw.m")
    public int field962;

    @ObfuscatedName("bw.k")
    public int field958;

    @ObfuscatedName("bw.t")
    public class172 field964;

    @ObfuscatedName("bw.a")
    public int field967;

    @ObfuscatedName("bw.e")
    public int field961;

    public class73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class214 arg8) {
        this.field966 = arg0;
        this.field959 = arg1;
        this.field960 = arg2;
        this.field965 = arg3;
        this.field962 = arg4;
        this.field958 = arg5;
        if (arg6 != -1) {
            this.field964 = class172.method2708(arg6);
            this.field967 = 0;
            this.field961 = client.field494 - 1;
            if (this.field964.field1962 == 0 && arg8 != null && arg8 instanceof class73) {
                class73 var10 = (class73) arg8;
                if (this.field964 == var10.field964) {
                    this.field967 = var10.field967;
                    this.field961 = var10.field961;
                    return;
                }
            }
            if (arg7 && this.field964.field1949 != -1) {
                this.field967 = (int) (Math.random() * (double) this.field964.field1959.length);
                this.field961 -= (int) (Math.random() * (double) this.field964.field1951[this.field967]);
            }
        }
    }

    @ObfuscatedName("bw.q(B)Lhl;")
    public final class220 method1785() {
        if (this.field964 != null) {
            int var1 = client.field494 - this.field961;
            if (var1 > 100 && this.field964.field1949 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field964.field1951[this.field967]) {
                            break label47;
                        }
                        var1 -= this.field964.field1951[this.field967];
                        this.field967++;
                    } while (this.field967 < this.field964.field1959.length);
                    this.field967 -= this.field964.field1949;
                } while (this.field967 >= 0 && this.field967 < this.field964.field1959.length);
                this.field964 = null;
            }
            this.field961 = client.field494 - var1;
        }
        class169 var2 = class169.method4277(this.field966);
        if (var2.field1863 != null) {
            var2 = var2.method2967();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field960 == 1 || this.field960 == 3) {
            var3 = var2.field1829;
            var4 = var2.field1845;
        } else {
            var3 = var2.field1845;
            var4 = var2.field1829;
        }
        int var5 = (var3 >> 1) + this.field962;
        int var6 = (var3 + 1 >> 1) + this.field962;
        int var7 = (var4 >> 1) + this.field958;
        int var8 = (var4 + 1 >> 1) + this.field958;
        int[][] var9 = class75.field994[this.field965];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field962 << 7) + (var3 << 6);
        int var12 = (this.field958 << 7) + (var4 << 6);
        return var2.method2976(this.field959, this.field960, var9, var11, var10, var12, this.field964, this.field967);
    }
}
