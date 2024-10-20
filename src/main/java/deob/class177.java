package deob;

@ObfuscatedName("fr")
public class class177 extends class382 {

    @ObfuscatedName("fr.b")
    public static class249 field1914 = new class249(64);

    @ObfuscatedName("fr.p")
    public char field1913;

    @ObfuscatedName("fr.m")
    public int field1919;

    @ObfuscatedName("fr.t")
    public String field1915;

    @ObfuscatedName("fr.s")
    public boolean field1918 = true;

    @ObfuscatedName("cl.c(Lku;I)V")
    public static void method2048(class302 arg0) {
        Statics.field1916 = arg0;
    }

    @ObfuscatedName("fs.b(IB)Lfr;")
    public static class177 method3028(int arg0) {
        class177 var1 = (class177) field1914.method4514((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1916.method5053(11, arg0);
        class177 var3 = new class177();
        if (var2 != null) {
            var3.method3090(new class419(var2));
        }
        var3.method3089();
        field1914.method4515(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fr.p(I)V")
    public void method3089() {
    }

    @ObfuscatedName("fr.m(Lpi;B)V")
    public void method3090(class419 arg0) {
        while (true) {
            int var2 = arg0.method6781();
            if (var2 == 0) {
                return;
            }
            this.method3095(arg0, var2);
        }
    }

    @ObfuscatedName("fr.t(Lpi;II)V")
    public void method3095(class419 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1913 = class329.method4892(arg0.method6846());
        } else if (arg1 == 2) {
            this.field1919 = arg0.method6675();
        } else if (arg1 == 4) {
            this.field1918 = false;
        } else if (arg1 == 5) {
            this.field1915 = arg0.method6707();
        }
    }

    @ObfuscatedName("fr.s(I)Z")
    public boolean method3092() {
        return this.field1913 == 's';
    }
}
