package deob;

@ObfuscatedName("t")
public class class4 implements class204 {

    @ObfuscatedName("t.z")
    public static final class4 field24 = new class4(0, 0, Integer.class, new class2());

    @ObfuscatedName("t.k")
    public static final class4 field14 = new class4(1, 1, Long.class, new class3());

    @ObfuscatedName("t.s")
    public static final class4 field25 = new class4(2, 2, String.class, new class5());

    @ObfuscatedName("t.t")
    public final int field16;

    @ObfuscatedName("t.i")
    public final int field17;

    @ObfuscatedName("t.o")
    public final Class field18;

    @ObfuscatedName("t.x")
    public final class1 field19;

    public class4(int arg0, int arg1, Class arg2, class1 arg3) {
        this.field16 = arg0;
        this.field17 = arg1;
        this.field18 = arg2;
        this.field19 = arg3;
    }

    @ObfuscatedName("t.k(Ljava/lang/Object;Lkf;B)V")
    public static void method26(Object arg0, class310 arg1) {
        Class var2 = arg0.getClass();
        class4[] var3 = Statics.method30();
        int var4 = 0;
        class4 var6;
        while (true) {
            if (var4 >= var3.length) {
                var6 = null;
                break;
            }
            class4 var5 = var3[var4];
            if (var5.field18 == var2) {
                var6 = var5;
                break;
            }
            var4++;
        }
        if (var6 == null) {
            throw new IllegalArgumentException();
        }
        class1 var8 = var6.field19;
        var8.method7(arg0, arg1);
    }

    @ObfuscatedName("t.s(I)I")
    public int method28() {
        return this.field17;
    }

    @ObfuscatedName("t.t(Lkf;I)Ljava/lang/Object;")
    public Object method29(class310 arg0) {
        return this.field19.method3(arg0);
    }
}
