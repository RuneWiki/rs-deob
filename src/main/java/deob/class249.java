package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ij")
public class class249 extends class247 {

    @ObfuscatedName("ij.n")
    public class165 field3327;

    @ObfuscatedName("ij.j")
    public class165 field3328;

    @ObfuscatedName("ij.e")
    public int field3329;

    @ObfuscatedName("ij.v")
    public volatile boolean field3330 = false;

    @ObfuscatedName("ij.a")
    public boolean field3333 = false;

    @ObfuscatedName("ij.ad")
    public volatile boolean[] field3331;

    @ObfuscatedName("ij.al")
    public static CRC32 field3336 = new CRC32();

    @ObfuscatedName("ij.aq")
    public int field3334;

    @ObfuscatedName("ij.ar")
    public int field3335;

    @ObfuscatedName("ij.an")
    public int field3332 = -1;

    public class249(class165 arg0, class165 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3327 = arg0;
        this.field3328 = arg1;
        this.field3329 = arg2;
        this.field3333 = arg5;
        class250.method3830(this, this.field3329);
    }

    @ObfuscatedName("ij.cf(I)I")
    public int method4280() {
        if (this.field3330) {
            return 100;
        } else if (this.field3315 == null) {
            int var1 = this.field3329;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field1886 != null && Statics.field1886.field2585 == var2) {
                var4 = Statics.field3350.field2514 * 99 / (Statics.field3350.field2512.length - Statics.field1886.field3299) + 1;
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

    @ObfuscatedName("ij.g(II)V")
    public void method4254(int arg0) {
        int var2 = this.field3329;
        long var3 = (long) ((var2 << 16) + arg0);
        class246 var5 = (class246) class250.field3353.method3704(var3);
        if (var5 != null) {
            class250.field3346.method3639(var5);
        }
    }

    @ObfuscatedName("ij.l(II)V")
    public void method4237(int arg0) {
        if (this.field3327 == null || this.field3331 == null || !this.field3331[arg0]) {
            class250.method4497(this, this.field3329, arg0, this.field3309[arg0], (byte) 2, true);
            return;
        }
        class165 var2 = this.field3327;
        byte[] var4 = null;
        class205 var5 = class248.field3326;
        synchronized (class248.field3326) {
            for (class245 var6 = (class245) class248.field3326.method3752(); var6 != null; var6 = (class245) class248.field3326.method3762()) {
                if ((long) arg0 == var6.field2585 && var6.field3293 == var2 && var6.field3291 == 0) {
                    var4 = var6.field3292;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method3070(arg0);
            this.method4303(var2, arg0, var8, true);
        } else {
            this.method4303(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ij.cl(III)V")
    public void method4281(int arg0, int arg1) {
        this.field3334 = arg0;
        this.field3335 = arg1;
        if (this.field3328 == null) {
            class250.method4497(this, 255, this.field3329, this.field3334, (byte) 0, true);
            return;
        }
        int var3 = this.field3329;
        class165 var4 = this.field3328;
        byte[] var6 = null;
        class205 var7 = class248.field3326;
        synchronized (class248.field3326) {
            for (class245 var8 = (class245) class248.field3326.method3752(); var8 != null; var8 = (class245) class248.field3326.method3762()) {
                if ((long) var3 == var8.field2585 && var8.field3293 == var4 && var8.field3291 == 0) {
                    var6 = var8.field3292;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method3070(var3);
            this.method4303(var4, var3, var10, true);
        } else {
            this.method4303(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ij.cr(I[BZZB)V")
    public void method4282(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field3310[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field3310[arg0];
            if (this.field3327 != null) {
                class165 var10 = this.field3327;
                class245 var11 = new class245();
                var11.field3291 = 0;
                var11.field2585 = (long) arg0;
                var11.field3292 = arg1;
                var11.field3293 = var10;
                class205 var12 = class248.field3326;
                synchronized (class248.field3326) {
                    class248.field3326.method3747(var11);
                }
                class248.method3850();
                this.field3331[arg0] = true;
            }
            if (arg3) {
                this.field3315[arg0] = class188.method4462(arg1, false);
            }
            return;
        }
        if (this.field3330) {
            throw new RuntimeException();
        }
        if (this.field3328 != null) {
            int var5 = this.field3329;
            class165 var6 = this.field3328;
            class245 var7 = new class245();
            var7.field3291 = 0;
            var7.field2585 = (long) var5;
            var7.field3292 = arg1;
            var7.field3293 = var6;
            class205 var8 = class248.field3326;
            synchronized (class248.field3326) {
                class248.field3326.method3747(var7);
            }
            class248.method3850();
        }
        this.method4182(arg1);
        this.method4279();
    }

    @ObfuscatedName("ij.ca(Lfu;I[BZI)V")
    public void method4303(class165 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field3328 != arg0) {
            if (!arg3 && this.field3332 == arg1) {
                this.field3330 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field3331[arg1] = false;
                if (this.field3333 || arg3) {
                    class250.method4497(this, this.field3329, arg1, this.field3309[arg1], (byte) 2, arg3);
                }
                return;
            }
            field3336.reset();
            field3336.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field3336.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field3309[arg1] != var9 || this.field3310[arg1] != var10) {
                this.field3331[arg1] = false;
                if (this.field3333 || arg3) {
                    class250.method4497(this, this.field3329, arg1, this.field3309[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field3331[arg1] = true;
            if (arg3) {
                this.field3315[arg1] = class188.method4462(arg2, false);
            }
            return;
        }
        if (this.field3330) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class250.method4497(this, 255, this.field3329, this.field3334, (byte) 0, true);
            return;
        }
        field3336.reset();
        field3336.update(arg2, 0, arg2.length);
        int var5 = (int) field3336.getValue();
        if (this.field3334 != var5) {
            class250.method4497(this, 255, this.field3329, this.field3334, (byte) 0, true);
            return;
        }
        class185 var6 = new class185(class247.method2914(arg2));
        int var7 = var6.method3239();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3329 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method3292();
        }
        if (this.field3335 != var8) {
            class250.method4497(this, 255, this.field3329, this.field3334, (byte) 0, true);
            return;
        }
        this.method4182(arg2);
        this.method4279();
    }

    @ObfuscatedName("ij.cy(I)V")
    public void method4279() {
        this.field3331 = new boolean[this.field3315.length];
        for (int var1 = 0; var1 < this.field3331.length; var1++) {
            this.field3331[var1] = false;
        }
        if (this.field3327 == null) {
            this.field3330 = true;
            return;
        }
        this.field3332 = -1;
        for (int var2 = 0; var2 < this.field3331.length; var2++) {
            if (this.field3311[var2] > 0) {
                class165 var3 = this.field3327;
                class245 var5 = new class245();
                var5.field3291 = 1;
                var5.field2585 = (long) var2;
                var5.field3293 = var3;
                var5.field3294 = this;
                class205 var6 = class248.field3326;
                synchronized (class248.field3326) {
                    class248.field3326.method3747(var5);
                }
                class248.method3850();
                this.field3332 = var2;
            }
        }
        if (this.field3332 == -1) {
            this.field3330 = true;
        }
    }

    @ObfuscatedName("ij.z(II)I")
    public int method4190(int arg0) {
        if (this.field3315[arg0] != null) {
            return 100;
        } else if (this.field3331[arg0]) {
            return 100;
        } else {
            int var2 = this.field3329;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field1886 != null && Statics.field1886.field2585 == var3) {
                var5 = Statics.field3350.field2514 * 99 / (Statics.field3350.field2512.length - Statics.field1886.field3299) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("ij.cs(II)Z")
    public boolean method4285(int arg0) {
        return this.field3331[arg0];
    }

    @ObfuscatedName("ij.cq(II)Z")
    public boolean method4286(int arg0) {
        return this.method4195(arg0) != null;
    }

    @ObfuscatedName("ij.cz(B)I")
    public int method4293() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3315.length; var3++) {
            if (this.field3311[var3] > 0) {
                var1 += 100;
                var2 += this.method4190(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
