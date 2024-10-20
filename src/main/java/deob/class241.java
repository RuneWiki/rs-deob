package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ir")
public class class241 extends class239 {

    @ObfuscatedName("ir.i")
    public class163 field3260;

    @ObfuscatedName("ir.g")
    public class163 field3257;

    @ObfuscatedName("ir.a")
    public int field3264;

    @ObfuscatedName("ir.x")
    public volatile boolean field3259 = false;

    @ObfuscatedName("ir.b")
    public boolean field3265 = false;

    @ObfuscatedName("ir.j")
    public volatile boolean[] field3261;

    @ObfuscatedName("ir.v")
    public static CRC32 field3262 = new CRC32();

    @ObfuscatedName("ir.ap")
    public int field3263;

    @ObfuscatedName("ir.ar")
    public int field3256;

    @ObfuscatedName("ir.am")
    public int field3258 = -1;

    public class241(class163 arg0, class163 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3260 = arg0;
        this.field3257 = arg1;
        this.field3264 = arg2;
        this.field3265 = arg5;
        class242.method967(this, this.field3264);
    }

    @ObfuscatedName("ir.cb(I)I")
    public int method3966() {
        if (this.field3259) {
            return 100;
        } else if (this.field3243 == null) {
            int var1 = class242.method49(255, this.field3264);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ir.c(II)V")
    public void method3839(int arg0) {
        int var2 = this.field3264;
        long var3 = (long) ((var2 << 16) + arg0);
        class238 var5 = (class238) class242.field3274.method3339(var3);
        if (var5 != null) {
            class242.field3281.method3269(var5);
        }
    }

    @ObfuscatedName("ir.u(IB)V")
    public void method3849(int arg0) {
        if (this.field3260 == null || this.field3261 == null || !this.field3261[arg0]) {
            class242.method2891(this, this.field3264, arg0, this.field3233[arg0], (byte) 2, true);
            return;
        }
        class163 var2 = this.field3260;
        byte[] var4 = null;
        class197 var5 = class240.field3253;
        synchronized (class240.field3253) {
            for (class237 var6 = (class237) class240.field3253.method3389(); var6 != null; var6 = (class237) class240.field3253.method3385()) {
                if ((long) arg0 == var6.field2487 && var6.field3220 == var2 && var6.field3222 == 0) {
                    var4 = var6.field3223;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2824(arg0);
            this.method3946(var2, arg0, var8, true);
        } else {
            this.method3946(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ir.ck(III)V")
    public void method3944(int arg0, int arg1) {
        this.field3263 = arg0;
        this.field3256 = arg1;
        if (this.field3257 == null) {
            class242.method2891(this, 255, this.field3264, this.field3263, (byte) 0, true);
            return;
        }
        int var3 = this.field3264;
        class163 var4 = this.field3257;
        byte[] var6 = null;
        class197 var7 = class240.field3253;
        synchronized (class240.field3253) {
            for (class237 var8 = (class237) class240.field3253.method3389(); var8 != null; var8 = (class237) class240.field3253.method3385()) {
                if ((long) var3 == var8.field2487 && var8.field3220 == var4 && var8.field3222 == 0) {
                    var6 = var8.field3223;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2824(var3);
            this.method3946(var4, var3, var10, true);
        } else {
            this.method3946(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ir.cx(I[BZZB)V")
    public void method3945(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field3259) {
                throw new RuntimeException();
            }
            if (this.field3257 != null) {
                class240.method1957(this.field3264, arg1, this.field3257);
            }
            this.method3838(arg1);
            this.method3943();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field3238[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field3238[arg0];
        if (this.field3260 != null) {
            class240.method1957(arg0, arg1, this.field3260);
            this.field3261[arg0] = true;
        }
        if (arg3) {
            this.field3243[arg0] = class180.method73(arg1, false);
        }
    }

    @ObfuscatedName("ir.ce(Lfe;I[BZI)V")
    public void method3946(class163 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3257 != arg0) {
            if (!arg3 && this.field3258 == arg1) {
                this.field3259 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3261[arg1] = false;
                if (this.field3265 || arg3) {
                    class242.method2891(this, this.field3264, arg1, this.field3233[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3262.reset();
            field3262.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3262.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3233[arg1] != var9 || this.field3238[arg1] != var10) {
                this.field3261[arg1] = false;
                if (this.field3265 || arg3) {
                    class242.method2891(this, this.field3264, arg1, this.field3233[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3261[arg1] = true;
            if (arg3) {
                this.field3243[arg1] = class180.method73(arg2, false);
            }
            return;
        }
        if (this.field3259) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class242.method2891(this, 255, this.field3264, this.field3263, (byte) 0, true);
            return;
        }
        field3262.reset();
        field3262.update(arg2, 0, arg2.length);
        int var5 = (int) field3262.getValue();
        class177 var6 = new class177(class239.method2705(arg2));
        int var7 = var6.method2965();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3264 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2970();
        }
        if (this.field3263 != var5 || this.field3256 != var8) {
            class242.method2891(this, 255, this.field3264, this.field3263, (byte) 0, true);
            return;
        }
        this.method3838(arg2);
        this.method3943();
    }

    @ObfuscatedName("ir.cm(I)V")
    public void method3943() {
        this.field3261 = new boolean[this.field3243.length];
        for (int var1 = 0; var1 < this.field3261.length; var1++) {
            this.field3261[var1] = false;
        }
        if (this.field3260 == null) {
            this.field3259 = true;
            return;
        }
        this.field3258 = -1;
        for (int var2 = 0; var2 < this.field3261.length; var2++) {
            if (this.field3239[var2] > 0) {
                class240.method147(var2, this.field3260, this);
                this.field3258 = var2;
            }
        }
        if (this.field3258 == -1) {
            this.field3259 = true;
        }
    }

    @ObfuscatedName("ir.d(II)I")
    public int method3845(int arg0) {
        if (this.field3243[arg0] == null) {
            return this.field3261[arg0] ? 100 : class242.method49(this.field3264, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ir.cp(B)I")
    public int method3948() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3243.length; var3++) {
            if (this.field3239[var3] > 0) {
                var1 += 100;
                var2 += this.method3845(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
