package deob;

@ObfuscatedName("jv")
public class class238 implements class400 {

    @ObfuscatedName("jv.ak")
    public static final class238 field2524 = new class238((byte) -1, 0.0F);

    @ObfuscatedName("jv.al")
    public static final class238 field2525 = new class238((byte) 0, 0.5F);

    @ObfuscatedName("jv.aj")
    public static final class238 field2526 = new class238((byte) 1, 1.0F);

    @ObfuscatedName("jv.az")
    public static final class238 field2530 = new class238((byte) 2, 2.0F);

    @ObfuscatedName("jv.af")
    public static final class238 field2527 = new class238((byte) 3, 1.5F);

    @ObfuscatedName("jv.aa")
    public static final class238 field2532 = new class238((byte) 4, 2.5F);

    @ObfuscatedName("jv.at")
    public static final class238 field2529 = new class238((byte) 5, 3.0F);

    @ObfuscatedName("jv.ab")
    public static final class238 field2523 = new class238((byte) 6, 3.5F);

    @ObfuscatedName("jv.ac")
    public static final class238 field2531 = new class238((byte) 7, 4.0F);

    @ObfuscatedName("jv.ao")
    public final byte field2533;

    @ObfuscatedName("jv.ah")
    public final float field2528;

    @ObfuscatedName("jv.av")
    public static class238[] field2534;

    static {
        class238[] var0 = new class238[] { field2523, field2527, field2525, field2529, field2530, field2531, field2532, field2526, field2524 };
        field2534 = var0;
        StringBuilder var1 = new StringBuilder();
        class238[] var2 = field2534;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class238 var4 = var2[var3];
            var1.append(var4.field2533);
            var1.append(", ");
        }
        String var5 = var1.toString();
        var5.substring(0, var5.length() - 2);
    }

    public class238(byte arg0, float arg1) {
        this.field2533 = arg0;
        this.field2528 = arg1;
    }

    @ObfuscatedName("jv.ak(I)I")
    public int method34() {
        return this.field2533;
    }

    @ObfuscatedName("ky.az(BI)Ljv;")
    public static class238 method5083(byte arg0) {
        class238[] var1 = field2534;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class238 var3 = var1[var2];
            if (var3.field2533 == arg0) {
                return var3;
            }
        }
        throw new RuntimeException("Could not find MoveSpeed with ID " + arg0);
    }
}
