package deob;

@ObfuscatedName("kq")
public class class310 {

    @ObfuscatedName("kq.v")
    public static final class310 field3768 = new class310(0);

    @ObfuscatedName("kq.s")
    public static final class310 field3766 = new class310(1);

    @ObfuscatedName("kq.o")
    public static final class310 field3767 = new class310(2);

    @ObfuscatedName("kq.k")
    public final int field3769;

    @ObfuscatedName("iy.v(I)[Lkq;")
    public static class310[] method4398() {
        return new class310[] { field3767, field3766, field3768 };
    }

    public class310(int arg0) {
        this.field3769 = arg0;
    }

    @ObfuscatedName("fm.s(II)Lkq;")
    public static class310 method3081(int arg0) {
        class310[] var1 = method4398();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class310 var3 = var1[var2];
            if (var3.field3769 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
