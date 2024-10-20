package deob;

@ObfuscatedName("el")
public class class142 {

    @ObfuscatedName("el.n")
    public class161 field1990 = new class161((byte[]) null);

    @ObfuscatedName("el.d")
    public int field1982;

    @ObfuscatedName("el.m")
    public int[] field1981;

    @ObfuscatedName("el.h")
    public int[] field1979;

    @ObfuscatedName("el.w")
    public int[] field1983;

    @ObfuscatedName("el.r")
    public int[] field1984;

    @ObfuscatedName("el.c")
    public int field1985;

    @ObfuscatedName("el.g")
    public long field1992;

    @ObfuscatedName("el.z")
    public static final byte[] field1988 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class142() {
    }

    public class142(byte[] arg0) {
        this.method2494(arg0);
    }

    @ObfuscatedName("el.n([B)V")
    public void method2494(byte[] arg0) {
        this.field1990.field2291 = arg0;
        this.field1990.field2285 = 10;
        int var2 = this.field1990.method2887();
        this.field1982 = this.field1990.method2887();
        this.field1985 = 500000;
        this.field1981 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1990.method2785();
            int var5 = this.field1990.method2785();
            if (var4 == 1297379947) {
                this.field1981[var3] = this.field1990.field2285;
                var3++;
            }
            this.field1990.field2285 += var5;
        }
        this.field1992 = 0L;
        this.field1979 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1979[var6] = this.field1981[var6];
        }
        this.field1983 = new int[var2];
        this.field1984 = new int[var2];
    }

    @ObfuscatedName("el.d()V")
    public void method2495() {
        this.field1990.field2291 = null;
        this.field1981 = null;
        this.field1979 = null;
        this.field1983 = null;
        this.field1984 = null;
    }

    @ObfuscatedName("el.m()Z")
    public boolean method2496() {
        return this.field1990.field2291 != null;
    }

    @ObfuscatedName("el.h()I")
    public int method2497() {
        return this.field1979.length;
    }

    @ObfuscatedName("el.w(I)V")
    public void method2498(int arg0) {
        this.field1990.field2285 = this.field1979[arg0];
    }

    @ObfuscatedName("el.r(I)V")
    public void method2499(int arg0) {
        this.field1979[arg0] = this.field1990.field2285;
    }

    @ObfuscatedName("el.c()V")
    public void method2493() {
        this.field1990.field2285 = -1;
    }

    @ObfuscatedName("el.z(I)V")
    public void method2531(int arg0) {
        int var2 = this.field1990.method2932();
        this.field1983[arg0] += var2;
    }

    @ObfuscatedName("el.q(I)I")
    public int method2506(int arg0) {
        return this.method2502(arg0);
    }

    @ObfuscatedName("el.l(I)I")
    public int method2502(int arg0) {
        byte var2 = this.field1990.field2291[this.field1990.field2285];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1984[arg0] = var3;
            this.field1990.field2285++;
        } else {
            var3 = this.field1984[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2524(arg0, var3);
        }
        int var4 = this.field1990.method2932();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1990.field2291[this.field1990.field2285] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1990.field2285++;
                this.field1984[arg0] = var5;
                return this.method2524(arg0, var5);
            }
        }
        this.field1990.field2285 += var4;
        return 0;
    }

    @ObfuscatedName("el.y(II)I")
    public int method2524(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1988[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1990.method2823() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1990.method2823() << 16;
            }
            return var8;
        }
        int var3 = this.field1990.method2823();
        int var4 = this.field1990.method2932();
        if (var3 == 47) {
            this.field1990.field2285 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1990.method2784();
            var4 -= 3;
            int var6 = this.field1983[arg0];
            this.field1992 += (long) (this.field1985 - var5) * (long) var6;
            this.field1985 = var5;
            this.field1990.field2285 += var4;
            return 2;
        } else {
            this.field1990.field2285 += var4;
            return 3;
        }
    }

    @ObfuscatedName("el.e(I)J")
    public long method2504(int arg0) {
        return (long) this.field1985 * (long) arg0 + this.field1992;
    }

    @ObfuscatedName("el.x()I")
    public int method2505() {
        int var1 = this.field1979.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1979[var4] >= 0 && this.field1983[var4] < var3) {
                var2 = var4;
                var3 = this.field1983[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("el.f()Z")
    public boolean method2538() {
        int var1 = this.field1979.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1979[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("el.s(J)V")
    public void method2507(long arg0) {
        this.field1992 = arg0;
        int var3 = this.field1979.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1983[var4] = 0;
            this.field1984[var4] = 0;
            this.field1990.field2285 = this.field1981[var4];
            this.method2531(var4);
            this.field1979[var4] = this.field1990.field2285;
        }
    }
}
