package deob;

@ObfuscatedName("je")
public class class275 {

    @ObfuscatedName("je.c")
    public class443 field3245 = new class443((byte[]) null);

    @ObfuscatedName("je.v")
    public int field3247;

    @ObfuscatedName("je.q")
    public int[] field3236;

    @ObfuscatedName("je.f")
    public int[] field3243;

    @ObfuscatedName("je.j")
    public int[] field3238;

    @ObfuscatedName("je.e")
    public int[] field3239;

    @ObfuscatedName("je.g")
    public int field3240;

    @ObfuscatedName("je.y")
    public long field3242;

    @ObfuscatedName("je.i")
    public static final byte[] field3234 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class275() {
    }

    public class275(byte[] arg0) {
        this.method4918(arg0);
    }

    @ObfuscatedName("je.c([B)V")
    public void method4918(byte[] arg0) {
        this.field3245.field4701 = arg0;
        this.field3245.field4700 = 10;
        int var2 = this.field3245.method7049();
        this.field3247 = this.field3245.method7049();
        this.field3240 = 500000;
        this.field3236 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3245.method7052();
            int var5 = this.field3245.method7052();
            if (var4 == 1297379947) {
                this.field3236[var3] = this.field3245.field4700;
                var3++;
            }
            this.field3245.field4700 += var5;
        }
        this.field3242 = 0L;
        this.field3243 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3243[var6] = this.field3236[var6];
        }
        this.field3238 = new int[var2];
        this.field3239 = new int[var2];
    }

    @ObfuscatedName("je.v()V")
    public void method4884() {
        this.field3245.field4701 = null;
        this.field3236 = null;
        this.field3243 = null;
        this.field3238 = null;
        this.field3239 = null;
    }

    @ObfuscatedName("je.q()Z")
    public boolean method4876() {
        return this.field3245.field4701 != null;
    }

    @ObfuscatedName("je.f()I")
    public int method4877() {
        return this.field3243.length;
    }

    @ObfuscatedName("je.j(I)V")
    public void method4892(int arg0) {
        this.field3245.field4700 = this.field3243[arg0];
    }

    @ObfuscatedName("je.e(I)V")
    public void method4900(int arg0) {
        this.field3243[arg0] = this.field3245.field4700;
    }

    @ObfuscatedName("je.g()V")
    public void method4888() {
        this.field3245.field4700 = -1;
    }

    @ObfuscatedName("je.w(I)V")
    public void method4880(int arg0) {
        int var2 = this.field3245.method7067();
        this.field3238[arg0] += var2;
    }

    @ObfuscatedName("je.y(I)I")
    public int method4879(int arg0) {
        return this.method4882(arg0);
    }

    @ObfuscatedName("je.i(I)I")
    public int method4882(int arg0) {
        byte var2 = this.field3245.field4701[this.field3245.field4700];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3239[arg0] = var3;
            this.field3245.field4700++;
        } else {
            var3 = this.field3239[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method4883(arg0, var3);
        }
        int var4 = this.field3245.method7067();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3245.field4701[this.field3245.field4700] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3245.field4700++;
                this.field3239[arg0] = var5;
                return this.method4883(arg0, var5);
            }
        }
        this.field3245.field4700 += var4;
        return 0;
    }

    @ObfuscatedName("je.s(II)I")
    public int method4883(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3234[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3245.method7047() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3245.method7047() << 16;
            }
            return var8;
        }
        int var3 = this.field3245.method7047();
        int var4 = this.field3245.method7067();
        if (var3 == 47) {
            this.field3245.field4700 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3245.method7051();
            var4 -= 3;
            int var6 = this.field3238[arg0];
            this.field3242 += (long) (this.field3240 - var5) * (long) var6;
            this.field3240 = var5;
            this.field3245.field4700 += var4;
            return 2;
        } else {
            this.field3245.field4700 += var4;
            return 3;
        }
    }

    @ObfuscatedName("je.t(I)J")
    public long method4896(int arg0) {
        return (long) this.field3240 * (long) arg0 + this.field3242;
    }

    @ObfuscatedName("je.z()I")
    public int method4885() {
        int var1 = this.field3243.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3243[var4] >= 0 && this.field3238[var4] < var3) {
                var2 = var4;
                var3 = this.field3238[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("je.r()Z")
    public boolean method4886() {
        int var1 = this.field3243.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3243[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("je.u(J)V")
    public void method4887(long arg0) {
        this.field3242 = arg0;
        int var3 = this.field3243.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3238[var4] = 0;
            this.field3239[var4] = 0;
            this.field3245.field4700 = this.field3236[var4];
            this.method4880(var4);
            this.field3243[var4] = this.field3245.field4700;
        }
    }
}
