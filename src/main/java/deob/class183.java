package deob;

@ObfuscatedName("gj")
public class class183 extends class425 {

    @ObfuscatedName("gj.f")
    public static class266 field1939 = new class266(64);

    @ObfuscatedName("gj.c")
    public char field1948;

    @ObfuscatedName("gj.x")
    public char field1941;

    @ObfuscatedName("gj.h")
    public String field1942 = class323.field3774;

    @ObfuscatedName("gj.j")
    public int field1940;

    @ObfuscatedName("gj.y")
    public int field1944 = 0;

    @ObfuscatedName("gj.d")
    public int[] field1947;

    @ObfuscatedName("gj.n")
    public int[] field1946;

    @ObfuscatedName("gj.r")
    public String[] field1938;

    @ObfuscatedName("fs.a(II)Lgj;")
    public static class183 method3092(int arg0) {
        class183 var1 = (class183) field1939.method4839((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1945.method5859(8, arg0);
        class183 var3 = new class183();
        if (var2 != null) {
            var3.method3220(new class464(var2));
        }
        field1939.method4834(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gj.f(Lqr;B)V")
    public void method3220(class464 arg0) {
        while (true) {
            int var2 = arg0.method7735();
            if (var2 == 0) {
                return;
            }
            this.method3221(arg0, var2);
        }
    }

    @ObfuscatedName("gj.c(Lqr;II)V")
    public void method3221(class464 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1948 = (char) arg0.method7735();
        } else if (arg1 == 2) {
            this.field1941 = (char) arg0.method7735();
        } else if (arg1 == 3) {
            this.field1942 = arg0.method7725();
        } else if (arg1 == 4) {
            this.field1940 = arg0.method7720();
        } else if (arg1 == 5) {
            this.field1944 = arg0.method7716();
            this.field1947 = new int[this.field1944];
            this.field1938 = new String[this.field1944];
            for (int var3 = 0; var3 < this.field1944; var3++) {
                this.field1947[var3] = arg0.method7720();
                this.field1938[var3] = arg0.method7725();
            }
        } else if (arg1 == 6) {
            this.field1944 = arg0.method7716();
            this.field1947 = new int[this.field1944];
            this.field1946 = new int[this.field1944];
            for (int var4 = 0; var4 < this.field1944; var4++) {
                this.field1947[var4] = arg0.method7720();
                this.field1946[var4] = arg0.method7720();
            }
        }
    }

    @ObfuscatedName("gj.x(B)I")
    public int method3230() {
        return this.field1944;
    }
}
