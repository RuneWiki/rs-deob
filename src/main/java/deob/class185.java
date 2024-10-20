package deob;

import java.util.zip.CRC32;

@ObfuscatedName("gk")
public class class185 extends class183 {

    @ObfuscatedName("gk.q")
    public class117 field2739;

    @ObfuscatedName("gk.c")
    public class117 field2733;

    @ObfuscatedName("gk.v")
    public int field2734;

    @ObfuscatedName("gk.e")
    public volatile boolean field2732 = false;

    @ObfuscatedName("gk.j")
    public boolean field2736 = false;

    @ObfuscatedName("gk.d")
    public volatile boolean[] field2737;

    @ObfuscatedName("gk.g")
    public static CRC32 field2738 = new CRC32();

    @ObfuscatedName("gk.ap")
    public int field2735;

    @ObfuscatedName("gk.aj")
    public int field2740;

    @ObfuscatedName("gk.ab")
    public int field2741 = -1;

    public class185(class117 arg0, class117 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2739 = arg0;
        this.field2733 = arg1;
        this.field2734 = arg2;
        this.field2736 = arg5;
        class186.method1984(this, this.field2734);
    }

    @ObfuscatedName("gk.cw(I)I")
    public int method3234() {
        if (this.field2732) {
            return 100;
        } else if (this.field2719 == null) {
            int var1 = this.field2734;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2182 != null && Statics.field2182.field1879 == var2) {
                var4 = Statics.field84.field2085 * 99 / (Statics.field84.field2083.length - Statics.field2182.field2703) + 1;
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

    @ObfuscatedName("gk.l(II)V")
    public void method3149(int arg0) {
        class186.method781(this.field2734, arg0);
    }

    @ObfuscatedName("gk.y(II)V")
    public void method3158(int arg0) {
        if (this.field2739 == null || this.field2737 == null || !this.field2737[arg0]) {
            class186.method2899(this, this.field2734, arg0, this.field2711[arg0], (byte) 2, true);
        } else {
            class184.method2513(arg0, this.field2739, this);
        }
    }

    @ObfuscatedName("gk.cz(IIB)V")
    public void method3237(int arg0, int arg1) {
        this.field2735 = arg0;
        this.field2740 = arg1;
        if (this.field2733 == null) {
            class186.method2899(this, 255, this.field2734, this.field2735, (byte) 0, true);
        } else {
            class184.method2513(this.field2734, this.field2733, this);
        }
    }

    @ObfuscatedName("gk.ce(I[BZZI)V")
    public void method3236(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2712[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2712[arg0];
            if (this.field2739 != null) {
                class117 var12 = this.field2739;
                class181 var13 = new class181();
                var13.field2698 = 0;
                var13.field1879 = (long) arg0;
                var13.field2696 = arg1;
                var13.field2697 = var12;
                class129 var14 = class184.field2731;
                synchronized (class184.field2731) {
                    class184.field2731.method2320(var13);
                }
                Object var16 = class184.field2729;
                synchronized (class184.field2729) {
                    if (class184.field2728 == 0) {
                        Statics.field580.method1923(new class184(), 5);
                    }
                    class184.field2728 = 600;
                }
                this.field2737[arg0] = true;
            }
            if (arg3) {
                this.field2719[arg0] = class157.method3713(arg1, false);
            }
            return;
        }
        if (this.field2732) {
            throw new RuntimeException();
        }
        if (this.field2733 != null) {
            int var5 = this.field2734;
            class117 var6 = this.field2733;
            class181 var7 = new class181();
            var7.field2698 = 0;
            var7.field1879 = (long) var5;
            var7.field2696 = arg1;
            var7.field2697 = var6;
            class129 var8 = class184.field2731;
            synchronized (class184.field2731) {
                class184.field2731.method2320(var7);
            }
            Object var10 = class184.field2729;
            synchronized (class184.field2729) {
                if (class184.field2728 == 0) {
                    Statics.field580.method1923(new class184(), 5);
                }
                class184.field2728 = 600;
            }
        }
        this.method3150(arg1);
        this.method3238();
    }

    @ObfuscatedName("gk.cn(Ldu;I[BZB)V")
    public void method3261(class117 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2733 != arg0) {
            if (!arg3 && this.field2741 == arg1) {
                this.field2732 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2737[arg1] = false;
                if (this.field2736 || arg3) {
                    class186.method2899(this, this.field2734, arg1, this.field2711[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2738.reset();
            field2738.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2738.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2711[arg1] != var9 || this.field2712[arg1] != var10) {
                this.field2737[arg1] = false;
                if (this.field2736 || arg3) {
                    class186.method2899(this, this.field2734, arg1, this.field2711[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2737[arg1] = true;
            if (arg3) {
                this.field2719[arg1] = class157.method3713(arg2, false);
            }
            return;
        }
        if (this.field2732) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class186.method2899(this, 255, this.field2734, this.field2735, (byte) 0, true);
            return;
        }
        field2738.reset();
        field2738.update(arg2, 0, arg2.length);
        int var5 = (int) field2738.getValue();
        class154 var6 = new class154(class183.method2955(arg2));
        int var7 = var6.method2678();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2734 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2683();
        }
        if (this.field2735 != var5 || this.field2740 != var8) {
            class186.method2899(this, 255, this.field2734, this.field2735, (byte) 0, true);
            return;
        }
        this.method3150(arg2);
        this.method3238();
    }

    @ObfuscatedName("gk.cl(B)V")
    public void method3238() {
        this.field2737 = new boolean[this.field2719.length];
        for (int var1 = 0; var1 < this.field2737.length; var1++) {
            this.field2737[var1] = false;
        }
        if (this.field2739 == null) {
            this.field2732 = true;
            return;
        }
        this.field2741 = -1;
        for (int var2 = 0; var2 < this.field2737.length; var2++) {
            if (this.field2713[var2] > 0) {
                class117 var3 = this.field2739;
                class181 var5 = new class181();
                var5.field2698 = 1;
                var5.field1879 = (long) var2;
                var5.field2697 = var3;
                var5.field2695 = this;
                class129 var6 = class184.field2731;
                synchronized (class184.field2731) {
                    class184.field2731.method2320(var5);
                }
                Object var8 = class184.field2729;
                synchronized (class184.field2729) {
                    if (class184.field2728 == 0) {
                        Statics.field580.method1923(new class184(), 5);
                    }
                    class184.field2728 = 600;
                }
                this.field2741 = var2;
            }
        }
        if (this.field2741 == -1) {
            this.field2732 = true;
        }
    }

    @ObfuscatedName("gk.cb(IB)I")
    public int method3239(int arg0) {
        if (this.field2719[arg0] != null) {
            return 100;
        } else if (this.field2737[arg0]) {
            return 100;
        } else {
            int var2 = this.field2734;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2182 != null && Statics.field2182.field1879 == var3) {
                var5 = Statics.field84.field2085 * 99 / (Statics.field84.field2083.length - Statics.field2182.field2703) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("gk.ct(I)I")
    public int method3248() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2719.length; var3++) {
            if (this.field2713[var3] > 0) {
                var1 += 100;
                var2 += this.method3239(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
