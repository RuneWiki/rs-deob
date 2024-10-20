package deob;

@ObfuscatedName("co")
public class class94 {

    @ObfuscatedName("co.s")
    public class110[] field1289 = new class110[10];

    @ObfuscatedName("co.o")
    public int field1291;

    @ObfuscatedName("co.k")
    public int field1292;

    @ObfuscatedName("co.v(Lis;II)Lco;")
    public static class94 method1960(class250 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4270(arg1, arg2);
        return var3 == null ? null : new class94(new class185(var3));
    }

    public class94(class185 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3274();
            if (var3 != 0) {
                arg0.field2386--;
                this.field1289[var2] = new class110();
                this.field1289[var2].method2291(arg0);
            }
        }
        this.field1291 = arg0.method3276();
        this.field1292 = arg0.method3276();
    }

    @ObfuscatedName("co.s()Lcq;")
    public class96 method1961() {
        byte[] var1 = this.method1966();
        return new class96(22050, var1, this.field1291 * 22050 / 1000, this.field1292 * 22050 / 1000);
    }

    @ObfuscatedName("co.o()I")
    public final int method1962() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1289[var2] != null && this.field1289[var2].field1456 / 20 < var1) {
                var1 = this.field1289[var2].field1456 / 20;
            }
        }
        if (this.field1291 < this.field1292 && this.field1291 / 20 < var1) {
            var1 = this.field1291 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1289[var3] != null) {
                this.field1289[var3].field1456 -= var1 * 20;
            }
        }
        if (this.field1291 < this.field1292) {
            this.field1291 -= var1 * 20;
            this.field1292 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("co.k()[B")
    public final byte[] method1966() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1289[var2] != null && this.field1289[var2].field1456 + this.field1289[var2].field1455 > var1) {
                var1 = this.field1289[var2].field1456 + this.field1289[var2].field1455;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1289[var5] != null) {
                int var6 = this.field1289[var5].field1455 * 22050 / 1000;
                int var7 = this.field1289[var5].field1456 * 22050 / 1000;
                int[] var8 = this.field1289[var5].method2289(var6, this.field1289[var5].field1455);
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
