package deob;

@ObfuscatedName("an")
public class class50 {

    @ObfuscatedName("an.o")
    public class68[] field366 = new class68[10];

    @ObfuscatedName("an.u")
    public int field367;

    @ObfuscatedName("an.p")
    public int field369;

    @ObfuscatedName("an.f(Lir;II)Lan;")
    public static class50 method602(class253 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3933(arg1, arg2);
        return var3 == null ? null : new class50(new class382(var3));
    }

    public class50(class382 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method5856();
            if (var3 != 0) {
                arg0.field4155--;
                this.field366[var2] = new class68();
                this.field366[var2].method919(arg0);
            }
        }
        this.field367 = arg0.method5858();
        this.field369 = arg0.method5858();
    }

    @ObfuscatedName("an.o()Lah;")
    public class51 method590() {
        byte[] var1 = this.method592();
        return new class51(22050, var1, this.field367 * 22050 / 1000, this.field369 * 22050 / 1000);
    }

    @ObfuscatedName("an.u()I")
    public final int method594() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field366[var2] != null && this.field366[var2].field542 / 20 < var1) {
                var1 = this.field366[var2].field542 / 20;
            }
        }
        if (this.field367 < this.field369 && this.field367 / 20 < var1) {
            var1 = this.field367 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field366[var3] != null) {
                this.field366[var3].field542 -= var1 * 20;
            }
        }
        if (this.field367 < this.field369) {
            this.field367 -= var1 * 20;
            this.field369 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("an.p()[B")
    public final byte[] method592() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field366[var2] != null && this.field366[var2].field544 + this.field366[var2].field542 > var1) {
                var1 = this.field366[var2].field544 + this.field366[var2].field542;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field366[var5] != null) {
                int var6 = this.field366[var5].field544 * 22050 / 1000;
                int var7 = this.field366[var5].field542 * 22050 / 1000;
                int[] var8 = this.field366[var5].method911(var6, this.field366[var5].field544);
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
