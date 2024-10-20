package deob;

@ObfuscatedName("b")
public class class22 {

    @ObfuscatedName("b.t")
    public int field163;

    @ObfuscatedName("b.v")
    public class40[] field161 = new class40[10];

    @ObfuscatedName("b.j")
    public int field162;

    @ObfuscatedName("b.s(Ljy;II)Lb;")
    public static class22 method413(class277 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4459(arg1, arg2);
        return var3 == null ? null : new class22(new class385(var3));
    }

    public class22(class385 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method5958();
            if (var3 != 0) {
                arg0.field4182--;
                this.field161[var2] = new class40();
                this.field161[var2].method762(arg0);
            }
        }
        this.field163 = arg0.method6053();
        this.field162 = arg0.method6053();
    }

    @ObfuscatedName("b.t()Lz;")
    public class23 method407() {
        byte[] var1 = this.method409();
        return new class23(22050, var1, this.field163 * 22050 / 1000, this.field162 * 22050 / 1000);
    }

    @ObfuscatedName("b.v()I")
    public final int method417() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field161[var2] != null && this.field161[var2].field340 / 20 < var1) {
                var1 = this.field161[var2].field340 / 20;
            }
        }
        if (this.field163 < this.field162 && this.field163 / 20 < var1) {
            var1 = this.field163 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field161[var3] != null) {
                this.field161[var3].field340 -= var1 * 20;
            }
        }
        if (this.field163 < this.field162) {
            this.field163 -= var1 * 20;
            this.field162 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("b.j()[B")
    public final byte[] method409() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field161[var2] != null && this.field161[var2].field344 + this.field161[var2].field340 > var1) {
                var1 = this.field161[var2].field344 + this.field161[var2].field340;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field161[var5] != null) {
                int var6 = this.field161[var5].field344 * 22050 / 1000;
                int var7 = this.field161[var5].field340 * 22050 / 1000;
                int[] var8 = this.field161[var5].method771(var6, this.field161[var5].field344);
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
