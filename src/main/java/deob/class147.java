package deob;

import java.util.zip.CRC32;

@ObfuscatedName("eq")
public class class147 extends class146 {

    @ObfuscatedName("eq.k")
    public class121 field2457;

    @ObfuscatedName("eq.e")
    public class121 field2456;

    @ObfuscatedName("eq.v")
    public int field2459;

    @ObfuscatedName("eq.n")
    public volatile boolean field2455 = false;

    @ObfuscatedName("eq.d")
    public boolean field2458 = false;

    @ObfuscatedName("eq.m")
    public volatile boolean[] field2460;

    @ObfuscatedName("eq.g")
    public static CRC32 field2461 = new CRC32();

    @ObfuscatedName("eq.aq")
    public int field2462;

    @ObfuscatedName("eq.ao")
    public int field2463;

    @ObfuscatedName("eq.af")
    public int field2464 = -1;

    public class147(class121 arg0, class121 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2457 = arg0;
        this.field2456 = arg1;
        this.field2459 = arg2;
        this.field2458 = arg5;
        class150.method467(this, this.field2459);
    }

    @ObfuscatedName("eq.cw(I)I")
    public int method2789() {
        if (this.field2455) {
            return 100;
        } else if (this.field2448 == null) {
            int var1 = class150.method683(255, this.field2459);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("eq.j(II)V")
    public void method2704(int arg0) {
        Statics.method2684(this.field2459, arg0);
    }

    @ObfuscatedName("eq.r(II)V")
    public void method2713(int arg0) {
        if (this.field2457 == null || this.field2460 == null || !this.field2460[arg0]) {
            class150.method146(this, this.field2459, arg0, this.field2442[arg0], (byte) 2, true);
        } else {
            class149.method2523(arg0, this.field2457, this);
        }
    }

    @ObfuscatedName("eq.cz(III)V")
    public void method2792(int arg0, int arg1) {
        this.field2462 = arg0;
        this.field2463 = arg1;
        if (this.field2456 == null) {
            class150.method146(this, 255, this.field2459, this.field2462, (byte) 0, true);
            return;
        }
        int var3 = this.field2459;
        class121 var4 = this.field2456;
        byte[] var6 = null;
        class177 var7 = class149.field2477;
        synchronized (class149.field2477) {
            for (class148 var8 = (class148) class149.field2477.method3232(); var8 != null; var8 = (class148) class149.field2477.method3251()) {
                if ((long) var3 == var8.field2857 && var8.field2469 == var4 && var8.field2471 == 0) {
                    var6 = var8.field2466;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2468(var3);
            this.method2794(var4, var3, var10, true);
        } else {
            this.method2794(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("eq.cj(I[BZZI)V")
    public void method2793(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2455) {
                throw new RuntimeException();
            }
            if (this.field2456 != null) {
                class149.method1959(this.field2459, arg1, this.field2456);
            }
            this.method2703(arg1);
            this.method2797();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2449[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2449[arg0];
        if (this.field2457 != null) {
            class149.method1959(arg0, arg1, this.field2457);
            this.field2460[arg0] = true;
        }
        if (arg3) {
            this.field2448[arg0] = class112.method626(arg1, false);
        }
    }

    @ObfuscatedName("eq.cm(Ldm;I[BZI)V")
    public void method2794(class121 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2456 != arg0) {
            if (!arg3 && this.field2464 == arg1) {
                this.field2455 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2460[arg1] = false;
                if (this.field2458 || arg3) {
                    class150.method146(this, this.field2459, arg1, this.field2442[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2461.reset();
            field2461.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2461.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2442[arg1] != var9 || this.field2449[arg1] != var10) {
                this.field2460[arg1] = false;
                if (this.field2458 || arg3) {
                    class150.method146(this, this.field2459, arg1, this.field2442[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2460[arg1] = true;
            if (arg3) {
                this.field2448[arg1] = class112.method626(arg2, false);
            }
            return;
        }
        if (this.field2455) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class150.method146(this, 255, this.field2459, this.field2462, (byte) 0, true);
            return;
        }
        field2461.reset();
        field2461.update(arg2, 0, arg2.length);
        int var5 = (int) field2461.getValue();
        class107 var6 = new class107(class146.method87(arg2));
        int var7 = var6.method2122();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2127();
        }
        if (this.field2462 != var5 || this.field2463 != var8) {
            class150.method146(this, 255, this.field2459, this.field2462, (byte) 0, true);
            return;
        }
        this.method2703(arg2);
        this.method2797();
    }

    @ObfuscatedName("eq.cs(B)V")
    public void method2797() {
        this.field2460 = new boolean[this.field2448.length];
        for (int var1 = 0; var1 < this.field2460.length; var1++) {
            this.field2460[var1] = false;
        }
        if (this.field2457 == null) {
            this.field2455 = true;
            return;
        }
        this.field2464 = -1;
        for (int var2 = 0; var2 < this.field2460.length; var2++) {
            if (this.field2444[var2] > 0) {
                class121 var3 = this.field2457;
                class148 var5 = new class148();
                var5.field2471 = 1;
                var5.field2857 = (long) var2;
                var5.field2469 = var3;
                var5.field2467 = this;
                class177 var6 = class149.field2477;
                synchronized (class149.field2477) {
                    class149.field2477.method3227(var5);
                }
                Object var8 = class149.field2478;
                synchronized (class149.field2478) {
                    if (class149.field2480 == 0) {
                        Statics.field1881.method2484(new class149(), 5);
                    }
                    class149.field2480 = 600;
                }
                this.field2464 = var2;
            }
        }
        if (this.field2464 == -1) {
            this.field2455 = true;
        }
    }

    @ObfuscatedName("eq.cv(II)I")
    public int method2795(int arg0) {
        if (this.field2448[arg0] == null) {
            return this.field2460[arg0] ? 100 : class150.method683(this.field2459, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("eq.cx(I)I")
    public int method2796() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2448.length; var3++) {
            if (this.field2444[var3] > 0) {
                var1 += 100;
                var2 += this.method2795(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
