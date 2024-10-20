package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ed")
public class class154 extends class152 {

    @ObfuscatedName("ed.z")
    public class71 field2537;

    @ObfuscatedName("ed.h")
    public class71 field2535;

    @ObfuscatedName("ed.f")
    public int field2540;

    @ObfuscatedName("ed.w")
    public volatile boolean field2534 = false;

    @ObfuscatedName("ed.l")
    public boolean field2538 = false;

    @ObfuscatedName("ed.d")
    public volatile boolean[] field2539;

    @ObfuscatedName("ed.y")
    public static CRC32 field2536 = new CRC32();

    @ObfuscatedName("ed.ah")
    public int field2541;

    @ObfuscatedName("ed.ad")
    public int field2542;

    @ObfuscatedName("ed.au")
    public int field2543 = -1;

    public class154(class71 arg0, class71 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2537 = arg0;
        this.field2535 = arg1;
        this.field2540 = arg2;
        this.field2538 = arg5;
        int var8 = this.field2540;
        if (Statics.field357 == null) {
            class153.method93((class154) null, 255, 255, 0, (byte) 0, true);
            class153.field2528[var8] = this;
        } else {
            Statics.field357.field2016 = var8 * 8 + 5;
            int var9 = Statics.field357.method2383();
            int var10 = Statics.field357.method2383();
            this.method3029(var9, var10);
        }
    }

    @ObfuscatedName("ed.bv(I)I")
    public int method3053() {
        if (this.field2534) {
            return 100;
        } else if (this.field2505 == null) {
            int var1 = this.field2540;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2774 != null && Statics.field2774.field2817 == var2) {
                var4 = Statics.field2701.field2016 * 99 / (Statics.field2701.field2015.length - Statics.field2774.field2550) + 1;
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

    @ObfuscatedName("ed.r(IB)V")
    public void method2942(int arg0) {
        class153.method1205(this.field2540, arg0);
    }

    @ObfuscatedName("ed.i(IB)V")
    public void method2977(int arg0) {
        if (this.field2537 == null || this.field2539 == null || !this.field2539[arg0]) {
            class153.method93(this, this.field2540, arg0, this.field2499[arg0], (byte) 2, true);
            return;
        }
        class71 var2 = this.field2537;
        byte[] var4 = null;
        class177 var5 = class157.field2563;
        synchronized (class157.field2563) {
            for (class156 var6 = (class156) class157.field2563.method3276(); var6 != null; var6 = (class156) class157.field2563.method3278()) {
                if ((long) arg0 == var6.field2817 && var6.field2558 == var2 && var6.field2560 == 0) {
                    var4 = var6.field2557;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method1353(arg0);
            this.method3031(var2, arg0, var8, true);
        } else {
            this.method3031(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ed.bj(III)V")
    public void method3029(int arg0, int arg1) {
        this.field2541 = arg0;
        this.field2542 = arg1;
        if (this.field2535 == null) {
            class153.method93(this, 255, this.field2540, this.field2541, (byte) 0, true);
        } else {
            class157.method1515(this.field2540, this.field2535, this);
        }
    }

    @ObfuscatedName("ed.cl(I[BZZB)V")
    public void method3030(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2503[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2503[arg0];
            if (this.field2537 != null) {
                class71 var12 = this.field2537;
                class156 var13 = new class156();
                var13.field2560 = 0;
                var13.field2817 = (long) arg0;
                var13.field2557 = arg1;
                var13.field2558 = var12;
                class177 var14 = class157.field2563;
                synchronized (class157.field2563) {
                    class157.field2563.method3271(var13);
                }
                Object var16 = class157.field2565;
                synchronized (class157.field2565) {
                    if (class157.field2564 == 0) {
                        Statics.field156.method1424(new class157(), 5);
                    }
                    class157.field2564 = 600;
                }
                this.field2539[arg0] = true;
            }
            if (arg3) {
                this.field2505[arg0] = class119.method2294(arg1, false);
            }
            return;
        }
        if (this.field2534) {
            throw new RuntimeException();
        }
        if (this.field2535 != null) {
            int var5 = this.field2540;
            class71 var6 = this.field2535;
            class156 var7 = new class156();
            var7.field2560 = 0;
            var7.field2817 = (long) var5;
            var7.field2557 = arg1;
            var7.field2558 = var6;
            class177 var8 = class157.field2563;
            synchronized (class157.field2563) {
                class157.field2563.method3271(var7);
            }
            Object var10 = class157.field2565;
            synchronized (class157.field2565) {
                if (class157.field2564 == 0) {
                    Statics.field156.method1424(new class157(), 5);
                }
                class157.field2564 = 600;
            }
        }
        this.method2941(arg1);
        this.method3032();
    }

    @ObfuscatedName("ed.ce(Lbp;I[BZI)V")
    public void method3031(class71 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2535 != arg0) {
            if (!arg3 && this.field2543 == arg1) {
                this.field2534 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2539[arg1] = false;
                if (this.field2538 || arg3) {
                    class153.method93(this, this.field2540, arg1, this.field2499[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2536.reset();
            field2536.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2536.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2499[arg1] != var9 || this.field2503[arg1] != var10) {
                this.field2539[arg1] = false;
                if (this.field2538 || arg3) {
                    class153.method93(this, this.field2540, arg1, this.field2499[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2539[arg1] = true;
            if (arg3) {
                this.field2505[arg1] = class119.method2294(arg2, false);
            }
            return;
        }
        if (this.field2534) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class153.method93(this, 255, this.field2540, this.field2541, (byte) 0, true);
            return;
        }
        field2536.reset();
        field2536.update(arg2, 0, arg2.length);
        int var5 = (int) field2536.getValue();
        class126 var6 = new class126(class152.method759(arg2));
        int var7 = var6.method2481();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2383();
        }
        if (this.field2541 != var5 || this.field2542 != var8) {
            class153.method93(this, 255, this.field2540, this.field2541, (byte) 0, true);
            return;
        }
        this.method2941(arg2);
        this.method3032();
    }

    @ObfuscatedName("ed.ci(S)V")
    public void method3032() {
        this.field2539 = new boolean[this.field2505.length];
        for (int var1 = 0; var1 < this.field2539.length; var1++) {
            this.field2539[var1] = false;
        }
        if (this.field2537 == null) {
            this.field2534 = true;
            return;
        }
        this.field2543 = -1;
        for (int var2 = 0; var2 < this.field2539.length; var2++) {
            if (this.field2501[var2] > 0) {
                class157.method2312(var2, this.field2537, this);
                this.field2543 = var2;
            }
        }
        if (this.field2543 == -1) {
            this.field2534 = true;
        }
    }

    @ObfuscatedName("ed.cr(II)I")
    public int method3033(int arg0) {
        if (this.field2505[arg0] != null) {
            return 100;
        } else if (this.field2539[arg0]) {
            return 100;
        } else {
            int var2 = this.field2540;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2774 != null && Statics.field2774.field2817 == var3) {
                var5 = Statics.field2701.field2016 * 99 / (Statics.field2701.field2015.length - Statics.field2774.field2550) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ed.cy(I)I")
    public int method3034() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2505.length; var3++) {
            if (this.field2501[var3] > 0) {
                var1 += 100;
                var2 += this.method3033(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
