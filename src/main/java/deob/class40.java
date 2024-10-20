package deob;

@ObfuscatedName("av")
public class class40 extends class173 {

    @ObfuscatedName("av.f")
    public static class169 field1009 = new class169(64);

    @ObfuscatedName("av.n")
    public int field1014 = 0;

    @ObfuscatedName("i.v(II)Lav;")
    public static class40 method156(int arg0) {
        class40 var1 = (class40) field1009.method3224((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1017.method3020(5, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method879(new class126(var2));
        }
        field1009.method3231(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.f(Ldr;I)V")
    public void method879(class126 arg0) {
        while (true) {
            int var2 = arg0.method2466();
            if (var2 == 0) {
                return;
            }
            this.method880(arg0, var2);
        }
    }

    @ObfuscatedName("av.n(Ldr;II)V")
    public void method880(class126 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1014 = arg0.method2468();
        }
    }
}
