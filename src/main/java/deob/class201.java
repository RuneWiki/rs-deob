package deob;

@ObfuscatedName("gr")
public class class201 {

    @ObfuscatedName("gr.a")
    public class300 field2448 = new class300((byte[]) null);

    @ObfuscatedName("gr.t")
    public int field2441;

    @ObfuscatedName("gr.n")
    public int[] field2442;

    @ObfuscatedName("gr.q")
    public int[] field2443;

    @ObfuscatedName("gr.v")
    public int[] field2444;

    @ObfuscatedName("gr.l")
    public int[] field2445;

    @ObfuscatedName("gr.c")
    public int field2446;

    @ObfuscatedName("gr.i")
    public long field2449;

    @ObfuscatedName("gr.d")
    public static final byte[] field2440 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class201() {
    }

    public class201(byte[] arg0) {
        this.method3593(arg0);
    }

    @ObfuscatedName("gr.a([B)V")
    public void method3593(byte[] arg0) {
        this.field2448.field3699 = arg0;
        this.field2448.field3694 = 10;
        int var2 = this.field2448.method5166();
        this.field2441 = this.field2448.method5166();
        this.field2446 = 500000;
        this.field2442 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2448.method5155();
            int var5 = this.field2448.method5155();
            if (var4 == 1297379947) {
                this.field2442[var3] = this.field2448.field3694;
                var3++;
            }
            this.field2448.field3694 += var5;
        }
        this.field2449 = 0L;
        this.field2443 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2443[var6] = this.field2442[var6];
        }
        this.field2444 = new int[var2];
        this.field2445 = new int[var2];
    }

    @ObfuscatedName("gr.t()V")
    public void method3585() {
        this.field2448.field3699 = null;
        this.field2442 = null;
        this.field2443 = null;
        this.field2444 = null;
        this.field2445 = null;
    }

    @ObfuscatedName("gr.n()Z")
    public boolean method3636() {
        return this.field2448.field3699 != null;
    }

    @ObfuscatedName("gr.q()I")
    public int method3587() {
        return this.field2443.length;
    }

    @ObfuscatedName("gr.v(I)V")
    public void method3588(int arg0) {
        this.field2448.field3694 = this.field2443[arg0];
    }

    @ObfuscatedName("gr.l(I)V")
    public void method3589(int arg0) {
        this.field2443[arg0] = this.field2448.field3694;
    }

    @ObfuscatedName("gr.c()V")
    public void method3590() {
        this.field2448.field3694 = -1;
    }

    @ObfuscatedName("gr.o(I)V")
    public void method3591(int arg0) {
        int var2 = this.field2448.method5269();
        this.field2444[arg0] += var2;
    }

    @ObfuscatedName("gr.i(I)I")
    public int method3592(int arg0) {
        return this.method3637(arg0);
    }

    @ObfuscatedName("gr.d(I)I")
    public int method3637(int arg0) {
        byte var2 = this.field2448.field3699[this.field2448.field3694];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2445[arg0] = var3;
            this.field2448.field3694++;
        } else {
            var3 = this.field2445[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3605(arg0, var3);
        }
        int var4 = this.field2448.method5269();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2448.field3699[this.field2448.field3694] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2448.field3694++;
                this.field2445[arg0] = var5;
                return this.method3605(arg0, var5);
            }
        }
        this.field2448.field3694 += var4;
        return 0;
    }

    @ObfuscatedName("gr.m(II)I")
    public int method3605(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2440[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2448.method5123() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2448.method5123() << 16;
            }
            return var8;
        }
        int var3 = this.field2448.method5123();
        int var4 = this.field2448.method5269();
        if (var3 == 47) {
            this.field2448.field3694 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2448.method5127();
            var4 -= 3;
            int var6 = this.field2444[arg0];
            this.field2449 += (long) (this.field2446 - var5) * (long) var6;
            this.field2446 = var5;
            this.field2448.field3694 += var4;
            return 2;
        } else {
            this.field2448.field3694 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gr.p(I)J")
    public long method3595(int arg0) {
        return (long) this.field2446 * (long) arg0 + this.field2449;
    }

    @ObfuscatedName("gr.h()I")
    public int method3596() {
        int var1 = this.field2443.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2443[var4] >= 0 && this.field2444[var4] < var3) {
                var2 = var4;
                var3 = this.field2444[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gr.k()Z")
    public boolean method3584() {
        int var1 = this.field2443.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2443[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gr.x(J)V")
    public void method3598(long arg0) {
        this.field2449 = arg0;
        int var3 = this.field2443.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2444[var4] = 0;
            this.field2445[var4] = 0;
            this.field2448.field3694 = this.field2442[var4];
            this.method3591(var4);
            this.field2443[var4] = this.field2448.field3694;
        }
    }
}
