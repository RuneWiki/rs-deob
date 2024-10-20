package deob;

@ObfuscatedName("ea")
public class class142 {

    @ObfuscatedName("ea.q")
    public class154 field1990 = new class154((byte[]) null);

    @ObfuscatedName("ea.d")
    public int field1978;

    @ObfuscatedName("ea.h")
    public int[] field1983;

    @ObfuscatedName("ea.p")
    public int[] field1980;

    @ObfuscatedName("ea.j")
    public int[] field1981;

    @ObfuscatedName("ea.n")
    public int[] field1982;

    @ObfuscatedName("ea.r")
    public int field1977;

    @ObfuscatedName("ea.i")
    public long field1985;

    @ObfuscatedName("ea.o")
    public static final byte[] field1986 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class142() {
    }

    public class142(byte[] arg0) {
        this.method2517(arg0);
    }

    @ObfuscatedName("ea.q([B)V")
    public void method2517(byte[] arg0) {
        this.field1990.field2092 = arg0;
        this.field1990.field2091 = 10;
        int var2 = this.field1990.method2668();
        this.field1978 = this.field1990.method2668();
        this.field1977 = 500000;
        this.field1983 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1990.method2798();
            int var5 = this.field1990.method2798();
            if (var4 == 1297379947) {
                this.field1983[var3] = this.field1990.field2091;
                var3++;
            }
            this.field1990.field2091 += var5;
        }
        this.field1985 = 0L;
        this.field1980 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1980[var6] = this.field1983[var6];
        }
        this.field1981 = new int[var2];
        this.field1982 = new int[var2];
    }

    @ObfuscatedName("ea.d()V")
    public void method2518() {
        this.field1990.field2092 = null;
        this.field1983 = null;
        this.field1980 = null;
        this.field1981 = null;
        this.field1982 = null;
    }

    @ObfuscatedName("ea.h()Z")
    public boolean method2536() {
        return this.field1990.field2092 != null;
    }

    @ObfuscatedName("ea.p()I")
    public int method2520() {
        return this.field1980.length;
    }

    @ObfuscatedName("ea.j(I)V")
    public void method2521(int arg0) {
        this.field1990.field2091 = this.field1980[arg0];
    }

    @ObfuscatedName("ea.n(I)V")
    public void method2522(int arg0) {
        this.field1980[arg0] = this.field1990.field2091;
    }

    @ObfuscatedName("ea.c()V")
    public void method2528() {
        this.field1990.field2091 = -1;
    }

    @ObfuscatedName("ea.o(I)V")
    public void method2524(int arg0) {
        int var2 = this.field1990.method2682();
        this.field1981[arg0] += var2;
    }

    @ObfuscatedName("ea.s(I)I")
    public int method2542(int arg0) {
        return this.method2526(arg0);
    }

    @ObfuscatedName("ea.u(I)I")
    public int method2526(int arg0) {
        byte var2 = this.field1990.field2092[this.field1990.field2091];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1982[arg0] = var3;
            this.field1990.field2091++;
        } else {
            var3 = this.field1982[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2556(arg0, var3);
        }
        int var4 = this.field1990.method2682();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1990.field2092[this.field1990.field2091] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1990.field2091++;
                this.field1982[arg0] = var5;
                return this.method2556(arg0, var5);
            }
        }
        this.field1990.field2091 += var4;
        return 0;
    }

    @ObfuscatedName("ea.b(II)I")
    public int method2556(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1986[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1990.method2666() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1990.method2666() << 16;
            }
            return var8;
        }
        int var3 = this.field1990.method2666();
        int var4 = this.field1990.method2682();
        if (var3 == 47) {
            this.field1990.field2091 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1990.method2718();
            var4 -= 3;
            int var6 = this.field1981[arg0];
            this.field1985 += (long) (this.field1977 - var5) * (long) var6;
            this.field1977 = var5;
            this.field1990.field2091 += var4;
            return 2;
        } else {
            this.field1990.field2091 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ea.v(I)J")
    public long method2543(int arg0) {
        return (long) this.field1977 * (long) arg0 + this.field1985;
    }

    @ObfuscatedName("ea.f()I")
    public int method2529() {
        int var1 = this.field1980.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1980[var4] >= 0 && this.field1981[var4] < var3) {
                var2 = var4;
                var3 = this.field1981[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ea.z()Z")
    public boolean method2516() {
        int var1 = this.field1980.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1980[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ea.t(J)V")
    public void method2550(long arg0) {
        this.field1985 = arg0;
        int var3 = this.field1980.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1981[var4] = 0;
            this.field1982[var4] = 0;
            this.field1990.field2091 = this.field1983[var4];
            this.method2524(var4);
            this.field1980[var4] = this.field1990.field2091;
        }
    }
}
