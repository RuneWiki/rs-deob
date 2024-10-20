package deob;

@ObfuscatedName("ue")
public class class535 implements class401 {

    @ObfuscatedName("ue.aq")
    public static final class535 field5291 = new class535(0, 0, Integer.class, new class532());

    @ObfuscatedName("ue.ad")
    public static final class535 field5285 = new class535(2, 1, Long.class, new class534());

    @ObfuscatedName("ue.ag")
    public static final class535 field5287 = new class535(1, 2, String.class, new class536());

    @ObfuscatedName("ue.ak")
    public final int field5288;

    @ObfuscatedName("ue.ap")
    public final int field5289;

    @ObfuscatedName("ue.an")
    public final Class field5292;

    @ObfuscatedName("ue.aj")
    public final class531 field5290;

    @ObfuscatedName("ue.ag(I)[Lue;")
    public static class535[] method8593() {
        return new class535[] { field5287, field5291, field5285 };
    }

    public class535(int arg0, int arg1, Class arg2, class531 arg3) {
        this.field5288 = arg0;
        this.field5289 = arg1;
        this.field5292 = arg2;
        this.field5290 = arg3;
    }

    @ObfuscatedName("ue.ak(Ljava/lang/Object;Lvp;B)V")
    public static void method8587(Object arg0, class547 arg1) {
        Class var2 = arg0.getClass();
        class535[] var3 = method8593();
        int var4 = 0;
        class535 var6;
        while (true) {
            if (var4 >= var3.length) {
                var6 = null;
                break;
            }
            class535 var5 = var3[var4];
            if (var5.field5292 == var2) {
                var6 = var5;
                break;
            }
            var4++;
        }
        if (var6 == null) {
            throw new IllegalArgumentException();
        }
        class531 var8 = var6.field5290;
        var8.method8572(arg0, arg1);
    }

    @ObfuscatedName("ue.aq(I)I")
    public int method32() {
        return this.field5289;
    }

    @ObfuscatedName("ue.ap(Lvp;B)Ljava/lang/Object;")
    public Object method8589(class547 arg0) {
        return this.field5290.method8571(arg0);
    }
}
