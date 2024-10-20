package deob;

@ObfuscatedName("jq")
public class class286 {

    @ObfuscatedName("jq.a")
    public class464 field3340 = new class464((byte[]) null);

    @ObfuscatedName("jq.f")
    public int field3341;

    @ObfuscatedName("jq.c")
    public int[] field3329;

    @ObfuscatedName("jq.x")
    public int[] field3331;

    @ObfuscatedName("jq.h")
    public int[] field3334;

    @ObfuscatedName("jq.j")
    public int[] field3333;

    @ObfuscatedName("jq.y")
    public int field3332;

    @ObfuscatedName("jq.n")
    public long field3336;

    @ObfuscatedName("jq.r")
    public static final byte[] field3337 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class286() {
    }

    public class286(byte[] arg0) {
        this.method5054(arg0);
    }

    @ObfuscatedName("jq.a([B)V")
    public void method5054(byte[] arg0) {
        this.field3340.field4867 = arg0;
        this.field3340.field4864 = 10;
        int var2 = this.field3340.method7716();
        this.field3341 = this.field3340.method7716();
        this.field3332 = 500000;
        this.field3329 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3340.method7720();
            int var5 = this.field3340.method7720();
            if (var4 == 1297379947) {
                this.field3329[var3] = this.field3340.field4864;
                var3++;
            }
            this.field3340.field4864 += var5;
        }
        this.field3336 = 0L;
        this.field3331 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3331[var6] = this.field3329[var6];
        }
        this.field3334 = new int[var2];
        this.field3333 = new int[var2];
    }

    @ObfuscatedName("jq.f()V")
    public void method5084() {
        this.field3340.field4867 = null;
        this.field3329 = null;
        this.field3331 = null;
        this.field3334 = null;
        this.field3333 = null;
    }

    @ObfuscatedName("jq.c()Z")
    public boolean method5056() {
        return this.field3340.field4867 != null;
    }

    @ObfuscatedName("jq.x()I")
    public int method5055() {
        return this.field3331.length;
    }

    @ObfuscatedName("jq.h(I)V")
    public void method5058(int arg0) {
        this.field3340.field4864 = this.field3331[arg0];
    }

    @ObfuscatedName("jq.j(I)V")
    public void method5059(int arg0) {
        this.field3331[arg0] = this.field3340.field4864;
    }

    @ObfuscatedName("jq.y()V")
    public void method5082() {
        this.field3340.field4864 = -1;
    }

    @ObfuscatedName("jq.d(I)V")
    public void method5061(int arg0) {
        int var2 = this.field3340.method7829();
        this.field3334[arg0] += var2;
    }

    @ObfuscatedName("jq.n(I)I")
    public int method5062(int arg0) {
        return this.method5063(arg0);
    }

    @ObfuscatedName("jq.r(I)I")
    public int method5063(int arg0) {
        byte var2 = this.field3340.field4867[this.field3340.field4864];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3333[arg0] = var3;
            this.field3340.field4864++;
        } else {
            var3 = this.field3333[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method5064(arg0, var3);
        }
        int var4 = this.field3340.method7829();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3340.field4867[this.field3340.field4864] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3340.field4864++;
                this.field3333[arg0] = var5;
                return this.method5064(arg0, var5);
            }
        }
        this.field3340.field4864 += var4;
        return 0;
    }

    @ObfuscatedName("jq.l(II)I")
    public int method5064(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3337[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3340.method7735() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3340.method7735() << 16;
            }
            return var8;
        }
        int var3 = this.field3340.method7735();
        int var4 = this.field3340.method7829();
        if (var3 == 47) {
            this.field3340.field4864 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3340.method7906();
            var4 -= 3;
            int var6 = this.field3334[arg0];
            this.field3336 += (long) (this.field3332 - var5) * (long) var6;
            this.field3332 = var5;
            this.field3340.field4864 += var4;
            return 2;
        } else {
            this.field3340.field4864 += var4;
            return 3;
        }
    }

    @ObfuscatedName("jq.s(I)J")
    public long method5065(int arg0) {
        return (long) this.field3332 * (long) arg0 + this.field3336;
    }

    @ObfuscatedName("jq.p()I")
    public int method5066() {
        int var1 = this.field3331.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3331[var4] >= 0 && this.field3334[var4] < var3) {
                var2 = var4;
                var3 = this.field3334[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("jq.b()Z")
    public boolean method5067() {
        int var1 = this.field3331.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3331[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("jq.o(J)V")
    public void method5098(long arg0) {
        this.field3336 = arg0;
        int var3 = this.field3331.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3334[var4] = 0;
            this.field3333[var4] = 0;
            this.field3340.field4864 = this.field3329[var4];
            this.method5061(var4);
            this.field3331[var4] = this.field3340.field4864;
        }
    }
}
