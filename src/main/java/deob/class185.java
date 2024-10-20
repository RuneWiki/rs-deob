package deob;

import java.util.zip.CRC32;

@ObfuscatedName("gk")
public class class185 extends class183 {

    @ObfuscatedName("gk.w")
    public class117 field2755;

    @ObfuscatedName("gk.n")
    public class117 field2743;

    @ObfuscatedName("gk.q")
    public int field2742;

    @ObfuscatedName("gk.t")
    public volatile boolean field2745 = false;

    @ObfuscatedName("gk.r")
    public boolean field2746 = false;

    @ObfuscatedName("gk.a")
    public volatile boolean[] field2747;

    @ObfuscatedName("gk.e")
    public static CRC32 field2748 = new CRC32();

    @ObfuscatedName("gk.am")
    public int field2749;

    @ObfuscatedName("gk.ag")
    public int field2750;

    @ObfuscatedName("gk.au")
    public int field2751 = -1;

    public class185(class117 arg0, class117 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2755 = arg0;
        this.field2743 = arg1;
        this.field2742 = arg2;
        this.field2746 = arg5;
        int var8 = this.field2742;
        if (Statics.field1863 == null) {
            class186.method41((class185) null, 255, 255, 0, (byte) 0, true);
            class186.field2771[var8] = this;
        } else {
            Statics.field1863.field2105 = var8 * 8 + 5;
            int var9 = Statics.field1863.method2557();
            int var10 = Statics.field1863.method2557();
            this.method3104(var9, var10);
        }
    }

    @ObfuscatedName("gk.cu(I)I")
    public int method3102() {
        if (this.field2745) {
            return 100;
        } else if (this.field2719 == null) {
            int var1 = Statics.method1104(255, this.field2742);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("gk.m(II)V")
    public void method3009(int arg0) {
        class186.method2827(this.field2742, arg0);
    }

    @ObfuscatedName("gk.j(II)V")
    public void method3065(int arg0) {
        if (this.field2755 == null || this.field2747 == null || !this.field2747[arg0]) {
            class186.method41(this, this.field2742, arg0, this.field2720[arg0], (byte) 2, true);
        } else {
            class184.method2050(arg0, this.field2755, this);
        }
    }

    @ObfuscatedName("gk.cx(III)V")
    public void method3104(int arg0, int arg1) {
        this.field2749 = arg0;
        this.field2750 = arg1;
        if (this.field2743 == null) {
            class186.method41(this, 255, this.field2742, this.field2749, (byte) 0, true);
        } else {
            class184.method2050(this.field2742, this.field2743, this);
        }
    }

    @ObfuscatedName("gk.co(I[BZZB)V")
    public void method3113(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2745) {
                throw new RuntimeException();
            }
            if (this.field2743 != null) {
                class184.method876(this.field2742, arg1, this.field2743);
            }
            this.method3010(arg1);
            this.method3106();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2716[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2716[arg0];
        if (this.field2755 != null) {
            class184.method876(arg0, arg1, this.field2755);
            this.field2747[arg0] = true;
        }
        if (arg3) {
            this.field2719[arg0] = class157.method3001(arg1, false);
        }
    }

    @ObfuscatedName("gk.cl(Ldz;I[BZB)V")
    public void method3105(class117 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2743 != arg0) {
            if (!arg3 && this.field2751 == arg1) {
                this.field2745 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2747[arg1] = false;
                if (this.field2746 || arg3) {
                    class186.method41(this, this.field2742, arg1, this.field2720[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2748.reset();
            field2748.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2748.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2720[arg1] != var9 || this.field2716[arg1] != var10) {
                this.field2747[arg1] = false;
                if (this.field2746 || arg3) {
                    class186.method41(this, this.field2742, arg1, this.field2720[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2747[arg1] = true;
            if (arg3) {
                this.field2719[arg1] = class157.method3001(arg2, false);
            }
            return;
        }
        if (this.field2745) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class186.method41(this, 255, this.field2742, this.field2749, (byte) 0, true);
            return;
        }
        field2748.reset();
        field2748.update(arg2, 0, arg2.length);
        int var5 = (int) field2748.getValue();
        class154 var6 = new class154(class183.method89(arg2));
        int var7 = var6.method2552();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2742 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2557();
        }
        if (this.field2749 != var5 || this.field2750 != var8) {
            class186.method41(this, 255, this.field2742, this.field2749, (byte) 0, true);
            return;
        }
        this.method3010(arg2);
        this.method3106();
    }

    @ObfuscatedName("gk.cb(I)V")
    public void method3106() {
        this.field2747 = new boolean[this.field2719.length];
        for (int var1 = 0; var1 < this.field2747.length; var1++) {
            this.field2747[var1] = false;
        }
        if (this.field2755 == null) {
            this.field2745 = true;
            return;
        }
        this.field2751 = -1;
        for (int var2 = 0; var2 < this.field2747.length; var2++) {
            if (this.field2722[var2] > 0) {
                class117 var3 = this.field2755;
                class181 var5 = new class181();
                var5.field2703 = 1;
                var5.field1894 = (long) var2;
                var5.field2705 = var3;
                var5.field2706 = this;
                class129 var6 = class184.field2734;
                synchronized (class184.field2734) {
                    class184.field2734.method2213(var5);
                }
                class184.method188();
                this.field2751 = var2;
            }
        }
        if (this.field2751 == -1) {
            this.field2745 = true;
        }
    }

    @ObfuscatedName("gk.ck(II)I")
    public int method3108(int arg0) {
        if (this.field2719[arg0] == null) {
            return this.field2747[arg0] ? 100 : Statics.method1104(this.field2742, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("gk.cn(S)I")
    public int method3107() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2719.length; var3++) {
            if (this.field2722[var3] > 0) {
                var1 += 100;
                var2 += this.method3108(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
