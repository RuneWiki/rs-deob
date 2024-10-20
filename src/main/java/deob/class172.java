package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fm")
public class class172 extends class171 {

    @ObfuscatedName("fm.y")
    public class138 field2737;

    @ObfuscatedName("fm.m")
    public class138 field2732;

    @ObfuscatedName("fm.v")
    public int field2733;

    @ObfuscatedName("fm.k")
    public volatile boolean field2731 = false;

    @ObfuscatedName("fm.n")
    public boolean field2735 = false;

    @ObfuscatedName("fm.d")
    public volatile boolean[] field2736;

    @ObfuscatedName("fm.s")
    public static CRC32 field2740 = new CRC32();

    @ObfuscatedName("fm.ah")
    public int field2738;

    @ObfuscatedName("fm.ak")
    public int field2739;

    @ObfuscatedName("fm.as")
    public int field2734 = -1;

    public class172(class138 arg0, class138 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2737 = arg0;
        this.field2732 = arg1;
        this.field2733 = arg2;
        this.field2735 = arg5;
        int var8 = this.field2733;
        if (Statics.field1018 == null) {
            class175.method1868((class172) null, 255, 255, 0, (byte) 0, true);
            class175.field2758[var8] = this;
        } else {
            Statics.field1018.field2062 = var8 * 8 + 5;
            int var9 = Statics.field1018.method2468();
            int var10 = Statics.field1018.method2468();
            this.method3217(var9, var10);
        }
    }

    @ObfuscatedName("fm.ct(I)I")
    public int method3229() {
        if (this.field2731) {
            return 100;
        } else if (this.field2718 == null) {
            int var1 = this.field2733;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field218 != null && Statics.field218.field3162 == var2) {
                var4 = Statics.field260.field2062 * 99 / (Statics.field260.field2055.length - Statics.field218.field2780) + 1;
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

    @ObfuscatedName("fm.l(II)V")
    public void method3187(int arg0) {
        class175.method38(this.field2733, arg0);
    }

    @ObfuscatedName("fm.i(II)V")
    public void method3140(int arg0) {
        if (this.field2737 == null || this.field2736 == null || !this.field2736[arg0]) {
            class175.method1868(this, this.field2733, arg0, this.field2711[arg0], (byte) 2, true);
            return;
        }
        class138 var2 = this.field2737;
        byte[] var4 = null;
        class203 var5 = class174.field2751;
        synchronized (class174.field2751) {
            for (class173 var6 = (class173) class174.field2751.method3654(); var6 != null; var6 = (class173) class174.field2751.method3673()) {
                if ((long) arg0 == var6.field3162 && var6.field2743 == var2 && var6.field2746 == 0) {
                    var4 = var6.field2748;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2827(arg0);
            this.method3220(var2, arg0, var8, true);
        } else {
            this.method3220(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("fm.cp(IIB)V")
    public void method3217(int arg0, int arg1) {
        this.field2738 = arg0;
        this.field2739 = arg1;
        if (this.field2732 == null) {
            class175.method1868(this, 255, this.field2733, this.field2738, (byte) 0, true);
            return;
        }
        int var3 = this.field2733;
        class138 var4 = this.field2732;
        byte[] var6 = null;
        class203 var7 = class174.field2751;
        synchronized (class174.field2751) {
            for (class173 var8 = (class173) class174.field2751.method3654(); var8 != null; var8 = (class173) class174.field2751.method3673()) {
                if ((long) var3 == var8.field3162 && var8.field2743 == var4 && var8.field2746 == 0) {
                    var6 = var8.field2748;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2827(var3);
            this.method3220(var4, var3, var10, true);
        } else {
            this.method3220(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("fm.cu(I[BZZI)V")
    public void method3219(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2731) {
                throw new RuntimeException();
            }
            if (this.field2732 != null) {
                class174.method45(this.field2733, arg1, this.field2732);
            }
            this.method3137(arg1);
            this.method3221();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2713[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2713[arg0];
        if (this.field2737 != null) {
            class174.method45(arg0, arg1, this.field2737);
            this.field2736[arg0] = true;
        }
        if (arg3) {
            this.field2718[arg0] = class129.method856(arg1, false);
        }
    }

    @ObfuscatedName("fm.cq(Lei;I[BZI)V")
    public void method3220(class138 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2732 != arg0) {
            if (!arg3 && this.field2734 == arg1) {
                this.field2731 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2736[arg1] = false;
                if (this.field2735 || arg3) {
                    class175.method1868(this, this.field2733, arg1, this.field2711[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2740.reset();
            field2740.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2740.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2711[arg1] != var9 || this.field2713[arg1] != var10) {
                this.field2736[arg1] = false;
                if (this.field2735 || arg3) {
                    class175.method1868(this, this.field2733, arg1, this.field2711[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2736[arg1] = true;
            if (arg3) {
                this.field2718[arg1] = class129.method856(arg2, false);
            }
            return;
        }
        if (this.field2731) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class175.method1868(this, 255, this.field2733, this.field2738, (byte) 0, true);
            return;
        }
        field2740.reset();
        field2740.update(arg2, 0, arg2.length);
        int var5 = (int) field2740.getValue();
        class123 var6 = new class123(class171.method1293(arg2));
        int var7 = var6.method2464();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2733 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2468();
        }
        if (this.field2738 != var5 || this.field2739 != var8) {
            class175.method1868(this, 255, this.field2733, this.field2738, (byte) 0, true);
            return;
        }
        this.method3137(arg2);
        this.method3221();
    }

    @ObfuscatedName("fm.cm(I)V")
    public void method3221() {
        this.field2736 = new boolean[this.field2718.length];
        for (int var1 = 0; var1 < this.field2736.length; var1++) {
            this.field2736[var1] = false;
        }
        if (this.field2737 == null) {
            this.field2731 = true;
            return;
        }
        this.field2734 = -1;
        for (int var2 = 0; var2 < this.field2736.length; var2++) {
            if (this.field2723[var2] > 0) {
                class138 var3 = this.field2737;
                class173 var5 = new class173();
                var5.field2746 = 1;
                var5.field3162 = (long) var2;
                var5.field2743 = var3;
                var5.field2741 = this;
                class203 var6 = class174.field2751;
                synchronized (class174.field2751) {
                    class174.field2751.method3650(var5);
                }
                class174.method2716();
                this.field2734 = var2;
            }
        }
        if (this.field2734 == -1) {
            this.field2731 = true;
        }
    }

    @ObfuscatedName("fm.cz(II)I")
    public int method3218(int arg0) {
        if (this.field2718[arg0] != null) {
            return 100;
        } else if (this.field2736[arg0]) {
            return 100;
        } else {
            int var2 = this.field2733;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field218 != null && Statics.field218.field3162 == var3) {
                var5 = Statics.field260.field2062 * 99 / (Statics.field260.field2055.length - Statics.field218.field2780) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("fm.ci(I)I")
    public int method3222() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2718.length; var3++) {
            if (this.field2723[var3] > 0) {
                var1 += 100;
                var2 += this.method3218(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
