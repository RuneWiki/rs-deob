package deob;

@ObfuscatedName("ax")
public class class48 extends class195 {

    @ObfuscatedName("ax.g")
    public static class184 field1092 = new class184(64);

    @ObfuscatedName("ax.n")
    public int field1095 = 0;

    @ObfuscatedName("a.y(Lfd;B)V")
    public static void method514(class158 arg0) {
        Statics.field1096 = arg0;
        Statics.field1093 = Statics.field1096.method2883(16);
    }

    @ObfuscatedName("b.k(II)Lax;")
    public static class48 method102(int arg0) {
        class48 var1 = (class48) field1092.method3327((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1096.method2874(16, arg0);
        class48 var3 = new class48();
        if (var2 != null) {
            var3.method947(new class111(var2));
        }
        field1092.method3340(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.g(Ldw;B)V")
    public void method947(class111 arg0) {
        while (true) {
            int var2 = arg0.method2205();
            if (var2 == 0) {
                return;
            }
            this.method961(arg0, var2);
        }
    }

    @ObfuscatedName("ax.n(Ldw;IB)V")
    public void method961(class111 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1095 = arg0.method2339();
        }
    }

    @ObfuscatedName("ag.t(B)V")
    public static void method670() {
        field1092.method3333();
    }
}
