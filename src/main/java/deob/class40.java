package deob;

@ObfuscatedName("br")
public class class40 {

    @ObfuscatedName("br.al")
    public class62[] field273 = new class62[10];

    @ObfuscatedName("br.ak")
    public int field274;

    @ObfuscatedName("br.ax")
    public int field272;

    @ObfuscatedName("br.ac(Lom;II)Lbr;")
    public static class40 method739(class374 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6342(arg1, arg2);
        return var3 == null ? null : new class40(new class530(var3));
    }

    public class40(class530 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method8365();
            if (var3 != 0) {
                arg0.field5140--;
                this.field273[var2] = new class62();
                this.field273[var2].method1116(arg0);
            }
        }
        this.field274 = arg0.method8598();
        this.field272 = arg0.method8598();
    }

    @ObfuscatedName("br.al()Lbs;")
    public class41 method731() {
        byte[] var1 = this.method733();
        return new class41(22050, var1, this.field274 * 22050 / 1000, this.field272 * 22050 / 1000);
    }

    @ObfuscatedName("br.ak()I")
    public final int method732() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field273[var2] != null && this.field273[var2].field474 / 20 < var1) {
                var1 = this.field273[var2].field474 / 20;
            }
        }
        if (this.field274 < this.field272 && this.field274 / 20 < var1) {
            var1 = this.field274 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field273[var3] != null) {
                this.field273[var3].field474 -= var1 * 20;
            }
        }
        if (this.field274 < this.field272) {
            this.field274 -= var1 * 20;
            this.field272 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("br.ax()[B")
    public final byte[] method733() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field273[var2] != null && this.field273[var2].field475 + this.field273[var2].field474 > var1) {
                var1 = this.field273[var2].field475 + this.field273[var2].field474;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field273[var5] != null) {
                int var6 = this.field273[var5].field475 * 22050 / 1000;
                int var7 = this.field273[var5].field474 * 22050 / 1000;
                int[] var8 = this.field273[var5].method1114(var6, this.field273[var5].field475);
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
