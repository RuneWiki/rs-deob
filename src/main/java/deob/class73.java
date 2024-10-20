package deob;

@ObfuscatedName("bn")
public class class73 extends class214 {

    @ObfuscatedName("bn.i")
    public int field941;

    @ObfuscatedName("bn.w")
    public int field939;

    @ObfuscatedName("bn.s")
    public int field940;

    @ObfuscatedName("bn.a")
    public int field942;

    @ObfuscatedName("bn.o")
    public int field949;

    @ObfuscatedName("bn.g")
    public int field944;

    @ObfuscatedName("bn.e")
    public class172 field945;

    @ObfuscatedName("bn.p")
    public int field946;

    @ObfuscatedName("bn.j")
    public int field947;

    public class73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class214 arg8) {
        this.field941 = arg0;
        this.field939 = arg1;
        this.field940 = arg2;
        this.field942 = arg3;
        this.field949 = arg4;
        this.field944 = arg5;
        if (arg6 != -1) {
            this.field945 = class172.method589(arg6);
            this.field946 = 0;
            this.field947 = client.field555 - 1;
            if (this.field945.field1966 == 0 && arg8 != null && arg8 instanceof class73) {
                class73 var10 = (class73) arg8;
                if (this.field945 == var10.field945) {
                    this.field946 = var10.field946;
                    this.field947 = var10.field947;
                    return;
                }
            }
            if (arg7 && this.field945.field1961 != -1) {
                this.field946 = (int) (Math.random() * (double) this.field945.field1953.length);
                this.field947 -= (int) (Math.random() * (double) this.field945.field1955[this.field946]);
            }
        }
    }

    @ObfuscatedName("bn.w(I)Lhl;")
    public final class220 method1799() {
        if (this.field945 != null) {
            int var1 = client.field555 - this.field947;
            if (var1 > 100 && this.field945.field1961 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field945.field1955[this.field946]) {
                            break label47;
                        }
                        var1 -= this.field945.field1955[this.field946];
                        this.field946++;
                    } while (this.field946 < this.field945.field1953.length);
                    this.field946 -= this.field945.field1961;
                } while (this.field946 >= 0 && this.field946 < this.field945.field1953.length);
                this.field945 = null;
            }
            this.field947 = client.field555 - var1;
        }
        class169 var2 = Statics.method2740(this.field941);
        if (var2.field1824 != null) {
            var2 = var2.method2980();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field940 == 1 || this.field940 == 3) {
            var3 = var2.field1840;
            var4 = var2.field1828;
        } else {
            var3 = var2.field1828;
            var4 = var2.field1840;
        }
        int var5 = (var3 >> 1) + this.field949;
        int var6 = (var3 + 1 >> 1) + this.field949;
        int var7 = (var4 >> 1) + this.field944;
        int var8 = (var4 + 1 >> 1) + this.field944;
        int[][] var9 = class75.field969[this.field942];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field949 << 7) + (var3 << 6);
        int var12 = (this.field944 << 7) + (var4 << 6);
        return var2.method2978(this.field939, this.field940, var9, var11, var10, var12, this.field945, this.field946);
    }
}
