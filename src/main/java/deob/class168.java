package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fm")
public class class168 extends class167 {

    @ObfuscatedName("fm.b")
    public class134 field2676;

    @ObfuscatedName("fm.s")
    public class134 field2673;

    @ObfuscatedName("fm.v")
    public int field2678;

    @ObfuscatedName("fm.j")
    public volatile boolean field2675 = false;

    @ObfuscatedName("fm.z")
    public boolean field2682 = false;

    @ObfuscatedName("fm.n")
    public volatile boolean[] field2672;

    @ObfuscatedName("fm.p")
    public static CRC32 field2674 = new CRC32();

    @ObfuscatedName("fm.aj")
    public int field2679;

    @ObfuscatedName("fm.aq")
    public int field2680;

    @ObfuscatedName("fm.aw")
    public int field2681 = -1;

    public class168(class134 arg0, class134 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2676 = arg0;
        this.field2673 = arg1;
        this.field2678 = arg2;
        this.field2682 = arg5;
        class171.method2888(this, this.field2678);
    }

    @ObfuscatedName("fm.ce(I)I")
    public int method3073() {
        if (this.field2675) {
            return 100;
        } else if (this.field2661 == null) {
            int var1 = class171.method2605(255, this.field2678);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("fm.h(IB)V")
    public void method3064(int arg0) {
        int var2 = this.field2678;
        long var3 = (long) ((var2 << 16) + arg0);
        class172 var5 = (class172) class171.field2705.method3521(var3);
        if (var5 != null) {
            class171.field2717.method3610(var5);
        }
    }

    @ObfuscatedName("fm.y(II)V")
    public void method3002(int arg0) {
        if (this.field2676 == null || this.field2672 == null || !this.field2672[arg0]) {
            class171.method2562(this, this.field2678, arg0, this.field2655[arg0], (byte) 2, true);
            return;
        }
        class134 var2 = this.field2676;
        byte[] var4 = null;
        class199 var5 = class170.field2694;
        synchronized (class170.field2694) {
            for (class169 var6 = (class169) class170.field2694.method3558(); var6 != null; var6 = (class169) class170.field2694.method3554()) {
                if ((long) arg0 == var6.field3096 && var6.field2686 == var2 && var6.field2687 == 0) {
                    var4 = var6.field2684;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2645(arg0);
            this.method3077(var2, arg0, var8, true);
        } else {
            this.method3077(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("fm.cm(IIB)V")
    public void method3072(int arg0, int arg1) {
        this.field2679 = arg0;
        this.field2680 = arg1;
        if (this.field2673 == null) {
            class171.method2562(this, 255, this.field2678, this.field2679, (byte) 0, true);
            return;
        }
        int var3 = this.field2678;
        class134 var4 = this.field2673;
        byte[] var6 = null;
        class199 var7 = class170.field2694;
        synchronized (class170.field2694) {
            for (class169 var8 = (class169) class170.field2694.method3558(); var8 != null; var8 = (class169) class170.field2694.method3554()) {
                if ((long) var3 == var8.field3096 && var8.field2686 == var4 && var8.field2687 == 0) {
                    var6 = var8.field2684;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2645(var3);
            this.method3077(var4, var3, var10, true);
        } else {
            this.method3077(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("fm.ck(I[BZZB)V")
    public void method3103(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2656[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2656[arg0];
            if (this.field2676 != null) {
                class134 var10 = this.field2676;
                class169 var11 = new class169();
                var11.field2687 = 0;
                var11.field3096 = (long) arg0;
                var11.field2684 = arg1;
                var11.field2686 = var10;
                class199 var12 = class170.field2694;
                synchronized (class170.field2694) {
                    class170.field2694.method3585(var11);
                }
                class170.method2893();
                this.field2672[arg0] = true;
            }
            if (arg3) {
                this.field2661[arg0] = class125.method801(arg1, false);
            }
            return;
        }
        if (this.field2675) {
            throw new RuntimeException();
        }
        if (this.field2673 != null) {
            int var5 = this.field2678;
            class134 var6 = this.field2673;
            class169 var7 = new class169();
            var7.field2687 = 0;
            var7.field3096 = (long) var5;
            var7.field2684 = arg1;
            var7.field2686 = var6;
            class199 var8 = class170.field2694;
            synchronized (class170.field2694) {
                class170.field2694.method3585(var7);
            }
            class170.method2893();
        }
        this.method2992(arg1);
        this.method3078();
    }

    @ObfuscatedName("fm.cj(Lel;I[BZI)V")
    public void method3077(class134 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2673 != arg0) {
            if (!arg3 && this.field2681 == arg1) {
                this.field2675 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2672[arg1] = false;
                if (this.field2682 || arg3) {
                    class171.method2562(this, this.field2678, arg1, this.field2655[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2674.reset();
            field2674.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2674.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2655[arg1] != var9 || this.field2656[arg1] != var10) {
                this.field2672[arg1] = false;
                if (this.field2682 || arg3) {
                    class171.method2562(this, this.field2678, arg1, this.field2655[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2672[arg1] = true;
            if (arg3) {
                this.field2661[arg1] = class125.method801(arg2, false);
            }
            return;
        }
        if (this.field2675) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class171.method2562(this, 255, this.field2678, this.field2679, (byte) 0, true);
            return;
        }
        field2674.reset();
        field2674.update(arg2, 0, arg2.length);
        int var5 = (int) field2674.getValue();
        class119 var6 = new class119(class167.method2453(arg2));
        int var7 = var6.method2291();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2678 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2296();
        }
        if (this.field2679 != var5 || this.field2680 != var8) {
            class171.method2562(this, 255, this.field2678, this.field2679, (byte) 0, true);
            return;
        }
        this.method2992(arg2);
        this.method3078();
    }

    @ObfuscatedName("fm.cn(B)V")
    public void method3078() {
        this.field2672 = new boolean[this.field2661.length];
        for (int var1 = 0; var1 < this.field2672.length; var1++) {
            this.field2672[var1] = false;
        }
        if (this.field2676 == null) {
            this.field2675 = true;
            return;
        }
        this.field2681 = -1;
        for (int var2 = 0; var2 < this.field2672.length; var2++) {
            if (this.field2657[var2] > 0) {
                class134 var3 = this.field2676;
                class169 var5 = new class169();
                var5.field2687 = 1;
                var5.field3096 = (long) var2;
                var5.field2686 = var3;
                var5.field2685 = this;
                class199 var6 = class170.field2694;
                synchronized (class170.field2694) {
                    class170.field2694.method3585(var5);
                }
                class170.method2893();
                this.field2681 = var2;
            }
        }
        if (this.field2681 == -1) {
            this.field2675 = true;
        }
    }

    @ObfuscatedName("fm.cr(II)I")
    public int method3079(int arg0) {
        if (this.field2661[arg0] == null) {
            return this.field2672[arg0] ? 100 : class171.method2605(this.field2678, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("fm.cq(I)I")
    public int method3080() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2661.length; var3++) {
            if (this.field2657[var3] > 0) {
                var1 += 100;
                var2 += this.method3079(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
