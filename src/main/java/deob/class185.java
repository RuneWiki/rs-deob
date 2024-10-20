package deob;

import java.util.zip.CRC32;

@ObfuscatedName("go")
public class class185 extends class183 {

    @ObfuscatedName("go.e")
    public class117 field2743;

    @ObfuscatedName("go.d")
    public class117 field2738;

    @ObfuscatedName("go.t")
    public int field2739;

    @ObfuscatedName("go.q")
    public volatile boolean field2740 = false;

    @ObfuscatedName("go.y")
    public boolean field2737 = false;

    @ObfuscatedName("go.l")
    public volatile boolean[] field2742;

    @ObfuscatedName("go.v")
    public static CRC32 field2746 = new CRC32();

    @ObfuscatedName("go.az")
    public int field2744;

    @ObfuscatedName("go.ai")
    public int field2745;

    @ObfuscatedName("go.ad")
    public int field2741 = -1;

    public class185(class117 arg0, class117 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2743 = arg0;
        this.field2738 = arg1;
        this.field2739 = arg2;
        this.field2737 = arg5;
        class186.method3507(this, this.field2739);
    }

    @ObfuscatedName("go.bv(I)I")
    public int method3088() {
        if (this.field2740) {
            return 100;
        } else if (this.field2722 == null) {
            int var1 = class186.method760(255, this.field2739);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("go.c(IB)V")
    public void method2985(int arg0) {
        int var2 = this.field2739;
        long var3 = (long) ((var2 << 16) + arg0);
        class182 var5 = (class182) class186.field2766.method2131(var3);
        if (var5 != null) {
            class186.field2755.method2084(var5);
        }
    }

    @ObfuscatedName("go.m(IB)V")
    public void method3020(int arg0) {
        if (this.field2743 == null || this.field2742 == null || !this.field2742[arg0]) {
            class186.method2387(this, this.field2739, arg0, this.field2716[arg0], (byte) 2, true);
        } else {
            class184.method35(arg0, this.field2743, this);
        }
    }

    @ObfuscatedName("go.cy(III)V")
    public void method3075(int arg0, int arg1) {
        this.field2744 = arg0;
        this.field2745 = arg1;
        if (this.field2738 == null) {
            class186.method2387(this, 255, this.field2739, this.field2744, (byte) 0, true);
        } else {
            class184.method35(this.field2739, this.field2738, this);
        }
    }

    @ObfuscatedName("go.cg(I[BZZB)V")
    public void method3076(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2740) {
                throw new RuntimeException();
            }
            if (this.field2738 != null) {
                class184.method1753(this.field2739, arg1, this.field2738);
            }
            this.method3057(arg1);
            this.method3083();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2717[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2717[arg0];
        if (this.field2743 != null) {
            class184.method1753(arg0, arg1, this.field2743);
            this.field2742[arg0] = true;
        }
        if (arg3) {
            this.field2722[arg0] = class157.method74(arg1, false);
        }
    }

    @ObfuscatedName("go.cc(Ldw;I[BZS)V")
    public void method3077(class117 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2738 != arg0) {
            if (!arg3 && this.field2741 == arg1) {
                this.field2740 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2742[arg1] = false;
                if (this.field2737 || arg3) {
                    class186.method2387(this, this.field2739, arg1, this.field2716[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2746.reset();
            field2746.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2746.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2716[arg1] != var9 || this.field2717[arg1] != var10) {
                this.field2742[arg1] = false;
                if (this.field2737 || arg3) {
                    class186.method2387(this, this.field2739, arg1, this.field2716[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2742[arg1] = true;
            if (arg3) {
                this.field2722[arg1] = class157.method74(arg2, false);
            }
            return;
        }
        if (this.field2740) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class186.method2387(this, 255, this.field2739, this.field2744, (byte) 0, true);
            return;
        }
        field2746.reset();
        field2746.update(arg2, 0, arg2.length);
        int var5 = (int) field2746.getValue();
        class154 var6 = new class154(class183.method836(arg2));
        int var7 = var6.method2545();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2739 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2550();
        }
        if (this.field2744 != var5 || this.field2745 != var8) {
            class186.method2387(this, 255, this.field2739, this.field2744, (byte) 0, true);
            return;
        }
        this.method3057(arg2);
        this.method3083();
    }

    @ObfuscatedName("go.cb(I)V")
    public void method3083() {
        this.field2742 = new boolean[this.field2722.length];
        for (int var1 = 0; var1 < this.field2742.length; var1++) {
            this.field2742[var1] = false;
        }
        if (this.field2743 == null) {
            this.field2740 = true;
            return;
        }
        this.field2741 = -1;
        for (int var2 = 0; var2 < this.field2742.length; var2++) {
            if (this.field2713[var2] > 0) {
                class117 var3 = this.field2743;
                class181 var5 = new class181();
                var5.field2705 = 1;
                var5.field1889 = (long) var2;
                var5.field2703 = var3;
                var5.field2704 = this;
                class129 var6 = class184.field2734;
                synchronized (class184.field2734) {
                    class184.field2734.method2190(var5);
                }
                class184.method3028();
                this.field2741 = var2;
            }
        }
        if (this.field2741 == -1) {
            this.field2740 = true;
        }
    }

    @ObfuscatedName("go.cz(II)I")
    public int method3074(int arg0) {
        if (this.field2722[arg0] == null) {
            return this.field2742[arg0] ? 100 : class186.method760(this.field2739, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("go.ca(B)I")
    public int method3079() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2722.length; var3++) {
            if (this.field2713[var3] > 0) {
                var1 += 100;
                var2 += this.method3074(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
