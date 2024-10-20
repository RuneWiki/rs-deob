package deob;

import java.util.zip.CRC32;

@ObfuscatedName("em")
public class class148 extends class147 {

    @ObfuscatedName("em.w")
    public class121 field2483;

    @ObfuscatedName("em.b")
    public class121 field2482;

    @ObfuscatedName("em.x")
    public int field2481;

    @ObfuscatedName("em.q")
    public volatile boolean field2484 = false;

    @ObfuscatedName("em.o")
    public boolean field2485 = false;

    @ObfuscatedName("em.m")
    public volatile boolean[] field2486;

    @ObfuscatedName("em.f")
    public static CRC32 field2487 = new CRC32();

    @ObfuscatedName("em.ab")
    public int field2488;

    @ObfuscatedName("em.al")
    public int field2489;

    @ObfuscatedName("em.an")
    public int field2490 = -1;

    public class148(class121 arg0, class121 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2483 = arg0;
        this.field2482 = arg1;
        this.field2481 = arg2;
        this.field2485 = arg5;
        int var8 = this.field2481;
        if (Statics.field509 == null) {
            class151.method2859((class148) null, 255, 255, 0, (byte) 0, true);
            class151.field2525[var8] = this;
        } else {
            Statics.field509.field1838 = var8 * 8 + 5;
            int var9 = Statics.field509.method2143();
            int var10 = Statics.field509.method2143();
            this.method2819(var9, var10);
        }
    }

    @ObfuscatedName("em.cs(B)I")
    public int method2817() {
        if (this.field2484) {
            return 100;
        } else if (this.field2473 == null) {
            int var1 = class151.method3077(255, this.field2481);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("em.y(II)V")
    public void method2791(int arg0) {
        class151.method2385(this.field2481, arg0);
    }

    @ObfuscatedName("em.d(II)V")
    public void method2737(int arg0) {
        if (this.field2483 == null || this.field2486 == null || !this.field2486[arg0]) {
            class151.method2859(this, this.field2481, arg0, this.field2467[arg0], (byte) 2, true);
        } else {
            class150.method2711(arg0, this.field2483, this);
        }
    }

    @ObfuscatedName("em.ca(III)V")
    public void method2819(int arg0, int arg1) {
        this.field2488 = arg0;
        this.field2489 = arg1;
        if (this.field2482 == null) {
            class151.method2859(this, 255, this.field2481, this.field2488, (byte) 0, true);
        } else {
            class150.method2711(this.field2481, this.field2482, this);
        }
    }

    @ObfuscatedName("em.cr(I[BZZI)V")
    public void method2820(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2470[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2470[arg0];
            if (this.field2483 != null) {
                class150.method603(arg0, arg1, this.field2483);
                this.field2486[arg0] = true;
            }
            if (arg3) {
                this.field2473[arg0] = class112.method1024(arg1, false);
            }
            return;
        }
        if (this.field2484) {
            throw new RuntimeException();
        }
        if (this.field2482 != null) {
            int var5 = this.field2481;
            class121 var6 = this.field2482;
            class149 var7 = new class149();
            var7.field2495 = 0;
            var7.field2879 = (long) var5;
            var7.field2492 = arg1;
            var7.field2493 = var6;
            class178 var8 = class150.field2504;
            synchronized (class150.field2504) {
                class150.field2504.method3271(var7);
            }
            Object var10 = class150.field2500;
            synchronized (class150.field2500) {
                if (class150.field2501 == 0) {
                    Statics.field1752.method2481(new class150(), 5);
                }
                class150.field2501 = 600;
            }
        }
        this.method2775(arg1);
        this.method2829();
    }

    @ObfuscatedName("em.cl(Ldt;I[BZI)V")
    public void method2825(class121 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2482 != arg0) {
            if (!arg3 && this.field2490 == arg1) {
                this.field2484 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2486[arg1] = false;
                if (this.field2485 || arg3) {
                    class151.method2859(this, this.field2481, arg1, this.field2467[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2487.reset();
            field2487.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2487.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2467[arg1] != var9 || this.field2470[arg1] != var10) {
                this.field2486[arg1] = false;
                if (this.field2485 || arg3) {
                    class151.method2859(this, this.field2481, arg1, this.field2467[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2486[arg1] = true;
            if (arg3) {
                this.field2473[arg1] = class112.method1024(arg2, false);
            }
            return;
        }
        if (this.field2484) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class151.method2859(this, 255, this.field2481, this.field2488, (byte) 0, true);
            return;
        }
        field2487.reset();
        field2487.update(arg2, 0, arg2.length);
        int var5 = (int) field2487.getValue();
        class107 var6 = new class107(class147.method2530(arg2));
        int var7 = var6.method2138();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2143();
        }
        if (this.field2488 != var5 || this.field2489 != var8) {
            class151.method2859(this, 255, this.field2481, this.field2488, (byte) 0, true);
            return;
        }
        this.method2775(arg2);
        this.method2829();
    }

    @ObfuscatedName("em.cy(B)V")
    public void method2829() {
        this.field2486 = new boolean[this.field2473.length];
        for (int var1 = 0; var1 < this.field2486.length; var1++) {
            this.field2486[var1] = false;
        }
        if (this.field2483 == null) {
            this.field2484 = true;
            return;
        }
        this.field2490 = -1;
        for (int var2 = 0; var2 < this.field2486.length; var2++) {
            if (this.field2469[var2] > 0) {
                class150.method2432(var2, this.field2483, this);
                this.field2490 = var2;
            }
        }
        if (this.field2490 == -1) {
            this.field2484 = true;
        }
    }

    @ObfuscatedName("em.ci(II)I")
    public int method2823(int arg0) {
        if (this.field2473[arg0] == null) {
            return this.field2486[arg0] ? 100 : class151.method3077(this.field2481, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("em.co(B)I")
    public int method2818() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2473.length; var3++) {
            if (this.field2469[var3] > 0) {
                var1 += 100;
                var2 += this.method2823(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
