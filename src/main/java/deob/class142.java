package deob;

@ObfuscatedName("em")
public class class142 {

    @ObfuscatedName("em.f")
    public class154 field2011 = new class154((byte[]) null);

    @ObfuscatedName("em.i")
    public int field1999;

    @ObfuscatedName("em.u")
    public int[] field2000;

    @ObfuscatedName("em.h")
    public int[] field2001;

    @ObfuscatedName("em.r")
    public int[] field1998;

    @ObfuscatedName("em.o")
    public int[] field2003;

    @ObfuscatedName("em.l")
    public int field2004;

    @ObfuscatedName("em.m")
    public long field2002;

    @ObfuscatedName("em.w")
    public static final byte[] field2010 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class142() {
    }

    public class142(byte[] arg0) {
        this.method2505(arg0);
    }

    @ObfuscatedName("em.f([B)V")
    public void method2505(byte[] arg0) {
        this.field2011.field2114 = arg0;
        this.field2011.field2111 = 10;
        int var2 = this.field2011.method2668();
        this.field1999 = this.field2011.method2668();
        this.field2004 = 500000;
        this.field2000 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2011.method2695();
            int var5 = this.field2011.method2695();
            if (var4 == 1297379947) {
                this.field2000[var3] = this.field2011.field2111;
                var3++;
            }
            this.field2011.field2111 += var5;
        }
        this.field2002 = 0L;
        this.field2001 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2001[var6] = this.field2000[var6];
        }
        this.field1998 = new int[var2];
        this.field2003 = new int[var2];
    }

    @ObfuscatedName("em.i()V")
    public void method2532() {
        this.field2011.field2114 = null;
        this.field2000 = null;
        this.field2001 = null;
        this.field1998 = null;
        this.field2003 = null;
    }

    @ObfuscatedName("em.u()Z")
    public boolean method2507() {
        return this.field2011.field2114 != null;
    }

    @ObfuscatedName("em.r()I")
    public int method2543() {
        return this.field2001.length;
    }

    @ObfuscatedName("em.o(I)V")
    public void method2546(int arg0) {
        this.field2011.field2111 = this.field2001[arg0];
    }

    @ObfuscatedName("em.l(I)V")
    public void method2510(int arg0) {
        this.field2001[arg0] = this.field2011.field2111;
    }

    @ObfuscatedName("em.n()V")
    public void method2539() {
        this.field2011.field2111 = -1;
    }

    @ObfuscatedName("em.m(I)V")
    public void method2512(int arg0) {
        int var2 = this.field2011.method2682();
        this.field1998[arg0] += var2;
    }

    @ObfuscatedName("em.w(I)I")
    public int method2513(int arg0) {
        return this.method2514(arg0);
    }

    @ObfuscatedName("em.j(I)I")
    public int method2514(int arg0) {
        byte var2 = this.field2011.field2114[this.field2011.field2111];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2003[arg0] = var3;
            this.field2011.field2111++;
        } else {
            var3 = this.field2003[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2515(arg0, var3);
        }
        int var4 = this.field2011.method2682();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2011.field2114[this.field2011.field2111] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2011.field2111++;
                this.field2003[arg0] = var5;
                return this.method2515(arg0, var5);
            }
        }
        this.field2011.field2111 += var4;
        return 0;
    }

    @ObfuscatedName("em.s(II)I")
    public int method2515(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2010[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2011.method2666() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2011.method2666() << 16;
            }
            return var8;
        }
        int var3 = this.field2011.method2666();
        int var4 = this.field2011.method2682();
        if (var3 == 47) {
            this.field2011.field2111 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2011.method2670();
            var4 -= 3;
            int var6 = this.field1998[arg0];
            this.field2002 += (long) (this.field2004 - var5) * (long) var6;
            this.field2004 = var5;
            this.field2011.field2111 += var4;
            return 2;
        } else {
            this.field2011.field2111 += var4;
            return 3;
        }
    }

    @ObfuscatedName("em.q(I)J")
    public long method2516(int arg0) {
        return (long) this.field2004 * (long) arg0 + this.field2002;
    }

    @ObfuscatedName("em.d()I")
    public int method2517() {
        int var1 = this.field2001.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2001[var4] >= 0 && this.field1998[var4] < var3) {
                var2 = var4;
                var3 = this.field1998[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("em.p()Z")
    public boolean method2522() {
        int var1 = this.field2001.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2001[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("em.y(J)V")
    public void method2519(long arg0) {
        this.field2002 = arg0;
        int var3 = this.field2001.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1998[var4] = 0;
            this.field2003[var4] = 0;
            this.field2011.field2111 = this.field2000[var4];
            this.method2512(var4);
            this.field2001[var4] = this.field2011.field2111;
        }
    }
}
