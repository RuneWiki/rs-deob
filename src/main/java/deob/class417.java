package deob;

@ObfuscatedName("px")
public class class417 {

    @ObfuscatedName("px.n")
    public static final class417 field4393 = new class417(0);

    @ObfuscatedName("px.c")
    public static final class417 field4396 = new class417(1);

    @ObfuscatedName("px.m")
    public static final class417 field4395 = new class417(2);

    @ObfuscatedName("px.k")
    public final int field4394;

    public class417(int arg0) {
        this.field4394 = arg0;
    }

    @ObfuscatedName("fv.n(II)Lpx;")
    public static class417 method2783(int arg0) {
        class417[] var1 = new class417[] { field4393, field4395, field4396 };
        class417[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class417 var4 = var2[var3];
            if (var4.field4394 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
