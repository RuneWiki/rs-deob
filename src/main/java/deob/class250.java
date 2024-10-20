package deob;

@ObfuscatedName("iz")
public class class250 {

    @ObfuscatedName("iz.i")
    public class401 field2958 = new class401((byte[]) null);

    @ObfuscatedName("iz.w")
    public int field2959;

    @ObfuscatedName("iz.s")
    public int[] field2960;

    @ObfuscatedName("iz.a")
    public int[] field2961;

    @ObfuscatedName("iz.o")
    public int[] field2962;

    @ObfuscatedName("iz.g")
    public int[] field2965;

    @ObfuscatedName("iz.e")
    public int field2968;

    @ObfuscatedName("iz.j")
    public long field2966;

    @ObfuscatedName("iz.b")
    public static final byte[] field2964 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class250() {
    }

    public class250(byte[] arg0) {
        this.method4379(arg0);
    }

    @ObfuscatedName("iz.i([B)V")
    public void method4379(byte[] arg0) {
        this.field2958.field4302 = arg0;
        this.field2958.field4300 = 10;
        int var2 = this.field2958.method6242();
        this.field2959 = this.field2958.method6242();
        this.field2968 = 500000;
        this.field2960 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2958.method6245();
            int var5 = this.field2958.method6245();
            if (var4 == 1297379947) {
                this.field2960[var3] = this.field2958.field4300;
                var3++;
            }
            this.field2958.field4300 += var5;
        }
        this.field2966 = 0L;
        this.field2961 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2961[var6] = this.field2960[var6];
        }
        this.field2962 = new int[var2];
        this.field2965 = new int[var2];
    }

    @ObfuscatedName("iz.w()V")
    public void method4384() {
        this.field2958.field4302 = null;
        this.field2960 = null;
        this.field2961 = null;
        this.field2962 = null;
        this.field2965 = null;
    }

    @ObfuscatedName("iz.s()Z")
    public boolean method4427() {
        return this.field2958.field4302 != null;
    }

    @ObfuscatedName("iz.a()I")
    public int method4382() {
        return this.field2961.length;
    }

    @ObfuscatedName("iz.o(I)V")
    public void method4383(int arg0) {
        this.field2958.field4300 = this.field2961[arg0];
    }

    @ObfuscatedName("iz.g(I)V")
    public void method4378(int arg0) {
        this.field2961[arg0] = this.field2958.field4300;
    }

    @ObfuscatedName("iz.e()V")
    public void method4385() {
        this.field2958.field4300 = -1;
    }

    @ObfuscatedName("iz.p(I)V")
    public void method4389(int arg0) {
        int var2 = this.field2958.method6287();
        this.field2962[arg0] += var2;
    }

    @ObfuscatedName("iz.j(I)I")
    public int method4387(int arg0) {
        return this.method4388(arg0);
    }

    @ObfuscatedName("iz.b(I)I")
    public int method4388(int arg0) {
        byte var2 = this.field2958.field4302[this.field2958.field4300];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2965[arg0] = var3;
            this.field2958.field4300++;
        } else {
            var3 = this.field2965[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method4381(arg0, var3);
        }
        int var4 = this.field2958.method6287();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2958.field4302[this.field2958.field4300] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2958.field4300++;
                this.field2965[arg0] = var5;
                return this.method4381(arg0, var5);
            }
        }
        this.field2958.field4300 += var4;
        return 0;
    }

    @ObfuscatedName("iz.x(II)I")
    public int method4381(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2964[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2958.method6240() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2958.method6240() << 16;
            }
            return var8;
        }
        int var3 = this.field2958.method6240();
        int var4 = this.field2958.method6287();
        if (var3 == 47) {
            this.field2958.field4300 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2958.method6432();
            var4 -= 3;
            int var6 = this.field2962[arg0];
            this.field2966 += (long) (this.field2968 - var5) * (long) var6;
            this.field2968 = var5;
            this.field2958.field4300 += var4;
            return 2;
        } else {
            this.field2958.field4300 += var4;
            return 3;
        }
    }

    @ObfuscatedName("iz.y(I)J")
    public long method4424(int arg0) {
        return (long) this.field2968 * (long) arg0 + this.field2966;
    }

    @ObfuscatedName("iz.k()I")
    public int method4398() {
        int var1 = this.field2961.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2961[var4] >= 0 && this.field2962[var4] < var3) {
                var2 = var4;
                var3 = this.field2962[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("iz.t()Z")
    public boolean method4391() {
        int var1 = this.field2961.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2961[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("iz.l(J)V")
    public void method4392(long arg0) {
        this.field2966 = arg0;
        int var3 = this.field2961.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2962[var4] = 0;
            this.field2965[var4] = 0;
            this.field2958.field4300 = this.field2960[var4];
            this.method4389(var4);
            this.field2961[var4] = this.field2958.field4300;
        }
    }
}
