package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fl")
public class class169 extends class168 {

    @ObfuscatedName("fl.b")
    public class135 field2691;

    @ObfuscatedName("fl.q")
    public class135 field2689;

    @ObfuscatedName("fl.u")
    public int field2690;

    @ObfuscatedName("fl.t")
    public volatile boolean field2695 = false;

    @ObfuscatedName("fl.d")
    public boolean field2692 = false;

    @ObfuscatedName("fl.z")
    public volatile boolean[] field2693;

    @ObfuscatedName("fl.v")
    public static CRC32 field2698 = new CRC32();

    @ObfuscatedName("fl.aq")
    public int field2694;

    @ObfuscatedName("fl.ap")
    public int field2696;

    @ObfuscatedName("fl.ai")
    public int field2697 = -1;

    public class169(class135 arg0, class135 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2691 = arg0;
        this.field2689 = arg1;
        this.field2690 = arg2;
        this.field2692 = arg5;
        int var8 = this.field2690;
        if (Statics.field2723 == null) {
            class172.method769((class169) null, 255, 255, 0, (byte) 0, true);
            class172.field2730[var8] = this;
        } else {
            Statics.field2723.field1977 = var8 * 8 + 5;
            int var9 = Statics.field2723.method2360();
            int var10 = Statics.field2723.method2360();
            this.method3099(var9, var10);
        }
    }

    @ObfuscatedName("fl.bg(I)I")
    public int method3090() {
        if (this.field2695) {
            return 100;
        } else if (this.field2679 == null) {
            int var1 = this.field2690;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2725 != null && Statics.field2725.field3116 == var2) {
                var4 = Statics.field668.field1977 * 99 / (Statics.field668.field1981.length - Statics.field2725.field2740) + 1;
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

    @ObfuscatedName("fl.w(IB)V")
    public void method3022(int arg0) {
        int var2 = this.field2690;
        long var3 = (long) ((var2 << 16) + arg0);
        class173 var5 = (class173) class172.field2721.method3507(var3);
        if (var5 != null) {
            class172.field2720.method3595(var5);
        }
    }

    @ObfuscatedName("fl.m(IB)V")
    public void method3031(int arg0) {
        if (this.field2691 == null || this.field2693 == null || !this.field2693[arg0]) {
            class172.method769(this, this.field2690, arg0, this.field2673[arg0], (byte) 2, true);
        } else {
            class171.method3112(arg0, this.field2691, this);
        }
    }

    @ObfuscatedName("fl.ba(III)V")
    public void method3099(int arg0, int arg1) {
        this.field2694 = arg0;
        this.field2696 = arg1;
        if (this.field2689 == null) {
            class172.method769(this, 255, this.field2690, this.field2694, (byte) 0, true);
        } else {
            class171.method3112(this.field2690, this.field2689, this);
        }
    }

    @ObfuscatedName("fl.be(I[BZZI)V")
    public void method3097(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2695) {
                throw new RuntimeException();
            }
            if (this.field2689 != null) {
                class171.method2924(this.field2690, arg1, this.field2689);
            }
            this.method3087(arg1);
            this.method3093();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2674[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2674[arg0];
        if (this.field2691 != null) {
            class171.method2924(arg0, arg1, this.field2691);
            this.field2693[arg0] = true;
        }
        if (arg3) {
            this.field2679[arg0] = Statics.method712(arg1, false);
        }
    }

    @ObfuscatedName("fl.bc(Leq;I[BZB)V")
    public void method3092(class135 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2689 != arg0) {
            if (!arg3 && this.field2697 == arg1) {
                this.field2695 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2693[arg1] = false;
                if (this.field2692 || arg3) {
                    class172.method769(this, this.field2690, arg1, this.field2673[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2698.reset();
            field2698.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2698.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2673[arg1] != var9 || this.field2674[arg1] != var10) {
                this.field2693[arg1] = false;
                if (this.field2692 || arg3) {
                    class172.method769(this, this.field2690, arg1, this.field2673[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2693[arg1] = true;
            if (arg3) {
                this.field2679[arg1] = Statics.method712(arg2, false);
            }
            return;
        }
        if (this.field2695) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class172.method769(this, 255, this.field2690, this.field2694, (byte) 0, true);
            return;
        }
        field2698.reset();
        field2698.update(arg2, 0, arg2.length);
        int var5 = (int) field2698.getValue();
        class120 var6 = new class120(class168.method2282(arg2));
        int var7 = var6.method2355();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2690 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2360();
        }
        if (this.field2694 != var5 || this.field2696 != var8) {
            class172.method769(this, 255, this.field2690, this.field2694, (byte) 0, true);
            return;
        }
        this.method3087(arg2);
        this.method3093();
    }

    @ObfuscatedName("fl.bk(B)V")
    public void method3093() {
        this.field2693 = new boolean[this.field2679.length];
        for (int var1 = 0; var1 < this.field2693.length; var1++) {
            this.field2693[var1] = false;
        }
        if (this.field2691 == null) {
            this.field2695 = true;
            return;
        }
        this.field2697 = -1;
        for (int var2 = 0; var2 < this.field2693.length; var2++) {
            if (this.field2675[var2] > 0) {
                class135 var3 = this.field2691;
                class170 var5 = new class170();
                var5.field2704 = 1;
                var5.field3116 = (long) var2;
                var5.field2701 = var3;
                var5.field2702 = this;
                class200 var6 = class171.field2709;
                synchronized (class171.field2709) {
                    class171.field2709.method3553(var5);
                }
                Object var8 = class171.field2710;
                synchronized (class171.field2710) {
                    if (class171.field2708 == 0) {
                        Statics.field2029.method2715(new class171(), 5);
                    }
                    class171.field2708 = 600;
                }
                this.field2697 = var2;
            }
        }
        if (this.field2697 == -1) {
            this.field2695 = true;
        }
    }

    @ObfuscatedName("fl.bb(II)I")
    public int method3095(int arg0) {
        if (this.field2679[arg0] != null) {
            return 100;
        } else if (this.field2693[arg0]) {
            return 100;
        } else {
            int var2 = this.field2690;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2725 != null && Statics.field2725.field3116 == var3) {
                var5 = Statics.field668.field1977 * 99 / (Statics.field668.field1981.length - Statics.field2725.field2740) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("fl.bz(B)I")
    public int method3103() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2679.length; var3++) {
            if (this.field2675[var3] > 0) {
                var1 += 100;
                var2 += this.method3095(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
