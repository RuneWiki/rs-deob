package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ey")
public class class154 extends class152 {

    @ObfuscatedName("ey.s")
    public class71 field2554;

    @ObfuscatedName("ey.g")
    public class71 field2553;

    @ObfuscatedName("ey.m")
    public int field2562;

    @ObfuscatedName("ey.a")
    public volatile boolean field2555 = false;

    @ObfuscatedName("ey.n")
    public boolean field2556 = false;

    @ObfuscatedName("ey.v")
    public volatile boolean[] field2559;

    @ObfuscatedName("ey.e")
    public static CRC32 field2558 = new CRC32();

    @ObfuscatedName("ey.ar")
    public int field2557;

    @ObfuscatedName("ey.ak")
    public int field2560;

    @ObfuscatedName("ey.ap")
    public int field2561 = -1;

    public class154(class71 arg0, class71 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2554 = arg0;
        this.field2553 = arg1;
        this.field2562 = arg2;
        this.field2556 = arg5;
        int var8 = this.field2562;
        if (Statics.field982 == null) {
            class153.method3073((class154) null, 255, 255, 0, (byte) 0, true);
            class153.field2547[var8] = this;
        } else {
            Statics.field982.field2059 = var8 * 8 + 5;
            int var9 = Statics.field982.method2448();
            int var10 = Statics.field982.method2448();
            this.method3092(var9, var10);
        }
    }

    @ObfuscatedName("ey.cv(I)I")
    public int method3080() {
        if (this.field2555) {
            return 100;
        } else if (this.field2523 == null) {
            int var1 = class153.method560(255, this.field2562);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ey.l(IB)V")
    public void method2986(int arg0) {
        int var2 = this.field2562;
        long var3 = (long) ((var2 << 16) + arg0);
        class155 var5 = (class155) class153.field2542.method3301(var3);
        if (var5 != null) {
            class153.field2544.method3283(var5);
        }
    }

    @ObfuscatedName("ey.j(IS)V")
    public void method3063(int arg0) {
        if (this.field2554 == null || this.field2559 == null || !this.field2559[arg0]) {
            class153.method3073(this, this.field2562, arg0, this.field2517[arg0], (byte) 2, true);
        } else {
            class157.method149(arg0, this.field2554, this);
        }
    }

    @ObfuscatedName("ey.cu(III)V")
    public void method3092(int arg0, int arg1) {
        this.field2557 = arg0;
        this.field2560 = arg1;
        if (this.field2553 == null) {
            class153.method3073(this, 255, this.field2562, this.field2557, (byte) 0, true);
        } else {
            class157.method149(this.field2562, this.field2553, this);
        }
    }

    @ObfuscatedName("ey.cn(I[BZZI)V")
    public void method3100(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2555) {
                throw new RuntimeException();
            }
            if (this.field2553 != null) {
                class157.method2335(this.field2562, arg1, this.field2553);
            }
            this.method2985(arg1);
            this.method3083();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2518[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2518[arg0];
        if (this.field2554 != null) {
            class157.method2335(arg0, arg1, this.field2554);
            this.field2559[arg0] = true;
        }
        if (arg3) {
            this.field2523[arg0] = Statics.method126(arg1, false);
        }
    }

    @ObfuscatedName("ey.ce(Lbz;I[BZB)V")
    public void method3082(class71 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2553 != arg0) {
            if (!arg3 && this.field2561 == arg1) {
                this.field2555 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2559[arg1] = false;
                if (this.field2556 || arg3) {
                    class153.method3073(this, this.field2562, arg1, this.field2517[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2558.reset();
            field2558.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2558.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2517[arg1] != var9 || this.field2518[arg1] != var10) {
                this.field2559[arg1] = false;
                if (this.field2556 || arg3) {
                    class153.method3073(this, this.field2562, arg1, this.field2517[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2559[arg1] = true;
            if (arg3) {
                this.field2523[arg1] = Statics.method126(arg2, false);
            }
            return;
        }
        if (this.field2555) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class153.method3073(this, 255, this.field2562, this.field2557, (byte) 0, true);
            return;
        }
        field2558.reset();
        field2558.update(arg2, 0, arg2.length);
        int var5 = (int) field2558.getValue();
        class127 var6 = new class127(class152.method2726(arg2));
        int var7 = var6.method2438();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2448();
        }
        if (this.field2557 != var5 || this.field2560 != var8) {
            class153.method3073(this, 255, this.field2562, this.field2557, (byte) 0, true);
            return;
        }
        this.method2985(arg2);
        this.method3083();
    }

    @ObfuscatedName("ey.ci(B)V")
    public void method3083() {
        this.field2559 = new boolean[this.field2523.length];
        for (int var1 = 0; var1 < this.field2559.length; var1++) {
            this.field2559[var1] = false;
        }
        if (this.field2554 == null) {
            this.field2555 = true;
            return;
        }
        this.field2561 = -1;
        for (int var2 = 0; var2 < this.field2559.length; var2++) {
            if (this.field2516[var2] > 0) {
                class71 var3 = this.field2554;
                class156 var5 = new class156();
                var5.field2574 = 1;
                var5.field2821 = (long) var2;
                var5.field2573 = var3;
                var5.field2572 = this;
                class177 var6 = class157.field2578;
                synchronized (class157.field2578) {
                    class157.field2578.method3317(var5);
                }
                Object var8 = class157.field2579;
                synchronized (class157.field2579) {
                    if (class157.field2580 == 0) {
                        Statics.field1405.method1515(new class157(), 5);
                    }
                    class157.field2580 = 600;
                }
                this.field2561 = var2;
            }
        }
        if (this.field2561 == -1) {
            this.field2555 = true;
        }
    }

    @ObfuscatedName("ey.cj(II)I")
    public int method3097(int arg0) {
        if (this.field2523[arg0] == null) {
            return this.field2559[arg0] ? 100 : class153.method560(this.field2562, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ey.ct(I)I")
    public int method3085() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2523.length; var3++) {
            if (this.field2516[var3] > 0) {
                var1 += 100;
                var2 += this.method3097(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
