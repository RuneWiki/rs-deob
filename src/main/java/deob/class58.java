package deob;

@ObfuscatedName("bf")
public class class58 {

    @ObfuscatedName("bf.b")
    public class55[] field1203 = new class55[10];

    @ObfuscatedName("bf.r")
    public int field1204;

    @ObfuscatedName("bf.l")
    public int field1206;

    @ObfuscatedName("bf.i(Leg;II)Lbf;")
    public static class58 method1261(class155 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3043(arg1, arg2);
        return var3 == null ? null : new class58(new class128(var3));
    }

    public class58(class128 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2531();
            if (var3 != 0) {
                arg0.field2048--;
                this.field1203[var2] = new class55();
                this.field1203[var2].method1226(arg0);
            }
        }
        this.field1204 = arg0.method2473();
        this.field1206 = arg0.method2473();
    }

    @ObfuscatedName("bf.b()Lbq;")
    public class64 method1256() {
        byte[] var1 = this.method1249();
        return new class64(22050, var1, this.field1204 * 22050 / 1000, this.field1206 * 22050 / 1000);
    }

    @ObfuscatedName("bf.r()I")
    public final int method1248() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1203[var2] != null && this.field1203[var2].field1169 / 20 < var1) {
                var1 = this.field1203[var2].field1169 / 20;
            }
        }
        if (this.field1204 < this.field1206 && this.field1204 / 20 < var1) {
            var1 = this.field1204 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1203[var3] != null) {
                this.field1203[var3].field1169 -= var1 * 20;
            }
        }
        if (this.field1204 < this.field1206) {
            this.field1204 -= var1 * 20;
            this.field1206 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bf.l()[B")
    public final byte[] method1249() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1203[var2] != null && this.field1203[var2].field1175 + this.field1203[var2].field1169 > var1) {
                var1 = this.field1203[var2].field1175 + this.field1203[var2].field1169;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1203[var5] != null) {
                int var6 = this.field1203[var5].field1175 * 22050 / 1000;
                int var7 = this.field1203[var5].field1169 * 22050 / 1000;
                int[] var8 = this.field1203[var5].method1217(var6, this.field1203[var5].field1175);
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
