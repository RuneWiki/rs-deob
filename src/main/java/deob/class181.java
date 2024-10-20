package deob;

@ObfuscatedName("fy")
public class class181 {

    @ObfuscatedName("fy.d")
    public static final class181 field2678 = new class181("LIVE", 0);

    @ObfuscatedName("fy.c")
    public static final class181 field2674 = new class181("BUILDLIVE", 3);

    @ObfuscatedName("fy.n")
    public static final class181 field2673 = new class181("RC", 1);

    @ObfuscatedName("fy.q")
    public static final class181 field2675 = new class181("WIP", 2);

    @ObfuscatedName("fy.t")
    public final String field2677;

    @ObfuscatedName("fy.p")
    public final int field2676;

    @ObfuscatedName("de.d(I)[Lfy;")
    public static class181[] method2159() {
        return new class181[] { field2675, field2678, field2673, field2674 };
    }

    public class181(String arg0, int arg1) {
        this.field2677 = arg0;
        this.field2676 = arg1;
    }

    @ObfuscatedName("cz.c(II)Lfy;")
    public static class181 method1629(int arg0) {
        class181[] var1 = method2159();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class181 var3 = var1[var2];
            if (var3.field2676 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
