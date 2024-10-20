package deob;

@ObfuscatedName("ko")
public class class275 implements class402 {

    @ObfuscatedName("ko.ab")
    public static final class275 field2983 = new class275((byte) -1, 0.0F);

    @ObfuscatedName("ko.ay")
    public static final class275 field2988 = new class275((byte) 0, 0.5F);

    @ObfuscatedName("ko.an")
    public static final class275 field2984 = new class275((byte) 1, 1.0F);

    @ObfuscatedName("ko.au")
    public static final class275 field2985 = new class275((byte) 2, 2.0F);

    @ObfuscatedName("ko.ax")
    public static final class275 field2986 = new class275((byte) 3, 1.5F);

    @ObfuscatedName("ko.ao")
    public static final class275 field2987 = new class275((byte) 4, 2.5F);

    @ObfuscatedName("ko.am")
    public static final class275 field2992 = new class275((byte) 5, 3.0F);

    @ObfuscatedName("ko.ac")
    public static final class275 field2982 = new class275((byte) 6, 3.5F);

    @ObfuscatedName("ko.ae")
    public static final class275 field2989 = new class275((byte) 7, 4.0F);

    @ObfuscatedName("ko.ad")
    public final byte field2991;

    @ObfuscatedName("ko.aq")
    public final float field2990;

    @ObfuscatedName("ko.al")
    public static class275[] field2993;

    static {
        class275[] var0 = new class275[] { field2987, field2989, field2992, field2983, field2984, field2988, field2985, field2986, field2982 };
        field2993 = var0;
        StringBuilder var1 = new StringBuilder();
        class275[] var2 = field2993;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class275 var4 = var2[var3];
            var1.append(var4.field2991);
            var1.append(", ");
        }
        String var5 = var1.toString();
        var5.substring(0, var5.length() - 2);
    }

    public class275(byte arg0, float arg1) {
        this.field2991 = arg0;
        this.field2990 = arg1;
    }

    @ObfuscatedName("ko.ab(B)I")
    public int method33() {
        return this.field2991;
    }
}
