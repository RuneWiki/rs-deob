package deob;

@ObfuscatedName("au")
public class class37 {

    @ObfuscatedName("au.q")
    public class55[] field262 = new class55[10];

    @ObfuscatedName("au.l")
    public int field259;

    @ObfuscatedName("au.k")
    public int field261;

    @ObfuscatedName("au.o(Llp;II)Lau;")
    public static class37 method643(class316 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5249(arg1, arg2);
        return var3 == null ? null : new class37(new class440(var3));
    }

    public class37(class440 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method7071();
            if (var3 != 0) {
                arg0.field4678--;
                this.field262[var2] = new class55();
                this.field262[var2].method988(arg0);
            }
        }
        this.field259 = arg0.method7082();
        this.field261 = arg0.method7082();
    }

    @ObfuscatedName("au.q()Lak;")
    public class38 method635() {
        byte[] var1 = this.method637();
        return new class38(22050, var1, this.field259 * 22050 / 1000, this.field261 * 22050 / 1000);
    }

    @ObfuscatedName("au.l()I")
    public final int method636() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field262[var2] != null && this.field262[var2].field439 / 20 < var1) {
                var1 = this.field262[var2].field439 / 20;
            }
        }
        if (this.field259 < this.field261 && this.field259 / 20 < var1) {
            var1 = this.field259 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field262[var3] != null) {
                this.field262[var3].field439 -= var1 * 20;
            }
        }
        if (this.field259 < this.field261) {
            this.field259 -= var1 * 20;
            this.field261 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("au.k()[B")
    public final byte[] method637() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field262[var2] != null && this.field262[var2].field446 + this.field262[var2].field439 > var1) {
                var1 = this.field262[var2].field446 + this.field262[var2].field439;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field262[var5] != null) {
                int var6 = this.field262[var5].field446 * 22050 / 1000;
                int var7 = this.field262[var5].field439 * 22050 / 1000;
                int[] var8 = this.field262[var5].method989(var6, this.field262[var5].field446);
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
