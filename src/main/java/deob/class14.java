package deob;

@ObfuscatedName("u")
public class class14 extends class94 {

    @ObfuscatedName("u.x")
    public int field204;

    @ObfuscatedName("u.p")
    public int field197;

    @ObfuscatedName("u.k")
    public int field198;

    @ObfuscatedName("u.a")
    public int field199;

    @ObfuscatedName("u.q")
    public int field202;

    @ObfuscatedName("u.j")
    public int field201;

    @ObfuscatedName("u.v")
    public class34 field206;

    @ObfuscatedName("u.w")
    public int field196;

    @ObfuscatedName("u.l")
    public int field200;

    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class94 arg8) {
        this.field204 = arg0;
        this.field197 = arg1;
        this.field198 = arg2;
        this.field199 = arg3;
        this.field202 = arg4;
        this.field201 = arg5;
        if (arg6 != -1) {
            this.field206 = class34.method516(arg6);
            this.field196 = 0;
            this.field200 = client.field668 - 1;
            if (this.field206.field863 == 0 && arg8 != null && arg8 instanceof class14) {
                class14 var10 = (class14) arg8;
                if (this.field206 == var10.field206) {
                    this.field196 = var10.field196;
                    this.field200 = var10.field200;
                    return;
                }
            }
            if (arg7 && this.field206.field864 != -1) {
                this.field196 = (int) (Math.random() * (double) this.field206.field851.length);
                this.field200 -= (int) (Math.random() * (double) this.field206.field853[this.field196]);
            }
        }
    }

    @ObfuscatedName("u.p(I)Ldi;")
    public final class112 method10() {
        if (this.field206 != null) {
            int var1 = client.field668 - this.field200;
            if (var1 > 100 && this.field206.field864 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field206.field853[this.field196]) {
                            break label47;
                        }
                        var1 -= this.field206.field853[this.field196];
                        this.field196++;
                    } while (this.field196 < this.field206.field851.length);
                    this.field196 -= this.field206.field864;
                } while (this.field196 >= 0 && this.field196 < this.field206.field851.length);
                this.field206 = null;
            }
            this.field200 = client.field668 - var1;
        }
        class32 var2 = class32.method1131(this.field204);
        if (var2.field823 != null) {
            var2 = var2.method623();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field198 == 1 || this.field198 == 3) {
            var3 = var2.field807;
            var4 = var2.field796;
        } else {
            var3 = var2.field796;
            var4 = var2.field807;
        }
        int var5 = (var3 >> 1) + this.field202;
        int var6 = (var3 + 1 >> 1) + this.field202;
        int var7 = (var4 >> 1) + this.field201;
        int var8 = (var4 + 1 >> 1) + this.field201;
        int[][] var9 = class9.field130[this.field199];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field202 << 7) + (var3 << 6);
        int var12 = (this.field201 << 7) + (var4 << 6);
        return var2.method643(this.field197, this.field198, var9, var11, var10, var12, this.field206, this.field196);
    }
}
