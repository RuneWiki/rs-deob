package deob;

@ObfuscatedName("fe")
public class class174 extends class405 {

    @ObfuscatedName("fe.q")
    public static class256 field1875 = new class256(64);

    @ObfuscatedName("fe.f")
    public static class256 field1876 = new class256(64);

    @ObfuscatedName("fe.j")
    public int field1877;

    @ObfuscatedName("fe.w")
    public int field1887 = 255;

    @ObfuscatedName("fe.y")
    public int field1880 = 255;

    @ObfuscatedName("fe.i")
    public int field1873 = -1;

    @ObfuscatedName("fe.s")
    public int field1882 = 1;

    @ObfuscatedName("fe.t")
    public int field1879 = 70;

    @ObfuscatedName("fe.z")
    public int field1884 = -1;

    @ObfuscatedName("fe.r")
    public int field1885 = -1;

    @ObfuscatedName("fe.u")
    public int field1886 = 30;

    @ObfuscatedName("fe.k")
    public int field1881 = 0;

    @ObfuscatedName("jv.c(II)Lfe;")
    public static class174 method4759(int arg0) {
        class174 var1 = (class174) field1875.method4691((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1891.method5305(33, arg0);
        class174 var3 = new class174();
        if (var2 != null) {
            var3.method3122(new class443(var2));
        }
        field1875.method4693(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fe.v(Lqt;I)V")
    public void method3122(class443 arg0) {
        while (true) {
            int var2 = arg0.method7047();
            if (var2 == 0) {
                return;
            }
            this.method3129(arg0, var2);
        }
    }

    @ObfuscatedName("fe.q(Lqt;II)V")
    public void method3129(class443 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method7049();
        } else if (arg1 == 2) {
            this.field1887 = arg0.method7047();
        } else if (arg1 == 3) {
            this.field1880 = arg0.method7047();
        } else if (arg1 == 4) {
            this.field1873 = 0;
        } else if (arg1 == 5) {
            this.field1879 = arg0.method7049();
        } else if (arg1 == 6) {
            arg0.method7047();
        } else if (arg1 == 7) {
            this.field1884 = arg0.method7066();
        } else if (arg1 == 8) {
            this.field1885 = arg0.method7066();
        } else if (arg1 == 11) {
            this.field1873 = arg0.method7049();
        } else if (arg1 == 14) {
            this.field1886 = arg0.method7047();
        } else if (arg1 == 15) {
            this.field1881 = arg0.method7047();
        }
    }

    @ObfuscatedName("fe.f(B)Lqe;")
    public class456 method3124() {
        if (this.field1884 < 0) {
            return null;
        }
        class456 var1 = (class456) field1876.method4691((long) this.field1884);
        if (var1 != null) {
            return var1;
        }
        class456 var2 = class457.method52(Statics.field1878, this.field1884, 0);
        if (var2 != null) {
            field1876.method4693(var2, (long) this.field1884);
        }
        return var2;
    }

    @ObfuscatedName("fe.j(I)Lqe;")
    public class456 method3125() {
        if (this.field1885 < 0) {
            return null;
        }
        class456 var1 = (class456) field1876.method4691((long) this.field1885);
        if (var1 != null) {
            return var1;
        }
        class456 var2 = class457.method52(Statics.field1878, this.field1885, 0);
        if (var2 != null) {
            field1876.method4693(var2, (long) this.field1885);
        }
        return var2;
    }

    @ObfuscatedName("cz.e(B)V")
    public static void method2274() {
        field1875.method4695();
        field1876.method4695();
    }
}
