package deob;

@ObfuscatedName("cc")
public class class88 extends class130 {

    @ObfuscatedName("cc.f")
    public int field1266;

    @ObfuscatedName("cc.l")
    public int field1262;

    @ObfuscatedName("cc.w")
    public int field1261;

    @ObfuscatedName("cc.s")
    public int field1263;

    @ObfuscatedName("cc.e")
    public int field1264;

    @ObfuscatedName("cc.a")
    public int field1265;

    @ObfuscatedName("cc.c")
    public class276 field1267;

    @ObfuscatedName("cc.p")
    public int field1260;

    @ObfuscatedName("cc.r")
    public int field1268;

    public class88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class130 arg8) {
        this.field1266 = arg0;
        this.field1262 = arg1;
        this.field1261 = arg2;
        this.field1263 = arg3;
        this.field1264 = arg4;
        this.field1265 = arg5;
        if (arg6 != -1) {
            this.field1267 = class276.method3224(arg6);
            this.field1260 = 0;
            this.field1268 = client.field642 - 1;
            if (this.field1267.field3611 == 0 && arg8 != null && arg8 instanceof class88) {
                class88 var10 = (class88) arg8;
                if (this.field1267 == var10.field1267) {
                    this.field1260 = var10.field1260;
                    this.field1268 = var10.field1268;
                    return;
                }
            }
            if (arg7 && this.field1267.field3619 != -1) {
                this.field1260 = (int) (Math.random() * (double) this.field1267.field3625.length);
                this.field1268 -= (int) (Math.random() * (double) this.field1267.field3617[this.field1260]);
            }
        }
    }

    @ObfuscatedName("cc.m(S)Lds;")
    public final class122 method1042() {
        if (this.field1267 != null) {
            int var1 = client.field642 - this.field1268;
            if (var1 > 100 && this.field1267.field3619 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1267.field3617[this.field1260]) {
                            break label47;
                        }
                        var1 -= this.field1267.field3617[this.field1260];
                        this.field1260++;
                    } while (this.field1260 < this.field1267.field3625.length);
                    this.field1260 -= this.field1267.field3619;
                } while (this.field1260 >= 0 && this.field1260 < this.field1267.field3625.length);
                this.field1267 = null;
            }
            this.field1268 = client.field642 - var1;
        }
        class271 var2 = class271.method1776(this.field1266);
        if (var2.field3488 != null) {
            var2 = var2.method4721();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1261 == 1 || this.field1261 == 3) {
            var3 = var2.field3492;
            var4 = var2.field3449;
        } else {
            var3 = var2.field3449;
            var4 = var2.field3492;
        }
        int var5 = (var3 >> 1) + this.field1264;
        int var6 = (var3 + 1 >> 1) + this.field1264;
        int var7 = (var4 >> 1) + this.field1265;
        int var8 = (var4 + 1 >> 1) + this.field1265;
        int[][] var9 = class51.field492[this.field1263];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1264 << 7) + (var3 << 6);
        int var12 = (this.field1265 << 7) + (var4 << 6);
        return var2.method4723(this.field1262, this.field1261, var9, var11, var10, var12, this.field1267, this.field1260);
    }
}
