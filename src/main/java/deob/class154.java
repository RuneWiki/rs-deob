package deob;

import java.util.zip.CRC32;

@ObfuscatedName("et")
public class class154 extends class152 {

    @ObfuscatedName("et.s")
    public class71 field2560;

    @ObfuscatedName("et.t")
    public class71 field2559;

    @ObfuscatedName("et.r")
    public int field2564;

    @ObfuscatedName("et.w")
    public volatile boolean field2558 = false;

    @ObfuscatedName("et.x")
    public boolean field2563 = false;

    @ObfuscatedName("et.n")
    public volatile boolean[] field2557;

    @ObfuscatedName("et.c")
    public static CRC32 field2561 = new CRC32();

    @ObfuscatedName("et.az")
    public int field2562;

    @ObfuscatedName("et.ax")
    public int field2555;

    @ObfuscatedName("et.aq")
    public int field2556 = -1;

    public class154(class71 arg0, class71 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2560 = arg0;
        this.field2559 = arg1;
        this.field2564 = arg2;
        this.field2563 = arg5;
        class153.method750(this, this.field2564);
    }

    @ObfuscatedName("et.cc(I)I")
    public int method3034() {
        if (this.field2558) {
            return 100;
        } else if (this.field2521 == null) {
            int var1 = class153.method243(255, this.field2564);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("et.p(II)V")
    public void method2979(int arg0) {
        int var2 = this.field2564;
        long var3 = (long) ((var2 << 16) + arg0);
        class155 var5 = (class155) class153.field2539.method3268(var3);
        if (var5 != null) {
            class153.field2538.method3236(var5);
        }
    }

    @ObfuscatedName("et.j(II)V")
    public void method2943(int arg0) {
        if (this.field2560 == null || this.field2557 == null || !this.field2557[arg0]) {
            class153.method2656(this, this.field2564, arg0, this.field2515[arg0], (byte) 2, true);
        } else {
            class157.method59(arg0, this.field2560, this);
        }
    }

    @ObfuscatedName("et.cd(III)V")
    public void method3036(int arg0, int arg1) {
        this.field2562 = arg0;
        this.field2555 = arg1;
        if (this.field2559 == null) {
            class153.method2656(this, 255, this.field2564, this.field2562, (byte) 0, true);
        } else {
            class157.method59(this.field2564, this.field2559, this);
        }
    }

    @ObfuscatedName("et.cz(I[BZZI)V")
    public void method3050(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2558) {
                throw new RuntimeException();
            }
            if (this.field2559 != null) {
                class157.method154(this.field2564, arg1, this.field2559);
            }
            this.method2933(arg1);
            this.method3057();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2531[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2531[arg0];
        if (this.field2560 != null) {
            class71 var5 = this.field2560;
            class156 var6 = new class156();
            var6.field2574 = 0;
            var6.field2818 = (long) arg0;
            var6.field2573 = arg1;
            var6.field2576 = var5;
            class177 var7 = class157.field2577;
            synchronized (class157.field2577) {
                class157.field2577.method3308(var6);
            }
            Object var9 = class157.field2580;
            synchronized (class157.field2580) {
                if (class157.field2579 == 0) {
                    Statics.field2466.method1455(new class157(), 5);
                }
                class157.field2579 = 600;
            }
            this.field2557[arg0] = true;
        }
        if (arg3) {
            this.field2521[arg0] = class119.method1328(arg1, false);
        }
    }

    @ObfuscatedName("et.ct(Lbb;I[BZI)V")
    public void method3041(class71 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2559 != arg0) {
            if (!arg3 && this.field2556 == arg1) {
                this.field2558 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2557[arg1] = false;
                if (this.field2563 || arg3) {
                    class153.method2656(this, this.field2564, arg1, this.field2515[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2561.reset();
            field2561.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2561.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2515[arg1] != var9 || this.field2531[arg1] != var10) {
                this.field2557[arg1] = false;
                if (this.field2563 || arg3) {
                    class153.method2656(this, this.field2564, arg1, this.field2515[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2557[arg1] = true;
            if (arg3) {
                this.field2521[arg1] = class119.method1328(arg2, false);
            }
            return;
        }
        if (this.field2558) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class153.method2656(this, 255, this.field2564, this.field2562, (byte) 0, true);
            return;
        }
        field2561.reset();
        field2561.update(arg2, 0, arg2.length);
        int var5 = (int) field2561.getValue();
        class127 var6 = new class127(class152.method145(arg2));
        int var7 = var6.method2411();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2416();
        }
        if (this.field2562 != var5 || this.field2555 != var8) {
            class153.method2656(this, 255, this.field2564, this.field2562, (byte) 0, true);
            return;
        }
        this.method2933(arg2);
        this.method3057();
    }

    @ObfuscatedName("et.cv(B)V")
    public void method3057() {
        this.field2557 = new boolean[this.field2521.length];
        for (int var1 = 0; var1 < this.field2557.length; var1++) {
            this.field2557[var1] = false;
        }
        if (this.field2560 == null) {
            this.field2558 = true;
            return;
        }
        this.field2556 = -1;
        for (int var2 = 0; var2 < this.field2557.length; var2++) {
            if (this.field2517[var2] > 0) {
                class157.method2059(var2, this.field2560, this);
                this.field2556 = var2;
            }
        }
        if (this.field2556 == -1) {
            this.field2558 = true;
        }
    }

    @ObfuscatedName("et.cl(II)I")
    public int method3039(int arg0) {
        if (this.field2521[arg0] == null) {
            return this.field2557[arg0] ? 100 : class153.method243(this.field2564, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("et.cx(B)I")
    public int method3040() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2521.length; var3++) {
            if (this.field2517[var3] > 0) {
                var1 += 100;
                var2 += this.method3039(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
