package deob;

import java.util.zip.CRC32;

@ObfuscatedName("eu")
public class class155 extends class153 {

    @ObfuscatedName("eu.m")
    public class71 field2581;

    @ObfuscatedName("eu.f")
    public class71 field2582;

    @ObfuscatedName("eu.a")
    public int field2583;

    @ObfuscatedName("eu.h")
    public volatile boolean field2588 = false;

    @ObfuscatedName("eu.p")
    public boolean field2585 = false;

    @ObfuscatedName("eu.e")
    public volatile boolean[] field2584;

    @ObfuscatedName("eu.r")
    public static CRC32 field2587 = new CRC32();

    @ObfuscatedName("eu.av")
    public int field2586;

    @ObfuscatedName("eu.an")
    public int field2589;

    @ObfuscatedName("eu.ae")
    public int field2590 = -1;

    public class155(class71 arg0, class71 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2581 = arg0;
        this.field2582 = arg1;
        this.field2583 = arg2;
        this.field2585 = arg5;
        int var8 = this.field2583;
        if (Statics.field2572 == null) {
            class154.method4((class155) null, 255, 255, 0, (byte) 0, true);
            class154.field2560[var8] = this;
        } else {
            Statics.field2572.field2051 = var8 * 8 + 5;
            int var9 = Statics.field2572.method2455();
            int var10 = Statics.field2572.method2455();
            this.method3055(var9, var10);
        }
    }

    @ObfuscatedName("eu.cb(I)I")
    public int method3068() {
        if (this.field2588) {
            return 100;
        } else if (this.field2541 == null) {
            int var1 = this.field2583;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field192 != null && Statics.field192.field2826 == var2) {
                var4 = Statics.field2052.field2051 * 99 / (Statics.field2052.field2056.length - Statics.field192.field2591) + 1;
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

    @ObfuscatedName("eu.c(IB)V")
    public void method2963(int arg0) {
        int var2 = this.field2583;
        long var3 = (long) ((var2 << 16) + arg0);
        class156 var5 = (class156) class154.field2574.method3232(var3);
        if (var5 != null) {
            class154.field2565.method3203(var5);
        }
    }

    @ObfuscatedName("eu.g(II)V")
    public void method2971(int arg0) {
        if (this.field2581 == null || this.field2584 == null || !this.field2584[arg0]) {
            class154.method4(this, this.field2583, arg0, this.field2556[arg0], (byte) 2, true);
        } else {
            class158.method2179(arg0, this.field2581, this);
        }
    }

    @ObfuscatedName("eu.cy(III)V")
    public void method3055(int arg0, int arg1) {
        this.field2586 = arg0;
        this.field2589 = arg1;
        if (this.field2582 == null) {
            class154.method4(this, 255, this.field2583, this.field2586, (byte) 0, true);
        } else {
            class158.method2179(this.field2583, this.field2582, this);
        }
    }

    @ObfuscatedName("eu.ca(I[BZZB)V")
    public void method3061(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2546[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2546[arg0];
            if (this.field2581 != null) {
                class71 var12 = this.field2581;
                class157 var13 = new class157();
                var13.field2596 = 0;
                var13.field2826 = (long) arg0;
                var13.field2597 = arg1;
                var13.field2598 = var12;
                class177 var14 = class158.field2609;
                synchronized (class158.field2609) {
                    class158.field2609.method3261(var13);
                }
                Object var16 = class158.field2604;
                synchronized (class158.field2604) {
                    if (class158.field2603 == 0) {
                        Statics.field362.method1463(new class158(), 5);
                    }
                    class158.field2603 = 600;
                }
                this.field2584[arg0] = true;
            }
            if (arg3) {
                this.field2541[arg0] = class119.method2149(arg1, false);
            }
            return;
        }
        if (this.field2588) {
            throw new RuntimeException();
        }
        if (this.field2582 != null) {
            int var5 = this.field2583;
            class71 var6 = this.field2582;
            class157 var7 = new class157();
            var7.field2596 = 0;
            var7.field2826 = (long) var5;
            var7.field2597 = arg1;
            var7.field2598 = var6;
            class177 var8 = class158.field2609;
            synchronized (class158.field2609) {
                class158.field2609.method3261(var7);
            }
            Object var10 = class158.field2604;
            synchronized (class158.field2604) {
                if (class158.field2603 == 0) {
                    Statics.field362.method1463(new class158(), 5);
                }
                class158.field2603 = 600;
            }
        }
        this.method2962(arg1);
        this.method3060();
    }

    @ObfuscatedName("eu.ce(Lbv;I[BZI)V")
    public void method3056(class71 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2582 != arg0) {
            if (!arg3 && this.field2590 == arg1) {
                this.field2588 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2584[arg1] = false;
                if (this.field2585 || arg3) {
                    class154.method4(this, this.field2583, arg1, this.field2556[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2587.reset();
            field2587.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2587.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2556[arg1] != var9 || this.field2546[arg1] != var10) {
                this.field2584[arg1] = false;
                if (this.field2585 || arg3) {
                    class154.method4(this, this.field2583, arg1, this.field2556[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2584[arg1] = true;
            if (arg3) {
                this.field2541[arg1] = class119.method2149(arg2, false);
            }
            return;
        }
        if (this.field2588) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class154.method4(this, 255, this.field2583, this.field2586, (byte) 0, true);
            return;
        }
        field2587.reset();
        field2587.update(arg2, 0, arg2.length);
        int var5 = (int) field2587.getValue();
        class127 var6 = new class127(class153.method537(arg2));
        int var7 = var6.method2416();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2455();
        }
        if (this.field2586 != var5 || this.field2589 != var8) {
            class154.method4(this, 255, this.field2583, this.field2586, (byte) 0, true);
            return;
        }
        this.method2962(arg2);
        this.method3060();
    }

    @ObfuscatedName("eu.cs(B)V")
    public void method3060() {
        this.field2584 = new boolean[this.field2541.length];
        for (int var1 = 0; var1 < this.field2584.length; var1++) {
            this.field2584[var1] = false;
        }
        if (this.field2581 == null) {
            this.field2588 = true;
            return;
        }
        this.field2590 = -1;
        for (int var2 = 0; var2 < this.field2584.length; var2++) {
            if (this.field2547[var2] > 0) {
                class158.method1573(var2, this.field2581, this);
                this.field2590 = var2;
            }
        }
        if (this.field2590 == -1) {
            this.field2588 = true;
        }
    }

    @ObfuscatedName("eu.cq(IS)I")
    public int method3058(int arg0) {
        if (this.field2541[arg0] == null) {
            return this.field2584[arg0] ? 100 : class154.method2692(this.field2583, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("eu.cl(B)I")
    public int method3059() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2541.length; var3++) {
            if (this.field2547[var3] > 0) {
                var1 += 100;
                var2 += this.method3058(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
