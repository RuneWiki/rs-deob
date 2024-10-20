package deob;

@ObfuscatedName("tr")
public class class518 implements class387 {

    @ObfuscatedName("tr.ac")
    public static final class518 field5068 = new class518(2, 0, Integer.class, new class515());

    @ObfuscatedName("tr.al")
    public static final class518 field5067 = new class518(1, 1, Long.class, new class517());

    @ObfuscatedName("tr.ak")
    public static final class518 field5066 = new class518(0, 2, String.class, new class519());

    @ObfuscatedName("tr.ax")
    public final int field5069;

    @ObfuscatedName("tr.ao")
    public final int field5070;

    @ObfuscatedName("tr.ah")
    public final Class field5071;

    @ObfuscatedName("tr.ar")
    public final class514 field5072;

    @ObfuscatedName("tr.ar(I)[Ltr;")
    public static class518[] method8221() {
        return new class518[] { field5066, field5068, field5067 };
    }

    public class518(int arg0, int arg1, Class arg2, class514 arg3) {
        this.field5069 = arg0;
        this.field5070 = arg1;
        this.field5071 = arg2;
        this.field5072 = arg3;
    }

    @ObfuscatedName("tr.ab(Ljava/lang/Class;B)Ltr;")
    public static class518 method8207(Class arg0) {
        class518[] var1 = method8221();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class518 var3 = var1[var2];
            if (var3.field5071 == arg0) {
                return var3;
            }
        }
        return null;
    }

    @ObfuscatedName("tr.ac(I)I")
    public int method38() {
        return this.field5070;
    }

    @ObfuscatedName("tr.am(Lul;I)Ljava/lang/Object;")
    public Object method8209(class530 arg0) {
        return this.field5072.method8194(arg0);
    }
}
