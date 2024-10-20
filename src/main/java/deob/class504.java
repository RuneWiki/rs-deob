package deob;

@ObfuscatedName("tm")
public class class504 implements class373 {

    @ObfuscatedName("tm.aw")
    public static final class504 field5031 = new class504(0, 0, Integer.class, new class501());

    @ObfuscatedName("tm.ay")
    public static final class504 field5028 = new class504(1, 1, Long.class, new class503());

    @ObfuscatedName("tm.ar")
    public static final class504 field5029 = new class504(2, 2, String.class, new class505());

    @ObfuscatedName("tm.am")
    public final int field5032;

    @ObfuscatedName("tm.as")
    public final int field5030;

    @ObfuscatedName("tm.aj")
    public final Class field5027;

    @ObfuscatedName("tm.ag")
    public final class500 field5033;

    @ObfuscatedName("tm.aw(B)[Ltm;")
    public static class504[] method8111() {
        return new class504[] { field5028, field5031, field5029 };
    }

    public class504(int arg0, int arg1, Class arg2, class500 arg3) {
        this.field5032 = arg0;
        this.field5030 = arg1;
        this.field5027 = arg2;
        this.field5033 = arg3;
    }

    @ObfuscatedName("tm.ar(Ljava/lang/Class;I)Ltm;")
    public static class504 method8106(Class arg0) {
        class504[] var1 = method8111();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class504 var3 = var1[var2];
            if (var3.field5027 == arg0) {
                return var3;
            }
        }
        return null;
    }

    @ObfuscatedName("tm.am(Ljava/lang/Object;Lty;I)V")
    public static void method8112(Object arg0, class514 arg1) {
        Class var2 = arg0.getClass();
        class504 var3 = method8106(var2);
        if (var3 == null) {
            throw new IllegalArgumentException();
        }
        class500 var4 = var3.field5033;
        var4.method8085(arg0, arg1);
    }

    @ObfuscatedName("tm.ay(I)I")
    public int method36() {
        return this.field5030;
    }

    @ObfuscatedName("tm.av(Lty;B)Ljava/lang/Object;")
    public Object method8108(class514 arg0) {
        return this.field5033.method8084(arg0);
    }
}
