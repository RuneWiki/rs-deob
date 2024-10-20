package deob;

@ObfuscatedName("fb")
public class class178 {

    @ObfuscatedName("fb.n")
    public static final class178 field2004 = new class178(2, 0, 4);

    @ObfuscatedName("fb.c")
    public static final class178 field2003 = new class178(1, 1, 2);

    @ObfuscatedName("fb.m")
    public static final class178 field2005 = new class178(0, 2, 0);

    @ObfuscatedName("fb.k")
    public final int field2006;

    @ObfuscatedName("fb.o")
    public final int field2011;

    @ObfuscatedName("fb.g")
    public final int field2008;

    public class178(int arg0, int arg1, int arg2) {
        this.field2006 = arg0;
        this.field2011 = arg1;
        this.field2008 = arg2;
    }

    @ObfuscatedName("fb.n(FS)Z")
    public boolean method3133(float arg0) {
        return arg0 >= (float) this.field2008;
    }

    @ObfuscatedName("fb.c(IB)Lfb;")
    public static class178 method3134(int arg0) {
        class178[] var1 = new class178[] { field2005, field2004, field2003 };
        class178[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class178 var4 = var2[var3];
            if (var4.field2011 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
