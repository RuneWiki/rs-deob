package deob;

@ObfuscatedName("gr")
public class class185 extends class407 {

    @ObfuscatedName("gr.p")
    public static class257 field2029 = new class257(64);

    @ObfuscatedName("gr.f")
    public char field2028;

    @ObfuscatedName("gr.n")
    public int field2032;

    @ObfuscatedName("gr.k")
    public String field2030;

    @ObfuscatedName("gr.w")
    public boolean field2033 = true;

    @ObfuscatedName("bf.c(II)Lgr;")
    public static class185 method2006(int arg0) {
        class185 var1 = (class185) field2029.method4789((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2035.method5499(11, arg0);
        class185 var3 = new class185();
        if (var2 != null) {
            var3.method3352(new class445(var2));
        }
        var3.method3344();
        field2029.method4781(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gr.p(I)V")
    public void method3344() {
    }

    @ObfuscatedName("gr.f(Lqq;B)V")
    public void method3352(class445 arg0) {
        while (true) {
            int var2 = arg0.method7196();
            if (var2 == 0) {
                return;
            }
            this.method3346(arg0, var2);
        }
    }

    @ObfuscatedName("gr.n(Lqq;II)V")
    public void method3346(class445 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2028 = class343.method5052(arg0.method7197());
        } else if (arg1 == 2) {
            this.field2032 = arg0.method7201();
        } else if (arg1 == 4) {
            this.field2033 = false;
        } else if (arg1 == 5) {
            this.field2030 = arg0.method7206();
        }
    }

    @ObfuscatedName("gr.k(B)Z")
    public boolean method3343() {
        return this.field2028 == 's';
    }
}
