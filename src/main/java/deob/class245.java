package deob;

@ObfuscatedName("is")
public class class245 extends class195 {

    @ObfuscatedName("is.c")
    public static class190 field3321 = new class190(64);

    @ObfuscatedName("is.e")
    public boolean field3319 = false;

    @ObfuscatedName("is.i(Lfx;B)V")
    public void method3979(class174 arg0) {
        while (true) {
            int var2 = arg0.method2870();
            if (var2 == 0) {
                return;
            }
            this.method3980(arg0, var2);
        }
    }

    @ObfuscatedName("is.c(Lfx;IB)V")
    public void method3980(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3319 = true;
        }
    }
}
