package deob;

@ObfuscatedName("fu")
public class class176 extends class166 {

    @ObfuscatedName("fu.r")
    public int field2601;

    @ObfuscatedName("fu.d")
    public int field2594;

    @ObfuscatedName("fu.k")
    public int field2595;

    @ObfuscatedName("fu.u")
    public int field2596;

    @ObfuscatedName("fu.v")
    public int field2593;

    @ObfuscatedName("fu.f")
    public int field2598;

    @ObfuscatedName("fu.s")
    public class156 field2599;

    @ObfuscatedName("fu.j")
    public int field2597;

    @ObfuscatedName("fu.e")
    public int field2600;

    public class176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class166 arg8) {
        this.field2601 = arg0;
        this.field2594 = arg1;
        this.field2595 = arg2;
        this.field2596 = arg3;
        this.field2593 = arg4;
        this.field2598 = arg5;
        if (arg6 != -1) {
            this.field2599 = class156.method482(arg6);
            this.field2597 = 0;
            this.field2600 = client.field1919 - 1;
            if (this.field2599.field2375 == 0 && arg8 != null && arg8 instanceof class176) {
                class176 var10 = (class176) arg8;
                if (this.field2599 == var10.field2599) {
                    this.field2597 = var10.field2597;
                    this.field2600 = var10.field2600;
                    return;
                }
            }
            if (arg7 && this.field2599.field2366 != -1) {
                this.field2597 = (int) (Math.random() * (double) this.field2599.field2362.length);
                this.field2600 -= (int) (Math.random() * (double) this.field2599.field2364[this.field2597]);
            }
        }
    }

    @ObfuscatedName("fu.u(S)Lfb;")
    public final class181 method2641() {
        if (this.field2599 != null) {
            int var1 = client.field1919 - this.field2600;
            if (var1 > 100 && this.field2599.field2366 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field2599.field2364[this.field2597]) {
                            break label47;
                        }
                        var1 -= this.field2599.field2364[this.field2597];
                        this.field2597++;
                    } while (this.field2597 < this.field2599.field2362.length);
                    this.field2597 -= this.field2599.field2366;
                } while (this.field2597 >= 0 && this.field2597 < this.field2599.field2362.length);
                this.field2599 = null;
            }
            this.field2600 = client.field1919 - var1;
        }
        class154 var2 = class154.method886(this.field2601);
        if (var2.field2301 != null) {
            var2 = var2.method2365();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field2595 == 1 || this.field2595 == 3) {
            var3 = var2.field2316;
            var4 = var2.field2315;
        } else {
            var3 = var2.field2315;
            var4 = var2.field2316;
        }
        int var5 = (var3 >> 1) + this.field2593;
        int var6 = (var3 + 1 >> 1) + this.field2593;
        int var7 = (var4 >> 1) + this.field2598;
        int var8 = (var4 + 1 >> 1) + this.field2598;
        int[][] var9 = class3.field23[this.field2596];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field2593 << 7) + (var3 << 6);
        int var12 = (this.field2598 << 7) + (var4 << 6);
        return var2.method2371(this.field2594, this.field2595, var9, var11, var10, var12, this.field2599, this.field2597);
    }
}
