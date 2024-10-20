package deob;

import java.util.zip.CRC32;

@ObfuscatedName("if")
public class class249 extends class247 {

    @ObfuscatedName("if.x")
    public class165 field3344;

    @ObfuscatedName("if.l")
    public class165 field3334;

    @ObfuscatedName("if.j")
    public int field3336;

    @ObfuscatedName("if.g")
    public volatile boolean field3337 = false;

    @ObfuscatedName("if.c")
    public boolean field3335 = false;

    @ObfuscatedName("if.k")
    public volatile boolean[] field3339;

    @ObfuscatedName("if.q")
    public static CRC32 field3340 = new CRC32();

    @ObfuscatedName("if.ac")
    public int field3338;

    @ObfuscatedName("if.aw")
    public int field3342;

    @ObfuscatedName("if.at")
    public int field3343 = -1;

    public class249(class165 arg0, class165 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3344 = arg0;
        this.field3334 = arg1;
        this.field3336 = arg2;
        this.field3335 = arg5;
        class250.method2517(this, this.field3336);
    }

    @ObfuscatedName("if.cg(B)I")
    public int method4036() {
        if (this.field3337) {
            return 100;
        } else if (this.field3312 == null) {
            int var1 = class250.method157(255, this.field3336);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("if.v(IB)V")
    public void method3948(int arg0) {
        int var2 = this.field3336;
        long var3 = (long) ((var2 << 16) + arg0);
        class246 var5 = (class246) class250.field3353.method3416(var3);
        if (var5 != null) {
            class250.field3352.method3360(var5);
        }
    }

    @ObfuscatedName("if.o(IB)V")
    public void method3926(int arg0) {
        if (this.field3344 == null || this.field3339 == null || !this.field3339[arg0]) {
            class250.method705(this, this.field3336, arg0, this.field3323[arg0], (byte) 2, true);
        } else {
            class248.method2871(arg0, this.field3344, this);
        }
    }

    @ObfuscatedName("if.ca(III)V")
    public void method4031(int arg0, int arg1) {
        this.field3338 = arg0;
        this.field3342 = arg1;
        if (this.field3334 == null) {
            class250.method705(this, 255, this.field3336, this.field3338, (byte) 0, true);
        } else {
            class248.method2871(this.field3336, this.field3334, this);
        }
    }

    @ObfuscatedName("if.cw(I[BZZB)V")
    public void method4027(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field3337) {
                throw new RuntimeException();
            }
            if (this.field3334 != null) {
                class248.method2931(this.field3336, arg1, this.field3334);
            }
            this.method3914(arg1);
            this.method4029();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field3313[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field3313[arg0];
        if (this.field3344 != null) {
            class248.method2931(arg0, arg1, this.field3344);
            this.field3339[arg0] = true;
        }
        if (arg3) {
            this.field3312[arg0] = class188.method1074(arg1, false);
        }
    }

    @ObfuscatedName("if.co(Lfv;I[BZI)V")
    public void method4028(class165 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3334 != arg0) {
            if (!arg3 && this.field3343 == arg1) {
                this.field3337 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3339[arg1] = false;
                if (this.field3335 || arg3) {
                    class250.method705(this, this.field3336, arg1, this.field3323[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3340.reset();
            field3340.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3340.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3323[arg1] != var9 || this.field3313[arg1] != var10) {
                this.field3339[arg1] = false;
                if (this.field3335 || arg3) {
                    class250.method705(this, this.field3336, arg1, this.field3323[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3339[arg1] = true;
            if (arg3) {
                this.field3312[arg1] = class188.method1074(arg2, false);
            }
            return;
        }
        if (this.field3337) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class250.method705(this, 255, this.field3336, this.field3338, (byte) 0, true);
            return;
        }
        field3340.reset();
        field3340.update(arg2, 0, arg2.length);
        int var5 = (int) field3340.getValue();
        if (this.field3338 != var5) {
            class250.method705(this, 255, this.field3336, this.field3338, (byte) 0, true);
            return;
        }
        class185 var6 = new class185(class247.method2166(arg2));
        int var7 = var6.method3021();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3336 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method3026();
        }
        if (this.field3342 != var8) {
            class250.method705(this, 255, this.field3336, this.field3338, (byte) 0, true);
            return;
        }
        this.method3914(arg2);
        this.method4029();
    }

    @ObfuscatedName("if.dq(B)V")
    public void method4029() {
        this.field3339 = new boolean[this.field3312.length];
        for (int var1 = 0; var1 < this.field3339.length; var1++) {
            this.field3339[var1] = false;
        }
        if (this.field3344 == null) {
            this.field3337 = true;
            return;
        }
        this.field3343 = -1;
        for (int var2 = 0; var2 < this.field3339.length; var2++) {
            if (this.field3314[var2] > 0) {
                class248.method2859(var2, this.field3344, this);
                this.field3343 = var2;
            }
        }
        if (this.field3343 == -1) {
            this.field3337 = true;
        }
    }

    @ObfuscatedName("if.e(II)I")
    public int method3922(int arg0) {
        if (this.field3312[arg0] == null) {
            return this.field3339[arg0] ? 100 : class250.method157(this.field3336, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("if.dj(I)I")
    public int method4030() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3312.length; var3++) {
            if (this.field3314[var3] > 0) {
                var1 += 100;
                var2 += this.method3922(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
