package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ek")
public class class148 extends class147 {

    @ObfuscatedName("ek.q")
    public class121 field2474;

    @ObfuscatedName("ek.j")
    public class121 field2471;

    @ObfuscatedName("ek.o")
    public int field2472;

    @ObfuscatedName("ek.i")
    public volatile boolean field2473 = false;

    @ObfuscatedName("ek.m")
    public boolean field2479 = false;

    @ObfuscatedName("ek.f")
    public volatile boolean[] field2475;

    @ObfuscatedName("ek.k")
    public static CRC32 field2470 = new CRC32();

    @ObfuscatedName("ek.an")
    public int field2477;

    @ObfuscatedName("ek.aw")
    public int field2481;

    @ObfuscatedName("ek.at")
    public int field2478 = -1;

    public class148(class121 arg0, class121 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2474 = arg0;
        this.field2471 = arg1;
        this.field2472 = arg2;
        this.field2479 = arg5;
        class151.method162(this, this.field2472);
    }

    @ObfuscatedName("ek.cu(S)I")
    public int method2861() {
        if (this.field2473) {
            return 100;
        } else if (this.field2457 == null) {
            int var1 = class151.method546(255, this.field2472);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ek.g(IB)V")
    public void method2785(int arg0) {
        class151.method1831(this.field2472, arg0);
    }

    @ObfuscatedName("ek.h(IB)V")
    public void method2790(int arg0) {
        if (this.field2474 == null || this.field2475 == null || !this.field2475[arg0]) {
            class151.method1941(this, this.field2472, arg0, this.field2459[arg0], (byte) 2, true);
            return;
        }
        class121 var2 = this.field2474;
        byte[] var4 = null;
        class178 var5 = class150.field2494;
        synchronized (class150.field2494) {
            for (class149 var6 = (class149) class150.field2494.method3303(); var6 != null; var6 = (class149) class150.field2494.method3300()) {
                if ((long) arg0 == var6.field2881 && var6.field2486 == var2 && var6.field2487 == 0) {
                    var4 = var6.field2485;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2509(arg0);
            this.method2879(var2, arg0, var8, true);
        } else {
            this.method2879(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ek.cg(III)V")
    public void method2863(int arg0, int arg1) {
        this.field2477 = arg0;
        this.field2481 = arg1;
        if (this.field2471 == null) {
            class151.method1941(this, 255, this.field2472, this.field2477, (byte) 0, true);
            return;
        }
        int var3 = this.field2472;
        class121 var4 = this.field2471;
        byte[] var6 = null;
        class178 var7 = class150.field2494;
        synchronized (class150.field2494) {
            for (class149 var8 = (class149) class150.field2494.method3303(); var8 != null; var8 = (class149) class150.field2494.method3300()) {
                if ((long) var3 == var8.field2881 && var8.field2486 == var4 && var8.field2487 == 0) {
                    var6 = var8.field2485;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2509(var3);
            this.method2879(var4, var3, var10, true);
        } else {
            this.method2879(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ek.ch(I[BZZI)V")
    public void method2869(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2473) {
                throw new RuntimeException();
            }
            if (this.field2471 != null) {
                class150.method2470(this.field2472, arg1, this.field2471);
            }
            this.method2829(arg1);
            this.method2862();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2452[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2452[arg0];
        if (this.field2474 != null) {
            class150.method2470(arg0, arg1, this.field2474);
            this.field2475[arg0] = true;
        }
        if (arg3) {
            this.field2457[arg0] = class112.method33(arg1, false);
        }
    }

    @ObfuscatedName("ek.cf(Lds;I[BZI)V")
    public void method2879(class121 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2471 != arg0) {
            if (!arg3 && this.field2478 == arg1) {
                this.field2473 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2475[arg1] = false;
                if (this.field2479 || arg3) {
                    class151.method1941(this, this.field2472, arg1, this.field2459[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2470.reset();
            field2470.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2470.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2459[arg1] != var9 || this.field2452[arg1] != var10) {
                this.field2475[arg1] = false;
                if (this.field2479 || arg3) {
                    class151.method1941(this, this.field2472, arg1, this.field2459[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2475[arg1] = true;
            if (arg3) {
                this.field2457[arg1] = class112.method33(arg2, false);
            }
            return;
        }
        if (this.field2473) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class151.method1941(this, 255, this.field2472, this.field2477, (byte) 0, true);
            return;
        }
        field2470.reset();
        field2470.update(arg2, 0, arg2.length);
        int var5 = (int) field2470.getValue();
        class107 var6 = new class107(class147.method2477(arg2));
        int var7 = var6.method2173();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2305();
        }
        if (this.field2477 != var5 || this.field2481 != var8) {
            class151.method1941(this, 255, this.field2472, this.field2477, (byte) 0, true);
            return;
        }
        this.method2829(arg2);
        this.method2862();
    }

    @ObfuscatedName("ek.cs(I)V")
    public void method2862() {
        this.field2475 = new boolean[this.field2457.length];
        for (int var1 = 0; var1 < this.field2475.length; var1++) {
            this.field2475[var1] = false;
        }
        if (this.field2474 == null) {
            this.field2473 = true;
            return;
        }
        this.field2478 = -1;
        for (int var2 = 0; var2 < this.field2475.length; var2++) {
            if (this.field2453[var2] > 0) {
                class121 var3 = this.field2474;
                class149 var5 = new class149();
                var5.field2487 = 1;
                var5.field2881 = (long) var2;
                var5.field2486 = var3;
                var5.field2483 = this;
                class178 var6 = class150.field2494;
                synchronized (class150.field2494) {
                    class150.field2494.method3291(var5);
                }
                Object var8 = class150.field2493;
                synchronized (class150.field2493) {
                    if (class150.field2492 == 0) {
                        Statics.field2680.method2546(new class150(), 5);
                    }
                    class150.field2492 = 600;
                }
                this.field2478 = var2;
            }
        }
        if (this.field2478 == -1) {
            this.field2473 = true;
        }
    }

    @ObfuscatedName("ek.ci(II)I")
    public int method2866(int arg0) {
        if (this.field2457[arg0] == null) {
            return this.field2475[arg0] ? 100 : class151.method546(this.field2472, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ek.ct(I)I")
    public int method2867() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2457.length; var3++) {
            if (this.field2453[var3] > 0) {
                var1 += 100;
                var2 += this.method2866(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
