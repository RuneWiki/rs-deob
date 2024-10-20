package deob;

import java.util.zip.CRC32;

@ObfuscatedName("iw")
public class class246 extends class244 {

    @ObfuscatedName("iw.p")
    public class318 field3185;

    @ObfuscatedName("iw.b")
    public class318 field3184;

    @ObfuscatedName("iw.l")
    public int field3191;

    @ObfuscatedName("iw.e")
    public volatile boolean field3186 = false;

    @ObfuscatedName("iw.ab")
    public boolean field3187 = false;

    @ObfuscatedName("iw.ag")
    public volatile boolean[] field3188;

    @ObfuscatedName("iw.ao")
    public static CRC32 field3189 = new CRC32();

    @ObfuscatedName("iw.ae")
    public int field3190;

    @ObfuscatedName("iw.an")
    public int field3183;

    @ObfuscatedName("iw.am")
    public int field3192 = -1;

    public class246(class318 arg0, class318 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3185 = arg0;
        this.field3184 = arg1;
        this.field3191 = arg2;
        this.field3187 = arg5;
        class247.method3828(this, this.field3191);
    }

    @ObfuscatedName("iw.cy(I)Z")
    public boolean method3975() {
        return this.field3186;
    }

    @ObfuscatedName("iw.cb(I)I")
    public int method3992() {
        if (this.field3186) {
            return 100;
        } else if (this.field3171 == null) {
            int var1 = class247.method1676(255, this.field3191);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("iw.k(II)V")
    public void method3872(int arg0) {
        class247.method1060(this.field3191, arg0);
    }

    @ObfuscatedName("iw.h(II)V")
    public void method3882(int arg0) {
        if (this.field3185 == null || this.field3188 == null || !this.field3188[arg0]) {
            class247.method3719(this, this.field3191, arg0, this.field3165[arg0], (byte) 2, true);
            return;
        }
        class318 var2 = this.field3185;
        byte[] var4 = null;
        class272 var5 = class245.field3178;
        synchronized (class245.field3178) {
            for (class242 var6 = (class242) class245.field3178.method4621(); var6 != null; var6 = (class242) class245.field3178.method4641()) {
                if ((long) arg0 == var6.field2157 && var6.field3154 == var2 && var6.field3155 == 0) {
                    var4 = var6.field3152;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method5522(arg0);
            this.method3979(var2, arg0, var8, true);
        } else {
            this.method3979(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("iw.cl(III)V")
    public void method3978(int arg0, int arg1) {
        this.field3190 = arg0;
        this.field3183 = arg1;
        if (this.field3184 == null) {
            class247.method3719(this, 255, this.field3191, this.field3190, (byte) 0, true);
            return;
        }
        int var3 = this.field3191;
        class318 var4 = this.field3184;
        byte[] var6 = null;
        class272 var7 = class245.field3178;
        synchronized (class245.field3178) {
            for (class242 var8 = (class242) class245.field3178.method4621(); var8 != null; var8 = (class242) class245.field3178.method4641()) {
                if ((long) var3 == var8.field2157 && var8.field3154 == var4 && var8.field3155 == 0) {
                    var6 = var8.field3152;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method5522(var3);
            this.method3979(var4, var3, var10, true);
        } else {
            this.method3979(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("iw.dx(I[BZZB)V")
    public void method3985(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field3186) {
                throw new RuntimeException();
            }
            if (this.field3184 != null) {
                class245.method3693(this.field3191, arg1, this.field3184);
            }
            this.method3871(arg1);
            this.method3980();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field3166[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field3166[arg0];
        if (this.field3185 != null) {
            class318 var5 = this.field3185;
            class242 var6 = new class242();
            var6.field3155 = 0;
            var6.field2157 = (long) arg0;
            var6.field3152 = arg1;
            var6.field3154 = var5;
            class272 var7 = class245.field3178;
            synchronized (class245.field3178) {
                class245.field3178.method4616(var6);
            }
            class245.method341();
            this.field3188[arg0] = true;
        }
        if (arg3) {
            this.field3171[arg0] = class215.method1964(arg1, false);
        }
    }

    @ObfuscatedName("iw.dq(Llz;I[BZI)V")
    public void method3979(class318 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3184 != arg0) {
            if (!arg3 && this.field3192 == arg1) {
                this.field3186 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3188[arg1] = false;
                if (this.field3187 || arg3) {
                    class247.method3719(this, this.field3191, arg1, this.field3165[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3189.reset();
            field3189.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3189.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3165[arg1] != var9 || this.field3166[arg1] != var10) {
                this.field3188[arg1] = false;
                if (this.field3187 || arg3) {
                    class247.method3719(this, this.field3191, arg1, this.field3165[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3188[arg1] = true;
            if (arg3) {
                this.field3171[arg1] = class215.method1964(arg2, false);
            }
            return;
        }
        if (this.field3186) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class247.method3719(this, 255, this.field3191, this.field3190, (byte) 0, true);
            return;
        }
        field3189.reset();
        field3189.update(arg2, 0, arg2.length);
        int var5 = (int) field3189.getValue();
        if (this.field3190 != var5) {
            class247.method3719(this, 255, this.field3191, this.field3190, (byte) 0, true);
            return;
        }
        class310 var6 = new class310(class244.method751(arg2));
        int var7 = var6.method5193();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3191 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method5270();
        }
        if (this.field3183 != var8) {
            class247.method3719(this, 255, this.field3191, this.field3190, (byte) 0, true);
            return;
        }
        this.method3871(arg2);
        this.method3980();
    }

    @ObfuscatedName("iw.dv(I)V")
    public void method3980() {
        this.field3188 = new boolean[this.field3171.length];
        for (int var1 = 0; var1 < this.field3188.length; var1++) {
            this.field3188[var1] = false;
        }
        if (this.field3185 == null) {
            this.field3186 = true;
            return;
        }
        this.field3192 = -1;
        for (int var2 = 0; var2 < this.field3188.length; var2++) {
            if (this.field3167[var2] > 0) {
                class245.method3141(var2, this.field3185, this);
                this.field3192 = var2;
            }
        }
        if (this.field3192 == -1) {
            this.field3186 = true;
        }
    }

    @ObfuscatedName("iw.g(II)I")
    public int method3878(int arg0) {
        if (this.field3171[arg0] == null) {
            return this.field3188[arg0] ? 100 : class247.method1676(this.field3191, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("iw.dh(II)Z")
    public boolean method3981(int arg0) {
        return this.field3188[arg0];
    }

    @ObfuscatedName("iw.dd(II)Z")
    public boolean method3982(int arg0) {
        return this.method3952(arg0) != null;
    }

    @ObfuscatedName("iw.db(B)I")
    public int method3983() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3171.length; var3++) {
            if (this.field3167[var3] > 0) {
                var1 += 100;
                var2 += this.method3878(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
