package deob;

@ObfuscatedName("ii")
public class class245 extends class195 {

    @ObfuscatedName("ii.o")
    public static class190 field3293 = new class190(64);

    @ObfuscatedName("ii.i")
    public boolean field3295 = false;

    @ObfuscatedName("ii.c(Lfp;B)V")
    public void method3909(class174 arg0) {
        while (true) {
            int var2 = arg0.method2843();
            if (var2 == 0) {
                return;
            }
            this.method3911(arg0, var2);
        }
    }

    @ObfuscatedName("ii.o(Lfp;IB)V")
    public void method3911(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3295 = true;
        }
    }
}
