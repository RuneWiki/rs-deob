package deob;

@ObfuscatedName("u")
public class class4 implements class195 {

    @ObfuscatedName("u.z")
    public static final class4 field8 = new class4(1, 0, Integer.class, new class2());

    @ObfuscatedName("u.n")
    public static final class4 field16 = new class4(0, 1, Long.class, new class3());

    @ObfuscatedName("u.v")
    public static final class4 field9 = new class4(2, 2, String.class, new class5());

    @ObfuscatedName("u.u")
    public final int field13;

    @ObfuscatedName("u.r")
    public final int field10;

    @ObfuscatedName("u.p")
    public final Class field12;

    @ObfuscatedName("u.q")
    public final class1 field14;

    @ObfuscatedName("u.z(I)[Lu;")
    public static class4[] method32() {
        return new class4[] { field9, field16, field8 };
    }

    public class4(int arg0, int arg1, Class arg2, class1 arg3) {
        this.field13 = arg0;
        this.field10 = arg1;
        this.field12 = arg2;
        this.field14 = arg3;
    }

    @ObfuscatedName("u.n(Ljava/lang/Class;B)Lu;")
    public static class4 method24(Class arg0) {
        class4[] var1 = method32();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class4 var3 = var1[var2];
            if (var3.field12 == arg0) {
                return var3;
            }
        }
        return null;
    }

    @ObfuscatedName("u.v(S)I")
    public int method25() {
        return this.field10;
    }

    @ObfuscatedName("u.u(Lkl;I)Ljava/lang/Object;")
    public Object method26(class300 arg0) {
        return this.field14.method2(arg0);
    }
}
