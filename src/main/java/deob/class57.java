package deob;

@ObfuscatedName("bd")
public class class57 {

    @ObfuscatedName("bd.i")
    public class54[] field1201 = new class54[10];

    @ObfuscatedName("bd.o")
    public int field1200;

    @ObfuscatedName("bd.n")
    public int field1202;

    @ObfuscatedName("bd.p(Lep;II)Lbd;")
    public static class57 method1279(class152 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3049(arg1, arg2);
        return var3 == null ? null : new class57(new class127(var3));
    }

    public class57(class127 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2659();
            if (var3 != 0) {
                arg0.field2038--;
                this.field1201[var2] = new class54();
                this.field1201[var2].method1254(arg0);
            }
        }
        this.field1200 = arg0.method2652();
        this.field1202 = arg0.method2652();
    }

    @ObfuscatedName("bd.i()Lbj;")
    public class63 method1280() {
        byte[] var1 = this.method1282();
        return new class63(22050, var1, this.field1200 * 22050 / 1000, this.field1202 * 22050 / 1000);
    }

    @ObfuscatedName("bd.o()I")
    public final int method1288() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1201[var2] != null && this.field1201[var2].field1166 / 20 < var1) {
                var1 = this.field1201[var2].field1166 / 20;
            }
        }
        if (this.field1200 < this.field1202 && this.field1200 / 20 < var1) {
            var1 = this.field1200 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1201[var3] != null) {
                this.field1201[var3].field1166 -= var1 * 20;
            }
        }
        if (this.field1200 < this.field1202) {
            this.field1200 -= var1 * 20;
            this.field1202 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bd.n()[B")
    public final byte[] method1282() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1201[var2] != null && this.field1201[var2].field1166 + this.field1201[var2].field1161 > var1) {
                var1 = this.field1201[var2].field1166 + this.field1201[var2].field1161;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1201[var5] != null) {
                int var6 = this.field1201[var5].field1161 * 22050 / 1000;
                int var7 = this.field1201[var5].field1166 * 22050 / 1000;
                int[] var8 = this.field1201[var5].method1252(var6, this.field1201[var5].field1161);
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
