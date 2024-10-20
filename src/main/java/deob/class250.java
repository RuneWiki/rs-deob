package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ic")
public class class250 extends class248 {

    @ObfuscatedName("ic.k")
    public class163 field3199;

    @ObfuscatedName("ic.r")
    public class163 field3203;

    @ObfuscatedName("ic.v")
    public int field3200;

    @ObfuscatedName("ic.o")
    public volatile boolean field3202 = false;

    @ObfuscatedName("ic.ai")
    public boolean field3201 = false;

    @ObfuscatedName("ic.at")
    public volatile boolean[] field3204;

    @ObfuscatedName("ic.ad")
    public static CRC32 field3205 = new CRC32();

    @ObfuscatedName("ic.ac")
    public int field3206;

    @ObfuscatedName("ic.ay")
    public int field3207;

    @ObfuscatedName("ic.an")
    public int field3208 = -1;

    public class250(class163 arg0, class163 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3199 = arg0;
        this.field3203 = arg1;
        this.field3200 = arg2;
        this.field3201 = arg5;
        class251.method3001(this, this.field3200);
    }

    @ObfuscatedName("ic.da(B)I")
    public int method4363() {
        if (this.field3202) {
            return 100;
        } else if (this.field3184 == null) {
            int var1 = class251.method92(255, this.field3200);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ic.m(IB)V")
    public void method4249(int arg0) {
        class251.method540(this.field3200, arg0);
    }

    @ObfuscatedName("ic.c(II)V")
    public void method4260(int arg0) {
        if (this.field3199 == null || this.field3204 == null || !this.field3204[arg0]) {
            Statics.method625(this, this.field3200, arg0, this.field3178[arg0], (byte) 2, true);
            return;
        }
        class163 var2 = this.field3199;
        byte[] var4 = null;
        class206 var5 = class249.field3197;
        synchronized (class249.field3197) {
            for (class246 var6 = (class246) class249.field3197.method3797(); var6 != null; var6 = (class246) class249.field3197.method3788()) {
                if ((long) arg0 == var6.field2450 && var6.field3165 == var2 && var6.field3164 == 0) {
                    var4 = var6.field3166;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method3085(arg0);
            this.method4381(var2, arg0, var8, true);
        } else {
            this.method4381(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ic.dg(III)V")
    public void method4360(int arg0, int arg1) {
        this.field3206 = arg0;
        this.field3207 = arg1;
        if (this.field3203 == null) {
            Statics.method625(this, 255, this.field3200, this.field3206, (byte) 0, true);
            return;
        }
        int var3 = this.field3200;
        class163 var4 = this.field3203;
        byte[] var6 = null;
        class206 var7 = class249.field3197;
        synchronized (class249.field3197) {
            for (class246 var8 = (class246) class249.field3197.method3797(); var8 != null; var8 = (class246) class249.field3197.method3788()) {
                if ((long) var3 == var8.field2450 && var8.field3165 == var4 && var8.field3164 == 0) {
                    var6 = var8.field3166;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method3085(var3);
            this.method4381(var4, var3, var10, true);
        } else {
            this.method4381(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ic.dl(I[BZZI)V")
    public void method4364(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field3202) {
                throw new RuntimeException();
            }
            if (this.field3203 != null) {
                class249.method1765(this.field3200, arg1, this.field3203);
            }
            this.method4307(arg1);
            this.method4384();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field3179[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field3179[arg0];
        if (this.field3199 != null) {
            class249.method1765(arg0, arg1, this.field3199);
            this.field3204[arg0] = true;
        }
        if (arg3) {
            this.field3184[arg0] = class187.method2683(arg1, false);
        }
    }

    @ObfuscatedName("ic.dd(Lff;I[BZB)V")
    public void method4381(class163 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3203 != arg0) {
            if (!arg3 && this.field3208 == arg1) {
                this.field3202 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3204[arg1] = false;
                if (this.field3201 || arg3) {
                    Statics.method625(this, this.field3200, arg1, this.field3178[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3205.reset();
            field3205.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3205.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3178[arg1] != var9 || this.field3179[arg1] != var10) {
                this.field3204[arg1] = false;
                if (this.field3201 || arg3) {
                    Statics.method625(this, this.field3200, arg1, this.field3178[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3204[arg1] = true;
            if (arg3) {
                this.field3184[arg1] = class187.method2683(arg2, false);
            }
            return;
        }
        if (this.field3202) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            Statics.method625(this, 255, this.field3200, this.field3206, (byte) 0, true);
            return;
        }
        field3205.reset();
        field3205.update(arg2, 0, arg2.length);
        int var5 = (int) field3205.getValue();
        if (this.field3206 != var5) {
            Statics.method625(this, 255, this.field3200, this.field3206, (byte) 0, true);
            return;
        }
        class183 var6 = new class183(class248.method3195(arg2));
        int var7 = var6.method3436();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3200 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method3267();
        }
        if (this.field3207 != var8) {
            Statics.method625(this, 255, this.field3200, this.field3206, (byte) 0, true);
            return;
        }
        this.method4307(arg2);
        this.method4384();
    }

    @ObfuscatedName("ic.dw(I)V")
    public void method4384() {
        this.field3204 = new boolean[this.field3184.length];
        for (int var1 = 0; var1 < this.field3204.length; var1++) {
            this.field3204[var1] = false;
        }
        if (this.field3199 == null) {
            this.field3202 = true;
            return;
        }
        this.field3208 = -1;
        for (int var2 = 0; var2 < this.field3204.length; var2++) {
            if (this.field3182[var2] > 0) {
                class249.method2862(var2, this.field3199, this);
                this.field3208 = var2;
            }
        }
        if (this.field3208 == -1) {
            this.field3202 = true;
        }
    }

    @ObfuscatedName("ic.s(IB)I")
    public int method4316(int arg0) {
        if (this.field3184[arg0] == null) {
            return this.field3204[arg0] ? 100 : class251.method92(this.field3200, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ic.dr(IB)Z")
    public boolean method4366(int arg0) {
        return this.field3204[arg0];
    }

    @ObfuscatedName("ic.dp(II)Z")
    public boolean method4367(int arg0) {
        return this.method4272(arg0) != null;
    }

    @ObfuscatedName("ic.do(B)I")
    public int method4368() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3184.length; var3++) {
            if (this.field3182[var3] > 0) {
                var1 += 100;
                var2 += this.method4316(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
