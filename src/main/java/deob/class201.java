package deob;

@ObfuscatedName("gp")
public class class201 {

    @ObfuscatedName("gp.c")
    public class300 field2442 = new class300((byte[]) null);

    @ObfuscatedName("gp.x")
    public int field2439;

    @ObfuscatedName("gp.t")
    public int[] field2437;

    @ObfuscatedName("gp.g")
    public int[] field2438;

    @ObfuscatedName("gp.l")
    public int[] field2440;

    @ObfuscatedName("gp.u")
    public int[] field2444;

    @ObfuscatedName("gp.j")
    public int field2436;

    @ObfuscatedName("gp.d")
    public long field2443;

    @ObfuscatedName("gp.z")
    public static final byte[] field2435 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class201() {
    }

    public class201(byte[] arg0) {
        this.method3533(arg0);
    }

    @ObfuscatedName("gp.c([B)V")
    public void method3533(byte[] arg0) {
        this.field2442.field3694 = arg0;
        this.field2442.field3696 = 10;
        int var2 = this.field2442.method5304();
        this.field2439 = this.field2442.method5304();
        this.field2436 = 500000;
        this.field2437 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2442.method5208();
            int var5 = this.field2442.method5208();
            if (var4 == 1297379947) {
                this.field2437[var3] = this.field2442.field3696;
                var3++;
            }
            this.field2442.field3696 += var5;
        }
        this.field2443 = 0L;
        this.field2438 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2438[var6] = this.field2437[var6];
        }
        this.field2440 = new int[var2];
        this.field2444 = new int[var2];
    }

    @ObfuscatedName("gp.x()V")
    public void method3534() {
        this.field2442.field3694 = null;
        this.field2437 = null;
        this.field2438 = null;
        this.field2440 = null;
        this.field2444 = null;
    }

    @ObfuscatedName("gp.t()Z")
    public boolean method3568() {
        return this.field2442.field3694 != null;
    }

    @ObfuscatedName("gp.g()I")
    public int method3536() {
        return this.field2438.length;
    }

    @ObfuscatedName("gp.l(I)V")
    public void method3584(int arg0) {
        this.field2442.field3696 = this.field2438[arg0];
    }

    @ObfuscatedName("gp.u(I)V")
    public void method3538(int arg0) {
        this.field2438[arg0] = this.field2442.field3696;
    }

    @ObfuscatedName("gp.j()V")
    public void method3539() {
        this.field2442.field3696 = -1;
    }

    @ObfuscatedName("gp.v(I)V")
    public void method3540(int arg0) {
        int var2 = this.field2442.method5121();
        this.field2440[arg0] += var2;
    }

    @ObfuscatedName("gp.d(I)I")
    public int method3556(int arg0) {
        return this.method3557(arg0);
    }

    @ObfuscatedName("gp.z(I)I")
    public int method3557(int arg0) {
        byte var2 = this.field2442.field3694[this.field2442.field3696];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2444[arg0] = var3;
            this.field2442.field3696++;
        } else {
            var3 = this.field2444[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3542(arg0, var3);
        }
        int var4 = this.field2442.method5121();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2442.field3694[this.field2442.field3696] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2442.field3696++;
                this.field2444[arg0] = var5;
                return this.method3542(arg0, var5);
            }
        }
        this.field2442.field3696 += var4;
        return 0;
    }

    @ObfuscatedName("gp.s(II)I")
    public int method3542(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2435[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2442.method5103() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2442.method5103() << 16;
            }
            return var8;
        }
        int var3 = this.field2442.method5103();
        int var4 = this.field2442.method5121();
        if (var3 == 47) {
            this.field2442.field3696 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2442.method5107();
            var4 -= 3;
            int var6 = this.field2440[arg0];
            this.field2443 += (long) (this.field2436 - var5) * (long) var6;
            this.field2436 = var5;
            this.field2442.field3696 += var4;
            return 2;
        } else {
            this.field2442.field3696 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gp.p(I)J")
    public long method3574(int arg0) {
        return (long) this.field2436 * (long) arg0 + this.field2443;
    }

    @ObfuscatedName("gp.e()I")
    public int method3544() {
        int var1 = this.field2438.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2438[var4] >= 0 && this.field2440[var4] < var3) {
                var2 = var4;
                var3 = this.field2440[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gp.i()Z")
    public boolean method3545() {
        int var1 = this.field2438.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2438[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gp.q(J)V")
    public void method3546(long arg0) {
        this.field2443 = arg0;
        int var3 = this.field2438.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2440[var4] = 0;
            this.field2444[var4] = 0;
            this.field2442.field3696 = this.field2437[var4];
            this.method3540(var4);
            this.field2438[var4] = this.field2442.field3696;
        }
    }
}
