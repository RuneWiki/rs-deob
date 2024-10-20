package deob;

@ObfuscatedName("fb")
public class class159 extends class365 {

    @ObfuscatedName("fb.q")
    public static class236 field1692 = new class236(64);

    @ObfuscatedName("fb.f")
    public char field1701;

    @ObfuscatedName("fb.j")
    public char field1694;

    @ObfuscatedName("fb.m")
    public String field1702 = class283.field3360;

    @ObfuscatedName("fb.k")
    public int field1696;

    @ObfuscatedName("fb.t")
    public int field1697 = 0;

    @ObfuscatedName("fb.a")
    public int[] field1698;

    @ObfuscatedName("fb.e")
    public int[] field1699;

    @ObfuscatedName("fb.i")
    public String[] field1700;

    @ObfuscatedName("lp.l(Lkl;B)V")
    public static void method5454(class290 arg0) {
        Statics.field1693 = arg0;
    }

    @ObfuscatedName("fm.q(IB)Lfb;")
    public static class159 method2853(int arg0) {
        class159 var1 = (class159) field1692.method4223((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1693.method4756(8, arg0);
        class159 var3 = new class159();
        if (var2 != null) {
            var3.method2742(new class401(var2));
        }
        field1692.method4225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fb.f(Lot;I)V")
    public void method2742(class401 arg0) {
        while (true) {
            int var2 = arg0.method6272();
            if (var2 == 0) {
                return;
            }
            this.method2743(arg0, var2);
        }
    }

    @ObfuscatedName("fb.j(Lot;II)V")
    public void method2743(class401 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1701 = (char) arg0.method6272();
        } else if (arg1 == 2) {
            this.field1694 = (char) arg0.method6272();
        } else if (arg1 == 3) {
            this.field1702 = arg0.method6474();
        } else if (arg1 == 4) {
            this.field1696 = arg0.method6277();
        } else if (arg1 == 5) {
            this.field1697 = arg0.method6284();
            this.field1698 = new int[this.field1697];
            this.field1700 = new String[this.field1697];
            for (int var3 = 0; var3 < this.field1697; var3++) {
                this.field1698[var3] = arg0.method6277();
                this.field1700[var3] = arg0.method6474();
            }
        } else if (arg1 == 6) {
            this.field1697 = arg0.method6284();
            this.field1698 = new int[this.field1697];
            this.field1699 = new int[this.field1697];
            for (int var4 = 0; var4 < this.field1697; var4++) {
                this.field1698[var4] = arg0.method6277();
                this.field1699[var4] = arg0.method6277();
            }
        }
    }

    @ObfuscatedName("fb.m(I)I")
    public int method2744() {
        return this.field1697;
    }
}
