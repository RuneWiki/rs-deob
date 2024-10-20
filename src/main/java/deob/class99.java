package deob;

@ObfuscatedName("cj")
public class class99 {

    @ObfuscatedName("cj.h")
    public class115[] field1299 = new class115[10];

    @ObfuscatedName("cj.l")
    public int field1300;

    @ObfuscatedName("cj.g")
    public int field1302;

    @ObfuscatedName("cj.n(Lij;II)Lcj;")
    public static class99 method2161(class254 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4494(arg1, arg2);
        return var3 == null ? null : new class99(new class190(var3));
    }

    public class99(class190 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3511();
            if (var3 != 0) {
                arg0.field2423--;
                this.field1299[var2] = new class115();
                this.field1299[var2].method2480(arg0);
            }
        }
        this.field1300 = arg0.method3513();
        this.field1302 = arg0.method3513();
    }

    @ObfuscatedName("cj.h()Lcq;")
    public class101 method2158() {
        byte[] var1 = this.method2151();
        return new class101(22050, var1, this.field1300 * 22050 / 1000, this.field1302 * 22050 / 1000);
    }

    @ObfuscatedName("cj.l()I")
    public final int method2150() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1299[var2] != null && this.field1299[var2].field1455 / 20 < var1) {
                var1 = this.field1299[var2].field1455 / 20;
            }
        }
        if (this.field1300 < this.field1302 && this.field1300 / 20 < var1) {
            var1 = this.field1300 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1299[var3] != null) {
                this.field1299[var3].field1455 -= var1 * 20;
            }
        }
        if (this.field1300 < this.field1302) {
            this.field1300 -= var1 * 20;
            this.field1302 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("cj.g()[B")
    public final byte[] method2151() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1299[var2] != null && this.field1299[var2].field1470 + this.field1299[var2].field1455 > var1) {
                var1 = this.field1299[var2].field1470 + this.field1299[var2].field1455;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1299[var5] != null) {
                int var6 = this.field1299[var5].field1470 * 22050 / 1000;
                int var7 = this.field1299[var5].field1455 * 22050 / 1000;
                int[] var8 = this.field1299[var5].method2485(var6, this.field1299[var5].field1470);
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
