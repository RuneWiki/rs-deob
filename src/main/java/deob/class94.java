package deob;

@ObfuscatedName("cl")
public class class94 extends class136 {

    @ObfuscatedName("cl.s")
    public int field1272;

    @ObfuscatedName("cl.j")
    public int field1265;

    @ObfuscatedName("cl.i")
    public int field1271;

    @ObfuscatedName("cl.k")
    public int field1267;

    @ObfuscatedName("cl.u")
    public int field1268;

    @ObfuscatedName("cl.n")
    public int field1277;

    @ObfuscatedName("cl.t")
    public class259 field1270;

    @ObfuscatedName("cl.q")
    public int field1278;

    @ObfuscatedName("cl.x")
    public int field1266;

    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class136 arg8) {
        this.field1272 = arg0;
        this.field1265 = arg1;
        this.field1271 = arg2;
        this.field1267 = arg3;
        this.field1268 = arg4;
        this.field1277 = arg5;
        if (arg6 != -1) {
            this.field1270 = Statics.method3725(arg6);
            this.field1278 = 0;
            this.field1266 = client.field635 - 1;
            if (this.field1270.field3493 == 0 && arg8 != null && arg8 instanceof class94) {
                class94 var10 = (class94) arg8;
                if (this.field1270 == var10.field1270) {
                    this.field1278 = var10.field1278;
                    this.field1266 = var10.field1266;
                    return;
                }
            }
            if (arg7 && this.field1270.field3500 != -1) {
                this.field1278 = (int) (Math.random() * (double) this.field1270.field3496.length);
                this.field1266 -= (int) (Math.random() * (double) this.field1270.field3498[this.field1278]);
            }
        }
    }

    @ObfuscatedName("cl.x(I)Ldo;")
    public final class128 method1064() {
        if (this.field1270 != null) {
            int var1 = client.field635 - this.field1266;
            if (var1 > 100 && this.field1270.field3500 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1270.field3498[this.field1278]) {
                            break label47;
                        }
                        var1 -= this.field1270.field3498[this.field1278];
                        this.field1278++;
                    } while (this.field1278 < this.field1270.field3496.length);
                    this.field1278 -= this.field1270.field3500;
                } while (this.field1278 >= 0 && this.field1278 < this.field1270.field3496.length);
                this.field1270 = null;
            }
            this.field1266 = client.field635 - var1;
        }
        class254 var2 = class254.method3676(this.field1272);
        if (var2.field3354 != null) {
            var2 = var2.method4204();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1271 == 1 || this.field1271 == 3) {
            var3 = var2.field3347;
            var4 = var2.field3372;
        } else {
            var3 = var2.field3372;
            var4 = var2.field3347;
        }
        int var5 = (var3 >> 1) + this.field1268;
        int var6 = (var3 + 1 >> 1) + this.field1268;
        int var7 = (var4 >> 1) + this.field1277;
        int var8 = (var4 + 1 >> 1) + this.field1277;
        int[][] var9 = class56.field472[this.field1267];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1268 << 7) + (var3 << 6);
        int var12 = (this.field1277 << 7) + (var4 << 6);
        return var2.method4187(this.field1265, this.field1271, var9, var11, var10, var12, this.field1270, this.field1278);
    }
}
