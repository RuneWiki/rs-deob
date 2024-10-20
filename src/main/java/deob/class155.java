package deob;

import java.util.zip.CRC32;

@ObfuscatedName("er")
public class class155 extends class153 {

    @ObfuscatedName("er.a")
    public class71 field2578;

    @ObfuscatedName("er.f")
    public class71 field2576;

    @ObfuscatedName("er.s")
    public int field2575;

    @ObfuscatedName("er.w")
    public volatile boolean field2582 = false;

    @ObfuscatedName("er.x")
    public boolean field2579 = false;

    @ObfuscatedName("er.j")
    public volatile boolean[] field2580;

    @ObfuscatedName("er.i")
    public static CRC32 field2583 = new CRC32();

    @ObfuscatedName("er.ap")
    public int field2581;

    @ObfuscatedName("er.am")
    public int field2577;

    @ObfuscatedName("er.ao")
    public int field2584 = -1;

    public class155(class71 arg0, class71 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2578 = arg0;
        this.field2576 = arg1;
        this.field2575 = arg2;
        this.field2579 = arg5;
        class154.method88(this, this.field2575);
    }

    @ObfuscatedName("er.cc(B)I")
    public int method3049() {
        if (this.field2582) {
            return 100;
        } else if (this.field2542 == null) {
            int var1 = this.field2575;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2564 != null && Statics.field2564.field2830 == var2) {
                var4 = Statics.field1297.field2039 * 99 / (Statics.field1297.field2042.length - Statics.field2564.field2589) + 1;
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

    @ObfuscatedName("er.c(II)V")
    public void method2951(int arg0) {
        class154.method1596(this.field2575, arg0);
    }

    @ObfuscatedName("er.h(II)V")
    public void method3006(int arg0) {
        if (this.field2578 == null || this.field2580 == null || !this.field2580[arg0]) {
            class154.method2204(this, this.field2575, arg0, this.field2536[arg0], (byte) 2, true);
            return;
        }
        class71 var2 = this.field2578;
        byte[] var4 = null;
        class177 var5 = class158.field2597;
        synchronized (class158.field2597) {
            for (class157 var6 = (class157) class158.field2597.method3286(); var6 != null; var6 = (class157) class158.field2597.method3302()) {
                if ((long) arg0 == var6.field2830 && var6.field2593 == var2 && var6.field2595 == 0) {
                    var4 = var6.field2592;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method1434(arg0);
            this.method3053(var2, arg0, var8, true);
        } else {
            this.method3053(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("er.cf(IIB)V")
    public void method3051(int arg0, int arg1) {
        this.field2581 = arg0;
        this.field2577 = arg1;
        if (this.field2576 == null) {
            class154.method2204(this, 255, this.field2575, this.field2581, (byte) 0, true);
            return;
        }
        int var3 = this.field2575;
        class71 var4 = this.field2576;
        byte[] var6 = null;
        class177 var7 = class158.field2597;
        synchronized (class158.field2597) {
            for (class157 var8 = (class157) class158.field2597.method3286(); var8 != null; var8 = (class157) class158.field2597.method3302()) {
                if ((long) var3 == var8.field2830 && var8.field2593 == var4 && var8.field2595 == 0) {
                    var6 = var8.field2592;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method1434(var3);
            this.method3053(var4, var3, var10, true);
        } else {
            this.method3053(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("er.cq(I[BZZB)V")
    public void method3057(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2541[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2541[arg0];
            if (this.field2578 != null) {
                class71 var12 = this.field2578;
                class157 var13 = new class157();
                var13.field2595 = 0;
                var13.field2830 = (long) arg0;
                var13.field2592 = arg1;
                var13.field2593 = var12;
                class177 var14 = class158.field2597;
                synchronized (class158.field2597) {
                    class158.field2597.method3288(var13);
                }
                Object var16 = class158.field2596;
                synchronized (class158.field2596) {
                    if (class158.field2598 == 0) {
                        Statics.field751.method1512(new class158(), 5);
                    }
                    class158.field2598 = 600;
                }
                this.field2580[arg0] = true;
            }
            if (arg3) {
                this.field2542[arg0] = class119.method237(arg1, false);
            }
            return;
        }
        if (this.field2582) {
            throw new RuntimeException();
        }
        if (this.field2576 != null) {
            int var5 = this.field2575;
            class71 var6 = this.field2576;
            class157 var7 = new class157();
            var7.field2595 = 0;
            var7.field2830 = (long) var5;
            var7.field2592 = arg1;
            var7.field2593 = var6;
            class177 var8 = class158.field2597;
            synchronized (class158.field2597) {
                class158.field2597.method3288(var7);
            }
            Object var10 = class158.field2596;
            synchronized (class158.field2596) {
                if (class158.field2598 == 0) {
                    Statics.field751.method1512(new class158(), 5);
                }
                class158.field2598 = 600;
            }
        }
        this.method2986(arg1);
        this.method3054();
    }

    @ObfuscatedName("er.cr(Lbm;I[BZB)V")
    public void method3053(class71 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2576 != arg0) {
            if (!arg3 && this.field2584 == arg1) {
                this.field2582 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2580[arg1] = false;
                if (this.field2579 || arg3) {
                    class154.method2204(this, this.field2575, arg1, this.field2536[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2583.reset();
            field2583.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2583.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2536[arg1] != var9 || this.field2541[arg1] != var10) {
                this.field2580[arg1] = false;
                if (this.field2579 || arg3) {
                    class154.method2204(this, this.field2575, arg1, this.field2536[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2580[arg1] = true;
            if (arg3) {
                this.field2542[arg1] = class119.method237(arg2, false);
            }
            return;
        }
        if (this.field2582) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class154.method2204(this, 255, this.field2575, this.field2581, (byte) 0, true);
            return;
        }
        field2583.reset();
        field2583.update(arg2, 0, arg2.length);
        int var5 = (int) field2583.getValue();
        class127 var6 = new class127(class153.method203(arg2));
        int var7 = var6.method2534();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2430();
        }
        if (this.field2581 != var5 || this.field2577 != var8) {
            class154.method2204(this, 255, this.field2575, this.field2581, (byte) 0, true);
            return;
        }
        this.method2986(arg2);
        this.method3054();
    }

    @ObfuscatedName("er.cl(I)V")
    public void method3054() {
        this.field2580 = new boolean[this.field2542.length];
        for (int var1 = 0; var1 < this.field2580.length; var1++) {
            this.field2580[var1] = false;
        }
        if (this.field2578 == null) {
            this.field2582 = true;
            return;
        }
        this.field2584 = -1;
        for (int var2 = 0; var2 < this.field2580.length; var2++) {
            if (this.field2538[var2] > 0) {
                class158.method2353(var2, this.field2578, this);
                this.field2584 = var2;
            }
        }
        if (this.field2584 == -1) {
            this.field2582 = true;
        }
    }

    @ObfuscatedName("er.cd(II)I")
    public int method3056(int arg0) {
        if (this.field2542[arg0] != null) {
            return 100;
        } else if (this.field2580[arg0]) {
            return 100;
        } else {
            int var2 = this.field2575;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2564 != null && Statics.field2564.field2830 == var3) {
                var5 = Statics.field1297.field2039 * 99 / (Statics.field1297.field2042.length - Statics.field2564.field2589) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("er.cs(B)I")
    public int method3064() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2542.length; var3++) {
            if (this.field2538[var3] > 0) {
                var1 += 100;
                var2 += this.method3056(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
