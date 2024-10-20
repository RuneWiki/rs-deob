package deob;

@ObfuscatedName("uy")
public class class536 implements class402 {

    @ObfuscatedName("uy.ab")
    public static final class536 field5300 = new class536(0, 0, Integer.class, new class533());

    @ObfuscatedName("uy.ay")
    public static final class536 field5294 = new class536(1, 1, Long.class, new class535());

    @ObfuscatedName("uy.an")
    public static final class536 field5293 = new class536(2, 2, String.class, new class537());

    @ObfuscatedName("uy.au")
    public final int field5296;

    @ObfuscatedName("uy.ax")
    public final int field5295;

    @ObfuscatedName("uy.ao")
    public final Class field5298;

    @ObfuscatedName("uy.am")
    public final class532 field5299;

    @ObfuscatedName("uy.au(B)[Luy;")
    public static class536[] method8659() {
        return new class536[] { field5294, field5300, field5293 };
    }

    public class536(int arg0, int arg1, Class arg2, class532 arg3) {
        this.field5296 = arg0;
        this.field5295 = arg1;
        this.field5298 = arg2;
        this.field5299 = arg3;
    }

    @ObfuscatedName("uy.ax(Ljava/lang/Object;Lvg;I)V")
    public static void method8652(Object arg0, class549 arg1) {
        class532 var2 = method8653(arg0.getClass());
        var2.method8641(arg0, arg1);
    }

    @ObfuscatedName("uy.ao(Ljava/lang/Class;I)Lux;")
    public static class532 method8653(Class arg0) {
        class536[] var1 = method8659();
        int var2 = 0;
        class536 var4;
        while (true) {
            if (var2 >= var1.length) {
                var4 = null;
                break;
            }
            class536 var3 = var1[var2];
            if (var3.field5298 == arg0) {
                var4 = var3;
                break;
            }
            var2++;
        }
        if (var4 == null) {
            throw new IllegalArgumentException();
        }
        return var4.field5299;
    }

    @ObfuscatedName("uy.ab(B)I")
    public int method33() {
        return this.field5295;
    }

    @ObfuscatedName("uy.am(Lvg;B)Ljava/lang/Object;")
    public Object method8662(class549 arg0) {
        return this.field5299.method8635(arg0);
    }
}
