package deob;

@ObfuscatedName("gh")
public class class181 extends class481 {

    @ObfuscatedName("gh.ar")
    public static class299 field1874 = new class299(64);

    @ObfuscatedName("gh.ao")
    public static class299 field1870 = new class299(64);

    @ObfuscatedName("gh.ab")
    public int field1871;

    @ObfuscatedName("gh.ac")
    public int field1868 = 255;

    @ObfuscatedName("gh.al")
    public int field1873 = 255;

    @ObfuscatedName("gh.az")
    public int field1872 = -1;

    @ObfuscatedName("gh.ap")
    public int field1875 = 1;

    @ObfuscatedName("gh.av")
    public int field1876 = 70;

    @ObfuscatedName("gh.ax")
    public int field1877 = -1;

    @ObfuscatedName("gh.as")
    public int field1881 = -1;

    @ObfuscatedName("gh.ay")
    public int field1879 = 30;

    @ObfuscatedName("gh.ak")
    public int field1869 = 0;

    @ObfuscatedName("da.at(II)Lgh;")
    public static class181 method2320(int arg0) {
        class181 var1 = (class181) field1874.method5289((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1880.method6284(33, arg0);
        class181 var3 = new class181();
        var3.field1871 = arg0;
        if (var2 != null) {
            var3.method3330(new class527(var2));
        }
        field1874.method5303(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gh.ah(Luj;I)V")
    public void method3330(class527 arg0) {
        while (true) {
            int var2 = arg0.method8410();
            if (var2 == 0) {
                return;
            }
            this.method3322(arg0, var2);
        }
    }

    @ObfuscatedName("gh.ar(Luj;II)V")
    public void method3322(class527 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method8412();
        } else if (arg1 == 2) {
            this.field1868 = arg0.method8410();
        } else if (arg1 == 3) {
            this.field1873 = arg0.method8410();
        } else if (arg1 == 4) {
            this.field1872 = 0;
        } else if (arg1 == 5) {
            this.field1876 = arg0.method8412();
        } else if (arg1 == 6) {
            arg0.method8410();
        } else if (arg1 == 7) {
            this.field1877 = arg0.method8430();
        } else if (arg1 == 8) {
            this.field1881 = arg0.method8430();
        } else if (arg1 == 11) {
            this.field1872 = arg0.method8412();
        } else if (arg1 == 14) {
            this.field1879 = arg0.method8410();
        } else if (arg1 == 15) {
            this.field1869 = arg0.method8410();
        }
    }

    @ObfuscatedName("gh.ao(I)Luz;")
    public class541 method3323() {
        if (this.field1877 < 0) {
            return null;
        }
        class541 var1 = (class541) field1870.method5289((long) this.field1877);
        if (var1 != null) {
            return var1;
        }
        class541 var2 = class542.method7349(Statics.field1015, this.field1877, 0);
        if (var2 != null) {
            field1870.method5303(var2, (long) this.field1877);
        }
        return var2;
    }

    @ObfuscatedName("gh.ab(B)Luz;")
    public class541 method3324() {
        if (this.field1881 < 0) {
            return null;
        }
        class541 var1 = (class541) field1870.method5289((long) this.field1881);
        if (var1 != null) {
            return var1;
        }
        class541 var2 = class542.method7349(Statics.field1015, this.field1881, 0);
        if (var2 != null) {
            field1870.method5303(var2, (long) this.field1881);
        }
        return var2;
    }

    @ObfuscatedName("dy.au(B)V")
    public static void method2613() {
        field1874.method5292();
        field1870.method5292();
    }
}
