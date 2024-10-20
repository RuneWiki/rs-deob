package deob;

@ObfuscatedName("if")
public class class241 extends class195 {

    @ObfuscatedName("if.o")
    public static class190 field3250 = new class190(64);

    @ObfuscatedName("if.i")
    public int field3249 = 0;

    @ObfuscatedName("if.c(Lfp;B)V")
    public void method3863(class174 arg0) {
        while (true) {
            int var2 = arg0.method2843();
            if (var2 == 0) {
                return;
            }
            this.method3867(arg0, var2);
        }
    }

    @ObfuscatedName("if.o(Lfp;IB)V")
    public void method3867(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3249 = arg0.method2861();
        }
    }
}
