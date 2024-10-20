package deob;

@ObfuscatedName("fr")
public class class173 {

    @ObfuscatedName("fr.n")
    public class111 field2838 = new class111((byte[]) null);

    @ObfuscatedName("fr.d")
    public int field2848;

    @ObfuscatedName("fr.z")
    public int[] field2839;

    @ObfuscatedName("fr.y")
    public int[] field2841;

    @ObfuscatedName("fr.e")
    public int[] field2842;

    @ObfuscatedName("fr.g")
    public int[] field2843;

    @ObfuscatedName("fr.f")
    public int field2844;

    @ObfuscatedName("fr.a")
    public long field2846;

    @ObfuscatedName("fr.h")
    public static final byte[] field2851 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class173() {
    }

    public class173(byte[] arg0) {
        this.method3241(arg0);
    }

    @ObfuscatedName("fr.n([B)V")
    public void method3241(byte[] arg0) {
        this.field2838.field1888 = arg0;
        this.field2838.field1889 = 10;
        int var2 = this.field2838.method2231();
        this.field2848 = this.field2838.method2231();
        this.field2844 = 500000;
        this.field2839 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2838.method2233();
            int var5 = this.field2838.method2233();
            if (var4 == 1297379947) {
                this.field2839[var3] = this.field2838.field1889;
                var3++;
            }
            this.field2838.field1889 += var5;
        }
        this.field2846 = 0L;
        this.field2841 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2841[var6] = this.field2839[var6];
        }
        this.field2842 = new int[var2];
        this.field2843 = new int[var2];
    }

    @ObfuscatedName("fr.d()V")
    public void method3242() {
        this.field2838.field1888 = null;
        this.field2839 = null;
        this.field2841 = null;
        this.field2842 = null;
        this.field2843 = null;
    }

    @ObfuscatedName("fr.z()Z")
    public boolean method3269() {
        return this.field2838.field1888 != null;
    }

    @ObfuscatedName("fr.y()I")
    public int method3239() {
        return this.field2841.length;
    }

    @ObfuscatedName("fr.e(I)V")
    public void method3245(int arg0) {
        this.field2838.field1889 = this.field2841[arg0];
    }

    @ObfuscatedName("fr.g(I)V")
    public void method3271(int arg0) {
        this.field2841[arg0] = this.field2838.field1889;
    }

    @ObfuscatedName("fr.f()V")
    public void method3244() {
        this.field2838.field1889 = -1;
    }

    @ObfuscatedName("fr.m(I)V")
    public void method3249(int arg0) {
        int var2 = this.field2838.method2414();
        this.field2842[arg0] += var2;
    }

    @ObfuscatedName("fr.a(I)I")
    public int method3248(int arg0) {
        return this.method3256(arg0);
    }

    @ObfuscatedName("fr.h(I)I")
    public int method3256(int arg0) {
        byte var2 = this.field2838.field1888[this.field2838.field1889];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2843[arg0] = var3;
            this.field2838.field1889++;
        } else {
            var3 = this.field2843[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3250(arg0, var3);
        }
        int var4 = this.field2838.method2414();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2838.field1888[this.field2838.field1889] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2838.field1889++;
                this.field2843[arg0] = var5;
                return this.method3250(arg0, var5);
            }
        }
        this.field2838.field1889 += var4;
        return 0;
    }

    @ObfuscatedName("fr.l(II)I")
    public int method3250(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2851[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2838.method2228() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2838.method2228() << 16;
            }
            return var8;
        }
        int var3 = this.field2838.method2228();
        int var4 = this.field2838.method2414();
        if (var3 == 47) {
            this.field2838.field1889 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2838.method2232();
            var4 -= 3;
            int var6 = this.field2842[arg0];
            this.field2846 += (long) (this.field2844 - var5) * (long) var6;
            this.field2844 = var5;
            this.field2838.field1889 += var4;
            return 2;
        } else {
            this.field2838.field1889 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fr.u(I)J")
    public long method3251(int arg0) {
        return (long) this.field2844 * (long) arg0 + this.field2846;
    }

    @ObfuscatedName("fr.q()I")
    public int method3252() {
        int var1 = this.field2841.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2841[var4] >= 0 && this.field2842[var4] < var3) {
                var2 = var4;
                var3 = this.field2842[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fr.k()Z")
    public boolean method3253() {
        int var1 = this.field2841.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2841[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fr.x(J)V")
    public void method3254(long arg0) {
        this.field2846 = arg0;
        int var3 = this.field2841.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2842[var4] = 0;
            this.field2843[var4] = 0;
            this.field2838.field1889 = this.field2839[var4];
            this.method3249(var4);
            this.field2841[var4] = this.field2838.field1889;
        }
    }
}
