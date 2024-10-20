package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ed")
public class class152 extends class150 {

    @ObfuscatedName("ed.b")
    public class70 field2491;

    @ObfuscatedName("ed.p")
    public class70 field2486;

    @ObfuscatedName("ed.t")
    public int field2493;

    @ObfuscatedName("ed.l")
    public volatile boolean field2488 = false;

    @ObfuscatedName("ed.a")
    public boolean field2489 = false;

    @ObfuscatedName("ed.f")
    public volatile boolean[] field2490;

    @ObfuscatedName("ed.h")
    public static CRC32 field2492 = new CRC32();

    @ObfuscatedName("ed.az")
    public int field2487;

    @ObfuscatedName("ed.ao")
    public int field2485;

    @ObfuscatedName("ed.au")
    public int field2494 = -1;

    public class152(class70 arg0, class70 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2491 = arg0;
        this.field2486 = arg1;
        this.field2493 = arg2;
        this.field2489 = arg5;
        class151.method222(this, this.field2493);
    }

    @ObfuscatedName("ed.cs(I)I")
    public int method2994() {
        if (this.field2488) {
            return 100;
        } else if (this.field2453 == null) {
            int var1 = this.field2493;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field1983 != null && Statics.field1983.field2758 == var2) {
                var4 = Statics.field195.field2020 * 99 / (Statics.field195.field2025.length - Statics.field1983.field2498) + 1;
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

    @ObfuscatedName("ed.y(II)V")
    public void method2974(int arg0) {
        int var2 = this.field2493;
        long var3 = (long) ((var2 << 16) + arg0);
        class153 var5 = (class153) class151.field2470.method3222(var3);
        if (var5 != null) {
            class151.field2462.method3202(var5);
        }
    }

    @ObfuscatedName("ed.w(IB)V")
    public void method2911(int arg0) {
        if (this.field2491 == null || this.field2490 == null || !this.field2490[arg0]) {
            class151.method2275(this, this.field2493, arg0, this.field2447[arg0], (byte) 2, true);
            return;
        }
        class70 var2 = this.field2491;
        byte[] var4 = null;
        class175 var5 = class155.field2514;
        synchronized (class155.field2514) {
            for (class154 var6 = (class154) class155.field2514.method3279(); var6 != null; var6 = (class154) class155.field2514.method3249()) {
                if ((long) arg0 == var6.field2758 && var6.field2502 == var2 && var6.field2501 == 0) {
                    var4 = var6.field2506;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method1372(arg0);
            this.method3002(var2, arg0, var8, true);
        } else {
            this.method3002(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ed.ct(III)V")
    public void method2996(int arg0, int arg1) {
        this.field2487 = arg0;
        this.field2485 = arg1;
        if (this.field2486 == null) {
            class151.method2275(this, 255, this.field2493, this.field2487, (byte) 0, true);
            return;
        }
        int var3 = this.field2493;
        class70 var4 = this.field2486;
        byte[] var6 = null;
        class175 var7 = class155.field2514;
        synchronized (class155.field2514) {
            for (class154 var8 = (class154) class155.field2514.method3279(); var8 != null; var8 = (class154) class155.field2514.method3249()) {
                if ((long) var3 == var8.field2758 && var8.field2502 == var4 && var8.field2501 == 0) {
                    var6 = var8.field2506;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method1372(var3);
            this.method3002(var4, var3, var10, true);
        } else {
            this.method3002(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ed.cb(I[BZZI)V")
    public void method2997(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2488) {
                throw new RuntimeException();
            }
            if (this.field2486 != null) {
                class155.method2626(this.field2493, arg1, this.field2486);
            }
            this.method2902(arg1);
            this.method2995();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2448[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2448[arg0];
        if (this.field2491 != null) {
            class70 var5 = this.field2491;
            class154 var6 = new class154();
            var6.field2501 = 0;
            var6.field2758 = (long) arg0;
            var6.field2506 = arg1;
            var6.field2502 = var5;
            class175 var7 = class155.field2514;
            synchronized (class155.field2514) {
                class155.field2514.method3283(var6);
            }
            Object var9 = class155.field2511;
            synchronized (class155.field2511) {
                if (class155.field2516 == 0) {
                    Statics.field16.method1455(new class155(), 5);
                }
                class155.field2516 = 600;
            }
            this.field2490[arg0] = true;
        }
        if (arg3) {
            this.field2453[arg0] = class118.method2250(arg1, false);
        }
    }

    @ObfuscatedName("ed.cd(Lbd;I[BZI)V")
    public void method3002(class70 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2486 != arg0) {
            if (!arg3 && this.field2494 == arg1) {
                this.field2488 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2490[arg1] = false;
                if (this.field2489 || arg3) {
                    class151.method2275(this, this.field2493, arg1, this.field2447[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2492.reset();
            field2492.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2492.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2447[arg1] != var9 || this.field2448[arg1] != var10) {
                this.field2490[arg1] = false;
                if (this.field2489 || arg3) {
                    class151.method2275(this, this.field2493, arg1, this.field2447[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2490[arg1] = true;
            if (arg3) {
                this.field2453[arg1] = class118.method2250(arg2, false);
            }
            return;
        }
        if (this.field2488) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class151.method2275(this, 255, this.field2493, this.field2487, (byte) 0, true);
            return;
        }
        field2492.reset();
        field2492.update(arg2, 0, arg2.length);
        int var5 = (int) field2492.getValue();
        class126 var6 = new class126(class150.method2263(arg2));
        int var7 = var6.method2399();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2387();
        }
        if (this.field2487 != var5 || this.field2485 != var8) {
            class151.method2275(this, 255, this.field2493, this.field2487, (byte) 0, true);
            return;
        }
        this.method2902(arg2);
        this.method2995();
    }

    @ObfuscatedName("ed.cc(I)V")
    public void method2995() {
        this.field2490 = new boolean[this.field2453.length];
        for (int var1 = 0; var1 < this.field2490.length; var1++) {
            this.field2490[var1] = false;
        }
        if (this.field2491 == null) {
            this.field2488 = true;
            return;
        }
        this.field2494 = -1;
        for (int var2 = 0; var2 < this.field2490.length; var2++) {
            if (this.field2449[var2] > 0) {
                class155.method1320(var2, this.field2491, this);
                this.field2494 = var2;
            }
        }
        if (this.field2494 == -1) {
            this.field2488 = true;
        }
    }

    @ObfuscatedName("ed.cx(IB)I")
    public int method2999(int arg0) {
        if (this.field2453[arg0] != null) {
            return 100;
        } else if (this.field2490[arg0]) {
            return 100;
        } else {
            int var2 = this.field2493;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field1983 != null && Statics.field1983.field2758 == var3) {
                var5 = Statics.field195.field2020 * 99 / (Statics.field195.field2025.length - Statics.field1983.field2498) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ed.cp(B)I")
    public int method3000() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2453.length; var3++) {
            if (this.field2449[var3] > 0) {
                var1 += 100;
                var2 += this.method2999(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
