package deob;

import java.util.zip.CRC32;

@ObfuscatedName("gm")
public class class185 extends class183 {

    @ObfuscatedName("gm.d")
    public class117 field2740;

    @ObfuscatedName("gm.y")
    public class117 field2732;

    @ObfuscatedName("gm.s")
    public int field2731;

    @ObfuscatedName("gm.t")
    public volatile boolean field2734 = false;

    @ObfuscatedName("gm.z")
    public boolean field2735 = false;

    @ObfuscatedName("gm.b")
    public volatile boolean[] field2745;

    @ObfuscatedName("gm.o")
    public static CRC32 field2737 = new CRC32();

    @ObfuscatedName("gm.ak")
    public int field2738;

    @ObfuscatedName("gm.ai")
    public int field2733;

    @ObfuscatedName("gm.aq")
    public int field2739 = -1;

    public class185(class117 arg0, class117 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2740 = arg0;
        this.field2732 = arg1;
        this.field2731 = arg2;
        this.field2735 = arg5;
        int var8 = this.field2731;
        if (Statics.field2001 == null) {
            class186.method3005((class185) null, 255, 255, 0, (byte) 0, true);
            class186.field2762[var8] = this;
        } else {
            Statics.field2001.field2091 = var8 * 8 + 5;
            int var9 = Statics.field2001.method2658();
            int var10 = Statics.field2001.method2658();
            this.method3122(var9, var10);
        }
    }

    @ObfuscatedName("gm.cv(I)I")
    public int method3119() {
        if (this.field2734) {
            return 100;
        } else if (this.field2719 == null) {
            int var1 = this.field2731;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2150 != null && Statics.field2150.field1879 == var2) {
                var4 = Statics.field2759.field2091 * 99 / (Statics.field2759.field2094.length - Statics.field2150.field2702) + 1;
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

    @ObfuscatedName("gm.e(IB)V")
    public void method3013(int arg0) {
        class186.method1893(this.field2731, arg0);
    }

    @ObfuscatedName("gm.l(IB)V")
    public void method3089(int arg0) {
        if (this.field2740 == null || this.field2745 == null || !this.field2745[arg0]) {
            class186.method3005(this, this.field2731, arg0, this.field2711[arg0], (byte) 2, true);
            return;
        }
        class117 var2 = this.field2740;
        byte[] var4 = null;
        class129 var5 = class184.field2727;
        synchronized (class184.field2727) {
            for (class181 var6 = (class181) class184.field2727.method2209(); var6 != null; var6 = (class181) class184.field2727.method2211()) {
                if ((long) arg0 == var6.field1879 && var6.field2694 == var2 && var6.field2693 == 0) {
                    var4 = var6.field2692;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2058(arg0);
            this.method3123(var2, arg0, var8, true);
        } else {
            this.method3123(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("gm.cc(III)V")
    public void method3122(int arg0, int arg1) {
        this.field2738 = arg0;
        this.field2733 = arg1;
        if (this.field2732 == null) {
            class186.method3005(this, 255, this.field2731, this.field2738, (byte) 0, true);
            return;
        }
        int var3 = this.field2731;
        class117 var4 = this.field2732;
        byte[] var6 = null;
        class129 var7 = class184.field2727;
        synchronized (class184.field2727) {
            for (class181 var8 = (class181) class184.field2727.method2209(); var8 != null; var8 = (class181) class184.field2727.method2211()) {
                if ((long) var3 == var8.field1879 && var8.field2694 == var4 && var8.field2693 == 0) {
                    var6 = var8.field2692;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2058(var3);
            this.method3123(var4, var3, var10, true);
        } else {
            this.method3123(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("gm.cg(I[BZZI)V")
    public void method3121(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2734) {
                throw new RuntimeException();
            }
            if (this.field2732 != null) {
                class184.method15(this.field2731, arg1, this.field2732);
            }
            this.method3012(arg1);
            this.method3124();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2717[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2717[arg0];
        if (this.field2740 != null) {
            class184.method15(arg0, arg1, this.field2740);
            this.field2745[arg0] = true;
        }
        if (arg3) {
            this.field2719[arg0] = class157.method163(arg1, false);
        }
    }

    @ObfuscatedName("gm.cl(Ldb;I[BZI)V")
    public void method3123(class117 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2732 != arg0) {
            if (!arg3 && this.field2739 == arg1) {
                this.field2734 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2745[arg1] = false;
                if (this.field2735 || arg3) {
                    class186.method3005(this, this.field2731, arg1, this.field2711[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2737.reset();
            field2737.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2737.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2711[arg1] != var9 || this.field2717[arg1] != var10) {
                this.field2745[arg1] = false;
                if (this.field2735 || arg3) {
                    class186.method3005(this, this.field2731, arg1, this.field2711[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2745[arg1] = true;
            if (arg3) {
                this.field2719[arg1] = class157.method163(arg2, false);
            }
            return;
        }
        if (this.field2734) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class186.method3005(this, 255, this.field2731, this.field2738, (byte) 0, true);
            return;
        }
        field2737.reset();
        field2737.update(arg2, 0, arg2.length);
        int var5 = (int) field2737.getValue();
        class154 var6 = new class154(class183.method2052(arg2));
        int var7 = var6.method2573();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2731 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2658();
        }
        if (this.field2738 != var5 || this.field2733 != var8) {
            class186.method3005(this, 255, this.field2731, this.field2738, (byte) 0, true);
            return;
        }
        this.method3012(arg2);
        this.method3124();
    }

    @ObfuscatedName("gm.cu(I)V")
    public void method3124() {
        this.field2745 = new boolean[this.field2719.length];
        for (int var1 = 0; var1 < this.field2745.length; var1++) {
            this.field2745[var1] = false;
        }
        if (this.field2740 == null) {
            this.field2734 = true;
            return;
        }
        this.field2739 = -1;
        for (int var2 = 0; var2 < this.field2745.length; var2++) {
            if (this.field2713[var2] > 0) {
                class184.method2549(var2, this.field2740, this);
                this.field2739 = var2;
            }
        }
        if (this.field2739 == -1) {
            this.field2734 = true;
        }
    }

    @ObfuscatedName("gm.cp(II)I")
    public int method3126(int arg0) {
        if (this.field2719[arg0] != null) {
            return 100;
        } else if (this.field2745[arg0]) {
            return 100;
        } else {
            int var2 = this.field2731;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2150 != null && Statics.field2150.field1879 == var3) {
                var5 = Statics.field2759.field2091 * 99 / (Statics.field2759.field2094.length - Statics.field2150.field2702) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("gm.ce(I)I")
    public int method3125() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2719.length; var3++) {
            if (this.field2713[var3] > 0) {
                var1 += 100;
                var2 += this.method3126(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
