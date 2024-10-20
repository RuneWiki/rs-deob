package deob;

@ObfuscatedName("ch")
public class class86 extends class128 {

    @ObfuscatedName("ch.z")
    public int field1208;

    @ObfuscatedName("ch.w")
    public int field1205;

    @ObfuscatedName("ch.s")
    public int field1201;

    @ObfuscatedName("ch.l")
    public int field1207;

    @ObfuscatedName("ch.u")
    public int field1199;

    @ObfuscatedName("ch.q")
    public int field1204;

    @ObfuscatedName("ch.k")
    public class274 field1203;

    @ObfuscatedName("ch.i")
    public int field1206;

    @ObfuscatedName("ch.x")
    public int field1200;

    public class86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class128 arg8) {
        this.field1208 = arg0;
        this.field1205 = arg1;
        this.field1201 = arg2;
        this.field1207 = arg3;
        this.field1199 = arg4;
        this.field1204 = arg5;
        if (arg6 != -1) {
            this.field1203 = class274.method26(arg6);
            this.field1206 = 0;
            this.field1200 = client.field592 - 1;
            if (this.field1203.field3554 == 0 && arg8 != null && arg8 instanceof class86) {
                class86 var10 = (class86) arg8;
                if (this.field1203 == var10.field1203) {
                    this.field1206 = var10.field1206;
                    this.field1200 = var10.field1200;
                    return;
                }
            }
            if (arg7 && this.field1203.field3545 != -1) {
                this.field1206 = (int) (Math.random() * (double) this.field1203.field3541.length);
                this.field1200 -= (int) (Math.random() * (double) this.field1203.field3542[this.field1206]);
            }
        }
    }

    @ObfuscatedName("ch.e(I)Ldc;")
    public final class120 method1010() {
        if (this.field1203 != null) {
            int var1 = client.field592 - this.field1200;
            if (var1 > 100 && this.field1203.field3545 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1203.field3542[this.field1206]) {
                            break label47;
                        }
                        var1 -= this.field1203.field3542[this.field1206];
                        this.field1206++;
                    } while (this.field1206 < this.field1203.field3541.length);
                    this.field1206 -= this.field1203.field3545;
                } while (this.field1206 >= 0 && this.field1206 < this.field1203.field3541.length);
                this.field1203 = null;
            }
            this.field1200 = client.field592 - var1;
        }
        class269 var2 = class269.method2323(this.field1208);
        if (var2.field3411 != null) {
            var2 = var2.method4665();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1201 == 1 || this.field1201 == 3) {
            var3 = var2.field3386;
            var4 = var2.field3385;
        } else {
            var3 = var2.field3385;
            var4 = var2.field3386;
        }
        int var5 = (var3 >> 1) + this.field1199;
        int var6 = (var3 + 1 >> 1) + this.field1199;
        int var7 = (var4 >> 1) + this.field1204;
        int var8 = (var4 + 1 >> 1) + this.field1204;
        int[][] var9 = class51.field460[this.field1207];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1199 << 7) + (var3 << 6);
        int var12 = (this.field1204 << 7) + (var4 << 6);
        return var2.method4641(this.field1205, this.field1201, var9, var11, var10, var12, this.field1203, this.field1206);
    }
}
