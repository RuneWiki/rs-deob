package deob;

import java.util.zip.CRC32;

@ObfuscatedName("gp")
public class class185 extends class183 {

    @ObfuscatedName("gp.x")
    public class117 field2756;

    @ObfuscatedName("gp.g")
    public class117 field2762;

    @ObfuscatedName("gp.b")
    public int field2752;

    @ObfuscatedName("gp.k")
    public volatile boolean field2753 = false;

    @ObfuscatedName("gp.t")
    public boolean field2754 = false;

    @ObfuscatedName("gp.c")
    public volatile boolean[] field2751;

    @ObfuscatedName("gp.e")
    public static CRC32 field2760 = new CRC32();

    @ObfuscatedName("gp.am")
    public int field2757;

    @ObfuscatedName("gp.an")
    public int field2758;

    @ObfuscatedName("gp.aq")
    public int field2759 = -1;

    public class185(class117 arg0, class117 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2756 = arg0;
        this.field2762 = arg1;
        this.field2752 = arg2;
        this.field2754 = arg5;
        class186.method3100(this, this.field2752);
    }

    @ObfuscatedName("gp.bp(I)I")
    public int method3202() {
        if (this.field2753) {
            return 100;
        } else if (this.field2735 == null) {
            int var1 = this.field2752;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field15 != null && Statics.field15.field1905 == var2) {
                var4 = Statics.field2776.field2111 * 99 / (Statics.field2776.field2114.length - Statics.field15.field2722) + 1;
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

    @ObfuscatedName("gp.i(IB)V")
    public void method3116(int arg0) {
        class186.method1881(this.field2752, arg0);
    }

    @ObfuscatedName("gp.s(II)V")
    public void method3125(int arg0) {
        if (this.field2756 == null || this.field2751 == null || !this.field2751[arg0]) {
            class186.method3620(this, this.field2752, arg0, this.field2725[arg0], (byte) 2, true);
        } else {
            class184.method3094(arg0, this.field2756, this);
        }
    }

    @ObfuscatedName("gp.bn(IIB)V")
    public void method3199(int arg0, int arg1) {
        this.field2757 = arg0;
        this.field2758 = arg1;
        if (this.field2762 == null) {
            class186.method3620(this, 255, this.field2752, this.field2757, (byte) 0, true);
        } else {
            class184.method3094(this.field2752, this.field2762, this);
        }
    }

    @ObfuscatedName("gp.cl(I[BZZI)V")
    public void method3224(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2727[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2727[arg0];
            if (this.field2756 != null) {
                class117 var12 = this.field2756;
                class181 var13 = new class181();
                var13.field2720 = 0;
                var13.field1905 = (long) arg0;
                var13.field2716 = arg1;
                var13.field2717 = var12;
                class129 var14 = class184.field2747;
                synchronized (class184.field2747) {
                    class184.field2747.method2296(var13);
                }
                Object var16 = class184.field2749;
                synchronized (class184.field2749) {
                    if (class184.field2748 == 0) {
                        Statics.field1756.method1885(new class184(), 5);
                    }
                    class184.field2748 = 600;
                }
                this.field2751[arg0] = true;
            }
            if (arg3) {
                this.field2735[arg0] = class157.method426(arg1, false);
            }
            return;
        }
        if (this.field2753) {
            throw new RuntimeException();
        }
        if (this.field2762 != null) {
            int var5 = this.field2752;
            class117 var6 = this.field2762;
            class181 var7 = new class181();
            var7.field2720 = 0;
            var7.field1905 = (long) var5;
            var7.field2716 = arg1;
            var7.field2717 = var6;
            class129 var8 = class184.field2747;
            synchronized (class184.field2747) {
                class184.field2747.method2296(var7);
            }
            Object var10 = class184.field2749;
            synchronized (class184.field2749) {
                if (class184.field2748 == 0) {
                    Statics.field1756.method1885(new class184(), 5);
                }
                class184.field2748 = 600;
            }
        }
        this.method3172(arg1);
        this.method3221();
    }

    @ObfuscatedName("gp.cs(Ldb;I[BZI)V")
    public void method3203(class117 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2762 != arg0) {
            if (!arg3 && this.field2759 == arg1) {
                this.field2753 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2751[arg1] = false;
                if (this.field2754 || arg3) {
                    class186.method3620(this, this.field2752, arg1, this.field2725[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2760.reset();
            field2760.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2760.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2725[arg1] != var9 || this.field2727[arg1] != var10) {
                this.field2751[arg1] = false;
                if (this.field2754 || arg3) {
                    class186.method3620(this, this.field2752, arg1, this.field2725[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2751[arg1] = true;
            if (arg3) {
                this.field2735[arg1] = class157.method426(arg2, false);
            }
            return;
        }
        if (this.field2753) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class186.method3620(this, 255, this.field2752, this.field2757, (byte) 0, true);
            return;
        }
        field2760.reset();
        field2760.update(arg2, 0, arg2.length);
        int var5 = (int) field2760.getValue();
        class154 var6 = new class154(class183.method905(arg2));
        int var7 = var6.method2666();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2752 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2695();
        }
        if (this.field2757 != var5 || this.field2758 != var8) {
            class186.method3620(this, 255, this.field2752, this.field2757, (byte) 0, true);
            return;
        }
        this.method3172(arg2);
        this.method3221();
    }

    @ObfuscatedName("gp.cx(B)V")
    public void method3221() {
        this.field2751 = new boolean[this.field2735.length];
        for (int var1 = 0; var1 < this.field2751.length; var1++) {
            this.field2751[var1] = false;
        }
        if (this.field2756 == null) {
            this.field2753 = true;
            return;
        }
        this.field2759 = -1;
        for (int var2 = 0; var2 < this.field2751.length; var2++) {
            if (this.field2731[var2] > 0) {
                class117 var3 = this.field2756;
                class181 var5 = new class181();
                var5.field2720 = 1;
                var5.field1905 = (long) var2;
                var5.field2717 = var3;
                var5.field2715 = this;
                class129 var6 = class184.field2747;
                synchronized (class184.field2747) {
                    class184.field2747.method2296(var5);
                }
                Object var8 = class184.field2749;
                synchronized (class184.field2749) {
                    if (class184.field2748 == 0) {
                        Statics.field1756.method1885(new class184(), 5);
                    }
                    class184.field2748 = 600;
                }
                this.field2759 = var2;
            }
        }
        if (this.field2759 == -1) {
            this.field2753 = true;
        }
    }

    @ObfuscatedName("gp.cv(II)I")
    public int method3200(int arg0) {
        if (this.field2735[arg0] != null) {
            return 100;
        } else if (this.field2751[arg0]) {
            return 100;
        } else {
            int var2 = this.field2752;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field15 != null && Statics.field15.field1905 == var3) {
                var5 = Statics.field2776.field2111 * 99 / (Statics.field2776.field2114.length - Statics.field15.field2722) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("gp.ce(I)I")
    public int method3201() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2735.length; var3++) {
            if (this.field2731[var3] > 0) {
                var1 += 100;
                var2 += this.method3200(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
