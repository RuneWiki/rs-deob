package deob;

@ObfuscatedName("gi")
public class class207 {

    @ObfuscatedName("gi.p")
    public class174 field2590 = new class174((byte[]) null);

    @ObfuscatedName("gi.m")
    public int field2577;

    @ObfuscatedName("gi.e")
    public int[] field2584;

    @ObfuscatedName("gi.t")
    public int[] field2580;

    @ObfuscatedName("gi.w")
    public int[] field2581;

    @ObfuscatedName("gi.z")
    public int[] field2579;

    @ObfuscatedName("gi.j")
    public int field2583;

    @ObfuscatedName("gi.f")
    public long field2585;

    @ObfuscatedName("gi.c")
    public static final byte[] field2582 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public class207() {
    }

    public class207(byte[] arg0) {
        this.method3457(arg0);
    }

    @ObfuscatedName("gi.p([B)V")
    public void method3457(byte[] arg0) {
        this.field2590.field2415 = arg0;
        this.field2590.field2408 = 10;
        int var2 = this.field2590.method2824();
        this.field2577 = this.field2590.method2824();
        this.field2583 = 500000;
        this.field2584 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2590.method2803();
            int var5 = this.field2590.method2803();
            if (var4 == 1297379947) {
                this.field2584[var3] = this.field2590.field2408;
                var3++;
            }
            this.field2590.field2408 += var5;
        }
        this.field2585 = 0L;
        this.field2580 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2580[var6] = this.field2584[var6];
        }
        this.field2581 = new int[var2];
        this.field2579 = new int[var2];
    }

    @ObfuscatedName("gi.m()V")
    public void method3458() {
        this.field2590.field2415 = null;
        this.field2584 = null;
        this.field2580 = null;
        this.field2581 = null;
        this.field2579 = null;
    }

    @ObfuscatedName("gi.e()Z")
    public boolean method3459() {
        return this.field2590.field2415 != null;
    }

    @ObfuscatedName("gi.t()I")
    public int method3460() {
        return this.field2580.length;
    }

    @ObfuscatedName("gi.w(I)V")
    public void method3461(int arg0) {
        this.field2590.field2408 = this.field2580[arg0];
    }

    @ObfuscatedName("gi.z(I)V")
    public void method3465(int arg0) {
        this.field2580[arg0] = this.field2590.field2408;
    }

    @ObfuscatedName("gi.j()V")
    public void method3462() {
        this.field2590.field2408 = -1;
    }

    @ObfuscatedName("gi.c(I)V")
    public void method3464(int arg0) {
        int var2 = this.field2590.method2826();
        this.field2581[arg0] += var2;
    }

    @ObfuscatedName("gi.o(I)I")
    public int method3504(int arg0) {
        return this.method3466(arg0);
    }

    @ObfuscatedName("gi.q(I)I")
    public int method3466(int arg0) {
        byte var2 = this.field2590.field2415[this.field2590.field2408];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2579[arg0] = var3;
            this.field2590.field2408++;
        } else {
            var3 = this.field2579[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3467(arg0, var3);
        }
        int var4 = this.field2590.method2826();
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2590.field2415[this.field2590.field2408] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2590.field2408++;
                this.field2579[arg0] = var5;
                return this.method3467(arg0, var5);
            }
        }
        this.field2590.field2408 += var4;
        return 0;
    }

    @ObfuscatedName("gi.n(II)I")
    public int method3467(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2582[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2590.method2810() << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2590.method2810() << 16;
            }
            return var8;
        }
        int var3 = this.field2590.method2810();
        int var4 = this.field2590.method2826();
        if (var3 == 47) {
            this.field2590.field2408 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2590.method2832();
            var4 -= 3;
            int var6 = this.field2581[arg0];
            this.field2585 += (long) (this.field2583 - var5) * (long) var6;
            this.field2583 = var5;
            this.field2590.field2408 += var4;
            return 2;
        } else {
            this.field2590.field2408 += var4;
            return 3;
        }
    }

    @ObfuscatedName("gi.a(I)J")
    public long method3463(int arg0) {
        return (long) this.field2583 * (long) arg0 + this.field2585;
    }

    @ObfuscatedName("gi.g()I")
    public int method3468() {
        int var1 = this.field2580.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2580[var4] >= 0 && this.field2581[var4] < var3) {
                var2 = var4;
                var3 = this.field2581[var4];
            }
        }
        return var2;
    }

    @ObfuscatedName("gi.v()Z")
    public boolean method3501() {
        int var1 = this.field2580.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2580[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gi.s(J)V")
    public void method3470(long arg0) {
        this.field2585 = arg0;
        int var3 = this.field2580.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2581[var4] = 0;
            this.field2579[var4] = 0;
            this.field2590.field2408 = this.field2584[var4];
            this.method3464(var4);
            this.field2580[var4] = this.field2590.field2408;
        }
    }
}
