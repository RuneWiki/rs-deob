package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fy")
public class class168 extends class167 {

    @ObfuscatedName("fy.h")
    public class134 field2668;

    @ObfuscatedName("fy.j")
    public class134 field2673;

    @ObfuscatedName("fy.v")
    public int field2669;

    @ObfuscatedName("fy.l")
    public volatile boolean field2670 = false;

    @ObfuscatedName("fy.u")
    public boolean field2667 = false;

    @ObfuscatedName("fy.t")
    public volatile boolean[] field2676;

    @ObfuscatedName("fy.i")
    public static CRC32 field2674 = new CRC32();

    @ObfuscatedName("fy.ah")
    public int field2672;

    @ObfuscatedName("fy.aa")
    public int field2675;

    @ObfuscatedName("fy.ao")
    public int field2671 = -1;

    public class168(class134 arg0, class134 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2668 = arg0;
        this.field2673 = arg1;
        this.field2669 = arg2;
        this.field2667 = arg5;
        class171.method920(this, this.field2669);
    }

    @ObfuscatedName("fy.br(S)I")
    public int method3070() {
        if (this.field2670) {
            return 100;
        } else if (this.field2658 == null) {
            int var1 = class171.method2985(255, this.field2669);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("fy.d(II)V")
    public void method3011(int arg0) {
        int var2 = this.field2669;
        long var3 = (long) ((var2 << 16) + arg0);
        class172 var5 = (class172) class171.field2689.method3459(var3);
        if (var5 != null) {
            class171.field2699.method3545(var5);
        }
    }

    @ObfuscatedName("fy.k(II)V")
    public void method3039(int arg0) {
        if (this.field2668 == null || this.field2676 == null || !this.field2676[arg0]) {
            class171.method668(this, this.field2669, arg0, this.field2652[arg0], (byte) 2, true);
            return;
        }
        class134 var2 = this.field2668;
        byte[] var4 = null;
        class199 var5 = class170.field2684;
        synchronized (class170.field2684) {
            for (class169 var6 = (class169) class170.field2684.method3493(); var6 != null; var6 = (class169) class170.field2684.method3495()) {
                if ((long) arg0 == var6.field3091 && var6.field2680 == var2 && var6.field2681 == 0) {
                    var4 = var6.field2678;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2667(arg0);
            this.method3071(var2, arg0, var8, true);
        } else {
            this.method3071(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("fy.bo(III)V")
    public void method3069(int arg0, int arg1) {
        this.field2672 = arg0;
        this.field2675 = arg1;
        if (this.field2673 == null) {
            class171.method668(this, 255, this.field2669, this.field2672, (byte) 0, true);
            return;
        }
        int var3 = this.field2669;
        class134 var4 = this.field2673;
        byte[] var6 = null;
        class199 var7 = class170.field2684;
        synchronized (class170.field2684) {
            for (class169 var8 = (class169) class170.field2684.method3493(); var8 != null; var8 = (class169) class170.field2684.method3495()) {
                if ((long) var3 == var8.field3091 && var8.field2680 == var4 && var8.field2681 == 0) {
                    var6 = var8.field2678;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2667(var3);
            this.method3071(var4, var3, var10, true);
        } else {
            this.method3071(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("fy.bx(I[BZZB)V")
    public void method3072(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2653[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2653[arg0];
            if (this.field2668 != null) {
                class134 var12 = this.field2668;
                class169 var13 = new class169();
                var13.field2681 = 0;
                var13.field3091 = (long) arg0;
                var13.field2678 = arg1;
                var13.field2680 = var12;
                class199 var14 = class170.field2684;
                synchronized (class170.field2684) {
                    class170.field2684.method3488(var13);
                }
                Object var16 = class170.field2686;
                synchronized (class170.field2686) {
                    if (class170.field2685 == 0) {
                        Statics.field1981.method2689(new class170(), 5);
                    }
                    class170.field2685 = 600;
                }
                this.field2676[arg0] = true;
            }
            if (arg3) {
                this.field2658[arg0] = class125.method161(arg1, false);
            }
            return;
        }
        if (this.field2670) {
            throw new RuntimeException();
        }
        if (this.field2673 != null) {
            int var5 = this.field2669;
            class134 var6 = this.field2673;
            class169 var7 = new class169();
            var7.field2681 = 0;
            var7.field3091 = (long) var5;
            var7.field2678 = arg1;
            var7.field2680 = var6;
            class199 var8 = class170.field2684;
            synchronized (class170.field2684) {
                class170.field2684.method3488(var7);
            }
            Object var10 = class170.field2686;
            synchronized (class170.field2686) {
                if (class170.field2685 == 0) {
                    Statics.field1981.method2689(new class170(), 5);
                }
                class170.field2685 = 600;
            }
        }
        this.method3002(arg1);
        this.method3067();
    }

    @ObfuscatedName("fy.bl(Ler;I[BZI)V")
    public void method3071(class134 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2673 != arg0) {
            if (!arg3 && this.field2671 == arg1) {
                this.field2670 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2676[arg1] = false;
                if (this.field2667 || arg3) {
                    class171.method668(this, this.field2669, arg1, this.field2652[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2674.reset();
            field2674.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2674.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2652[arg1] != var9 || this.field2653[arg1] != var10) {
                this.field2676[arg1] = false;
                if (this.field2667 || arg3) {
                    class171.method668(this, this.field2669, arg1, this.field2652[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2676[arg1] = true;
            if (arg3) {
                this.field2658[arg1] = class125.method161(arg2, false);
            }
            return;
        }
        if (this.field2670) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class171.method668(this, 255, this.field2669, this.field2672, (byte) 0, true);
            return;
        }
        field2674.reset();
        field2674.update(arg2, 0, arg2.length);
        int var5 = (int) field2674.getValue();
        class119 var6 = new class119(class167.method1924(arg2));
        int var7 = var6.method2326();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2669 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2331();
        }
        if (this.field2672 != var5 || this.field2675 != var8) {
            class171.method668(this, 255, this.field2669, this.field2672, (byte) 0, true);
            return;
        }
        this.method3002(arg2);
        this.method3067();
    }

    @ObfuscatedName("fy.cy(S)V")
    public void method3067() {
        this.field2676 = new boolean[this.field2658.length];
        for (int var1 = 0; var1 < this.field2676.length; var1++) {
            this.field2676[var1] = false;
        }
        if (this.field2668 == null) {
            this.field2670 = true;
            return;
        }
        this.field2671 = -1;
        for (int var2 = 0; var2 < this.field2676.length; var2++) {
            if (this.field2661[var2] > 0) {
                class134 var3 = this.field2668;
                class169 var5 = new class169();
                var5.field2681 = 1;
                var5.field3091 = (long) var2;
                var5.field2680 = var3;
                var5.field2679 = this;
                class199 var6 = class170.field2684;
                synchronized (class170.field2684) {
                    class170.field2684.method3488(var5);
                }
                Object var8 = class170.field2686;
                synchronized (class170.field2686) {
                    if (class170.field2685 == 0) {
                        Statics.field1981.method2689(new class170(), 5);
                    }
                    class170.field2685 = 600;
                }
                this.field2671 = var2;
            }
        }
        if (this.field2671 == -1) {
            this.field2670 = true;
        }
    }

    @ObfuscatedName("fy.cc(II)I")
    public int method3073(int arg0) {
        if (this.field2658[arg0] == null) {
            return this.field2676[arg0] ? 100 : class171.method2985(this.field2669, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("fy.cr(I)I")
    public int method3074() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2658.length; var3++) {
            if (this.field2661[var3] > 0) {
                var1 += 100;
                var2 += this.method3073(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
