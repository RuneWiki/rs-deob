package deob;

import java.util.zip.CRC32;

@ObfuscatedName("eb")
public class class148 extends class147 {

    @ObfuscatedName("eb.n")
    public class121 field2505;

    @ObfuscatedName("eb.v")
    public class121 field2495;

    @ObfuscatedName("eb.f")
    public int field2496;

    @ObfuscatedName("eb.a")
    public volatile boolean field2497 = false;

    @ObfuscatedName("eb.p")
    public boolean field2498 = false;

    @ObfuscatedName("eb.s")
    public volatile boolean[] field2499;

    @ObfuscatedName("eb.c")
    public static CRC32 field2494 = new CRC32();

    @ObfuscatedName("eb.ar")
    public int field2501;

    @ObfuscatedName("eb.ac")
    public int field2502;

    @ObfuscatedName("eb.ah")
    public int field2500 = -1;

    public class148(class121 arg0, class121 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2505 = arg0;
        this.field2495 = arg1;
        this.field2496 = arg2;
        this.field2498 = arg5;
        int var8 = this.field2496;
        if (Statics.field1995 == null) {
            class151.method730((class148) null, 255, 255, 0, (byte) 0, true);
            class151.field2533[var8] = this;
        } else {
            Statics.field1995.field1844 = var8 * 8 + 5;
            int var9 = Statics.field1995.method2112();
            int var10 = Statics.field1995.method2112();
            this.method2771(var9, var10);
        }
    }

    @ObfuscatedName("eb.ca(I)I")
    public int method2764() {
        if (this.field2497) {
            return 100;
        } else if (this.field2486 == null) {
            int var1 = class151.method2372(255, this.field2496);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("eb.i(IB)V")
    public void method2683(int arg0) {
        class151.method2395(this.field2496, arg0);
    }

    @ObfuscatedName("eb.b(II)V")
    public void method2692(int arg0) {
        if (this.field2505 == null || this.field2499 == null || !this.field2499[arg0]) {
            class151.method730(this, this.field2496, arg0, this.field2492[arg0], (byte) 2, true);
        } else {
            class150.method620(arg0, this.field2505, this);
        }
    }

    @ObfuscatedName("eb.cd(III)V")
    public void method2771(int arg0, int arg1) {
        this.field2501 = arg0;
        this.field2502 = arg1;
        if (this.field2495 == null) {
            class151.method730(this, 255, this.field2496, this.field2501, (byte) 0, true);
        } else {
            class150.method620(this.field2496, this.field2495, this);
        }
    }

    @ObfuscatedName("eb.cx(I[BZZI)V")
    public void method2767(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2497) {
                throw new RuntimeException();
            }
            if (this.field2495 != null) {
                class150.method168(this.field2496, arg1, this.field2495);
            }
            this.method2682(arg1);
            this.method2769();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2481[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2481[arg0];
        if (this.field2505 != null) {
            class150.method168(arg0, arg1, this.field2505);
            this.field2499[arg0] = true;
        }
        if (arg3) {
            this.field2486[arg0] = class112.method508(arg1, false);
        }
    }

    @ObfuscatedName("eb.cg(Ldt;I[BZI)V")
    public void method2768(class121 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2495 != arg0) {
            if (!arg3 && this.field2500 == arg1) {
                this.field2497 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2499[arg1] = false;
                if (this.field2498 || arg3) {
                    class151.method730(this, this.field2496, arg1, this.field2492[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2494.reset();
            field2494.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2494.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2492[arg1] != var9 || this.field2481[arg1] != var10) {
                this.field2499[arg1] = false;
                if (this.field2498 || arg3) {
                    class151.method730(this, this.field2496, arg1, this.field2492[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2499[arg1] = true;
            if (arg3) {
                this.field2486[arg1] = class112.method508(arg2, false);
            }
            return;
        }
        if (this.field2497) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class151.method730(this, 255, this.field2496, this.field2501, (byte) 0, true);
            return;
        }
        field2494.reset();
        field2494.update(arg2, 0, arg2.length);
        int var5 = (int) field2494.getValue();
        class107 var6 = new class107(class147.method756(arg2));
        int var7 = var6.method2092();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2112();
        }
        if (this.field2501 != var5 || this.field2502 != var8) {
            class151.method730(this, 255, this.field2496, this.field2501, (byte) 0, true);
            return;
        }
        this.method2682(arg2);
        this.method2769();
    }

    @ObfuscatedName("eb.cv(B)V")
    public void method2769() {
        this.field2499 = new boolean[this.field2486.length];
        for (int var1 = 0; var1 < this.field2499.length; var1++) {
            this.field2499[var1] = false;
        }
        if (this.field2505 == null) {
            this.field2497 = true;
            return;
        }
        this.field2500 = -1;
        for (int var2 = 0; var2 < this.field2499.length; var2++) {
            if (this.field2476[var2] > 0) {
                class150.method1936(var2, this.field2505, this);
                this.field2500 = var2;
            }
        }
        if (this.field2500 == -1) {
            this.field2497 = true;
        }
    }

    @ObfuscatedName("eb.cy(II)I")
    public int method2770(int arg0) {
        if (this.field2486[arg0] == null) {
            return this.field2499[arg0] ? 100 : class151.method2372(this.field2496, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("eb.cp(I)I")
    public int method2785() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2486.length; var3++) {
            if (this.field2476[var3] > 0) {
                var1 += 100;
                var2 += this.method2770(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
