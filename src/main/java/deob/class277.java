package deob;

@ObfuscatedName("jo")
public class class277 {

    @ObfuscatedName("jo.c")
    public class445 field3267 = new class445((byte[]) null);

    @ObfuscatedName("jo.p")
    public int field3263;

    @ObfuscatedName("jo.f")
    public int[] field3264;

    @ObfuscatedName("jo.n")
    public int[] field3265;

    @ObfuscatedName("jo.k")
    public int[] field3268;

    @ObfuscatedName("jo.w")
    public int[] field3273;

    @ObfuscatedName("jo.s")
    public int field3262;

    @ObfuscatedName("jo.m")
    public long field3274;

    @ObfuscatedName("jo.x")
    public static final byte[] field3272 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class277() {
    }

    public class277(byte[] arg0) {
        this.method4995(arg0);
    }

    @ObfuscatedName("jo.c([B)V")
    public void method4995(byte[] arg0) {
        this.field3267.field4733 = arg0;
        this.field3267.field4735 = 10;
        int var2 = this.field3267.method7198();
        this.field3263 = this.field3267.method7198();
        this.field3262 = 500000;
        this.field3264 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3267.method7201();
            int var5 = this.field3267.method7201();
            if (var4 == 1297379947) {
                this.field3264[var3] = this.field3267.field4735;
                var3++;
            }
            this.field3267.field4735 += var5;
        }
        this.field3274 = 0L;
        this.field3265 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3265[var6] = this.field3264[var6];
        }
        this.field3268 = new int[var2];
        this.field3273 = new int[var2];
    }

    @ObfuscatedName("jo.p()V")
    public void method4981() {
        this.field3267.field4733 = null;
        this.field3264 = null;
        this.field3265 = null;
        this.field3268 = null;
        this.field3273 = null;
    }

    @ObfuscatedName("jo.f()Z")
    public boolean method4982() {
        return this.field3267.field4733 != null;
    }

    @ObfuscatedName("jo.n()I")
    public int method5003() {
        return this.field3265.length;
    }

    @ObfuscatedName("jo.k(I)V")
    public void method5027(int arg0) {
        this.field3267.field4735 = this.field3265[arg0];
    }

    @ObfuscatedName("jo.w(I)V")
    public void method4983(int arg0) {
        this.field3265[arg0] = this.field3267.field4735;
    }

    @ObfuscatedName("jo.s()V")
    public void method4986() {
        this.field3267.field4735 = -1;
    }

    @ObfuscatedName("jo.q(I)V")
    public void method5008(int arg0) {
        int var2 = this.field3267.method7216();
        this.field3268[arg0] += var2;
    }

    @ObfuscatedName("jo.m(I)I")
    public int method4988(int arg0) {
        return this.method5036(arg0);
    }

    @ObfuscatedName("jo.x(I)I")
    public int method5036(int arg0) {
        byte var2 = this.field3267.field4733[this.field3267.field4735];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3273[arg0] = var3;
            this.field3267.field4735++;
        } else {
            var3 = this.field3273[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method4984(arg0, var3);
        }
        int var4 = this.field3267.method7216();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3267.field4733[this.field3267.field4735] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3267.field4735++;
                this.field3273[arg0] = var5;
                return this.method4984(arg0, var5);
            }
        }
        this.field3267.field4735 += var4;
        return 0;
    }

    @ObfuscatedName("jo.j(II)I")
    public int method4984(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3272[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3267.method7196() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3267.method7196() << 16;
            }
            return var8;
        }
        int var3 = this.field3267.method7196();
        int var4 = this.field3267.method7216();
        if (var3 == 47) {
            this.field3267.field4735 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3267.method7340();
            var4 -= 3;
            int var6 = this.field3268[arg0];
            this.field3274 += (long) (this.field3262 - var5) * (long) var6;
            this.field3262 = var5;
            this.field3267.field4735 += var4;
            return 2;
        } else {
            this.field3267.field4735 += var4;
            return 3;
        }
    }

    @ObfuscatedName("jo.v(I)J")
    public long method4979(int arg0) {
        return (long) this.field3262 * (long) arg0 + this.field3274;
    }

    @ObfuscatedName("jo.h()I")
    public int method4992() {
        int var1 = this.field3265.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3265[var4] >= 0 && this.field3268[var4] < var3) {
                var2 = var4;
                var3 = this.field3268[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("jo.t()Z")
    public boolean method4993() {
        int var1 = this.field3265.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3265[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("jo.u(J)V")
    public void method4990(long arg0) {
        this.field3274 = arg0;
        int var3 = this.field3265.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3268[var4] = 0;
            this.field3273[var4] = 0;
            this.field3267.field4735 = this.field3264[var4];
            this.method5008(var4);
            this.field3265[var4] = this.field3267.field4735;
        }
    }
}
