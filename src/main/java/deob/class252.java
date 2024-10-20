package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ih")
public class class252 extends class250 {

    @ObfuscatedName("ih.s")
    public class165 field3256;

    @ObfuscatedName("ih.y")
    public class165 field3250;

    @ObfuscatedName("ih.u")
    public int field3251;

    @ObfuscatedName("ih.o")
    public volatile boolean field3252 = false;

    @ObfuscatedName("ih.af")
    public boolean field3253 = false;

    @ObfuscatedName("ih.an")
    public volatile boolean[] field3254;

    @ObfuscatedName("ih.ax")
    public static CRC32 field3249 = new CRC32();

    @ObfuscatedName("ih.aw")
    public int field3255;

    @ObfuscatedName("ih.ae")
    public int field3257;

    @ObfuscatedName("ih.ac")
    public int field3258 = -1;

    public class252(class165 arg0, class165 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3256 = arg0;
        this.field3250 = arg1;
        this.field3251 = arg2;
        this.field3253 = arg5;
        int var8 = this.field3251;
        if (Statics.field1182 == null) {
            class253.method1840((class252) null, 255, 255, 0, (byte) 0, true);
            class253.field3276[var8] = this;
        } else {
            Statics.field1182.field2406 = var8 * 8 + 5;
            int var9 = Statics.field1182.method3588();
            int var10 = Statics.field1182.method3588();
            this.method4542(var9, var10);
        }
    }

    @ObfuscatedName("ih.ch(I)Z")
    public boolean method4528() {
        return this.field3252;
    }

    @ObfuscatedName("ih.ct(B)I")
    public int method4529() {
        if (this.field3252) {
            return 100;
        } else if (this.field3235 == null) {
            int var1 = class253.method3176(255, this.field3251);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ih.r(II)V")
    public void method4434(int arg0) {
        int var2 = this.field3251;
        long var3 = (long) ((var2 << 16) + arg0);
        class249 var5 = (class249) class253.field3267.method3905(var3);
        if (var5 != null) {
            class253.field3266.method3828(var5);
        }
    }

    @ObfuscatedName("ih.h(II)V")
    public void method4445(int arg0) {
        if (this.field3256 == null || this.field3254 == null || !this.field3254[arg0]) {
            class253.method1840(this, this.field3251, arg0, this.field3229[arg0], (byte) 2, true);
            return;
        }
        class165 var2 = this.field3256;
        byte[] var4 = null;
        class208 var5 = class251.field3243;
        synchronized (class251.field3243) {
            for (class248 var6 = (class248) class251.field3243.method3979(); var6 != null; var6 = (class248) class251.field3243.method3964()) {
                if ((long) arg0 == var6.field2497 && var6.field3216 == var2 && var6.field3214 == 0) {
                    var4 = var6.field3213;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method3292(arg0);
            this.method4532(var2, arg0, var8, true);
        } else {
            this.method4532(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ih.cs(IIS)V")
    public void method4542(int arg0, int arg1) {
        this.field3255 = arg0;
        this.field3257 = arg1;
        if (this.field3250 == null) {
            class253.method1840(this, 255, this.field3251, this.field3255, (byte) 0, true);
            return;
        }
        int var3 = this.field3251;
        class165 var4 = this.field3250;
        byte[] var6 = null;
        class208 var7 = class251.field3243;
        synchronized (class251.field3243) {
            for (class248 var8 = (class248) class251.field3243.method3979(); var8 != null; var8 = (class248) class251.field3243.method3964()) {
                if ((long) var3 == var8.field2497 && var8.field3216 == var4 && var8.field3214 == 0) {
                    var6 = var8.field3213;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method3292(var3);
            this.method4532(var4, var3, var10, true);
        } else {
            this.method4532(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ih.cq(I[BZZB)V")
    public void method4531(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field3252) {
                throw new RuntimeException();
            }
            if (this.field3250 != null) {
                class251.method1720(this.field3251, arg1, this.field3250);
            }
            this.method4453(arg1);
            this.method4530();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field3230[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field3230[arg0];
        if (this.field3256 != null) {
            class251.method1720(arg0, arg1, this.field3256);
            this.field3254[arg0] = true;
        }
        if (arg3) {
            this.field3235[arg0] = class189.method311(arg1, false);
        }
    }

    @ObfuscatedName("ih.cj(Lfp;I[BZB)V")
    public void method4532(class165 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3250 != arg0) {
            if (!arg3 && this.field3258 == arg1) {
                this.field3252 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3254[arg1] = false;
                if (this.field3253 || arg3) {
                    class253.method1840(this, this.field3251, arg1, this.field3229[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3249.reset();
            field3249.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3249.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3229[arg1] != var9 || this.field3230[arg1] != var10) {
                this.field3254[arg1] = false;
                if (this.field3253 || arg3) {
                    class253.method1840(this, this.field3251, arg1, this.field3229[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3254[arg1] = true;
            if (arg3) {
                this.field3235[arg1] = class189.method311(arg2, false);
            }
            return;
        }
        if (this.field3252) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class253.method1840(this, 255, this.field3251, this.field3255, (byte) 0, true);
            return;
        }
        field3249.reset();
        field3249.update(arg2, 0, arg2.length);
        int var5 = (int) field3249.getValue();
        if (this.field3255 != var5) {
            class253.method1840(this, 255, this.field3251, this.field3255, (byte) 0, true);
            return;
        }
        class185 var6 = new class185(class250.method4400(arg2));
        int var7 = var6.method3679();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3251 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method3588();
        }
        if (this.field3257 != var8) {
            class253.method1840(this, 255, this.field3251, this.field3255, (byte) 0, true);
            return;
        }
        this.method4453(arg2);
        this.method4530();
    }

    @ObfuscatedName("ih.cu(I)V")
    public void method4530() {
        this.field3254 = new boolean[this.field3235.length];
        for (int var1 = 0; var1 < this.field3254.length; var1++) {
            this.field3254[var1] = false;
        }
        if (this.field3256 == null) {
            this.field3252 = true;
            return;
        }
        this.field3258 = -1;
        for (int var2 = 0; var2 < this.field3254.length; var2++) {
            if (this.field3231[var2] > 0) {
                class165 var3 = this.field3256;
                class248 var5 = new class248();
                var5.field3214 = 1;
                var5.field2497 = (long) var2;
                var5.field3216 = var3;
                var5.field3215 = this;
                class208 var6 = class251.field3243;
                synchronized (class251.field3243) {
                    class251.field3243.method3957(var5);
                }
                Object var8 = class251.field3242;
                synchronized (class251.field3242) {
                    if (class251.field3244 == 0) {
                        Statics.field3246 = new Thread(new class251());
                        Statics.field3246.setDaemon(true);
                        Statics.field3246.start();
                        Statics.field3246.setPriority(5);
                    }
                    class251.field3244 = 600;
                }
                this.field3258 = var2;
            }
        }
        if (this.field3258 == -1) {
            this.field3252 = true;
        }
    }

    @ObfuscatedName("ih.d(II)I")
    public int method4466(int arg0) {
        if (this.field3235[arg0] == null) {
            return this.field3254[arg0] ? 100 : class253.method3176(this.field3251, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ih.ci(II)Z")
    public boolean method4535(int arg0) {
        return this.field3254[arg0];
    }

    @ObfuscatedName("ih.cv(II)Z")
    public boolean method4559(int arg0) {
        return this.method4446(arg0) != null;
    }

    @ObfuscatedName("ih.cw(I)I")
    public int method4536() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3235.length; var3++) {
            if (this.field3231[var3] > 0) {
                var1 += 100;
                var2 += this.method4466(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
