package deob;

@ObfuscatedName("v")
public class class14 extends class94 {

    @ObfuscatedName("v.f")
    public int field212;

    @ObfuscatedName("v.t")
    public int field207;

    @ObfuscatedName("v.n")
    public int field208;

    @ObfuscatedName("v.e")
    public int field213;

    @ObfuscatedName("v.l")
    public int field210;

    @ObfuscatedName("v.d")
    public int field211;

    @ObfuscatedName("v.r")
    public class34 field206;

    @ObfuscatedName("v.k")
    public int field215;

    @ObfuscatedName("v.u")
    public int field214;

    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class94 arg8) {
        this.field212 = arg0;
        this.field207 = arg1;
        this.field208 = arg2;
        this.field213 = arg3;
        this.field210 = arg4;
        this.field211 = arg5;
        if (arg6 != -1) {
            this.field206 = class34.method572(arg6);
            this.field215 = 0;
            this.field214 = client.field484 - 1;
            if (this.field206.field893 == 0 && arg8 != null && arg8 instanceof class14) {
                class14 var10 = (class14) arg8;
                if (this.field206 == var10.field206) {
                    this.field215 = var10.field215;
                    this.field214 = var10.field214;
                    return;
                }
            }
            if (arg7 && this.field206.field877 != -1) {
                this.field215 = (int) (Math.random() * (double) this.field206.field890.length);
                this.field214 -= (int) (Math.random() * (double) this.field206.field887[this.field215]);
            }
        }
    }

    @ObfuscatedName("v.t(I)Ldp;")
    public final class112 method13() {
        if (this.field206 != null) {
            int var1 = client.field484 - this.field214;
            if (var1 > 100 && this.field206.field877 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field206.field887[this.field215]) {
                            break label47;
                        }
                        var1 -= this.field206.field887[this.field215];
                        this.field215++;
                    } while (this.field215 < this.field206.field890.length);
                    this.field215 -= this.field206.field877;
                } while (this.field215 >= 0 && this.field215 < this.field206.field890.length);
                this.field206 = null;
            }
            this.field214 = client.field484 - var1;
        }
        class32 var2 = class32.method874(this.field212);
        if (var2.field827 != null) {
            var2 = var2.method638();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field208 == 1 || this.field208 == 3) {
            var3 = var2.field818;
            var4 = var2.field812;
        } else {
            var3 = var2.field812;
            var4 = var2.field818;
        }
        int var5 = (var3 >> 1) + this.field210;
        int var6 = (var3 + 1 >> 1) + this.field210;
        int var7 = (var4 >> 1) + this.field211;
        int var8 = (var4 + 1 >> 1) + this.field211;
        int[][] var9 = class9.field129[this.field213];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field210 << 7) + (var3 << 6);
        int var12 = (this.field211 << 7) + (var4 << 6);
        return var2.method636(this.field207, this.field208, var9, var11, var10, var12, this.field206, this.field215);
    }
}
