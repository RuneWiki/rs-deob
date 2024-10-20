package deob;

@ObfuscatedName("je")
public class class276 {

    @ObfuscatedName("je.o")
    public class440 field3275 = new class440((byte[]) null);

    @ObfuscatedName("je.q")
    public int field3273;

    @ObfuscatedName("je.l")
    public int[] field3272;

    @ObfuscatedName("je.k")
    public int[] field3279;

    @ObfuscatedName("je.a")
    public int[] field3276;

    @ObfuscatedName("je.m")
    public int[] field3277;

    @ObfuscatedName("je.p")
    public int field3282;

    @ObfuscatedName("je.r")
    public long field3280;

    @ObfuscatedName("je.v")
    public static final byte[] field3281 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class276() {
    }

    public class276(byte[] arg0) {
        this.method4779(arg0);
    }

    @ObfuscatedName("je.o([B)V")
    public void method4779(byte[] arg0) {
        this.field3275.field4679 = arg0;
        this.field3275.field4678 = 10;
        int var2 = this.field3275.method7082();
        this.field3273 = this.field3275.method7082();
        this.field3282 = 500000;
        this.field3272 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3275.method6898();
            int var5 = this.field3275.method6898();
            if (var4 == 1297379947) {
                this.field3272[var3] = this.field3275.field4678;
                var3++;
            }
            this.field3275.field4678 += var5;
        }
        this.field3280 = 0L;
        this.field3279 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3279[var6] = this.field3272[var6];
        }
        this.field3276 = new int[var2];
        this.field3277 = new int[var2];
    }

    @ObfuscatedName("je.q()V")
    public void method4793() {
        this.field3275.field4679 = null;
        this.field3272 = null;
        this.field3279 = null;
        this.field3276 = null;
        this.field3277 = null;
    }

    @ObfuscatedName("je.l()Z")
    public boolean method4781() {
        return this.field3275.field4679 != null;
    }

    @ObfuscatedName("je.k()I")
    public int method4782() {
        return this.field3279.length;
    }

    @ObfuscatedName("je.a(I)V")
    public void method4777(int arg0) {
        this.field3275.field4678 = this.field3279[arg0];
    }

    @ObfuscatedName("je.m(I)V")
    public void method4784(int arg0) {
        this.field3279[arg0] = this.field3275.field4678;
    }

    @ObfuscatedName("je.p()V")
    public void method4785() {
        this.field3275.field4678 = -1;
    }

    @ObfuscatedName("je.s(I)V")
    public void method4805(int arg0) {
        int var2 = this.field3275.method6965();
        this.field3276[arg0] += var2;
    }

    @ObfuscatedName("je.r(I)I")
    public int method4810(int arg0) {
        return this.method4788(arg0);
    }

    @ObfuscatedName("je.v(I)I")
    public int method4788(int arg0) {
        byte var2 = this.field3275.field4679[this.field3275.field4678];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3277[arg0] = var3;
            this.field3275.field4678++;
        } else {
            var3 = this.field3277[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method4783(arg0, var3);
        }
        int var4 = this.field3275.method6965();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3275.field4679[this.field3275.field4678] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3275.field4678++;
                this.field3277[arg0] = var5;
                return this.method4783(arg0, var5);
            }
        }
        this.field3275.field4678 += var4;
        return 0;
    }

    @ObfuscatedName("je.y(II)I")
    public int method4783(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3281[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3275.method7071() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3275.method7071() << 16;
            }
            return var8;
        }
        int var3 = this.field3275.method7071();
        int var4 = this.field3275.method6965();
        if (var3 == 47) {
            this.field3275.field4678 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3275.method6897();
            var4 -= 3;
            int var6 = this.field3276[arg0];
            this.field3280 += (long) (this.field3282 - var5) * (long) var6;
            this.field3282 = var5;
            this.field3275.field4678 += var4;
            return 2;
        } else {
            this.field3275.field4678 += var4;
            return 3;
        }
    }

    @ObfuscatedName("je.c(I)J")
    public long method4789(int arg0) {
        return (long) this.field3282 * (long) arg0 + this.field3280;
    }

    @ObfuscatedName("je.w()I")
    public int method4817() {
        int var1 = this.field3279.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3279[var4] >= 0 && this.field3276[var4] < var3) {
                var2 = var4;
                var3 = this.field3276[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("je.b()Z")
    public boolean method4791() {
        int var1 = this.field3279.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3279[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("je.t(J)V")
    public void method4792(long arg0) {
        this.field3280 = arg0;
        int var3 = this.field3279.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3276[var4] = 0;
            this.field3277[var4] = 0;
            this.field3275.field4678 = this.field3272[var4];
            this.method4805(var4);
            this.field3279[var4] = this.field3275.field4678;
        }
    }
}
