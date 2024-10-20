package deob;

@ObfuscatedName("c")
public class class22 {

    @ObfuscatedName("c.t")
    public int field304;

    @ObfuscatedName("c.q")
    public class19[] field302 = new class19[10];

    @ObfuscatedName("c.h")
    public int field305;

    @ObfuscatedName("c.t(Lcy;II)Lc;")
    public static class22 method289(class86 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1015(arg1, arg2);
        return var3 == null ? null : new class22(new class135(var3));
    }

    public class22(class135 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1571();
            if (var3 != 0) {
                arg0.field1722--;
                this.field302[var2] = new class19();
                this.field302[var2].method258(arg0);
            }
        }
        this.field304 = arg0.method1725();
        this.field305 = arg0.method1725();
    }

    @ObfuscatedName("c.n()Lee;")
    public class145 method285() {
        byte[] var1 = this.method287();
        return new class145(22050, var1, this.field304 * 22050 / 1000, this.field305 * 22050 / 1000);
    }

    @ObfuscatedName("c.q()I")
    public final int method284() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field302[var2] != null && this.field302[var2].field277 / 20 < var1) {
                var1 = this.field302[var2].field277 / 20;
            }
        }
        if (this.field304 < this.field305 && this.field304 / 20 < var1) {
            var1 = this.field304 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field302[var3] != null) {
                this.field302[var3].field277 -= var1 * 20;
            }
        }
        if (this.field304 < this.field305) {
            this.field304 -= var1 * 20;
            this.field305 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("c.h()[B")
    public final byte[] method287() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field302[var2] != null && this.field302[var2].field279 + this.field302[var2].field277 > var1) {
                var1 = this.field302[var2].field279 + this.field302[var2].field277;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field302[var5] != null) {
                int var6 = this.field302[var5].field279 * 22050 / 1000;
                int var7 = this.field302[var5].field277 * 22050 / 1000;
                int[] var8 = this.field302[var5].method256(var6, this.field302[var5].field279);
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
