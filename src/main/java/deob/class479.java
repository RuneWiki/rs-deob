package deob;

@ObfuscatedName("sh")
public class class479 implements class357 {

    @ObfuscatedName("sh.af")
    public static final class479 field4949 = new class479(1, 0, Integer.class, new class476());

    @ObfuscatedName("sh.an")
    public static final class479 field4948 = new class479(0, 1, Long.class, new class478());

    @ObfuscatedName("sh.aw")
    public static final class479 field4947 = new class479(2, 2, String.class, new class480());

    @ObfuscatedName("sh.ac")
    public final int field4950;

    @ObfuscatedName("sh.au")
    public final int field4951;

    @ObfuscatedName("sh.ab")
    public final Class field4952;

    @ObfuscatedName("sh.aq")
    public final class475 field4953;

    @ObfuscatedName("sh.au(I)[Lsh;")
    public static class479[] method8097() {
        return new class479[] { field4949, field4948, field4947 };
    }

    public class479(int arg0, int arg1, Class arg2, class475 arg3) {
        this.field4950 = arg0;
        this.field4951 = arg1;
        this.field4952 = arg2;
        this.field4953 = arg3;
    }

    @ObfuscatedName("sh.ab(Ljava/lang/Class;S)Lsh;")
    public static class479 method8096(Class arg0) {
        class479[] var1 = method8097();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class479 var3 = var1[var2];
            if (var3.field4952 == arg0) {
                return var3;
            }
        }
        return null;
    }

    @ObfuscatedName("sh.aq(Ljava/lang/Object;Lsg;I)V")
    public static void method8110(Object arg0, class489 arg1) {
        class475 var2 = method8098(arg0.getClass());
        var2.method8072(arg0, arg1);
    }

    @ObfuscatedName("sh.al(Ljava/lang/Class;I)Lss;")
    public static class475 method8098(Class arg0) {
        class479 var1 = method8096(arg0);
        if (var1 == null) {
            throw new IllegalArgumentException();
        }
        return var1.field4953;
    }

    @ObfuscatedName("sh.af(I)I")
    public int method39() {
        return this.field4951;
    }

    @ObfuscatedName("sh.at(Lsg;I)Ljava/lang/Object;")
    public Object method8100(class489 arg0) {
        return this.field4953.method8074(arg0);
    }
}
