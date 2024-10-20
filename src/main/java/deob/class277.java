package deob;

@ObfuscatedName("js")
public class class277 {

    @ObfuscatedName("js.p")
    public static final class277 field3734 = new class277(0);

    @ObfuscatedName("js.m")
    public static final class277 field3735 = new class277(1);

    @ObfuscatedName("js.e")
    public static final class277 field3733 = new class277(2);

    @ObfuscatedName("js.t")
    public final int field3736;

    @ObfuscatedName("v.p(I)[Ljs;")
    public static class277[] method100() {
        return new class277[] { field3735, field3733, field3734 };
    }

    public class277(int arg0) {
        this.field3736 = arg0;
    }

    @ObfuscatedName("bh.m(II)Ljs;")
    public static class277 method1026(int arg0) {
        class277[] var1 = method100();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class277 var3 = var1[var2];
            if (var3.field3736 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
