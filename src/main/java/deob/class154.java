package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ee")
public class class154 extends class152 {

    @ObfuscatedName("ee.z")
    public class71 field2553;

    @ObfuscatedName("ee.v")
    public class71 field2545;

    @ObfuscatedName("ee.w")
    public int field2544;

    @ObfuscatedName("ee.h")
    public volatile boolean field2547 = false;

    @ObfuscatedName("ee.q")
    public boolean field2548 = false;

    @ObfuscatedName("ee.g")
    public volatile boolean[] field2549;

    @ObfuscatedName("ee.e")
    public static CRC32 field2546 = new CRC32();

    @ObfuscatedName("ee.as")
    public int field2550;

    @ObfuscatedName("ee.an")
    public int field2552;

    @ObfuscatedName("ee.aj")
    public int field2551 = -1;

    public class154(class71 arg0, class71 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2553 = arg0;
        this.field2545 = arg1;
        this.field2544 = arg2;
        this.field2548 = arg5;
        class153.method575(this, this.field2544);
    }

    @ObfuscatedName("ee.cw(B)I")
    public int method3092() {
        if (this.field2547) {
            return 100;
        } else if (this.field2509 == null) {
            int var1 = this.field2544;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2535 != null && Statics.field2535.field2819 == var2) {
                var4 = Statics.field2523.field2036 * 99 / (Statics.field2523.field2037.length - Statics.field2535.field2556) + 1;
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

    @ObfuscatedName("ee.m(IB)V")
    public void method3043(int arg0) {
        int var2 = this.field2544;
        long var3 = (long) ((var2 << 16) + arg0);
        class155 var5 = (class155) class153.field2537.method3337(var3);
        if (var5 != null) {
            class153.field2522.method3314(var5);
        }
    }

    @ObfuscatedName("ee.l(II)V")
    public void method2999(int arg0) {
        if (this.field2553 == null || this.field2549 == null || !this.field2549[arg0]) {
            class153.method1(this, this.field2544, arg0, this.field2520[arg0], (byte) 2, true);
        } else {
            class157.method2226(arg0, this.field2553, this);
        }
    }

    @ObfuscatedName("ee.ch(IIS)V")
    public void method3099(int arg0, int arg1) {
        this.field2550 = arg0;
        this.field2552 = arg1;
        if (this.field2545 == null) {
            class153.method1(this, 255, this.field2544, this.field2550, (byte) 0, true);
        } else {
            class157.method2226(this.field2544, this.field2545, this);
        }
    }

    @ObfuscatedName("ee.cg(I[BZZI)V")
    public void method3106(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2504[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2504[arg0];
            if (this.field2553 != null) {
                class71 var10 = this.field2553;
                class156 var11 = new class156();
                var11.field2561 = 0;
                var11.field2819 = (long) arg0;
                var11.field2565 = arg1;
                var11.field2563 = var10;
                class177 var12 = class157.field2574;
                synchronized (class157.field2574) {
                    class157.field2574.method3350(var11);
                }
                class157.method2856();
                this.field2549[arg0] = true;
            }
            if (arg3) {
                this.field2509[arg0] = class119.method133(arg1, false);
            }
            return;
        }
        if (this.field2547) {
            throw new RuntimeException();
        }
        if (this.field2545 != null) {
            int var5 = this.field2544;
            class71 var6 = this.field2545;
            class156 var7 = new class156();
            var7.field2561 = 0;
            var7.field2819 = (long) var5;
            var7.field2565 = arg1;
            var7.field2563 = var6;
            class177 var8 = class157.field2574;
            synchronized (class157.field2574) {
                class157.field2574.method3350(var7);
            }
            class157.method2856();
        }
        this.method3072(arg1);
        this.method3097();
    }

    @ObfuscatedName("ee.ce(Lbm;I[BZB)V")
    public void method3096(class71 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2545 != arg0) {
            if (!arg3 && this.field2551 == arg1) {
                this.field2547 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2549[arg1] = false;
                if (this.field2548 || arg3) {
                    class153.method1(this, this.field2544, arg1, this.field2520[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2546.reset();
            field2546.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2546.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2520[arg1] != var9 || this.field2504[arg1] != var10) {
                this.field2549[arg1] = false;
                if (this.field2548 || arg3) {
                    class153.method1(this, this.field2544, arg1, this.field2520[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2549[arg1] = true;
            if (arg3) {
                this.field2509[arg1] = class119.method133(arg2, false);
            }
            return;
        }
        if (this.field2547) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class153.method1(this, 255, this.field2544, this.field2550, (byte) 0, true);
            return;
        }
        field2546.reset();
        field2546.update(arg2, 0, arg2.length);
        int var5 = (int) field2546.getValue();
        class127 var6 = new class127(class152.method707(arg2));
        int var7 = var6.method2534();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2628();
        }
        if (this.field2550 != var5 || this.field2552 != var8) {
            class153.method1(this, 255, this.field2544, this.field2550, (byte) 0, true);
            return;
        }
        this.method3072(arg2);
        this.method3097();
    }

    @ObfuscatedName("ee.cy(B)V")
    public void method3097() {
        this.field2549 = new boolean[this.field2509.length];
        for (int var1 = 0; var1 < this.field2549.length; var1++) {
            this.field2549[var1] = false;
        }
        if (this.field2553 == null) {
            this.field2547 = true;
            return;
        }
        this.field2551 = -1;
        for (int var2 = 0; var2 < this.field2549.length; var2++) {
            if (this.field2499[var2] > 0) {
                class157.method1518(var2, this.field2553, this);
                this.field2551 = var2;
            }
        }
        if (this.field2551 == -1) {
            this.field2547 = true;
        }
    }

    @ObfuscatedName("ee.cl(II)I")
    public int method3098(int arg0) {
        if (this.field2509[arg0] != null) {
            return 100;
        } else if (this.field2549[arg0]) {
            return 100;
        } else {
            int var2 = this.field2544;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2535 != null && Statics.field2535.field2819 == var3) {
                var5 = Statics.field2523.field2036 * 99 / (Statics.field2523.field2037.length - Statics.field2535.field2556) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ee.cc(I)I")
    public int method3108() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2509.length; var3++) {
            if (this.field2499[var3] > 0) {
                var1 += 100;
                var2 += this.method3098(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
