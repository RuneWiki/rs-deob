package deob;

@ObfuscatedName("fk")
public class class175 extends class165 {

    @ObfuscatedName("fk.l")
    public int field2596;

    @ObfuscatedName("fk.i")
    public int field2593;

    @ObfuscatedName("fk.e")
    public int field2592;

    @ObfuscatedName("fk.a")
    public int field2595;

    @ObfuscatedName("fk.g")
    public int field2598;

    @ObfuscatedName("fk.w")
    public int field2597;

    @ObfuscatedName("fk.v")
    public class155 field2599;

    @ObfuscatedName("fk.u")
    public int field2594;

    @ObfuscatedName("fk.m")
    public int field2600;

    public class175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class165 arg8) {
        this.field2596 = arg0;
        this.field2593 = arg1;
        this.field2592 = arg2;
        this.field2595 = arg3;
        this.field2598 = arg4;
        this.field2597 = arg5;
        if (arg6 != -1) {
            this.field2599 = class155.method2497(arg6);
            this.field2594 = 0;
            this.field2600 = client.field1917 - 1;
            if (this.field2599.field2372 == 0 && arg8 != null && arg8 instanceof class175) {
                class175 var10 = (class175) arg8;
                if (this.field2599 == var10.field2599) {
                    this.field2594 = var10.field2594;
                    this.field2600 = var10.field2600;
                    return;
                }
            }
            if (arg7 && this.field2599.field2363 != -1) {
                this.field2594 = (int) (Math.random() * (double) this.field2599.field2369.length);
                this.field2600 -= (int) (Math.random() * (double) this.field2599.field2359[this.field2594]);
            }
        }
    }

    @ObfuscatedName("fk.e(I)Lfr;")
    public final class180 method2628() {
        if (this.field2599 != null) {
            int var1 = client.field1917 - this.field2600;
            if (var1 > 100 && this.field2599.field2363 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field2599.field2359[this.field2594]) {
                            break label47;
                        }
                        var1 -= this.field2599.field2359[this.field2594];
                        this.field2594++;
                    } while (this.field2594 < this.field2599.field2369.length);
                    this.field2594 -= this.field2599.field2363;
                } while (this.field2594 >= 0 && this.field2594 < this.field2599.field2369.length);
                this.field2599 = null;
            }
            this.field2600 = client.field1917 - var1;
        }
        class153 var2 = Statics.method1460(this.field2596);
        if (var2.field2301 != null) {
            var2 = var2.method2342();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field2592 == 1 || this.field2592 == 3) {
            var3 = var2.field2312;
            var4 = var2.field2315;
        } else {
            var3 = var2.field2315;
            var4 = var2.field2312;
        }
        int var5 = (var3 >> 1) + this.field2598;
        int var6 = (var3 + 1 >> 1) + this.field2598;
        int var7 = (var4 >> 1) + this.field2597;
        int var8 = (var4 + 1 >> 1) + this.field2597;
        int[][] var9 = class3.field22[this.field2595];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field2598 << 7) + (var3 << 6);
        int var12 = (this.field2597 << 7) + (var4 << 6);
        return var2.method2345(this.field2593, this.field2592, var9, var11, var10, var12, this.field2599, this.field2594);
    }
}
