package deob;

@ObfuscatedName("dr")
public class class82 extends class286 {

    @ObfuscatedName("dr.aq")
    public final class102 field1025;

    @ObfuscatedName("dr.ad")
    public final int field1021;

    @ObfuscatedName("dr.ag")
    public final int field1016;

    @ObfuscatedName("dr.ak")
    public final int field1017;

    @ObfuscatedName("dr.ap")
    public final int field1018;

    @ObfuscatedName("dr.an")
    public final int field1019;

    @ObfuscatedName("dr.aj")
    public final int field1014;

    @ObfuscatedName("dr.av")
    public class210 field1020;

    @ObfuscatedName("dr.ab")
    public int field1022;

    @ObfuscatedName("dr.ai")
    public int field1023;

    public class82(class102 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class286 arg9) {
        this.field1025 = arg0;
        this.field1021 = arg1;
        this.field1016 = arg2;
        this.field1017 = arg3;
        this.field1018 = arg4;
        this.field1019 = arg5;
        this.field1014 = arg6;
        if (arg7 != -1) {
            this.field1020 = class210.method5910(arg7);
            this.field1022 = 0;
            this.field1023 = client.field516 - 1;
            if (this.field1020.field2306 == 0 && arg9 instanceof class82) {
                class82 var11 = (class82) arg9;
                if (this.field1020 == var11.field1020) {
                    this.field1022 = var11.field1022;
                    this.field1023 = var11.field1023;
                    return;
                }
            }
            if (arg8 && this.field1020.field2295 != -1) {
                if (this.field1020.method3748()) {
                    this.field1022 = (int) (Math.random() * (double) this.field1020.method3757());
                } else {
                    this.field1022 = (int) (Math.random() * (double) this.field1020.field2291.length);
                    this.field1023 -= (int) (Math.random() * (double) this.field1020.field2285[this.field1022]);
                }
            }
        }
    }

    @ObfuscatedName("dr.ah(I)Llv;")
    public final class294 method2050() {
        class207 var1 = class207.method95(this.field1021);
        if (var1.field2194 != null) {
            var1 = var1.method3616();
        }
        if (var1 == null) {
            return null;
        }
        int var2;
        int var3;
        if (this.field1017 == 1 || this.field1017 == 3) {
            var2 = var1.field2169;
            var3 = var1.field2168;
        } else {
            var2 = var1.field2168;
            var3 = var1.field2169;
        }
        int var4 = (var2 >> 1) + this.field1019;
        int var5 = (var2 + 1 >> 1) + this.field1019;
        int var6 = (var3 >> 1) + this.field1014;
        int var7 = (var3 + 1 >> 1) + this.field1014;
        int[][] var8 = this.field1025.field1328[this.field1018];
        int var9 = var8[var4][var6] + var8[var5][var6] + var8[var4][var7] + var8[var5][var7] >> 2;
        int var10 = (this.field1019 << 7) + (var2 << 6);
        int var11 = (this.field1014 << 7) + (var3 << 6);
        if (this.field1020 != null) {
            int var12 = client.field516 - this.field1023;
            if (var12 > 100 && this.field1020.field2295 > 0) {
                var12 = 100;
            }
            if (this.field1020.method3748()) {
                int var13 = this.field1020.method3757();
                this.field1022 += var12;
                var12 = 0;
                if (this.field1022 >= var13) {
                    this.field1022 = var13 - this.field1020.field2295;
                    if (this.field1022 < 0 || this.field1022 > var13) {
                        this.field1020 = null;
                    }
                }
                if (this.field1020 != null) {
                    client.method4211(this.field1020, this.field1022, var10, var11, false);
                }
            } else {
                label49: {
                    do {
                        while (true) {
                            if (var12 <= this.field1020.field2285[this.field1022]) {
                                break label49;
                            }
                            var12 -= this.field1020.field2285[this.field1022];
                            this.field1022++;
                            if (this.field1022 >= this.field1020.field2291.length) {
                                this.field1022 -= this.field1020.field2295;
                                break;
                            }
                            client.method3386(this.field1020, this.field1022, var10, var11, false);
                        }
                    } while (this.field1022 >= 0 && this.field1022 < this.field1020.field2291.length);
                    this.field1020 = null;
                }
            }
            this.field1023 = client.field516 - var12;
        }
        return var1.method3615(this.field1016, this.field1017, var8, var10, var9, var11, this.field1020, this.field1022);
    }
}
