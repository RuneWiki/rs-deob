package deob;

@ObfuscatedName("aa")
public class class45 extends class185 {

    @ObfuscatedName("aa.j")
    public static class174 field1006 = new class174(64);

    @ObfuscatedName("aa.y")
    public int field1008 = 0;

    @ObfuscatedName("ae.c(Ler;I)V")
    public static void method559(class149 arg0) {
        Statics.field1011 = arg0;
    }

    @ObfuscatedName("as.j(IB)Laa;")
    public static class45 method575(int arg0) {
        class45 var1 = (class45) field1006.method3178((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1011.method2746(5, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method820(new class108(var2));
        }
        field1006.method3167(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.y(Ldx;I)V")
    public void method820(class108 arg0) {
        while (true) {
            int var2 = arg0.method2134();
            if (var2 == 0) {
                return;
            }
            this.method821(arg0, var2);
        }
    }

    @ObfuscatedName("aa.r(Ldx;IB)V")
    public void method821(class108 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1008 = arg0.method2136();
        }
    }
}
