package deob;

@ObfuscatedName("fs")
public class class176 extends class405 {

    @ObfuscatedName("fs.v")
    public static class256 field1895 = new class256(64);

    @ObfuscatedName("fs.q")
    public char field1896;

    @ObfuscatedName("fs.f")
    public char field1897;

    @ObfuscatedName("fs.j")
    public String field1898 = class308.field3624;

    @ObfuscatedName("fs.e")
    public int field1905;

    @ObfuscatedName("fs.g")
    public int field1894 = 0;

    @ObfuscatedName("fs.w")
    public int[] field1901;

    @ObfuscatedName("fs.y")
    public int[] field1902;

    @ObfuscatedName("fs.i")
    public String[] field1903;

    @ObfuscatedName("hc.c(Llh;B)V")
    public static void method4534(class315 arg0) {
        Statics.field1899 = arg0;
    }

    @ObfuscatedName("dd.v(IB)Lfs;")
    public static class176 method2453(int arg0) {
        class176 var1 = (class176) field1895.method4691((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1899.method5305(8, arg0);
        class176 var3 = new class176();
        if (var2 != null) {
            var3.method3145(new class443(var2));
        }
        field1895.method4693(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fs.q(Lqt;B)V")
    public void method3145(class443 arg0) {
        while (true) {
            int var2 = arg0.method7047();
            if (var2 == 0) {
                return;
            }
            this.method3150(arg0, var2);
        }
    }

    @ObfuscatedName("fs.f(Lqt;II)V")
    public void method3150(class443 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1896 = (char) arg0.method7047();
        } else if (arg1 == 2) {
            this.field1897 = (char) arg0.method7047();
        } else if (arg1 == 3) {
            this.field1898 = arg0.method7057();
        } else if (arg1 == 4) {
            this.field1905 = arg0.method7052();
        } else if (arg1 == 5) {
            this.field1894 = arg0.method7049();
            this.field1901 = new int[this.field1894];
            this.field1903 = new String[this.field1894];
            for (int var3 = 0; var3 < this.field1894; var3++) {
                this.field1901[var3] = arg0.method7052();
                this.field1903[var3] = arg0.method7057();
            }
        } else if (arg1 == 6) {
            this.field1894 = arg0.method7049();
            this.field1901 = new int[this.field1894];
            this.field1902 = new int[this.field1894];
            for (int var4 = 0; var4 < this.field1894; var4++) {
                this.field1901[var4] = arg0.method7052();
                this.field1902[var4] = arg0.method7052();
            }
        }
    }

    @ObfuscatedName("fs.j(I)I")
    public int method3147() {
        return this.field1894;
    }
}
