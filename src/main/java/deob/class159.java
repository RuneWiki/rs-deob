package deob;

@ObfuscatedName("fg")
public class class159 extends class364 {

    @ObfuscatedName("fg.c")
    public static class236 field1687 = new class236(64);

    @ObfuscatedName("fg.m")
    public char field1688;

    @ObfuscatedName("fg.k")
    public char field1690;

    @ObfuscatedName("fg.o")
    public String field1696 = class283.field3339;

    @ObfuscatedName("fg.g")
    public int field1691;

    @ObfuscatedName("fg.z")
    public int field1692 = 0;

    @ObfuscatedName("fg.a")
    public int[] field1697;

    @ObfuscatedName("fg.u")
    public int[] field1694;

    @ObfuscatedName("fg.e")
    public String[] field1695;

    @ObfuscatedName("cl.n(Lkk;I)V")
    public static void method1952(class290 arg0) {
        Statics.field1693 = arg0;
    }

    @ObfuscatedName("eg.c(II)Lfg;")
    public static class159 method2647(int arg0) {
        class159 var1 = (class159) field1687.method4167((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1693.method4710(8, arg0);
        class159 var3 = new class159();
        if (var2 != null) {
            var3.method2687(new class400(var2));
        }
        field1687.method4169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fg.m(Lot;I)V")
    public void method2687(class400 arg0) {
        while (true) {
            int var2 = arg0.method6217();
            if (var2 == 0) {
                return;
            }
            this.method2688(arg0, var2);
        }
    }

    @ObfuscatedName("fg.k(Lot;IB)V")
    public void method2688(class400 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1688 = (char) arg0.method6217();
        } else if (arg1 == 2) {
            this.field1690 = (char) arg0.method6217();
        } else if (arg1 == 3) {
            this.field1696 = arg0.method6226();
        } else if (arg1 == 4) {
            this.field1691 = arg0.method6222();
        } else if (arg1 == 5) {
            this.field1692 = arg0.method6219();
            this.field1697 = new int[this.field1692];
            this.field1695 = new String[this.field1692];
            for (int var3 = 0; var3 < this.field1692; var3++) {
                this.field1697[var3] = arg0.method6222();
                this.field1695[var3] = arg0.method6226();
            }
        } else if (arg1 == 6) {
            this.field1692 = arg0.method6219();
            this.field1697 = new int[this.field1692];
            this.field1694 = new int[this.field1692];
            for (int var4 = 0; var4 < this.field1692; var4++) {
                this.field1697[var4] = arg0.method6222();
                this.field1694[var4] = arg0.method6222();
            }
        }
    }

    @ObfuscatedName("fg.o(I)I")
    public int method2695() {
        return this.field1692;
    }
}
