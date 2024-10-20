package deob;

@ObfuscatedName("lm")
public class class296 {

    @ObfuscatedName("lm.aj")
    public class478 field3367 = new class478((byte[]) null);

    @ObfuscatedName("lm.al")
    public int field3364;

    @ObfuscatedName("lm.ac")
    public int[] field3368;

    @ObfuscatedName("lm.ab")
    public int[] field3366;

    @ObfuscatedName("lm.an")
    public int[] field3373;

    @ObfuscatedName("lm.ao")
    public int[] field3369;

    @ObfuscatedName("lm.av")
    public int field3365;

    @ObfuscatedName("lm.ap")
    public long field3372;

    @ObfuscatedName("lm.ar")
    public static final byte[] field3370 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class296() {
    }

    public class296(byte[] arg0) {
        this.method5121(arg0);
    }

    @ObfuscatedName("lm.aj([B)V")
    public void method5121(byte[] arg0) {
        this.field3367.field4906 = arg0;
        this.field3367.field4904 = 10;
        int var2 = this.field3367.method7905();
        this.field3364 = this.field3367.method7905();
        this.field3365 = 500000;
        this.field3368 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3367.method7908();
            int var5 = this.field3367.method7908();
            if (var4 == 1297379947) {
                this.field3368[var3] = this.field3367.field4904;
                var3++;
            }
            this.field3367.field4904 += var5;
        }
        this.field3372 = 0L;
        this.field3366 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3366[var6] = this.field3368[var6];
        }
        this.field3373 = new int[var2];
        this.field3369 = new int[var2];
    }

    @ObfuscatedName("lm.al()V")
    public void method5122() {
        this.field3367.field4906 = null;
        this.field3368 = null;
        this.field3366 = null;
        this.field3373 = null;
        this.field3369 = null;
    }

    @ObfuscatedName("lm.ac()Z")
    public boolean method5143() {
        return this.field3367.field4906 != null;
    }

    @ObfuscatedName("lm.ab()I")
    public int method5123() {
        return this.field3366.length;
    }

    @ObfuscatedName("lm.an(I)V")
    public void method5125(int arg0) {
        this.field3367.field4904 = this.field3366[arg0];
    }

    @ObfuscatedName("lm.ao(I)V")
    public void method5155(int arg0) {
        this.field3366[arg0] = this.field3367.field4904;
    }

    @ObfuscatedName("lm.av()V")
    public void method5127() {
        this.field3367.field4904 = -1;
    }

    @ObfuscatedName("lm.aq(I)V")
    public void method5128(int arg0) {
        int var2 = this.field3367.method7923();
        this.field3373[arg0] += var2;
    }

    @ObfuscatedName("lm.ap(I)I")
    public int method5129(int arg0) {
        return this.method5146(arg0);
    }

    @ObfuscatedName("lm.ar(I)I")
    public int method5146(int arg0) {
        byte var2 = this.field3367.field4906[this.field3367.field4904];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3369[arg0] = var3;
            this.field3367.field4904++;
        } else {
            var3 = this.field3369[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method5159(arg0, var3);
        }
        int var4 = this.field3367.method7923();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3367.field4906[this.field3367.field4904] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3367.field4904++;
                this.field3369[arg0] = var5;
                return this.method5159(arg0, var5);
            }
        }
        this.field3367.field4904 += var4;
        return 0;
    }

    @ObfuscatedName("lm.ak(II)I")
    public int method5159(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3370[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3367.method7909() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3367.method7909() << 16;
            }
            return var8;
        }
        int var3 = this.field3367.method7909();
        int var4 = this.field3367.method7923();
        if (var3 == 47) {
            this.field3367.field4904 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3367.method7907();
            var4 -= 3;
            int var6 = this.field3373[arg0];
            this.field3372 += (long) (this.field3365 - var5) * (long) var6;
            this.field3365 = var5;
            this.field3367.field4904 += var4;
            return 2;
        } else {
            this.field3367.field4904 += var4;
            return 3;
        }
    }

    @ObfuscatedName("lm.ax(I)J")
    public long method5124(int arg0) {
        return (long) this.field3365 * (long) arg0 + this.field3372;
    }

    @ObfuscatedName("lm.as()I")
    public int method5133() {
        int var1 = this.field3366.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3366[var4] >= 0 && this.field3373[var4] < var3) {
                var2 = var4;
                var3 = this.field3373[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("lm.ay()Z")
    public boolean method5151() {
        int var1 = this.field3366.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3366[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("lm.am(J)V")
    public void method5132(long arg0) {
        this.field3372 = arg0;
        int var3 = this.field3366.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3373[var4] = 0;
            this.field3369[var4] = 0;
            this.field3367.field4904 = this.field3368[var4];
            this.method5128(var4);
            this.field3366[var4] = this.field3367.field4904;
        }
    }
}
