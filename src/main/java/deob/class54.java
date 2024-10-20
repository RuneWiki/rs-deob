package deob;

@ObfuscatedName("br")
public class class54 {

    @ObfuscatedName("br.t")
    public int field1126;

    @ObfuscatedName("br.p")
    public class67[] field1124 = new class67[10];

    @ObfuscatedName("br.e")
    public int field1127;

    @ObfuscatedName("br.t(Lfj;II)Lbr;")
    public static class54 method1131(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2881(arg1, arg2);
        return var3 == null ? null : new class54(new class111(var3));
    }

    public class54(class111 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2172();
            if (var3 != 0) {
                arg0.field1867--;
                this.field1124[var2] = new class67();
                this.field1124[var2].method1390(arg0);
            }
        }
        this.field1126 = arg0.method2255();
        this.field1127 = arg0.method2255();
    }

    @ObfuscatedName("br.b()Lbl;")
    public class58 method1129() {
        byte[] var1 = this.method1132();
        return new class58(22050, var1, this.field1126 * 22050 / 1000, this.field1127 * 22050 / 1000);
    }

    @ObfuscatedName("br.p()I")
    public final int method1130() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1124[var2] != null && this.field1124[var2].field1249 / 20 < var1) {
                var1 = this.field1124[var2].field1249 / 20;
            }
        }
        if (this.field1126 < this.field1127 && this.field1126 / 20 < var1) {
            var1 = this.field1126 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1124[var3] != null) {
                this.field1124[var3].field1249 -= var1 * 20;
            }
        }
        if (this.field1126 < this.field1127) {
            this.field1126 -= var1 * 20;
            this.field1127 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("br.e()[B")
    public final byte[] method1132() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1124[var2] != null && this.field1124[var2].field1249 + this.field1124[var2].field1247 > var1) {
                var1 = this.field1124[var2].field1249 + this.field1124[var2].field1247;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1124[var5] != null) {
                int var6 = this.field1124[var5].field1247 * 22050 / 1000;
                int var7 = this.field1124[var5].field1249 * 22050 / 1000;
                int[] var8 = this.field1124[var5].method1381(var6, this.field1124[var5].field1247);
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
