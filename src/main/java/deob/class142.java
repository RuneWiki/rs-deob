package deob;

@ObfuscatedName("et")
public class class142 {

    @ObfuscatedName("et.s")
    public class154 field1995 = new class154((byte[]) null);

    @ObfuscatedName("et.c")
    public int field1988;

    @ObfuscatedName("et.f")
    public int[] field1989;

    @ObfuscatedName("et.h")
    public int[] field1996;

    @ObfuscatedName("et.a")
    public int[] field1998;

    @ObfuscatedName("et.g")
    public int[] field1992;

    @ObfuscatedName("et.k")
    public int field1987;

    @ObfuscatedName("et.b")
    public long field1991;

    @ObfuscatedName("et.x")
    public static final byte[] field1993 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class142() {
    }

    public class142(byte[] arg0) {
        this.method2439(arg0);
    }

    @ObfuscatedName("et.s([B)V")
    public void method2439(byte[] arg0) {
        this.field1995.field2100 = arg0;
        this.field1995.field2098 = 10;
        int var2 = this.field1995.method2541();
        this.field1988 = this.field1995.method2541();
        this.field1987 = 500000;
        this.field1989 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1995.method2550();
            int var5 = this.field1995.method2550();
            if (var4 == 1297379947) {
                this.field1989[var3] = this.field1995.field2098;
                var3++;
            }
            this.field1995.field2098 += var5;
        }
        this.field1991 = 0L;
        this.field1996 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1996[var6] = this.field1989[var6];
        }
        this.field1998 = new int[var2];
        this.field1992 = new int[var2];
    }

    @ObfuscatedName("et.c()V")
    public void method2396() {
        this.field1995.field2100 = null;
        this.field1989 = null;
        this.field1996 = null;
        this.field1998 = null;
        this.field1992 = null;
    }

    @ObfuscatedName("et.f()Z")
    public boolean method2401() {
        return this.field1995.field2100 != null;
    }

    @ObfuscatedName("et.g()I")
    public int method2397() {
        return this.field1996.length;
    }

    @ObfuscatedName("et.k(I)V")
    public void method2399(int arg0) {
        this.field1995.field2098 = this.field1996[arg0];
    }

    @ObfuscatedName("et.u(I)V")
    public void method2400(int arg0) {
        this.field1996[arg0] = this.field1995.field2098;
    }

    @ObfuscatedName("et.b()V")
    public void method2419() {
        this.field1995.field2098 = -1;
    }

    @ObfuscatedName("et.x(I)V")
    public void method2402(int arg0) {
        int var2 = this.field1995.method2674();
        this.field1998[arg0] += var2;
    }

    @ObfuscatedName("et.r(I)I")
    public int method2395(int arg0) {
        return this.method2442(arg0);
    }

    @ObfuscatedName("et.n(I)I")
    public int method2442(int arg0) {
        byte var2 = this.field1995.field2100[this.field1995.field2098];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1992[arg0] = var3;
            this.field1995.field2098++;
        } else {
            var3 = this.field1992[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2404(arg0, var3);
        }
        int var4 = this.field1995.method2674();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1995.field2100[this.field1995.field2098] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1995.field2098++;
                this.field1992[arg0] = var5;
                return this.method2404(arg0, var5);
            }
        }
        this.field1995.field2098 += var4;
        return 0;
    }

    @ObfuscatedName("et.m(II)I")
    public int method2404(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1993[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1995.method2545() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1995.method2545() << 16;
            }
            return var8;
        }
        int var3 = this.field1995.method2545();
        int var4 = this.field1995.method2674();
        if (var3 == 47) {
            this.field1995.field2098 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1995.method2549();
            var4 -= 3;
            int var6 = this.field1998[arg0];
            this.field1991 += (long) (this.field1987 - var5) * (long) var6;
            this.field1987 = var5;
            this.field1995.field2098 += var4;
            return 2;
        } else {
            this.field1995.field2098 += var4;
            return 3;
        }
    }

    @ObfuscatedName("et.j(I)J")
    public long method2405(int arg0) {
        return (long) this.field1987 * (long) arg0 + this.field1991;
    }

    @ObfuscatedName("et.w()I")
    public int method2406() {
        int var1 = this.field1996.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1996[var4] >= 0 && this.field1998[var4] < var3) {
                var2 = var4;
                var3 = this.field1998[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("et.p()Z")
    public boolean method2407() {
        int var1 = this.field1996.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1996[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("et.o(J)V")
    public void method2408(long arg0) {
        this.field1991 = arg0;
        int var3 = this.field1996.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1998[var4] = 0;
            this.field1992[var4] = 0;
            this.field1995.field2098 = this.field1989[var4];
            this.method2402(var4);
            this.field1996[var4] = this.field1995.field2098;
        }
    }
}
