package deob;

@ObfuscatedName("dj")
public class class80 extends class233 {

    @ObfuscatedName("dj.au")
    public int field1025;

    @ObfuscatedName("dj.ae")
    public int field1023;

    @ObfuscatedName("dj.ao")
    public int field1024;

    @ObfuscatedName("dj.at")
    public int field1028;

    @ObfuscatedName("dj.ac")
    public int field1026;

    @ObfuscatedName("dj.ai")
    public int field1027;

    @ObfuscatedName("dj.az")
    public class209 field1022;

    @ObfuscatedName("dj.ap")
    public int field1029;

    @ObfuscatedName("dj.aa")
    public int field1030;

    public class80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class233 arg8) {
        this.field1025 = arg0;
        this.field1023 = arg1;
        this.field1024 = arg2;
        this.field1028 = arg3;
        this.field1026 = arg4;
        this.field1027 = arg5;
        if (arg6 != -1) {
            this.field1022 = class209.method3394(arg6);
            this.field1029 = 0;
            this.field1030 = client.field833 - 1;
            if (this.field1022.field2328 == 0 && arg8 != null && arg8 instanceof class80) {
                class80 var10 = (class80) arg8;
                if (this.field1022 == var10.field1022) {
                    this.field1029 = var10.field1029;
                    this.field1030 = var10.field1030;
                    return;
                }
            }
            if (arg7 && this.field1022.field2317 != -1) {
                if (this.field1022.method3775()) {
                    this.field1029 = (int) (Math.random() * (double) this.field1022.method3747());
                } else {
                    this.field1029 = (int) (Math.random() * (double) this.field1022.field2313.length);
                    this.field1030 -= (int) (Math.random() * (double) this.field1022.field2324[this.field1029]);
                }
            }
        }
    }

    @ObfuscatedName("dj.ae(I)Ljr;")
    public final class240 method1990() {
        if (this.field1022 != null) {
            int var1 = client.field833 - this.field1030;
            if (var1 > 100 && this.field1022.field2317 > 0) {
                var1 = 100;
            }
            if (this.field1022.method3775()) {
                int var2 = this.field1022.method3747();
                this.field1029 += var1;
                var1 = 0;
                if (this.field1029 >= var2) {
                    this.field1029 = var2 - this.field1022.field2317;
                    if (this.field1029 < 0 || this.field1029 > var2) {
                        this.field1022 = null;
                    }
                }
            } else {
                label69: {
                    do {
                        do {
                            if (var1 <= this.field1022.field2324[this.field1029]) {
                                break label69;
                            }
                            var1 -= this.field1022.field2324[this.field1029];
                            this.field1029++;
                        } while (this.field1029 < this.field1022.field2313.length);
                        this.field1029 -= this.field1022.field2317;
                    } while (this.field1029 >= 0 && this.field1029 < this.field1022.field2313.length);
                    this.field1022 = null;
                }
            }
            this.field1030 = client.field833 - var1;
        }
        class206 var3 = class206.method3321(this.field1025);
        if (var3.field2212 != null) {
            var3 = var3.method3610();
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field1024 == 1 || this.field1024 == 3) {
            var4 = var3.field2171;
            var5 = var3.field2186;
        } else {
            var4 = var3.field2186;
            var5 = var3.field2171;
        }
        int var6 = (var4 >> 1) + this.field1026;
        int var7 = (var4 + 1 >> 1) + this.field1026;
        int var8 = (var5 >> 1) + this.field1027;
        int var9 = (var5 + 1 >> 1) + this.field1027;
        int[][] var10 = class82.field1048[this.field1028];
        int var11 = var10[var6][var8] + var10[var7][var8] + var10[var6][var9] + var10[var7][var9] >> 2;
        int var12 = (this.field1026 << 7) + (var4 << 6);
        int var13 = (this.field1027 << 7) + (var5 << 6);
        return var3.method3608(this.field1023, this.field1024, var10, var12, var11, var13, this.field1022, this.field1029);
    }
}
