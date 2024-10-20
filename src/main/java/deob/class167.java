package deob;

@ObfuscatedName("fd")
public class class167 extends class365 {

    @ObfuscatedName("fd.q")
    public static class236 field1798 = new class236(64);

    @ObfuscatedName("fd.f")
    public class379 field1797;

    @ObfuscatedName("fi.l(Lkl;B)V")
    public static void method2735(class290 arg0) {
        Statics.field1793 = arg0;
    }

    @ObfuscatedName("bd.q(II)Lfd;")
    public static class167 method1795(int arg0) {
        class167 var1 = (class167) field1798.method4223((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1793.method4756(34, arg0);
        class167 var3 = new class167();
        if (var2 != null) {
            var3.method2877(new class401(var2));
        }
        var3.method2886();
        field1798.method4225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fd.f(I)V")
    public void method2886() {
    }

    @ObfuscatedName("fd.j(Lot;B)V")
    public void method2877(class401 arg0) {
        while (true) {
            int var2 = arg0.method6272();
            if (var2 == 0) {
                return;
            }
            this.method2891(arg0, var2);
        }
    }

    @ObfuscatedName("fd.m(Lot;II)V")
    public void method2891(class401 arg0, int arg1) {
        if (arg1 == 249) {
            this.field1797 = class158.method360(arg0, this.field1797);
        }
    }

    @ObfuscatedName("fd.k(IIB)I")
    public int method2879(int arg0, int arg1) {
        class379 var3 = this.field1797;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class369 var5 = (class369) var3.method6049((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4074;
            }
        }
        return var4;
    }

    @ObfuscatedName("fd.t(ILjava/lang/String;I)Ljava/lang/String;")
    public String method2880(int arg0, String arg1) {
        class379 var3 = this.field1797;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class366 var5 = (class366) var3.method6049((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4071;
            }
        }
        return var4;
    }
}
