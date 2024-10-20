package deob;

@ObfuscatedName("ea")
public final class class156 {

    @ObfuscatedName("ea.o")
    public final int[] field1722;

    public class156() {
        this.field1722 = new int[4096];
    }

    public class156(int[] arg0) {
        this.field1722 = arg0;
    }

    @ObfuscatedName("ea.f(IIB)I")
    public final int method2727(int arg0, int arg1) {
        return this.field1722[arg1 * 64 + arg0];
    }
}
