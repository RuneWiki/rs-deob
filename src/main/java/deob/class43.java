package deob;

@ObfuscatedName("ag")
public class class43 extends class187 {

    @ObfuscatedName("ag.v")
    public static class176 field977 = new class176(64);

    @ObfuscatedName("ag.i")
    public int field980;

    @ObfuscatedName("ag.b")
    public int field981;

    @ObfuscatedName("ag.l")
    public int field982;

    @ObfuscatedName("eb.a(Lek;I)V")
    public static void method2701(class151 arg0) {
        Statics.field978 = arg0;
    }

    @ObfuscatedName("c.v(II)Lag;")
    public static class43 method552(int arg0) {
        class43 var1 = (class43) field977.method3181((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field978.method2731(14, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method829(new class110(var2));
        }
        field977.method3183(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.i(Ldi;B)V")
    public void method829(class110 arg0) {
        while (true) {
            int var2 = arg0.method2199();
            if (var2 == 0) {
                return;
            }
            this.method830(arg0, var2);
        }
    }

    @ObfuscatedName("ag.b(Ldi;II)V")
    public void method830(class110 arg0, int arg1) {
        if (arg1 == 1) {
            this.field980 = arg0.method2282();
            this.field981 = arg0.method2199();
            this.field982 = arg0.method2199();
        }
    }

    @ObfuscatedName("em.l(I)V")
    public static void method2711() {
        field977.method3184();
    }
}
