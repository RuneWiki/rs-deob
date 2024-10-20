package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ek")
public class class154 extends class152 {

    @ObfuscatedName("ek.x")
    public class71 field2540;

    @ObfuscatedName("ek.k")
    public class71 field2534;

    @ObfuscatedName("ek.a")
    public int field2535;

    @ObfuscatedName("ek.y")
    public volatile boolean field2536 = false;

    @ObfuscatedName("ek.q")
    public boolean field2539 = false;

    @ObfuscatedName("ek.c")
    public volatile boolean[] field2543;

    @ObfuscatedName("ek.u")
    public static CRC32 field2538 = new CRC32();

    @ObfuscatedName("ek.ah")
    public int field2537;

    @ObfuscatedName("ek.az")
    public int field2541;

    @ObfuscatedName("ek.au")
    public int field2542 = -1;

    public class154(class71 arg0, class71 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2540 = arg0;
        this.field2534 = arg1;
        this.field2535 = arg2;
        this.field2539 = arg5;
        int var8 = this.field2535;
        if (Statics.field2525 == null) {
            class153.method1377((class154) null, 255, 255, 0, (byte) 0, true);
            class153.field2531[var8] = this;
        } else {
            Statics.field2525.field2023 = var8 * 8 + 5;
            int var9 = Statics.field2525.method2430();
            int var10 = Statics.field2525.method2430();
            this.method3057(var9, var10);
        }
    }

    @ObfuscatedName("ek.bb(I)I")
    public int method3069() {
        if (this.field2536) {
            return 100;
        } else if (this.field2500 == null) {
            int var1 = class153.method2167(255, this.field2535);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ek.m(II)V")
    public void method3034(int arg0) {
        class153.method1425(this.field2535, arg0);
    }

    @ObfuscatedName("ek.f(IB)V")
    public void method2976(int arg0) {
        if (this.field2540 == null || this.field2543 == null || !this.field2543[arg0]) {
            class153.method1377(this, this.field2535, arg0, this.field2503[arg0], (byte) 2, true);
            return;
        }
        class71 var2 = this.field2540;
        byte[] var4 = null;
        class177 var5 = class157.field2556;
        synchronized (class157.field2556) {
            for (class156 var6 = (class156) class157.field2556.method3321(); var6 != null; var6 = (class156) class157.field2556.method3323()) {
                if ((long) arg0 == var6.field2814 && var6.field2550 == var2 && var6.field2553 == 0) {
                    var4 = var6.field2551;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method1421(arg0);
            this.method3067(var2, arg0, var8, true);
        } else {
            this.method3067(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ek.bw(IIS)V")
    public void method3057(int arg0, int arg1) {
        this.field2537 = arg0;
        this.field2541 = arg1;
        if (this.field2534 == null) {
            class153.method1377(this, 255, this.field2535, this.field2537, (byte) 0, true);
            return;
        }
        int var3 = this.field2535;
        class71 var4 = this.field2534;
        byte[] var6 = null;
        class177 var7 = class157.field2556;
        synchronized (class157.field2556) {
            for (class156 var8 = (class156) class157.field2556.method3321(); var8 != null; var8 = (class156) class157.field2556.method3323()) {
                if ((long) var3 == var8.field2814 && var8.field2550 == var4 && var8.field2553 == 0) {
                    var6 = var8.field2551;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method1421(var3);
            this.method3067(var4, var3, var10, true);
        } else {
            this.method3067(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ek.cq(I[BZZS)V")
    public void method3058(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2498[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2498[arg0];
            if (this.field2540 != null) {
                class71 var10 = this.field2540;
                class156 var11 = new class156();
                var11.field2553 = 0;
                var11.field2814 = (long) arg0;
                var11.field2551 = arg1;
                var11.field2550 = var10;
                class177 var12 = class157.field2556;
                synchronized (class157.field2556) {
                    class157.field2556.method3326(var11);
                }
                class157.method1616();
                this.field2543[arg0] = true;
            }
            if (arg3) {
                this.field2500[arg0] = class119.method1360(arg1, false);
            }
            return;
        }
        if (this.field2536) {
            throw new RuntimeException();
        }
        if (this.field2534 != null) {
            int var5 = this.field2535;
            class71 var6 = this.field2534;
            class156 var7 = new class156();
            var7.field2553 = 0;
            var7.field2814 = (long) var5;
            var7.field2551 = arg1;
            var7.field2550 = var6;
            class177 var8 = class157.field2556;
            synchronized (class157.field2556) {
                class157.field2556.method3326(var7);
            }
            class157.method1616();
        }
        this.method2966(arg1);
        this.method3060();
    }

    @ObfuscatedName("ek.ct(Lbl;I[BZS)V")
    public void method3067(class71 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2534 != arg0) {
            if (!arg3 && this.field2542 == arg1) {
                this.field2536 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2543[arg1] = false;
                if (this.field2539 || arg3) {
                    class153.method1377(this, this.field2535, arg1, this.field2503[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2538.reset();
            field2538.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2538.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2503[arg1] != var9 || this.field2498[arg1] != var10) {
                this.field2543[arg1] = false;
                if (this.field2539 || arg3) {
                    class153.method1377(this, this.field2535, arg1, this.field2503[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2543[arg1] = true;
            if (arg3) {
                this.field2500[arg1] = class119.method1360(arg2, false);
            }
            return;
        }
        if (this.field2536) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class153.method1377(this, 255, this.field2535, this.field2537, (byte) 0, true);
            return;
        }
        field2538.reset();
        field2538.update(arg2, 0, arg2.length);
        int var5 = (int) field2538.getValue();
        class127 var6 = new class127(class152.method2813(arg2));
        int var7 = var6.method2414();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2430();
        }
        if (this.field2537 != var5 || this.field2541 != var8) {
            class153.method1377(this, 255, this.field2535, this.field2537, (byte) 0, true);
            return;
        }
        this.method2966(arg2);
        this.method3060();
    }

    @ObfuscatedName("ek.cc(I)V")
    public void method3060() {
        this.field2543 = new boolean[this.field2500.length];
        for (int var1 = 0; var1 < this.field2543.length; var1++) {
            this.field2543[var1] = false;
        }
        if (this.field2540 == null) {
            this.field2536 = true;
            return;
        }
        this.field2542 = -1;
        for (int var2 = 0; var2 < this.field2543.length; var2++) {
            if (this.field2490[var2] > 0) {
                class71 var3 = this.field2540;
                class156 var5 = new class156();
                var5.field2553 = 1;
                var5.field2814 = (long) var2;
                var5.field2550 = var3;
                var5.field2554 = this;
                class177 var6 = class157.field2556;
                synchronized (class157.field2556) {
                    class157.field2556.method3326(var5);
                }
                class157.method1616();
                this.field2542 = var2;
            }
        }
        if (this.field2542 == -1) {
            this.field2536 = true;
        }
    }

    @ObfuscatedName("ek.ca(II)I")
    public int method3061(int arg0) {
        if (this.field2500[arg0] == null) {
            return this.field2543[arg0] ? 100 : class153.method2167(this.field2535, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ek.cw(I)I")
    public int method3062() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2500.length; var3++) {
            if (this.field2490[var3] > 0) {
                var1 += 100;
                var2 += this.method3061(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
