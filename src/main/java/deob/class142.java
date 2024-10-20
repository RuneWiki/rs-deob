package deob;

@ObfuscatedName("ei")
public class class142 {

    @ObfuscatedName("ei.x")
    public class154 field1992 = new class154((byte[]) null);

    @ObfuscatedName("ei.n")
    public int field1988;

    @ObfuscatedName("ei.g")
    public int[] field1981;

    @ObfuscatedName("ei.v")
    public int[] field1983;

    @ObfuscatedName("ei.y")
    public int[] field1987;

    @ObfuscatedName("ei.p")
    public int[] field1984;

    @ObfuscatedName("ei.j")
    public int field1985;

    @ObfuscatedName("ei.a")
    public long field1982;

    @ObfuscatedName("ei.i")
    public static final byte[] field1979 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class142() {
    }

    public class142(byte[] arg0) {
        this.method2548(arg0);
    }

    @ObfuscatedName("ei.x([B)V")
    public void method2548(byte[] arg0) {
        this.field1992.field2086 = arg0;
        this.field1992.field2087 = 10;
        int var2 = this.field1992.method2833();
        this.field1988 = this.field1992.method2833();
        this.field1985 = 500000;
        this.field1981 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1992.method2803();
            int var5 = this.field1992.method2803();
            if (var4 == 1297379947) {
                this.field1981[var3] = this.field1992.field2087;
                var3++;
            }
            this.field1992.field2087 += var5;
        }
        this.field1982 = 0L;
        this.field1983 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1983[var6] = this.field1981[var6];
        }
        this.field1987 = new int[var2];
        this.field1984 = new int[var2];
    }

    @ObfuscatedName("ei.n()V")
    public void method2540() {
        this.field1992.field2086 = null;
        this.field1981 = null;
        this.field1983 = null;
        this.field1987 = null;
        this.field1984 = null;
    }

    @ObfuscatedName("ei.g()Z")
    public boolean method2543() {
        return this.field1992.field2086 != null;
    }

    @ObfuscatedName("ei.v()I")
    public int method2542() {
        return this.field1983.length;
    }

    @ObfuscatedName("ei.y(I)V")
    public void method2569(int arg0) {
        this.field1992.field2087 = this.field1983[arg0];
    }

    @ObfuscatedName("ei.p(I)V")
    public void method2544(int arg0) {
        this.field1983[arg0] = this.field1992.field2087;
    }

    @ObfuscatedName("ei.j()V")
    public void method2545() {
        this.field1992.field2087 = -1;
    }

    @ObfuscatedName("ei.s(I)V")
    public void method2546(int arg0) {
        int var2 = this.field1992.method2874();
        this.field1987[arg0] += var2;
    }

    @ObfuscatedName("ei.k(I)I")
    public int method2577(int arg0) {
        return this.method2539(arg0);
    }

    @ObfuscatedName("ei.f(I)I")
    public int method2539(int arg0) {
        byte var2 = this.field1992.field2086[this.field1992.field2087];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1984[arg0] = var3;
            this.field1992.field2087++;
        } else {
            var3 = this.field1984[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2553(arg0, var3);
        }
        int var4 = this.field1992.method2874();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1992.field2086[this.field1992.field2087] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1992.field2087++;
                this.field1984[arg0] = var5;
                return this.method2553(arg0, var5);
            }
        }
        this.field1992.field2087 += var4;
        return 0;
    }

    @ObfuscatedName("ei.o(II)I")
    public int method2553(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1979[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1992.method2878() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1992.method2878() << 16;
            }
            return var8;
        }
        int var3 = this.field1992.method2878();
        int var4 = this.field1992.method2874();
        if (var3 == 47) {
            this.field1992.field2087 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1992.method2705();
            var4 -= 3;
            int var6 = this.field1987[arg0];
            this.field1982 += (long) (this.field1985 - var5) * (long) var6;
            this.field1985 = var5;
            this.field1992.field2087 += var4;
            return 2;
        } else {
            this.field1992.field2087 += var4;
            return 3;
        }
    }

    @ObfuscatedName("ei.q(I)J")
    public long method2561(int arg0) {
        return (long) this.field1985 * (long) arg0 + this.field1982;
    }

    @ObfuscatedName("ei.c()I")
    public int method2551() {
        int var1 = this.field1983.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1983[var4] >= 0 && this.field1987[var4] < var3) {
                var2 = var4;
                var3 = this.field1987[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("ei.b()Z")
    public boolean method2552() {
        int var1 = this.field1983.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1983[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ei.w(J)V")
    public void method2566(long arg0) {
        this.field1982 = arg0;
        int var3 = this.field1983.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1987[var4] = 0;
            this.field1984[var4] = 0;
            this.field1992.field2087 = this.field1981[var4];
            this.method2546(var4);
            this.field1983[var4] = this.field1992.field2087;
        }
    }
}
