package deob;

@ObfuscatedName("bo")
public class class73 extends class214 {

    @ObfuscatedName("bo.n")
    public int field953;

    @ObfuscatedName("bo.c")
    public int field954;

    @ObfuscatedName("bo.m")
    public int field955;

    @ObfuscatedName("bo.k")
    public int field962;

    @ObfuscatedName("bo.o")
    public int field958;

    @ObfuscatedName("bo.g")
    public int field957;

    @ObfuscatedName("bo.z")
    public class172 field959;

    @ObfuscatedName("bo.a")
    public int field960;

    @ObfuscatedName("bo.u")
    public int field961;

    public class73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class214 arg8) {
        this.field953 = arg0;
        this.field954 = arg1;
        this.field955 = arg2;
        this.field962 = arg3;
        this.field958 = arg4;
        this.field957 = arg5;
        if (arg6 != -1) {
            this.field959 = class172.method269(arg6);
            this.field960 = 0;
            this.field961 = client.field744 - 1;
            if (this.field959.field1962 == 0 && arg8 != null && arg8 instanceof class73) {
                class73 var10 = (class73) arg8;
                if (this.field959 == var10.field959) {
                    this.field960 = var10.field960;
                    this.field961 = var10.field961;
                    return;
                }
            }
            if (arg7 && this.field959.field1958 != -1) {
                this.field960 = (int) (Math.random() * (double) this.field959.field1952.length);
                this.field961 -= (int) (Math.random() * (double) this.field959.field1951[this.field960]);
            }
        }
    }

    @ObfuscatedName("bo.c(B)Lhg;")
    public final class220 method1766() {
        if (this.field959 != null) {
            int var1 = client.field744 - this.field961;
            if (var1 > 100 && this.field959.field1958 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field959.field1951[this.field960]) {
                            break label47;
                        }
                        var1 -= this.field959.field1951[this.field960];
                        this.field960++;
                    } while (this.field960 < this.field959.field1952.length);
                    this.field960 -= this.field959.field1958;
                } while (this.field960 >= 0 && this.field960 < this.field959.field1952.length);
                this.field959 = null;
            }
            this.field961 = client.field744 - var1;
        }
        class169 var2 = class169.method2878(this.field953);
        if (var2.field1861 != null) {
            var2 = var2.method2895();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field955 == 1 || this.field955 == 3) {
            var3 = var2.field1836;
            var4 = var2.field1835;
        } else {
            var3 = var2.field1835;
            var4 = var2.field1836;
        }
        int var5 = (var3 >> 1) + this.field958;
        int var6 = (var3 + 1 >> 1) + this.field958;
        int var7 = (var4 >> 1) + this.field957;
        int var8 = (var4 + 1 >> 1) + this.field957;
        int[][] var9 = class75.field976[this.field962];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field958 << 7) + (var3 << 6);
        int var12 = (this.field957 << 7) + (var4 << 6);
        return var2.method2890(this.field954, this.field955, var9, var11, var10, var12, this.field959, this.field960);
    }
}
