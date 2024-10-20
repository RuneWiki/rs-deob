package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fg")
public class class168 extends class167 {

    @ObfuscatedName("fg.j")
    public class134 field2681;

    @ObfuscatedName("fg.m")
    public class134 field2679;

    @ObfuscatedName("fg.e")
    public int field2687;

    @ObfuscatedName("fg.u")
    public volatile boolean field2682 = false;

    @ObfuscatedName("fg.y")
    public boolean field2683 = false;

    @ObfuscatedName("fg.t")
    public volatile boolean[] field2684;

    @ObfuscatedName("fg.q")
    public static CRC32 field2690 = new CRC32();

    @ObfuscatedName("fg.ak")
    public int field2686;

    @ObfuscatedName("fg.ap")
    public int field2680;

    @ObfuscatedName("fg.al")
    public int field2688 = -1;

    public class168(class134 arg0, class134 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2681 = arg0;
        this.field2679 = arg1;
        this.field2687 = arg2;
        this.field2683 = arg5;
        class171.method1910(this, this.field2687);
    }

    @ObfuscatedName("fg.bx(I)I")
    public int method3089() {
        if (this.field2682) {
            return 100;
        } else if (this.field2669 == null) {
            int var1 = class171.method2893(255, this.field2687);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("fg.v(II)V")
    public void method3064(int arg0) {
        int var2 = this.field2687;
        long var3 = (long) ((var2 << 16) + arg0);
        class172 var5 = (class172) class171.field2713.method3509(var3);
        if (var5 != null) {
            class171.field2722.method3591(var5);
        }
    }

    @ObfuscatedName("fg.n(II)V")
    public void method3049(int arg0) {
        if (this.field2681 == null || this.field2684 == null || !this.field2684[arg0]) {
            class171.method2897(this, this.field2687, arg0, this.field2663[arg0], (byte) 2, true);
        } else {
            class170.method671(arg0, this.field2681, this);
        }
    }

    @ObfuscatedName("fg.bt(III)V")
    public void method3090(int arg0, int arg1) {
        this.field2686 = arg0;
        this.field2680 = arg1;
        if (this.field2679 == null) {
            class171.method2897(this, 255, this.field2687, this.field2686, (byte) 0, true);
        } else {
            class170.method671(this.field2687, this.field2679, this);
        }
    }

    @ObfuscatedName("fg.bv(I[BZZB)V")
    public void method3108(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2682) {
                throw new RuntimeException();
            }
            if (this.field2679 != null) {
                class170.method2089(this.field2687, arg1, this.field2679);
            }
            this.method3016(arg1);
            this.method3104();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2664[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2664[arg0];
        if (this.field2681 != null) {
            class170.method2089(arg0, arg1, this.field2681);
            this.field2684[arg0] = true;
        }
        if (arg3) {
            this.field2669[arg0] = class125.method13(arg1, false);
        }
    }

    @ObfuscatedName("fg.cm(Let;I[BZB)V")
    public void method3092(class134 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2679 != arg0) {
            if (!arg3 && this.field2688 == arg1) {
                this.field2682 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2684[arg1] = false;
                if (this.field2683 || arg3) {
                    class171.method2897(this, this.field2687, arg1, this.field2663[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2690.reset();
            field2690.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2690.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2663[arg1] != var9 || this.field2664[arg1] != var10) {
                this.field2684[arg1] = false;
                if (this.field2683 || arg3) {
                    class171.method2897(this, this.field2687, arg1, this.field2663[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2684[arg1] = true;
            if (arg3) {
                this.field2669[arg1] = class125.method13(arg2, false);
            }
            return;
        }
        if (this.field2682) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class171.method2897(this, 255, this.field2687, this.field2686, (byte) 0, true);
            return;
        }
        field2690.reset();
        field2690.update(arg2, 0, arg2.length);
        int var5 = (int) field2690.getValue();
        class119 var6 = new class119(class167.method687(arg2));
        int var7 = var6.method2310();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2687 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2315();
        }
        if (this.field2686 != var5 || this.field2680 != var8) {
            class171.method2897(this, 255, this.field2687, this.field2686, (byte) 0, true);
            return;
        }
        this.method3016(arg2);
        this.method3104();
    }

    @ObfuscatedName("fg.ci(I)V")
    public void method3104() {
        this.field2684 = new boolean[this.field2669.length];
        for (int var1 = 0; var1 < this.field2684.length; var1++) {
            this.field2684[var1] = false;
        }
        if (this.field2681 == null) {
            this.field2682 = true;
            return;
        }
        this.field2688 = -1;
        for (int var2 = 0; var2 < this.field2684.length; var2++) {
            if (this.field2676[var2] > 0) {
                class134 var3 = this.field2681;
                class169 var5 = new class169();
                var5.field2697 = 1;
                var5.field3099 = (long) var2;
                var5.field2693 = var3;
                var5.field2696 = this;
                class199 var6 = class170.field2700;
                synchronized (class170.field2700) {
                    class170.field2700.method3545(var5);
                }
                class170.method115();
                this.field2688 = var2;
            }
        }
        if (this.field2688 == -1) {
            this.field2682 = true;
        }
    }

    @ObfuscatedName("fg.cw(II)I")
    public int method3094(int arg0) {
        if (this.field2669[arg0] == null) {
            return this.field2684[arg0] ? 100 : class171.method2893(this.field2687, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("fg.ch(I)I")
    public int method3091() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2669.length; var3++) {
            if (this.field2676[var3] > 0) {
                var1 += 100;
                var2 += this.method3094(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
