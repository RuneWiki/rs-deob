package deob;

@ObfuscatedName("cy")
public class class88 extends class130 {

    @ObfuscatedName("cy.g")
    public int field1267;

    @ObfuscatedName("cy.r")
    public int field1264;

    @ObfuscatedName("cy.e")
    public int field1265;

    @ObfuscatedName("cy.q")
    public int field1266;

    @ObfuscatedName("cy.c")
    public int field1263;

    @ObfuscatedName("cy.l")
    public int field1268;

    @ObfuscatedName("cy.b")
    public class276 field1269;

    @ObfuscatedName("cy.w")
    public int field1270;

    @ObfuscatedName("cy.n")
    public int field1271;

    public class88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class130 arg8) {
        this.field1267 = arg0;
        this.field1264 = arg1;
        this.field1265 = arg2;
        this.field1266 = arg3;
        this.field1263 = arg4;
        this.field1268 = arg5;
        if (arg6 != -1) {
            this.field1269 = class276.method493(arg6);
            this.field1270 = 0;
            this.field1271 = client.field656 - 1;
            if (this.field1269.field3616 == 0 && arg8 != null && arg8 instanceof class88) {
                class88 var10 = (class88) arg8;
                if (this.field1269 == var10.field1269) {
                    this.field1270 = var10.field1270;
                    this.field1271 = var10.field1271;
                    return;
                }
            }
            if (arg7 && this.field1269.field3625 != -1) {
                this.field1270 = (int) (Math.random() * (double) this.field1269.field3624.length);
                this.field1271 -= (int) (Math.random() * (double) this.field1269.field3631[this.field1270]);
            }
        }
    }

    @ObfuscatedName("cy.d(I)Ldl;")
    public final class122 method1130() {
        if (this.field1269 != null) {
            int var1 = client.field656 - this.field1271;
            if (var1 > 100 && this.field1269.field3625 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1269.field3631[this.field1270]) {
                            break label47;
                        }
                        var1 -= this.field1269.field3631[this.field1270];
                        this.field1270++;
                    } while (this.field1270 < this.field1269.field3624.length);
                    this.field1270 -= this.field1269.field3625;
                } while (this.field1270 >= 0 && this.field1270 < this.field1269.field3624.length);
                this.field1269 = null;
            }
            this.field1271 = client.field656 - var1;
        }
        class271 var2 = class271.method4591(this.field1267);
        if (var2.field3481 != null) {
            var2 = var2.method4871();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1265 == 1 || this.field1265 == 3) {
            var3 = var2.field3476;
            var4 = var2.field3502;
        } else {
            var3 = var2.field3502;
            var4 = var2.field3476;
        }
        int var5 = (var3 >> 1) + this.field1263;
        int var6 = (var3 + 1 >> 1) + this.field1263;
        int var7 = (var4 >> 1) + this.field1268;
        int var8 = (var4 + 1 >> 1) + this.field1268;
        int[][] var9 = class51.field507[this.field1266];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1263 << 7) + (var3 << 6);
        int var12 = (this.field1268 << 7) + (var4 << 6);
        return var2.method4904(this.field1264, this.field1265, var9, var11, var10, var12, this.field1269, this.field1270);
    }
}
