package deob;

@ObfuscatedName("bp")
public class class53 extends class208 {

    @ObfuscatedName("bp.z")
    public static class197 field1104 = new class197(64);

    @ObfuscatedName("bp.t")
    public char field1108;

    @ObfuscatedName("bp.y")
    public char field1105;

    @ObfuscatedName("bp.p")
    public String field1106 = "null";

    @ObfuscatedName("bp.g")
    public int field1107;

    @ObfuscatedName("bp.m")
    public int field1118 = 0;

    @ObfuscatedName("bp.f")
    public int[] field1103;

    @ObfuscatedName("bp.k")
    public int[] field1110;

    @ObfuscatedName("bp.h")
    public String[] field1111;

    @ObfuscatedName("eq.s(IB)Lbp;")
    public static class53 method2746(int arg0) {
        class53 var1 = (class53) field1104.method3523((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3216.method3091(8, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1019(new class123(var2));
        }
        field1104.method3521(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bp.z(Ldy;I)V")
    public void method1019(class123 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method1025(arg0, var2);
        }
    }

    @ObfuscatedName("bp.t(Ldy;II)V")
    public void method1025(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1108 = (char) arg0.method2363();
        } else if (arg1 == 2) {
            this.field1105 = (char) arg0.method2363();
        } else if (arg1 == 3) {
            this.field1106 = arg0.method2385();
        } else if (arg1 == 4) {
            this.field1107 = arg0.method2408();
        } else if (arg1 == 5) {
            this.field1118 = arg0.method2550();
            this.field1103 = new int[this.field1118];
            this.field1111 = new String[this.field1118];
            for (int var3 = 0; var3 < this.field1118; var3++) {
                this.field1103[var3] = arg0.method2408();
                this.field1111[var3] = arg0.method2385();
            }
        } else if (arg1 == 6) {
            this.field1118 = arg0.method2550();
            this.field1103 = new int[this.field1118];
            this.field1110 = new int[this.field1118];
            for (int var4 = 0; var4 < this.field1118; var4++) {
                this.field1103[var4] = arg0.method2408();
                this.field1110[var4] = arg0.method2408();
            }
        }
    }
}
