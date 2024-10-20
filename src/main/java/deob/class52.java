package deob;

@ObfuscatedName("ai")
public class class52 {

    @ObfuscatedName("ai.s")
    public class65[] field1104 = new class65[10];

    @ObfuscatedName("ai.h")
    public int field1105;

    @ObfuscatedName("ai.m")
    public int field1106;

    @ObfuscatedName("ai.g(Leh;II)Lai;")
    public static class52 method1032(class147 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2667(arg1, arg2);
        return var3 == null ? null : new class52(new class107(var3));
    }

    public class52(class107 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2101();
            if (var3 != 0) {
                arg0.field1835--;
                this.field1104[var2] = new class65();
                this.field1104[var2].method1298(arg0);
            }
        }
        this.field1105 = arg0.method2166();
        this.field1106 = arg0.method2166();
    }

    @ObfuscatedName("ai.s()Lbi;")
    public class56 method1030() {
        byte[] var1 = this.method1041();
        return new class56(22050, var1, this.field1105 * 22050 / 1000, this.field1106 * 22050 / 1000);
    }

    @ObfuscatedName("ai.h()I")
    public final int method1033() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1104[var2] != null && this.field1104[var2].field1243 / 20 < var1) {
                var1 = this.field1104[var2].field1243 / 20;
            }
        }
        if (this.field1105 < this.field1106 && this.field1105 / 20 < var1) {
            var1 = this.field1105 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1104[var3] != null) {
                this.field1104[var3].field1243 -= var1 * 20;
            }
        }
        if (this.field1105 < this.field1106) {
            this.field1105 -= var1 * 20;
            this.field1106 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("ai.m()[B")
    public final byte[] method1041() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1104[var2] != null && this.field1104[var2].field1243 + this.field1104[var2].field1233 > var1) {
                var1 = this.field1104[var2].field1243 + this.field1104[var2].field1233;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1104[var5] != null) {
                int var6 = this.field1104[var5].field1233 * 22050 / 1000;
                int var7 = this.field1104[var5].field1243 * 22050 / 1000;
                int[] var8 = this.field1104[var5].method1296(var6, this.field1104[var5].field1233);
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
