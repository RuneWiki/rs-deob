package deob;

@ObfuscatedName("fj")
public class class161 {

    @ObfuscatedName("fj.g")
    public class107 field2702 = new class107((byte[]) null);

    @ObfuscatedName("fj.s")
    public int field2701;

    @ObfuscatedName("fj.h")
    public int[] field2704;

    @ObfuscatedName("fj.m")
    public int[] field2703;

    @ObfuscatedName("fj.u")
    public int[] field2700;

    @ObfuscatedName("fj.j")
    public int[] field2705;

    @ObfuscatedName("fj.b")
    public int field2706;

    @ObfuscatedName("fj.y")
    public long field2708;

    @ObfuscatedName("fj.w")
    public static final byte[] field2712 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class161() {
    }

    public class161(byte[] arg0) {
        this.method2934(arg0);
    }

    @ObfuscatedName("fj.g([B)V")
    public void method2934(byte[] arg0) {
        this.field2702.field1839 = arg0;
        this.field2702.field1835 = 10;
        int var2 = this.field2702.method2166();
        this.field2701 = this.field2702.method2166();
        this.field2706 = 500000;
        this.field2704 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2702.method2286();
            int var5 = this.field2702.method2286();
            if (var4 == 1297379947) {
                this.field2704[var3] = this.field2702.field1835;
                var3++;
            }
            this.field2702.field1835 += var5;
        }
        this.field2708 = 0L;
        this.field2703 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2703[var6] = this.field2704[var6];
        }
        this.field2700 = new int[var2];
        this.field2705 = new int[var2];
    }

    @ObfuscatedName("fj.s()V")
    public void method2935() {
        this.field2702.field1839 = null;
        this.field2704 = null;
        this.field2703 = null;
        this.field2700 = null;
        this.field2705 = null;
    }

    @ObfuscatedName("fj.h()Z")
    public boolean method2936() {
        return this.field2702.field1839 != null;
    }

    @ObfuscatedName("fj.m()I")
    public int method2937() {
        return this.field2703.length;
    }

    @ObfuscatedName("fj.u(I)V")
    public void method2938(int arg0) {
        this.field2702.field1835 = this.field2703[arg0];
    }

    @ObfuscatedName("fj.j(I)V")
    public void method2939(int arg0) {
        this.field2703[arg0] = this.field2702.field1835;
    }

    @ObfuscatedName("fj.b()V")
    public void method2940() {
        this.field2702.field1835 = -1;
    }

    @ObfuscatedName("fj.v(I)V")
    public void method2952(int arg0) {
        int var2 = this.field2702.method2221();
        this.field2700[arg0] += var2;
    }

    @ObfuscatedName("fj.y(I)I")
    public int method2946(int arg0) {
        return this.method2974(arg0);
    }

    @ObfuscatedName("fj.w(I)I")
    public int method2974(int arg0) {
        byte var2 = this.field2702.field1839[this.field2702.field1835];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2705[arg0] = var3;
            this.field2702.field1835++;
        } else {
            var3 = this.field2705[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2942(arg0, var3);
        }
        int var4 = this.field2702.method2221();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2702.field1839[this.field2702.field1835] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2702.field1835++;
                this.field2705[arg0] = var5;
                return this.method2942(arg0, var5);
            }
        }
        this.field2702.field1835 += var4;
        return 0;
    }

    @ObfuscatedName("fj.x(II)I")
    public int method2942(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2712[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2702.method2101() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2702.method2101() << 16;
            }
            return var8;
        }
        int var3 = this.field2702.method2101();
        int var4 = this.field2702.method2221();
        if (var3 == 47) {
            this.field2702.field1835 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2702.method2105();
            var4 -= 3;
            int var6 = this.field2700[arg0];
            this.field2708 += (long) (this.field2706 - var5) * (long) var6;
            this.field2706 = var5;
            this.field2702.field1835 += var4;
            return 2;
        } else {
            this.field2702.field1835 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fj.k(I)J")
    public long method2944(int arg0) {
        return (long) this.field2706 * (long) arg0 + this.field2708;
    }

    @ObfuscatedName("fj.o()I")
    public int method2945() {
        int var1 = this.field2703.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2703[var4] >= 0 && this.field2700[var4] < var3) {
                var2 = var4;
                var3 = this.field2700[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fj.a()Z")
    public boolean method2961() {
        int var1 = this.field2703.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2703[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fj.f(J)V")
    public void method2947(long arg0) {
        this.field2708 = arg0;
        int var3 = this.field2703.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2700[var4] = 0;
            this.field2705[var4] = 0;
            this.field2702.field1835 = this.field2704[var4];
            this.method2952(var4);
            this.field2703[var4] = this.field2702.field1835;
        }
    }
}
