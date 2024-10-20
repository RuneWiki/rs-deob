package deob;

@ObfuscatedName("fy")
public class class165 extends class365 {

    @ObfuscatedName("fy.w")
    public static class236 field1775 = new class236(64);

    @ObfuscatedName("fy.s")
    public int field1777;

    @ObfuscatedName("fy.a")
    public int field1778;

    @ObfuscatedName("fy.o")
    public int field1779;

    @ObfuscatedName("fy.g")
    public static final int[] field1781 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1781[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("cd.i(Lko;I)V")
    public static void method2067(class290 arg0) {
        Statics.field1780 = arg0;
    }

    @ObfuscatedName("ey.w(IB)Lfy;")
    public static class165 method2655(int arg0) {
        class165 var1 = (class165) field1775.method4205((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1780.method4743(14, arg0);
        class165 var3 = new class165();
        if (var2 != null) {
            var3.method2878(new class401(var2));
        }
        field1775.method4206(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fy.s(Lop;S)V")
    public void method2878(class401 arg0) {
        while (true) {
            int var2 = arg0.method6240();
            if (var2 == 0) {
                return;
            }
            this.method2874(arg0, var2);
        }
    }

    @ObfuscatedName("fy.a(Lop;II)V")
    public void method2874(class401 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1777 = arg0.method6242();
            this.field1778 = arg0.method6240();
            this.field1779 = arg0.method6240();
        }
    }
}
