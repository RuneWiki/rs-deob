package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ec")
public class class150 extends class149 {

    @ObfuscatedName("ec.t")
    public class123 field2481;

    @ObfuscatedName("ec.o")
    public class123 field2475;

    @ObfuscatedName("ec.z")
    public int field2482;

    @ObfuscatedName("ec.d")
    public volatile boolean field2477 = false;

    @ObfuscatedName("ec.y")
    public boolean field2478 = false;

    @ObfuscatedName("ec.a")
    public volatile boolean[] field2479;

    @ObfuscatedName("ec.n")
    public static CRC32 field2480 = new CRC32();

    @ObfuscatedName("ec.ae")
    public int field2485;

    @ObfuscatedName("ec.ay")
    public int field2484;

    @ObfuscatedName("ec.ac")
    public int field2483 = -1;

    public class150(class123 arg0, class123 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2481 = arg0;
        this.field2475 = arg1;
        this.field2482 = arg2;
        this.field2478 = arg5;
        int var8 = this.field2482;
        if (Statics.field2516 == null) {
            class153.method2522((class150) null, 255, 255, 0, (byte) 0, true);
            class153.field2512[var8] = this;
        } else {
            Statics.field2516.field1841 = var8 * 8 + 5;
            int var9 = Statics.field2516.method2132();
            int var10 = Statics.field2516.method2132();
            this.method2825(var9, var10);
        }
    }

    @ObfuscatedName("ec.cj(B)I")
    public int method2830() {
        if (this.field2477) {
            return 100;
        } else if (this.field2465 == null) {
            int var1 = this.field2482;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field1882 != null && Statics.field1882.field2882 == var2) {
                var4 = Statics.field2136.field1841 * 99 / (Statics.field2136.field1839.length - Statics.field1882.field2528) + 1;
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

    @ObfuscatedName("ec.v(IB)V")
    public void method2730(int arg0) {
        int var2 = this.field2482;
        long var3 = (long) ((var2 << 16) + arg0);
        class154 var5 = (class154) class153.field2524.method3214(var3);
        if (var5 != null) {
            class153.field2508.method3313(var5);
        }
    }

    @ObfuscatedName("ec.k(IB)V")
    public void method2739(int arg0) {
        if (this.field2481 == null || this.field2479 == null || !this.field2479[arg0]) {
            class153.method2522(this, this.field2482, arg0, this.field2467[arg0], (byte) 2, true);
            return;
        }
        class123 var2 = this.field2481;
        byte[] var4 = null;
        class180 var5 = class152.field2501;
        synchronized (class152.field2501) {
            for (class151 var6 = (class151) class152.field2501.method3251(); var6 != null; var6 = (class151) class152.field2501.method3272()) {
                if ((long) arg0 == var6.field2882 && var6.field2495 == var2 && var6.field2494 == 0) {
                    var4 = var6.field2488;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2478(arg0);
            this.method2808(var2, arg0, var8, true);
        } else {
            this.method2808(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ec.cq(IIB)V")
    public void method2825(int arg0, int arg1) {
        this.field2485 = arg0;
        this.field2484 = arg1;
        if (this.field2475 == null) {
            class153.method2522(this, 255, this.field2482, this.field2485, (byte) 0, true);
        } else {
            Statics.method2689(this.field2482, this.field2475, this);
        }
    }

    @ObfuscatedName("ec.cn(I[BZZI)V")
    public void method2821(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2477) {
                throw new RuntimeException();
            }
            if (this.field2475 != null) {
                class152.method1885(this.field2482, arg1, this.field2475);
            }
            this.method2775(arg1);
            this.method2811();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2460[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2460[arg0];
        if (this.field2481 != null) {
            class152.method1885(arg0, arg1, this.field2481);
            this.field2479[arg0] = true;
        }
        if (arg3) {
            this.field2465[arg0] = class114.method1357(arg1, false);
        }
    }

    @ObfuscatedName("ec.cm(Lds;I[BZB)V")
    public void method2808(class123 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2475 != arg0) {
            if (!arg3 && this.field2483 == arg1) {
                this.field2477 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2479[arg1] = false;
                if (this.field2478 || arg3) {
                    class153.method2522(this, this.field2482, arg1, this.field2467[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2480.reset();
            field2480.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2480.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2467[arg1] != var9 || this.field2460[arg1] != var10) {
                this.field2479[arg1] = false;
                if (this.field2478 || arg3) {
                    class153.method2522(this, this.field2482, arg1, this.field2467[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2479[arg1] = true;
            if (arg3) {
                this.field2465[arg1] = class114.method1357(arg2, false);
            }
            return;
        }
        if (this.field2477) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class153.method2522(this, 255, this.field2482, this.field2485, (byte) 0, true);
            return;
        }
        field2480.reset();
        field2480.update(arg2, 0, arg2.length);
        int var5 = (int) field2480.getValue();
        class108 var6 = new class108(class149.method519(arg2));
        int var7 = var6.method2299();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2482 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2132();
        }
        if (this.field2485 != var5 || this.field2484 != var8) {
            class153.method2522(this, 255, this.field2482, this.field2485, (byte) 0, true);
            return;
        }
        this.method2775(arg2);
        this.method2811();
    }

    @ObfuscatedName("ec.ct(I)V")
    public void method2811() {
        this.field2479 = new boolean[this.field2465.length];
        for (int var1 = 0; var1 < this.field2479.length; var1++) {
            this.field2479[var1] = false;
        }
        if (this.field2481 == null) {
            this.field2477 = true;
            return;
        }
        this.field2483 = -1;
        for (int var2 = 0; var2 < this.field2479.length; var2++) {
            if (this.field2461[var2] > 0) {
                class123 var3 = this.field2481;
                class151 var5 = new class151();
                var5.field2494 = 1;
                var5.field2882 = (long) var2;
                var5.field2495 = var3;
                var5.field2491 = this;
                class180 var6 = class152.field2501;
                synchronized (class152.field2501) {
                    class152.field2501.method3246(var5);
                }
                Object var8 = class152.field2499;
                synchronized (class152.field2499) {
                    if (class152.field2500 == 0) {
                        Statics.field1891.method2500(new class152(), 5);
                    }
                    class152.field2500 = 600;
                }
                this.field2483 = var2;
            }
        }
        if (this.field2483 == -1) {
            this.field2477 = true;
        }
    }

    @ObfuscatedName("ec.ch(IB)I")
    public int method2812(int arg0) {
        if (this.field2465[arg0] != null) {
            return 100;
        } else if (this.field2479[arg0]) {
            return 100;
        } else {
            int var2 = this.field2482;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field1882 != null && Statics.field1882.field2882 == var3) {
                var5 = Statics.field2136.field1841 * 99 / (Statics.field2136.field1839.length - Statics.field1882.field2528) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ec.cf(B)I")
    public int method2813() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2465.length; var3++) {
            if (this.field2461[var3] > 0) {
                var1 += 100;
                var2 += this.method2812(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
