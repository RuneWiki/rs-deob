package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fu")
public class class172 extends class171 {

    @ObfuscatedName("fu.r")
    public class138 field2728;

    @ObfuscatedName("fu.a")
    public class138 field2732;

    @ObfuscatedName("fu.z")
    public int field2723;

    @ObfuscatedName("fu.p")
    public volatile boolean field2726 = false;

    @ObfuscatedName("fu.y")
    public boolean field2727 = false;

    @ObfuscatedName("fu.s")
    public volatile boolean[] field2724;

    @ObfuscatedName("fu.g")
    public static CRC32 field2729 = new CRC32();

    @ObfuscatedName("fu.aj")
    public int field2730;

    @ObfuscatedName("fu.ay")
    public int field2731;

    @ObfuscatedName("fu.ah")
    public int field2725 = -1;

    public class172(class138 arg0, class138 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2728 = arg0;
        this.field2732 = arg1;
        this.field2723 = arg2;
        this.field2727 = arg5;
        int var8 = this.field2723;
        if (Statics.field2687 == null) {
            class175.method597((class172) null, 255, 255, 0, (byte) 0, true);
            class175.field2753[var8] = this;
        } else {
            Statics.field2687.field2052 = var8 * 8 + 5;
            int var9 = Statics.field2687.method2404();
            int var10 = Statics.field2687.method2404();
            this.method3185(var9, var10);
        }
    }

    @ObfuscatedName("fu.cf(I)I")
    public int method3183() {
        if (this.field2726) {
            return 100;
        } else if (this.field2714 == null) {
            int var1 = class175.method1576(255, this.field2723);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("fu.e(II)V")
    public void method3086(int arg0) {
        class175.method672(this.field2723, arg0);
    }

    @ObfuscatedName("fu.l(IB)V")
    public void method3103(int arg0) {
        if (this.field2728 == null || this.field2724 == null || !this.field2724[arg0]) {
            class175.method597(this, this.field2723, arg0, this.field2715[arg0], (byte) 2, true);
            return;
        }
        class138 var2 = this.field2728;
        byte[] var4 = null;
        class203 var5 = class174.field2745;
        synchronized (class174.field2745) {
            for (class173 var6 = (class173) class174.field2745.method3646(); var6 != null; var6 = (class173) class174.field2745.method3648()) {
                if ((long) arg0 == var6.field3167 && var6.field2737 == var2 && var6.field2738 == 0) {
                    var4 = var6.field2736;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2745(arg0);
            this.method3209(var2, arg0, var8, true);
        } else {
            this.method3209(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("fu.cc(III)V")
    public void method3185(int arg0, int arg1) {
        this.field2730 = arg0;
        this.field2731 = arg1;
        if (this.field2732 == null) {
            class175.method597(this, 255, this.field2723, this.field2730, (byte) 0, true);
            return;
        }
        int var3 = this.field2723;
        class138 var4 = this.field2732;
        byte[] var6 = null;
        class203 var7 = class174.field2745;
        synchronized (class174.field2745) {
            for (class173 var8 = (class173) class174.field2745.method3646(); var8 != null; var8 = (class173) class174.field2745.method3648()) {
                if ((long) var3 == var8.field3167 && var8.field2737 == var4 && var8.field2738 == 0) {
                    var6 = var8.field2736;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2745(var3);
            this.method3209(var4, var3, var10, true);
        } else {
            this.method3209(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("fu.cr(I[BZZS)V")
    public void method3186(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2726) {
                throw new RuntimeException();
            }
            if (this.field2732 != null) {
                class174.method2289(this.field2723, arg1, this.field2732);
            }
            this.method3087(arg1);
            this.method3210();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2709[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2709[arg0];
        if (this.field2728 != null) {
            class174.method2289(arg0, arg1, this.field2728);
            this.field2724[arg0] = true;
        }
        if (arg3) {
            this.field2714[arg0] = class129.method2113(arg1, false);
        }
    }

    @ObfuscatedName("fu.cv(Les;I[BZI)V")
    public void method3209(class138 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2732 != arg0) {
            if (!arg3 && this.field2725 == arg1) {
                this.field2726 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2724[arg1] = false;
                if (this.field2727 || arg3) {
                    class175.method597(this, this.field2723, arg1, this.field2715[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2729.reset();
            field2729.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2729.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2715[arg1] != var9 || this.field2709[arg1] != var10) {
                this.field2724[arg1] = false;
                if (this.field2727 || arg3) {
                    class175.method597(this, this.field2723, arg1, this.field2715[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2724[arg1] = true;
            if (arg3) {
                this.field2714[arg1] = class129.method2113(arg2, false);
            }
            return;
        }
        if (this.field2726) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class175.method597(this, 255, this.field2723, this.field2730, (byte) 0, true);
            return;
        }
        field2729.reset();
        field2729.update(arg2, 0, arg2.length);
        int var5 = (int) field2729.getValue();
        class123 var6 = new class123(class171.method2997(arg2));
        int var7 = var6.method2522();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2723 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2404();
        }
        if (this.field2730 != var5 || this.field2731 != var8) {
            class175.method597(this, 255, this.field2723, this.field2730, (byte) 0, true);
            return;
        }
        this.method3087(arg2);
        this.method3210();
    }

    @ObfuscatedName("fu.cg(S)V")
    public void method3210() {
        this.field2724 = new boolean[this.field2714.length];
        for (int var1 = 0; var1 < this.field2724.length; var1++) {
            this.field2724[var1] = false;
        }
        if (this.field2728 == null) {
            this.field2726 = true;
            return;
        }
        this.field2725 = -1;
        for (int var2 = 0; var2 < this.field2724.length; var2++) {
            if (this.field2713[var2] > 0) {
                class138 var3 = this.field2728;
                class173 var5 = new class173();
                var5.field2738 = 1;
                var5.field3167 = (long) var2;
                var5.field2737 = var3;
                var5.field2735 = this;
                class203 var6 = class174.field2745;
                synchronized (class174.field2745) {
                    class174.field2745.method3642(var5);
                }
                class174.method2018();
                this.field2725 = var2;
            }
        }
        if (this.field2725 == -1) {
            this.field2726 = true;
        }
    }

    @ObfuscatedName("fu.ca(IB)I")
    public int method3191(int arg0) {
        if (this.field2714[arg0] == null) {
            return this.field2724[arg0] ? 100 : class175.method1576(this.field2723, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("fu.du(I)I")
    public int method3189() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2714.length; var3++) {
            if (this.field2713[var3] > 0) {
                var1 += 100;
                var2 += this.method3191(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
