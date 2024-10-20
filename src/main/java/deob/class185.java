package deob;

import java.util.zip.CRC32;

@ObfuscatedName("gq")
public class class185 extends class183 {

    @ObfuscatedName("gq.a")
    public class117 field2742;

    @ObfuscatedName("gq.b")
    public class117 field2736;

    @ObfuscatedName("gq.j")
    public int field2738;

    @ObfuscatedName("gq.k")
    public volatile boolean field2740 = false;

    @ObfuscatedName("gq.v")
    public boolean field2737 = false;

    @ObfuscatedName("gq.u")
    public volatile boolean[] field2741;

    @ObfuscatedName("gq.t")
    public static CRC32 field2744 = new CRC32();

    @ObfuscatedName("gq.av")
    public int field2739;

    @ObfuscatedName("gq.aw")
    public int field2743;

    @ObfuscatedName("gq.ay")
    public int field2745 = -1;

    public class185(class117 arg0, class117 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2742 = arg0;
        this.field2736 = arg1;
        this.field2738 = arg2;
        this.field2737 = arg5;
        int var8 = this.field2738;
        if (Statics.field1767 == null) {
            class186.method1816((class185) null, 255, 255, 0, (byte) 0, true);
            class186.field2761[var8] = this;
        } else {
            Statics.field1767.field2285 = var8 * 8 + 5;
            int var9 = Statics.field1767.method2785();
            int var10 = Statics.field1767.method2785();
            this.method3188(var9, var10);
        }
    }

    @ObfuscatedName("gq.cw(B)I")
    public int method3187() {
        if (this.field2740) {
            return 100;
        } else if (this.field2718 == null) {
            int var1 = class186.method1958(255, this.field2738);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("gq.d(II)V")
    public void method3092(int arg0) {
        class186.method1819(this.field2738, arg0);
    }

    @ObfuscatedName("gq.y(II)V")
    public void method3123(int arg0) {
        if (this.field2742 == null || this.field2741 == null || !this.field2741[arg0]) {
            class186.method1816(this, this.field2738, arg0, this.field2712[arg0], (byte) 2, true);
        } else {
            class184.method2554(arg0, this.field2742, this);
        }
    }

    @ObfuscatedName("gq.ca(IIB)V")
    public void method3188(int arg0, int arg1) {
        this.field2739 = arg0;
        this.field2743 = arg1;
        if (this.field2736 == null) {
            class186.method1816(this, 255, this.field2738, this.field2739, (byte) 0, true);
        } else {
            class184.method2554(this.field2738, this.field2736, this);
        }
    }

    @ObfuscatedName("gq.cc(I[BZZB)V")
    public void method3201(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2740) {
                throw new RuntimeException();
            }
            if (this.field2736 != null) {
                class184.method750(this.field2738, arg1, this.field2736);
            }
            this.method3091(arg1);
            this.method3193();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2708[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2708[arg0];
        if (this.field2742 != null) {
            class184.method750(arg0, arg1, this.field2742);
            this.field2741[arg0] = true;
        }
        if (arg3) {
            this.field2718[arg0] = class164.method1394(arg1, false);
        }
    }

    @ObfuscatedName("gq.cs(Ldy;I[BZI)V")
    public void method3191(class117 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2736 != arg0) {
            if (!arg3 && this.field2745 == arg1) {
                this.field2740 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2741[arg1] = false;
                if (this.field2737 || arg3) {
                    class186.method1816(this, this.field2738, arg1, this.field2712[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2744.reset();
            field2744.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2744.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2712[arg1] != var9 || this.field2708[arg1] != var10) {
                this.field2741[arg1] = false;
                if (this.field2737 || arg3) {
                    class186.method1816(this, this.field2738, arg1, this.field2712[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2741[arg1] = true;
            if (arg3) {
                this.field2718[arg1] = class164.method1394(arg2, false);
            }
            return;
        }
        if (this.field2740) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class186.method1816(this, 255, this.field2738, this.field2739, (byte) 0, true);
            return;
        }
        field2744.reset();
        field2744.update(arg2, 0, arg2.length);
        int var5 = (int) field2744.getValue();
        class161 var6 = new class161(class183.method51(arg2));
        int var7 = var6.method2823();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2738 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2785();
        }
        if (this.field2739 != var5 || this.field2743 != var8) {
            class186.method1816(this, 255, this.field2738, this.field2739, (byte) 0, true);
            return;
        }
        this.method3091(arg2);
        this.method3193();
    }

    @ObfuscatedName("gq.cy(I)V")
    public void method3193() {
        this.field2741 = new boolean[this.field2718.length];
        for (int var1 = 0; var1 < this.field2741.length; var1++) {
            this.field2741[var1] = false;
        }
        if (this.field2742 == null) {
            this.field2740 = true;
            return;
        }
        this.field2745 = -1;
        for (int var2 = 0; var2 < this.field2741.length; var2++) {
            if (this.field2714[var2] > 0) {
                class117 var3 = this.field2742;
                class181 var5 = new class181();
                var5.field2700 = 1;
                var5.field1879 = (long) var2;
                var5.field2702 = var3;
                var5.field2703 = this;
                class129 var6 = class184.field2732;
                synchronized (class184.field2732) {
                    class184.field2732.method2278(var5);
                }
                class184.method733();
                this.field2745 = var2;
            }
        }
        if (this.field2745 == -1) {
            this.field2740 = true;
        }
    }

    @ObfuscatedName("gq.cp(II)I")
    public int method3199(int arg0) {
        if (this.field2718[arg0] == null) {
            return this.field2741[arg0] ? 100 : class186.method1958(this.field2738, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("gq.cu(I)I")
    public int method3210() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2718.length; var3++) {
            if (this.field2714[var3] > 0) {
                var1 += 100;
                var2 += this.method3199(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
