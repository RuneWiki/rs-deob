package deob;

@ObfuscatedName("ff")
public class class166 extends class365 {

    @ObfuscatedName("ff.q")
    public static class236 field1790 = new class236(64);

    @ObfuscatedName("ff.f")
    public char field1789;

    @ObfuscatedName("ff.j")
    public int field1794;

    @ObfuscatedName("ff.m")
    public String field1788;

    @ObfuscatedName("ff.k")
    public boolean field1791 = true;

    @ObfuscatedName("da.l(II)Lff;")
    public static class166 method2408(int arg0) {
        class166 var1 = (class166) field1790.method4223((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field149.method4756(11, arg0);
        class166 var3 = new class166();
        if (var2 != null) {
            var3.method2857(new class401(var2));
        }
        var3.method2868();
        field1790.method4225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ff.q(I)V")
    public void method2868() {
    }

    @ObfuscatedName("ff.f(Lot;I)V")
    public void method2857(class401 arg0) {
        while (true) {
            int var2 = arg0.method6272();
            if (var2 == 0) {
                return;
            }
            this.method2858(arg0, var2);
        }
    }

    @ObfuscatedName("ff.j(Lot;II)V")
    public void method2858(class401 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1789 = class317.method2712(arg0.method6273());
        } else if (arg1 == 2) {
            this.field1794 = arg0.method6277();
        } else if (arg1 == 4) {
            this.field1791 = false;
        } else if (arg1 == 5) {
            this.field1788 = arg0.method6474();
        }
    }

    @ObfuscatedName("ff.m(S)Z")
    public boolean method2859() {
        return this.field1789 == 's';
    }
}
