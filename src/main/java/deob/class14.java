package deob;

@ObfuscatedName("o")
public class class14 extends class94 {

    @ObfuscatedName("o.a")
    public int field202;

    @ObfuscatedName("o.r")
    public int field199;

    @ObfuscatedName("o.u")
    public int field201;

    @ObfuscatedName("o.t")
    public int field209;

    @ObfuscatedName("o.k")
    public int field203;

    @ObfuscatedName("o.x")
    public int field204;

    @ObfuscatedName("o.v")
    public class34 field205;

    @ObfuscatedName("o.g")
    public int field206;

    @ObfuscatedName("o.n")
    public int field207;

    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class94 arg8) {
        this.field202 = arg0;
        this.field199 = arg1;
        this.field201 = arg2;
        this.field209 = arg3;
        this.field203 = arg4;
        this.field204 = arg5;
        if (arg6 != -1) {
            this.field205 = class34.method30(arg6);
            this.field206 = 0;
            this.field207 = client.field465 - 1;
            if (this.field205.field868 == 0 && arg8 != null && arg8 instanceof class14) {
                class14 var10 = (class14) arg8;
                if (this.field205 == var10.field205) {
                    this.field206 = var10.field206;
                    this.field207 = var10.field207;
                    return;
                }
            }
            if (arg7 && this.field205.field867 != -1) {
                this.field206 = (int) (Math.random() * (double) this.field205.field863.length);
                this.field207 -= (int) (Math.random() * (double) this.field205.field865[this.field206]);
            }
        }
    }

    @ObfuscatedName("o.r(I)Ldw;")
    public final class112 method18() {
        if (this.field205 != null) {
            int var1 = client.field465 - this.field207;
            if (var1 > 100 && this.field205.field867 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field205.field865[this.field206]) {
                            break label47;
                        }
                        var1 -= this.field205.field865[this.field206];
                        this.field206++;
                    } while (this.field206 < this.field205.field863.length);
                    this.field206 -= this.field205.field867;
                } while (this.field206 >= 0 && this.field206 < this.field205.field863.length);
                this.field205 = null;
            }
            this.field207 = client.field465 - var1;
        }
        class32 var2 = class32.method582(this.field202);
        if (var2.field828 != null) {
            var2 = var2.method593();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field201 == 1 || this.field201 == 3) {
            var3 = var2.field807;
            var4 = var2.field809;
        } else {
            var3 = var2.field809;
            var4 = var2.field807;
        }
        int var5 = (var3 >> 1) + this.field203;
        int var6 = (var3 + 1 >> 1) + this.field203;
        int var7 = (var4 >> 1) + this.field204;
        int var8 = (var4 + 1 >> 1) + this.field204;
        int[][] var9 = class9.field127[this.field209];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field203 << 7) + (var3 << 6);
        int var12 = (this.field204 << 7) + (var4 << 6);
        return var2.method583(this.field199, this.field201, var9, var11, var10, var12, this.field205, this.field206);
    }
}
