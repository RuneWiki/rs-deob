package deob;

@ObfuscatedName("gy")
public class class171 extends class185 {

    @ObfuscatedName("gy.ac")
    public long field1803 = System.nanoTime();

    @ObfuscatedName("gy.ac(I)V")
    public void method3141() {
        this.field1803 = System.nanoTime();
    }

    @ObfuscatedName("gy.al(III)I")
    public int method3144(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1803 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class317.method2610(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1803 < var7)) {
            var9++;
            this.field1803 += (long) arg0 * 1000000L;
        }
        if (this.field1803 < var7) {
            this.field1803 = var7;
        }
        return var9;
    }
}
