package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ff")
public class class168 extends class167 {

    @ObfuscatedName("ff.u")
    public class134 field2677;

    @ObfuscatedName("ff.m")
    public class134 field2682;

    @ObfuscatedName("ff.t")
    public int field2674;

    @ObfuscatedName("ff.z")
    public volatile boolean field2676 = false;

    @ObfuscatedName("ff.e")
    public boolean field2680 = false;

    @ObfuscatedName("ff.y")
    public volatile boolean[] field2678;

    @ObfuscatedName("ff.a")
    public static CRC32 field2679 = new CRC32();

    @ObfuscatedName("ff.at")
    public int field2673;

    @ObfuscatedName("ff.aa")
    public int field2681;

    @ObfuscatedName("ff.ad")
    public int field2675 = -1;

    public class168(class134 arg0, class134 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2677 = arg0;
        this.field2682 = arg1;
        this.field2674 = arg2;
        this.field2680 = arg5;
        int var8 = this.field2674;
        if (Statics.field2288 == null) {
            Statics.method873((class168) null, 255, 255, 0, (byte) 0, true);
            class171.field2710[var8] = this;
        } else {
            Statics.field2288.field1973 = var8 * 8 + 5;
            int var9 = Statics.field2288.method2388();
            int var10 = Statics.field2288.method2388();
            this.method3162(var9, var10);
        }
    }

    @ObfuscatedName("ff.cf(I)I")
    public int method3169() {
        if (this.field2676) {
            return 100;
        } else if (this.field2664 == null) {
            int var1 = class171.method48(255, this.field2674);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ff.q(II)V")
    public void method3159(int arg0) {
        int var2 = this.field2674;
        long var3 = (long) ((var2 << 16) + arg0);
        class172 var5 = (class172) class171.field2701.method3584(var3);
        if (var5 != null) {
            class171.field2702.method3669(var5);
        }
    }

    @ObfuscatedName("ff.c(II)V")
    public void method3080(int arg0) {
        if (this.field2677 == null || this.field2678 == null || !this.field2678[arg0]) {
            Statics.method873(this, this.field2674, arg0, this.field2658[arg0], (byte) 2, true);
            return;
        }
        class134 var2 = this.field2677;
        byte[] var4 = null;
        class199 var5 = class170.field2695;
        synchronized (class170.field2695) {
            for (class169 var6 = (class169) class170.field2695.method3611(); var6 != null; var6 = (class169) class170.field2695.method3616()) {
                if ((long) arg0 == var6.field3093 && var6.field2685 == var2 && var6.field2684 == 0) {
                    var4 = var6.field2689;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2737(arg0);
            this.method3161(var2, arg0, var8, true);
        } else {
            this.method3161(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ff.ct(IIB)V")
    public void method3162(int arg0, int arg1) {
        this.field2673 = arg0;
        this.field2681 = arg1;
        if (this.field2682 == null) {
            Statics.method873(this, 255, this.field2674, this.field2673, (byte) 0, true);
            return;
        }
        int var3 = this.field2674;
        class134 var4 = this.field2682;
        byte[] var6 = null;
        class199 var7 = class170.field2695;
        synchronized (class170.field2695) {
            for (class169 var8 = (class169) class170.field2695.method3611(); var8 != null; var8 = (class169) class170.field2695.method3616()) {
                if ((long) var3 == var8.field3093 && var8.field2685 == var4 && var8.field2684 == 0) {
                    var6 = var8.field2689;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2737(var3);
            this.method3161(var4, var3, var10, true);
        } else {
            this.method3161(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ff.cr(I[BZZI)V")
    public void method3163(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2676) {
                throw new RuntimeException();
            }
            if (this.field2682 != null) {
                class170.method3770(this.field2674, arg1, this.field2682);
            }
            this.method3088(arg1);
            this.method3165();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2671[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2671[arg0];
        if (this.field2677 != null) {
            class170.method3770(arg0, arg1, this.field2677);
            this.field2678[arg0] = true;
        }
        if (arg3) {
            this.field2664[arg0] = class125.method647(arg1, false);
        }
    }

    @ObfuscatedName("ff.cs(Lev;I[BZB)V")
    public void method3161(class134 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2682 != arg0) {
            if (!arg3 && this.field2675 == arg1) {
                this.field2676 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2678[arg1] = false;
                if (this.field2680 || arg3) {
                    Statics.method873(this, this.field2674, arg1, this.field2658[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2679.reset();
            field2679.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2679.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2658[arg1] != var9 || this.field2671[arg1] != var10) {
                this.field2678[arg1] = false;
                if (this.field2680 || arg3) {
                    Statics.method873(this, this.field2674, arg1, this.field2658[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2678[arg1] = true;
            if (arg3) {
                this.field2664[arg1] = class125.method647(arg2, false);
            }
            return;
        }
        if (this.field2676) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            Statics.method873(this, 255, this.field2674, this.field2673, (byte) 0, true);
            return;
        }
        field2679.reset();
        field2679.update(arg2, 0, arg2.length);
        int var5 = (int) field2679.getValue();
        class119 var6 = new class119(class167.method168(arg2));
        int var7 = var6.method2383();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2674 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2388();
        }
        if (this.field2673 != var5 || this.field2681 != var8) {
            Statics.method873(this, 255, this.field2674, this.field2673, (byte) 0, true);
            return;
        }
        this.method3088(arg2);
        this.method3165();
    }

    @ObfuscatedName("ff.cz(B)V")
    public void method3165() {
        this.field2678 = new boolean[this.field2664.length];
        for (int var1 = 0; var1 < this.field2678.length; var1++) {
            this.field2678[var1] = false;
        }
        if (this.field2677 == null) {
            this.field2676 = true;
            return;
        }
        this.field2675 = -1;
        for (int var2 = 0; var2 < this.field2678.length; var2++) {
            if (this.field2660[var2] > 0) {
                class170.method169(var2, this.field2677, this);
                this.field2675 = var2;
            }
        }
        if (this.field2675 == -1) {
            this.field2676 = true;
        }
    }

    @ObfuscatedName("ff.cb(II)I")
    public int method3166(int arg0) {
        if (this.field2664[arg0] == null) {
            return this.field2678[arg0] ? 100 : class171.method48(this.field2674, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ff.cx(I)I")
    public int method3168() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2664.length; var3++) {
            if (this.field2660[var3] > 0) {
                var1 += 100;
                var2 += this.method3166(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
