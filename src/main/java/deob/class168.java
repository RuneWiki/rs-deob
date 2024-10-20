package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fb")
public class class168 extends class167 {

    @ObfuscatedName("fb.z")
    public class134 field2677;

    @ObfuscatedName("fb.r")
    public class134 field2674;

    @ObfuscatedName("fb.d")
    public int field2672;

    @ObfuscatedName("fb.n")
    public volatile boolean field2675 = false;

    @ObfuscatedName("fb.j")
    public boolean field2673 = false;

    @ObfuscatedName("fb.b")
    public volatile boolean[] field2679;

    @ObfuscatedName("fb.e")
    public static CRC32 field2678 = new CRC32();

    @ObfuscatedName("fb.ai")
    public int field2676;

    @ObfuscatedName("fb.ao")
    public int field2680;

    @ObfuscatedName("fb.af")
    public int field2681 = -1;

    public class168(class134 arg0, class134 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2677 = arg0;
        this.field2674 = arg1;
        this.field2672 = arg2;
        this.field2673 = arg5;
        int var8 = this.field2672;
        if (Statics.field223 == null) {
            class171.method616((class168) null, 255, 255, 0, (byte) 0, true);
            class171.field2716[var8] = this;
        } else {
            Statics.field223.field1988 = var8 * 8 + 5;
            int var9 = Statics.field223.method2324();
            int var10 = Statics.field223.method2324();
            this.method3084(var9, var10);
        }
    }

    @ObfuscatedName("fb.cg(B)I")
    public int method3083() {
        if (this.field2675) {
            return 100;
        } else if (this.field2657 == null) {
            int var1 = this.field2672;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2648 != null && Statics.field2648.field3100 == var2) {
                var4 = Statics.field150.field1988 * 99 / (Statics.field150.field1989.length - Statics.field2648.field2724) + 1;
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

    @ObfuscatedName("fb.m(II)V")
    public void method3006(int arg0) {
        class171.method2749(this.field2672, arg0);
    }

    @ObfuscatedName("fb.v(IB)V")
    public void method3046(int arg0) {
        if (this.field2677 == null || this.field2679 == null || !this.field2679[arg0]) {
            class171.method616(this, this.field2672, arg0, this.field2659[arg0], (byte) 2, true);
        } else {
            class170.method2791(arg0, this.field2677, this);
        }
    }

    @ObfuscatedName("fb.cm(IIB)V")
    public void method3084(int arg0, int arg1) {
        this.field2676 = arg0;
        this.field2680 = arg1;
        if (this.field2674 == null) {
            class171.method616(this, 255, this.field2672, this.field2676, (byte) 0, true);
        } else {
            class170.method2791(this.field2672, this.field2674, this);
        }
    }

    @ObfuscatedName("fb.cn(I[BZZI)V")
    public void method3085(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2675) {
                throw new RuntimeException();
            }
            if (this.field2674 != null) {
                class170.method2654(this.field2672, arg1, this.field2674);
            }
            this.method3005(arg1);
            this.method3092();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2658[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2658[arg0];
        if (this.field2677 != null) {
            class170.method2654(arg0, arg1, this.field2677);
            this.field2679[arg0] = true;
        }
        if (arg3) {
            this.field2657[arg0] = class125.method617(arg1, false);
        }
    }

    @ObfuscatedName("fb.cb(Lel;I[BZI)V")
    public void method3086(class134 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2674 != arg0) {
            if (!arg3 && this.field2681 == arg1) {
                this.field2675 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2679[arg1] = false;
                if (this.field2673 || arg3) {
                    class171.method616(this, this.field2672, arg1, this.field2659[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2678.reset();
            field2678.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2678.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2659[arg1] != var9 || this.field2658[arg1] != var10) {
                this.field2679[arg1] = false;
                if (this.field2673 || arg3) {
                    class171.method616(this, this.field2672, arg1, this.field2659[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2679[arg1] = true;
            if (arg3) {
                this.field2657[arg1] = class125.method617(arg2, false);
            }
            return;
        }
        if (this.field2675) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class171.method616(this, 255, this.field2672, this.field2676, (byte) 0, true);
            return;
        }
        field2678.reset();
        field2678.update(arg2, 0, arg2.length);
        int var5 = (int) field2678.getValue();
        class119 var6 = new class119(class167.method5(arg2));
        int var7 = var6.method2320();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2672 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2324();
        }
        if (this.field2676 != var5 || this.field2680 != var8) {
            class171.method616(this, 255, this.field2672, this.field2676, (byte) 0, true);
            return;
        }
        this.method3005(arg2);
        this.method3092();
    }

    @ObfuscatedName("fb.ce(I)V")
    public void method3092() {
        this.field2679 = new boolean[this.field2657.length];
        for (int var1 = 0; var1 < this.field2679.length; var1++) {
            this.field2679[var1] = false;
        }
        if (this.field2677 == null) {
            this.field2675 = true;
            return;
        }
        this.field2681 = -1;
        for (int var2 = 0; var2 < this.field2679.length; var2++) {
            if (this.field2661[var2] > 0) {
                class170.method1934(var2, this.field2677, this);
                this.field2681 = var2;
            }
        }
        if (this.field2681 == -1) {
            this.field2675 = true;
        }
    }

    @ObfuscatedName("fb.co(II)I")
    public int method3088(int arg0) {
        if (this.field2657[arg0] != null) {
            return 100;
        } else if (this.field2679[arg0]) {
            return 100;
        } else {
            int var2 = this.field2672;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2648 != null && Statics.field2648.field3100 == var3) {
                var5 = Statics.field150.field1988 * 99 / (Statics.field150.field1989.length - Statics.field2648.field2724) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("fb.cz(I)I")
    public int method3094() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2657.length; var3++) {
            if (this.field2661[var3] > 0) {
                var1 += 100;
                var2 += this.method3088(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
