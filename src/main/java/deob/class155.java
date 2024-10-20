package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ew")
public class class155 extends class153 {

    @ObfuscatedName("ew.k")
    public class71 field2571;

    @ObfuscatedName("ew.p")
    public class71 field2564;

    @ObfuscatedName("ew.s")
    public int field2565;

    @ObfuscatedName("ew.m")
    public volatile boolean field2566 = false;

    @ObfuscatedName("ew.c")
    public boolean field2570 = false;

    @ObfuscatedName("ew.i")
    public volatile boolean[] field2568;

    @ObfuscatedName("ew.u")
    public static CRC32 field2569 = new CRC32();

    @ObfuscatedName("ew.at")
    public int field2563;

    @ObfuscatedName("ew.as")
    public int field2573;

    @ObfuscatedName("ew.ax")
    public int field2572 = -1;

    public class155(class71 arg0, class71 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2571 = arg0;
        this.field2564 = arg1;
        this.field2565 = arg2;
        this.field2570 = arg5;
        int var8 = this.field2565;
        if (Statics.field917 == null) {
            class154.method2022((class155) null, 255, 255, 0, (byte) 0, true);
            class154.field2538[var8] = this;
        } else {
            Statics.field917.field2027 = var8 * 8 + 5;
            int var9 = Statics.field917.method2439();
            int var10 = Statics.field917.method2439();
            this.method3080(var9, var10);
        }
    }

    @ObfuscatedName("ew.bc(B)I")
    public int method3078() {
        if (this.field2566) {
            return 100;
        } else if (this.field2528 == null) {
            int var1 = Statics.method1399(255, this.field2565);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ew.e(IB)V")
    public void method3010(int arg0) {
        int var2 = this.field2565;
        long var3 = (long) ((var2 << 16) + arg0);
        class156 var5 = (class156) class154.field2546.method3291(var3);
        if (var5 != null) {
            class154.field2558.method3270(var5);
        }
    }

    @ObfuscatedName("ew.d(II)V")
    public void method3004(int arg0) {
        if (this.field2571 == null || this.field2568 == null || !this.field2568[arg0]) {
            class154.method2022(this, this.field2565, arg0, this.field2522[arg0], (byte) 2, true);
            return;
        }
        class71 var2 = this.field2571;
        byte[] var4 = null;
        class177 var5 = class158.field2591;
        synchronized (class158.field2591) {
            for (class157 var6 = (class157) class158.field2591.method3314(); var6 != null; var6 = (class157) class158.field2591.method3325()) {
                if ((long) arg0 == var6.field2810 && var6.field2581 == var2 && var6.field2582 == 0) {
                    var4 = var6.field2580;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method1385(arg0);
            this.method3082(var2, arg0, var8, true);
        } else {
            this.method3082(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ew.bs(IIS)V")
    public void method3080(int arg0, int arg1) {
        this.field2563 = arg0;
        this.field2573 = arg1;
        if (this.field2564 == null) {
            class154.method2022(this, 255, this.field2565, this.field2563, (byte) 0, true);
            return;
        }
        int var3 = this.field2565;
        class71 var4 = this.field2564;
        byte[] var6 = null;
        class177 var7 = class158.field2591;
        synchronized (class158.field2591) {
            for (class157 var8 = (class157) class158.field2591.method3314(); var8 != null; var8 = (class157) class158.field2591.method3325()) {
                if ((long) var3 == var8.field2810 && var8.field2581 == var4 && var8.field2582 == 0) {
                    var6 = var8.field2580;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method1385(var3);
            this.method3082(var4, var3, var10, true);
        } else {
            this.method3082(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ew.by(I[BZZI)V")
    public void method3094(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2566) {
                throw new RuntimeException();
            }
            if (this.field2564 != null) {
                class158.method688(this.field2565, arg1, this.field2564);
            }
            this.method3035(arg1);
            this.method3092();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2523[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2523[arg0];
        if (this.field2571 != null) {
            class158.method688(arg0, arg1, this.field2571);
            this.field2568[arg0] = true;
        }
        if (arg3) {
            this.field2528[arg0] = class119.method1331(arg1, false);
        }
    }

    @ObfuscatedName("ew.bk(Lbg;I[BZB)V")
    public void method3082(class71 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2564 != arg0) {
            if (!arg3 && this.field2572 == arg1) {
                this.field2566 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2568[arg1] = false;
                if (this.field2570 || arg3) {
                    class154.method2022(this, this.field2565, arg1, this.field2522[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2569.reset();
            field2569.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2569.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2522[arg1] != var9 || this.field2523[arg1] != var10) {
                this.field2568[arg1] = false;
                if (this.field2570 || arg3) {
                    class154.method2022(this, this.field2565, arg1, this.field2522[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2568[arg1] = true;
            if (arg3) {
                this.field2528[arg1] = class119.method1331(arg2, false);
            }
            return;
        }
        if (this.field2566) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class154.method2022(this, 255, this.field2565, this.field2563, (byte) 0, true);
            return;
        }
        field2569.reset();
        field2569.update(arg2, 0, arg2.length);
        int var5 = (int) field2569.getValue();
        class126 var6 = new class126(class153.method803(arg2));
        int var7 = var6.method2436();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2439();
        }
        if (this.field2563 != var5 || this.field2573 != var8) {
            class154.method2022(this, 255, this.field2565, this.field2563, (byte) 0, true);
            return;
        }
        this.method3035(arg2);
        this.method3092();
    }

    @ObfuscatedName("ew.bz(B)V")
    public void method3092() {
        this.field2568 = new boolean[this.field2528.length];
        for (int var1 = 0; var1 < this.field2568.length; var1++) {
            this.field2568[var1] = false;
        }
        if (this.field2571 == null) {
            this.field2566 = true;
            return;
        }
        this.field2572 = -1;
        for (int var2 = 0; var2 < this.field2568.length; var2++) {
            if (this.field2524[var2] > 0) {
                class71 var3 = this.field2571;
                class157 var5 = new class157();
                var5.field2582 = 1;
                var5.field2810 = (long) var2;
                var5.field2581 = var3;
                var5.field2583 = this;
                class177 var6 = class158.field2591;
                synchronized (class158.field2591) {
                    class158.field2591.method3318(var5);
                }
                class158.method3();
                this.field2572 = var2;
            }
        }
        if (this.field2572 == -1) {
            this.field2566 = true;
        }
    }

    @ObfuscatedName("ew.bb(IS)I")
    public int method3084(int arg0) {
        if (this.field2528[arg0] == null) {
            return this.field2568[arg0] ? 100 : Statics.method1399(this.field2565, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ew.cp(I)I")
    public int method3086() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2528.length; var3++) {
            if (this.field2524[var3] > 0) {
                var1 += 100;
                var2 += this.method3084(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
