package deob;

@ObfuscatedName("bz")
public class class57 {

    @ObfuscatedName("bz.f")
    public class54[] field1202 = new class54[10];

    @ObfuscatedName("bz.o")
    public int field1201;

    @ObfuscatedName("bz.h")
    public int field1199;

    @ObfuscatedName("bz.j(Lew;II)Lbz;")
    public static class57 method1265(class153 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3027(arg1, arg2);
        return var3 == null ? null : new class57(new class127(var3));
    }

    public class57(class127 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2464();
            if (var3 != 0) {
                arg0.field2035--;
                this.field1202[var2] = new class54();
                this.field1202[var2].method1228(arg0);
            }
        }
        this.field1201 = arg0.method2582();
        this.field1199 = arg0.method2582();
    }

    @ObfuscatedName("bz.f()Lbx;")
    public class63 method1259() {
        byte[] var1 = this.method1258();
        return new class63(22050, var1, this.field1201 * 22050 / 1000, this.field1199 * 22050 / 1000);
    }

    @ObfuscatedName("bz.o()I")
    public final int method1256() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1202[var2] != null && this.field1202[var2].field1170 / 20 < var1) {
                var1 = this.field1202[var2].field1170 / 20;
            }
        }
        if (this.field1201 < this.field1199 && this.field1201 / 20 < var1) {
            var1 = this.field1201 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1202[var3] != null) {
                this.field1202[var3].field1170 -= var1 * 20;
            }
        }
        if (this.field1201 < this.field1199) {
            this.field1201 -= var1 * 20;
            this.field1199 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bz.h()[B")
    public final byte[] method1258() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1202[var2] != null && this.field1202[var2].field1170 + this.field1202[var2].field1169 > var1) {
                var1 = this.field1202[var2].field1170 + this.field1202[var2].field1169;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1202[var5] != null) {
                int var6 = this.field1202[var5].field1169 * 22050 / 1000;
                int var7 = this.field1202[var5].field1170 * 22050 / 1000;
                int[] var8 = this.field1202[var5].method1236(var6, this.field1202[var5].field1169);
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
