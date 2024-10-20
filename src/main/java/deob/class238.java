package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ig")
public class class238 extends class236 {

    @ObfuscatedName("ig.h")
    public class161 field3246;

    @ObfuscatedName("ig.z")
    public class161 field3239;

    @ObfuscatedName("ig.i")
    public int field3247;

    @ObfuscatedName("ig.d")
    public volatile boolean field3241 = false;

    @ObfuscatedName("ig.b")
    public boolean field3252 = false;

    @ObfuscatedName("ig.q")
    public volatile boolean[] field3243;

    @ObfuscatedName("ig.y")
    public static CRC32 field3240 = new CRC32();

    @ObfuscatedName("ig.ai")
    public int field3245;

    @ObfuscatedName("ig.ae")
    public int field3242;

    @ObfuscatedName("ig.au")
    public int field3244 = -1;

    public class238(class161 arg0, class161 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3246 = arg0;
        this.field3239 = arg1;
        this.field3247 = arg2;
        this.field3252 = arg5;
        class239.method148(this, this.field3247);
    }

    @ObfuscatedName("ig.cy(B)I")
    public int method3855() {
        if (this.field3241) {
            return 100;
        } else if (this.field3229 == null) {
            int var1 = this.field3247;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field3671 != null && Statics.field3671.field2467 == var2) {
                var4 = Statics.field1.field2394 * 99 / (Statics.field1.field2391.length - Statics.field3671.field3210) + 1;
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

    @ObfuscatedName("ig.j(II)V")
    public void method3811(int arg0) {
        class239.method206(this.field3247, arg0);
    }

    @ObfuscatedName("ig.u(II)V")
    public void method3771(int arg0) {
        if (this.field3246 == null || this.field3243 == null || !this.field3243[arg0]) {
            class239.method2145(this, this.field3247, arg0, this.field3214[arg0], (byte) 2, true);
        } else {
            class237.method2643(arg0, this.field3246, this);
        }
    }

    @ObfuscatedName("ig.ck(III)V")
    public void method3856(int arg0, int arg1) {
        this.field3245 = arg0;
        this.field3242 = arg1;
        if (this.field3239 == null) {
            class239.method2145(this, 255, this.field3247, this.field3245, (byte) 0, true);
        } else {
            class237.method2643(this.field3247, this.field3239, this);
        }
    }

    @ObfuscatedName("ig.ch(I[BZZI)V")
    public void method3854(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field3219[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field3219[arg0];
            if (this.field3246 != null) {
                class161 var10 = this.field3246;
                class234 var11 = new class234();
                var11.field3205 = 0;
                var11.field2467 = (long) arg0;
                var11.field3203 = arg1;
                var11.field3204 = var10;
                class194 var12 = class237.field3236;
                synchronized (class237.field3236) {
                    class237.field3236.method3320(var11);
                }
                class237.method1375();
                this.field3243[arg0] = true;
            }
            if (arg3) {
                this.field3229[arg0] = class177.method1473(arg1, false);
            }
            return;
        }
        if (this.field3241) {
            throw new RuntimeException();
        }
        if (this.field3239 != null) {
            int var5 = this.field3247;
            class161 var6 = this.field3239;
            class234 var7 = new class234();
            var7.field3205 = 0;
            var7.field2467 = (long) var5;
            var7.field3203 = arg1;
            var7.field3204 = var6;
            class194 var8 = class237.field3236;
            synchronized (class237.field3236) {
                class237.field3236.method3320(var7);
            }
            class237.method1375();
        }
        this.method3760(arg1);
        this.method3858();
    }

    @ObfuscatedName("ig.cv(Lfz;I[BZB)V")
    public void method3857(class161 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3239 != arg0) {
            if (!arg3 && this.field3244 == arg1) {
                this.field3241 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3243[arg1] = false;
                if (this.field3252 || arg3) {
                    class239.method2145(this, this.field3247, arg1, this.field3214[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3240.reset();
            field3240.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3240.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3214[arg1] != var9 || this.field3219[arg1] != var10) {
                this.field3243[arg1] = false;
                if (this.field3252 || arg3) {
                    class239.method2145(this, this.field3247, arg1, this.field3214[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3243[arg1] = true;
            if (arg3) {
                this.field3229[arg1] = class177.method1473(arg2, false);
            }
            return;
        }
        if (this.field3241) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class239.method2145(this, 255, this.field3247, this.field3245, (byte) 0, true);
            return;
        }
        field3240.reset();
        field3240.update(arg2, 0, arg2.length);
        int var5 = (int) field3240.getValue();
        class174 var6 = new class174(class236.method3729(arg2));
        int var7 = var6.method2871();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3247 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2876();
        }
        if (this.field3245 != var5 || this.field3242 != var8) {
            class239.method2145(this, 255, this.field3247, this.field3245, (byte) 0, true);
            return;
        }
        this.method3760(arg2);
        this.method3858();
    }

    @ObfuscatedName("ig.cc(B)V")
    public void method3858() {
        this.field3243 = new boolean[this.field3229.length];
        for (int var1 = 0; var1 < this.field3243.length; var1++) {
            this.field3243[var1] = false;
        }
        if (this.field3246 == null) {
            this.field3241 = true;
            return;
        }
        this.field3244 = -1;
        for (int var2 = 0; var2 < this.field3243.length; var2++) {
            if (this.field3220[var2] > 0) {
                class161 var3 = this.field3246;
                class234 var5 = new class234();
                var5.field3205 = 1;
                var5.field2467 = (long) var2;
                var5.field3204 = var3;
                var5.field3202 = this;
                class194 var6 = class237.field3236;
                synchronized (class237.field3236) {
                    class237.field3236.method3320(var5);
                }
                class237.method1375();
                this.field3244 = var2;
            }
        }
        if (this.field3244 == -1) {
            this.field3241 = true;
        }
    }

    @ObfuscatedName("ig.s(II)I")
    public int method3767(int arg0) {
        if (this.field3229[arg0] != null) {
            return 100;
        } else if (this.field3243[arg0]) {
            return 100;
        } else {
            int var2 = this.field3247;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field3671 != null && Statics.field3671.field2467 == var3) {
                var5 = Statics.field1.field2394 * 99 / (Statics.field1.field2391.length - Statics.field3671.field3210) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ig.cf(I)I")
    public int method3860() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3229.length; var3++) {
            if (this.field3220[var3] > 0) {
                var1 += 100;
                var2 += this.method3767(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
