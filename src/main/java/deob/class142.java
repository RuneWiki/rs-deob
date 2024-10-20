package deob;

@ObfuscatedName("er")
public class class142 {

    @ObfuscatedName("er.p")
    public class154 field1985 = new class154((byte[]) null);

    @ObfuscatedName("er.g")
    public int field1984;

    @ObfuscatedName("er.x")
    public int[] field1991;

    @ObfuscatedName("er.q")
    public int[] field1986;

    @ObfuscatedName("er.d")
    public int[] field1987;

    @ObfuscatedName("er.k")
    public int[] field1988;

    @ObfuscatedName("er.j")
    public int field1989;

    @ObfuscatedName("er.o")
    public long field1996;

    @ObfuscatedName("er.a")
    public static final byte[] field1993 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class142() {
    }

    public class142(byte[] arg0) {
        this.method2472(arg0);
    }

    @ObfuscatedName("er.p([B)V")
    public void method2472(byte[] arg0) {
        this.field1985.field2092 = arg0;
        this.field1985.field2098 = 10;
        int var2 = this.field1985.method2595();
        this.field1984 = this.field1985.method2595();
        this.field1989 = 500000;
        this.field1991 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1985.method2598();
            int var5 = this.field1985.method2598();
            if (var4 == 1297379947) {
                this.field1991[var3] = this.field1985.field2098;
                var3++;
            }
            this.field1985.field2098 += var5;
        }
        this.field1996 = 0L;
        this.field1986 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1986[var6] = this.field1991[var6];
        }
        this.field1987 = new int[var2];
        this.field1988 = new int[var2];
    }

    @ObfuscatedName("er.g()V")
    public void method2446() {
        this.field1985.field2092 = null;
        this.field1991 = null;
        this.field1986 = null;
        this.field1987 = null;
        this.field1988 = null;
    }

    @ObfuscatedName("er.x()Z")
    public boolean method2447() {
        return this.field1985.field2092 != null;
    }

    @ObfuscatedName("er.q()I")
    public int method2448() {
        return this.field1986.length;
    }

    @ObfuscatedName("er.d(I)V")
    public void method2449(int arg0) {
        this.field1985.field2098 = this.field1986[arg0];
    }

    @ObfuscatedName("er.k(I)V")
    public void method2450(int arg0) {
        this.field1986[arg0] = this.field1985.field2098;
    }

    @ObfuscatedName("er.j()V")
    public void method2451() {
        this.field1985.field2098 = -1;
    }

    @ObfuscatedName("er.s(I)V")
    public void method2452(int arg0) {
        int var2 = this.field1985.method2638();
        this.field1987[arg0] += var2;
    }

    @ObfuscatedName("er.o(I)I")
    public int method2453(int arg0) {
        return this.method2458(arg0);
    }

    @ObfuscatedName("er.a(I)I")
    public int method2458(int arg0) {
        byte var2 = this.field1985.field2092[this.field1985.field2098];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1988[arg0] = var3;
            this.field1985.field2098++;
        } else {
            var3 = this.field1988[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2455(arg0, var3);
        }
        int var4 = this.field1985.method2638();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1985.field2092[this.field1985.field2098] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1985.field2098++;
                this.field1988[arg0] = var5;
                return this.method2455(arg0, var5);
            }
        }
        this.field1985.field2098 += var4;
        return 0;
    }

    @ObfuscatedName("er.c(II)I")
    public int method2455(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1993[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1985.method2593() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1985.method2593() << 16;
            }
            return var8;
        }
        int var3 = this.field1985.method2593();
        int var4 = this.field1985.method2638();
        if (var3 == 47) {
            this.field1985.field2098 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1985.method2748();
            var4 -= 3;
            int var6 = this.field1987[arg0];
            this.field1996 += (long) (this.field1989 - var5) * (long) var6;
            this.field1989 = var5;
            this.field1985.field2098 += var4;
            return 2;
        } else {
            this.field1985.field2098 += var4;
            return 3;
        }
    }

    @ObfuscatedName("er.u(I)J")
    public long method2456(int arg0) {
        return (long) this.field1989 * (long) arg0 + this.field1996;
    }

    @ObfuscatedName("er.i()I")
    public int method2457() {
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

    @ObfuscatedName("er.z()Z")
    public boolean method2485() {
        int var1 = this.field1986.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1986[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("er.n(J)V")
    public void method2459(long arg0) {
        this.field1996 = arg0;
        int var3 = this.field1986.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1987[var4] = 0;
            this.field1988[var4] = 0;
            this.field1985.field2098 = this.field1991[var4];
            this.method2452(var4);
            this.field1986[var4] = this.field1985.field2098;
        }
    }
}
