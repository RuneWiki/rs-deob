package deob;

@ObfuscatedName("en")
public class class156 {

    @ObfuscatedName("en.z")
    public class104 field2675 = new class104((byte[]) null);

    @ObfuscatedName("en.n")
    public int field2663;

    @ObfuscatedName("en.u")
    public int[] field2665;

    @ObfuscatedName("en.t")
    public int[] field2666;

    @ObfuscatedName("en.e")
    public int[] field2670;

    @ObfuscatedName("en.a")
    public int[] field2667;

    @ObfuscatedName("en.l")
    public int field2664;

    @ObfuscatedName("en.j")
    public long field2662;

    @ObfuscatedName("en.k")
    public static final byte[] field2671 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class156() {
    }

    public class156(byte[] arg0) {
        this.method3035(arg0);
    }

    @ObfuscatedName("en.z([B)V")
    public void method3035(byte[] arg0) {
        this.field2675.field1819 = arg0;
        this.field2675.field1815 = 10;
        int var2 = this.field2675.method2206();
        this.field2663 = this.field2675.method2206();
        this.field2664 = 500000;
        this.field2665 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2675.method2130();
            int var5 = this.field2675.method2130();
            if (var4 == 1297379947) {
                this.field2665[var3] = this.field2675.field1815;
                var3++;
            }
            this.field2675.field1815 += var5;
        }
        this.field2662 = 0L;
        this.field2666 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2666[var6] = this.field2665[var6];
        }
        this.field2670 = new int[var2];
        this.field2667 = new int[var2];
    }

    @ObfuscatedName("en.n()V")
    public void method3004() {
        this.field2675.field1819 = null;
        this.field2665 = null;
        this.field2666 = null;
        this.field2670 = null;
        this.field2667 = null;
    }

    @ObfuscatedName("en.u()Z")
    public boolean method2997() {
        return this.field2675.field1819 != null;
    }

    @ObfuscatedName("en.t()I")
    public int method3027() {
        return this.field2666.length;
    }

    @ObfuscatedName("en.e(I)V")
    public void method2996(int arg0) {
        this.field2675.field1815 = this.field2666[arg0];
    }

    @ObfuscatedName("en.a(I)V")
    public void method2999(int arg0) {
        this.field2666[arg0] = this.field2675.field1815;
    }

    @ObfuscatedName("en.l()V")
    public void method3000() {
        this.field2675.field1815 = -1;
    }

    @ObfuscatedName("en.v(I)V")
    public void method3001(int arg0) {
        int var2 = this.field2675.method2142();
        this.field2670[arg0] += var2;
    }

    @ObfuscatedName("en.j(I)I")
    public int method3006(int arg0) {
        return this.method3003(arg0);
    }

    @ObfuscatedName("en.k(I)I")
    public int method3003(int arg0) {
        byte var2 = this.field2675.field1819[this.field2675.field1815];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2667[arg0] = var3;
            this.field2675.field1815++;
        } else {
            var3 = this.field2667[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3028(arg0, var3);
        }
        int var4 = this.field2675.method2142();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2675.field1819[this.field2675.field1815] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2675.field1815++;
                this.field2667[arg0] = var5;
                return this.method3028(arg0, var5);
            }
        }
        this.field2675.field1815 += var4;
        return 0;
    }

    @ObfuscatedName("en.g(II)I")
    public int method3028(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2671[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2675.method2257() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2675.method2257() << 16;
            }
            return var8;
        }
        int var3 = this.field2675.method2257();
        int var4 = this.field2675.method2142();
        if (var3 == 47) {
            this.field2675.field1815 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2675.method2167();
            var4 -= 3;
            int var6 = this.field2670[arg0];
            this.field2662 += (long) (this.field2664 - var5) * (long) var6;
            this.field2664 = var5;
            this.field2675.field1815 += var4;
            return 2;
        } else {
            this.field2675.field1815 += var4;
            return 3;
        }
    }

    @ObfuscatedName("en.d(I)J")
    public long method3005(int arg0) {
        return (long) this.field2664 * (long) arg0 + this.field2662;
    }

    @ObfuscatedName("en.b()I")
    public int method3019() {
        int var1 = this.field2666.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2666[var4] >= 0 && this.field2670[var4] < var3) {
                var2 = var4;
                var3 = this.field2670[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("en.i()Z")
    public boolean method3013() {
        int var1 = this.field2666.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2666[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("en.o(J)V")
    public void method3008(long arg0) {
        this.field2662 = arg0;
        int var3 = this.field2666.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2670[var4] = 0;
            this.field2667[var4] = 0;
            this.field2675.field1815 = this.field2665[var4];
            this.method3001(var4);
            this.field2666[var4] = this.field2675.field1815;
        }
    }
}
