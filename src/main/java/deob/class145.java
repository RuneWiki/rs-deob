package deob;

@ObfuscatedName("ep")
public class class145 extends class348 {

    @ObfuscatedName("ep.e")
    public static class222 field1621 = new class222(64);

    @ObfuscatedName("ep.v")
    public char field1622;

    @ObfuscatedName("ep.y")
    public char field1620;

    @ObfuscatedName("ep.j")
    public String field1624 = class269.field3238;

    @ObfuscatedName("ep.o")
    public int field1625;

    @ObfuscatedName("ep.m")
    public int field1627 = 0;

    @ObfuscatedName("ep.r")
    public int[] field1626;

    @ObfuscatedName("ep.h")
    public int[] field1629;

    @ObfuscatedName("ep.d")
    public String[] field1623;

    @ObfuscatedName("z.f(Ljp;I)V")
    public static void method69(class276 arg0) {
        Statics.field1628 = arg0;
    }

    @ObfuscatedName("gj.e(IB)Lep;")
    public static class145 method3833(int arg0) {
        class145 var1 = (class145) field1621.method3987((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1628.method4504(8, arg0);
        class145 var3 = new class145();
        if (var2 != null) {
            var3.method2514(new class384(var2));
        }
        field1621.method3988(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ep.v(Lnt;I)V")
    public void method2514(class384 arg0) {
        while (true) {
            int var2 = arg0.method5902();
            if (var2 == 0) {
                return;
            }
            this.method2515(arg0, var2);
        }
    }

    @ObfuscatedName("ep.y(Lnt;II)V")
    public void method2515(class384 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1622 = (char) arg0.method5902();
        } else if (arg1 == 2) {
            this.field1620 = (char) arg0.method5902();
        } else if (arg1 == 3) {
            this.field1624 = arg0.method5906();
        } else if (arg1 == 4) {
            this.field1625 = arg0.method5965();
        } else if (arg1 == 5) {
            this.field1627 = arg0.method5899();
            this.field1626 = new int[this.field1627];
            this.field1623 = new String[this.field1627];
            for (int var3 = 0; var3 < this.field1627; var3++) {
                this.field1626[var3] = arg0.method5965();
                this.field1623[var3] = arg0.method5906();
            }
        } else if (arg1 == 6) {
            this.field1627 = arg0.method5899();
            this.field1626 = new int[this.field1627];
            this.field1629 = new int[this.field1627];
            for (int var4 = 0; var4 < this.field1627; var4++) {
                this.field1626[var4] = arg0.method5965();
                this.field1629[var4] = arg0.method5965();
            }
        }
    }

    @ObfuscatedName("ep.j(I)I")
    public int method2516() {
        return this.field1627;
    }
}
