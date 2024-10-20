package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ge")
public class class185 extends class183 {

    @ObfuscatedName("ge.w")
    public class117 field2744;

    @ObfuscatedName("ge.a")
    public class117 field2742;

    @ObfuscatedName("ge.k")
    public int field2737;

    @ObfuscatedName("ge.l")
    public volatile boolean field2738 = false;

    @ObfuscatedName("ge.x")
    public boolean field2745 = false;

    @ObfuscatedName("ge.g")
    public volatile boolean[] field2740;

    @ObfuscatedName("ge.e")
    public static CRC32 field2741 = new CRC32();

    @ObfuscatedName("ge.ae")
    public int field2739;

    @ObfuscatedName("ge.aq")
    public int field2743;

    @ObfuscatedName("ge.at")
    public int field2746 = -1;

    public class185(class117 arg0, class117 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2744 = arg0;
        this.field2742 = arg1;
        this.field2737 = arg2;
        this.field2745 = arg5;
        int var8 = this.field2737;
        if (Statics.field2762 == null) {
            class186.method212((class185) null, 255, 255, 0, (byte) 0, true);
            class186.field2747[var8] = this;
        } else {
            Statics.field2762.field2091 = var8 * 8 + 5;
            int var9 = Statics.field2762.method2798();
            int var10 = Statics.field2762.method2798();
            this.method3207(var9, var10);
        }
    }

    @ObfuscatedName("ge.cx(I)I")
    public int method3206() {
        if (this.field2738) {
            return 100;
        } else if (this.field2719 == null) {
            int var1 = this.field2737;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2707 != null && Statics.field2707.field1882 == var2) {
                var4 = Statics.field2002.field2091 * 99 / (Statics.field2002.field2092.length - Statics.field2707.field2703) + 1;
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

    @ObfuscatedName("ge.d(II)V")
    public void method3115(int arg0) {
        int var2 = this.field2737;
        long var3 = (long) ((var2 << 16) + arg0);
        class182 var5 = (class182) class186.field2755.method2260(var3);
        if (var5 != null) {
            class186.field2754.method2207(var5);
        }
    }

    @ObfuscatedName("ge.b(II)V")
    public void method3124(int arg0) {
        if (this.field2744 == null || this.field2740 == null || !this.field2740[arg0]) {
            class186.method212(this, this.field2737, arg0, this.field2713[arg0], (byte) 2, true);
            return;
        }
        class117 var2 = this.field2744;
        byte[] var4 = null;
        class129 var5 = class184.field2731;
        synchronized (class184.field2731) {
            for (class181 var6 = (class181) class184.field2731.method2319(); var6 != null; var6 = (class181) class184.field2731.method2333()) {
                if ((long) arg0 == var6.field1882 && var6.field2698 == var2 && var6.field2702 == 0) {
                    var4 = var6.field2697;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2157(arg0);
            this.method3208(var2, arg0, var8, true);
        } else {
            this.method3208(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ge.cy(III)V")
    public void method3207(int arg0, int arg1) {
        this.field2739 = arg0;
        this.field2743 = arg1;
        if (this.field2742 == null) {
            class186.method212(this, 255, this.field2737, this.field2739, (byte) 0, true);
            return;
        }
        int var3 = this.field2737;
        class117 var4 = this.field2742;
        byte[] var6 = null;
        class129 var7 = class184.field2731;
        synchronized (class184.field2731) {
            for (class181 var8 = (class181) class184.field2731.method2319(); var8 != null; var8 = (class181) class184.field2731.method2333()) {
                if ((long) var3 == var8.field1882 && var8.field2698 == var4 && var8.field2702 == 0) {
                    var6 = var8.field2697;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2157(var3);
            this.method3208(var4, var3, var10, true);
        } else {
            this.method3208(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ge.ct(I[BZZI)V")
    public void method3209(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2714[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2714[arg0];
            if (this.field2744 != null) {
                class117 var12 = this.field2744;
                class181 var13 = new class181();
                var13.field2702 = 0;
                var13.field1882 = (long) arg0;
                var13.field2697 = arg1;
                var13.field2698 = var12;
                class129 var14 = class184.field2731;
                synchronized (class184.field2731) {
                    class184.field2731.method2314(var13);
                }
                Object var16 = class184.field2733;
                synchronized (class184.field2733) {
                    if (class184.field2730 == 0) {
                        Statics.field776.method1930(new class184(), 5);
                    }
                    class184.field2730 = 600;
                }
                this.field2740[arg0] = true;
            }
            if (arg3) {
                this.field2719[arg0] = class157.method206(arg1, false);
            }
            return;
        }
        if (this.field2738) {
            throw new RuntimeException();
        }
        if (this.field2742 != null) {
            int var5 = this.field2737;
            class117 var6 = this.field2742;
            class181 var7 = new class181();
            var7.field2702 = 0;
            var7.field1882 = (long) var5;
            var7.field2697 = arg1;
            var7.field2698 = var6;
            class129 var8 = class184.field2731;
            synchronized (class184.field2731) {
                class184.field2731.method2314(var7);
            }
            Object var10 = class184.field2733;
            synchronized (class184.field2733) {
                if (class184.field2730 == 0) {
                    Statics.field776.method1930(new class184(), 5);
                }
                class184.field2730 = 600;
            }
        }
        this.method3114(arg1);
        this.method3212();
    }

    @ObfuscatedName("ge.cf(Lds;I[BZB)V")
    public void method3208(class117 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2742 != arg0) {
            if (!arg3 && this.field2746 == arg1) {
                this.field2738 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2740[arg1] = false;
                if (this.field2745 || arg3) {
                    class186.method212(this, this.field2737, arg1, this.field2713[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2741.reset();
            field2741.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2741.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2713[arg1] != var9 || this.field2714[arg1] != var10) {
                this.field2740[arg1] = false;
                if (this.field2745 || arg3) {
                    class186.method212(this, this.field2737, arg1, this.field2713[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2740[arg1] = true;
            if (arg3) {
                this.field2719[arg1] = class157.method206(arg2, false);
            }
            return;
        }
        if (this.field2738) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class186.method212(this, 255, this.field2737, this.field2739, (byte) 0, true);
            return;
        }
        field2741.reset();
        field2741.update(arg2, 0, arg2.length);
        int var5 = (int) field2741.getValue();
        class154 var6 = new class154(class183.method189(arg2));
        int var7 = var6.method2666();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2737 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2798();
        }
        if (this.field2739 != var5 || this.field2743 != var8) {
            class186.method212(this, 255, this.field2737, this.field2739, (byte) 0, true);
            return;
        }
        this.method3114(arg2);
        this.method3212();
    }

    @ObfuscatedName("ge.cw(I)V")
    public void method3212() {
        this.field2740 = new boolean[this.field2719.length];
        for (int var1 = 0; var1 < this.field2740.length; var1++) {
            this.field2740[var1] = false;
        }
        if (this.field2744 == null) {
            this.field2738 = true;
            return;
        }
        this.field2746 = -1;
        for (int var2 = 0; var2 < this.field2740.length; var2++) {
            if (this.field2718[var2] > 0) {
                class117 var3 = this.field2744;
                class181 var5 = new class181();
                var5.field2702 = 1;
                var5.field1882 = (long) var2;
                var5.field2698 = var3;
                var5.field2696 = this;
                class129 var6 = class184.field2731;
                synchronized (class184.field2731) {
                    class184.field2731.method2314(var5);
                }
                Object var8 = class184.field2733;
                synchronized (class184.field2733) {
                    if (class184.field2730 == 0) {
                        Statics.field776.method1930(new class184(), 5);
                    }
                    class184.field2730 = 600;
                }
                this.field2746 = var2;
            }
        }
        if (this.field2746 == -1) {
            this.field2738 = true;
        }
    }

    @ObfuscatedName("ge.cz(II)I")
    public int method3220(int arg0) {
        if (this.field2719[arg0] != null) {
            return 100;
        } else if (this.field2740[arg0]) {
            return 100;
        } else {
            int var2 = this.field2737;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2707 != null && Statics.field2707.field1882 == var3) {
                var5 = Statics.field2002.field2091 * 99 / (Statics.field2002.field2092.length - Statics.field2707.field2703) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ge.ch(B)I")
    public int method3211() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2719.length; var3++) {
            if (this.field2718[var3] > 0) {
                var1 += 100;
                var2 += this.method3220(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
