package deob;

@ObfuscatedName("fk")
public class class160 {

    @ObfuscatedName("fk.g")
    public class107 field2702 = new class107((byte[]) null);

    @ObfuscatedName("fk.v")
    public int field2698;

    @ObfuscatedName("fk.z")
    public int[] field2700;

    @ObfuscatedName("fk.h")
    public int[] field2701;

    @ObfuscatedName("fk.k")
    public int[] field2708;

    @ObfuscatedName("fk.l")
    public int[] field2703;

    @ObfuscatedName("fk.e")
    public int field2705;

    @ObfuscatedName("fk.n")
    public long field2706;

    @ObfuscatedName("fk.f")
    public static final byte[] field2707 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class160() {
    }

    public class160(byte[] arg0) {
        this.method3008(arg0);
    }

    @ObfuscatedName("fk.g([B)V")
    public void method3008(byte[] arg0) {
        this.field2702.field1840 = arg0;
        this.field2702.field1839 = 10;
        int var2 = this.field2702.method2141();
        this.field2698 = this.field2702.method2141();
        this.field2705 = 500000;
        this.field2700 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2702.method2144();
            int var5 = this.field2702.method2144();
            if (var4 == 1297379947) {
                this.field2700[var3] = this.field2702.field1839;
                var3++;
            }
            this.field2702.field1839 += var5;
        }
        this.field2706 = 0L;
        this.field2701 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2701[var6] = this.field2700[var6];
        }
        this.field2708 = new int[var2];
        this.field2703 = new int[var2];
    }

    @ObfuscatedName("fk.v()V")
    public void method2966() {
        this.field2702.field1840 = null;
        this.field2700 = null;
        this.field2701 = null;
        this.field2708 = null;
        this.field2703 = null;
    }

    @ObfuscatedName("fk.z()Z")
    public boolean method3011() {
        return this.field2702.field1840 != null;
    }

    @ObfuscatedName("fk.h()I")
    public int method2988() {
        return this.field2701.length;
    }

    @ObfuscatedName("fk.k(I)V")
    public void method3004(int arg0) {
        this.field2702.field1839 = this.field2701[arg0];
    }

    @ObfuscatedName("fk.l(I)V")
    public void method2996(int arg0) {
        this.field2701[arg0] = this.field2702.field1839;
    }

    @ObfuscatedName("fk.e()V")
    public void method2971() {
        this.field2702.field1839 = -1;
    }

    @ObfuscatedName("fk.j(I)V")
    public void method2969(int arg0) {
        int var2 = this.field2702.method2154();
        this.field2708[arg0] += var2;
    }

    @ObfuscatedName("fk.n(I)I")
    public int method2972(int arg0) {
        return this.method2974(arg0);
    }

    @ObfuscatedName("fk.f(I)I")
    public int method2974(int arg0) {
        byte var2 = this.field2702.field1840[this.field2702.field1839];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2703[arg0] = var3;
            this.field2702.field1839++;
        } else {
            var3 = this.field2703[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2975(arg0, var3);
        }
        int var4 = this.field2702.method2154();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2702.field1840[this.field2702.field1839] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2702.field1839++;
                this.field2703[arg0] = var5;
                return this.method2975(arg0, var5);
            }
        }
        this.field2702.field1839 += var4;
        return 0;
    }

    @ObfuscatedName("fk.a(II)I")
    public int method2975(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2707[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2702.method2139() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2702.method2139() << 16;
            }
            return var8;
        }
        int var3 = this.field2702.method2139();
        int var4 = this.field2702.method2154();
        if (var3 == 47) {
            this.field2702.field1839 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2702.method2230();
            var4 -= 3;
            int var6 = this.field2708[arg0];
            this.field2706 += (long) (this.field2705 - var5) * (long) var6;
            this.field2705 = var5;
            this.field2702.field1839 += var4;
            return 2;
        } else {
            this.field2702.field1839 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fk.i(I)J")
    public long method3001(int arg0) {
        return (long) this.field2705 * (long) arg0 + this.field2706;
    }

    @ObfuscatedName("fk.y()I")
    public int method2977() {
        int var1 = this.field2701.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2701[var4] >= 0 && this.field2708[var4] < var3) {
                var2 = var4;
                var3 = this.field2708[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fk.p()Z")
    public boolean method2978() {
        int var1 = this.field2701.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2701[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fk.q(J)V")
    public void method2979(long arg0) {
        this.field2706 = arg0;
        int var3 = this.field2701.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2708[var4] = 0;
            this.field2703[var4] = 0;
            this.field2702.field1839 = this.field2700[var4];
            this.method2969(var4);
            this.field2701[var4] = this.field2702.field1839;
        }
    }
}
