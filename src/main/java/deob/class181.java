package deob;

@ObfuscatedName("gc")
public class class181 extends class488 {

    @ObfuscatedName("gc.ai")
    public static class304 field1896 = new class304(64);

    @ObfuscatedName("gc.ar")
    public int field1902 = -1;

    @ObfuscatedName("gc.as")
    public int[] field1897;

    @ObfuscatedName("gc.aa")
    public short[] field1899;

    @ObfuscatedName("gc.az")
    public short[] field1898;

    @ObfuscatedName("gc.ao")
    public short[] field1901;

    @ObfuscatedName("gc.au")
    public short[] field1894;

    @ObfuscatedName("gc.ak")
    public int[] field1903 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("gc.ah")
    public boolean field1904 = false;

    @ObfuscatedName("qz.aq(Lof;Lof;I)V")
    public static void method7251(class378 arg0, class378 arg1) {
        Statics.field1906 = arg0;
        Statics.field7 = arg1;
        Statics.field1895 = Statics.field1906.method6429(3);
    }

    @ObfuscatedName("ok.aw(IB)Lgc;")
    public static class181 method6578(int arg0) {
        class181 var1 = (class181) field1896.method5414((long) arg0);
        if (var1 != null) {
            return var1;
        } else if (Statics.field1906 == null) {
            return null;
        } else {
            byte[] var2 = Statics.field1906.method6489(3, arg0);
            class181 var3 = new class181();
            if (var2 != null) {
                var3.method3283(new class534(var2));
            }
            field1896.method5421(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("gc.al(Luq;I)V")
    public void method3283(class534 arg0) {
        while (true) {
            int var2 = arg0.method8591();
            if (var2 == 0) {
                return;
            }
            this.method3284(arg0, var2);
        }
    }

    @ObfuscatedName("gc.ai(Luq;IB)V")
    public void method3284(class534 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1902 = arg0.method8591();
        } else if (arg1 == 2) {
            int var3 = arg0.method8591();
            this.field1897 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1897[var4] = arg0.method8593();
            }
        } else if (arg1 == 3) {
            this.field1904 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method8591();
            this.field1899 = new short[var5];
            this.field1898 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1899[var6] = (short) arg0.method8593();
                this.field1898[var6] = (short) arg0.method8593();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method8591();
            this.field1901 = new short[var7];
            this.field1894 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1901[var8] = (short) arg0.method8593();
                this.field1894[var8] = (short) arg0.method8593();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1903[arg1 - 60] = arg0.method8593();
        }
    }

    @ObfuscatedName("gc.ar(I)Z")
    public boolean method3285() {
        if (this.field1897 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1897.length; var2++) {
            if (!Statics.field7.method6420(this.field1897[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("gc.as(B)Lkf;")
    public class267 method3299() {
        if (this.field1897 == null) {
            return null;
        }
        class267[] var1 = new class267[this.field1897.length];
        for (int var2 = 0; var2 < this.field1897.length; var2++) {
            var1[var2] = class267.method4644(Statics.field7, this.field1897[var2], 0);
        }
        class267 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class267(var1, var1.length);
        }
        if (this.field1899 != null) {
            for (int var4 = 0; var4 < this.field1899.length; var4++) {
                var3.method4664(this.field1899[var4], this.field1898[var4]);
            }
        }
        if (this.field1901 != null) {
            for (int var5 = 0; var5 < this.field1901.length; var5++) {
                var3.method4666(this.field1901[var5], this.field1894[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("gc.aa(B)Z")
    public boolean method3287() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1903[var2] != -1 && !Statics.field7.method6420(this.field1903[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("gc.az(I)Lkf;")
    public class267 method3288() {
        class267[] var1 = new class267[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1903[var3] != -1) {
                var1[var2++] = class267.method4644(Statics.field7, this.field1903[var3], 0);
            }
        }
        class267 var4 = new class267(var1, var2);
        if (this.field1899 != null) {
            for (int var5 = 0; var5 < this.field1899.length; var5++) {
                var4.method4664(this.field1899[var5], this.field1898[var5]);
            }
        }
        if (this.field1901 != null) {
            for (int var6 = 0; var6 < this.field1901.length; var6++) {
                var4.method4666(this.field1901[var6], this.field1894[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("hs.ao(I)V")
    public static void method3771() {
        field1896.method5418();
    }

    @ObfuscatedName("rk.au(I)V")
    public static void method7538() {
        Statics.field1906 = null;
        Statics.field7 = null;
        Statics.field1895 = 0;
    }
}
