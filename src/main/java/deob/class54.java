package deob;

@ObfuscatedName("bh")
public class class54 {

    @ObfuscatedName("bh.e")
    public class71[] field986 = new class71[10];

    @ObfuscatedName("bh.f")
    public int field987;

    @ObfuscatedName("bh.k")
    public int field988;

    @ObfuscatedName("bh.i(Lgq;II)Lbh;")
    public static class54 method933(class183 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3014(arg1, arg2);
        return var3 == null ? null : new class54(new class154(var3));
    }

    public class54(class154 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2573();
            if (var3 != 0) {
                arg0.field2091--;
                this.field986[var2] = new class71();
                this.field986[var2].method1270(arg0);
            }
        }
        this.field987 = arg0.method2575();
        this.field988 = arg0.method2575();
    }

    @ObfuscatedName("bh.e()Lba;")
    public class56 method921() {
        byte[] var1 = this.method923();
        return new class56(22050, var1, this.field987 * 22050 / 1000, this.field988 * 22050 / 1000);
    }

    @ObfuscatedName("bh.f()I")
    public final int method929() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field986[var2] != null && this.field986[var2].field1167 / 20 < var1) {
                var1 = this.field986[var2].field1167 / 20;
            }
        }
        if (this.field987 < this.field988 && this.field987 / 20 < var1) {
            var1 = this.field987 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field986[var3] != null) {
                this.field986[var3].field1167 -= var1 * 20;
            }
        }
        if (this.field987 < this.field988) {
            this.field987 -= var1 * 20;
            this.field988 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bh.k()[B")
    public final byte[] method923() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field986[var2] != null && this.field986[var2].field1167 + this.field986[var2].field1160 > var1) {
                var1 = this.field986[var2].field1167 + this.field986[var2].field1160;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field986[var5] != null) {
                int var6 = this.field986[var5].field1160 * 22050 / 1000;
                int var7 = this.field986[var5].field1167 * 22050 / 1000;
                int[] var8 = this.field986[var5].method1268(var6, this.field986[var5].field1160);
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
