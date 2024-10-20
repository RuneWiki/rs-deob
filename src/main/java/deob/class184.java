package deob;

@ObfuscatedName("ga")
public class class184 extends class435 {

    @ObfuscatedName("ga.w")
    public static class273 field1959 = new class273(64);

    @ObfuscatedName("ga.v")
    public boolean field1960 = false;

    @ObfuscatedName("bk.f(Lln;B)V")
    public static void method1984(class337 arg0) {
        Statics.field1962 = arg0;
    }

    @ObfuscatedName("ga.w(Lrd;I)V")
    public void method3336(class474 arg0) {
        while (true) {
            int var2 = arg0.method7964();
            if (var2 == 0) {
                return;
            }
            this.method3339(arg0, var2);
        }
    }

    @ObfuscatedName("ga.v(Lrd;IB)V")
    public void method3339(class474 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1960 = true;
        }
    }
}
