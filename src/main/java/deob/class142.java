package deob;

@ObfuscatedName("ec")
public class class142 {

    @ObfuscatedName("ec.b")
    public class154 field1984 = new class154((byte[]) null);

    @ObfuscatedName("ec.l")
    public int field1975;

    @ObfuscatedName("ec.i")
    public int[] field1983;

    @ObfuscatedName("ec.t")
    public int[] field1980;

    @ObfuscatedName("ec.k")
    public int[] field1971;

    @ObfuscatedName("ec.h")
    public int[] field1976;

    @ObfuscatedName("ec.n")
    public int field1977;

    @ObfuscatedName("ec.a")
    public long field1979;

    @ObfuscatedName("ec.r")
    public static final byte[] field1972 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class142() {
    }

    public class142(byte[] arg0) {
        this.method2552(arg0);
    }

    @ObfuscatedName("ec.b([B)V")
    public void method2552(byte[] arg0) {
        this.field1984.field2083 = arg0;
        this.field1984.field2085 = 10;
        int var2 = this.field1984.method2801();
        this.field1975 = this.field1984.method2801();
        this.field1977 = 500000;
        this.field1983 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1984.method2683();
            int var5 = this.field1984.method2683();
            if (var4 == 1297379947) {
                this.field1983[var3] = this.field1984.field2085;
                var3++;
            }
            this.field1984.field2085 += var5;
        }
        this.field1979 = 0L;
        this.field1980 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1980[var6] = this.field1983[var6];
        }
        this.field1971 = new int[var2];
        this.field1976 = new int[var2];
    }

    @ObfuscatedName("ec.l()V")
    public void method2524() {
        this.field1984.field2083 = null;
        this.field1983 = null;
        this.field1980 = null;
        this.field1971 = null;
        this.field1976 = null;
    }

    @ObfuscatedName("ec.i()Z")
    public boolean method2525() {
        return this.field1984.field2083 != null;
    }

    @ObfuscatedName("ec.t()I")
    public int method2526() {
        return this.field1980.length;
    }

    @ObfuscatedName("ec.k(I)V")
    public void method2527(int arg0) {
        this.field1984.field2085 = this.field1980[arg0];
    }

    @ObfuscatedName("ec.x(I)V")
    public void method2542(int arg0) {
        this.field1980[arg0] = this.field1984.field2085;
    }

    @ObfuscatedName("ec.z()V")
    public void method2529() {
        this.field1984.field2085 = -1;
    }

    @ObfuscatedName("ec.p(I)V")
    public void method2530(int arg0) {
        int var2 = this.field1984.method2694();
        this.field1971[arg0] += var2;
    }

    @ObfuscatedName("ec.s(I)I")
    public int method2531(int arg0) {
        return this.method2545(arg0);
    }

    @ObfuscatedName("ec.o(I)I")
    public int method2545(int arg0) {
        byte var2 = this.field1984.field2083[this.field1984.field2085];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1976[arg0] = var3;
            this.field1984.field2085++;
        } else {
            var3 = this.field1976[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2557(arg0, var3);
        }
        int var4 = this.field1984.method2694();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1984.field2083[this.field1984.field2085] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1984.field2085++;
                this.field1976[arg0] = var5;
                return this.method2557(arg0, var5);
            }
        }
        this.field1984.field2085 += var4;
        return 0;
    }

    @ObfuscatedName("ec.y(II)I")
    public int method2557(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1972[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1984.method2678() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1984.method2678() << 16;
            }
            return var8;
        }
        int var3 = this.field1984.method2678();
        int var4 = this.field1984.method2694();
        if (var3 == 47) {
            this.field1984.field2085 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1984.method2682();
            var4 -= 3;
            int var6 = this.field1971[arg0];
            this.field1979 += (long) (this.field1977 - var5) * (long) var6;
            this.field1977 = var5;
            this.field1984.field2085 += var4;
            return 2;
        } else {
            this.field1984.field2085 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ec.w(I)J")
    public long method2534(int arg0) {
        return (long) this.field1977 * (long) arg0 + this.field1979;
    }

    @ObfuscatedName("ec.m()I")
    public int method2537() {
        int var1 = this.field1980.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1980[var4] >= 0 && this.field1971[var4] < var3) {
                var2 = var4;
                var3 = this.field1971[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ec.u()Z")
    public boolean method2536() {
        int var1 = this.field1980.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1980[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ec.q(J)V")
    public void method2546(long arg0) {
        this.field1979 = arg0;
        int var3 = this.field1980.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1971[var4] = 0;
            this.field1976[var4] = 0;
            this.field1984.field2085 = this.field1983[var4];
            this.method2530(var4);
            this.field1980[var4] = this.field1984.field2085;
        }
    }
}
