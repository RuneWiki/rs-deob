package deob;

@ObfuscatedName("fi")
public class class182 {

    @ObfuscatedName("fi.a")
    public class119 field2930 = new class119((byte[]) null);

    @ObfuscatedName("fi.r")
    public int field2929;

    @ObfuscatedName("fi.f")
    public int[] field2931;

    @ObfuscatedName("fi.s")
    public int[] field2934;

    @ObfuscatedName("fi.y")
    public int[] field2933;

    @ObfuscatedName("fi.e")
    public int[] field2932;

    @ObfuscatedName("fi.g")
    public int field2941;

    @ObfuscatedName("fi.j")
    public long field2937;

    @ObfuscatedName("fi.n")
    public static final byte[] field2938 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class182() {
    }

    public class182(byte[] arg0) {
        this.method3304(arg0);
    }

    @ObfuscatedName("fi.a([B)V")
    public void method3304(byte[] arg0) {
        this.field2930.field1981 = arg0;
        this.field2930.field1980 = 10;
        int var2 = this.field2930.method2347();
        this.field2929 = this.field2930.method2347();
        this.field2941 = 500000;
        this.field2931 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2930.method2350();
            int var5 = this.field2930.method2350();
            if (var4 == 1297379947) {
                this.field2931[var3] = this.field2930.field1980;
                var3++;
            }
            this.field2930.field1980 += var5;
        }
        this.field2937 = 0L;
        this.field2934 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2934[var6] = this.field2931[var6];
        }
        this.field2933 = new int[var2];
        this.field2932 = new int[var2];
    }

    @ObfuscatedName("fi.r()V")
    public void method3305() {
        this.field2930.field1981 = null;
        this.field2931 = null;
        this.field2934 = null;
        this.field2933 = null;
        this.field2932 = null;
    }

    @ObfuscatedName("fi.f()Z")
    public boolean method3306() {
        return this.field2930.field1981 != null;
    }

    @ObfuscatedName("fi.s()I")
    public int method3307() {
        return this.field2934.length;
    }

    @ObfuscatedName("fi.y(I)V")
    public void method3308(int arg0) {
        this.field2930.field1980 = this.field2934[arg0];
    }

    @ObfuscatedName("fi.e(I)V")
    public void method3319(int arg0) {
        this.field2934[arg0] = this.field2930.field1980;
    }

    @ObfuscatedName("fi.g()V")
    public void method3349() {
        this.field2930.field1980 = -1;
    }

    @ObfuscatedName("fi.m(I)V")
    public void method3340(int arg0) {
        int var2 = this.field2930.method2450();
        this.field2933[arg0] += var2;
    }

    @ObfuscatedName("fi.j(I)I")
    public int method3312(int arg0) {
        return this.method3313(arg0);
    }

    @ObfuscatedName("fi.n(I)I")
    public int method3313(int arg0) {
        byte var2 = this.field2930.field1981[this.field2930.field1980];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2932[arg0] = var3;
            this.field2930.field1980++;
        } else {
            var3 = this.field2932[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3317(arg0, var3);
        }
        int var4 = this.field2930.method2450();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2930.field1981[this.field2930.field1980] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2930.field1980++;
                this.field2932[arg0] = var5;
                return this.method3317(arg0, var5);
            }
        }
        this.field2930.field1980 += var4;
        return 0;
    }

    @ObfuscatedName("fi.l(II)I")
    public int method3317(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2938[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2930.method2412() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2930.method2412() << 16;
            }
            return var8;
        }
        int var3 = this.field2930.method2412();
        int var4 = this.field2930.method2450();
        if (var3 == 47) {
            this.field2930.field1980 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2930.method2349();
            var4 -= 3;
            int var6 = this.field2933[arg0];
            this.field2937 += (long) (this.field2941 - var5) * (long) var6;
            this.field2941 = var5;
            this.field2930.field1980 += var4;
            return 2;
        } else {
            this.field2930.field1980 += var4;
            return 3;
        }
    }

    @ObfuscatedName("fi.h(I)J")
    public long method3314(int arg0) {
        return (long) this.field2941 * (long) arg0 + this.field2937;
    }

    @ObfuscatedName("fi.i()I")
    public int method3316() {
        int var1 = this.field2934.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2934[var4] >= 0 && this.field2933[var4] < var3) {
                var2 = var4;
                var3 = this.field2933[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("fi.v()Z")
    public boolean method3337() {
        int var1 = this.field2934.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2934[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fi.z(J)V")
    public void method3318(long arg0) {
        this.field2937 = arg0;
        int var3 = this.field2934.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2933[var4] = 0;
            this.field2932[var4] = 0;
            this.field2930.field1980 = this.field2931[var4];
            this.method3340(var4);
            this.field2934[var4] = this.field2930.field1980;
        }
    }
}
