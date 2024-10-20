package deob;

@ObfuscatedName("e")
public class class14 extends class94 {

    @ObfuscatedName("e.l")
    public int field212;

    @ObfuscatedName("e.b")
    public int field211;

    @ObfuscatedName("e.o")
    public int field204;

    @ObfuscatedName("e.w")
    public int field205;

    @ObfuscatedName("e.r")
    public int field206;

    @ObfuscatedName("e.k")
    public int field207;

    @ObfuscatedName("e.z")
    public class34 field208;

    @ObfuscatedName("e.g")
    public int field209;

    @ObfuscatedName("e.n")
    public int field210;

    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class94 arg8) {
        this.field212 = arg0;
        this.field211 = arg1;
        this.field204 = arg2;
        this.field205 = arg3;
        this.field206 = arg4;
        this.field207 = arg5;
        if (arg6 != -1) {
            this.field208 = class34.method2198(arg6);
            this.field209 = 0;
            this.field210 = client.field723 - 1;
            if (this.field208.field885 == 0 && arg8 != null && arg8 instanceof class14) {
                class14 var10 = (class14) arg8;
                if (this.field208 == var10.field208) {
                    this.field209 = var10.field209;
                    this.field210 = var10.field210;
                    return;
                }
            }
            if (arg7 && this.field208.field876 != -1) {
                this.field209 = (int) (Math.random() * (double) this.field208.field872.length);
                this.field210 -= (int) (Math.random() * (double) this.field208.field877[this.field209]);
            }
        }
    }

    @ObfuscatedName("e.b(I)Ldt;")
    public final class112 method11() {
        if (this.field208 != null) {
            int var1 = client.field723 - this.field210;
            if (var1 > 100 && this.field208.field876 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field208.field877[this.field209]) {
                            break label47;
                        }
                        var1 -= this.field208.field877[this.field209];
                        this.field209++;
                    } while (this.field209 < this.field208.field872.length);
                    this.field209 -= this.field208.field876;
                } while (this.field209 >= 0 && this.field209 < this.field208.field872.length);
                this.field208 = null;
            }
            this.field210 = client.field723 - var1;
        }
        class32 var2 = class32.method217(this.field212);
        if (var2.field845 != null) {
            var2 = var2.method639();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field204 == 1 || this.field204 == 3) {
            var3 = var2.field820;
            var4 = var2.field819;
        } else {
            var3 = var2.field819;
            var4 = var2.field820;
        }
        int var5 = (var3 >> 1) + this.field206;
        int var6 = (var3 + 1 >> 1) + this.field206;
        int var7 = (var4 >> 1) + this.field207;
        int var8 = (var4 + 1 >> 1) + this.field207;
        int[][] var9 = class9.field109[this.field205];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field206 << 7) + (var3 << 6);
        int var12 = (this.field207 << 7) + (var4 << 6);
        return var2.method629(this.field211, this.field204, var9, var11, var10, var12, this.field208, this.field209);
    }
}
