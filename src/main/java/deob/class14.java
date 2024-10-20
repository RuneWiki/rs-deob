package deob;

@ObfuscatedName("z")
public class class14 extends class94 {

    @ObfuscatedName("z.p")
    public int field214;

    @ObfuscatedName("z.e")
    public int field207;

    @ObfuscatedName("z.a")
    public int field208;

    @ObfuscatedName("z.h")
    public int field209;

    @ObfuscatedName("z.y")
    public int field210;

    @ObfuscatedName("z.j")
    public int field211;

    @ObfuscatedName("z.l")
    public class34 field212;

    @ObfuscatedName("z.f")
    public int field213;

    @ObfuscatedName("z.n")
    public int field219;

    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class94 arg8) {
        this.field214 = arg0;
        this.field207 = arg1;
        this.field208 = arg2;
        this.field209 = arg3;
        this.field210 = arg4;
        this.field211 = arg5;
        if (arg6 != -1) {
            this.field212 = Statics.method1204(arg6);
            this.field213 = 0;
            this.field219 = client.field476 - 1;
            if (this.field212.field889 == 0 && arg8 != null && arg8 instanceof class14) {
                class14 var10 = (class14) arg8;
                if (this.field212 == var10.field212) {
                    this.field213 = var10.field213;
                    this.field219 = var10.field219;
                    return;
                }
            }
            if (arg7 && this.field212.field876 != -1) {
                this.field213 = (int) (Math.random() * (double) this.field212.field888.length);
                this.field219 -= (int) (Math.random() * (double) this.field212.field878[this.field213]);
            }
        }
    }

    @ObfuscatedName("z.e(I)Lds;")
    public final class112 method19() {
        if (this.field212 != null) {
            int var1 = client.field476 - this.field219;
            if (var1 > 100 && this.field212.field876 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field212.field878[this.field213]) {
                            break label47;
                        }
                        var1 -= this.field212.field878[this.field213];
                        this.field213++;
                    } while (this.field213 < this.field212.field888.length);
                    this.field213 -= this.field212.field876;
                } while (this.field213 >= 0 && this.field213 < this.field212.field888.length);
                this.field212 = null;
            }
            this.field219 = client.field476 - var1;
        }
        class32 var2 = class32.method2811(this.field214);
        if (var2.field846 != null) {
            var2 = var2.method660();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field208 == 1 || this.field208 == 3) {
            var3 = var2.field807;
            var4 = var2.field822;
        } else {
            var3 = var2.field822;
            var4 = var2.field807;
        }
        int var5 = (var3 >> 1) + this.field210;
        int var6 = (var3 + 1 >> 1) + this.field210;
        int var7 = (var4 >> 1) + this.field211;
        int var8 = (var4 + 1 >> 1) + this.field211;
        int[][] var9 = class9.field119[this.field209];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field210 << 7) + (var3 << 6);
        int var12 = (this.field211 << 7) + (var4 << 6);
        return var2.method692(this.field207, this.field208, var9, var11, var10, var12, this.field212, this.field213);
    }
}
