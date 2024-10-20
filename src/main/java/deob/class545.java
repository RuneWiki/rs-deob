package deob;

@ObfuscatedName("ui")
public class class545 implements class405 {

    @ObfuscatedName("ui.ap")
    public static final class545 field5386 = new class545(2, 0, Integer.class, new class542());

    @ObfuscatedName("ui.aw")
    public static final class545 field5381 = new class545(0, 1, Long.class, new class544());

    @ObfuscatedName("ui.ak")
    public static final class545 field5382 = new class545(1, 2, String.class, new class546());

    @ObfuscatedName("ui.aj")
    public final int field5383;

    @ObfuscatedName("ui.ai")
    public final int field5384;

    @ObfuscatedName("ui.ay")
    public final Class field5387;

    @ObfuscatedName("ui.as")
    public final class541 field5385;

    @ObfuscatedName("ui.ap(B)[Lui;")
    public static class545[] method9116() {
        return new class545[] { field5382, field5386, field5381 };
    }

    public class545(int arg0, int arg1, Class arg2, class541 arg3) {
        this.field5383 = arg0;
        this.field5384 = arg1;
        this.field5387 = arg2;
        this.field5385 = arg3;
    }

    @ObfuscatedName("ui.ak(Ljava/lang/Class;I)Lui;")
    public static class545 method9106(Class arg0) {
        class545[] var1 = method9116();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class545 var3 = var1[var2];
            if (var3.field5387 == arg0) {
                return var3;
            }
        }
        return null;
    }

    @ObfuscatedName("ui.aj(Ljava/lang/Object;Lvl;I)V")
    public static void method9109(Object arg0, class558 arg1) {
        class541 var2 = method9110(arg0.getClass());
        var2.method9091(arg0, arg1);
    }

    @ObfuscatedName("ui.ai(Ljava/lang/Class;I)Luo;")
    public static class541 method9110(Class arg0) {
        class545 var1 = method9106(arg0);
        if (var1 == null) {
            throw new IllegalArgumentException();
        }
        return var1.field5385;
    }

    @ObfuscatedName("ui.aw(I)I")
    public int method37() {
        return this.field5384;
    }

    @ObfuscatedName("ui.ay(Lvl;B)Ljava/lang/Object;")
    public Object method9112(class558 arg0) {
        return this.field5385.method9095(arg0);
    }
}
