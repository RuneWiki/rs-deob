package deob;

@ObfuscatedName("eq")
public class class146 extends class349 {

    @ObfuscatedName("eq.t")
    public static class223 field1597 = new class223(64);

    @ObfuscatedName("eq.v")
    public char field1596;

    @ObfuscatedName("eq.j")
    public char field1599;

    @ObfuscatedName("eq.l")
    public String field1600 = class270.field3234;

    @ObfuscatedName("eq.n")
    public int field1604;

    @ObfuscatedName("eq.w")
    public int field1602 = 0;

    @ObfuscatedName("eq.f")
    public int[] field1603;

    @ObfuscatedName("eq.o")
    public int[] field1606;

    @ObfuscatedName("eq.x")
    public String[] field1605;

    @ObfuscatedName("cz.s(II)Leq;")
    public static class146 method2098(int arg0) {
        class146 var1 = (class146) field1597.method3927((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1601.method4459(8, arg0);
        class146 var3 = new class146();
        if (var2 != null) {
            var3.method2497(new class385(var2));
        }
        field1597.method3929(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("eq.t(Lnv;B)V")
    public void method2497(class385 arg0) {
        while (true) {
            int var2 = arg0.method5958();
            if (var2 == 0) {
                return;
            }
            this.method2504(arg0, var2);
        }
    }

    @ObfuscatedName("eq.v(Lnv;II)V")
    public void method2504(class385 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1596 = (char) arg0.method5958();
        } else if (arg1 == 2) {
            this.field1599 = (char) arg0.method5958();
        } else if (arg1 == 3) {
            this.field1600 = arg0.method5967();
        } else if (arg1 == 4) {
            this.field1604 = arg0.method6182();
        } else if (arg1 == 5) {
            this.field1602 = arg0.method6053();
            this.field1603 = new int[this.field1602];
            this.field1605 = new String[this.field1602];
            for (int var3 = 0; var3 < this.field1602; var3++) {
                this.field1603[var3] = arg0.method6182();
                this.field1605[var3] = arg0.method5967();
            }
        } else if (arg1 == 6) {
            this.field1602 = arg0.method6053();
            this.field1603 = new int[this.field1602];
            this.field1606 = new int[this.field1602];
            for (int var4 = 0; var4 < this.field1602; var4++) {
                this.field1603[var4] = arg0.method6182();
                this.field1606[var4] = arg0.method6182();
            }
        }
    }

    @ObfuscatedName("eq.j(I)I")
    public int method2502() {
        return this.field1602;
    }
}
