package deob;

@ObfuscatedName("bg")
public class class60 extends class201 {

    @ObfuscatedName("bg.s")
    public int field884;

    @ObfuscatedName("bg.t")
    public int field880;

    @ObfuscatedName("bg.v")
    public int field881;

    @ObfuscatedName("bg.j")
    public int field890;

    @ObfuscatedName("bg.l")
    public int field883;

    @ObfuscatedName("bg.n")
    public int field886;

    @ObfuscatedName("bg.w")
    public class159 field885;

    @ObfuscatedName("bg.f")
    public int field882;

    @ObfuscatedName("bg.o")
    public int field887;

    public class60(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class201 arg8) {
        this.field884 = arg0;
        this.field880 = arg1;
        this.field881 = arg2;
        this.field890 = arg3;
        this.field883 = arg4;
        this.field886 = arg5;
        if (arg6 != -1) {
            this.field885 = class159.method1334(arg6);
            this.field882 = 0;
            this.field887 = client.field452 - 1;
            if (this.field885.field1876 == 0 && arg8 != null && arg8 instanceof class60) {
                class60 var10 = (class60) arg8;
                if (this.field885 == var10.field885) {
                    this.field882 = var10.field882;
                    this.field887 = var10.field887;
                    return;
                }
            }
            if (arg7 && this.field885.field1862 != -1) {
                this.field882 = (int) (Math.random() * (double) this.field885.field1863.length);
                this.field887 -= (int) (Math.random() * (double) this.field885.field1865[this.field882]);
            }
        }
    }

    @ObfuscatedName("bg.t(I)Lgl;")
    public final class207 method1550() {
        if (this.field885 != null) {
            int var1 = client.field452 - this.field887;
            if (var1 > 100 && this.field885.field1862 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field885.field1865[this.field882]) {
                            break label47;
                        }
                        var1 -= this.field885.field1865[this.field882];
                        this.field882++;
                    } while (this.field882 < this.field885.field1863.length);
                    this.field882 -= this.field885.field1862;
                } while (this.field882 >= 0 && this.field882 < this.field885.field1863.length);
                this.field885 = null;
            }
            this.field887 = client.field452 - var1;
        }
        class156 var2 = class156.method2267(this.field884);
        if (var2.field1762 != null) {
            var2 = var2.method2681();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field881 == 1 || this.field881 == 3) {
            var3 = var2.field1751;
            var4 = var2.field1750;
        } else {
            var3 = var2.field1750;
            var4 = var2.field1751;
        }
        int var5 = (var3 >> 1) + this.field883;
        int var6 = (var3 + 1 >> 1) + this.field883;
        int var7 = (var4 >> 1) + this.field886;
        int var8 = (var4 + 1 >> 1) + this.field886;
        int[][] var9 = class62.field911[this.field890];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field883 << 7) + (var3 << 6);
        int var12 = (this.field886 << 7) + (var4 << 6);
        return var2.method2678(this.field880, this.field881, var9, var11, var10, var12, this.field885, this.field882);
    }
}
