package deob;

@ObfuscatedName("sw")
public class class491 implements class370 {

    @ObfuscatedName("sw.at")
    public static final class491 field4974 = new class491(1, 0, Integer.class, new class488());

    @ObfuscatedName("sw.an")
    public static final class491 field4973 = new class491(2, 1, Long.class, new class490());

    @ObfuscatedName("sw.av")
    public static final class491 field4977 = new class491(0, 2, String.class, new class492());

    @ObfuscatedName("sw.as")
    public final int field4978;

    @ObfuscatedName("sw.ax")
    public final int field4976;

    @ObfuscatedName("sw.ap")
    public final Class field4975;

    @ObfuscatedName("sw.ab")
    public final class487 field4972;

    @ObfuscatedName("sw.ab(I)[Lsw;")
    public static class491[] method7989() {
        return new class491[] { field4977, field4974, field4973 };
    }

    public class491(int arg0, int arg1, Class arg2, class487 arg3) {
        this.field4978 = arg0;
        this.field4976 = arg1;
        this.field4975 = arg2;
        this.field4972 = arg3;
    }

    @ObfuscatedName("sw.ak(Ljava/lang/Class;I)Lso;")
    public static class487 method7987(Class arg0) {
        class491[] var1 = method7989();
        int var2 = 0;
        class491 var4;
        while (true) {
            if (var2 >= var1.length) {
                var4 = null;
                break;
            }
            class491 var3 = var1[var2];
            if (var3.field4975 == arg0) {
                var4 = var3;
                break;
            }
            var2++;
        }
        if (var4 == null) {
            throw new IllegalArgumentException();
        }
        return var4.field4972;
    }

    @ObfuscatedName("sw.at(B)I")
    public int method33() {
        return this.field4976;
    }

    @ObfuscatedName("sw.ae(Ltz;B)Ljava/lang/Object;")
    public Object method7988(class501 arg0) {
        return this.field4972.method7972(arg0);
    }
}
