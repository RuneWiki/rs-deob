package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ei")
public class class147 extends class146 {

    @ObfuscatedName("ei.j")
    public class121 field2464;

    @ObfuscatedName("ei.z")
    public class121 field2460;

    @ObfuscatedName("ei.t")
    public int field2461;

    @ObfuscatedName("ei.c")
    public volatile boolean field2466 = false;

    @ObfuscatedName("ei.q")
    public boolean field2463 = false;

    @ObfuscatedName("ei.g")
    public volatile boolean[] field2459;

    @ObfuscatedName("ei.m")
    public static CRC32 field2465 = new CRC32();

    @ObfuscatedName("ei.ay")
    public int field2467;

    @ObfuscatedName("ei.ae")
    public int field2462;

    @ObfuscatedName("ei.af")
    public int field2468 = -1;

    public class147(class121 arg0, class121 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2464 = arg0;
        this.field2460 = arg1;
        this.field2461 = arg2;
        this.field2463 = arg5;
        class150.method2013(this, this.field2461);
    }

    @ObfuscatedName("ei.cw(B)I")
    public int method2720() {
        if (this.field2466) {
            return 100;
        } else if (this.field2438 == null) {
            int var1 = this.field2461;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2670 != null && Statics.field2670.field2874 == var2) {
                var4 = Statics.field2495.field1841 * 99 / (Statics.field2495.field1840.length - Statics.field2670.field2508) + 1;
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

    @ObfuscatedName("ei.o(IB)V")
    public void method2707(int arg0) {
        class150.method465(this.field2461, arg0);
    }

    @ObfuscatedName("ei.h(II)V")
    public void method2648(int arg0) {
        if (this.field2464 == null || this.field2459 == null || !this.field2459[arg0]) {
            class150.method697(this, this.field2461, arg0, this.field2441[arg0], (byte) 2, true);
            return;
        }
        class121 var2 = this.field2464;
        byte[] var4 = null;
        class177 var5 = class149.field2478;
        synchronized (class149.field2478) {
            for (class148 var6 = (class148) class149.field2478.method3122(); var6 != null; var6 = (class148) class149.field2478.method3124()) {
                if ((long) arg0 == var6.field2874 && var6.field2471 == var2 && var6.field2473 == 0) {
                    var4 = var6.field2470;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2399(arg0);
            this.method2725(var2, arg0, var8, true);
        } else {
            this.method2725(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ei.cf(III)V")
    public void method2747(int arg0, int arg1) {
        this.field2467 = arg0;
        this.field2462 = arg1;
        if (this.field2460 == null) {
            class150.method697(this, 255, this.field2461, this.field2467, (byte) 0, true);
            return;
        }
        int var3 = this.field2461;
        class121 var4 = this.field2460;
        byte[] var6 = null;
        class177 var7 = class149.field2478;
        synchronized (class149.field2478) {
            for (class148 var8 = (class148) class149.field2478.method3122(); var8 != null; var8 = (class148) class149.field2478.method3124()) {
                if ((long) var3 == var8.field2874 && var8.field2471 == var4 && var8.field2473 == 0) {
                    var6 = var8.field2470;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2399(var3);
            this.method2725(var4, var3, var10, true);
        } else {
            this.method2725(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ei.ce(I[BZZI)V")
    public void method2722(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2443[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2443[arg0];
            if (this.field2464 != null) {
                class121 var10 = this.field2464;
                class148 var11 = new class148();
                var11.field2473 = 0;
                var11.field2874 = (long) arg0;
                var11.field2470 = arg1;
                var11.field2471 = var10;
                class177 var12 = class149.field2478;
                synchronized (class149.field2478) {
                    class149.field2478.method3117(var11);
                }
                class149.method2729();
                this.field2459[arg0] = true;
            }
            if (arg3) {
                this.field2438[arg0] = class112.method598(arg1, false);
            }
            return;
        }
        if (this.field2466) {
            throw new RuntimeException();
        }
        if (this.field2460 != null) {
            int var5 = this.field2461;
            class121 var6 = this.field2460;
            class148 var7 = new class148();
            var7.field2473 = 0;
            var7.field2874 = (long) var5;
            var7.field2470 = arg1;
            var7.field2471 = var6;
            class177 var8 = class149.field2478;
            synchronized (class149.field2478) {
                class149.field2478.method3117(var7);
            }
            class149.method2729();
        }
        this.method2638(arg1);
        this.method2733();
    }

    @ObfuscatedName("ei.cu(Ldd;I[BZB)V")
    public void method2725(class121 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2460 != arg0) {
            if (!arg3 && this.field2468 == arg1) {
                this.field2466 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2459[arg1] = false;
                if (this.field2463 || arg3) {
                    class150.method697(this, this.field2461, arg1, this.field2441[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2465.reset();
            field2465.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2465.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2441[arg1] != var9 || this.field2443[arg1] != var10) {
                this.field2459[arg1] = false;
                if (this.field2463 || arg3) {
                    class150.method697(this, this.field2461, arg1, this.field2441[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2459[arg1] = true;
            if (arg3) {
                this.field2438[arg1] = class112.method598(arg2, false);
            }
            return;
        }
        if (this.field2466) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class150.method697(this, 255, this.field2461, this.field2467, (byte) 0, true);
            return;
        }
        field2465.reset();
        field2465.update(arg2, 0, arg2.length);
        int var5 = (int) field2465.getValue();
        class107 var6 = new class107(class146.method1994(arg2));
        int var7 = var6.method2123();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2207();
        }
        if (this.field2467 != var5 || this.field2462 != var8) {
            class150.method697(this, 255, this.field2461, this.field2467, (byte) 0, true);
            return;
        }
        this.method2638(arg2);
        this.method2733();
    }

    @ObfuscatedName("ei.cy(I)V")
    public void method2733() {
        this.field2459 = new boolean[this.field2438.length];
        for (int var1 = 0; var1 < this.field2459.length; var1++) {
            this.field2459[var1] = false;
        }
        if (this.field2464 == null) {
            this.field2466 = true;
            return;
        }
        this.field2468 = -1;
        for (int var2 = 0; var2 < this.field2459.length; var2++) {
            if (this.field2444[var2] > 0) {
                class149.method2312(var2, this.field2464, this);
                this.field2468 = var2;
            }
        }
        if (this.field2468 == -1) {
            this.field2466 = true;
        }
    }

    @ObfuscatedName("ei.ci(IB)I")
    public int method2726(int arg0) {
        if (this.field2438[arg0] != null) {
            return 100;
        } else if (this.field2459[arg0]) {
            return 100;
        } else {
            int var2 = this.field2461;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2670 != null && Statics.field2670.field2874 == var3) {
                var5 = Statics.field2495.field1841 * 99 / (Statics.field2495.field1840.length - Statics.field2670.field2508) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ei.ct(B)I")
    public int method2727() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2438.length; var3++) {
            if (this.field2444[var3] > 0) {
                var1 += 100;
                var2 += this.method2726(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
