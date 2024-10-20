package deob;

import java.util.zip.CRC32;

@ObfuscatedName("iu")
public class class245 extends class243 {

    @ObfuscatedName("iu.p")
    public class162 field3301;

    @ObfuscatedName("iu.i")
    public class162 field3304;

    @ObfuscatedName("iu.l")
    public int field3297;

    @ObfuscatedName("iu.z")
    public volatile boolean field3298 = false;

    @ObfuscatedName("iu.e")
    public boolean field3295 = false;

    @ObfuscatedName("iu.v")
    public volatile boolean[] field3296;

    @ObfuscatedName("iu.w")
    public static CRC32 field3299 = new CRC32();

    @ObfuscatedName("iu.av")
    public int field3302;

    @ObfuscatedName("iu.au")
    public int field3303;

    @ObfuscatedName("iu.ae")
    public int field3300 = -1;

    public class245(class162 arg0, class162 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3301 = arg0;
        this.field3304 = arg1;
        this.field3297 = arg2;
        this.field3295 = arg5;
        int var8 = this.field3297;
        if (Statics.field474 == null) {
            class246.method1552((class245) null, 255, 255, 0, (byte) 0, true);
            class246.field3322[var8] = this;
        } else {
            Statics.field474.field2488 = var8 * 8 + 5;
            int var9 = Statics.field474.method2996();
            int var10 = Statics.field474.method2996();
            this.method3924(var9, var10);
        }
    }

    @ObfuscatedName("iu.cs(I)I")
    public int method3918() {
        if (this.field3298) {
            return 100;
        } else if (this.field3280 == null) {
            int var1 = class246.method970(255, this.field3297);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("iu.s(II)V")
    public void method3872(int arg0) {
        class246.method139(this.field3297, arg0);
    }

    @ObfuscatedName("iu.o(IB)V")
    public void method3879(int arg0) {
        if (this.field3301 == null || this.field3296 == null || !this.field3296[arg0]) {
            class246.method1552(this, this.field3297, arg0, this.field3274[arg0], (byte) 2, true);
        } else {
            class244.method454(arg0, this.field3301, this);
        }
    }

    @ObfuscatedName("iu.co(III)V")
    public void method3924(int arg0, int arg1) {
        this.field3302 = arg0;
        this.field3303 = arg1;
        if (this.field3304 == null) {
            class246.method1552(this, 255, this.field3297, this.field3302, (byte) 0, true);
        } else {
            class244.method454(this.field3297, this.field3304, this);
        }
    }

    @ObfuscatedName("iu.ci(I[BZZB)V")
    public void method3920(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field3298) {
                throw new RuntimeException();
            }
            if (this.field3304 != null) {
                class244.method947(this.field3297, arg1, this.field3304);
            }
            this.method3815(arg1);
            this.method3922();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field3275[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field3275[arg0];
        if (this.field3301 != null) {
            class244.method947(arg0, arg1, this.field3301);
            this.field3296[arg0] = true;
        }
        if (arg3) {
            this.field3280[arg0] = class184.method2915(arg1, false);
        }
    }

    @ObfuscatedName("iu.cr(Lfw;I[BZI)V")
    public void method3921(class162 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3304 != arg0) {
            if (!arg3 && this.field3300 == arg1) {
                this.field3298 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3296[arg1] = false;
                if (this.field3295 || arg3) {
                    class246.method1552(this, this.field3297, arg1, this.field3274[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3299.reset();
            field3299.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3299.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3274[arg1] != var9 || this.field3275[arg1] != var10) {
                this.field3296[arg1] = false;
                if (this.field3295 || arg3) {
                    class246.method1552(this, this.field3297, arg1, this.field3274[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3296[arg1] = true;
            if (arg3) {
                this.field3280[arg1] = class184.method2915(arg2, false);
            }
            return;
        }
        if (this.field3298) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class246.method1552(this, 255, this.field3297, this.field3302, (byte) 0, true);
            return;
        }
        field3299.reset();
        field3299.update(arg2, 0, arg2.length);
        int var5 = (int) field3299.getValue();
        class181 var6 = new class181(class243.method2163(arg2));
        int var7 = var6.method2945();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3297 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2996();
        }
        if (this.field3302 != var5 || this.field3303 != var8) {
            class246.method1552(this, 255, this.field3297, this.field3302, (byte) 0, true);
            return;
        }
        this.method3815(arg2);
        this.method3922();
    }

    @ObfuscatedName("iu.cu(I)V")
    public void method3922() {
        this.field3296 = new boolean[this.field3280.length];
        for (int var1 = 0; var1 < this.field3296.length; var1++) {
            this.field3296[var1] = false;
        }
        if (this.field3301 == null) {
            this.field3298 = true;
            return;
        }
        this.field3300 = -1;
        for (int var2 = 0; var2 < this.field3296.length; var2++) {
            if (this.field3270[var2] > 0) {
                class244.method440(var2, this.field3301, this);
                this.field3300 = var2;
            }
        }
        if (this.field3300 == -1) {
            this.field3298 = true;
        }
    }

    @ObfuscatedName("iu.t(IB)I")
    public int method3831(int arg0) {
        if (this.field3280[arg0] == null) {
            return this.field3296[arg0] ? 100 : class246.method970(this.field3297, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("iu.cl(I)I")
    public int method3923() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3280.length; var3++) {
            if (this.field3270[var3] > 0) {
                var1 += 100;
                var2 += this.method3831(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
