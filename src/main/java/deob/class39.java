package deob;

@ObfuscatedName("as")
public class class39 extends class176 {

    @ObfuscatedName("as.b")
    public static class172 field961 = new class172(64);

    @ObfuscatedName("as.r")
    public int field963;

    @ObfuscatedName("as.l")
    public int field964;

    @ObfuscatedName("as.s")
    public int field965;

    @ObfuscatedName("as.i(Lds;I)V")
    public void method819(class128 arg0) {
        while (true) {
            int var2 = arg0.method2531();
            if (var2 == 0) {
                return;
            }
            this.method816(arg0, var2);
        }
    }

    @ObfuscatedName("as.b(Lds;II)V")
    public void method816(class128 arg0, int arg1) {
        if (arg1 == 1) {
            this.field963 = arg0.method2473();
            this.field964 = arg0.method2531();
            this.field965 = arg0.method2531();
        }
    }
}
