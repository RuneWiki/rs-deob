package deob;

@ObfuscatedName("q")
public class class14 extends class94 {

    @ObfuscatedName("q.p")
    public int field211;

    @ObfuscatedName("q.i")
    public int field204;

    @ObfuscatedName("q.o")
    public int field205;

    @ObfuscatedName("q.n")
    public int field206;

    @ObfuscatedName("q.l")
    public int field213;

    @ObfuscatedName("q.v")
    public int field208;

    @ObfuscatedName("q.g")
    public class34 field203;

    @ObfuscatedName("q.x")
    public int field210;

    @ObfuscatedName("q.c")
    public int field207;

    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class94 arg8) {
        this.field211 = arg0;
        this.field204 = arg1;
        this.field205 = arg2;
        this.field206 = arg3;
        this.field213 = arg4;
        this.field208 = arg5;
        if (arg6 != -1) {
            this.field203 = class34.method160(arg6);
            this.field210 = 0;
            this.field207 = client.field481 - 1;
            if (this.field203.field894 == 0 && arg8 != null && arg8 instanceof class14) {
                class14 var10 = (class14) arg8;
                if (this.field203 == var10.field203) {
                    this.field210 = var10.field210;
                    this.field207 = var10.field207;
                    return;
                }
            }
            if (arg7 && this.field203.field885 != -1) {
                this.field210 = (int) (Math.random() * (double) this.field203.field881.length);
                this.field207 -= (int) (Math.random() * (double) this.field203.field882[this.field210]);
            }
        }
    }

    @ObfuscatedName("q.i(I)Ldj;")
    public final class112 method21() {
        if (this.field203 != null) {
            int var1 = client.field481 - this.field207;
            if (var1 > 100 && this.field203.field885 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field203.field882[this.field210]) {
                            break label47;
                        }
                        var1 -= this.field203.field882[this.field210];
                        this.field210++;
                    } while (this.field210 < this.field203.field881.length);
                    this.field210 -= this.field203.field885;
                } while (this.field210 >= 0 && this.field210 < this.field203.field881.length);
                this.field203 = null;
            }
            this.field207 = client.field481 - var1;
        }
        class32 var2 = class32.method3258(this.field211);
        if (var2.field855 != null) {
            var2 = var2.method677();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field205 == 1 || this.field205 == 3) {
            var3 = var2.field854;
            var4 = var2.field829;
        } else {
            var3 = var2.field829;
            var4 = var2.field854;
        }
        int var5 = (var3 >> 1) + this.field213;
        int var6 = (var3 + 1 >> 1) + this.field213;
        int var7 = (var4 >> 1) + this.field208;
        int var8 = (var4 + 1 >> 1) + this.field208;
        int[][] var9 = class9.field136[this.field206];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field213 << 7) + (var3 << 6);
        int var12 = (this.field208 << 7) + (var4 << 6);
        return var2.method675(this.field204, this.field205, var9, var11, var10, var12, this.field203, this.field210);
    }
}
