package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fz")
public class class168 extends class167 {

    @ObfuscatedName("fz.e")
    public class134 field2678;

    @ObfuscatedName("fz.m")
    public class134 field2673;

    @ObfuscatedName("fz.s")
    public int field2677;

    @ObfuscatedName("fz.x")
    public volatile boolean field2675 = false;

    @ObfuscatedName("fz.y")
    public boolean field2676 = false;

    @ObfuscatedName("fz.w")
    public volatile boolean[] field2681;

    @ObfuscatedName("fz.o")
    public static CRC32 field2672 = new CRC32();

    @ObfuscatedName("fz.aw")
    public int field2679;

    @ObfuscatedName("fz.an")
    public int field2680;

    @ObfuscatedName("fz.ab")
    public int field2674 = -1;

    public class168(class134 arg0, class134 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2678 = arg0;
        this.field2673 = arg1;
        this.field2677 = arg2;
        this.field2676 = arg5;
        int var8 = this.field2677;
        if (Statics.field1962 == null) {
            class171.method568((class168) null, 255, 255, 0, (byte) 0, true);
            class171.field2715[var8] = this;
        } else {
            Statics.field1962.field1986 = var8 * 8 + 5;
            int var9 = Statics.field1962.method2306();
            int var10 = Statics.field1962.method2306();
            this.method3070(var9, var10);
        }
    }

    @ObfuscatedName("fz.ci(B)I")
    public int method3069() {
        if (this.field2675) {
            return 100;
        } else if (this.field2663 == null) {
            int var1 = class171.method119(255, this.field2677);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("fz.q(II)V")
    public void method2985(int arg0) {
        class171.method2899(this.field2677, arg0);
    }

    @ObfuscatedName("fz.j(II)V")
    public void method2994(int arg0) {
        if (this.field2678 == null || this.field2681 == null || !this.field2681[arg0]) {
            class171.method568(this, this.field2677, arg0, this.field2657[arg0], (byte) 2, true);
        } else {
            class170.method217(arg0, this.field2678, this);
        }
    }

    @ObfuscatedName("fz.cm(III)V")
    public void method3070(int arg0, int arg1) {
        this.field2679 = arg0;
        this.field2680 = arg1;
        if (this.field2673 == null) {
            class171.method568(this, 255, this.field2677, this.field2679, (byte) 0, true);
        } else {
            class170.method217(this.field2677, this.field2673, this);
        }
    }

    @ObfuscatedName("fz.cd(I[BZZI)V")
    public void method3077(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2675) {
                throw new RuntimeException();
            }
            if (this.field2673 != null) {
                class170.method1987(this.field2677, arg1, this.field2673);
            }
            this.method2984(arg1);
            this.method3073();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2668[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2668[arg0];
        if (this.field2678 != null) {
            class170.method1987(arg0, arg1, this.field2678);
            this.field2681[arg0] = true;
        }
        if (arg3) {
            this.field2663[arg0] = class125.method2582(arg1, false);
        }
    }

    @ObfuscatedName("fz.cu(Lea;I[BZI)V")
    public void method3072(class134 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2673 != arg0) {
            if (!arg3 && this.field2674 == arg1) {
                this.field2675 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2681[arg1] = false;
                if (this.field2676 || arg3) {
                    class171.method568(this, this.field2677, arg1, this.field2657[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2672.reset();
            field2672.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2672.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2657[arg1] != var9 || this.field2668[arg1] != var10) {
                this.field2681[arg1] = false;
                if (this.field2676 || arg3) {
                    class171.method568(this, this.field2677, arg1, this.field2657[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2681[arg1] = true;
            if (arg3) {
                this.field2663[arg1] = class125.method2582(arg2, false);
            }
            return;
        }
        if (this.field2675) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class171.method568(this, 255, this.field2677, this.field2679, (byte) 0, true);
            return;
        }
        field2672.reset();
        field2672.update(arg2, 0, arg2.length);
        int var5 = (int) field2672.getValue();
        class119 var6 = new class119(class167.method2241(arg2));
        int var7 = var6.method2457();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2677 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2306();
        }
        if (this.field2679 != var5 || this.field2680 != var8) {
            class171.method568(this, 255, this.field2677, this.field2679, (byte) 0, true);
            return;
        }
        this.method2984(arg2);
        this.method3073();
    }

    @ObfuscatedName("fz.co(I)V")
    public void method3073() {
        this.field2681 = new boolean[this.field2663.length];
        for (int var1 = 0; var1 < this.field2681.length; var1++) {
            this.field2681[var1] = false;
        }
        if (this.field2678 == null) {
            this.field2675 = true;
            return;
        }
        this.field2674 = -1;
        for (int var2 = 0; var2 < this.field2681.length; var2++) {
            if (this.field2659[var2] > 0) {
                class170.method927(var2, this.field2678, this);
                this.field2674 = var2;
            }
        }
        if (this.field2674 == -1) {
            this.field2675 = true;
        }
    }

    @ObfuscatedName("fz.ce(II)I")
    public int method3074(int arg0) {
        if (this.field2663[arg0] == null) {
            return this.field2681[arg0] ? 100 : class171.method119(this.field2677, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("fz.cy(I)I")
    public int method3075() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2663.length; var3++) {
            if (this.field2659[var3] > 0) {
                var1 += 100;
                var2 += this.method3074(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
