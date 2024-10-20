package deob;

@ObfuscatedName("ap")
public class class42 extends class181 {

    @ObfuscatedName("ap.j")
    public static class171 field949 = new class171(64);

    @ObfuscatedName("ap.a")
    public int field954;

    @ObfuscatedName("ap.y")
    public int field951;

    @ObfuscatedName("ap.i")
    public int field952;

    @ObfuscatedName("af.z(IB)Lap;")
    public static class42 method565(int arg0) {
        class42 var1 = (class42) field949.method3162((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field956.method2705(14, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method792(new class107(var2));
        }
        field949.method3171(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.j(Ldq;I)V")
    public void method792(class107 arg0) {
        while (true) {
            int var2 = arg0.method2122();
            if (var2 == 0) {
                return;
            }
            this.method793(arg0, var2);
        }
    }

    @ObfuscatedName("ap.a(Ldq;II)V")
    public void method793(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field954 = arg0.method2239();
            this.field951 = arg0.method2122();
            this.field952 = arg0.method2122();
        }
    }

    @ObfuscatedName("cp.y(I)V")
    public static void method2070() {
        field949.method3164();
    }
}
