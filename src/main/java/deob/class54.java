package deob;

@ObfuscatedName("bi")
public class class54 {

    @ObfuscatedName("bi.s")
    public class67[] field1115 = new class67[10];

    @ObfuscatedName("bi.h")
    public int field1116;

    @ObfuscatedName("bi.e")
    public int field1114;

    @ObfuscatedName("bi.q(Lff;II)Lbi;")
    public static class54 method1050(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2811(arg1, arg2);
        return var3 == null ? null : new class54(new class111(var3));
    }

    public class54(class111 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2231();
            if (var3 != 0) {
                arg0.field1852--;
                this.field1115[var2] = new class67();
                this.field1115[var2].method1311(arg0);
            }
        }
        this.field1116 = arg0.method2307();
        this.field1114 = arg0.method2307();
    }

    @ObfuscatedName("bi.s()Lbx;")
    public class58 method1043() {
        byte[] var1 = this.method1045();
        return new class58(22050, var1, this.field1116 * 22050 / 1000, this.field1114 * 22050 / 1000);
    }

    @ObfuscatedName("bi.h()I")
    public final int method1044() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1115[var2] != null && this.field1115[var2].field1238 / 20 < var1) {
                var1 = this.field1115[var2].field1238 / 20;
            }
        }
        if (this.field1116 < this.field1114 && this.field1116 / 20 < var1) {
            var1 = this.field1116 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1115[var3] != null) {
                this.field1115[var3].field1238 -= var1 * 20;
            }
        }
        if (this.field1116 < this.field1114) {
            this.field1116 -= var1 * 20;
            this.field1114 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bi.e()[B")
    public final byte[] method1045() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1115[var2] != null && this.field1115[var2].field1238 + this.field1115[var2].field1237 > var1) {
                var1 = this.field1115[var2].field1238 + this.field1115[var2].field1237;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1115[var5] != null) {
                int var6 = this.field1115[var5].field1237 * 22050 / 1000;
                int var7 = this.field1115[var5].field1238 * 22050 / 1000;
                int[] var8 = this.field1115[var5].method1308(var6, this.field1115[var5].field1237);
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
