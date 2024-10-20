package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ic")
public class class250 extends class248 {

    @ObfuscatedName("ic.d")
    public class163 field3196;

    @ObfuscatedName("ic.h")
    public class163 field3187;

    @ObfuscatedName("ic.c")
    public int field3188;

    @ObfuscatedName("ic.v")
    public volatile boolean field3189 = false;

    @ObfuscatedName("ic.af")
    public boolean field3192 = false;

    @ObfuscatedName("ic.ah")
    public volatile boolean[] field3186;

    @ObfuscatedName("ic.ab")
    public static CRC32 field3190 = new CRC32();

    @ObfuscatedName("ic.aw")
    public int field3191;

    @ObfuscatedName("ic.ak")
    public int field3194;

    @ObfuscatedName("ic.as")
    public int field3195 = -1;

    public class250(class163 arg0, class163 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3196 = arg0;
        this.field3187 = arg1;
        this.field3188 = arg2;
        this.field3192 = arg5;
        int var8 = this.field3188;
        if (Statics.field2360 == null) {
            Statics.method261((class250) null, 255, 255, 0, (byte) 0, true);
            class251.field3202[var8] = this;
        } else {
            Statics.field2360.field2340 = var8 * 8 + 5;
            int var9 = Statics.field2360.method3374();
            int var10 = Statics.field2360.method3374();
            this.method4342(var9, var10);
        }
    }

    @ObfuscatedName("ic.cn(B)I")
    public int method4341() {
        if (this.field3189) {
            return 100;
        } else if (this.field3166 == null) {
            int var1 = this.field3188;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field3209 != null && Statics.field3209.field2422 == var2) {
                var4 = Statics.field3714.field2340 * 99 / (Statics.field3714.field2339.length - Statics.field3209.field3158) + 1;
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

    @ObfuscatedName("ic.w(IB)V")
    public void method4245(int arg0) {
        class251.method942(this.field3188, arg0);
    }

    @ObfuscatedName("ic.f(IB)V")
    public void method4322(int arg0) {
        if (this.field3196 == null || this.field3186 == null || !this.field3186[arg0]) {
            Statics.method261(this, this.field3188, arg0, this.field3165[arg0], (byte) 2, true);
            return;
        }
        class163 var2 = this.field3196;
        byte[] var4 = null;
        class206 var5 = class249.field3183;
        synchronized (class249.field3183) {
            for (class246 var6 = (class246) class249.field3183.method3790(); var6 != null; var6 = (class246) class249.field3183.method3771()) {
                if ((long) arg0 == var6.field2422 && var6.field3152 == var2 && var6.field3151 == 0) {
                    var4 = var6.field3150;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method3078(arg0);
            this.method4359(var2, arg0, var8, true);
        } else {
            this.method4359(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ic.cp(III)V")
    public void method4342(int arg0, int arg1) {
        this.field3191 = arg0;
        this.field3194 = arg1;
        if (this.field3187 == null) {
            Statics.method261(this, 255, this.field3188, this.field3191, (byte) 0, true);
            return;
        }
        int var3 = this.field3188;
        class163 var4 = this.field3187;
        byte[] var6 = null;
        class206 var7 = class249.field3183;
        synchronized (class249.field3183) {
            for (class246 var8 = (class246) class249.field3183.method3790(); var8 != null; var8 = (class246) class249.field3183.method3771()) {
                if ((long) var3 == var8.field2422 && var8.field3152 == var4 && var8.field3151 == 0) {
                    var6 = var8.field3150;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method3078(var3);
            this.method4359(var4, var3, var10, true);
        } else {
            this.method4359(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ic.cz(I[BZZI)V")
    public void method4347(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field3163[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field3163[arg0];
            if (this.field3196 != null) {
                class163 var10 = this.field3196;
                class246 var11 = new class246();
                var11.field3151 = 0;
                var11.field2422 = (long) arg0;
                var11.field3150 = arg1;
                var11.field3152 = var10;
                class206 var12 = class249.field3183;
                synchronized (class249.field3183) {
                    class249.field3183.method3765(var11);
                }
                class249.method3540();
                this.field3186[arg0] = true;
            }
            if (arg3) {
                this.field3166[arg0] = class187.method3064(arg1, false);
            }
            return;
        }
        if (this.field3189) {
            throw new RuntimeException();
        }
        if (this.field3187 != null) {
            int var5 = this.field3188;
            class163 var6 = this.field3187;
            class246 var7 = new class246();
            var7.field3151 = 0;
            var7.field2422 = (long) var5;
            var7.field3150 = arg1;
            var7.field3152 = var6;
            class206 var8 = class249.field3183;
            synchronized (class249.field3183) {
                class249.field3183.method3765(var7);
            }
            class249.method3540();
        }
        this.method4244(arg1);
        this.method4345();
    }

    @ObfuscatedName("ic.ck(Lff;I[BZB)V")
    public void method4359(class163 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3187 != arg0) {
            if (!arg3 && this.field3195 == arg1) {
                this.field3189 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3186[arg1] = false;
                if (this.field3192 || arg3) {
                    Statics.method261(this, this.field3188, arg1, this.field3165[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3190.reset();
            field3190.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3190.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3165[arg1] != var9 || this.field3163[arg1] != var10) {
                this.field3186[arg1] = false;
                if (this.field3192 || arg3) {
                    Statics.method261(this, this.field3188, arg1, this.field3165[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3186[arg1] = true;
            if (arg3) {
                this.field3166[arg1] = class187.method3064(arg2, false);
            }
            return;
        }
        if (this.field3189) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            Statics.method261(this, 255, this.field3188, this.field3191, (byte) 0, true);
            return;
        }
        field3190.reset();
        field3190.update(arg2, 0, arg2.length);
        int var5 = (int) field3190.getValue();
        if (this.field3191 != var5) {
            Statics.method261(this, 255, this.field3188, this.field3191, (byte) 0, true);
            return;
        }
        class183 var6 = new class183(class248.method833(arg2));
        int var7 = var6.method3247();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3188 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method3374();
        }
        if (this.field3194 != var8) {
            Statics.method261(this, 255, this.field3188, this.field3191, (byte) 0, true);
            return;
        }
        this.method4244(arg2);
        this.method4345();
    }

    @ObfuscatedName("ic.cu(I)V")
    public void method4345() {
        this.field3186 = new boolean[this.field3166.length];
        for (int var1 = 0; var1 < this.field3186.length; var1++) {
            this.field3186[var1] = false;
        }
        if (this.field3196 == null) {
            this.field3189 = true;
            return;
        }
        this.field3195 = -1;
        for (int var2 = 0; var2 < this.field3186.length; var2++) {
            if (this.field3167[var2] > 0) {
                class163 var3 = this.field3196;
                class246 var5 = new class246();
                var5.field3151 = 1;
                var5.field2422 = (long) var2;
                var5.field3152 = var3;
                var5.field3153 = this;
                class206 var6 = class249.field3183;
                synchronized (class249.field3183) {
                    class249.field3183.method3765(var5);
                }
                class249.method3540();
                this.field3195 = var2;
            }
        }
        if (this.field3195 == -1) {
            this.field3189 = true;
        }
    }

    @ObfuscatedName("ic.e(IB)I")
    public int method4252(int arg0) {
        if (this.field3166[arg0] != null) {
            return 100;
        } else if (this.field3186[arg0]) {
            return 100;
        } else {
            int var2 = this.field3188;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field3209 != null && Statics.field3209.field2422 == var3) {
                var5 = Statics.field3714.field2340 * 99 / (Statics.field3714.field2339.length - Statics.field3209.field3158) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ic.cm(II)Z")
    public boolean method4344(int arg0) {
        return this.field3186[arg0];
    }

    @ObfuscatedName("ic.dh(II)Z")
    public boolean method4349(int arg0) {
        return this.method4290(arg0) != null;
    }

    @ObfuscatedName("ic.do(I)I")
    public int method4367() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3166.length; var3++) {
            if (this.field3167[var3] > 0) {
                var1 += 100;
                var2 += this.method4252(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
