package deob;

import java.util.zip.CRC32;

@ObfuscatedName("eg")
public class class148 extends class147 {

    @ObfuscatedName("eg.l")
    public class121 field2471;

    @ObfuscatedName("eg.n")
    public class121 field2464;

    @ObfuscatedName("eg.d")
    public int field2465;

    @ObfuscatedName("eg.p")
    public volatile boolean field2466 = false;

    @ObfuscatedName("eg.z")
    public boolean field2467 = false;

    @ObfuscatedName("eg.q")
    public volatile boolean[] field2472;

    @ObfuscatedName("eg.i")
    public static CRC32 field2469 = new CRC32();

    @ObfuscatedName("eg.ah")
    public int field2470;

    @ObfuscatedName("eg.aj")
    public int field2468;

    @ObfuscatedName("eg.aq")
    public int field2463 = -1;

    public class148(class121 arg0, class121 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2471 = arg0;
        this.field2464 = arg1;
        this.field2465 = arg2;
        this.field2467 = arg5;
        class151.method2349(this, this.field2465);
    }

    @ObfuscatedName("eg.cx(I)I")
    public int method2752() {
        if (this.field2466) {
            return 100;
        } else if (this.field2450 == null) {
            int var1 = class151.method825(255, this.field2465);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("eg.s(IB)V")
    public void method2668(int arg0) {
        int var2 = this.field2465;
        long var3 = (long) ((var2 << 16) + arg0);
        class152 var5 = (class152) class151.field2499.method3171(var3);
        if (var5 != null) {
            class151.field2498.method3255(var5);
        }
    }

    @ObfuscatedName("eg.x(II)V")
    public void method2675(int arg0) {
        if (this.field2471 == null || this.field2472 == null || !this.field2472[arg0]) {
            class151.method2630(this, this.field2465, arg0, this.field2444[arg0], (byte) 2, true);
        } else {
            class150.method2502(arg0, this.field2471, this);
        }
    }

    @ObfuscatedName("eg.cc(III)V")
    public void method2751(int arg0, int arg1) {
        this.field2470 = arg0;
        this.field2468 = arg1;
        if (this.field2464 == null) {
            class151.method2630(this, 255, this.field2465, this.field2470, (byte) 0, true);
        } else {
            class150.method2502(this.field2465, this.field2464, this);
        }
    }

    @ObfuscatedName("eg.cn(I[BZZI)V")
    public void method2756(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2466) {
                throw new RuntimeException();
            }
            if (this.field2464 != null) {
                class150.method2634(this.field2465, arg1, this.field2464);
            }
            this.method2665(arg1);
            this.method2764();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2445[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2445[arg0];
        if (this.field2471 != null) {
            class150.method2634(arg0, arg1, this.field2471);
            this.field2472[arg0] = true;
        }
        if (arg3) {
            this.field2450[arg0] = class112.method1364(arg1, false);
        }
    }

    @ObfuscatedName("eg.ce(Lda;I[BZI)V")
    public void method2757(class121 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2464 != arg0) {
            if (!arg3 && this.field2463 == arg1) {
                this.field2466 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2472[arg1] = false;
                if (this.field2467 || arg3) {
                    class151.method2630(this, this.field2465, arg1, this.field2444[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2469.reset();
            field2469.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2469.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2444[arg1] != var9 || this.field2445[arg1] != var10) {
                this.field2472[arg1] = false;
                if (this.field2467 || arg3) {
                    class151.method2630(this, this.field2465, arg1, this.field2444[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2472[arg1] = true;
            if (arg3) {
                this.field2450[arg1] = class112.method1364(arg2, false);
            }
            return;
        }
        if (this.field2466) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class151.method2630(this, 255, this.field2465, this.field2470, (byte) 0, true);
            return;
        }
        field2469.reset();
        field2469.update(arg2, 0, arg2.length);
        int var5 = (int) field2469.getValue();
        class107 var6 = new class107(class147.method539(arg2));
        int var7 = var6.method2101();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2286();
        }
        if (this.field2470 != var5 || this.field2468 != var8) {
            class151.method2630(this, 255, this.field2465, this.field2470, (byte) 0, true);
            return;
        }
        this.method2665(arg2);
        this.method2764();
    }

    @ObfuscatedName("eg.ca(I)V")
    public void method2764() {
        this.field2472 = new boolean[this.field2450.length];
        for (int var1 = 0; var1 < this.field2472.length; var1++) {
            this.field2472[var1] = false;
        }
        if (this.field2471 == null) {
            this.field2466 = true;
            return;
        }
        this.field2463 = -1;
        for (int var2 = 0; var2 < this.field2472.length; var2++) {
            if (this.field2446[var2] > 0) {
                class150.method1761(var2, this.field2471, this);
                this.field2463 = var2;
            }
        }
        if (this.field2463 == -1) {
            this.field2466 = true;
        }
    }

    @ObfuscatedName("eg.cv(IB)I")
    public int method2759(int arg0) {
        if (this.field2450[arg0] == null) {
            return this.field2472[arg0] ? 100 : class151.method825(this.field2465, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("eg.cw(I)I")
    public int method2760() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2450.length; var3++) {
            if (this.field2446[var3] > 0) {
                var1 += 100;
                var2 += this.method2759(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
