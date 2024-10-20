package deob;

@ObfuscatedName("ge")
public class class180 extends class485 {

    @ObfuscatedName("ge.aj")
    public static class302 field1873 = new class302(64);

    @ObfuscatedName("ge.aq")
    public int field1870 = -1;

    @ObfuscatedName("ge.ar")
    public int[] field1875;

    @ObfuscatedName("ge.ag")
    public short[] field1876;

    @ObfuscatedName("ge.ao")
    public short[] field1877;

    @ObfuscatedName("ge.ae")
    public short[] field1880;

    @ObfuscatedName("ge.aa")
    public short[] field1879;

    @ObfuscatedName("ge.au")
    public int[] field1874 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ge.an")
    public boolean field1881 = false;

    @ObfuscatedName("ok.am(II)Lge;")
    public static class180 method6334(int arg0) {
        class180 var1 = (class180) field1873.method5400((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1871.method6396(3, arg0);
        class180 var3 = new class180();
        if (var2 != null) {
            var3.method3330(new class531(var2));
        }
        field1873.method5402(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ge.ap(Luk;I)V")
    public void method3330(class531 arg0) {
        while (true) {
            int var2 = arg0.method8561();
            if (var2 == 0) {
                return;
            }
            this.method3322(arg0, var2);
        }
    }

    @ObfuscatedName("ge.af(Luk;II)V")
    public void method3322(class531 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1870 = arg0.method8561();
        } else if (arg1 == 2) {
            int var3 = arg0.method8561();
            this.field1875 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1875[var4] = arg0.method8775();
            }
        } else if (arg1 == 3) {
            this.field1881 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method8561();
            this.field1876 = new short[var5];
            this.field1877 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1876[var6] = (short) arg0.method8775();
                this.field1877[var6] = (short) arg0.method8775();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method8561();
            this.field1880 = new short[var7];
            this.field1879 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1880[var8] = (short) arg0.method8775();
                this.field1879[var8] = (short) arg0.method8775();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1874[arg1 - 60] = arg0.method8775();
        }
    }

    @ObfuscatedName("ge.aj(I)Z")
    public boolean method3323() {
        if (this.field1875 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1875.length; var2++) {
            if (!Statics.field1878.method6431(this.field1875[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ge.aq(I)Lkm;")
    public class265 method3336() {
        if (this.field1875 == null) {
            return null;
        }
        class265[] var1 = new class265[this.field1875.length];
        for (int var2 = 0; var2 < this.field1875.length; var2++) {
            var1[var2] = class265.method4650(Statics.field1878, this.field1875[var2], 0);
        }
        class265 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class265(var1, var1.length);
        }
        if (this.field1876 != null) {
            for (int var4 = 0; var4 < this.field1876.length; var4++) {
                var3.method4664(this.field1876[var4], this.field1877[var4]);
            }
        }
        if (this.field1880 != null) {
            for (int var5 = 0; var5 < this.field1880.length; var5++) {
                var3.method4665(this.field1880[var5], this.field1879[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ge.ar(I)Z")
    public boolean method3349() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1874[var2] != -1 && !Statics.field1878.method6431(this.field1874[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ge.ag(B)Lkm;")
    public class265 method3326() {
        class265[] var1 = new class265[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1874[var3] != -1) {
                var1[var2++] = class265.method4650(Statics.field1878, this.field1874[var3], 0);
            }
        }
        class265 var4 = new class265(var1, var2);
        if (this.field1876 != null) {
            for (int var5 = 0; var5 < this.field1876.length; var5++) {
                var4.method4664(this.field1876[var5], this.field1877[var5]);
            }
        }
        if (this.field1880 != null) {
            for (int var6 = 0; var6 < this.field1880.length; var6++) {
                var4.method4665(this.field1880[var6], this.field1879[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("eg.ao(I)V")
    public static void method2782() {
        field1873.method5403();
    }
}
