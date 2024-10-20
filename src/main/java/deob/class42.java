package deob;

@ObfuscatedName("ak")
public class class42 extends class181 {

    @ObfuscatedName("ak.u")
    public static class171 field978 = new class171(64);

    @ObfuscatedName("ak.x")
    public int field980;

    @ObfuscatedName("ak.j")
    public int field981;

    @ObfuscatedName("ak.o")
    public int field979;

    @ObfuscatedName("as.b(II)Lak;")
    public static class42 method636(int arg0) {
        class42 var1 = (class42) field978.method3114((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field987.method2692(14, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method796(new class107(var2));
        }
        field978.method3116(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.u(Ldh;I)V")
    public void method796(class107 arg0) {
        while (true) {
            int var2 = arg0.method2134();
            if (var2 == 0) {
                return;
            }
            this.method798(arg0, var2);
        }
    }

    @ObfuscatedName("ak.x(Ldh;II)V")
    public void method798(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field980 = arg0.method2136();
            this.field981 = arg0.method2134();
            this.field979 = arg0.method2134();
        }
    }

    @ObfuscatedName("ap.j(B)V")
    public static void method677() {
        field978.method3117();
    }
}
