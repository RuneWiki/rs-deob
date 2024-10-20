package deob;

import java.util.zip.CRC32;

@ObfuscatedName("eh")
public class class148 extends class147 {

    @ObfuscatedName("eh.f")
    public class121 field2467;

    @ObfuscatedName("eh.g")
    public class121 field2476;

    @ObfuscatedName("eh.s")
    public int field2468;

    @ObfuscatedName("eh.y")
    public volatile boolean field2469 = false;

    @ObfuscatedName("eh.p")
    public boolean field2473 = false;

    @ObfuscatedName("eh.b")
    public volatile boolean[] field2471;

    @ObfuscatedName("eh.l")
    public static CRC32 field2472 = new CRC32();

    @ObfuscatedName("eh.al")
    public int field2470;

    @ObfuscatedName("eh.aa")
    public int field2474;

    @ObfuscatedName("eh.ar")
    public int field2475 = -1;

    public class148(class121 arg0, class121 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2467 = arg0;
        this.field2476 = arg1;
        this.field2468 = arg2;
        this.field2473 = arg5;
        class151.method133(this, this.field2468);
    }

    @ObfuscatedName("eh.cm(I)I")
    public int method2774() {
        if (this.field2469) {
            return 100;
        } else if (this.field2444 == null) {
            int var1 = class151.method1369(255, this.field2468);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("eh.x(II)V")
    public void method2673(int arg0) {
        class151.method537(this.field2468, arg0);
    }

    @ObfuscatedName("eh.o(II)V")
    public void method2704(int arg0) {
        if (this.field2467 == null || this.field2471 == null || !this.field2471[arg0]) {
            class151.method2776(this, this.field2468, arg0, this.field2448[arg0], (byte) 2, true);
        } else {
            Statics.method2405(arg0, this.field2467, this);
        }
    }

    @ObfuscatedName("eh.cs(III)V")
    public void method2770(int arg0, int arg1) {
        this.field2470 = arg0;
        this.field2474 = arg1;
        if (this.field2476 == null) {
            class151.method2776(this, 255, this.field2468, this.field2470, (byte) 0, true);
        } else {
            Statics.method2405(this.field2468, this.field2476, this);
        }
    }

    @ObfuscatedName("eh.cb(I[BZZI)V")
    public void method2755(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2449[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2449[arg0];
            if (this.field2467 != null) {
                class121 var10 = this.field2467;
                class149 var11 = new class149();
                var11.field2481 = 0;
                var11.field2888 = (long) arg0;
                var11.field2478 = arg1;
                var11.field2479 = var10;
                class178 var12 = class150.field2488;
                synchronized (class150.field2488) {
                    class150.field2488.method3181(var11);
                }
                class150.method550();
                this.field2471[arg0] = true;
            }
            if (arg3) {
                this.field2444[arg0] = class112.method1344(arg1, false);
            }
            return;
        }
        if (this.field2469) {
            throw new RuntimeException();
        }
        if (this.field2476 != null) {
            int var5 = this.field2468;
            class121 var6 = this.field2476;
            class149 var7 = new class149();
            var7.field2481 = 0;
            var7.field2888 = (long) var5;
            var7.field2478 = arg1;
            var7.field2479 = var6;
            class178 var8 = class150.field2488;
            synchronized (class150.field2488) {
                class150.field2488.method3181(var7);
            }
            class150.method550();
        }
        this.method2674(arg1);
        this.method2761();
    }

    @ObfuscatedName("eh.cc(Ldk;I[BZI)V")
    public void method2756(class121 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2476 != arg0) {
            if (!arg3 && this.field2475 == arg1) {
                this.field2469 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2471[arg1] = false;
                if (this.field2473 || arg3) {
                    class151.method2776(this, this.field2468, arg1, this.field2448[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2472.reset();
            field2472.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2472.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2448[arg1] != var9 || this.field2449[arg1] != var10) {
                this.field2471[arg1] = false;
                if (this.field2473 || arg3) {
                    class151.method2776(this, this.field2468, arg1, this.field2448[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2471[arg1] = true;
            if (arg3) {
                this.field2444[arg1] = class112.method1344(arg2, false);
            }
            return;
        }
        if (this.field2469) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class151.method2776(this, 255, this.field2468, this.field2470, (byte) 0, true);
            return;
        }
        field2472.reset();
        field2472.update(arg2, 0, arg2.length);
        int var5 = (int) field2472.getValue();
        class107 var6 = new class107(Statics.method581(arg2));
        int var7 = var6.method2148();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2183();
        }
        if (this.field2470 != var5 || this.field2474 != var8) {
            class151.method2776(this, 255, this.field2468, this.field2470, (byte) 0, true);
            return;
        }
        this.method2674(arg2);
        this.method2761();
    }

    @ObfuscatedName("eh.cl(B)V")
    public void method2761() {
        this.field2471 = new boolean[this.field2444.length];
        for (int var1 = 0; var1 < this.field2471.length; var1++) {
            this.field2471[var1] = false;
        }
        if (this.field2467 == null) {
            this.field2469 = true;
            return;
        }
        this.field2475 = -1;
        for (int var2 = 0; var2 < this.field2471.length; var2++) {
            if (this.field2450[var2] > 0) {
                class121 var3 = this.field2467;
                class149 var5 = new class149();
                var5.field2481 = 1;
                var5.field2888 = (long) var2;
                var5.field2479 = var3;
                var5.field2480 = this;
                class178 var6 = class150.field2488;
                synchronized (class150.field2488) {
                    class150.field2488.method3181(var5);
                }
                class150.method550();
                this.field2475 = var2;
            }
        }
        if (this.field2475 == -1) {
            this.field2469 = true;
        }
    }

    @ObfuscatedName("eh.ch(II)I")
    public int method2758(int arg0) {
        if (this.field2444[arg0] == null) {
            return this.field2471[arg0] ? 100 : class151.method1369(this.field2468, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("eh.cw(I)I")
    public int method2759() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2444.length; var3++) {
            if (this.field2450[var3] > 0) {
                var1 += 100;
                var2 += this.method2758(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
