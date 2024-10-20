package deob;

@ObfuscatedName("it")
public class class255 extends class207 {

    @ObfuscatedName("it.s")
    public static class201 field3232 = new class201(64);

    @ObfuscatedName("it.l")
    public int field3231 = 0;

    @ObfuscatedName("it.w(Lgk;I)V")
    public void method4418(class183 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4419(arg0, var2);
        }
    }

    @ObfuscatedName("it.s(Lgk;IB)V")
    public void method4419(class183 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3231 = arg0.method3253();
        }
    }
}
