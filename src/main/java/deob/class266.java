package deob;

@ObfuscatedName("je")
public class class266 extends class209 {

    @ObfuscatedName("je.q")
    public static class203 field3361 = new class203(64);

    @ObfuscatedName("je.m")
    public int field3363;

    @ObfuscatedName("je.j")
    public int field3360;

    @ObfuscatedName("je.g")
    public int field3364;

    @ObfuscatedName("je.c(Lgg;B)V")
    public void method4556(class185 arg0) {
        while (true) {
            int var2 = arg0.method3243();
            if (var2 == 0) {
                return;
            }
            this.method4557(arg0, var2);
        }
    }

    @ObfuscatedName("je.q(Lgg;IB)V")
    public void method4557(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3363 = arg0.method3245();
            this.field3360 = arg0.method3243();
            this.field3364 = arg0.method3243();
        }
    }
}
