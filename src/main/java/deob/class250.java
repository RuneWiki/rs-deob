package deob;

@ObfuscatedName("in")
public class class250 {

    @ObfuscatedName("in.n")
    public class400 field2938 = new class400((byte[]) null);

    @ObfuscatedName("in.c")
    public int field2937;

    @ObfuscatedName("in.m")
    public int[] field2942;

    @ObfuscatedName("in.k")
    public int[] field2939;

    @ObfuscatedName("in.o")
    public int[] field2948;

    @ObfuscatedName("in.g")
    public int[] field2941;

    @ObfuscatedName("in.z")
    public int field2940;

    @ObfuscatedName("in.u")
    public long field2944;

    @ObfuscatedName("in.e")
    public static final byte[] field2945 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class250() {
    }

    public class250(byte[] arg0) {
        this.method4351(arg0);
    }

    @ObfuscatedName("in.n([B)V")
    public void method4351(byte[] arg0) {
        this.field2938.field4271 = arg0;
        this.field2938.field4272 = 10;
        int var2 = this.field2938.method6219();
        this.field2937 = this.field2938.method6219();
        this.field2940 = 500000;
        this.field2942 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2938.method6222();
            int var5 = this.field2938.method6222();
            if (var4 == 1297379947) {
                this.field2942[var3] = this.field2938.field4272;
                var3++;
            }
            this.field2938.field4272 += var5;
        }
        this.field2944 = 0L;
        this.field2939 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2939[var6] = this.field2942[var6];
        }
        this.field2948 = new int[var2];
        this.field2941 = new int[var2];
    }

    @ObfuscatedName("in.c()V")
    public void method4352() {
        this.field2938.field4271 = null;
        this.field2942 = null;
        this.field2939 = null;
        this.field2948 = null;
        this.field2941 = null;
    }

    @ObfuscatedName("in.m()Z")
    public boolean method4390() {
        return this.field2938.field4271 != null;
    }

    @ObfuscatedName("in.k()I")
    public int method4354() {
        return this.field2939.length;
    }

    @ObfuscatedName("in.o(I)V")
    public void method4355(int arg0) {
        this.field2938.field4272 = this.field2939[arg0];
    }

    @ObfuscatedName("in.g(I)V")
    public void method4363(int arg0) {
        this.field2939[arg0] = this.field2938.field4272;
    }

    @ObfuscatedName("in.z()V")
    public void method4357() {
        this.field2938.field4272 = -1;
    }

    @ObfuscatedName("in.a(I)V")
    public void method4383(int arg0) {
        int var2 = this.field2938.method6235();
        this.field2948[arg0] += var2;
    }

    @ObfuscatedName("in.u(I)I")
    public int method4359(int arg0) {
        return this.method4356(arg0);
    }

    @ObfuscatedName("in.e(I)I")
    public int method4356(int arg0) {
        byte var2 = this.field2938.field4271[this.field2938.field4272];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2941[arg0] = var3;
            this.field2938.field4272++;
        } else {
            var3 = this.field2941[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method4360(arg0, var3);
        }
        int var4 = this.field2938.method6235();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2938.field4271[this.field2938.field4272] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2938.field4272++;
                this.field2941[arg0] = var5;
                return this.method4360(arg0, var5);
            }
        }
        this.field2938.field4272 += var4;
        return 0;
    }

    @ObfuscatedName("in.l(II)I")
    public int method4360(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2945[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2938.method6217() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2938.method6217() << 16;
            }
            return var8;
        }
        int var3 = this.field2938.method6217();
        int var4 = this.field2938.method6235();
        if (var3 == 47) {
            this.field2938.field4272 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2938.method6327();
            var4 -= 3;
            int var6 = this.field2948[arg0];
            this.field2944 += (long) (this.field2940 - var5) * (long) var6;
            this.field2940 = var5;
            this.field2938.field4272 += var4;
            return 2;
        } else {
            this.field2938.field4272 += var4;
            return 3;
        }
    }

    @ObfuscatedName("in.y(I)J")
    public long method4372(int arg0) {
        return (long) this.field2940 * (long) arg0 + this.field2944;
    }

    @ObfuscatedName("in.v()I")
    public int method4362() {
        int var1 = this.field2939.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2939[var4] >= 0 && this.field2948[var4] < var3) {
                var2 = var4;
                var3 = this.field2948[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("in.f()Z")
    public boolean method4391() {
        int var1 = this.field2939.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2939[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("in.s(J)V")
    public void method4364(long arg0) {
        this.field2944 = arg0;
        int var3 = this.field2939.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2948[var4] = 0;
            this.field2941[var4] = 0;
            this.field2938.field4272 = this.field2942[var4];
            this.method4383(var4);
            this.field2939[var4] = this.field2938.field4272;
        }
    }
}
