package deob;

@ObfuscatedName("jb")
public class class239 implements class401 {

    @ObfuscatedName("jb.aq")
    public static final class239 field2513 = new class239((byte) -1, 0.0F);

    @ObfuscatedName("jb.ad")
    public static final class239 field2521 = new class239((byte) 0, 0.5F);

    @ObfuscatedName("jb.ag")
    public static final class239 field2520 = new class239((byte) 1, 1.0F);

    @ObfuscatedName("jb.ak")
    public static final class239 field2510 = new class239((byte) 2, 2.0F);

    @ObfuscatedName("jb.ap")
    public static final class239 field2511 = new class239((byte) 3, 1.5F);

    @ObfuscatedName("jb.an")
    public static final class239 field2512 = new class239((byte) 4, 2.5F);

    @ObfuscatedName("jb.aj")
    public static final class239 field2517 = new class239((byte) 5, 3.0F);

    @ObfuscatedName("jb.av")
    public static final class239 field2514 = new class239((byte) 6, 3.5F);

    @ObfuscatedName("jb.ab")
    public static final class239 field2508 = new class239((byte) 7, 4.0F);

    @ObfuscatedName("jb.ai")
    public final byte field2516;

    @ObfuscatedName("jb.ae")
    public final float field2518;

    @ObfuscatedName("jb.au")
    public static class239[] field2509 = method3459();

    static {
        method9303();
    }

    @ObfuscatedName("hv.ag(B)[Ljb;")
    public static class239[] method3459() {
        return new class239[] { field2512, field2521, field2514, field2520, field2510, field2508, field2513, field2517, field2511 };
    }

    public class239(byte arg0, float arg1) {
        this.field2516 = arg0;
        this.field2518 = arg1;
    }

    @ObfuscatedName("jb.aq(I)I")
    public int method32() {
        return this.field2516;
    }

    @ObfuscatedName("is.ak(BI)Ljb;")
    public static class239 method3865(byte arg0) {
        class239[] var1 = field2509;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class239 var3 = var1[var2];
            if (var3.field2516 == arg0) {
                return var3;
            }
        }
        throw new RuntimeException("Could not find MoveSpeed with ID " + arg0);
    }

    @ObfuscatedName("va.ap(I)Ljava/lang/String;")
    public static String method9303() {
        StringBuilder var0 = new StringBuilder();
        class239[] var1 = field2509;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class239 var3 = var1[var2];
            var0.append(var3.field2516);
            var0.append(", ");
        }
        String var4 = var0.toString();
        return var4.substring(0, var4.length() - 2);
    }
}
