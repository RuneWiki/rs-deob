package deob;

@ObfuscatedName("dk")
public class class83 extends class248 {

    @ObfuscatedName("dk.ac")
    public final class104 field1040;

    @ObfuscatedName("dk.ae")
    public final int field1041;

    @ObfuscatedName("dk.ag")
    public final int field1044;

    @ObfuscatedName("dk.am")
    public final int field1043;

    @ObfuscatedName("dk.ax")
    public final int field1046;

    @ObfuscatedName("dk.aq")
    public final int field1045;

    @ObfuscatedName("dk.af")
    public final int field1047;

    @ObfuscatedName("dk.at")
    public class213 field1042;

    @ObfuscatedName("dk.au")
    public int field1048;

    @ObfuscatedName("dk.ar")
    public int field1049;

    public class83(class104 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class248 arg9) {
        this.field1040 = arg0;
        this.field1041 = arg1;
        this.field1044 = arg2;
        this.field1043 = arg3;
        this.field1046 = arg4;
        this.field1045 = arg5;
        this.field1047 = arg6;
        if (arg7 != -1) {
            this.field1042 = class213.method2555(arg7);
            this.field1048 = 0;
            this.field1049 = client.field609 - 1;
            if (this.field1042.field2329 == 0 && arg9 instanceof class83) {
                class83 var11 = (class83) arg9;
                if (this.field1042 == var11.field1042) {
                    this.field1048 = var11.field1048;
                    this.field1049 = var11.field1049;
                    return;
                }
            }
            if (arg8 && this.field1042.field2318 != -1) {
                if (this.field1042.method3954()) {
                    this.field1048 = (int) (Math.random() * (double) this.field1042.method3999());
                } else {
                    this.field1048 = (int) (Math.random() * (double) this.field1042.field2314.length);
                    this.field1049 -= (int) (Math.random() * (double) this.field1042.field2316[this.field1048]);
                }
            }
        }
    }

    @ObfuscatedName("dk.ad(B)Ljm;")
    public final class256 method2182() {
        class210 var1 = class210.method5152(this.field1041);
        if (var1.field2212 != null) {
            var1 = var1.method3800();
        }
        if (var1 == null) {
            return null;
        }
        int var2;
        int var3;
        if (this.field1043 == 1 || this.field1043 == 3) {
            var2 = var1.field2187;
            var3 = var1.field2189;
        } else {
            var2 = var1.field2189;
            var3 = var1.field2187;
        }
        int var4 = (var2 >> 1) + this.field1045;
        int var5 = (var2 + 1 >> 1) + this.field1045;
        int var6 = (var3 >> 1) + this.field1047;
        int var7 = (var3 + 1 >> 1) + this.field1047;
        int[][] var8 = this.field1040.field1371[this.field1046];
        int var9 = var8[var4][var6] + var8[var5][var6] + var8[var4][var7] + var8[var5][var7] >> 2;
        int var10 = (this.field1045 << 7) + (var2 << 6);
        int var11 = (this.field1047 << 7) + (var3 << 6);
        if (this.field1042 != null) {
            int var12 = client.field609 - this.field1049;
            if (var12 > 100 && this.field1042.field2318 > 0) {
                var12 = 100;
            }
            if (this.field1042.method3954()) {
                int var13 = this.field1042.method3999();
                this.field1048 += var12;
                var12 = 0;
                if (this.field1048 >= var13) {
                    this.field1048 = var13 - this.field1042.field2318;
                    if (this.field1048 < 0 || this.field1048 > var13) {
                        this.field1042 = null;
                    }
                }
                if (this.field1042 != null) {
                    client.method311(this.field1042, this.field1048, var10, var11, false);
                }
            } else {
                label49: {
                    do {
                        while (true) {
                            if (var12 <= this.field1042.field2316[this.field1048]) {
                                break label49;
                            }
                            var12 -= this.field1042.field2316[this.field1048];
                            this.field1048++;
                            if (this.field1048 >= this.field1042.field2314.length) {
                                this.field1048 -= this.field1042.field2318;
                                break;
                            }
                            client.method2422(this.field1042, this.field1048, var10, var11, false);
                        }
                    } while (this.field1048 >= 0 && this.field1048 < this.field1042.field2314.length);
                    this.field1042 = null;
                }
            }
            this.field1049 = client.field609 - var12;
        }
        return var1.method3834(this.field1044, this.field1043, var8, var10, var9, var11, this.field1042, this.field1048);
    }
}
