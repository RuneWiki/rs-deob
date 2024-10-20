package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fe")
public class class168 extends class167 {

    @ObfuscatedName("fe.p")
    public class134 field2701;

    @ObfuscatedName("fe.w")
    public class134 field2700;

    @ObfuscatedName("fe.t")
    public int field2709;

    @ObfuscatedName("fe.c")
    public volatile boolean field2702 = false;

    @ObfuscatedName("fe.x")
    public boolean field2703 = false;

    @ObfuscatedName("fe.e")
    public volatile boolean[] field2708;

    @ObfuscatedName("fe.v")
    public static CRC32 field2705 = new CRC32();

    @ObfuscatedName("fe.ab")
    public int field2706;

    @ObfuscatedName("fe.ak")
    public int field2707;

    @ObfuscatedName("fe.am")
    public int field2699 = -1;

    public class168(class134 arg0, class134 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2701 = arg0;
        this.field2700 = arg1;
        this.field2709 = arg2;
        this.field2703 = arg5;
        class171.method2725(this, this.field2709);
    }

    @ObfuscatedName("fe.bo(B)I")
    public int method3078() {
        if (this.field2702) {
            return 100;
        } else if (this.field2696 == null) {
            int var1 = class171.method8(255, this.field2709);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("fe.l(IB)V")
    public void method3004(int arg0) {
        class171.method122(this.field2709, arg0);
    }

    @ObfuscatedName("fe.r(II)V")
    public void method3013(int arg0) {
        if (this.field2701 == null || this.field2708 == null || !this.field2708[arg0]) {
            class171.method2246(this, this.field2709, arg0, this.field2683[arg0], (byte) 2, true);
        } else {
            class170.method3077(arg0, this.field2701, this);
        }
    }

    @ObfuscatedName("fe.bu(III)V")
    public void method3083(int arg0, int arg1) {
        this.field2706 = arg0;
        this.field2707 = arg1;
        if (this.field2700 == null) {
            class171.method2246(this, 255, this.field2709, this.field2706, (byte) 0, true);
            return;
        }
        int var3 = this.field2709;
        class134 var4 = this.field2700;
        byte[] var6 = null;
        class199 var7 = class170.field2718;
        synchronized (class170.field2718) {
            for (class169 var8 = (class169) class170.field2718.method3528(); var8 != null; var8 = (class169) class170.field2718.method3527()) {
                if ((long) var3 == var8.field3113 && var8.field2712 == var4 && var8.field2710 == 0) {
                    var6 = var8.field2711;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2649(var3);
            this.method3103(var4, var3, var10, true);
        } else {
            this.method3103(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("fe.cr(I[BZZI)V")
    public void method3080(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2698[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2698[arg0];
            if (this.field2701 != null) {
                class134 var12 = this.field2701;
                class169 var13 = new class169();
                var13.field2710 = 0;
                var13.field3113 = (long) arg0;
                var13.field2711 = arg1;
                var13.field2712 = var12;
                class199 var14 = class170.field2718;
                synchronized (class170.field2718) {
                    class170.field2718.method3523(var13);
                }
                Object var16 = class170.field2717;
                synchronized (class170.field2717) {
                    if (class170.field2719 == 0) {
                        Statics.field649.method2689(new class170(), 5);
                    }
                    class170.field2719 = 600;
                }
                this.field2708[arg0] = true;
            }
            if (arg3) {
                this.field2696[arg0] = class125.method2040(arg1, false);
            }
            return;
        }
        if (this.field2702) {
            throw new RuntimeException();
        }
        if (this.field2700 != null) {
            int var5 = this.field2709;
            class134 var6 = this.field2700;
            class169 var7 = new class169();
            var7.field2710 = 0;
            var7.field3113 = (long) var5;
            var7.field2711 = arg1;
            var7.field2712 = var6;
            class199 var8 = class170.field2718;
            synchronized (class170.field2718) {
                class170.field2718.method3523(var7);
            }
            Object var10 = class170.field2717;
            synchronized (class170.field2717) {
                if (class170.field2719 == 0) {
                    Statics.field649.method2689(new class170(), 5);
                }
                class170.field2719 = 600;
            }
        }
        this.method3003(arg1);
        this.method3082();
    }

    @ObfuscatedName("fe.cx(Leg;I[BZI)V")
    public void method3103(class134 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2700 != arg0) {
            if (!arg3 && this.field2699 == arg1) {
                this.field2702 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2708[arg1] = false;
                if (this.field2703 || arg3) {
                    class171.method2246(this, this.field2709, arg1, this.field2683[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2705.reset();
            field2705.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2705.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2683[arg1] != var9 || this.field2698[arg1] != var10) {
                this.field2708[arg1] = false;
                if (this.field2703 || arg3) {
                    class171.method2246(this, this.field2709, arg1, this.field2683[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2708[arg1] = true;
            if (arg3) {
                this.field2696[arg1] = class125.method2040(arg2, false);
            }
            return;
        }
        if (this.field2702) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class171.method2246(this, 255, this.field2709, this.field2706, (byte) 0, true);
            return;
        }
        field2705.reset();
        field2705.update(arg2, 0, arg2.length);
        int var5 = (int) field2705.getValue();
        class119 var6 = new class119(class167.method591(arg2));
        int var7 = var6.method2316();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2709 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2321();
        }
        if (this.field2706 != var5 || this.field2707 != var8) {
            class171.method2246(this, 255, this.field2709, this.field2706, (byte) 0, true);
            return;
        }
        this.method3003(arg2);
        this.method3082();
    }

    @ObfuscatedName("fe.ch(I)V")
    public void method3082() {
        this.field2708 = new boolean[this.field2696.length];
        for (int var1 = 0; var1 < this.field2708.length; var1++) {
            this.field2708[var1] = false;
        }
        if (this.field2701 == null) {
            this.field2702 = true;
            return;
        }
        this.field2699 = -1;
        for (int var2 = 0; var2 < this.field2708.length; var2++) {
            if (this.field2685[var2] > 0) {
                class134 var3 = this.field2701;
                class169 var5 = new class169();
                var5.field2710 = 1;
                var5.field3113 = (long) var2;
                var5.field2712 = var3;
                var5.field2713 = this;
                class199 var6 = class170.field2718;
                synchronized (class170.field2718) {
                    class170.field2718.method3523(var5);
                }
                Object var8 = class170.field2717;
                synchronized (class170.field2717) {
                    if (class170.field2719 == 0) {
                        Statics.field649.method2689(new class170(), 5);
                    }
                    class170.field2719 = 600;
                }
                this.field2699 = var2;
            }
        }
        if (this.field2699 == -1) {
            this.field2702 = true;
        }
    }

    @ObfuscatedName("fe.cg(II)I")
    public int method3086(int arg0) {
        if (this.field2696[arg0] == null) {
            return this.field2708[arg0] ? 100 : class171.method8(this.field2709, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("fe.cm(I)I")
    public int method3084() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2696.length; var3++) {
            if (this.field2685[var3] > 0) {
                var1 += 100;
                var2 += this.method3086(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
