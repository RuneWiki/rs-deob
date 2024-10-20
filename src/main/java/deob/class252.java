package deob;

import java.util.zip.CRC32;

@ObfuscatedName("iv")
public class class252 extends class250 {

    @ObfuscatedName("iv.d")
    public class165 field3235;

    @ObfuscatedName("iv.m")
    public class165 field3226;

    @ObfuscatedName("iv.t")
    public int field3229;

    @ObfuscatedName("iv.h")
    public volatile boolean field3227 = false;

    @ObfuscatedName("iv.an")
    public boolean field3231 = false;

    @ObfuscatedName("iv.al")
    public volatile boolean[] field3232;

    @ObfuscatedName("iv.ah")
    public static CRC32 field3233 = new CRC32();

    @ObfuscatedName("iv.ad")
    public int field3234;

    @ObfuscatedName("iv.aa")
    public int field3230;

    @ObfuscatedName("iv.ag")
    public int field3236 = -1;

    public class252(class165 arg0, class165 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3235 = arg0;
        this.field3226 = arg1;
        this.field3229 = arg2;
        this.field3231 = arg5;
        class253.method1006(this, this.field3229);
    }

    @ObfuscatedName("iv.cx(I)Z")
    public boolean method4353() {
        return this.field3227;
    }

    @ObfuscatedName("iv.cc(I)I")
    public int method4354() {
        if (this.field3227) {
            return 100;
        } else if (this.field3213 == null) {
            int var1 = this.field3229;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field511 != null && Statics.field511.field2470 == var2) {
                var4 = Statics.field3771.field2374 * 99 / (Statics.field3771.field2373.length - Statics.field511.field3200) + 1;
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

    @ObfuscatedName("iv.c(II)V")
    public void method4255(int arg0) {
        class253.method2851(this.field3229, arg0);
    }

    @ObfuscatedName("iv.l(II)V")
    public void method4266(int arg0) {
        if (this.field3235 == null || this.field3232 == null || !this.field3232[arg0]) {
            class253.method446(this, this.field3229, arg0, this.field3219[arg0], (byte) 2, true);
            return;
        }
        class165 var2 = this.field3235;
        byte[] var4 = null;
        class208 var5 = class251.field3221;
        synchronized (class251.field3221) {
            for (class248 var6 = (class248) class251.field3221.method3799(); var6 != null; var6 = (class248) class251.field3221.method3780()) {
                if ((long) arg0 == var6.field2470 && var6.field3196 == var2 && var6.field3194 == 0) {
                    var4 = var6.field3195;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method3088(arg0);
            this.method4358(var2, arg0, var8, true);
        } else {
            this.method4358(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("iv.ck(IIB)V")
    public void method4359(int arg0, int arg1) {
        this.field3234 = arg0;
        this.field3230 = arg1;
        if (this.field3226 == null) {
            class253.method446(this, 255, this.field3229, this.field3234, (byte) 0, true);
            return;
        }
        int var3 = this.field3229;
        class165 var4 = this.field3226;
        byte[] var6 = null;
        class208 var7 = class251.field3221;
        synchronized (class251.field3221) {
            for (class248 var8 = (class248) class251.field3221.method3799(); var8 != null; var8 = (class248) class251.field3221.method3780()) {
                if ((long) var3 == var8.field2470 && var8.field3196 == var4 && var8.field3194 == 0) {
                    var6 = var8.field3195;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method3088(var3);
            this.method4358(var4, var3, var10, true);
        } else {
            this.method4358(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("iv.cn(I[BZZI)V")
    public void method4377(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field3227) {
                throw new RuntimeException();
            }
            if (this.field3226 != null) {
                class251.method97(this.field3229, arg1, this.field3226);
            }
            this.method4254(arg1);
            this.method4357();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field3214[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field3214[arg0];
        if (this.field3235 != null) {
            class251.method97(arg0, arg1, this.field3235);
            this.field3232[arg0] = true;
        }
        if (arg3) {
            this.field3213[arg0] = class189.method1701(arg1, false);
        }
    }

    @ObfuscatedName("iv.ce(Lfa;I[BZI)V")
    public void method4358(class165 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3226 != arg0) {
            if (!arg3 && this.field3236 == arg1) {
                this.field3227 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3232[arg1] = false;
                if (this.field3231 || arg3) {
                    class253.method446(this, this.field3229, arg1, this.field3219[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3233.reset();
            field3233.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3233.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3219[arg1] != var9 || this.field3214[arg1] != var10) {
                this.field3232[arg1] = false;
                if (this.field3231 || arg3) {
                    class253.method446(this, this.field3229, arg1, this.field3219[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3232[arg1] = true;
            if (arg3) {
                this.field3213[arg1] = class189.method1701(arg2, false);
            }
            return;
        }
        if (this.field3227) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class253.method446(this, 255, this.field3229, this.field3234, (byte) 0, true);
            return;
        }
        field3233.reset();
        field3233.update(arg2, 0, arg2.length);
        int var5 = (int) field3233.getValue();
        if (this.field3234 != var5) {
            class253.method446(this, 255, this.field3229, this.field3234, (byte) 0, true);
            return;
        }
        class185 var6 = new class185(class250.method1770(arg2));
        int var7 = var6.method3299();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3229 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method3374();
        }
        if (this.field3230 != var8) {
            class253.method446(this, 255, this.field3229, this.field3234, (byte) 0, true);
            return;
        }
        this.method4254(arg2);
        this.method4357();
    }

    @ObfuscatedName("iv.cd(I)V")
    public void method4357() {
        this.field3232 = new boolean[this.field3213.length];
        for (int var1 = 0; var1 < this.field3232.length; var1++) {
            this.field3232[var1] = false;
        }
        if (this.field3235 == null) {
            this.field3227 = true;
            return;
        }
        this.field3236 = -1;
        for (int var2 = 0; var2 < this.field3232.length; var2++) {
            if (this.field3209[var2] > 0) {
                class165 var3 = this.field3235;
                class248 var5 = new class248();
                var5.field3194 = 1;
                var5.field2470 = (long) var2;
                var5.field3196 = var3;
                var5.field3197 = this;
                class208 var6 = class251.field3221;
                synchronized (class251.field3221) {
                    class251.field3221.method3773(var5);
                }
                Object var8 = class251.field3223;
                synchronized (class251.field3223) {
                    if (class251.field3224 == 0) {
                        Statics.field3220 = new Thread(new class251());
                        Statics.field3220.setDaemon(true);
                        Statics.field3220.start();
                        Statics.field3220.setPriority(5);
                    }
                    class251.field3224 = 600;
                }
                this.field3236 = var2;
            }
        }
        if (this.field3236 == -1) {
            this.field3227 = true;
        }
    }

    @ObfuscatedName("iv.v(II)I")
    public int method4262(int arg0) {
        if (this.field3213[arg0] != null) {
            return 100;
        } else if (this.field3232[arg0]) {
            return 100;
        } else {
            int var2 = this.field3229;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field511 != null && Statics.field511.field2470 == var3) {
                var5 = Statics.field3771.field2374 * 99 / (Statics.field3771.field2373.length - Statics.field511.field3200) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("iv.du(II)Z")
    public boolean method4360(int arg0) {
        return this.field3232[arg0];
    }

    @ObfuscatedName("iv.dx(IB)Z")
    public boolean method4361(int arg0) {
        return this.method4267(arg0) != null;
    }

    @ObfuscatedName("iv.dg(I)I")
    public int method4355() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3213.length; var3++) {
            if (this.field3209[var3] > 0) {
                var1 += 100;
                var2 += this.method4262(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
