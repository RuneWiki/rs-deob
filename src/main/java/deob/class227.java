package deob;

@ObfuscatedName("hm")
public class class227 {

    @ObfuscatedName("hm.b")
    public class194 field2704 = new class194((byte[]) null);

    @ObfuscatedName("hm.q")
    public int field2710;

    @ObfuscatedName("hm.o")
    public int[] field2705;

    @ObfuscatedName("hm.p")
    public int[] field2706;

    @ObfuscatedName("hm.a")
    public int[] field2707;

    @ObfuscatedName("hm.h")
    public int[] field2708;

    @ObfuscatedName("hm.l")
    public int field2711;

    @ObfuscatedName("hm.g")
    public long field2715;

    @ObfuscatedName("hm.c")
    public static final byte[] field2712 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class227() {
    }

    public class227(byte[] arg0) {
        this.method3971(arg0);
    }

    @ObfuscatedName("hm.b([B)V")
    public void method3971(byte[] arg0) {
        this.field2704.field2541 = arg0;
        this.field2704.field2538 = 10;
        int var2 = this.field2704.method3249();
        this.field2710 = this.field2704.method3249();
        this.field2711 = 500000;
        this.field2705 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2704.method3261();
            int var5 = this.field2704.method3261();
            if (var4 == 1297379947) {
                this.field2705[var3] = this.field2704.field2538;
                var3++;
            }
            this.field2704.field2538 += var5;
        }
        this.field2715 = 0L;
        this.field2706 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2706[var6] = this.field2705[var6];
        }
        this.field2707 = new int[var2];
        this.field2708 = new int[var2];
    }

    @ObfuscatedName("hm.q()V")
    public void method3934() {
        this.field2704.field2541 = null;
        this.field2705 = null;
        this.field2706 = null;
        this.field2707 = null;
        this.field2708 = null;
    }

    @ObfuscatedName("hm.o()Z")
    public boolean method3935() {
        return this.field2704.field2541 != null;
    }

    @ObfuscatedName("hm.p()I")
    public int method3936() {
        return this.field2706.length;
    }

    @ObfuscatedName("hm.a(I)V")
    public void method3982(int arg0) {
        this.field2704.field2538 = this.field2706[arg0];
    }

    @ObfuscatedName("hm.h(I)V")
    public void method3980(int arg0) {
        this.field2706[arg0] = this.field2704.field2538;
    }

    @ObfuscatedName("hm.l()V")
    public void method3937() {
        this.field2704.field2538 = -1;
    }

    @ObfuscatedName("hm.y(I)V")
    public void method3940(int arg0) {
        int var2 = this.field2704.method3374();
        this.field2707[arg0] += var2;
    }

    @ObfuscatedName("hm.g(I)I")
    public int method3941(int arg0) {
        return this.method3954(arg0);
    }

    @ObfuscatedName("hm.c(I)I")
    public int method3954(int arg0) {
        byte var2 = this.field2704.field2541[this.field2704.field2538];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2708[arg0] = var3;
            this.field2704.field2538++;
        } else {
            var3 = this.field2708[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3969(arg0, var3);
        }
        int var4 = this.field2704.method3374();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2704.field2541[this.field2704.field2538] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2704.field2538++;
                this.field2708[arg0] = var5;
                return this.method3969(arg0, var5);
            }
        }
        this.field2704.field2538 += var4;
        return 0;
    }

    @ObfuscatedName("hm.u(II)I")
    public int method3969(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2712[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2704.method3247() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2704.method3247() << 16;
            }
            return var8;
        }
        int var3 = this.field2704.method3247();
        int var4 = this.field2704.method3374();
        if (var3 == 47) {
            this.field2704.field2538 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2704.method3251();
            var4 -= 3;
            int var6 = this.field2707[arg0];
            this.field2715 += (long) (this.field2711 - var5) * (long) var6;
            this.field2711 = var5;
            this.field2704.field2538 += var4;
            return 2;
        } else {
            this.field2704.field2538 += var4;
            return 3;
        }
    }

    @ObfuscatedName("hm.t(I)J")
    public long method3948(int arg0) {
        return (long) this.field2711 * (long) arg0 + this.field2715;
    }

    @ObfuscatedName("hm.f()I")
    public int method3945() {
        int var1 = this.field2706.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2706[var4] >= 0 && this.field2707[var4] < var3) {
                var2 = var4;
                var3 = this.field2707[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("hm.m()Z")
    public boolean method3947() {
        int var1 = this.field2706.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2706[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hm.x(J)V")
    public void method3963(long arg0) {
        this.field2715 = arg0;
        int var3 = this.field2706.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2707[var4] = 0;
            this.field2708[var4] = 0;
            this.field2704.field2538 = this.field2705[var4];
            this.method3940(var4);
            this.field2706[var4] = this.field2704.field2538;
        }
    }
}
