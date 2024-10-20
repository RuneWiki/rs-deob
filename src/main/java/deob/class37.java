package deob;

@ObfuscatedName("ax")
public class class37 extends class172 {

    @ObfuscatedName("ax.y")
    public static class168 field935 = new class168(64);

    @ObfuscatedName("ax.x")
    public int field936;

    @ObfuscatedName("ax.z")
    public int field934;

    @ObfuscatedName("ax.c")
    public int field938;

    @ObfuscatedName("ax.j(Ldr;S)V")
    public void method787(class126 arg0) {
        while (true) {
            int var2 = arg0.method2399();
            if (var2 == 0) {
                return;
            }
            this.method788(arg0, var2);
        }
    }

    @ObfuscatedName("ax.y(Ldr;IS)V")
    public void method788(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field936 = arg0.method2405();
            this.field934 = arg0.method2399();
            this.field938 = arg0.method2399();
        }
    }

    @ObfuscatedName("ad.x(B)V")
    public static void method661() {
        field935.method3185();
    }
}
