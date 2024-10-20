package deob;

@ObfuscatedName("ax")
public class class50 {

    @ObfuscatedName("ax.e")
    public class68[] field376 = new class68[10];

    @ObfuscatedName("ax.v")
    public int field378;

    @ObfuscatedName("ax.y")
    public int field379;

    @ObfuscatedName("ax.f(Ljp;II)Lax;")
    public static class50 method633(class276 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4504(arg1, arg2);
        return var3 == null ? null : new class50(new class384(var3));
    }

    public class50(class384 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method5902();
            if (var3 != 0) {
                arg0.field4161--;
                this.field376[var2] = new class68();
                this.field376[var2].method967(arg0);
            }
        }
        this.field378 = arg0.method5899();
        this.field379 = arg0.method5899();
    }

    @ObfuscatedName("ax.e()Lar;")
    public class51 method639() {
        byte[] var1 = this.method635();
        return new class51(22050, var1, this.field378 * 22050 / 1000, this.field379 * 22050 / 1000);
    }

    @ObfuscatedName("ax.v()I")
    public final int method637() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field376[var2] != null && this.field376[var2].field556 / 20 < var1) {
                var1 = this.field376[var2].field556 / 20;
            }
        }
        if (this.field378 < this.field379 && this.field378 / 20 < var1) {
            var1 = this.field378 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field376[var3] != null) {
                this.field376[var3].field556 -= var1 * 20;
            }
        }
        if (this.field378 < this.field379) {
            this.field378 -= var1 * 20;
            this.field379 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("ax.y()[B")
    public final byte[] method635() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field376[var2] != null && this.field376[var2].field556 + this.field376[var2].field546 > var1) {
                var1 = this.field376[var2].field556 + this.field376[var2].field546;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field376[var5] != null) {
                int var6 = this.field376[var5].field546 * 22050 / 1000;
                int var7 = this.field376[var5].field556 * 22050 / 1000;
                int[] var8 = this.field376[var5].method964(var6, this.field376[var5].field546);
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = (var8[var9] >> 8) + var4[var7 + var9];
                    if ((var10 + 128 & 0xFFFFFF00) != 0) {
                        var10 = var10 >> 31 ^ 0x7F;
                    }
                    var4[var7 + var9] = (byte) var10;
                }
            }
        }
        return var4;
    }
}
