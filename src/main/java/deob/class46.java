package deob;

@ObfuscatedName("ac")
public class class46 extends class181 {

    @ObfuscatedName("ac.y")
    public static class171 field1059 = new class171(64);

    @ObfuscatedName("ac.h")
    public int field1064 = 0;

    @ObfuscatedName("c.j(Leg;I)V")
    public static void method156(class146 arg0) {
        Statics.field2960 = arg0;
        Statics.field1061 = Statics.field2960.method2749(16);
    }

    @ObfuscatedName("cu.z(II)Lac;")
    public static class46 method2054(int arg0) {
        class46 var1 = (class46) field1059.method3171((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2960.method2739(16, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method883(new class107(var2));
        }
        field1059.method3173(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.y(Lde;I)V")
    public void method883(class107 arg0) {
        while (true) {
            int var2 = arg0.method2130();
            if (var2 == 0) {
                return;
            }
            this.method872(arg0, var2);
        }
    }

    @ObfuscatedName("ac.h(Lde;II)V")
    public void method872(class107 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1064 = arg0.method2132();
        }
    }
}
