package deob;

@ObfuscatedName("fr")
public class class160 {

    @ObfuscatedName("fr.k")
    public class107 field2707 = new class107((byte[]) null);

    @ObfuscatedName("fr.r")
    public int field2699;

    @ObfuscatedName("fr.y")
    public int[] field2700;

    @ObfuscatedName("fr.w")
    public int[] field2705;

    @ObfuscatedName("fr.m")
    public int[] field2702;

    @ObfuscatedName("fr.j")
    public int[] field2709;

    @ObfuscatedName("fr.g")
    public int field2698;

    @ObfuscatedName("fr.o")
    public long field2706;

    @ObfuscatedName("fr.b")
    public static final byte[] field2701 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class160() {
    }

    public class160(byte[] arg0) {
        this.method2936(arg0);
    }

    @ObfuscatedName("fr.k([B)V")
    public void method2936(byte[] arg0) {
        this.field2707.field1865 = arg0;
        this.field2707.field1863 = 10;
        int var2 = this.field2707.method2232();
        this.field2699 = this.field2707.method2232();
        this.field2698 = 500000;
        this.field2700 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2707.method2116();
            int var5 = this.field2707.method2116();
            if (var4 == 1297379947) {
                this.field2700[var3] = this.field2707.field1863;
                var3++;
            }
            this.field2707.field1863 += var5;
        }
        this.field2706 = 0L;
        this.field2705 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2705[var6] = this.field2700[var6];
        }
        this.field2702 = new int[var2];
        this.field2709 = new int[var2];
    }

    @ObfuscatedName("fr.r()V")
    public void method2937() {
        this.field2707.field1865 = null;
        this.field2700 = null;
        this.field2705 = null;
        this.field2702 = null;
        this.field2709 = null;
    }

    @ObfuscatedName("fr.y()Z")
    public boolean method2951() {
        return this.field2707.field1865 != null;
    }

    @ObfuscatedName("fr.w()I")
    public int method2939() {
        return this.field2705.length;
    }

    @ObfuscatedName("fr.m(I)V")
    public void method2967(int arg0) {
        this.field2707.field1863 = this.field2705[arg0];
    }

    @ObfuscatedName("fr.j(I)V")
    public void method2941(int arg0) {
        this.field2705[arg0] = this.field2707.field1863;
    }

    @ObfuscatedName("fr.g()V")
    public void method2942() {
        this.field2707.field1863 = -1;
    }

    @ObfuscatedName("fr.p(I)V")
    public void method2943(int arg0) {
        int var2 = this.field2707.method2126();
        this.field2702[arg0] += var2;
    }

    @ObfuscatedName("fr.o(I)I")
    public int method2984(int arg0) {
        return this.method2945(arg0);
    }

    @ObfuscatedName("fr.b(I)I")
    public int method2945(int arg0) {
        byte var2 = this.field2707.field1865[this.field2707.field1863];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2709[arg0] = var3;
            this.field2707.field1863++;
        } else {
            var3 = this.field2709[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2968(arg0, var3);
        }
        int var4 = this.field2707.method2126();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2707.field1865[this.field2707.field1863] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2707.field1863++;
                this.field2709[arg0] = var5;
                return this.method2968(arg0, var5);
            }
        }
        this.field2707.field1863 += var4;
        return 0;
    }

    @ObfuscatedName("fr.x(II)I")
    public int method2968(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2701[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2707.method2111() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2707.method2111() << 16;
            }
            return var8;
        }
        int var3 = this.field2707.method2111();
        int var4 = this.field2707.method2126();
        if (var3 == 47) {
            this.field2707.field1863 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2707.method2262();
            var4 -= 3;
            int var6 = this.field2702[arg0];
            this.field2706 += (long) (this.field2698 - var5) * (long) var6;
            this.field2698 = var5;
            this.field2707.field1863 += var4;
            return 2;
        } else {
            this.field2707.field1863 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fr.n(I)J")
    public long method2952(int arg0) {
        return (long) this.field2698 * (long) arg0 + this.field2706;
    }

    @ObfuscatedName("fr.d()I")
    public int method2947() {
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

    @ObfuscatedName("fr.s()Z")
    public boolean method2958() {
        int var1 = this.field2705.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2705[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fr.v(J)V")
    public void method2946(long arg0) {
        this.field2706 = arg0;
        int var3 = this.field2705.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2702[var4] = 0;
            this.field2709[var4] = 0;
            this.field2707.field1863 = this.field2700[var4];
            this.method2943(var4);
            this.field2705[var4] = this.field2707.field1863;
        }
    }
}
