package deob;

@ObfuscatedName("dr")
public class class83 extends class248 {

    @ObfuscatedName("dr.ap")
    public final class104 field1016;

    @ObfuscatedName("dr.aw")
    public final int field1014;

    @ObfuscatedName("dr.ak")
    public final int field1015;

    @ObfuscatedName("dr.aj")
    public final int field1018;

    @ObfuscatedName("dr.ai")
    public final int field1017;

    @ObfuscatedName("dr.ay")
    public final int field1021;

    @ObfuscatedName("dr.as")
    public final int field1019;

    @ObfuscatedName("dr.ae")
    public class213 field1020;

    @ObfuscatedName("dr.am")
    public int field1028;

    @ObfuscatedName("dr.at")
    public int field1022;

    public class83(class104 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class248 arg9) {
        this.field1016 = arg0;
        this.field1014 = arg1;
        this.field1015 = arg2;
        this.field1018 = arg3;
        this.field1017 = arg4;
        this.field1021 = arg5;
        this.field1019 = arg6;
        if (arg7 != -1) {
            this.field1020 = class213.method6692(arg7);
            this.field1028 = 0;
            this.field1022 = client.field518 - 1;
            if (this.field1020.field2323 == 0 && arg9 instanceof class83) {
                class83 var11 = (class83) arg9;
                if (this.field1020 == var11.field1020) {
                    this.field1028 = var11.field1028;
                    this.field1022 = var11.field1022;
                    return;
                }
            }
            if (arg8 && this.field1020.field2309 != -1) {
                if (this.field1020.method4100()) {
                    this.field1028 = (int) (Math.random() * (double) this.field1020.method4101());
                } else {
                    this.field1028 = (int) (Math.random() * (double) this.field1020.field2314.length);
                    this.field1022 -= (int) (Math.random() * (double) this.field1020.field2316[this.field1028]);
                }
            }
        }
    }

    @ObfuscatedName("dr.au(I)Ljy;")
    public final class256 method2245() {
        class210 var1 = class210.method3109(this.field1014);
        if (var1.field2178 != null) {
            var1 = var1.method3968();
        }
        if (var1 == null) {
            return null;
        }
        int var2;
        int var3;
        if (this.field1018 == 1 || this.field1018 == 3) {
            var2 = var1.field2216;
            var3 = var1.field2187;
        } else {
            var2 = var1.field2187;
            var3 = var1.field2216;
        }
        int var4 = (var2 >> 1) + this.field1021;
        int var5 = (var2 + 1 >> 1) + this.field1021;
        int var6 = (var3 >> 1) + this.field1019;
        int var7 = (var3 + 1 >> 1) + this.field1019;
        int[][] var8 = this.field1016.field1350[this.field1017];
        int var9 = var8[var4][var6] + var8[var5][var6] + var8[var4][var7] + var8[var5][var7] >> 2;
        int var10 = (this.field1021 << 7) + (var2 << 6);
        int var11 = (this.field1019 << 7) + (var3 << 6);
        if (this.field1020 != null) {
            int var12 = client.field518 - this.field1022;
            if (var12 > 100 && this.field1020.field2309 > 0) {
                var12 = 100;
            }
            if (this.field1020.method4100()) {
                int var13 = this.field1020.method4101();
                this.field1028 += var12;
                var12 = 0;
                if (this.field1028 >= var13) {
                    this.field1028 = var13 - this.field1020.field2309;
                    if (this.field1028 < 0 || this.field1028 > var13) {
                        this.field1020 = null;
                    }
                }
                if (this.field1020 != null) {
                    client.method5758(this.field1020, this.field1028, var10, var11, false);
                }
            } else {
                label49: {
                    do {
                        while (true) {
                            if (var12 <= this.field1020.field2316[this.field1028]) {
                                break label49;
                            }
                            var12 -= this.field1020.field2316[this.field1028];
                            this.field1028++;
                            if (this.field1028 >= this.field1020.field2314.length) {
                                this.field1028 -= this.field1020.field2309;
                                break;
                            }
                            client.method5758(this.field1020, this.field1028, var10, var11, false);
                        }
                    } while (this.field1028 >= 0 && this.field1028 < this.field1020.field2314.length);
                    this.field1020 = null;
                }
            }
            this.field1022 = client.field518 - var12;
        }
        return var1.method3986(this.field1015, this.field1018, var8, var10, var9, var11, this.field1020, this.field1028);
    }
}
