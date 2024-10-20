package deob;

@ObfuscatedName("bj")
public class class57 {

    @ObfuscatedName("bj.y")
    public class70[] field1181 = new class70[10];

    @ObfuscatedName("bj.z")
    public int field1179;

    @ObfuscatedName("bj.l")
    public int field1182;

    @ObfuscatedName("bj.j(Lfh;II)Lbj;")
    public static class57 method1242(class161 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2995(arg1, arg2);
        return var3 == null ? null : new class57(new class114(var3));
    }

    public class57(class114 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2322();
            if (var3 != 0) {
                arg0.field1894--;
                this.field1181[var2] = new class70();
                this.field1181[var2].method1518(arg0);
            }
        }
        this.field1179 = arg0.method2324();
        this.field1182 = arg0.method2324();
    }

    @ObfuscatedName("bj.y()Lbv;")
    public class61 method1243() {
        byte[] var1 = this.method1248();
        return new class61(22050, var1, this.field1179 * 22050 / 1000, this.field1182 * 22050 / 1000);
    }

    @ObfuscatedName("bj.z()I")
    public final int method1250() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1181[var2] != null && this.field1181[var2].field1306 / 20 < var1) {
                var1 = this.field1181[var2].field1306 / 20;
            }
        }
        if (this.field1179 < this.field1182 && this.field1179 / 20 < var1) {
            var1 = this.field1179 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1181[var3] != null) {
                this.field1181[var3].field1306 -= var1 * 20;
            }
        }
        if (this.field1179 < this.field1182) {
            this.field1179 -= var1 * 20;
            this.field1182 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bj.l()[B")
    public final byte[] method1248() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1181[var2] != null && this.field1181[var2].field1306 + this.field1181[var2].field1294 > var1) {
                var1 = this.field1181[var2].field1306 + this.field1181[var2].field1294;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1181[var5] != null) {
                int var6 = this.field1181[var5].field1294 * 22050 / 1000;
                int var7 = this.field1181[var5].field1306 * 22050 / 1000;
                int[] var8 = this.field1181[var5].method1514(var6, this.field1181[var5].field1294);
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
