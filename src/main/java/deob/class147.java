package deob;

import java.util.zip.CRC32;

@ObfuscatedName("eo")
public class class147 extends class146 {

    @ObfuscatedName("eo.r")
    public class121 field2466;

    @ObfuscatedName("eo.k")
    public class121 field2459;

    @ObfuscatedName("eo.b")
    public int field2456;

    @ObfuscatedName("eo.h")
    public volatile boolean field2458 = false;

    @ObfuscatedName("eo.i")
    public boolean field2457 = false;

    @ObfuscatedName("eo.o")
    public volatile boolean[] field2461;

    @ObfuscatedName("eo.m")
    public static CRC32 field2462 = new CRC32();

    @ObfuscatedName("eo.ak")
    public int field2463;

    @ObfuscatedName("eo.aw")
    public int field2464;

    @ObfuscatedName("eo.af")
    public int field2468 = -1;

    public class147(class121 arg0, class121 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2466 = arg0;
        this.field2459 = arg1;
        this.field2456 = arg2;
        this.field2457 = arg5;
        class150.method2437(this, this.field2456);
    }

    @ObfuscatedName("eo.cz(I)I")
    public int method2807() {
        if (this.field2458) {
            return 100;
        } else if (this.field2445 == null) {
            int var1 = class150.method1929(255, this.field2456);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("eo.s(IB)V")
    public void method2708(int arg0) {
        class150.method3151(this.field2456, arg0);
    }

    @ObfuscatedName("eo.g(IB)V")
    public void method2775(int arg0) {
        if (this.field2466 == null || this.field2461 == null || !this.field2461[arg0]) {
            class150.method1576(this, this.field2456, arg0, this.field2444[arg0], (byte) 2, true);
        } else {
            class149.method124(arg0, this.field2466, this);
        }
    }

    @ObfuscatedName("eo.cl(IIB)V")
    public void method2797(int arg0, int arg1) {
        this.field2463 = arg0;
        this.field2464 = arg1;
        if (this.field2459 == null) {
            class150.method1576(this, 255, this.field2456, this.field2463, (byte) 0, true);
        } else {
            class149.method124(this.field2456, this.field2459, this);
        }
    }

    @ObfuscatedName("eo.ci(I[BZZI)V")
    public void method2813(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2440[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2440[arg0];
            if (this.field2466 != null) {
                class121 var10 = this.field2466;
                class148 var11 = new class148();
                var11.field2470 = 0;
                var11.field2864 = (long) arg0;
                var11.field2471 = arg1;
                var11.field2478 = var10;
                class177 var12 = class149.field2484;
                synchronized (class149.field2484) {
                    class149.field2484.method3260(var11);
                }
                class149.method2686();
                this.field2461[arg0] = true;
            }
            if (arg3) {
                this.field2445[arg0] = class112.method1934(arg1, false);
            }
            return;
        }
        if (this.field2458) {
            throw new RuntimeException();
        }
        if (this.field2459 != null) {
            int var5 = this.field2456;
            class121 var6 = this.field2459;
            class148 var7 = new class148();
            var7.field2470 = 0;
            var7.field2864 = (long) var5;
            var7.field2471 = arg1;
            var7.field2478 = var6;
            class177 var8 = class149.field2484;
            synchronized (class149.field2484) {
                class149.field2484.method3260(var7);
            }
            class149.method2686();
        }
        this.method2707(arg1);
        this.method2799();
    }

    @ObfuscatedName("eo.cm(Ldp;I[BZI)V")
    public void method2794(class121 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2459 != arg0) {
            if (!arg3 && this.field2468 == arg1) {
                this.field2458 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2461[arg1] = false;
                if (this.field2457 || arg3) {
                    class150.method1576(this, this.field2456, arg1, this.field2444[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2462.reset();
            field2462.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2462.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2444[arg1] != var9 || this.field2440[arg1] != var10) {
                this.field2461[arg1] = false;
                if (this.field2457 || arg3) {
                    class150.method1576(this, this.field2456, arg1, this.field2444[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2461[arg1] = true;
            if (arg3) {
                this.field2445[arg1] = class112.method1934(arg2, false);
            }
            return;
        }
        if (this.field2458) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class150.method1576(this, 255, this.field2456, this.field2463, (byte) 0, true);
            return;
        }
        field2462.reset();
        field2462.update(arg2, 0, arg2.length);
        int var5 = (int) field2462.getValue();
        class107 var6 = new class107(class146.method2373(arg2));
        int var7 = var6.method2101();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2106();
        }
        if (this.field2463 != var5 || this.field2464 != var8) {
            class150.method1576(this, 255, this.field2456, this.field2463, (byte) 0, true);
            return;
        }
        this.method2707(arg2);
        this.method2799();
    }

    @ObfuscatedName("eo.cs(I)V")
    public void method2799() {
        this.field2461 = new boolean[this.field2445.length];
        for (int var1 = 0; var1 < this.field2461.length; var1++) {
            this.field2461[var1] = false;
        }
        if (this.field2466 == null) {
            this.field2458 = true;
            return;
        }
        this.field2468 = -1;
        for (int var2 = 0; var2 < this.field2461.length; var2++) {
            if (this.field2450[var2] > 0) {
                class149.method608(var2, this.field2466, this);
                this.field2468 = var2;
            }
        }
        if (this.field2468 == -1) {
            this.field2458 = true;
        }
    }

    @ObfuscatedName("eo.ca(II)I")
    public int method2800(int arg0) {
        if (this.field2445[arg0] == null) {
            return this.field2461[arg0] ? 100 : class150.method1929(this.field2456, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("eo.cw(I)I")
    public int method2801() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2445.length; var3++) {
            if (this.field2450[var3] > 0) {
                var1 += 100;
                var2 += this.method2800(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
