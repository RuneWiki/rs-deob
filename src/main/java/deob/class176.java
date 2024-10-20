package deob;

@ObfuscatedName("fv")
public class class176 {

    @ObfuscatedName("fv.z")
    public static int[] field2889 = new int[32];

    @ObfuscatedName("fv.q")
    public static int[] field2890;

    @ObfuscatedName("fv.k")
    public static int[] field2892;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2889[var1] = var0 - 1;
            var0 += var0;
        }
        field2890 = new int[2000];
        field2892 = new int[2000];
    }

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ap.z(II)I")
    public static int method951(int arg0) {
        class48 var1 = class48.method533(arg0);
        int var2 = var1.field1056;
        int var3 = var1.field1058;
        int var4 = var1.field1062;
        int var5 = field2889[var4 - var3];
        return field2892[var2] >> var3 & var5;
    }
}
