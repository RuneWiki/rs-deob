package deob;

@ObfuscatedName("br")
public class class56 {

    @ObfuscatedName("br.j")
    public class53[] field1191 = new class53[10];

    @ObfuscatedName("br.w")
    public int field1192;

    @ObfuscatedName("br.h")
    public int field1193;

    @ObfuscatedName("br.p(Ler;II)Lbr;")
    public static class56 method1217(class151 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2973(arg1, arg2);
        return var3 == null ? null : new class56(new class126(var3));
    }

    public class56(class126 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2544();
            if (var3 != 0) {
                arg0.field2043--;
                this.field1191[var2] = new class53();
                this.field1191[var2].method1185(arg0);
            }
        }
        this.field1192 = arg0.method2489();
        this.field1193 = arg0.method2489();
    }

    @ObfuscatedName("br.j()Lbl;")
    public class62 method1219() {
        byte[] var1 = this.method1221();
        return new class62(22050, var1, this.field1192 * 22050 / 1000, this.field1193 * 22050 / 1000);
    }

    @ObfuscatedName("br.w()I")
    public final int method1220() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1191[var2] != null && this.field1191[var2].field1158 / 20 < var1) {
                var1 = this.field1191[var2].field1158 / 20;
            }
        }
        if (this.field1192 < this.field1193 && this.field1192 / 20 < var1) {
            var1 = this.field1192 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1191[var3] != null) {
                this.field1191[var3].field1158 -= var1 * 20;
            }
        }
        if (this.field1192 < this.field1193) {
            this.field1192 -= var1 * 20;
            this.field1193 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("br.h()[B")
    public final byte[] method1221() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1191[var2] != null && this.field1191[var2].field1158 + this.field1191[var2].field1145 > var1) {
                var1 = this.field1191[var2].field1158 + this.field1191[var2].field1145;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1191[var5] != null) {
                int var6 = this.field1191[var5].field1145 * 22050 / 1000;
                int var7 = this.field1191[var5].field1158 * 22050 / 1000;
                int[] var8 = this.field1191[var5].method1191(var6, this.field1191[var5].field1145);
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
