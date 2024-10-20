package deob;

@ObfuscatedName("rt")
public class class486 {

    @ObfuscatedName("rt.h")
    public static final class486 field5053 = new class486(0);

    @ObfuscatedName("rt.e")
    public static final class486 field5048 = new class486(1);

    @ObfuscatedName("rt.v")
    public static final class486 field5049 = new class486(2);

    @ObfuscatedName("rt.x")
    public final int field5051;

    public class486(int arg0) {
        this.field5051 = arg0;
    }

    @ObfuscatedName("hj.h(II)Lrt;")
    public static class486 method4415(int arg0) {
        class486[] var1 = new class486[] { field5049, field5053, field5048 };
        class486[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class486 var4 = var2[var3];
            if (var4.field5051 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
