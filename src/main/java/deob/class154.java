package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ei")
public class class154 extends class152 {

    @ObfuscatedName("ei.l")
    public class71 field2532;

    @ObfuscatedName("ei.m")
    public class71 field2533;

    @ObfuscatedName("ei.b")
    public int field2534;

    @ObfuscatedName("ei.h")
    public volatile boolean field2542 = false;

    @ObfuscatedName("ei.n")
    public boolean field2535 = false;

    @ObfuscatedName("ei.s")
    public volatile boolean[] field2538;

    @ObfuscatedName("ei.c")
    public static CRC32 field2539 = new CRC32();

    @ObfuscatedName("ei.am")
    public int field2536;

    @ObfuscatedName("ei.ap")
    public int field2540;

    @ObfuscatedName("ei.au")
    public int field2541 = -1;

    public class154(class71 arg0, class71 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2532 = arg0;
        this.field2533 = arg1;
        this.field2534 = arg2;
        this.field2535 = arg5;
        int var8 = this.field2534;
        if (Statics.field2519 == null) {
            class153.method2308((class154) null, 255, 255, 0, (byte) 0, true);
            class153.field2527[var8] = this;
        } else {
            Statics.field2519.field2022 = var8 * 8 + 5;
            int var9 = Statics.field2519.method2446();
            int var10 = Statics.field2519.method2446();
            this.method3053(var9, var10);
        }
    }

    @ObfuscatedName("ei.cw(B)I")
    public int method3057() {
        if (this.field2542) {
            return 100;
        } else if (this.field2502 == null) {
            int var1 = class153.method1533(255, this.field2534);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ei.r(II)V")
    public void method2990(int arg0) {
        int var2 = this.field2534;
        long var3 = (long) ((var2 << 16) + arg0);
        class155 var5 = (class155) class153.field2518.method3302(var3);
        if (var5 != null) {
            class153.field2524.method3271(var5);
        }
    }

    @ObfuscatedName("ei.z(II)V")
    public void method2967(int arg0) {
        if (this.field2532 == null || this.field2538 == null || !this.field2538[arg0]) {
            class153.method2308(this, this.field2534, arg0, this.field2492[arg0], (byte) 2, true);
            return;
        }
        class71 var2 = this.field2532;
        byte[] var4 = null;
        class177 var5 = class157.field2561;
        synchronized (class157.field2561) {
            for (class156 var6 = (class156) class157.field2561.method3326(); var6 != null; var6 = (class156) class157.field2561.method3347()) {
                if ((long) arg0 == var6.field2809 && var6.field2554 == var2 && var6.field2549 == 0) {
                    var4 = var6.field2550;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method1398(arg0);
            this.method3052(var2, arg0, var8, true);
        } else {
            this.method3052(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ei.cf(III)V")
    public void method3053(int arg0, int arg1) {
        this.field2536 = arg0;
        this.field2540 = arg1;
        if (this.field2533 == null) {
            class153.method2308(this, 255, this.field2534, this.field2536, (byte) 0, true);
            return;
        }
        int var3 = this.field2534;
        class71 var4 = this.field2533;
        byte[] var6 = null;
        class177 var7 = class157.field2561;
        synchronized (class157.field2561) {
            for (class156 var8 = (class156) class157.field2561.method3326(); var8 != null; var8 = (class156) class157.field2561.method3347()) {
                if ((long) var3 == var8.field2809 && var8.field2554 == var4 && var8.field2549 == 0) {
                    var6 = var8.field2550;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method1398(var3);
            this.method3052(var4, var3, var10, true);
        } else {
            this.method3052(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ei.cc(I[BZZI)V")
    public void method3049(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2488[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2488[arg0];
            if (this.field2532 != null) {
                class71 var10 = this.field2532;
                class156 var11 = new class156();
                var11.field2549 = 0;
                var11.field2809 = (long) arg0;
                var11.field2550 = arg1;
                var11.field2554 = var10;
                class177 var12 = class157.field2561;
                synchronized (class157.field2561) {
                    class157.field2561.method3328(var11);
                }
                class157.method3033();
                this.field2538[arg0] = true;
            }
            if (arg3) {
                this.field2502[arg0] = class119.method12(arg1, false);
            }
            return;
        }
        if (this.field2542) {
            throw new RuntimeException();
        }
        if (this.field2533 != null) {
            int var5 = this.field2534;
            class71 var6 = this.field2533;
            class156 var7 = new class156();
            var7.field2549 = 0;
            var7.field2809 = (long) var5;
            var7.field2550 = arg1;
            var7.field2554 = var6;
            class177 var8 = class157.field2561;
            synchronized (class157.field2561) {
                class157.field2561.method3328(var7);
            }
            class157.method3033();
        }
        this.method2957(arg1);
        this.method3059();
    }

    @ObfuscatedName("ei.cn(Lbt;I[BZB)V")
    public void method3052(class71 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2533 != arg0) {
            if (!arg3 && this.field2541 == arg1) {
                this.field2542 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2538[arg1] = false;
                if (this.field2535 || arg3) {
                    class153.method2308(this, this.field2534, arg1, this.field2492[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2539.reset();
            field2539.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2539.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2492[arg1] != var9 || this.field2488[arg1] != var10) {
                this.field2538[arg1] = false;
                if (this.field2535 || arg3) {
                    class153.method2308(this, this.field2534, arg1, this.field2492[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2538[arg1] = true;
            if (arg3) {
                this.field2502[arg1] = class119.method12(arg2, false);
            }
            return;
        }
        if (this.field2542) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class153.method2308(this, 255, this.field2534, this.field2536, (byte) 0, true);
            return;
        }
        field2539.reset();
        field2539.update(arg2, 0, arg2.length);
        int var5 = (int) field2539.getValue();
        class127 var6 = new class127(class152.method121(arg2));
        int var7 = var6.method2441();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2446();
        }
        if (this.field2536 != var5 || this.field2540 != var8) {
            class153.method2308(this, 255, this.field2534, this.field2536, (byte) 0, true);
            return;
        }
        this.method2957(arg2);
        this.method3059();
    }

    @ObfuscatedName("ei.ca(B)V")
    public void method3059() {
        this.field2538 = new boolean[this.field2502.length];
        for (int var1 = 0; var1 < this.field2538.length; var1++) {
            this.field2538[var1] = false;
        }
        if (this.field2532 == null) {
            this.field2542 = true;
            return;
        }
        this.field2541 = -1;
        for (int var2 = 0; var2 < this.field2538.length; var2++) {
            if (this.field2494[var2] > 0) {
                class157.method2828(var2, this.field2532, this);
                this.field2541 = var2;
            }
        }
        if (this.field2541 == -1) {
            this.field2542 = true;
        }
    }

    @ObfuscatedName("ei.cb(IB)I")
    public int method3054(int arg0) {
        if (this.field2502[arg0] == null) {
            return this.field2538[arg0] ? 100 : class153.method1533(this.field2534, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ei.cg(I)I")
    public int method3050() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2502.length; var3++) {
            if (this.field2494[var3] > 0) {
                var1 += 100;
                var2 += this.method3054(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
