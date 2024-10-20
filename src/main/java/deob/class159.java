package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ft")
public class class159 extends class158 {

    @ObfuscatedName("ft.p")
    public class126 field2589;

    @ObfuscatedName("ft.y")
    public class126 field2584;

    @ObfuscatedName("ft.z")
    public int field2586;

    @ObfuscatedName("ft.u")
    public volatile boolean field2587 = false;

    @ObfuscatedName("ft.w")
    public boolean field2588 = false;

    @ObfuscatedName("ft.d")
    public volatile boolean[] field2585;

    @ObfuscatedName("ft.l")
    public static CRC32 field2590 = new CRC32();

    @ObfuscatedName("ft.aj")
    public int field2591;

    @ObfuscatedName("ft.aq")
    public int field2592;

    @ObfuscatedName("ft.al")
    public int field2593 = -1;

    public class159(class126 arg0, class126 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2589 = arg0;
        this.field2584 = arg1;
        this.field2586 = arg2;
        this.field2588 = arg5;
        class162.method651(this, this.field2586);
    }

    @ObfuscatedName("ft.ch(I)I")
    public int method2989() {
        if (this.field2587) {
            return 100;
        } else if (this.field2574 == null) {
            int var1 = class162.method2708(255, this.field2586);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ft.g(II)V")
    public void method2908(int arg0) {
        int var2 = this.field2586;
        long var3 = (long) ((var2 << 16) + arg0);
        class163 var5 = (class163) class162.field2619.method3425(var3);
        if (var5 != null) {
            class162.field2629.method3515(var5);
        }
    }

    @ObfuscatedName("ft.c(IB)V")
    public void method2966(int arg0) {
        if (this.field2589 == null || this.field2585 == null || !this.field2585[arg0]) {
            class162.method1128(this, this.field2586, arg0, this.field2568[arg0], (byte) 2, true);
        } else {
            class161.method2569(arg0, this.field2589, this);
        }
    }

    @ObfuscatedName("ft.ck(III)V")
    public void method2991(int arg0, int arg1) {
        this.field2591 = arg0;
        this.field2592 = arg1;
        if (this.field2584 == null) {
            class162.method1128(this, 255, this.field2586, this.field2591, (byte) 0, true);
        } else {
            class161.method2569(this.field2586, this.field2584, this);
        }
    }

    @ObfuscatedName("ft.cq(I[BZZI)V")
    public void method2992(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2569[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2569[arg0];
            if (this.field2589 != null) {
                class126 var12 = this.field2589;
                class160 var13 = new class160();
                var13.field2599 = 0;
                var13.field3018 = (long) arg0;
                var13.field2600 = arg1;
                var13.field2597 = var12;
                class190 var14 = class161.field2606;
                synchronized (class161.field2606) {
                    class161.field2606.method3463(var13);
                }
                Object var16 = class161.field2605;
                synchronized (class161.field2605) {
                    if (class161.field2602 == 0) {
                        Statics.field1869.method2581(new class161(), 5);
                    }
                    class161.field2602 = 600;
                }
                this.field2585[arg0] = true;
            }
            if (arg3) {
                this.field2574[arg0] = class117.method1416(arg1, false);
            }
            return;
        }
        if (this.field2587) {
            throw new RuntimeException();
        }
        if (this.field2584 != null) {
            int var5 = this.field2586;
            class126 var6 = this.field2584;
            class160 var7 = new class160();
            var7.field2599 = 0;
            var7.field3018 = (long) var5;
            var7.field2600 = arg1;
            var7.field2597 = var6;
            class190 var8 = class161.field2606;
            synchronized (class161.field2606) {
                class161.field2606.method3463(var7);
            }
            Object var10 = class161.field2605;
            synchronized (class161.field2605) {
                if (class161.field2602 == 0) {
                    Statics.field1869.method2581(new class161(), 5);
                }
                class161.field2602 = 600;
            }
        }
        this.method2907(arg1);
        this.method2994();
    }

    @ObfuscatedName("ft.cp(Ldt;I[BZI)V")
    public void method3001(class126 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2584 != arg0) {
            if (!arg3 && this.field2593 == arg1) {
                this.field2587 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2585[arg1] = false;
                if (this.field2588 || arg3) {
                    class162.method1128(this, this.field2586, arg1, this.field2568[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2590.reset();
            field2590.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2590.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2568[arg1] != var9 || this.field2569[arg1] != var10) {
                this.field2585[arg1] = false;
                if (this.field2588 || arg3) {
                    class162.method1128(this, this.field2586, arg1, this.field2568[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2585[arg1] = true;
            if (arg3) {
                this.field2574[arg1] = class117.method1416(arg2, false);
            }
            return;
        }
        if (this.field2587) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class162.method1128(this, 255, this.field2586, this.field2591, (byte) 0, true);
            return;
        }
        field2590.reset();
        field2590.update(arg2, 0, arg2.length);
        int var5 = (int) field2590.getValue();
        class111 var6 = new class111(class158.method2897(arg2));
        int var7 = var6.method2211();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2586 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2366();
        }
        if (this.field2591 != var5 || this.field2592 != var8) {
            class162.method1128(this, 255, this.field2586, this.field2591, (byte) 0, true);
            return;
        }
        this.method2907(arg2);
        this.method2994();
    }

    @ObfuscatedName("ft.cx(I)V")
    public void method2994() {
        this.field2585 = new boolean[this.field2574.length];
        for (int var1 = 0; var1 < this.field2585.length; var1++) {
            this.field2585[var1] = false;
        }
        if (this.field2589 == null) {
            this.field2587 = true;
            return;
        }
        this.field2593 = -1;
        for (int var2 = 0; var2 < this.field2585.length; var2++) {
            if (this.field2570[var2] > 0) {
                class126 var3 = this.field2589;
                class160 var5 = new class160();
                var5.field2599 = 1;
                var5.field3018 = (long) var2;
                var5.field2597 = var3;
                var5.field2598 = this;
                class190 var6 = class161.field2606;
                synchronized (class161.field2606) {
                    class161.field2606.method3463(var5);
                }
                Object var8 = class161.field2605;
                synchronized (class161.field2605) {
                    if (class161.field2602 == 0) {
                        Statics.field1869.method2581(new class161(), 5);
                    }
                    class161.field2602 = 600;
                }
                this.field2593 = var2;
            }
        }
        if (this.field2593 == -1) {
            this.field2587 = true;
        }
    }

    @ObfuscatedName("ft.cn(II)I")
    public int method3004(int arg0) {
        if (this.field2574[arg0] == null) {
            return this.field2585[arg0] ? 100 : class162.method2708(this.field2586, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ft.cg(I)I")
    public int method2996() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2574.length; var3++) {
            if (this.field2570[var3] > 0) {
                var1 += 100;
                var2 += this.method3004(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
