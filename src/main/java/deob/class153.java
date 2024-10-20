package deob;

import java.util.zip.CRC32;

@ObfuscatedName("eq")
public class class153 extends class151 {

    @ObfuscatedName("eq.j")
    public class70 field2536;

    @ObfuscatedName("eq.a")
    public class70 field2530;

    @ObfuscatedName("eq.g")
    public int field2531;

    @ObfuscatedName("eq.x")
    public volatile boolean field2534 = false;

    @ObfuscatedName("eq.b")
    public boolean field2533 = false;

    @ObfuscatedName("eq.w")
    public volatile boolean[] field2532;

    @ObfuscatedName("eq.y")
    public static CRC32 field2535 = new CRC32();

    @ObfuscatedName("eq.au")
    public int field2539;

    @ObfuscatedName("eq.az")
    public int field2537;

    @ObfuscatedName("eq.ak")
    public int field2529 = -1;

    public class153(class70 arg0, class70 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2536 = arg0;
        this.field2530 = arg1;
        this.field2531 = arg2;
        this.field2533 = arg5;
        class152.method2398(this, this.field2531);
    }

    @ObfuscatedName("eq.bq(B)I")
    public int method3055() {
        if (this.field2534) {
            return 100;
        } else if (this.field2498 == null) {
            int var1 = class152.method2675(255, this.field2531);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("eq.f(IB)V")
    public void method2961(int arg0) {
        class152.method2205(this.field2531, arg0);
    }

    @ObfuscatedName("eq.l(IB)V")
    public void method2969(int arg0) {
        if (this.field2536 == null || this.field2532 == null || !this.field2532[arg0]) {
            class152.method122(this, this.field2531, arg0, this.field2492[arg0], (byte) 2, true);
            return;
        }
        class70 var2 = this.field2536;
        byte[] var4 = null;
        class176 var5 = class156.field2560;
        synchronized (class156.field2560) {
            for (class155 var6 = (class155) class156.field2560.method3294(); var6 != null; var6 = (class155) class156.field2560.method3296()) {
                if ((long) arg0 == var6.field2814 && var6.field2546 == var2 && var6.field2548 == 0) {
                    var4 = var6.field2547;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method1430(arg0);
            this.method3063(var2, arg0, var8, true);
        } else {
            this.method3063(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("eq.ba(IIB)V")
    public void method3057(int arg0, int arg1) {
        this.field2539 = arg0;
        this.field2537 = arg1;
        if (this.field2530 == null) {
            class152.method122(this, 255, this.field2531, this.field2539, (byte) 0, true);
            return;
        }
        int var3 = this.field2531;
        class70 var4 = this.field2530;
        byte[] var6 = null;
        class176 var7 = class156.field2560;
        synchronized (class156.field2560) {
            for (class155 var8 = (class155) class156.field2560.method3294(); var8 != null; var8 = (class155) class156.field2560.method3296()) {
                if ((long) var3 == var8.field2814 && var8.field2546 == var4 && var8.field2548 == 0) {
                    var6 = var8.field2547;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method1430(var3);
            this.method3063(var4, var3, var10, true);
        } else {
            this.method3063(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("eq.bb(I[BZZI)V")
    public void method3058(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2502[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2502[arg0];
            if (this.field2536 != null) {
                class156.method50(arg0, arg1, this.field2536);
                this.field2532[arg0] = true;
            }
            if (arg3) {
                this.field2498[arg0] = class118.method2402(arg1, false);
            }
            return;
        }
        if (this.field2534) {
            throw new RuntimeException();
        }
        if (this.field2530 != null) {
            int var5 = this.field2531;
            class70 var6 = this.field2530;
            class155 var7 = new class155();
            var7.field2548 = 0;
            var7.field2814 = (long) var5;
            var7.field2547 = arg1;
            var7.field2546 = var6;
            class176 var8 = class156.field2560;
            synchronized (class156.field2560) {
                class156.field2560.method3316(var7);
            }
            Object var10 = class156.field2558;
            synchronized (class156.field2558) {
                if (class156.field2557 == 0) {
                    Statics.field960.method1522(new class156(), 5);
                }
                class156.field2557 = 600;
            }
        }
        this.method2960(arg1);
        this.method3059();
    }

    @ObfuscatedName("eq.bl(Lbg;I[BZI)V")
    public void method3063(class70 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2530 != arg0) {
            if (!arg3 && this.field2529 == arg1) {
                this.field2534 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2532[arg1] = false;
                if (this.field2533 || arg3) {
                    class152.method122(this, this.field2531, arg1, this.field2492[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2535.reset();
            field2535.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2535.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2492[arg1] != var9 || this.field2502[arg1] != var10) {
                this.field2532[arg1] = false;
                if (this.field2533 || arg3) {
                    class152.method122(this, this.field2531, arg1, this.field2492[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2532[arg1] = true;
            if (arg3) {
                this.field2498[arg1] = class118.method2402(arg2, false);
            }
            return;
        }
        if (this.field2534) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class152.method122(this, 255, this.field2531, this.field2539, (byte) 0, true);
            return;
        }
        field2535.reset();
        field2535.update(arg2, 0, arg2.length);
        int var5 = (int) field2535.getValue();
        class126 var6 = new class126(class151.method1348(arg2));
        int var7 = var6.method2466();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2500();
        }
        if (this.field2539 != var5 || this.field2537 != var8) {
            class152.method122(this, 255, this.field2531, this.field2539, (byte) 0, true);
            return;
        }
        this.method2960(arg2);
        this.method3059();
    }

    @ObfuscatedName("eq.cn(I)V")
    public void method3059() {
        this.field2532 = new boolean[this.field2498.length];
        for (int var1 = 0; var1 < this.field2532.length; var1++) {
            this.field2532[var1] = false;
        }
        if (this.field2536 == null) {
            this.field2534 = true;
            return;
        }
        this.field2529 = -1;
        for (int var2 = 0; var2 < this.field2532.length; var2++) {
            if (this.field2494[var2] > 0) {
                class156.method1665(var2, this.field2536, this);
                this.field2529 = var2;
            }
        }
        if (this.field2529 == -1) {
            this.field2534 = true;
        }
    }

    @ObfuscatedName("eq.ch(IB)I")
    public int method3056(int arg0) {
        if (this.field2498[arg0] == null) {
            return this.field2532[arg0] ? 100 : class152.method2675(this.field2531, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("eq.cl(B)I")
    public int method3062() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2498.length; var3++) {
            if (this.field2494[var3] > 0) {
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
