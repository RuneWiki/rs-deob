package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ft")
public class class159 extends class158 {

    @ObfuscatedName("ft.g")
    public class126 field2598;

    @ObfuscatedName("ft.l")
    public class126 field2590;

    @ObfuscatedName("ft.u")
    public int field2591;

    @ObfuscatedName("ft.j")
    public volatile boolean field2592 = false;

    @ObfuscatedName("ft.z")
    public boolean field2597 = false;

    @ObfuscatedName("ft.b")
    public volatile boolean[] field2594;

    @ObfuscatedName("ft.a")
    public static CRC32 field2595 = new CRC32();

    @ObfuscatedName("ft.ag")
    public int field2596;

    @ObfuscatedName("ft.am")
    public int field2600;

    @ObfuscatedName("ft.aa")
    public int field2593 = -1;

    public class159(class126 arg0, class126 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2598 = arg0;
        this.field2590 = arg1;
        this.field2591 = arg2;
        this.field2597 = arg5;
        int var8 = this.field2591;
        if (Statics.field1530 == null) {
            class162.method563((class159) null, 255, 255, 0, (byte) 0, true);
            class162.field2635[var8] = this;
        } else {
            Statics.field1530.field1885 = var8 * 8 + 5;
            int var9 = Statics.field1530.method2350();
            int var10 = Statics.field1530.method2350();
            this.method2981(var9, var10);
        }
    }

    @ObfuscatedName("ft.cl(I)I")
    public int method2977() {
        if (this.field2592) {
            return 100;
        } else if (this.field2576 == null) {
            int var1 = class162.method2666(255, this.field2591);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ft.k(II)V")
    public void method2894(int arg0) {
        class162.method2823(this.field2591, arg0);
    }

    @ObfuscatedName("ft.m(II)V")
    public void method2942(int arg0) {
        if (this.field2598 == null || this.field2594 == null || !this.field2594[arg0]) {
            class162.method563(this, this.field2591, arg0, this.field2575[arg0], (byte) 2, true);
        } else {
            class161.method858(arg0, this.field2598, this);
        }
    }

    @ObfuscatedName("ft.co(III)V")
    public void method2981(int arg0, int arg1) {
        this.field2596 = arg0;
        this.field2600 = arg1;
        if (this.field2590 == null) {
            class162.method563(this, 255, this.field2591, this.field2596, (byte) 0, true);
        } else {
            class161.method858(this.field2591, this.field2590, this);
        }
    }

    @ObfuscatedName("ft.ca(I[BZZI)V")
    public void method2979(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2592) {
                throw new RuntimeException();
            }
            if (this.field2590 != null) {
                class161.method842(this.field2591, arg1, this.field2590);
            }
            this.method2895(arg1);
            this.method2976();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2582[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2582[arg0];
        if (this.field2598 != null) {
            class161.method842(arg0, arg1, this.field2598);
            this.field2594[arg0] = true;
        }
        if (arg3) {
            this.field2576[arg0] = class117.method630(arg1, false);
        }
    }

    @ObfuscatedName("ft.ci(Lda;I[BZI)V")
    public void method2997(class126 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2590 != arg0) {
            if (!arg3 && this.field2593 == arg1) {
                this.field2592 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2594[arg1] = false;
                if (this.field2597 || arg3) {
                    class162.method563(this, this.field2591, arg1, this.field2575[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2595.reset();
            field2595.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2595.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2575[arg1] != var9 || this.field2582[arg1] != var10) {
                this.field2594[arg1] = false;
                if (this.field2597 || arg3) {
                    class162.method563(this, this.field2591, arg1, this.field2575[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2594[arg1] = true;
            if (arg3) {
                this.field2576[arg1] = class117.method630(arg2, false);
            }
            return;
        }
        if (this.field2592) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class162.method563(this, 255, this.field2591, this.field2596, (byte) 0, true);
            return;
        }
        field2595.reset();
        field2595.update(arg2, 0, arg2.length);
        int var5 = (int) field2595.getValue();
        class111 var6 = new class111(class158.method2876(arg2));
        int var7 = var6.method2314();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2591 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2350();
        }
        if (this.field2596 != var5 || this.field2600 != var8) {
            class162.method563(this, 255, this.field2591, this.field2596, (byte) 0, true);
            return;
        }
        this.method2895(arg2);
        this.method2976();
    }

    @ObfuscatedName("ft.cn(I)V")
    public void method2976() {
        this.field2594 = new boolean[this.field2576.length];
        for (int var1 = 0; var1 < this.field2594.length; var1++) {
            this.field2594[var1] = false;
        }
        if (this.field2598 == null) {
            this.field2592 = true;
            return;
        }
        this.field2593 = -1;
        for (int var2 = 0; var2 < this.field2594.length; var2++) {
            if (this.field2577[var2] > 0) {
                class126 var3 = this.field2598;
                class160 var5 = new class160();
                var5.field2604 = 1;
                var5.field3015 = (long) var2;
                var5.field2602 = var3;
                var5.field2605 = this;
                class190 var6 = class161.field2614;
                synchronized (class161.field2614) {
                    class161.field2614.method3437(var5);
                }
                Object var8 = class161.field2613;
                synchronized (class161.field2613) {
                    if (class161.field2612 == 0) {
                        Statics.field1983.method2547(new class161(), 5);
                    }
                    class161.field2612 = 600;
                }
                this.field2593 = var2;
            }
        }
        if (this.field2593 == -1) {
            this.field2592 = true;
        }
    }

    @ObfuscatedName("ft.cc(II)I")
    public int method2990(int arg0) {
        if (this.field2576[arg0] == null) {
            return this.field2594[arg0] ? 100 : class162.method2666(this.field2591, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ft.cy(S)I")
    public int method2980() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2576.length; var3++) {
            if (this.field2577[var3] > 0) {
                var1 += 100;
                var2 += this.method2990(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
