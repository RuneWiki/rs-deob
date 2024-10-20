package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fv")
public class class159 extends class158 {

    @ObfuscatedName("fv.q")
    public class126 field2569;

    @ObfuscatedName("fv.g")
    public class126 field2573;

    @ObfuscatedName("fv.z")
    public int field2577;

    @ObfuscatedName("fv.m")
    public volatile boolean field2571 = false;

    @ObfuscatedName("fv.y")
    public boolean field2568 = false;

    @ObfuscatedName("fv.n")
    public volatile boolean[] field2570;

    @ObfuscatedName("fv.s")
    public static CRC32 field2574 = new CRC32();

    @ObfuscatedName("fv.ac")
    public int field2575;

    @ObfuscatedName("fv.au")
    public int field2572;

    @ObfuscatedName("fv.ap")
    public int field2576 = -1;

    public class159(class126 arg0, class126 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2569 = arg0;
        this.field2573 = arg1;
        this.field2577 = arg2;
        this.field2568 = arg5;
        int var8 = this.field2577;
        if (Statics.field2610 == null) {
            class162.method824((class159) null, 255, 255, 0, (byte) 0, true);
            class162.field2613[var8] = this;
        } else {
            Statics.field2610.field1867 = var8 * 8 + 5;
            int var9 = Statics.field2610.method2177();
            int var10 = Statics.field2610.method2177();
            this.method2960(var9, var10);
        }
    }

    @ObfuscatedName("fv.ce(I)I")
    public int method2958() {
        if (this.field2571) {
            return 100;
        } else if (this.field2555 == null) {
            int var1 = this.field2577;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2606 != null && Statics.field2606.field3015 == var2) {
                var4 = Statics.field3141.field1867 * 99 / (Statics.field3141.field1869.length - Statics.field2606.field2618) + 1;
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

    @ObfuscatedName("fv.b(II)V")
    public void method2945(int arg0) {
        int var2 = this.field2577;
        long var3 = (long) ((var2 << 16) + arg0);
        class163 var5 = (class163) class162.field2602.method3382(var3);
        if (var5 != null) {
            class162.field2595.method3470(var5);
        }
    }

    @ObfuscatedName("fv.v(II)V")
    public void method2889(int arg0) {
        if (this.field2569 == null || this.field2570 == null || !this.field2570[arg0]) {
            class162.method824(this, this.field2577, arg0, this.field2566[arg0], (byte) 2, true);
        } else {
            class161.method94(arg0, this.field2569, this);
        }
    }

    @ObfuscatedName("fv.cq(III)V")
    public void method2960(int arg0, int arg1) {
        this.field2575 = arg0;
        this.field2572 = arg1;
        if (this.field2573 == null) {
            class162.method824(this, 255, this.field2577, this.field2575, (byte) 0, true);
        } else {
            class161.method94(this.field2577, this.field2573, this);
        }
    }

    @ObfuscatedName("fv.cp(I[BZZI)V")
    public void method2973(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2571) {
                throw new RuntimeException();
            }
            if (this.field2573 != null) {
                class161.method3517(this.field2577, arg1, this.field2573);
            }
            this.method2933(arg1);
            this.method2963();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2556[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2556[arg0];
        if (this.field2569 != null) {
            class161.method3517(arg0, arg1, this.field2569);
            this.field2570[arg0] = true;
        }
        if (arg3) {
            this.field2555[arg0] = class117.method3532(arg1, false);
        }
    }

    @ObfuscatedName("fv.cj(Ldg;I[BZI)V")
    public void method2957(class126 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2573 != arg0) {
            if (!arg3 && this.field2576 == arg1) {
                this.field2571 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2570[arg1] = false;
                if (this.field2568 || arg3) {
                    class162.method824(this, this.field2577, arg1, this.field2566[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2574.reset();
            field2574.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2574.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2566[arg1] != var9 || this.field2556[arg1] != var10) {
                this.field2570[arg1] = false;
                if (this.field2568 || arg3) {
                    class162.method824(this, this.field2577, arg1, this.field2566[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2570[arg1] = true;
            if (arg3) {
                this.field2555[arg1] = class117.method3532(arg2, false);
            }
            return;
        }
        if (this.field2571) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class162.method824(this, 255, this.field2577, this.field2575, (byte) 0, true);
            return;
        }
        field2574.reset();
        field2574.update(arg2, 0, arg2.length);
        int var5 = (int) field2574.getValue();
        class111 var6 = new class111(class158.method2539(arg2));
        int var7 = var6.method2172();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2577 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2177();
        }
        if (this.field2575 != var5 || this.field2572 != var8) {
            class162.method824(this, 255, this.field2577, this.field2575, (byte) 0, true);
            return;
        }
        this.method2933(arg2);
        this.method2963();
    }

    @ObfuscatedName("fv.cb(I)V")
    public void method2963() {
        this.field2570 = new boolean[this.field2555.length];
        for (int var1 = 0; var1 < this.field2570.length; var1++) {
            this.field2570[var1] = false;
        }
        if (this.field2569 == null) {
            this.field2571 = true;
            return;
        }
        this.field2576 = -1;
        for (int var2 = 0; var2 < this.field2570.length; var2++) {
            if (this.field2551[var2] > 0) {
                class126 var3 = this.field2569;
                class160 var5 = new class160();
                var5.field2583 = 1;
                var5.field3015 = (long) var2;
                var5.field2581 = var3;
                var5.field2584 = this;
                class190 var6 = class161.field2591;
                synchronized (class161.field2591) {
                    class161.field2591.method3442(var5);
                }
                Object var8 = class161.field2592;
                synchronized (class161.field2592) {
                    if (class161.field2594 == 0) {
                        Statics.field957.method2551(new class161(), 5);
                    }
                    class161.field2594 = 600;
                }
                this.field2576 = var2;
            }
        }
        if (this.field2576 == -1) {
            this.field2571 = true;
        }
    }

    @ObfuscatedName("fv.ck(II)I")
    public int method2964(int arg0) {
        if (this.field2555[arg0] != null) {
            return 100;
        } else if (this.field2570[arg0]) {
            return 100;
        } else {
            int var2 = this.field2577;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2606 != null && Statics.field2606.field3015 == var3) {
                var5 = Statics.field3141.field1867 * 99 / (Statics.field3141.field1869.length - Statics.field2606.field2618) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("fv.cv(I)I")
    public int method2965() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2555.length; var3++) {
            if (this.field2551[var3] > 0) {
                var1 += 100;
                var2 += this.method2964(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
