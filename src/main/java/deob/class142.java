package deob;

@ObfuscatedName("es")
public class class142 {

    @ObfuscatedName("es.x")
    public class154 field1985 = new class154((byte[]) null);

    @ObfuscatedName("es.j")
    public int field1993;

    @ObfuscatedName("es.c")
    public int[] field1992;

    @ObfuscatedName("es.d")
    public int[] field1986;

    @ObfuscatedName("es.w")
    public int[] field1987;

    @ObfuscatedName("es.h")
    public int[] field1988;

    @ObfuscatedName("es.u")
    public int field1989;

    @ObfuscatedName("es.g")
    public long field1990;

    @ObfuscatedName("es.y")
    public static final byte[] field1984 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class142() {
    }

    public class142(byte[] arg0) {
        this.method2487(arg0);
    }

    @ObfuscatedName("es.x([B)V")
    public void method2487(byte[] arg0) {
        this.field1985.field2091 = arg0;
        this.field1985.field2086 = 10;
        int var2 = this.field1985.method2745();
        this.field1993 = this.field1985.method2745();
        this.field1989 = 500000;
        this.field1992 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1985.method2644();
            int var5 = this.field1985.method2644();
            if (var4 == 1297379947) {
                this.field1992[var3] = this.field1985.field2086;
                var3++;
            }
            this.field1985.field2086 += var5;
        }
        this.field1990 = 0L;
        this.field1986 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1986[var6] = this.field1992[var6];
        }
        this.field1987 = new int[var2];
        this.field1988 = new int[var2];
    }

    @ObfuscatedName("es.j()V")
    public void method2488() {
        this.field1985.field2091 = null;
        this.field1992 = null;
        this.field1986 = null;
        this.field1987 = null;
        this.field1988 = null;
    }

    @ObfuscatedName("es.c()Z")
    public boolean method2516() {
        return this.field1985.field2091 != null;
    }

    @ObfuscatedName("es.d()I")
    public int method2525() {
        return this.field1986.length;
    }

    @ObfuscatedName("es.w(I)V")
    public void method2491(int arg0) {
        this.field1985.field2086 = this.field1986[arg0];
    }

    @ObfuscatedName("es.u(I)V")
    public void method2492(int arg0) {
        this.field1986[arg0] = this.field1985.field2086;
    }

    @ObfuscatedName("es.y()V")
    public void method2503() {
        this.field1985.field2086 = -1;
    }

    @ObfuscatedName("es.e(I)V")
    public void method2489(int arg0) {
        int var2 = this.field1985.method2655();
        this.field1987[arg0] += var2;
    }

    @ObfuscatedName("es.q(I)I")
    public int method2495(int arg0) {
        return this.method2496(arg0);
    }

    @ObfuscatedName("es.v(I)I")
    public int method2496(int arg0) {
        byte var2 = this.field1985.field2091[this.field1985.field2086];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1988[arg0] = var3;
            this.field1985.field2086++;
        } else {
            var3 = this.field1988[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2497(arg0, var3);
        }
        int var4 = this.field1985.method2655();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1985.field2091[this.field1985.field2086] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1985.field2086++;
                this.field1988[arg0] = var5;
                return this.method2497(arg0, var5);
            }
        }
        this.field1985.field2086 += var4;
        return 0;
    }

    @ObfuscatedName("es.l(II)I")
    public int method2497(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1984[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1985.method2701() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1985.method2701() << 16;
            }
            return var8;
        }
        int var3 = this.field1985.method2701();
        int var4 = this.field1985.method2655();
        if (var3 == 47) {
            this.field1985.field2086 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1985.method2643();
            var4 -= 3;
            int var6 = this.field1987[arg0];
            this.field1990 += (long) (this.field1989 - var5) * (long) var6;
            this.field1989 = var5;
            this.field1985.field2086 += var4;
            return 2;
        } else {
            this.field1985.field2086 += var4;
            return 3;
        }
    }

    @ObfuscatedName("es.s(I)J")
    public long method2498(int arg0) {
        return (long) this.field1989 * (long) arg0 + this.field1990;
    }

    @ObfuscatedName("es.r()I")
    public int method2499() {
        int var1 = this.field1986.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1986[var4] >= 0 && this.field1987[var4] < var3) {
                var2 = var4;
                var3 = this.field1987[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("es.m()Z")
    public boolean method2501() {
        int var1 = this.field1986.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1986[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("es.i(J)V")
    public void method2521(long arg0) {
        this.field1990 = arg0;
        int var3 = this.field1986.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1987[var4] = 0;
            this.field1988[var4] = 0;
            this.field1985.field2086 = this.field1992[var4];
            this.method2489(var4);
            this.field1986[var4] = this.field1985.field2086;
        }
    }
}
