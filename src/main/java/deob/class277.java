package deob;

@ObfuscatedName("jb")
public class class277 {

    @ObfuscatedName("jb.c")
    public static final class277 field3721 = new class277(0);

    @ObfuscatedName("jb.o")
    public static final class277 field3719 = new class277(1);

    @ObfuscatedName("jb.i")
    public static final class277 field3720 = new class277(2);

    @ObfuscatedName("jb.u")
    public final int field3722;

    public class277(int arg0) {
        this.field3722 = arg0;
    }

    @ObfuscatedName("cf.c(II)Ljb;")
    public static class277 method1388(int arg0) {
        class277[] var1 = new class277[] { field3721, field3720, field3719 };
        class277[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class277 var4 = var2[var3];
            if (var4.field3722 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
