package deob;

@ObfuscatedName("fd")
public class class160 {

    @ObfuscatedName("fd.e")
    public class107 field2703 = new class107((byte[]) null);

    @ObfuscatedName("fd.v")
    public int field2695;

    @ObfuscatedName("fd.i")
    public int[] field2702;

    @ObfuscatedName("fd.g")
    public int[] field2692;

    @ObfuscatedName("fd.x")
    public int[] field2693;

    @ObfuscatedName("fd.b")
    public int[] field2697;

    @ObfuscatedName("fd.q")
    public int field2698;

    @ObfuscatedName("fd.m")
    public long field2700;

    @ObfuscatedName("fd.u")
    public static final byte[] field2701 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class160() {
    }

    public class160(byte[] arg0) {
        this.method2948(arg0);
    }

    @ObfuscatedName("fd.e([B)V")
    public void method2948(byte[] arg0) {
        this.field2703.field1849 = arg0;
        this.field2703.field1844 = 10;
        int var2 = this.field2703.method2152();
        this.field2695 = this.field2703.method2152();
        this.field2698 = 500000;
        this.field2702 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2703.method2121();
            int var5 = this.field2703.method2121();
            if (var4 == 1297379947) {
                this.field2702[var3] = this.field2703.field1844;
                var3++;
            }
            this.field2703.field1844 += var5;
        }
        this.field2700 = 0L;
        this.field2692 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2692[var6] = this.field2702[var6];
        }
        this.field2693 = new int[var2];
        this.field2697 = new int[var2];
    }

    @ObfuscatedName("fd.v()V")
    public void method2949() {
        this.field2703.field1849 = null;
        this.field2702 = null;
        this.field2692 = null;
        this.field2693 = null;
        this.field2697 = null;
    }

    @ObfuscatedName("fd.i()Z")
    public boolean method2950() {
        return this.field2703.field1849 != null;
    }

    @ObfuscatedName("fd.g()I")
    public int method2955() {
        return this.field2692.length;
    }

    @ObfuscatedName("fd.x(I)V")
    public void method2952(int arg0) {
        this.field2703.field1844 = this.field2692[arg0];
    }

    @ObfuscatedName("fd.b(I)V")
    public void method2990(int arg0) {
        this.field2692[arg0] = this.field2703.field1844;
    }

    @ObfuscatedName("fd.q()V")
    public void method2980() {
        this.field2703.field1844 = -1;
    }

    @ObfuscatedName("fd.l(I)V")
    public void method2947(int arg0) {
        int var2 = this.field2703.method2131();
        this.field2693[arg0] += var2;
    }

    @ObfuscatedName("fd.m(I)I")
    public int method2968(int arg0) {
        return this.method2956(arg0);
    }

    @ObfuscatedName("fd.u(I)I")
    public int method2956(int arg0) {
        byte var2 = this.field2703.field1849[this.field2703.field1844];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2697[arg0] = var3;
            this.field2703.field1844++;
        } else {
            var3 = this.field2697[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2962(arg0, var3);
        }
        int var4 = this.field2703.method2131();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2703.field1849[this.field2703.field1844] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2703.field1844++;
                this.field2697[arg0] = var5;
                return this.method2962(arg0, var5);
            }
        }
        this.field2703.field1844 += var4;
        return 0;
    }

    @ObfuscatedName("fd.s(II)I")
    public int method2962(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2701[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2703.method2226() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2703.method2226() << 16;
            }
            return var8;
        }
        int var3 = this.field2703.method2226();
        int var4 = this.field2703.method2131();
        if (var3 == 47) {
            this.field2703.field1844 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2703.method2112();
            var4 -= 3;
            int var6 = this.field2693[arg0];
            this.field2700 += (long) (this.field2698 - var5) * (long) var6;
            this.field2698 = var5;
            this.field2703.field1844 += var4;
            return 2;
        } else {
            this.field2703.field1844 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fd.f(I)J")
    public long method2975(int arg0) {
        return (long) this.field2698 * (long) arg0 + this.field2700;
    }

    @ObfuscatedName("fd.p()I")
    public int method2959() {
        int var1 = this.field2692.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2692[var4] >= 0 && this.field2693[var4] < var3) {
                var2 = var4;
                var3 = this.field2693[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fd.w()Z")
    public boolean method2960() {
        int var1 = this.field2692.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2692[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fd.y(J)V")
    public void method2961(long arg0) {
        this.field2700 = arg0;
        int var3 = this.field2692.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2693[var4] = 0;
            this.field2697[var4] = 0;
            this.field2703.field1844 = this.field2702[var4];
            this.method2947(var4);
            this.field2692[var4] = this.field2703.field1844;
        }
    }
}
