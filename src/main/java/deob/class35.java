package deob;

@ObfuscatedName("av")
public class class35 {

    @ObfuscatedName("av.c")
    public class53[] field247 = new class53[10];

    @ObfuscatedName("av.m")
    public int field248;

    @ObfuscatedName("av.k")
    public int field246;

    @ObfuscatedName("av.n(Lkk;II)Lav;")
    public static class35 method663(class290 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4710(arg1, arg2);
        return var3 == null ? null : new class35(new class400(var3));
    }

    public class35(class400 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method6217();
            if (var3 != 0) {
                arg0.field4272--;
                this.field247[var2] = new class53();
                this.field247[var2].method996(arg0);
            }
        }
        this.field248 = arg0.method6219();
        this.field246 = arg0.method6219();
    }

    @ObfuscatedName("av.c()Lak;")
    public class36 method653() {
        byte[] var1 = this.method656();
        return new class36(22050, var1, this.field248 * 22050 / 1000, this.field246 * 22050 / 1000);
    }

    @ObfuscatedName("av.m()I")
    public final int method655() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field247[var2] != null && this.field247[var2].field423 / 20 < var1) {
                var1 = this.field247[var2].field423 / 20;
            }
        }
        if (this.field248 < this.field246 && this.field248 / 20 < var1) {
            var1 = this.field248 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field247[var3] != null) {
                this.field247[var3].field423 -= var1 * 20;
            }
        }
        if (this.field248 < this.field246) {
            this.field248 -= var1 * 20;
            this.field246 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("av.k()[B")
    public final byte[] method656() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field247[var2] != null && this.field247[var2].field423 + this.field247[var2].field422 > var1) {
                var1 = this.field247[var2].field423 + this.field247[var2].field422;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field247[var5] != null) {
                int var6 = this.field247[var5].field422 * 22050 / 1000;
                int var7 = this.field247[var5].field423 * 22050 / 1000;
                int[] var8 = this.field247[var5].method993(var6, this.field247[var5].field422);
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
