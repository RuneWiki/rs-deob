package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ef")
public class class147 extends class146 {

    @ObfuscatedName("ef.a")
    public class121 field2464;

    @ObfuscatedName("ef.w")
    public class121 field2463;

    @ObfuscatedName("ef.z")
    public int field2465;

    @ObfuscatedName("ef.v")
    public volatile boolean field2466 = false;

    @ObfuscatedName("ef.s")
    public boolean field2467 = false;

    @ObfuscatedName("ef.r")
    public volatile boolean[] field2468;

    @ObfuscatedName("ef.d")
    public static CRC32 field2469 = new CRC32();

    @ObfuscatedName("ef.al")
    public int field2473;

    @ObfuscatedName("ef.ab")
    public int field2471;

    @ObfuscatedName("ef.au")
    public int field2472 = -1;

    public class147(class121 arg0, class121 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2464 = arg0;
        this.field2463 = arg1;
        this.field2465 = arg2;
        this.field2467 = arg5;
        class150.method692(this, this.field2465);
    }

    @ObfuscatedName("ef.bn(B)I")
    public int method2767() {
        if (this.field2466) {
            return 100;
        } else if (this.field2451 == null) {
            int var1 = this.field2465;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2491 != null && Statics.field2491.field2861 == var2) {
                var4 = Statics.field971.field1845 * 99 / (Statics.field971.field1844.length - Statics.field2491.field2520) + 1;
            } else {
                var4 = 0;
            }
            int var5 = var4;
            if (var4 >= 100) {
                var5 = 99;
            }
            return var5;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ef.u(II)V")
    public void method2750(int arg0) {
        class150.method2572(this.field2465, arg0);
    }

    @ObfuscatedName("ef.k(II)V")
    public void method2700(int arg0) {
        if (this.field2464 == null || this.field2468 == null || !this.field2468[arg0]) {
            class150.method114(this, this.field2465, arg0, this.field2449[arg0], (byte) 2, true);
            return;
        }
        class121 var2 = this.field2464;
        byte[] var4 = null;
        class177 var5 = class149.field2495;
        synchronized (class149.field2495) {
            for (class148 var6 = (class148) class149.field2495.method3185(); var6 != null; var6 = (class148) class149.field2495.method3187()) {
                if ((long) arg0 == var6.field2861 && var6.field2479 == var2 && var6.field2485 == 0) {
                    var4 = var6.field2478;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2475(arg0);
            this.method2779(var2, arg0, var8, true);
        } else {
            this.method2779(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ef.ci(IIB)V")
    public void method2774(int arg0, int arg1) {
        this.field2473 = arg0;
        this.field2471 = arg1;
        if (this.field2463 == null) {
            class150.method114(this, 255, this.field2465, this.field2473, (byte) 0, true);
            return;
        }
        int var3 = this.field2465;
        class121 var4 = this.field2463;
        byte[] var6 = null;
        class177 var7 = class149.field2495;
        synchronized (class149.field2495) {
            for (class148 var8 = (class148) class149.field2495.method3185(); var8 != null; var8 = (class148) class149.field2495.method3187()) {
                if ((long) var3 == var8.field2861 && var8.field2479 == var4 && var8.field2485 == 0) {
                    var6 = var8.field2478;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2475(var3);
            this.method2779(var4, var3, var10, true);
        } else {
            this.method2779(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ef.cj(I[BZZI)V")
    public void method2786(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2466) {
                throw new RuntimeException();
            }
            if (this.field2463 != null) {
                class149.method2792(this.field2465, arg1, this.field2463);
            }
            this.method2706(arg1);
            this.method2770();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2452[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2452[arg0];
        if (this.field2464 != null) {
            class149.method2792(arg0, arg1, this.field2464);
            this.field2468[arg0] = true;
        }
        if (arg3) {
            this.field2451[arg0] = class112.method766(arg1, false);
        }
    }

    @ObfuscatedName("ef.cw(Lde;I[BZI)V")
    public void method2779(class121 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2463 != arg0) {
            if (!arg3 && this.field2472 == arg1) {
                this.field2466 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2468[arg1] = false;
                if (this.field2467 || arg3) {
                    class150.method114(this, this.field2465, arg1, this.field2449[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2469.reset();
            field2469.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2469.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2449[arg1] != var9 || this.field2452[arg1] != var10) {
                this.field2468[arg1] = false;
                if (this.field2467 || arg3) {
                    class150.method114(this, this.field2465, arg1, this.field2449[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2468[arg1] = true;
            if (arg3) {
                this.field2451[arg1] = class112.method766(arg2, false);
            }
            return;
        }
        if (this.field2466) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class150.method114(this, 255, this.field2465, this.field2473, (byte) 0, true);
            return;
        }
        field2469.reset();
        field2469.update(arg2, 0, arg2.length);
        int var5 = (int) field2469.getValue();
        class107 var6 = new class107(class146.method2672(arg2));
        int var7 = var6.method2134();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2139();
        }
        if (this.field2473 != var5 || this.field2471 != var8) {
            class150.method114(this, 255, this.field2465, this.field2473, (byte) 0, true);
            return;
        }
        this.method2706(arg2);
        this.method2770();
    }

    @ObfuscatedName("ef.cx(B)V")
    public void method2770() {
        this.field2468 = new boolean[this.field2451.length];
        for (int var1 = 0; var1 < this.field2468.length; var1++) {
            this.field2468[var1] = false;
        }
        if (this.field2464 == null) {
            this.field2466 = true;
            return;
        }
        this.field2472 = -1;
        for (int var2 = 0; var2 < this.field2468.length; var2++) {
            if (this.field2461[var2] > 0) {
                class149.method124(var2, this.field2464, this);
                this.field2472 = var2;
            }
        }
        if (this.field2472 == -1) {
            this.field2466 = true;
        }
    }

    @ObfuscatedName("ef.cs(II)I")
    public int method2771(int arg0) {
        if (this.field2451[arg0] != null) {
            return 100;
        } else if (this.field2468[arg0]) {
            return 100;
        } else {
            int var2 = this.field2465;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2491 != null && Statics.field2491.field2861 == var3) {
                var5 = Statics.field971.field1845 * 99 / (Statics.field971.field1844.length - Statics.field2491.field2520) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ef.cn(I)I")
    public int method2772() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2451.length; var3++) {
            if (this.field2461[var3] > 0) {
                var1 += 100;
                var2 += this.method2771(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
