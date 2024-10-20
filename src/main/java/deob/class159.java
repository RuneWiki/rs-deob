package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fo")
public class class159 extends class158 {

    @ObfuscatedName("fo.d")
    public class126 field2554;

    @ObfuscatedName("fo.b")
    public class126 field2556;

    @ObfuscatedName("fo.x")
    public int field2555;

    @ObfuscatedName("fo.n")
    public volatile boolean field2553 = false;

    @ObfuscatedName("fo.v")
    public boolean field2557 = false;

    @ObfuscatedName("fo.p")
    public volatile boolean[] field2558;

    @ObfuscatedName("fo.k")
    public static CRC32 field2559 = new CRC32();

    @ObfuscatedName("fo.ax")
    public int field2560;

    @ObfuscatedName("fo.ap")
    public int field2563;

    @ObfuscatedName("fo.ao")
    public int field2561 = -1;

    public class159(class126 arg0, class126 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2554 = arg0;
        this.field2556 = arg1;
        this.field2555 = arg2;
        this.field2557 = arg5;
        int var8 = this.field2555;
        if (Statics.field2580 == null) {
            class162.method1652((class159) null, 255, 255, 0, (byte) 0, true);
            class162.field2597[var8] = this;
        } else {
            Statics.field2580.field1834 = var8 * 8 + 5;
            int var9 = Statics.field2580.method2378();
            int var10 = Statics.field2580.method2378();
            this.method2929(var9, var10);
        }
    }

    @ObfuscatedName("fo.cf(I)I")
    public int method2918() {
        if (this.field2553) {
            return 100;
        } else if (this.field2545 == null) {
            int var1 = class162.method627(255, this.field2555);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("fo.a(II)V")
    public void method2842(int arg0) {
        int var2 = this.field2555;
        long var3 = (long) ((var2 << 16) + arg0);
        class163 var5 = (class163) class162.field2588.method3339(var3);
        if (var5 != null) {
            class162.field2587.method3422(var5);
        }
    }

    @ObfuscatedName("fo.o(II)V")
    public void method2851(int arg0) {
        if (this.field2554 == null || this.field2558 == null || !this.field2558[arg0]) {
            class162.method1652(this, this.field2555, arg0, this.field2539[arg0], (byte) 2, true);
        } else {
            class161.method2750(arg0, this.field2554, this);
        }
    }

    @ObfuscatedName("fo.ch(IIB)V")
    public void method2929(int arg0, int arg1) {
        this.field2560 = arg0;
        this.field2563 = arg1;
        if (this.field2556 == null) {
            class162.method1652(this, 255, this.field2555, this.field2560, (byte) 0, true);
        } else {
            class161.method2750(this.field2555, this.field2556, this);
        }
    }

    @ObfuscatedName("fo.cb(I[BZZI)V")
    public void method2921(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2553) {
                throw new RuntimeException();
            }
            if (this.field2556 != null) {
                class161.method2501(this.field2555, arg1, this.field2556);
            }
            this.method2846(arg1);
            this.method2923();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2549[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2549[arg0];
        if (this.field2554 != null) {
            class161.method2501(arg0, arg1, this.field2554);
            this.field2558[arg0] = true;
        }
        if (arg3) {
            this.field2545[arg0] = class117.method646(arg1, false);
        }
    }

    @ObfuscatedName("fo.cv(Ldg;I[BZB)V")
    public void method2922(class126 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2556 != arg0) {
            if (!arg3 && this.field2561 == arg1) {
                this.field2553 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2558[arg1] = false;
                if (this.field2557 || arg3) {
                    class162.method1652(this, this.field2555, arg1, this.field2539[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2559.reset();
            field2559.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2559.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2539[arg1] != var9 || this.field2549[arg1] != var10) {
                this.field2558[arg1] = false;
                if (this.field2557 || arg3) {
                    class162.method1652(this, this.field2555, arg1, this.field2539[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2558[arg1] = true;
            if (arg3) {
                this.field2545[arg1] = class117.method646(arg2, false);
            }
            return;
        }
        if (this.field2553) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class162.method1652(this, 255, this.field2555, this.field2560, (byte) 0, true);
            return;
        }
        field2559.reset();
        field2559.update(arg2, 0, arg2.length);
        int var5 = (int) field2559.getValue();
        class111 var6 = new class111(class158.method2560(arg2));
        int var7 = var6.method2176();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2555 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2378();
        }
        if (this.field2560 != var5 || this.field2563 != var8) {
            class162.method1652(this, 255, this.field2555, this.field2560, (byte) 0, true);
            return;
        }
        this.method2846(arg2);
        this.method2923();
    }

    @ObfuscatedName("fo.ci(I)V")
    public void method2923() {
        this.field2558 = new boolean[this.field2545.length];
        for (int var1 = 0; var1 < this.field2558.length; var1++) {
            this.field2558[var1] = false;
        }
        if (this.field2554 == null) {
            this.field2553 = true;
            return;
        }
        this.field2561 = -1;
        for (int var2 = 0; var2 < this.field2558.length; var2++) {
            if (this.field2541[var2] > 0) {
                class161.method2165(var2, this.field2554, this);
                this.field2561 = var2;
            }
        }
        if (this.field2561 == -1) {
            this.field2553 = true;
        }
    }

    @ObfuscatedName("fo.cg(IB)I")
    public int method2940(int arg0) {
        if (this.field2545[arg0] == null) {
            return this.field2558[arg0] ? 100 : class162.method627(this.field2555, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("fo.cd(B)I")
    public int method2925() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2545.length; var3++) {
            if (this.field2541[var3] > 0) {
                var1 += 100;
                var2 += this.method2940(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
