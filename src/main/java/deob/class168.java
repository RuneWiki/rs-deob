package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fg")
public class class168 extends class167 {

    @ObfuscatedName("fg.v")
    public class134 field2677;

    @ObfuscatedName("fg.q")
    public class134 field2674;

    @ObfuscatedName("fg.x")
    public int field2678;

    @ObfuscatedName("fg.d")
    public volatile boolean field2676 = false;

    @ObfuscatedName("fg.o")
    public boolean field2683 = false;

    @ObfuscatedName("fg.c")
    public volatile boolean[] field2673;

    @ObfuscatedName("fg.b")
    public static CRC32 field2675 = new CRC32();

    @ObfuscatedName("fg.aa")
    public int field2679;

    @ObfuscatedName("fg.ao")
    public int field2681;

    @ObfuscatedName("fg.as")
    public int field2682 = -1;

    public class168(class134 arg0, class134 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2677 = arg0;
        this.field2674 = arg1;
        this.field2678 = arg2;
        this.field2683 = arg5;
        int var8 = this.field2678;
        if (Statics.field2712 == null) {
            class171.method977((class168) null, 255, 255, 0, (byte) 0, true);
            class171.field2713[var8] = this;
        } else {
            Statics.field2712.field1982 = var8 * 8 + 5;
            int var9 = Statics.field2712.method2377();
            int var10 = Statics.field2712.method2377();
            this.method3174(var9, var10);
        }
    }

    @ObfuscatedName("fg.cd(B)I")
    public int method3173() {
        if (this.field2676) {
            return 100;
        } else if (this.field2671 == null) {
            int var1 = this.field2678;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field1055 != null && Statics.field1055.field3105 == var2) {
                var4 = Statics.field2709.field1982 * 99 / (Statics.field2709.field1981.length - Statics.field1055.field2722) + 1;
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

    @ObfuscatedName("fg.m(II)V")
    public void method3104(int arg0) {
        int var2 = this.field2678;
        long var3 = (long) ((var2 << 16) + arg0);
        class172 var5 = (class172) class171.field2717.method3571(var3);
        if (var5 != null) {
            class171.field2708.method3668(var5);
        }
    }

    @ObfuscatedName("fg.s(II)V")
    public void method3092(int arg0) {
        if (this.field2677 == null || this.field2673 == null || !this.field2673[arg0]) {
            class171.method977(this, this.field2678, arg0, this.field2659[arg0], (byte) 2, true);
        } else {
            Statics.method2667(arg0, this.field2677, this);
        }
    }

    @ObfuscatedName("fg.cl(IIS)V")
    public void method3174(int arg0, int arg1) {
        this.field2679 = arg0;
        this.field2681 = arg1;
        if (this.field2674 == null) {
            class171.method977(this, 255, this.field2678, this.field2679, (byte) 0, true);
        } else {
            Statics.method2667(this.field2678, this.field2674, this);
        }
    }

    @ObfuscatedName("fg.ce(I[BZZI)V")
    public void method3175(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2660[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2660[arg0];
            if (this.field2677 != null) {
                class134 var10 = this.field2677;
                class169 var11 = new class169();
                var11.field2685 = 0;
                var11.field3105 = (long) arg0;
                var11.field2686 = arg1;
                var11.field2684 = var10;
                class199 var12 = class170.field2695;
                synchronized (class170.field2695) {
                    class170.field2695.method3603(var11);
                }
                class170.method2173();
                this.field2673[arg0] = true;
            }
            if (arg3) {
                this.field2671[arg0] = class125.method924(arg1, false);
            }
            return;
        }
        if (this.field2676) {
            throw new RuntimeException();
        }
        if (this.field2674 != null) {
            int var5 = this.field2678;
            class134 var6 = this.field2674;
            class169 var7 = new class169();
            var7.field2685 = 0;
            var7.field3105 = (long) var5;
            var7.field2686 = arg1;
            var7.field2684 = var6;
            class199 var8 = class170.field2695;
            synchronized (class170.field2695) {
                class170.field2695.method3603(var7);
            }
            class170.method2173();
        }
        this.method3132(arg1);
        this.method3177();
    }

    @ObfuscatedName("fg.ct(Ler;I[BZI)V")
    public void method3176(class134 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2674 != arg0) {
            if (!arg3 && this.field2682 == arg1) {
                this.field2676 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2673[arg1] = false;
                if (this.field2683 || arg3) {
                    class171.method977(this, this.field2678, arg1, this.field2659[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2675.reset();
            field2675.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2675.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2659[arg1] != var9 || this.field2660[arg1] != var10) {
                this.field2673[arg1] = false;
                if (this.field2683 || arg3) {
                    class171.method977(this, this.field2678, arg1, this.field2659[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2673[arg1] = true;
            if (arg3) {
                this.field2671[arg1] = class125.method924(arg2, false);
            }
            return;
        }
        if (this.field2676) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class171.method977(this, 255, this.field2678, this.field2679, (byte) 0, true);
            return;
        }
        field2675.reset();
        field2675.update(arg2, 0, arg2.length);
        int var5 = (int) field2675.getValue();
        class119 var6 = new class119(class167.method669(arg2));
        int var7 = var6.method2372();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2678 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2377();
        }
        if (this.field2679 != var5 || this.field2681 != var8) {
            class171.method977(this, 255, this.field2678, this.field2679, (byte) 0, true);
            return;
        }
        this.method3132(arg2);
        this.method3177();
    }

    @ObfuscatedName("fg.cc(B)V")
    public void method3177() {
        this.field2673 = new boolean[this.field2671.length];
        for (int var1 = 0; var1 < this.field2673.length; var1++) {
            this.field2673[var1] = false;
        }
        if (this.field2677 == null) {
            this.field2676 = true;
            return;
        }
        this.field2682 = -1;
        for (int var2 = 0; var2 < this.field2673.length; var2++) {
            if (this.field2661[var2] > 0) {
                class170.method958(var2, this.field2677, this);
                this.field2682 = var2;
            }
        }
        if (this.field2682 == -1) {
            this.field2676 = true;
        }
    }

    @ObfuscatedName("fg.ck(II)I")
    public int method3178(int arg0) {
        if (this.field2671[arg0] != null) {
            return 100;
        } else if (this.field2673[arg0]) {
            return 100;
        } else {
            int var2 = this.field2678;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field1055 != null && Statics.field1055.field3105 == var3) {
                var5 = Statics.field2709.field1982 * 99 / (Statics.field2709.field1981.length - Statics.field1055.field2722) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("fg.cn(B)I")
    public int method3179() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2671.length; var3++) {
            if (this.field2661[var3] > 0) {
                var1 += 100;
                var2 += this.method3178(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
