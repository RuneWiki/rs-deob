package deob;

@ObfuscatedName("cp")
public class class94 {

    @ObfuscatedName("cp.r")
    public class110[] field1307 = new class110[10];

    @ObfuscatedName("cp.e")
    public int field1309;

    @ObfuscatedName("cp.q")
    public int field1308;

    @ObfuscatedName("cp.g(Liu;II)Lcp;")
    public static class94 method2138(class250 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4438(arg1, arg2);
        return var3 == null ? null : new class94(new class185(var3));
    }

    public class94(class185 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3679();
            if (var3 != 0) {
                arg0.field2406--;
                this.field1307[var2] = new class110();
                this.field1307[var2].method2474(arg0);
            }
        }
        this.field1309 = arg0.method3467();
        this.field1308 = arg0.method3467();
    }

    @ObfuscatedName("cp.r()Lct;")
    public class96 method2144() {
        byte[] var1 = this.method2142();
        return new class96(22050, var1, this.field1309 * 22050 / 1000, this.field1308 * 22050 / 1000);
    }

    @ObfuscatedName("cp.e()I")
    public final int method2137() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1307[var2] != null && this.field1307[var2].field1469 / 20 < var1) {
                var1 = this.field1307[var2].field1469 / 20;
            }
        }
        if (this.field1309 < this.field1308 && this.field1309 / 20 < var1) {
            var1 = this.field1309 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1307[var3] != null) {
                this.field1307[var3].field1469 -= var1 * 20;
            }
        }
        if (this.field1309 < this.field1308) {
            this.field1309 -= var1 * 20;
            this.field1308 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("cp.q()[B")
    public final byte[] method2142() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1307[var2] != null && this.field1307[var2].field1469 + this.field1307[var2].field1466 > var1) {
                var1 = this.field1307[var2].field1469 + this.field1307[var2].field1466;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1307[var5] != null) {
                int var6 = this.field1307[var5].field1466 * 22050 / 1000;
                int var7 = this.field1307[var5].field1469 * 22050 / 1000;
                int[] var8 = this.field1307[var5].method2476(var6, this.field1307[var5].field1466);
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
