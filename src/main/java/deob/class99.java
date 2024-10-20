package deob;

@ObfuscatedName("cu")
public class class99 {

    @ObfuscatedName("cu.s")
    public class115[] field1333 = new class115[10];

    @ObfuscatedName("cu.g")
    public int field1334;

    @ObfuscatedName("cu.x")
    public int field1332;

    @ObfuscatedName("cu.a(Liz;II)Lcu;")
    public static class99 method2175(class255 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4422(arg1, arg2);
        return var3 == null ? null : new class99(new class190(var3));
    }

    public class99(class190 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3443();
            if (var3 != 0) {
                arg0.field2419--;
                this.field1333[var2] = new class115();
                this.field1333[var2].method2503(arg0);
            }
        }
        this.field1334 = arg0.method3610();
        this.field1332 = arg0.method3610();
    }

    @ObfuscatedName("cu.s()Lce;")
    public class101 method2188() {
        byte[] var1 = this.method2173();
        return new class101(22050, var1, this.field1334 * 22050 / 1000, this.field1332 * 22050 / 1000);
    }

    @ObfuscatedName("cu.g()I")
    public final int method2187() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1333[var2] != null && this.field1333[var2].field1503 / 20 < var1) {
                var1 = this.field1333[var2].field1503 / 20;
            }
        }
        if (this.field1334 < this.field1332 && this.field1334 / 20 < var1) {
            var1 = this.field1334 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1333[var3] != null) {
                this.field1333[var3].field1503 -= var1 * 20;
            }
        }
        if (this.field1334 < this.field1332) {
            this.field1334 -= var1 * 20;
            this.field1332 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("cu.x()[B")
    public final byte[] method2173() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1333[var2] != null && this.field1333[var2].field1503 + this.field1333[var2].field1478 > var1) {
                var1 = this.field1333[var2].field1503 + this.field1333[var2].field1478;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1333[var5] != null) {
                int var6 = this.field1333[var5].field1478 * 22050 / 1000;
                int var7 = this.field1333[var5].field1503 * 22050 / 1000;
                int[] var8 = this.field1333[var5].method2495(var6, this.field1333[var5].field1478);
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
