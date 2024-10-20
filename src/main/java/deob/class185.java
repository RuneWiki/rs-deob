package deob;

import java.util.zip.CRC32;

@ObfuscatedName("gz")
public class class185 extends class183 {

    @ObfuscatedName("gz.z")
    public class117 field2742;

    @ObfuscatedName("gz.n")
    public class117 field2745;

    @ObfuscatedName("gz.w")
    public int field2748;

    @ObfuscatedName("gz.h")
    public volatile boolean field2744 = false;

    @ObfuscatedName("gz.u")
    public boolean field2741 = false;

    @ObfuscatedName("gz.m")
    public volatile boolean[] field2746;

    @ObfuscatedName("gz.p")
    public static CRC32 field2747 = new CRC32();

    @ObfuscatedName("gz.aq")
    public int field2743;

    @ObfuscatedName("gz.aj")
    public int field2749;

    @ObfuscatedName("gz.ae")
    public int field2750 = -1;

    public class185(class117 arg0, class117 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2742 = arg0;
        this.field2745 = arg1;
        this.field2748 = arg2;
        this.field2741 = arg5;
        int var8 = this.field2748;
        if (Statics.field772 == null) {
            class186.method1153((class185) null, 255, 255, 0, (byte) 0, true);
            class186.field2756[var8] = this;
        } else {
            Statics.field772.field2079 = var8 * 8 + 5;
            int var9 = Statics.field772.method2815();
            int var10 = Statics.field772.method2815();
            this.method3219(var9, var10);
        }
    }

    @ObfuscatedName("gz.ca(I)I")
    public int method3218() {
        if (this.field2744) {
            return 100;
        } else if (this.field2722 == null) {
            int var1 = class186.method581(255, this.field2748);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("gz.e(II)V")
    public void method3197(int arg0) {
        class186.method1882(this.field2748, arg0);
    }

    @ObfuscatedName("gz.v(II)V")
    public void method3134(int arg0) {
        if (this.field2742 == null || this.field2746 == null || !this.field2746[arg0]) {
            class186.method1153(this, this.field2748, arg0, this.field2716[arg0], (byte) 2, true);
            return;
        }
        class117 var2 = this.field2742;
        byte[] var4 = null;
        class129 var5 = class184.field2735;
        synchronized (class184.field2735) {
            for (class181 var6 = (class181) class184.field2735.method2315(); var6 != null; var6 = (class181) class184.field2735.method2332()) {
                if ((long) arg0 == var6.field1864 && var6.field2703 == var2 && var6.field2701 == 0) {
                    var4 = var6.field2704;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2153(arg0);
            this.method3221(var2, arg0, var8, true);
        } else {
            this.method3221(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("gz.cb(III)V")
    public void method3219(int arg0, int arg1) {
        this.field2743 = arg0;
        this.field2749 = arg1;
        if (this.field2745 == null) {
            class186.method1153(this, 255, this.field2748, this.field2743, (byte) 0, true);
            return;
        }
        int var3 = this.field2748;
        class117 var4 = this.field2745;
        byte[] var6 = null;
        class129 var7 = class184.field2735;
        synchronized (class184.field2735) {
            for (class181 var8 = (class181) class184.field2735.method2315(); var8 != null; var8 = (class181) class184.field2735.method2332()) {
                if ((long) var3 == var8.field1864 && var8.field2703 == var4 && var8.field2701 == 0) {
                    var6 = var8.field2704;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2153(var3);
            this.method3221(var4, var3, var10, true);
        } else {
            this.method3221(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("gz.ci(I[BZZI)V")
    public void method3220(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2744) {
                throw new RuntimeException();
            }
            if (this.field2745 != null) {
                class184.method1140(this.field2748, arg1, this.field2745);
            }
            this.method3124(arg1);
            this.method3222();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2728[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2728[arg0];
        if (this.field2742 != null) {
            class184.method1140(arg0, arg1, this.field2742);
            this.field2746[arg0] = true;
        }
        if (arg3) {
            this.field2722[arg0] = class157.method844(arg1, false);
        }
    }

    @ObfuscatedName("gz.cv(Ldg;I[BZB)V")
    public void method3221(class117 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2745 != arg0) {
            if (!arg3 && this.field2750 == arg1) {
                this.field2744 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2746[arg1] = false;
                if (this.field2741 || arg3) {
                    class186.method1153(this, this.field2748, arg1, this.field2716[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2747.reset();
            field2747.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2747.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2716[arg1] != var9 || this.field2728[arg1] != var10) {
                this.field2746[arg1] = false;
                if (this.field2741 || arg3) {
                    class186.method1153(this, this.field2748, arg1, this.field2716[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2746[arg1] = true;
            if (arg3) {
                this.field2722[arg1] = class157.method844(arg2, false);
            }
            return;
        }
        if (this.field2744) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class186.method1153(this, 255, this.field2748, this.field2743, (byte) 0, true);
            return;
        }
        field2747.reset();
        field2747.update(arg2, 0, arg2.length);
        int var5 = (int) field2747.getValue();
        class154 var6 = new class154(class183.method1854(arg2));
        int var7 = var6.method2669();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2748 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2815();
        }
        if (this.field2743 != var5 || this.field2749 != var8) {
            class186.method1153(this, 255, this.field2748, this.field2743, (byte) 0, true);
            return;
        }
        this.method3124(arg2);
        this.method3222();
    }

    @ObfuscatedName("gz.cq(I)V")
    public void method3222() {
        this.field2746 = new boolean[this.field2722.length];
        for (int var1 = 0; var1 < this.field2746.length; var1++) {
            this.field2746[var1] = false;
        }
        if (this.field2742 == null) {
            this.field2744 = true;
            return;
        }
        this.field2750 = -1;
        for (int var2 = 0; var2 < this.field2746.length; var2++) {
            if (this.field2720[var2] > 0) {
                class117 var3 = this.field2742;
                class181 var5 = new class181();
                var5.field2701 = 1;
                var5.field1864 = (long) var2;
                var5.field2703 = var3;
                var5.field2702 = this;
                class129 var6 = class184.field2735;
                synchronized (class184.field2735) {
                    class184.field2735.method2308(var5);
                }
                class184.method2906();
                this.field2750 = var2;
            }
        }
        if (this.field2750 == -1) {
            this.field2744 = true;
        }
    }

    @ObfuscatedName("gz.cx(II)I")
    public int method3223(int arg0) {
        if (this.field2722[arg0] == null) {
            return this.field2746[arg0] ? 100 : class186.method581(this.field2748, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("gz.ck(B)I")
    public int method3224() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2722.length; var3++) {
            if (this.field2720[var3] > 0) {
                var1 += 100;
                var2 += this.method3223(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
