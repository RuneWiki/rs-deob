package deob;

@ObfuscatedName("ud")
public class class523 implements class392 {

    @ObfuscatedName("ud.az")
    public static final class523 field5159 = new class523(2, 0, Integer.class, new class520());

    @ObfuscatedName("ud.ah")
    public static final class523 field5161 = new class523(0, 1, Long.class, new class522());

    @ObfuscatedName("ud.af")
    public static final class523 field5156 = new class523(1, 2, String.class, new class524());

    @ObfuscatedName("ud.at")
    public final int field5157;

    @ObfuscatedName("ud.an")
    public final int field5158;

    @ObfuscatedName("ud.ao")
    public final Class field5154;

    @ObfuscatedName("ud.ab")
    public final class519 field5160;

    @ObfuscatedName("ud.at(I)[Lud;")
    public static class523[] method8332() {
        return new class523[] { field5159, field5161, field5156 };
    }

    public class523(int arg0, int arg1, Class arg2, class519 arg3) {
        this.field5157 = arg0;
        this.field5158 = arg1;
        this.field5154 = arg2;
        this.field5160 = arg3;
    }

    @ObfuscatedName("ud.an(Ljava/lang/Object;Lur;I)V")
    public static void method8319(Object arg0, class535 arg1) {
        class519 var2 = method8320(arg0.getClass());
        var2.method8303(arg0, arg1);
    }

    @ObfuscatedName("ud.ao(Ljava/lang/Class;B)Ltt;")
    public static class519 method8320(Class arg0) {
        class523[] var1 = method8332();
        int var2 = 0;
        class523 var4;
        while (true) {
            if (var2 >= var1.length) {
                var4 = null;
                break;
            }
            class523 var3 = var1[var2];
            if (var3.field5154 == arg0) {
                var4 = var3;
                break;
            }
            var2++;
        }
        if (var4 == null) {
            throw new IllegalArgumentException();
        }
        return var4.field5160;
    }

    @ObfuscatedName("ud.az(I)I")
    public int method38() {
        return this.field5158;
    }

    @ObfuscatedName("ud.ab(Lur;I)Ljava/lang/Object;")
    public Object method8321(class535 arg0) {
        return this.field5160.method8304(arg0);
    }
}
