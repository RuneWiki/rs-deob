package deob;

@ObfuscatedName("cs")
public class class99 extends class110 {

    @ObfuscatedName("cs.o")
    public long field1635 = System.nanoTime();

    @ObfuscatedName("cs.o(S)V")
    public void method1787() {
        this.field1635 = System.nanoTime();
    }

    @ObfuscatedName("cs.m(III)I")
    public int method1789(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1635 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class162.method238(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1635 < var7)) {
            var9++;
            this.field1635 += (long) arg0 * 1000000L;
        }
        if (this.field1635 < var7) {
            this.field1635 = var7;
        }
        return var9;
    }
}
