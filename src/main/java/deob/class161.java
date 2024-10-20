package deob;

@ObfuscatedName("fu")
public class class161 {

    @ObfuscatedName("fu.n")
    public class107 field2708 = new class107((byte[]) null);

    @ObfuscatedName("fu.x")
    public int field2703;

    @ObfuscatedName("fu.k")
    public int[] field2704;

    @ObfuscatedName("fu.i")
    public int[] field2705;

    @ObfuscatedName("fu.d")
    public int[] field2702;

    @ObfuscatedName("fu.q")
    public int[] field2706;

    @ObfuscatedName("fu.m")
    public int field2710;

    @ObfuscatedName("fu.w")
    public long field2713;

    @ObfuscatedName("fu.e")
    public static final byte[] field2711 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class161() {
    }

    public class161(byte[] arg0) {
        this.method2940(arg0);
    }

    @ObfuscatedName("fu.n([B)V")
    public void method2940(byte[] arg0) {
        this.field2708.field1829 = arg0;
        this.field2708.field1826 = 10;
        int var2 = this.field2708.method2140();
        this.field2703 = this.field2708.method2140();
        this.field2710 = 500000;
        this.field2704 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2708.method2183();
            int var5 = this.field2708.method2183();
            if (var4 == 1297379947) {
                this.field2704[var3] = this.field2708.field1826;
                var3++;
            }
            this.field2708.field1826 += var5;
        }
        this.field2713 = 0L;
        this.field2705 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2705[var6] = this.field2704[var6];
        }
        this.field2702 = new int[var2];
        this.field2706 = new int[var2];
    }

    @ObfuscatedName("fu.x()V")
    public void method2942() {
        this.field2708.field1829 = null;
        this.field2704 = null;
        this.field2705 = null;
        this.field2702 = null;
        this.field2706 = null;
    }

    @ObfuscatedName("fu.k()Z")
    public boolean method2933() {
        return this.field2708.field1829 != null;
    }

    @ObfuscatedName("fu.i()I")
    public int method2919() {
        return this.field2705.length;
    }

    @ObfuscatedName("fu.d(I)V")
    public void method2920(int arg0) {
        this.field2708.field1826 = this.field2705[arg0];
    }

    @ObfuscatedName("fu.q(I)V")
    public void method2916(int arg0) {
        this.field2705[arg0] = this.field2708.field1826;
    }

    @ObfuscatedName("fu.m()V")
    public void method2956() {
        this.field2708.field1826 = -1;
    }

    @ObfuscatedName("fu.a(I)V")
    public void method2923(int arg0) {
        int var2 = this.field2708.method2153();
        this.field2702[arg0] += var2;
    }

    @ObfuscatedName("fu.w(I)I")
    public int method2924(int arg0) {
        return this.method2925(arg0);
    }

    @ObfuscatedName("fu.e(I)I")
    public int method2925(int arg0) {
        byte var2 = this.field2708.field1829[this.field2708.field1826];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2706[arg0] = var3;
            this.field2708.field1826++;
        } else {
            var3 = this.field2706[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2926(arg0, var3);
        }
        int var4 = this.field2708.method2153();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2708.field1829[this.field2708.field1826] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2708.field1826++;
                this.field2706[arg0] = var5;
                return this.method2926(arg0, var5);
            }
        }
        this.field2708.field1826 += var4;
        return 0;
    }

    @ObfuscatedName("fu.o(II)I")
    public int method2926(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2711[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2708.method2148() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2708.method2148() << 16;
            }
            return var8;
        }
        int var3 = this.field2708.method2148();
        int var4 = this.field2708.method2153();
        if (var3 == 47) {
            this.field2708.field1826 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2708.method2142();
            var4 -= 3;
            int var6 = this.field2702[arg0];
            this.field2713 += (long) (this.field2710 - var5) * (long) var6;
            this.field2710 = var5;
            this.field2708.field1826 += var4;
            return 2;
        } else {
            this.field2708.field1826 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fu.v(I)J")
    public long method2927(int arg0) {
        return (long) this.field2710 * (long) arg0 + this.field2713;
    }

    @ObfuscatedName("fu.z()I")
    public int method2928() {
        int var1 = this.field2705.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2705[var4] >= 0 && this.field2702[var4] < var3) {
                var2 = var4;
                var3 = this.field2702[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fu.j()Z")
    public boolean method2966() {
        int var1 = this.field2705.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2705[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fu.r(J)V")
    public void method2930(long arg0) {
        this.field2713 = arg0;
        int var3 = this.field2705.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2702[var4] = 0;
            this.field2706[var4] = 0;
            this.field2708.field1826 = this.field2704[var4];
            this.method2923(var4);
            this.field2705[var4] = this.field2708.field1826;
        }
    }
}
