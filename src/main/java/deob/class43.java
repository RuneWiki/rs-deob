package deob;

@ObfuscatedName("ar")
public class class43 extends class187 {

    @ObfuscatedName("ar.t")
    public static class176 field978 = new class176(64);

    @ObfuscatedName("ar.f")
    public int field979;

    @ObfuscatedName("ar.j")
    public int field981;

    @ObfuscatedName("ar.l")
    public int field983;

    @ObfuscatedName("ce.v(Lem;I)V")
    public static void method1986(class151 arg0) {
        Statics.field984 = arg0;
    }

    @ObfuscatedName("ar.t(Ldp;B)V")
    public void method822(class110 arg0) {
        while (true) {
            int var2 = arg0.method2257();
            if (var2 == 0) {
                return;
            }
            this.method831(arg0, var2);
        }
    }

    @ObfuscatedName("ar.f(Ldp;II)V")
    public void method831(class110 arg0, int arg1) {
        if (arg1 == 1) {
            this.field979 = arg0.method2194();
            this.field981 = arg0.method2257();
            this.field983 = arg0.method2257();
        }
    }

    @ObfuscatedName("q.j(I)V")
    public static void method153() {
        field978.method3229();
    }
}
