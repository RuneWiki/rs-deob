package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ez")
public class class152 extends class151 {

    @ObfuscatedName("ez.j")
    public class125 field2514;

    @ObfuscatedName("ez.g")
    public class125 field2513;

    @ObfuscatedName("ez.y")
    public int field2509;

    @ObfuscatedName("ez.p")
    public volatile boolean field2512 = false;

    @ObfuscatedName("ez.r")
    public boolean field2510 = false;

    @ObfuscatedName("ez.z")
    public volatile boolean[] field2511;

    @ObfuscatedName("ez.c")
    public static CRC32 field2515 = new CRC32();

    @ObfuscatedName("ez.an")
    public int field2516;

    @ObfuscatedName("ez.as")
    public int field2517;

    @ObfuscatedName("ez.ah")
    public int field2518 = -1;

    public class152(class125 arg0, class125 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2514 = arg0;
        this.field2513 = arg1;
        this.field2509 = arg2;
        this.field2510 = arg5;
        int var8 = this.field2509;
        if (Statics.field1263 == null) {
            class155.method157((class152) null, 255, 255, 0, (byte) 0, true);
            class155.field2549[var8] = this;
        } else {
            Statics.field1263.field1861 = var8 * 8 + 5;
            int var9 = Statics.field1263.method2136();
            int var10 = Statics.field1263.method2136();
            this.method2818(var9, var10);
        }
    }

    @ObfuscatedName("ez.ch(I)I")
    public int method2816() {
        if (this.field2512) {
            return 100;
        } else if (this.field2498 == null) {
            int var1 = this.field2509;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field65 != null && Statics.field65.field2908 == var2) {
                var4 = Statics.field2545.field1861 * 99 / (Statics.field2545.field1865.length - Statics.field65.field2562) + 1;
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

    @ObfuscatedName("ez.v(IB)V")
    public void method2781(int arg0) {
        class155.method2428(this.field2509, arg0);
    }

    @ObfuscatedName("ez.k(II)V")
    public void method2738(int arg0) {
        if (this.field2514 == null || this.field2511 == null || !this.field2511[arg0]) {
            class155.method157(this, this.field2509, arg0, this.field2491[arg0], (byte) 2, true);
        } else {
            class154.method2707(arg0, this.field2514, this);
        }
    }

    @ObfuscatedName("ez.cn(III)V")
    public void method2818(int arg0, int arg1) {
        this.field2516 = arg0;
        this.field2517 = arg1;
        if (this.field2513 == null) {
            class155.method157(this, 255, this.field2509, this.field2516, (byte) 0, true);
        } else {
            class154.method2707(this.field2509, this.field2513, this);
        }
    }

    @ObfuscatedName("ez.cp(I[BZZI)V")
    public void method2817(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2492[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2492[arg0];
            if (this.field2514 != null) {
                class125 var10 = this.field2514;
                class153 var11 = new class153();
                var11.field2526 = 0;
                var11.field2908 = (long) arg0;
                var11.field2520 = arg1;
                var11.field2521 = var10;
                class182 var12 = class154.field2529;
                synchronized (class154.field2529) {
                    class154.field2529.method3274(var11);
                }
                class154.method27();
                this.field2511[arg0] = true;
            }
            if (arg3) {
                this.field2498[arg0] = class116.method493(arg1, false);
            }
            return;
        }
        if (this.field2512) {
            throw new RuntimeException();
        }
        if (this.field2513 != null) {
            int var5 = this.field2509;
            class125 var6 = this.field2513;
            class153 var7 = new class153();
            var7.field2526 = 0;
            var7.field2908 = (long) var5;
            var7.field2520 = arg1;
            var7.field2521 = var6;
            class182 var8 = class154.field2529;
            synchronized (class154.field2529) {
                class154.field2529.method3274(var7);
            }
            class154.method27();
        }
        this.method2770(arg1);
        this.method2821();
    }

    @ObfuscatedName("ez.ck(Ldz;I[BZI)V")
    public void method2829(class125 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2513 != arg0) {
            if (!arg3 && this.field2518 == arg1) {
                this.field2512 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2511[arg1] = false;
                if (this.field2510 || arg3) {
                    class155.method157(this, this.field2509, arg1, this.field2491[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2515.reset();
            field2515.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2515.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2491[arg1] != var9 || this.field2492[arg1] != var10) {
                this.field2511[arg1] = false;
                if (this.field2510 || arg3) {
                    class155.method157(this, this.field2509, arg1, this.field2491[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2511[arg1] = true;
            if (arg3) {
                this.field2498[arg1] = class116.method493(arg2, false);
            }
            return;
        }
        if (this.field2512) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class155.method157(this, 255, this.field2509, this.field2516, (byte) 0, true);
            return;
        }
        field2515.reset();
        field2515.update(arg2, 0, arg2.length);
        int var5 = (int) field2515.getValue();
        class110 var6 = new class110(class151.method536(arg2));
        int var7 = var6.method2199();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2509 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2136();
        }
        if (this.field2516 != var5 || this.field2517 != var8) {
            class155.method157(this, 255, this.field2509, this.field2516, (byte) 0, true);
            return;
        }
        this.method2770(arg2);
        this.method2821();
    }

    @ObfuscatedName("ez.cg(I)V")
    public void method2821() {
        this.field2511 = new boolean[this.field2498.length];
        for (int var1 = 0; var1 < this.field2511.length; var1++) {
            this.field2511[var1] = false;
        }
        if (this.field2514 == null) {
            this.field2512 = true;
            return;
        }
        this.field2518 = -1;
        for (int var2 = 0; var2 < this.field2511.length; var2++) {
            if (this.field2494[var2] > 0) {
                class125 var3 = this.field2514;
                class153 var5 = new class153();
                var5.field2526 = 1;
                var5.field2908 = (long) var2;
                var5.field2521 = var3;
                var5.field2524 = this;
                class182 var6 = class154.field2529;
                synchronized (class154.field2529) {
                    class154.field2529.method3274(var5);
                }
                class154.method27();
                this.field2518 = var2;
            }
        }
        if (this.field2518 == -1) {
            this.field2512 = true;
        }
    }

    @ObfuscatedName("ez.cy(II)I")
    public int method2822(int arg0) {
        if (this.field2498[arg0] != null) {
            return 100;
        } else if (this.field2511[arg0]) {
            return 100;
        } else {
            int var2 = this.field2509;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field65 != null && Statics.field65.field2908 == var3) {
                var5 = Statics.field2545.field1861 * 99 / (Statics.field2545.field1865.length - Statics.field65.field2562) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ez.cv(B)I")
    public int method2823() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2498.length; var3++) {
            if (this.field2494[var3] > 0) {
                var1 += 100;
                var2 += this.method2822(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
