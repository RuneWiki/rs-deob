package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fm")
public class class172 extends class171 {

    @ObfuscatedName("fm.y")
    public class138 field2755;

    @ObfuscatedName("fm.s")
    public class138 field2751;

    @ObfuscatedName("fm.e")
    public int field2752;

    @ObfuscatedName("fm.h")
    public volatile boolean field2750 = false;

    @ObfuscatedName("fm.l")
    public boolean field2754 = false;

    @ObfuscatedName("fm.c")
    public volatile boolean[] field2761;

    @ObfuscatedName("fm.f")
    public static CRC32 field2756 = new CRC32();

    @ObfuscatedName("fm.ac")
    public int field2757;

    @ObfuscatedName("fm.as")
    public int field2758;

    @ObfuscatedName("fm.af")
    public int field2759 = -1;

    public class172(class138 arg0, class138 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2755 = arg0;
        this.field2751 = arg1;
        this.field2752 = arg2;
        this.field2754 = arg5;
        class175.method2646(this, this.field2752);
    }

    @ObfuscatedName("fm.bz(I)I")
    public int method3191() {
        if (this.field2750) {
            return 100;
        } else if (this.field2738 == null) {
            int var1 = this.field2752;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field1678 != null && Statics.field1678.field3171 == var2) {
                var4 = Statics.field2051.field2071 * 99 / (Statics.field2051.field2076.length - Statics.field1678.field2803) + 1;
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

    @ObfuscatedName("fm.d(II)V")
    public void method3116(int arg0) {
        int var2 = this.field2752;
        long var3 = (long) ((var2 << 16) + arg0);
        class176 var5 = (class176) class175.field2788.method3580(var3);
        if (var5 != null) {
            class175.field2781.method3689(var5);
        }
    }

    @ObfuscatedName("fm.k(II)V")
    public void method3125(int arg0) {
        if (this.field2755 == null || this.field2761 == null || !this.field2761[arg0]) {
            class175.method734(this, this.field2752, arg0, this.field2736[arg0], (byte) 2, true);
            return;
        }
        class138 var2 = this.field2755;
        byte[] var4 = null;
        class203 var5 = class174.field2775;
        synchronized (class174.field2775) {
            for (class173 var6 = (class173) class174.field2775.method3617(); var6 != null; var6 = (class173) class174.field2775.method3632()) {
                if ((long) arg0 == var6.field3171 && var6.field2764 == var2 && var6.field2768 == 0) {
                    var4 = var6.field2763;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2763(arg0);
            this.method3190(var2, arg0, var8, true);
        } else {
            this.method3190(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("fm.br(IIB)V")
    public void method3201(int arg0, int arg1) {
        this.field2757 = arg0;
        this.field2758 = arg1;
        if (this.field2751 == null) {
            class175.method734(this, 255, this.field2752, this.field2757, (byte) 0, true);
            return;
        }
        int var3 = this.field2752;
        class138 var4 = this.field2751;
        byte[] var6 = null;
        class203 var7 = class174.field2775;
        synchronized (class174.field2775) {
            for (class173 var8 = (class173) class174.field2775.method3617(); var8 != null; var8 = (class173) class174.field2775.method3632()) {
                if ((long) var3 == var8.field3171 && var8.field2764 == var4 && var8.field2768 == 0) {
                    var6 = var8.field2763;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2763(var3);
            this.method3190(var4, var3, var10, true);
        } else {
            this.method3190(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("fm.cb(I[BZZI)V")
    public void method3194(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2750) {
                throw new RuntimeException();
            }
            if (this.field2751 != null) {
                class174.method3015(this.field2752, arg1, this.field2751);
            }
            this.method3115(arg1);
            this.method3205();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2732[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2732[arg0];
        if (this.field2755 != null) {
            class174.method3015(arg0, arg1, this.field2755);
            this.field2761[arg0] = true;
        }
        if (arg3) {
            this.field2738[arg0] = class129.method2674(arg1, false);
        }
    }

    @ObfuscatedName("fm.ch(Les;I[BZB)V")
    public void method3190(class138 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2751 != arg0) {
            if (!arg3 && this.field2759 == arg1) {
                this.field2750 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2761[arg1] = false;
                if (this.field2754 || arg3) {
                    class175.method734(this, this.field2752, arg1, this.field2736[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2756.reset();
            field2756.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2756.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2736[arg1] != var9 || this.field2732[arg1] != var10) {
                this.field2761[arg1] = false;
                if (this.field2754 || arg3) {
                    class175.method734(this, this.field2752, arg1, this.field2736[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2761[arg1] = true;
            if (arg3) {
                this.field2738[arg1] = class129.method2674(arg2, false);
            }
            return;
        }
        if (this.field2750) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class175.method734(this, 255, this.field2752, this.field2757, (byte) 0, true);
            return;
        }
        field2756.reset();
        field2756.update(arg2, 0, arg2.length);
        int var5 = (int) field2756.getValue();
        class123 var6 = new class123(class171.method2461(arg2));
        int var7 = var6.method2395();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2752 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2400();
        }
        if (this.field2757 != var5 || this.field2758 != var8) {
            class175.method734(this, 255, this.field2752, this.field2757, (byte) 0, true);
            return;
        }
        this.method3115(arg2);
        this.method3205();
    }

    @ObfuscatedName("fm.cw(I)V")
    public void method3205() {
        this.field2761 = new boolean[this.field2738.length];
        for (int var1 = 0; var1 < this.field2761.length; var1++) {
            this.field2761[var1] = false;
        }
        if (this.field2755 == null) {
            this.field2750 = true;
            return;
        }
        this.field2759 = -1;
        for (int var2 = 0; var2 < this.field2761.length; var2++) {
            if (this.field2742[var2] > 0) {
                class138 var3 = this.field2755;
                class173 var5 = new class173();
                var5.field2768 = 1;
                var5.field3171 = (long) var2;
                var5.field2764 = var3;
                var5.field2769 = this;
                class203 var6 = class174.field2775;
                synchronized (class174.field2775) {
                    class174.field2775.method3612(var5);
                }
                Statics.method3047();
                this.field2759 = var2;
            }
        }
        if (this.field2759 == -1) {
            this.field2750 = true;
        }
    }

    @ObfuscatedName("fm.cr(II)I")
    public int method3196(int arg0) {
        if (this.field2738[arg0] != null) {
            return 100;
        } else if (this.field2761[arg0]) {
            return 100;
        } else {
            int var2 = this.field2752;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field1678 != null && Statics.field1678.field3171 == var3) {
                var5 = Statics.field2051.field2071 * 99 / (Statics.field2051.field2076.length - Statics.field1678.field2803) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("fm.ci(I)I")
    public int method3197() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2738.length; var3++) {
            if (this.field2742[var3] > 0) {
                var1 += 100;
                var2 += this.method3196(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
