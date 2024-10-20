package deob;

@ObfuscatedName("eo")
public class class142 {

    @ObfuscatedName("eo.o")
    public class154 field2002 = new class154((byte[]) null);

    @ObfuscatedName("eo.m")
    public int field1994;

    @ObfuscatedName("eo.b")
    public int[] field1995;

    @ObfuscatedName("eo.g")
    public int[] field1993;

    @ObfuscatedName("eo.h")
    public int[] field1997;

    @ObfuscatedName("eo.v")
    public int[] field1998;

    @ObfuscatedName("eo.l")
    public int field1996;

    @ObfuscatedName("eo.u")
    public long field2001;

    @ObfuscatedName("eo.k")
    public static final byte[] field2006 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class142() {
    }

    public class142(byte[] arg0) {
        this.method2420(arg0);
    }

    @ObfuscatedName("eo.o([B)V")
    public void method2420(byte[] arg0) {
        this.field2002.field2108 = arg0;
        this.field2002.field2105 = 10;
        int var2 = this.field2002.method2554();
        this.field1994 = this.field2002.method2554();
        this.field1996 = 500000;
        this.field1995 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2002.method2557();
            int var5 = this.field2002.method2557();
            if (var4 == 1297379947) {
                this.field1995[var3] = this.field2002.field2105;
                var3++;
            }
            this.field2002.field2105 += var5;
        }
        this.field2001 = 0L;
        this.field1993 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1993[var6] = this.field1995[var6];
        }
        this.field1997 = new int[var2];
        this.field1998 = new int[var2];
    }

    @ObfuscatedName("eo.m()V")
    public void method2411() {
        this.field2002.field2108 = null;
        this.field1995 = null;
        this.field1993 = null;
        this.field1997 = null;
        this.field1998 = null;
    }

    @ObfuscatedName("eo.b()Z")
    public boolean method2444() {
        return this.field2002.field2108 != null;
    }

    @ObfuscatedName("eo.g()I")
    public int method2413() {
        return this.field1993.length;
    }

    @ObfuscatedName("eo.l(I)V")
    public void method2414(int arg0) {
        this.field2002.field2105 = this.field1993[arg0];
    }

    @ObfuscatedName("eo.c(I)V")
    public void method2415(int arg0) {
        this.field1993[arg0] = this.field2002.field2105;
    }

    @ObfuscatedName("eo.u()V")
    public void method2416() {
        this.field2002.field2105 = -1;
    }

    @ObfuscatedName("eo.k(I)V")
    public void method2410(int arg0) {
        int var2 = this.field2002.method2704();
        this.field1997[arg0] += var2;
    }

    @ObfuscatedName("eo.z(I)I")
    public int method2417(int arg0) {
        return this.method2454(arg0);
    }

    @ObfuscatedName("eo.y(I)I")
    public int method2454(int arg0) {
        byte var2 = this.field2002.field2108[this.field2002.field2105];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1998[arg0] = var3;
            this.field2002.field2105++;
        } else {
            var3 = this.field1998[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2443(arg0, var3);
        }
        int var4 = this.field2002.method2704();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2002.field2108[this.field2002.field2105] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2002.field2105++;
                this.field1998[arg0] = var5;
                return this.method2443(arg0, var5);
            }
        }
        this.field2002.field2105 += var4;
        return 0;
    }

    @ObfuscatedName("eo.j(II)I")
    public int method2443(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2006[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2002.method2552() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2002.method2552() << 16;
            }
            return var8;
        }
        int var3 = this.field2002.method2552();
        int var4 = this.field2002.method2704();
        if (var3 == 47) {
            this.field2002.field2105 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2002.method2556();
            var4 -= 3;
            int var6 = this.field1997[arg0];
            this.field2001 += (long) (this.field1996 - var5) * (long) var6;
            this.field1996 = var5;
            this.field2002.field2105 += var4;
            return 2;
        } else {
            this.field2002.field2105 += var4;
            return 3;
        }
    }

    @ObfuscatedName("eo.f(I)J")
    public long method2437(int arg0) {
        return (long) this.field1996 * (long) arg0 + this.field2001;
    }

    @ObfuscatedName("eo.p()I")
    public int method2421() {
        int var1 = this.field1993.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1993[var4] >= 0 && this.field1997[var4] < var3) {
                var2 = var4;
                var3 = this.field1997[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("eo.i()Z")
    public boolean method2431() {
        int var1 = this.field1993.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1993[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("eo.s(J)V")
    public void method2423(long arg0) {
        this.field2001 = arg0;
        int var3 = this.field1993.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1997[var4] = 0;
            this.field1998[var4] = 0;
            this.field2002.field2105 = this.field1995[var4];
            this.method2410(var4);
            this.field1993[var4] = this.field2002.field2105;
        }
    }
}
