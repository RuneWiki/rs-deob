package deob;

@ObfuscatedName("tb")
public class class503 implements class372 {

    @ObfuscatedName("tb.au")
    public static final class503 field5036 = new class503(1, 0, Integer.class, new class500());

    @ObfuscatedName("tb.ae")
    public static final class503 field5038 = new class503(0, 1, Long.class, new class502());

    @ObfuscatedName("tb.ao")
    public static final class503 field5031 = new class503(2, 2, String.class, new class504());

    @ObfuscatedName("tb.at")
    public final int field5032;

    @ObfuscatedName("tb.ac")
    public final int field5033;

    @ObfuscatedName("tb.ai")
    public final Class field5034;

    @ObfuscatedName("tb.az")
    public final class499 field5035;

    @ObfuscatedName("tb.au(B)[Ltb;")
    public static class503[] method8172() {
        return new class503[] { field5036, field5031, field5038 };
    }

    public class503(int arg0, int arg1, Class arg2, class499 arg3) {
        this.field5032 = arg0;
        this.field5033 = arg1;
        this.field5034 = arg2;
        this.field5035 = arg3;
    }

    @ObfuscatedName("tb.ao(Ljava/lang/Class;B)Ltb;")
    public static class503 method8168(Class arg0) {
        class503[] var1 = method8172();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class503 var3 = var1[var2];
            if (var3.field5034 == arg0) {
                return var3;
            }
        }
        return null;
    }

    @ObfuscatedName("tb.ae(B)I")
    public int method30() {
        return this.field5033;
    }

    @ObfuscatedName("tb.at(Ltm;S)Ljava/lang/Object;")
    public Object method8169(class515 arg0) {
        return this.field5035.method8149(arg0);
    }
}
