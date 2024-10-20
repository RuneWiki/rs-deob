package deob;

@ObfuscatedName("fn")
public class class166 extends class365 {

    @ObfuscatedName("fn.w")
    public static class236 field1784 = new class236(64);

    @ObfuscatedName("fn.s")
    public char field1785;

    @ObfuscatedName("fn.a")
    public int field1783;

    @ObfuscatedName("fn.o")
    public String field1787;

    @ObfuscatedName("fn.g")
    public boolean field1788 = true;

    @ObfuscatedName("aq.i(Lko;I)V")
    public static void method392(class290 arg0) {
        Statics.field1790 = arg0;
    }

    @ObfuscatedName("op.w(IB)Lfn;")
    public static class166 method6451(int arg0) {
        class166 var1 = (class166) field1784.method4205((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1790.method4743(11, arg0);
        class166 var3 = new class166();
        if (var2 != null) {
            var3.method2890(new class401(var2));
        }
        var3.method2889();
        field1784.method4206(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fn.s(I)V")
    public void method2889() {
    }

    @ObfuscatedName("fn.a(Lop;B)V")
    public void method2890(class401 arg0) {
        while (true) {
            int var2 = arg0.method6240();
            if (var2 == 0) {
                return;
            }
            this.method2891(arg0, var2);
        }
    }

    @ObfuscatedName("fn.o(Lop;IB)V")
    public void method2891(class401 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1785 = class317.method4651(arg0.method6241());
        } else if (arg1 == 2) {
            this.field1783 = arg0.method6245();
        } else if (arg1 == 4) {
            this.field1788 = false;
        } else if (arg1 == 5) {
            this.field1787 = arg0.method6335();
        }
    }

    @ObfuscatedName("fn.g(I)Z")
    public boolean method2892() {
        return this.field1785 == 's';
    }
}
