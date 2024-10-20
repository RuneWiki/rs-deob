package deob;

import java.util.zip.CRC32;

@ObfuscatedName("gm")
public class class185 extends class183 {

    @ObfuscatedName("gm.y")
    public class117 field2737;

    @ObfuscatedName("gm.v")
    public class117 field2731;

    @ObfuscatedName("gm.f")
    public int field2732;

    @ObfuscatedName("gm.l")
    public volatile boolean field2739 = false;

    @ObfuscatedName("gm.t")
    public boolean field2734 = false;

    @ObfuscatedName("gm.b")
    public volatile boolean[] field2735;

    @ObfuscatedName("gm.e")
    public static CRC32 field2736 = new CRC32();

    @ObfuscatedName("gm.ai")
    public int field2730;

    @ObfuscatedName("gm.am")
    public int field2738;

    @ObfuscatedName("gm.ad")
    public int field2741 = -1;

    public class185(class117 arg0, class117 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2737 = arg0;
        this.field2731 = arg1;
        this.field2732 = arg2;
        this.field2734 = arg5;
        class186.method213(this, this.field2732);
    }

    @ObfuscatedName("gm.cw(B)I")
    public int method3120() {
        if (this.field2739) {
            return 100;
        } else if (this.field2711 == null) {
            int var1 = class186.method1081(255, this.field2732);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("gm.g(II)V")
    public void method3029(int arg0) {
        class186.method856(this.field2732, arg0);
    }

    @ObfuscatedName("gm.c(II)V")
    public void method3038(int arg0) {
        if (this.field2737 == null || this.field2735 == null || !this.field2735[arg0]) {
            class186.method3011(this, this.field2732, arg0, this.field2705[arg0], (byte) 2, true);
        } else {
            class184.method1358(arg0, this.field2737, this);
        }
    }

    @ObfuscatedName("gm.ci(III)V")
    public void method3121(int arg0, int arg1) {
        this.field2730 = arg0;
        this.field2738 = arg1;
        if (this.field2731 == null) {
            class186.method3011(this, 255, this.field2732, this.field2730, (byte) 0, true);
        } else {
            class184.method1358(this.field2732, this.field2731, this);
        }
    }

    @ObfuscatedName("gm.cm(I[BZZB)V")
    public void method3146(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2739) {
                throw new RuntimeException();
            }
            if (this.field2731 != null) {
                class184.method2988(this.field2732, arg1, this.field2731);
            }
            this.method3028(arg1);
            this.method3122();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2706[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2706[arg0];
        if (this.field2737 != null) {
            class117 var5 = this.field2737;
            class181 var6 = new class181();
            var6.field2692 = 0;
            var6.field1885 = (long) arg0;
            var6.field2694 = arg1;
            var6.field2691 = var5;
            class129 var7 = class184.field2728;
            synchronized (class184.field2728) {
                class184.field2728.method2232(var6);
            }
            Object var9 = class184.field2729;
            synchronized (class184.field2729) {
                if (class184.field2726 == 0) {
                    Statics.field900.method1838(new class184(), 5);
                }
                class184.field2726 = 600;
            }
            this.field2735[arg0] = true;
        }
        if (arg3) {
            this.field2711[arg0] = class157.method652(arg1, false);
        }
    }

    @ObfuscatedName("gm.cc(Ldu;I[BZB)V")
    public void method3123(class117 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2731 != arg0) {
            if (!arg3 && this.field2741 == arg1) {
                this.field2739 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2735[arg1] = false;
                if (this.field2734 || arg3) {
                    class186.method3011(this, this.field2732, arg1, this.field2705[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2736.reset();
            field2736.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2736.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2705[arg1] != var9 || this.field2706[arg1] != var10) {
                this.field2735[arg1] = false;
                if (this.field2734 || arg3) {
                    class186.method3011(this, this.field2732, arg1, this.field2705[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2735[arg1] = true;
            if (arg3) {
                this.field2711[arg1] = class157.method652(arg2, false);
            }
            return;
        }
        if (this.field2739) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class186.method3011(this, 255, this.field2732, this.field2730, (byte) 0, true);
            return;
        }
        field2736.reset();
        field2736.update(arg2, 0, arg2.length);
        int var5 = (int) field2736.getValue();
        class154 var6 = new class154(class183.method182(arg2));
        int var7 = var6.method2593();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2732 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2598();
        }
        if (this.field2730 != var5 || this.field2738 != var8) {
            class186.method3011(this, 255, this.field2732, this.field2730, (byte) 0, true);
            return;
        }
        this.method3028(arg2);
        this.method3122();
    }

    @ObfuscatedName("gm.cd(B)V")
    public void method3122() {
        this.field2735 = new boolean[this.field2711.length];
        for (int var1 = 0; var1 < this.field2735.length; var1++) {
            this.field2735[var1] = false;
        }
        if (this.field2737 == null) {
            this.field2739 = true;
            return;
        }
        this.field2741 = -1;
        for (int var2 = 0; var2 < this.field2735.length; var2++) {
            if (this.field2707[var2] > 0) {
                class117 var3 = this.field2737;
                class181 var5 = new class181();
                var5.field2692 = 1;
                var5.field1885 = (long) var2;
                var5.field2691 = var3;
                var5.field2690 = this;
                class129 var6 = class184.field2728;
                synchronized (class184.field2728) {
                    class184.field2728.method2232(var5);
                }
                Object var8 = class184.field2729;
                synchronized (class184.field2729) {
                    if (class184.field2726 == 0) {
                        Statics.field900.method1838(new class184(), 5);
                    }
                    class184.field2726 = 600;
                }
                this.field2741 = var2;
            }
        }
        if (this.field2741 == -1) {
            this.field2739 = true;
        }
    }

    @ObfuscatedName("gm.cb(IB)I")
    public int method3125(int arg0) {
        if (this.field2711[arg0] == null) {
            return this.field2735[arg0] ? 100 : class186.method1081(this.field2732, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("gm.cg(I)I")
    public int method3127() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2711.length; var3++) {
            if (this.field2707[var3] > 0) {
                var1 += 100;
                var2 += this.method3125(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
