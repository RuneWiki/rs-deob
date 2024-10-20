package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ep")
public class class155 extends class153 {

    @ObfuscatedName("ep.s")
    public class71 field2561;

    @ObfuscatedName("ep.o")
    public class71 field2551;

    @ObfuscatedName("ep.g")
    public int field2552;

    @ObfuscatedName("ep.d")
    public volatile boolean field2553 = false;

    @ObfuscatedName("ep.t")
    public boolean field2558 = false;

    @ObfuscatedName("ep.b")
    public volatile boolean[] field2550;

    @ObfuscatedName("ep.c")
    public static CRC32 field2555 = new CRC32();

    @ObfuscatedName("ep.aw")
    public int field2557;

    @ObfuscatedName("ep.ap")
    public int field2556;

    @ObfuscatedName("ep.am")
    public int field2559 = -1;

    public class155(class71 arg0, class71 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2561 = arg0;
        this.field2551 = arg1;
        this.field2552 = arg2;
        this.field2558 = arg5;
        class154.method2772(this, this.field2552);
    }

    @ObfuscatedName("ep.bs(I)I")
    public int method3142() {
        if (this.field2553) {
            return 100;
        } else if (this.field2518 == null) {
            int var1 = Statics.method2777(255, this.field2552);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ep.e(II)V")
    public void method3047(int arg0) {
        int var2 = this.field2552;
        long var3 = (long) ((var2 << 16) + arg0);
        class156 var5 = (class156) class154.field2535.method3311(var3);
        if (var5 != null) {
            class154.field2534.method3279(var5);
        }
    }

    @ObfuscatedName("ep.q(II)V")
    public void method3056(int arg0) {
        if (this.field2561 == null || this.field2550 == null || !this.field2550[arg0]) {
            class154.method1571(this, this.field2552, arg0, this.field2520[arg0], (byte) 2, true);
        } else {
            class158.method1398(arg0, this.field2561, this);
        }
    }

    @ObfuscatedName("ep.bz(III)V")
    public void method3136(int arg0, int arg1) {
        this.field2557 = arg0;
        this.field2556 = arg1;
        if (this.field2551 == null) {
            class154.method1571(this, 255, this.field2552, this.field2557, (byte) 0, true);
            return;
        }
        int var3 = this.field2552;
        class71 var4 = this.field2551;
        byte[] var6 = null;
        class177 var7 = class158.field2579;
        synchronized (class158.field2579) {
            for (class157 var8 = (class157) class158.field2579.method3325(); var8 != null; var8 = (class157) class158.field2579.method3333()) {
                if ((long) var3 == var8.field2813 && var8.field2573 == var4 && var8.field2569 == 0) {
                    var6 = var8.field2568;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method1430(var3);
            this.method3138(var4, var3, var10, true);
        } else {
            this.method3138(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ep.bo(I[BZZB)V")
    public void method3149(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2513[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2513[arg0];
            if (this.field2561 != null) {
                class71 var10 = this.field2561;
                class157 var11 = new class157();
                var11.field2569 = 0;
                var11.field2813 = (long) arg0;
                var11.field2568 = arg1;
                var11.field2573 = var10;
                class177 var12 = class158.field2579;
                synchronized (class158.field2579) {
                    class158.field2579.method3332(var11);
                }
                class158.method3159();
                this.field2550[arg0] = true;
            }
            if (arg3) {
                this.field2518[arg0] = class119.method2249(arg1, false);
            }
            return;
        }
        if (this.field2553) {
            throw new RuntimeException();
        }
        if (this.field2551 != null) {
            int var5 = this.field2552;
            class71 var6 = this.field2551;
            class157 var7 = new class157();
            var7.field2569 = 0;
            var7.field2813 = (long) var5;
            var7.field2568 = arg1;
            var7.field2573 = var6;
            class177 var8 = class158.field2579;
            synchronized (class158.field2579) {
                class158.field2579.method3332(var7);
            }
            class158.method3159();
        }
        this.method3077(arg1);
        this.method3141();
    }

    @ObfuscatedName("ep.bt(Lbr;I[BZB)V")
    public void method3138(class71 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2551 != arg0) {
            if (!arg3 && this.field2559 == arg1) {
                this.field2553 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2550[arg1] = false;
                if (this.field2558 || arg3) {
                    class154.method1571(this, this.field2552, arg1, this.field2520[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2555.reset();
            field2555.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2555.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2520[arg1] != var9 || this.field2513[arg1] != var10) {
                this.field2550[arg1] = false;
                if (this.field2558 || arg3) {
                    class154.method1571(this, this.field2552, arg1, this.field2520[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2550[arg1] = true;
            if (arg3) {
                this.field2518[arg1] = class119.method2249(arg2, false);
            }
            return;
        }
        if (this.field2553) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class154.method1571(this, 255, this.field2552, this.field2557, (byte) 0, true);
            return;
        }
        field2555.reset();
        field2555.update(arg2, 0, arg2.length);
        int var5 = (int) field2555.getValue();
        class127 var6 = new class127(class153.method3(arg2));
        int var7 = var6.method2494();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2617();
        }
        if (this.field2557 != var5 || this.field2556 != var8) {
            class154.method1571(this, 255, this.field2552, this.field2557, (byte) 0, true);
            return;
        }
        this.method3077(arg2);
        this.method3141();
    }

    @ObfuscatedName("ep.cy(I)V")
    public void method3141() {
        this.field2550 = new boolean[this.field2518.length];
        for (int var1 = 0; var1 < this.field2550.length; var1++) {
            this.field2550[var1] = false;
        }
        if (this.field2561 == null) {
            this.field2553 = true;
            return;
        }
        this.field2559 = -1;
        for (int var2 = 0; var2 < this.field2550.length; var2++) {
            if (this.field2514[var2] > 0) {
                class71 var3 = this.field2561;
                class157 var5 = new class157();
                var5.field2569 = 1;
                var5.field2813 = (long) var2;
                var5.field2573 = var3;
                var5.field2570 = this;
                class177 var6 = class158.field2579;
                synchronized (class158.field2579) {
                    class158.field2579.method3332(var5);
                }
                class158.method3159();
                this.field2559 = var2;
            }
        }
        if (this.field2559 == -1) {
            this.field2553 = true;
        }
    }

    @ObfuscatedName("ep.cp(IB)I")
    public int method3133(int arg0) {
        if (this.field2518[arg0] == null) {
            return this.field2550[arg0] ? 100 : Statics.method2777(this.field2552, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ep.cs(I)I")
    public int method3140() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2518.length; var3++) {
            if (this.field2514[var3] > 0) {
                var1 += 100;
                var2 += this.method3133(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
