package deob;

@ObfuscatedName("as")
public class class42 extends class182 {

    @ObfuscatedName("as.r")
    public static class171 field984 = new class171(64);

    @ObfuscatedName("as.y")
    public int field978;

    @ObfuscatedName("as.w")
    public int field981;

    @ObfuscatedName("as.m")
    public int field979;

    @ObfuscatedName("p.k(II)Las;")
    public static class42 method85(int arg0) {
        class42 var1 = (class42) field984.method3141((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field980.method2749(14, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method813(new class107(var2));
        }
        field984.method3137(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.r(Lde;I)V")
    public void method813(class107 arg0) {
        while (true) {
            int var2 = arg0.method2111();
            if (var2 == 0) {
                return;
            }
            this.method819(arg0, var2);
        }
    }

    @ObfuscatedName("as.y(Lde;II)V")
    public void method819(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field978 = arg0.method2232();
            this.field981 = arg0.method2111();
            this.field979 = arg0.method2111();
        }
    }

    @ObfuscatedName("e.w(I)V")
    public static void method468() {
        field984.method3138();
    }
}
