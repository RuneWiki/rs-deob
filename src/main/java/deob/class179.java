package deob;

@ObfuscatedName("fq")
public class class179 extends class425 {

    @ObfuscatedName("fq.f")
    public static class266 field1898 = new class266(64);

    @ObfuscatedName("fq.c")
    public boolean field1899 = false;

    @ObfuscatedName("fq.f(Lqr;B)V")
    public void method3153(class464 arg0) {
        while (true) {
            int var2 = arg0.method7735();
            if (var2 == 0) {
                return;
            }
            this.method3157(arg0, var2);
        }
    }

    @ObfuscatedName("fq.c(Lqr;IB)V")
    public void method3157(class464 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1899 = true;
        }
    }
}
