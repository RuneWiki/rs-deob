package deob;

@ObfuscatedName("eh")
public class class140 {

    @ObfuscatedName("eh.e")
    public static final class140 field2365 = new class140(0);

    @ObfuscatedName("eh.i")
    public static final class140 field2366 = new class140(1);

    @ObfuscatedName("eh.k")
    public static final class140 field2367 = new class140(2);

    @ObfuscatedName("eh.q")
    public final int field2368;

    @ObfuscatedName("es.e(I)[Leh;")
    public static class140[] method2712() {
        return new class140[] { field2366, field2367, field2365 };
    }

    public class140(int arg0) {
        this.field2368 = arg0;
    }

    @ObfuscatedName("dv.i(II)Leh;")
    public static class140 method2323(int arg0) {
        class140[] var1 = method2712();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class140 var3 = var1[var2];
            if (var3.field2368 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
