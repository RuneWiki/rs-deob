package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fw")
public class class172 extends class171 {

    @ObfuscatedName("fw.e")
    public class138 field2754;

    @ObfuscatedName("fw.c")
    public class138 field2751;

    @ObfuscatedName("fw.n")
    public int field2752;

    @ObfuscatedName("fw.y")
    public volatile boolean field2759 = false;

    @ObfuscatedName("fw.k")
    public boolean field2755 = false;

    @ObfuscatedName("fw.w")
    public volatile boolean[] field2753;

    @ObfuscatedName("fw.o")
    public static CRC32 field2756 = new CRC32();

    @ObfuscatedName("fw.ah")
    public int field2757;

    @ObfuscatedName("fw.an")
    public int field2758;

    @ObfuscatedName("fw.ag")
    public int field2762 = -1;

    public class172(class138 arg0, class138 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2754 = arg0;
        this.field2751 = arg1;
        this.field2752 = arg2;
        this.field2755 = arg5;
        class175.method644(this, this.field2752);
    }

    @ObfuscatedName("fw.bm(I)I")
    public int method3152() {
        if (this.field2759) {
            return 100;
        } else if (this.field2738 == null) {
            int var1 = this.field2752;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field1466 != null && Statics.field1466.field3174 == var2) {
                var4 = Statics.field631.field2057 * 99 / (Statics.field631.field2056.length - Statics.field1466.field2802) + 1;
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

    @ObfuscatedName("fw.r(IB)V")
    public void method3076(int arg0) {
        class175.method1998(this.field2752, arg0);
    }

    @ObfuscatedName("fw.d(II)V")
    public void method3086(int arg0) {
        if (this.field2754 == null || this.field2753 == null || !this.field2753[arg0]) {
            class175.method2098(this, this.field2752, arg0, this.field2734[arg0], (byte) 2, true);
        } else {
            class174.method3010(arg0, this.field2754, this);
        }
    }

    @ObfuscatedName("fw.bj(III)V")
    public void method3153(int arg0, int arg1) {
        this.field2757 = arg0;
        this.field2758 = arg1;
        if (this.field2751 == null) {
            class175.method2098(this, 255, this.field2752, this.field2757, (byte) 0, true);
        } else {
            class174.method3010(this.field2752, this.field2751, this);
        }
    }

    @ObfuscatedName("fw.br(I[BZZI)V")
    public void method3154(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2759) {
                throw new RuntimeException();
            }
            if (this.field2751 != null) {
                class174.method2114(this.field2752, arg1, this.field2751);
            }
            this.method3093(arg1);
            this.method3159();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2741[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2741[arg0];
        if (this.field2754 != null) {
            class174.method2114(arg0, arg1, this.field2754);
            this.field2753[arg0] = true;
        }
        if (arg3) {
            this.field2738[arg0] = class129.method888(arg1, false);
        }
    }

    @ObfuscatedName("fw.cm(Lek;I[BZB)V")
    public void method3155(class138 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2751 != arg0) {
            if (!arg3 && this.field2762 == arg1) {
                this.field2759 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2753[arg1] = false;
                if (this.field2755 || arg3) {
                    class175.method2098(this, this.field2752, arg1, this.field2734[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2756.reset();
            field2756.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2756.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2734[arg1] != var9 || this.field2741[arg1] != var10) {
                this.field2753[arg1] = false;
                if (this.field2755 || arg3) {
                    class175.method2098(this, this.field2752, arg1, this.field2734[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2753[arg1] = true;
            if (arg3) {
                this.field2738[arg1] = class129.method888(arg2, false);
            }
            return;
        }
        if (this.field2759) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class175.method2098(this, 255, this.field2752, this.field2757, (byte) 0, true);
            return;
        }
        field2756.reset();
        field2756.update(arg2, 0, arg2.length);
        int var5 = (int) field2756.getValue();
        class123 var6 = new class123(class171.method1065(arg2));
        int var7 = var6.method2408();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2752 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2413();
        }
        if (this.field2757 != var5 || this.field2758 != var8) {
            class175.method2098(this, 255, this.field2752, this.field2757, (byte) 0, true);
            return;
        }
        this.method3093(arg2);
        this.method3159();
    }

    @ObfuscatedName("fw.ca(B)V")
    public void method3159() {
        this.field2753 = new boolean[this.field2738.length];
        for (int var1 = 0; var1 < this.field2753.length; var1++) {
            this.field2753[var1] = false;
        }
        if (this.field2754 == null) {
            this.field2759 = true;
            return;
        }
        this.field2762 = -1;
        for (int var2 = 0; var2 < this.field2753.length; var2++) {
            if (this.field2736[var2] > 0) {
                class138 var3 = this.field2754;
                class173 var5 = new class173();
                var5.field2765 = 1;
                var5.field3174 = (long) var2;
                var5.field2763 = var3;
                var5.field2766 = this;
                class203 var6 = class174.field2770;
                synchronized (class174.field2770) {
                    class174.field2770.method3594(var5);
                }
                class174.method1066();
                this.field2762 = var2;
            }
        }
        if (this.field2762 == -1) {
            this.field2759 = true;
        }
    }

    @ObfuscatedName("fw.cg(IB)I")
    public int method3157(int arg0) {
        if (this.field2738[arg0] != null) {
            return 100;
        } else if (this.field2753[arg0]) {
            return 100;
        } else {
            int var2 = this.field2752;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field1466 != null && Statics.field1466.field3174 == var3) {
                var5 = Statics.field631.field2057 * 99 / (Statics.field631.field2056.length - Statics.field1466.field2802) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("fw.cd(I)I")
    public int method3158() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2738.length; var3++) {
            if (this.field2736[var3] > 0) {
                var1 += 100;
                var2 += this.method3157(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
