package deob;

@ObfuscatedName("aa")
public class class38 extends class174 {

    @ObfuscatedName("aa.c")
    public static class170 field948 = new class170(64);

    @ObfuscatedName("aa.p")
    public int field957;

    @ObfuscatedName("aa.z")
    public int field950;

    @ObfuscatedName("aa.m")
    public int field951;

    @ObfuscatedName("aa.c(Ldo;B)V")
    public void method800(class127 arg0) {
        while (true) {
            int var2 = arg0.method2534();
            if (var2 == 0) {
                return;
            }
            this.method801(arg0, var2);
        }
    }

    @ObfuscatedName("aa.p(Ldo;II)V")
    public void method801(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field957 = arg0.method2427();
            this.field950 = arg0.method2534();
            this.field951 = arg0.method2534();
        }
    }
}
