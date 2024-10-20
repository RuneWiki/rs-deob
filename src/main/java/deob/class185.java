package deob;

import java.util.zip.CRC32;

@ObfuscatedName("gj")
public class class185 extends class183 {

    @ObfuscatedName("gj.r")
    public class117 field2736;

    @ObfuscatedName("gj.u")
    public class117 field2734;

    @ObfuscatedName("gj.e")
    public int field2735;

    @ObfuscatedName("gj.h")
    public volatile boolean field2740 = false;

    @ObfuscatedName("gj.d")
    public boolean field2737 = false;

    @ObfuscatedName("gj.z")
    public volatile boolean[] field2738;

    @ObfuscatedName("gj.t")
    public static CRC32 field2746 = new CRC32();

    @ObfuscatedName("gj.ab")
    public int field2733;

    @ObfuscatedName("gj.ac")
    public int field2739;

    @ObfuscatedName("gj.au")
    public int field2742 = -1;

    public class185(class117 arg0, class117 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2736 = arg0;
        this.field2734 = arg1;
        this.field2735 = arg2;
        this.field2737 = arg5;
        class186.method111(this, this.field2735);
    }

    @ObfuscatedName("gj.co(I)I")
    public int method3253() {
        if (this.field2740) {
            return 100;
        } else if (this.field2727 == null) {
            int var1 = class186.method2236(255, this.field2735);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("gj.n(IB)V")
    public void method3152(int arg0) {
        class186.method2183(this.field2735, arg0);
    }

    @ObfuscatedName("gj.o(IB)V")
    public void method3212(int arg0) {
        if (this.field2736 == null || this.field2738 == null || !this.field2738[arg0]) {
            Statics.method865(this, this.field2735, arg0, this.field2713[arg0], (byte) 2, true);
        } else {
            class184.method104(arg0, this.field2736, this);
        }
    }

    @ObfuscatedName("gj.cm(IIB)V")
    public void method3242(int arg0, int arg1) {
        this.field2733 = arg0;
        this.field2739 = arg1;
        if (this.field2734 == null) {
            Statics.method865(this, 255, this.field2735, this.field2733, (byte) 0, true);
        } else {
            class184.method104(this.field2735, this.field2734, this);
        }
    }

    @ObfuscatedName("gj.ca(I[BZZB)V")
    public void method3243(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2740) {
                throw new RuntimeException();
            }
            if (this.field2734 != null) {
                class184.method226(this.field2735, arg1, this.field2734);
            }
            this.method3181(arg1);
            this.method3263();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2712[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2712[arg0];
        if (this.field2736 != null) {
            class184.method226(arg0, arg1, this.field2736);
            this.field2738[arg0] = true;
        }
        if (arg3) {
            this.field2727[arg0] = class157.method2059(arg1, false);
        }
    }

    @ObfuscatedName("gj.cp(Ldb;I[BZI)V")
    public void method3244(class117 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2734 != arg0) {
            if (!arg3 && this.field2742 == arg1) {
                this.field2740 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2738[arg1] = false;
                if (this.field2737 || arg3) {
                    Statics.method865(this, this.field2735, arg1, this.field2713[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2746.reset();
            field2746.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2746.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2713[arg1] != var9 || this.field2712[arg1] != var10) {
                this.field2738[arg1] = false;
                if (this.field2737 || arg3) {
                    Statics.method865(this, this.field2735, arg1, this.field2713[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2738[arg1] = true;
            if (arg3) {
                this.field2727[arg1] = class157.method2059(arg2, false);
            }
            return;
        }
        if (this.field2740) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            Statics.method865(this, 255, this.field2735, this.field2733, (byte) 0, true);
            return;
        }
        field2746.reset();
        field2746.update(arg2, 0, arg2.length);
        int var5 = (int) field2746.getValue();
        class154 var6 = new class154(class183.method166(arg2));
        int var7 = var6.method2878();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2735 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2803();
        }
        if (this.field2733 != var5 || this.field2739 != var8) {
            Statics.method865(this, 255, this.field2735, this.field2733, (byte) 0, true);
            return;
        }
        this.method3181(arg2);
        this.method3263();
    }

    @ObfuscatedName("gj.cc(I)V")
    public void method3263() {
        this.field2738 = new boolean[this.field2727.length];
        for (int var1 = 0; var1 < this.field2738.length; var1++) {
            this.field2738[var1] = false;
        }
        if (this.field2736 == null) {
            this.field2740 = true;
            return;
        }
        this.field2742 = -1;
        for (int var2 = 0; var2 < this.field2738.length; var2++) {
            if (this.field2715[var2] > 0) {
                class117 var3 = this.field2736;
                class181 var5 = new class181();
                var5.field2696 = 1;
                var5.field1884 = (long) var2;
                var5.field2692 = var3;
                var5.field2693 = this;
                class129 var6 = class184.field2732;
                synchronized (class184.field2732) {
                    class184.field2732.method2360(var5);
                }
                Object var8 = class184.field2728;
                synchronized (class184.field2728) {
                    if (class184.field2730 == 0) {
                        Statics.field1794.method1954(new class184(), 5);
                    }
                    class184.field2730 = 600;
                }
                this.field2742 = var2;
            }
        }
        if (this.field2742 == -1) {
            this.field2740 = true;
        }
    }

    @ObfuscatedName("gj.cq(II)I")
    public int method3246(int arg0) {
        if (this.field2727[arg0] == null) {
            return this.field2738[arg0] ? 100 : class186.method2236(this.field2735, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("gj.cl(I)I")
    public int method3247() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2727.length; var3++) {
            if (this.field2715[var3] > 0) {
                var1 += 100;
                var2 += this.method3246(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
