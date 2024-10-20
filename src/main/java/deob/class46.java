package deob;

@ObfuscatedName("av")
public class class46 extends class181 {

    @ObfuscatedName("av.x")
    public static class171 field1063 = new class171(64);

    @ObfuscatedName("av.j")
    public int field1064 = 0;

    @ObfuscatedName("a.b(IB)Lav;")
    public static class46 method498(int arg0) {
        class46 var1 = (class46) field1063.method3114((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1065.method2692(16, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method883(new class107(var2));
        }
        field1063.method3116(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.u(Ldh;I)V")
    public void method883(class107 arg0) {
        while (true) {
            int var2 = arg0.method2134();
            if (var2 == 0) {
                return;
            }
            this.method884(arg0, var2);
        }
    }

    @ObfuscatedName("av.x(Ldh;II)V")
    public void method884(class107 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1064 = arg0.method2136();
        }
    }

    @ObfuscatedName("ab.j(I)V")
    public static void method562() {
        field1063.method3117();
    }
}
