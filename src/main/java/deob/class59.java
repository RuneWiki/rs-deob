package deob;

@ObfuscatedName("bn")
public class class59 {

    @ObfuscatedName("bn.h")
    public class72[] field1195 = new class72[10];

    @ObfuscatedName("bn.m")
    public int field1194;

    @ObfuscatedName("bn.z")
    public int field1196;

    @ObfuscatedName("bn.j(Lfy;II)Lbn;")
    public static class59 method1201(class168 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3011(arg1, arg2);
        return var3 == null ? null : new class59(new class120(var3));
    }

    public class59(class120 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2361();
            if (var3 != 0) {
                arg0.field1972--;
                this.field1195[var2] = new class72();
                this.field1195[var2].method1466(arg0);
            }
        }
        this.field1194 = arg0.method2363();
        this.field1196 = arg0.method2363();
    }

    @ObfuscatedName("bn.h()Lbc;")
    public class63 method1210() {
        byte[] var1 = this.method1202();
        return new class63(22050, var1, this.field1194 * 22050 / 1000, this.field1196 * 22050 / 1000);
    }

    @ObfuscatedName("bn.m()I")
    public final int method1209() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1195[var2] != null && this.field1195[var2].field1321 / 20 < var1) {
                var1 = this.field1195[var2].field1321 / 20;
            }
        }
        if (this.field1194 < this.field1196 && this.field1194 / 20 < var1) {
            var1 = this.field1194 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1195[var3] != null) {
                this.field1195[var3].field1321 -= var1 * 20;
            }
        }
        if (this.field1194 < this.field1196) {
            this.field1194 -= var1 * 20;
            this.field1196 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bn.z()[B")
    public final byte[] method1202() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1195[var2] != null && this.field1195[var2].field1324 + this.field1195[var2].field1321 > var1) {
                var1 = this.field1195[var2].field1324 + this.field1195[var2].field1321;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1195[var5] != null) {
                int var6 = this.field1195[var5].field1324 * 22050 / 1000;
                int var7 = this.field1195[var5].field1321 * 22050 / 1000;
                int[] var8 = this.field1195[var5].method1464(var6, this.field1195[var5].field1324);
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
