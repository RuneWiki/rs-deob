package deob;

@ObfuscatedName("cj")
public class class94 {

    @ObfuscatedName("cj.q")
    public class110[] field1300 = new class110[10];

    @ObfuscatedName("cj.m")
    public int field1301;

    @ObfuscatedName("cj.j")
    public int field1302;

    @ObfuscatedName("cj.c(Lih;II)Lcj;")
    public static class94 method1919(class250 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4210(arg1, arg2);
        return var3 == null ? null : new class94(new class185(var3));
    }

    public class94(class185 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3243();
            if (var3 != 0) {
                arg0.field2386--;
                this.field1300[var2] = new class110();
                this.field1300[var2].method2233(arg0);
            }
        }
        this.field1301 = arg0.method3245();
        this.field1302 = arg0.method3245();
    }

    @ObfuscatedName("cj.q()Lcz;")
    public class96 method1918() {
        byte[] var1 = this.method1916();
        return new class96(22050, var1, this.field1301 * 22050 / 1000, this.field1302 * 22050 / 1000);
    }

    @ObfuscatedName("cj.m()I")
    public final int method1925() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1300[var2] != null && this.field1300[var2].field1455 / 20 < var1) {
                var1 = this.field1300[var2].field1455 / 20;
            }
        }
        if (this.field1301 < this.field1302 && this.field1301 / 20 < var1) {
            var1 = this.field1301 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1300[var3] != null) {
                this.field1300[var3].field1455 -= var1 * 20;
            }
        }
        if (this.field1301 < this.field1302) {
            this.field1301 -= var1 * 20;
            this.field1302 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("cj.j()[B")
    public final byte[] method1916() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1300[var2] != null && this.field1300[var2].field1470 + this.field1300[var2].field1455 > var1) {
                var1 = this.field1300[var2].field1470 + this.field1300[var2].field1455;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1300[var5] != null) {
                int var6 = this.field1300[var5].field1470 * 22050 / 1000;
                int var7 = this.field1300[var5].field1455 * 22050 / 1000;
                int[] var8 = this.field1300[var5].method2231(var6, this.field1300[var5].field1470);
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
