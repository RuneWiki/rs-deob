package deob;

@ObfuscatedName("bn")
public class class57 {

    @ObfuscatedName("bn.p")
    public class54[] field1201 = new class54[10];

    @ObfuscatedName("bn.a")
    public int field1202;

    @ObfuscatedName("bn.l")
    public int field1203;

    @ObfuscatedName("bn.i(Lef;II)Lbn;")
    public static class57 method1215(class152 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2932(arg1, arg2);
        return var3 == null ? null : new class57(new class127(var3));
    }

    public class57(class127 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2411();
            if (var3 != 0) {
                arg0.field2037--;
                this.field1201[var2] = new class54();
                this.field1201[var2].method1183(arg0);
            }
        }
        this.field1202 = arg0.method2413();
        this.field1203 = arg0.method2413();
    }

    @ObfuscatedName("bn.p()Lbh;")
    public class63 method1218() {
        byte[] var1 = this.method1212();
        return new class63(22050, var1, this.field1202 * 22050 / 1000, this.field1203 * 22050 / 1000);
    }

    @ObfuscatedName("bn.a()I")
    public final int method1211() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1201[var2] != null && this.field1201[var2].field1169 / 20 < var1) {
                var1 = this.field1201[var2].field1169 / 20;
            }
        }
        if (this.field1202 < this.field1203 && this.field1202 / 20 < var1) {
            var1 = this.field1202 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1201[var3] != null) {
                this.field1201[var3].field1169 -= var1 * 20;
            }
        }
        if (this.field1202 < this.field1203) {
            this.field1202 -= var1 * 20;
            this.field1203 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bn.l()[B")
    public final byte[] method1212() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1201[var2] != null && this.field1201[var2].field1169 + this.field1201[var2].field1168 > var1) {
                var1 = this.field1201[var2].field1169 + this.field1201[var2].field1168;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1201[var5] != null) {
                int var6 = this.field1201[var5].field1168 * 22050 / 1000;
                int var7 = this.field1201[var5].field1169 * 22050 / 1000;
                int[] var8 = this.field1201[var5].method1182(var6, this.field1201[var5].field1168);
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
