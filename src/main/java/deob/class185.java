package deob;

import java.util.zip.CRC32;

@ObfuscatedName("gy")
public class class185 extends class183 {

    @ObfuscatedName("gy.y")
    public class117 field2710;

    @ObfuscatedName("gy.h")
    public class117 field2714;

    @ObfuscatedName("gy.s")
    public int field2712;

    @ObfuscatedName("gy.w")
    public volatile boolean field2713 = false;

    @ObfuscatedName("gy.n")
    public boolean field2715 = false;

    @ObfuscatedName("gy.o")
    public volatile boolean[] field2719;

    @ObfuscatedName("gy.b")
    public static CRC32 field2716 = new CRC32();

    @ObfuscatedName("gy.aj")
    public int field2717;

    @ObfuscatedName("gy.ag")
    public int field2718;

    @ObfuscatedName("gy.al")
    public int field2711 = -1;

    public class185(class117 arg0, class117 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2710 = arg0;
        this.field2714 = arg1;
        this.field2712 = arg2;
        this.field2715 = arg5;
        int var8 = this.field2712;
        if (Statics.field906 == null) {
            class186.method26((class185) null, 255, 255, 0, (byte) 0, true);
            class186.field2739[var8] = this;
        } else {
            Statics.field906.field2073 = var8 * 8 + 5;
            int var9 = Statics.field906.method2593();
            int var10 = Statics.field906.method2593();
            this.method3157(var9, var10);
        }
    }

    @ObfuscatedName("gy.co(B)I")
    public int method3155() {
        if (this.field2713) {
            return 100;
        } else if (this.field2700 == null) {
            int var1 = this.field2712;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2724 != null && Statics.field2724.field1867 == var2) {
                var4 = Statics.field239.field2073 * 99 / (Statics.field239.field2078.length - Statics.field2724.field2678) + 1;
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

    @ObfuscatedName("gy.x(II)V")
    public void method3060(int arg0) {
        class186.method2503(this.field2712, arg0);
    }

    @ObfuscatedName("gy.e(II)V")
    public void method3069(int arg0) {
        if (this.field2710 == null || this.field2719 == null || !this.field2719[arg0]) {
            class186.method26(this, this.field2712, arg0, this.field2687[arg0], (byte) 2, true);
        } else {
            class184.method12(arg0, this.field2710, this);
        }
    }

    @ObfuscatedName("gy.cr(IIB)V")
    public void method3157(int arg0, int arg1) {
        this.field2717 = arg0;
        this.field2718 = arg1;
        if (this.field2714 == null) {
            class186.method26(this, 255, this.field2712, this.field2717, (byte) 0, true);
        } else {
            class184.method12(this.field2712, this.field2714, this);
        }
    }

    @ObfuscatedName("gy.cs(I[BZZI)V")
    public void method3158(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2688[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2688[arg0];
            if (this.field2710 != null) {
                class117 var10 = this.field2710;
                class181 var11 = new class181();
                var11.field2674 = 0;
                var11.field1867 = (long) arg0;
                var11.field2676 = arg1;
                var11.field2671 = var10;
                class129 var12 = class184.field2706;
                synchronized (class184.field2706) {
                    class184.field2706.method2245(var11);
                }
                class184.method3035();
                this.field2719[arg0] = true;
            }
            if (arg3) {
                this.field2700[arg0] = class157.method2076(arg1, false);
            }
            return;
        }
        if (this.field2713) {
            throw new RuntimeException();
        }
        if (this.field2714 != null) {
            int var5 = this.field2712;
            class117 var6 = this.field2714;
            class181 var7 = new class181();
            var7.field2674 = 0;
            var7.field1867 = (long) var5;
            var7.field2676 = arg1;
            var7.field2671 = var6;
            class129 var8 = class184.field2706;
            synchronized (class184.field2706) {
                class184.field2706.method2245(var7);
            }
            class184.method3035();
        }
        this.method3059(arg1);
        this.method3160();
    }

    @ObfuscatedName("gy.cl(Ldw;I[BZB)V")
    public void method3159(class117 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2714 != arg0) {
            if (!arg3 && this.field2711 == arg1) {
                this.field2713 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2719[arg1] = false;
                if (this.field2715 || arg3) {
                    class186.method26(this, this.field2712, arg1, this.field2687[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2716.reset();
            field2716.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2716.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2687[arg1] != var9 || this.field2688[arg1] != var10) {
                this.field2719[arg1] = false;
                if (this.field2715 || arg3) {
                    class186.method26(this, this.field2712, arg1, this.field2687[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2719[arg1] = true;
            if (arg3) {
                this.field2700[arg1] = class157.method2076(arg2, false);
            }
            return;
        }
        if (this.field2713) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class186.method26(this, 255, this.field2712, this.field2717, (byte) 0, true);
            return;
        }
        field2716.reset();
        field2716.update(arg2, 0, arg2.length);
        int var5 = (int) field2716.getValue();
        class154 var6 = new class154(class183.method114(arg2));
        int var7 = var6.method2708();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2712 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2593();
        }
        if (this.field2717 != var5 || this.field2718 != var8) {
            class186.method26(this, 255, this.field2712, this.field2717, (byte) 0, true);
            return;
        }
        this.method3059(arg2);
        this.method3160();
    }

    @ObfuscatedName("gy.cy(I)V")
    public void method3160() {
        this.field2719 = new boolean[this.field2700.length];
        for (int var1 = 0; var1 < this.field2719.length; var1++) {
            this.field2719[var1] = false;
        }
        if (this.field2710 == null) {
            this.field2713 = true;
            return;
        }
        this.field2711 = -1;
        for (int var2 = 0; var2 < this.field2719.length; var2++) {
            if (this.field2689[var2] > 0) {
                class184.method183(var2, this.field2710, this);
                this.field2711 = var2;
            }
        }
        if (this.field2711 == -1) {
            this.field2713 = true;
        }
    }

    @ObfuscatedName("gy.cp(II)I")
    public int method3161(int arg0) {
        if (this.field2700[arg0] != null) {
            return 100;
        } else if (this.field2719[arg0]) {
            return 100;
        } else {
            int var2 = this.field2712;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2724 != null && Statics.field2724.field1867 == var3) {
                var5 = Statics.field239.field2073 * 99 / (Statics.field239.field2078.length - Statics.field2724.field2678) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("gy.cj(I)I")
    public int method3154() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2700.length; var3++) {
            if (this.field2689[var3] > 0) {
                var1 += 100;
                var2 += this.method3161(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
