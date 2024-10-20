package deob;

import java.util.zip.CRC32;

@ObfuscatedName("gf")
public class class185 extends class183 {

    @ObfuscatedName("gf.z")
    public class117 field2720;

    @ObfuscatedName("gf.u")
    public class117 field2718;

    @ObfuscatedName("gf.b")
    public int field2719;

    @ObfuscatedName("gf.m")
    public volatile boolean field2726 = false;

    @ObfuscatedName("gf.e")
    public boolean field2721 = false;

    @ObfuscatedName("gf.l")
    public volatile boolean[] field2727;

    @ObfuscatedName("gf.x")
    public static CRC32 field2723 = new CRC32();

    @ObfuscatedName("gf.ap")
    public int field2724;

    @ObfuscatedName("gf.aq")
    public int field2722;

    @ObfuscatedName("gf.aw")
    public int field2728 = -1;

    public class185(class117 arg0, class117 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2720 = arg0;
        this.field2718 = arg1;
        this.field2719 = arg2;
        this.field2721 = arg5;
        int var8 = this.field2719;
        if (Statics.field755 == null) {
            class186.method205((class185) null, 255, 255, 0, (byte) 0, true);
            class186.field2744[var8] = this;
        } else {
            Statics.field755.field2267 = var8 * 8 + 5;
            int var9 = Statics.field755.method2868();
            int var10 = Statics.field755.method2868();
            this.method3156(var9, var10);
        }
    }

    @ObfuscatedName("gf.ck(I)I")
    public int method3155() {
        if (this.field2726) {
            return 100;
        } else if (this.field2704 == null) {
            int var1 = class186.method1861(255, this.field2719);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("gf.y(II)V")
    public void method3064(int arg0) {
        class186.method1877(this.field2719, arg0);
    }

    @ObfuscatedName("gf.a(II)V")
    public void method3073(int arg0) {
        if (this.field2720 == null || this.field2727 == null || !this.field2727[arg0]) {
            class186.method205(this, this.field2719, arg0, this.field2700[arg0], (byte) 2, true);
        } else {
            class184.method195(arg0, this.field2720, this);
        }
    }

    @ObfuscatedName("gf.cy(IIB)V")
    public void method3156(int arg0, int arg1) {
        this.field2724 = arg0;
        this.field2722 = arg1;
        if (this.field2718 == null) {
            class186.method205(this, 255, this.field2719, this.field2724, (byte) 0, true);
        } else {
            class184.method195(this.field2719, this.field2718, this);
        }
    }

    @ObfuscatedName("gf.cn(I[BZZI)V")
    public void method3157(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2726) {
                throw new RuntimeException();
            }
            if (this.field2718 != null) {
                class184.method226(this.field2719, arg1, this.field2718);
            }
            this.method3063(arg1);
            this.method3162();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2699[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2699[arg0];
        if (this.field2720 != null) {
            class184.method226(arg0, arg1, this.field2720);
            this.field2727[arg0] = true;
        }
        if (arg3) {
            this.field2704[arg0] = class164.method126(arg1, false);
        }
    }

    @ObfuscatedName("gf.co(Ldx;I[BZB)V")
    public void method3171(class117 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2718 != arg0) {
            if (!arg3 && this.field2728 == arg1) {
                this.field2726 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2727[arg1] = false;
                if (this.field2721 || arg3) {
                    class186.method205(this, this.field2719, arg1, this.field2700[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2723.reset();
            field2723.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2723.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2700[arg1] != var9 || this.field2699[arg1] != var10) {
                this.field2727[arg1] = false;
                if (this.field2721 || arg3) {
                    class186.method205(this, this.field2719, arg1, this.field2700[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2727[arg1] = true;
            if (arg3) {
                this.field2704[arg1] = class164.method126(arg2, false);
            }
            return;
        }
        if (this.field2726) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class186.method205(this, 255, this.field2719, this.field2724, (byte) 0, true);
            return;
        }
        field2723.reset();
        field2723.update(arg2, 0, arg2.length);
        int var5 = (int) field2723.getValue();
        class161 var6 = new class161(class183.method1853(arg2));
        int var7 = var6.method2733();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2719 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2868();
        }
        if (this.field2724 != var5 || this.field2722 != var8) {
            class186.method205(this, 255, this.field2719, this.field2724, (byte) 0, true);
            return;
        }
        this.method3063(arg2);
        this.method3162();
    }

    @ObfuscatedName("gf.ca(I)V")
    public void method3162() {
        this.field2727 = new boolean[this.field2704.length];
        for (int var1 = 0; var1 < this.field2727.length; var1++) {
            this.field2727[var1] = false;
        }
        if (this.field2720 == null) {
            this.field2726 = true;
            return;
        }
        this.field2728 = -1;
        for (int var2 = 0; var2 < this.field2727.length; var2++) {
            if (this.field2695[var2] > 0) {
                class117 var3 = this.field2720;
                class181 var5 = new class181();
                var5.field2686 = 1;
                var5.field1874 = (long) var2;
                var5.field2684 = var3;
                var5.field2682 = this;
                class129 var6 = class184.field2715;
                synchronized (class184.field2715) {
                    class184.field2715.method2220(var5);
                }
                Object var8 = class184.field2713;
                synchronized (class184.field2713) {
                    if (class184.field2716 == 0) {
                        Statics.field1094.method1831(new class184(), 5);
                    }
                    class184.field2716 = 600;
                }
                this.field2728 = var2;
            }
        }
        if (this.field2728 == -1) {
            this.field2726 = true;
        }
    }

    @ObfuscatedName("gf.cw(II)I")
    public int method3158(int arg0) {
        if (this.field2704[arg0] == null) {
            return this.field2727[arg0] ? 100 : class186.method1861(this.field2719, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("gf.cg(I)I")
    public int method3161() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2704.length; var3++) {
            if (this.field2695[var3] > 0) {
                var1 += 100;
                var2 += this.method3158(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
