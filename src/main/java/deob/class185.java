package deob;

@ObfuscatedName("gn")
public class class185 extends class404 {

    @ObfuscatedName("gn.c")
    public static class257 field1982 = new class257(64);

    @ObfuscatedName("gn.i")
    public char field1976;

    @ObfuscatedName("gn.f")
    public int field1979;

    @ObfuscatedName("gn.b")
    public String field1980;

    @ObfuscatedName("gn.n")
    public boolean field1981 = true;

    @ObfuscatedName("en.v(II)Lgn;")
    public static class185 method2862(int arg0) {
        class185 var1 = (class185) field1982.method4644((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1977.method5296(11, arg0);
        class185 var3 = new class185();
        if (var2 != null) {
            var3.method3244(new class438(var2));
        }
        var3.method3256();
        field1982.method4651(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gn.c(B)V")
    public void method3256() {
    }

    @ObfuscatedName("gn.i(Lpi;B)V")
    public void method3244(class438 arg0) {
        while (true) {
            int var2 = arg0.method6971();
            if (var2 == 0) {
                return;
            }
            this.method3247(arg0, var2);
        }
    }

    @ObfuscatedName("gn.f(Lpi;II)V")
    public void method3247(class438 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1976 = class346.method5050(arg0.method7093());
        } else if (arg1 == 2) {
            this.field1979 = arg0.method6976();
        } else if (arg1 == 4) {
            this.field1981 = false;
        } else if (arg1 == 5) {
            this.field1980 = arg0.method6981();
        }
    }

    @ObfuscatedName("gn.b(B)Z")
    public boolean method3248() {
        return this.field1976 == 's';
    }
}
