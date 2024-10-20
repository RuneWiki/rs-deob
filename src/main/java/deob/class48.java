package deob;

@ObfuscatedName("au")
public class class48 extends class208 {

    @ObfuscatedName("au.l")
    public static class197 field1074 = new class197(64);

    @ObfuscatedName("au.c")
    public boolean field1073 = false;

    @ObfuscatedName("au.e(Ldd;B)V")
    public void method985(class123 arg0) {
        while (true) {
            int var2 = arg0.method2464();
            if (var2 == 0) {
                return;
            }
            this.method984(arg0, var2);
        }
    }

    @ObfuscatedName("au.l(Ldd;IB)V")
    public void method984(class123 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1073 = true;
        }
    }
}
