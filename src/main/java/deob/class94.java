package deob;

@ObfuscatedName("cg")
public class class94 extends class136 {

    @ObfuscatedName("cg.f")
    public int field1281;

    @ObfuscatedName("cg.i")
    public int field1274;

    @ObfuscatedName("cg.y")
    public int field1275;

    @ObfuscatedName("cg.w")
    public int field1283;

    @ObfuscatedName("cg.p")
    public int field1277;

    @ObfuscatedName("cg.b")
    public int field1278;

    @ObfuscatedName("cg.e")
    public class259 field1279;

    @ObfuscatedName("cg.x")
    public int field1280;

    @ObfuscatedName("cg.a")
    public int field1273;

    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class136 arg8) {
        this.field1281 = arg0;
        this.field1274 = arg1;
        this.field1275 = arg2;
        this.field1283 = arg3;
        this.field1277 = arg4;
        this.field1278 = arg5;
        if (arg6 != -1) {
            this.field1279 = class259.method209(arg6);
            this.field1280 = 0;
            this.field1273 = client.field641 - 1;
            if (this.field1279.field3496 == 0 && arg8 != null && arg8 instanceof class94) {
                class94 var10 = (class94) arg8;
                if (this.field1279 == var10.field1279) {
                    this.field1280 = var10.field1280;
                    this.field1273 = var10.field1273;
                    return;
                }
            }
            if (arg7 && this.field1279.field3490 != -1) {
                this.field1280 = (int) (Math.random() * (double) this.field1279.field3483.length);
                this.field1273 -= (int) (Math.random() * (double) this.field1279.field3485[this.field1280]);
            }
        }
    }

    @ObfuscatedName("cg.a(I)Ldw;")
    public final class128 method1101() {
        if (this.field1279 != null) {
            int var1 = client.field641 - this.field1273;
            if (var1 > 100 && this.field1279.field3490 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1279.field3485[this.field1280]) {
                            break label47;
                        }
                        var1 -= this.field1279.field3485[this.field1280];
                        this.field1280++;
                    } while (this.field1280 < this.field1279.field3483.length);
                    this.field1280 -= this.field1279.field3490;
                } while (this.field1280 >= 0 && this.field1280 < this.field1279.field3483.length);
                this.field1279 = null;
            }
            this.field1273 = client.field641 - var1;
        }
        class254 var2 = class254.method3616(this.field1281);
        if (var2.field3321 != null) {
            var2 = var2.method4241();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1275 == 1 || this.field1275 == 3) {
            var3 = var2.field3331;
            var4 = var2.field3330;
        } else {
            var3 = var2.field3330;
            var4 = var2.field3331;
        }
        int var5 = (var3 >> 1) + this.field1277;
        int var6 = (var3 + 1 >> 1) + this.field1277;
        int var7 = (var4 >> 1) + this.field1278;
        int var8 = (var4 + 1 >> 1) + this.field1278;
        int[][] var9 = class57.field496[this.field1283];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1277 << 7) + (var3 << 6);
        int var12 = (this.field1278 << 7) + (var4 << 6);
        return var2.method4237(this.field1274, this.field1275, var9, var11, var10, var12, this.field1279, this.field1280);
    }
}
