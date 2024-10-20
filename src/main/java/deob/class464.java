package deob;

@ObfuscatedName("qn")
public class class464 implements class350 {

    @ObfuscatedName("qn.f")
    public static final class464 field4898 = new class464(2, 0, Integer.class, new class461());

    @ObfuscatedName("qn.w")
    public static final class464 field4899 = new class464(0, 1, Long.class, new class463());

    @ObfuscatedName("qn.v")
    public static final class464 field4904 = new class464(1, 2, String.class, new class465());

    @ObfuscatedName("qn.s")
    public final int field4900;

    @ObfuscatedName("qn.z")
    public final int field4897;

    @ObfuscatedName("qn.j")
    public final Class field4902;

    @ObfuscatedName("qn.i")
    public final class460 field4901;

    @ObfuscatedName("qn.v(S)[Lqn;")
    public static class464[] method7831() {
        return new class464[] { field4904, field4898, field4899 };
    }

    public class464(int arg0, int arg1, Class arg2, class460 arg3) {
        this.field4900 = arg0;
        this.field4897 = arg1;
        this.field4902 = arg2;
        this.field4901 = arg3;
    }

    @ObfuscatedName("qn.s(Ljava/lang/Class;B)Lqn;")
    public static class464 method7837(Class arg0) {
        class464[] var1 = method7831();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class464 var3 = var1[var2];
            if (var3.field4902 == arg0) {
                return var3;
            }
        }
        return null;
    }

    @ObfuscatedName("qn.f(B)I")
    public int method46() {
        return this.field4897;
    }

    @ObfuscatedName("qn.z(Lrd;I)Ljava/lang/Object;")
    public Object method7833(class474 arg0) {
        return this.field4901.method7815(arg0);
    }
}
