package deob;

@ObfuscatedName("ax")
public class class52 {

    @ObfuscatedName("ax.z")
    public class65[] field1116 = new class65[10];

    @ObfuscatedName("ax.y")
    public int field1115;

    @ObfuscatedName("ax.h")
    public int field1117;

    @ObfuscatedName("ax.j(Leg;II)Lax;")
    public static class52 method1022(class146 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2739(arg1, arg2);
        return var3 == null ? null : new class52(new class107(var3));
    }

    public class52(class107 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2130();
            if (var3 != 0) {
                arg0.field1847--;
                this.field1116[var2] = new class65();
                this.field1116[var2].method1300(arg0);
            }
        }
        this.field1115 = arg0.method2132();
        this.field1117 = arg0.method2132();
    }

    @ObfuscatedName("ax.z()Lbm;")
    public class56 method1026() {
        byte[] var1 = this.method1030();
        return new class56(22050, var1, this.field1115 * 22050 / 1000, this.field1117 * 22050 / 1000);
    }

    @ObfuscatedName("ax.y()I")
    public final int method1035() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1116[var2] != null && this.field1116[var2].field1243 / 20 < var1) {
                var1 = this.field1116[var2].field1243 / 20;
            }
        }
        if (this.field1115 < this.field1117 && this.field1115 / 20 < var1) {
            var1 = this.field1115 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1116[var3] != null) {
                this.field1116[var3].field1243 -= var1 * 20;
            }
        }
        if (this.field1115 < this.field1117) {
            this.field1115 -= var1 * 20;
            this.field1117 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("ax.h()[B")
    public final byte[] method1030() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1116[var2] != null && this.field1116[var2].field1243 + this.field1116[var2].field1242 > var1) {
                var1 = this.field1116[var2].field1243 + this.field1116[var2].field1242;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1116[var5] != null) {
                int var6 = this.field1116[var5].field1242 * 22050 / 1000;
                int var7 = this.field1116[var5].field1243 * 22050 / 1000;
                int[] var8 = this.field1116[var5].method1298(var6, this.field1116[var5].field1242);
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
