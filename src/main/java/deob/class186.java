package deob;

@ObfuscatedName("gm")
public class class186 {

    @ObfuscatedName("gm.a")
    public class123 field3000 = new class123((byte[]) null);

    @ObfuscatedName("gm.d")
    public int field3007;

    @ObfuscatedName("gm.v")
    public int[] field3001;

    @ObfuscatedName("gm.r")
    public int[] field3002;

    @ObfuscatedName("gm.z")
    public int[] field3003;

    @ObfuscatedName("gm.t")
    public int[] field3004;

    @ObfuscatedName("gm.n")
    public int field3011;

    @ObfuscatedName("gm.g")
    public long field3005;

    @ObfuscatedName("gm.m")
    public static final byte[] field3008 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class186() {
    }

    public class186(byte[] arg0) {
        this.method3366(arg0);
    }

    @ObfuscatedName("gm.a([B)V")
    public void method3366(byte[] arg0) {
        this.field3000.field2076 = arg0;
        this.field3000.field2071 = 10;
        int var2 = this.field3000.method2584();
        this.field3007 = this.field3000.method2584();
        this.field3011 = 500000;
        this.field3001 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3000.method2400();
            int var5 = this.field3000.method2400();
            if (var4 == 1297379947) {
                this.field3001[var3] = this.field3000.field2071;
                var3++;
            }
            this.field3000.field2071 += var5;
        }
        this.field3005 = 0L;
        this.field3002 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3002[var6] = this.field3001[var6];
        }
        this.field3003 = new int[var2];
        this.field3004 = new int[var2];
    }

    @ObfuscatedName("gm.d()V")
    public void method3399() {
        this.field3000.field2076 = null;
        this.field3001 = null;
        this.field3002 = null;
        this.field3003 = null;
        this.field3004 = null;
    }

    @ObfuscatedName("gm.v()Z")
    public boolean method3368() {
        return this.field3000.field2076 != null;
    }

    @ObfuscatedName("gm.r()I")
    public int method3389() {
        return this.field3002.length;
    }

    @ObfuscatedName("gm.z(I)V")
    public void method3370(int arg0) {
        this.field3000.field2071 = this.field3002[arg0];
    }

    @ObfuscatedName("gm.t(I)V")
    public void method3371(int arg0) {
        this.field3002[arg0] = this.field3000.field2071;
    }

    @ObfuscatedName("gm.n()V")
    public void method3372() {
        this.field3000.field2071 = -1;
    }

    @ObfuscatedName("gm.i(I)V")
    public void method3373(int arg0) {
        int var2 = this.field3000.method2556();
        this.field3003[arg0] += var2;
    }

    @ObfuscatedName("gm.g(I)I")
    public int method3374(int arg0) {
        return this.method3375(arg0);
    }

    @ObfuscatedName("gm.m(I)I")
    public int method3375(int arg0) {
        byte var2 = this.field3000.field2076[this.field3000.field2071];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3004[arg0] = var3;
            this.field3000.field2071++;
        } else {
            var3 = this.field3004[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3395(arg0, var3);
        }
        int var4 = this.field3000.method2556();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3000.field2076[this.field3000.field2071] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3000.field2071++;
                this.field3004[arg0] = var5;
                return this.method3395(arg0, var5);
            }
        }
        this.field3000.field2071 += var4;
        return 0;
    }

    @ObfuscatedName("gm.k(II)I")
    public int method3395(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3008[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3000.method2395() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3000.method2395() << 16;
            }
            return var8;
        }
        int var3 = this.field3000.method2395();
        int var4 = this.field3000.method2556();
        if (var3 == 47) {
            this.field3000.field2071 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3000.method2399();
            var4 -= 3;
            int var6 = this.field3003[arg0];
            this.field3005 += (long) (this.field3011 - var5) * (long) var6;
            this.field3011 = var5;
            this.field3000.field2071 += var4;
            return 2;
        } else {
            this.field3000.field2071 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gm.x(I)J")
    public long method3377(int arg0) {
        return (long) this.field3011 * (long) arg0 + this.field3005;
    }

    @ObfuscatedName("gm.u()I")
    public int method3378() {
        int var1 = this.field3002.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3002[var4] >= 0 && this.field3003[var4] < var3) {
                var2 = var4;
                var3 = this.field3003[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gm.j()Z")
    public boolean method3379() {
        int var1 = this.field3002.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3002[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gm.q(J)V")
    public void method3390(long arg0) {
        this.field3005 = arg0;
        int var3 = this.field3002.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3003[var4] = 0;
            this.field3004[var4] = 0;
            this.field3000.field2071 = this.field3001[var4];
            this.method3373(var4);
            this.field3002[var4] = this.field3000.field2071;
        }
    }
}
