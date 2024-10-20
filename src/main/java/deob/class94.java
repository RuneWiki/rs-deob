package deob;

@ObfuscatedName("cm")
public class class94 extends class136 {

    @ObfuscatedName("cm.a")
    public int field1266;

    @ObfuscatedName("cm.t")
    public int field1264;

    @ObfuscatedName("cm.n")
    public int field1274;

    @ObfuscatedName("cm.q")
    public int field1265;

    @ObfuscatedName("cm.v")
    public int field1268;

    @ObfuscatedName("cm.l")
    public int field1267;

    @ObfuscatedName("cm.c")
    public class259 field1270;

    @ObfuscatedName("cm.o")
    public int field1269;

    @ObfuscatedName("cm.i")
    public int field1272;

    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class136 arg8) {
        this.field1266 = arg0;
        this.field1264 = arg1;
        this.field1274 = arg2;
        this.field1265 = arg3;
        this.field1268 = arg4;
        this.field1267 = arg5;
        if (arg6 != -1) {
            this.field1270 = class259.method3856(arg6);
            this.field1269 = 0;
            this.field1272 = client.field643 - 1;
            if (this.field1270.field3522 == 0 && arg8 != null && arg8 instanceof class94) {
                class94 var10 = (class94) arg8;
                if (this.field1270 == var10.field1270) {
                    this.field1269 = var10.field1269;
                    this.field1272 = var10.field1272;
                    return;
                }
            }
            if (arg7 && this.field1270.field3513 != -1) {
                this.field1269 = (int) (Math.random() * (double) this.field1270.field3521.length);
                this.field1272 -= (int) (Math.random() * (double) this.field1270.field3511[this.field1269]);
            }
        }
    }

    @ObfuscatedName("cm.i(B)Ldv;")
    public final class128 method1159() {
        if (this.field1270 != null) {
            int var1 = client.field643 - this.field1272;
            if (var1 > 100 && this.field1270.field3513 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1270.field3511[this.field1269]) {
                            break label47;
                        }
                        var1 -= this.field1270.field3511[this.field1269];
                        this.field1269++;
                    } while (this.field1269 < this.field1270.field3521.length);
                    this.field1269 -= this.field1270.field3513;
                } while (this.field1269 >= 0 && this.field1269 < this.field1270.field3521.length);
                this.field1270 = null;
            }
            this.field1272 = client.field643 - var1;
        }
        class254 var2 = class254.method3848(this.field1266);
        if (var2.field3354 != null) {
            var2 = var2.method4333();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1274 == 1 || this.field1274 == 3) {
            var3 = var2.field3378;
            var4 = var2.field3342;
        } else {
            var3 = var2.field3342;
            var4 = var2.field3378;
        }
        int var5 = (var3 >> 1) + this.field1268;
        int var6 = (var3 + 1 >> 1) + this.field1268;
        int var7 = (var4 >> 1) + this.field1267;
        int var8 = (var4 + 1 >> 1) + this.field1267;
        int[][] var9 = class56.field482[this.field1265];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1268 << 7) + (var3 << 6);
        int var12 = (this.field1267 << 7) + (var4 << 6);
        return var2.method4300(this.field1264, this.field1274, var9, var11, var10, var12, this.field1270, this.field1269);
    }
}
