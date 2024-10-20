package deob;

@ObfuscatedName("ip")
public class class240 {

    @ObfuscatedName("ip.c")
    public int[] field2782;

    @ObfuscatedName("ip.i")
    public int[] field2791;

    @ObfuscatedName("ip.o")
    public boolean field2783;

    @ObfuscatedName("ip.j")
    public int field2784;

    @ObfuscatedName("ip.k")
    public long field2785;

    @ObfuscatedName("ip.x")
    public long field2787;

    @ObfuscatedName("ip.d")
    public static final int[] field2790 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ip.a")
    public static class213 field2786 = new class213(260);

    @ObfuscatedName("ip.c([I[IZIB)V")
    public void method4062(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3513; var6++) {
                    class275 var7 = class275.method4408(var6);
                    if (var7 != null && !var7.field3509 && var7.field3510 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2790[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2782 = arg0;
        this.field2791 = arg1;
        this.field2783 = arg2;
        this.field2784 = arg3;
        this.method4068();
    }

    @ObfuscatedName("ip.i(IZB)V")
    public void method4063(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2783) {
            return;
        }
        int var3 = this.field2782[field2790[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class275 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3513) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3513 - 1;
                }
            }
            var4 = class275.method4408(var3);
        } while (var4 == null || var4.field3509 || var4.field3510 != (this.field2783 ? 7 : 0) + arg0);
        this.field2782[field2790[arg0]] = var3 + 256;
        this.method4068();
    }

    @ObfuscatedName("ip.o(IZB)V")
    public void method4064(int arg0, boolean arg1) {
        int var3 = this.field2791[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field630[arg0].length) {
                    var3 = 0;
                }
            } while (!class241.method4234(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field630[arg0].length - 1;
                }
            } while (!class241.method4234(arg0, var3));
        }
        this.field2791[arg0] = var3;
        this.method4068();
    }

    @ObfuscatedName("ip.j(ZB)V")
    public void method4065(boolean arg0) {
        if (this.field2783 != arg0) {
            this.method4062((int[]) null, this.field2791, arg0, -1);
        }
    }

    @ObfuscatedName("ip.k(Lgp;B)V")
    public void method4066(class195 arg0) {
        arg0.method3209(this.field2783 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2782[field2790[var2]];
            if (var3 == 0) {
                arg0.method3209(-1);
            } else {
                arg0.method3209(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method3209(this.field2791[var4]);
        }
    }

    @ObfuscatedName("ip.x(B)V")
    public void method4068() {
        long var1 = this.field2785;
        int var3 = this.field2782[5];
        int var4 = this.field2782[9];
        this.field2782[5] = var4;
        this.field2782[9] = var3;
        this.field2785 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2785 <<= 0x4;
            if (this.field2782[var5] >= 256) {
                this.field2785 += (long) (this.field2782[var5] - 256);
            }
        }
        if (this.field2782[0] >= 256) {
            this.field2785 += (long) (this.field2782[0] - 256 >> 4);
        }
        if (this.field2782[1] >= 256) {
            this.field2785 += (long) (this.field2782[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2785 <<= 0x3;
            this.field2785 += (long) this.field2791[var6];
        }
        this.field2785 <<= 0x1;
        this.field2785 += (long) (this.field2783 ? 1 : 0);
        this.field2782[5] = var3;
        this.field2782[9] = var4;
        if (var1 != 0L && this.field2785 != var1) {
            field2786.method3627(var1);
        }
    }

    @ObfuscatedName("ip.z(Lkn;ILkn;II)Led;")
    public class132 method4067(class288 arg0, int arg1, class288 arg2, int arg3) {
        if (this.field2784 != -1) {
            return class286.method995(this.field2784).method4749(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2785;
        int[] var7 = this.field2782;
        if (arg0 != null && (arg0.field3759 >= 0 || arg0.field3757 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2782[var8];
            }
            if (arg0.field3759 >= 0) {
                var5 += (long) (arg0.field3759 - this.field2782[5] << 40);
                var7[5] = arg0.field3759;
            }
            if (arg0.field3757 >= 0) {
                var5 += (long) (arg0.field3757 - this.field2782[3] << 48);
                var7[3] = arg0.field3757;
            }
        }
        class132 var9 = (class132) field2786.method3625(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class275.method4408(var12 - 256).method4460()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class284.method2869(var12 - 512).method4690(this.field2783)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2787 != -1L) {
                    var9 = (class132) field2786.method3625(this.field2787);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class126[] var13 = new class126[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class126 var17 = class275.method4408(var16 - 256).method4461();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class126 var18 = class284.method2869(var16 - 512).method4706(this.field2783);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class126 var19 = new class126(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2791[var20] < Statics.field630[var20].length) {
                        var19.method2383(Statics.field2789[var20], Statics.field630[var20][this.field2791[var20]]);
                    }
                    if (this.field2791[var20] < Statics.field2781[var20].length) {
                        var19.method2383(Statics.field2788[var20], Statics.field2781[var20][this.field2791[var20]]);
                    }
                }
                var9 = var19.method2384(64, 850, -30, -50, -30);
                field2786.method3628(var9, var5);
                this.field2787 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class132 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4807(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4802(var9, arg3);
        } else {
            var21 = arg0.method4802(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("ip.p(I)Ldj;")
    public class126 method4088() {
        if (this.field2784 != -1) {
            return class286.method995(this.field2784).method4750();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2782[var2];
            if (var3 >= 256 && var3 < 512 && !class275.method4408(var3 - 256).method4462()) {
                var1 = true;
            }
            if (var3 >= 512 && !class284.method2869(var3 - 512).method4691(this.field2783)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class126[] var4 = new class126[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2782[var6];
            if (var7 >= 256 && var7 < 512) {
                class126 var8 = class275.method4408(var7 - 256).method4463();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class126 var9 = class284.method2869(var7 - 512).method4693(this.field2783);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class126 var10 = new class126(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2791[var11] < Statics.field630[var11].length) {
                var10.method2383(Statics.field2789[var11], Statics.field630[var11][this.field2791[var11]]);
            }
            if (this.field2791[var11] < Statics.field2781[var11].length) {
                var10.method2383(Statics.field2788[var11], Statics.field2781[var11][this.field2791[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ip.w(I)I")
    public int method4070() {
        return this.field2784 == -1 ? (this.field2782[11] << 5) + (this.field2782[8] << 10) + (this.field2782[0] << 15) + (this.field2791[0] << 25) + (this.field2791[4] << 20) + this.field2782[1] : 305419896 + class286.method995(this.field2784).field3701;
    }
}
