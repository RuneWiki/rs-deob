package deob;

@ObfuscatedName("kl")
public class class311 {

    @ObfuscatedName("kl.q")
    public static final class311 field3819 = new class311(0);

    @ObfuscatedName("kl.w")
    public static final class311 field3817 = new class311(1);

    @ObfuscatedName("kl.e")
    public static final class311 field3818 = new class311(2);

    @ObfuscatedName("kl.p")
    public final int field3816;

    @ObfuscatedName("eh.q(I)[Lkl;")
    public static class311[] method3094() {
        return new class311[] { field3818, field3817, field3819 };
    }

    public class311(int arg0) {
        this.field3816 = arg0;
    }

    @ObfuscatedName("fp.w(II)Lkl;")
    public static class311 method3212(int arg0) {
        class311[] var1 = method3094();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class311 var3 = var1[var2];
            if (var3.field3816 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
