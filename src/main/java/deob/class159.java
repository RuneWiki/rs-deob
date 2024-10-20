package deob;

@ObfuscatedName("fi")
public class class159 extends class365 {

    @ObfuscatedName("fi.w")
    public static class236 field1681 = new class236(64);

    @ObfuscatedName("fi.s")
    public char field1689;

    @ObfuscatedName("fi.a")
    public char field1683;

    @ObfuscatedName("fi.o")
    public String field1686 = class283.field3566;

    @ObfuscatedName("fi.g")
    public int field1685;

    @ObfuscatedName("fi.e")
    public int field1691 = 0;

    @ObfuscatedName("fi.p")
    public int[] field1687;

    @ObfuscatedName("fi.j")
    public int[] field1688;

    @ObfuscatedName("fi.b")
    public String[] field1692;

    @ObfuscatedName("cb.i(Lko;B)V")
    public static void method2328(class290 arg0) {
        Statics.field1682 = arg0;
    }

    @ObfuscatedName("fu.w(II)Lfi;")
    public static class159 method3110(int arg0) {
        class159 var1 = (class159) field1681.method4205((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1682.method4743(8, arg0);
        class159 var3 = new class159();
        if (var2 != null) {
            var3.method2777(new class401(var2));
        }
        field1681.method4206(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fi.s(Lop;I)V")
    public void method2777(class401 arg0) {
        while (true) {
            int var2 = arg0.method6240();
            if (var2 == 0) {
                return;
            }
            this.method2778(arg0, var2);
        }
    }

    @ObfuscatedName("fi.a(Lop;II)V")
    public void method2778(class401 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1689 = (char) arg0.method6240();
        } else if (arg1 == 2) {
            this.field1683 = (char) arg0.method6240();
        } else if (arg1 == 3) {
            this.field1686 = arg0.method6335();
        } else if (arg1 == 4) {
            this.field1685 = arg0.method6245();
        } else if (arg1 == 5) {
            this.field1691 = arg0.method6242();
            this.field1687 = new int[this.field1691];
            this.field1692 = new String[this.field1691];
            for (int var3 = 0; var3 < this.field1691; var3++) {
                this.field1687[var3] = arg0.method6245();
                this.field1692[var3] = arg0.method6335();
            }
        } else if (arg1 == 6) {
            this.field1691 = arg0.method6242();
            this.field1687 = new int[this.field1691];
            this.field1688 = new int[this.field1691];
            for (int var4 = 0; var4 < this.field1691; var4++) {
                this.field1687[var4] = arg0.method6245();
                this.field1688[var4] = arg0.method6245();
            }
        }
    }

    @ObfuscatedName("fi.o(I)I")
    public int method2779() {
        return this.field1691;
    }
}
