package deob;

@ObfuscatedName("fq")
public class class169 extends class387 {

    @ObfuscatedName("fq.l")
    public static class249 field1830 = new class249(64);

    @ObfuscatedName("fq.s")
    public char field1831;

    @ObfuscatedName("fq.e")
    public char field1832;

    @ObfuscatedName("fq.r")
    public String field1840 = class300.field3605;

    @ObfuscatedName("fq.o")
    public int field1834;

    @ObfuscatedName("fq.i")
    public int field1838 = 0;

    @ObfuscatedName("fq.w")
    public int[] field1836;

    @ObfuscatedName("fq.v")
    public int[] field1837;

    @ObfuscatedName("fq.a")
    public String[] field1829;

    @ObfuscatedName("ad.c(Lkq;B)V")
    public static void method757(class307 arg0) {
        Statics.field1835 = arg0;
    }

    @ObfuscatedName("mk.l(II)Lfq;")
    public static class169 method5855(int arg0) {
        class169 var1 = (class169) field1830.method4472((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1835.method5066(8, arg0);
        class169 var3 = new class169();
        if (var2 != null) {
            var3.method2949(new class421(var2));
        }
        field1830.method4482(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fq.s(Lpi;I)V")
    public void method2949(class421 arg0) {
        while (true) {
            int var2 = arg0.method6686();
            if (var2 == 0) {
                return;
            }
            this.method2947(arg0, var2);
        }
    }

    @ObfuscatedName("fq.e(Lpi;II)V")
    public void method2947(class421 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1831 = (char) arg0.method6686();
        } else if (arg1 == 2) {
            this.field1832 = (char) arg0.method6686();
        } else if (arg1 == 3) {
            this.field1840 = arg0.method6674();
        } else if (arg1 == 4) {
            this.field1834 = arg0.method6669();
        } else if (arg1 == 5) {
            this.field1838 = arg0.method6666();
            this.field1836 = new int[this.field1838];
            this.field1829 = new String[this.field1838];
            for (int var3 = 0; var3 < this.field1838; var3++) {
                this.field1836[var3] = arg0.method6669();
                this.field1829[var3] = arg0.method6674();
            }
        } else if (arg1 == 6) {
            this.field1838 = arg0.method6666();
            this.field1836 = new int[this.field1838];
            this.field1837 = new int[this.field1838];
            for (int var4 = 0; var4 < this.field1838; var4++) {
                this.field1836[var4] = arg0.method6669();
                this.field1837[var4] = arg0.method6669();
            }
        }
    }

    @ObfuscatedName("fq.r(I)I")
    public int method2948() {
        return this.field1838;
    }
}
