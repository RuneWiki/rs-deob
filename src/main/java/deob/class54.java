package deob;

@ObfuscatedName("bf")
public class class54 {

    @ObfuscatedName("bf.o")
    public class67[] field1160 = new class67[10];

    @ObfuscatedName("bf.a")
    public int field1161;

    @ObfuscatedName("bf.w")
    public int field1159;

    @ObfuscatedName("bf.n(Lfd;II)Lbf;")
    public static class54 method1125(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2925(arg1, arg2);
        return var3 == null ? null : new class54(new class111(var3));
    }

    public class54(class111 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2234();
            if (var3 != 0) {
                arg0.field1890--;
                this.field1160[var2] = new class67();
                this.field1160[var2].method1392(arg0);
            }
        }
        this.field1161 = arg0.method2236();
        this.field1159 = arg0.method2236();
    }

    @ObfuscatedName("bf.o()Lbu;")
    public class58 method1123() {
        byte[] var1 = this.method1122();
        return new class58(22050, var1, this.field1161 * 22050 / 1000, this.field1159 * 22050 / 1000);
    }

    @ObfuscatedName("bf.a()I")
    public final int method1124() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1160[var2] != null && this.field1160[var2].field1271 / 20 < var1) {
                var1 = this.field1160[var2].field1271 / 20;
            }
        }
        if (this.field1161 < this.field1159 && this.field1161 / 20 < var1) {
            var1 = this.field1161 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1160[var3] != null) {
                this.field1160[var3].field1271 -= var1 * 20;
            }
        }
        if (this.field1161 < this.field1159) {
            this.field1161 -= var1 * 20;
            this.field1159 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bf.w()[B")
    public final byte[] method1122() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1160[var2] != null && this.field1160[var2].field1286 + this.field1160[var2].field1271 > var1) {
                var1 = this.field1160[var2].field1286 + this.field1160[var2].field1271;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1160[var5] != null) {
                int var6 = this.field1160[var5].field1286 * 22050 / 1000;
                int var7 = this.field1160[var5].field1271 * 22050 / 1000;
                int[] var8 = this.field1160[var5].method1390(var6, this.field1160[var5].field1286);
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
