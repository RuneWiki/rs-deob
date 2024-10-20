package deob;

@ObfuscatedName("hs")
public class class233 {

    @ObfuscatedName("hs.g")
    public class195 field2765 = new class195((byte[]) null);

    @ObfuscatedName("hs.e")
    public int field2752;

    @ObfuscatedName("hs.b")
    public int[] field2754;

    @ObfuscatedName("hs.z")
    public int[] field2757;

    @ObfuscatedName("hs.n")
    public int[] field2756;

    @ObfuscatedName("hs.l")
    public int[] field2764;

    @ObfuscatedName("hs.s")
    public int field2758;

    @ObfuscatedName("hs.c")
    public long field2760;

    @ObfuscatedName("hs.h")
    public static final byte[] field2761 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class233() {
    }

    public class233(byte[] arg0) {
        this.method4026(arg0);
    }

    @ObfuscatedName("hs.g([B)V")
    public void method4026(byte[] arg0) {
        this.field2765.field2563 = arg0;
        this.field2765.field2562 = 10;
        int var2 = this.field2765.method3310();
        this.field2752 = this.field2765.method3310();
        this.field2758 = 500000;
        this.field2754 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2765.method3472();
            int var5 = this.field2765.method3472();
            if (var4 == 1297379947) {
                this.field2754[var3] = this.field2765.field2562;
                var3++;
            }
            this.field2765.field2562 += var5;
        }
        this.field2760 = 0L;
        this.field2757 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2757[var6] = this.field2754[var6];
        }
        this.field2756 = new int[var2];
        this.field2764 = new int[var2];
    }

    @ObfuscatedName("hs.e()V")
    public void method4027() {
        this.field2765.field2563 = null;
        this.field2754 = null;
        this.field2757 = null;
        this.field2756 = null;
        this.field2764 = null;
    }

    @ObfuscatedName("hs.b()Z")
    public boolean method4028() {
        return this.field2765.field2563 != null;
    }

    @ObfuscatedName("hs.z()I")
    public int method4040() {
        return this.field2757.length;
    }

    @ObfuscatedName("hs.n(I)V")
    public void method4030(int arg0) {
        this.field2765.field2562 = this.field2757[arg0];
    }

    @ObfuscatedName("hs.l(I)V")
    public void method4031(int arg0) {
        this.field2757[arg0] = this.field2765.field2562;
    }

    @ObfuscatedName("hs.s()V")
    public void method4051() {
        this.field2765.field2562 = -1;
    }

    @ObfuscatedName("hs.y(I)V")
    public void method4032(int arg0) {
        int var2 = this.field2765.method3390();
        this.field2756[arg0] += var2;
    }

    @ObfuscatedName("hs.c(I)I")
    public int method4033(int arg0) {
        return this.method4034(arg0);
    }

    @ObfuscatedName("hs.o(I)I")
    public int method4034(int arg0) {
        byte var2 = this.field2765.field2563[this.field2765.field2562];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2764[arg0] = var3;
            this.field2765.field2562++;
        } else {
            var3 = this.field2764[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method4025(arg0, var3);
        }
        int var4 = this.field2765.method3390();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2765.field2563[this.field2765.field2562] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2765.field2562++;
                this.field2764[arg0] = var5;
                return this.method4025(arg0, var5);
            }
        }
        this.field2765.field2562 += var4;
        return 0;
    }

    @ObfuscatedName("hs.d(II)I")
    public int method4025(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2761[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2765.method3332() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2765.method3332() << 16;
            }
            return var8;
        }
        int var3 = this.field2765.method3332();
        int var4 = this.field2765.method3390();
        if (var3 == 47) {
            this.field2765.field2562 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2765.method3312();
            var4 -= 3;
            int var6 = this.field2756[arg0];
            this.field2760 += (long) (this.field2758 - var5) * (long) var6;
            this.field2758 = var5;
            this.field2765.field2562 += var4;
            return 2;
        } else {
            this.field2765.field2562 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hs.r(I)J")
    public long method4036(int arg0) {
        return (long) this.field2758 * (long) arg0 + this.field2760;
    }

    @ObfuscatedName("hs.p()I")
    public int method4038() {
        int var1 = this.field2757.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2757[var4] >= 0 && this.field2756[var4] < var3) {
                var2 = var4;
                var3 = this.field2756[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hs.q()Z")
    public boolean method4076() {
        int var1 = this.field2757.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2757[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hs.f(J)V")
    public void method4039(long arg0) {
        this.field2760 = arg0;
        int var3 = this.field2757.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2756[var4] = 0;
            this.field2764[var4] = 0;
            this.field2765.field2562 = this.field2754[var4];
            this.method4032(var4);
            this.field2757[var4] = this.field2765.field2562;
        }
    }
}
