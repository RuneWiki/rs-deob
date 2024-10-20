package deob;

@ObfuscatedName("ce")
public class class86 extends class128 {

    @ObfuscatedName("ce.w")
    public int field1225;

    @ObfuscatedName("ce.m")
    public int field1222;

    @ObfuscatedName("ce.q")
    public int field1223;

    @ObfuscatedName("ce.b")
    public int field1230;

    @ObfuscatedName("ce.f")
    public int field1227;

    @ObfuscatedName("ce.n")
    public int field1226;

    @ObfuscatedName("ce.h")
    public class274 field1234;

    @ObfuscatedName("ce.x")
    public int field1228;

    @ObfuscatedName("ce.j")
    public int field1224;

    public class86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class128 arg8) {
        this.field1225 = arg0;
        this.field1222 = arg1;
        this.field1223 = arg2;
        this.field1230 = arg3;
        this.field1227 = arg4;
        this.field1226 = arg5;
        if (arg6 != -1) {
            this.field1234 = class274.method2918(arg6);
            this.field1228 = 0;
            this.field1224 = client.field680 - 1;
            if (this.field1234.field3567 == 0 && arg8 != null && arg8 instanceof class86) {
                class86 var10 = (class86) arg8;
                if (this.field1234 == var10.field1234) {
                    this.field1228 = var10.field1228;
                    this.field1224 = var10.field1224;
                    return;
                }
            }
            if (arg7 && this.field1234.field3558 != -1) {
                this.field1228 = (int) (Math.random() * (double) this.field1234.field3554.length);
                this.field1224 -= (int) (Math.random() * (double) this.field1234.field3563[this.field1228]);
            }
        }
    }

    @ObfuscatedName("ce.s(B)Ldk;")
    public final class120 method1048() {
        if (this.field1234 != null) {
            int var1 = client.field680 - this.field1224;
            if (var1 > 100 && this.field1234.field3558 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field1234.field3563[this.field1228]) {
                            break label47;
                        }
                        var1 -= this.field1234.field3563[this.field1228];
                        this.field1228++;
                    } while (this.field1228 < this.field1234.field3554.length);
                    this.field1228 -= this.field1234.field3558;
                } while (this.field1228 >= 0 && this.field1228 < this.field1234.field3554.length);
                this.field1234 = null;
            }
            this.field1224 = client.field680 - var1;
        }
        class269 var2 = class269.method675(this.field1225);
        if (var2.field3431 != null) {
            var2 = var2.method4689();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field1223 == 1 || this.field1223 == 3) {
            var3 = var2.field3421;
            var4 = var2.field3405;
        } else {
            var3 = var2.field3405;
            var4 = var2.field3421;
        }
        int var5 = (var3 >> 1) + this.field1227;
        int var6 = (var3 + 1 >> 1) + this.field1227;
        int var7 = (var4 >> 1) + this.field1226;
        int var8 = (var4 + 1 >> 1) + this.field1226;
        int[][] var9 = class51.field448[this.field1230];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field1227 << 7) + (var3 << 6);
        int var12 = (this.field1226 << 7) + (var4 << 6);
        return var2.method4705(this.field1222, this.field1223, var9, var11, var10, var12, this.field1234, this.field1228);
    }
}
