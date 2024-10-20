package deob;

@ObfuscatedName("ay")
public class class27 {

    @ObfuscatedName("ay.n")
    public static final class27 field153 = new class27(0, 0, 4);

    @ObfuscatedName("ay.v")
    public static final class27 field151 = new class27(2, 1, 2);

    @ObfuscatedName("ay.d")
    public static final class27 field152 = new class27(1, 2, 0);

    @ObfuscatedName("ay.c")
    public final int field150;

    @ObfuscatedName("ay.y")
    public final int field154;

    @ObfuscatedName("ay.h")
    public final int field155;

    @ObfuscatedName("ay.n(I)[Lay;")
    public static class27[] method246() {
        return new class27[] { field152, field151, field153 };
    }

    public class27(int arg0, int arg1, int arg2) {
        this.field150 = arg0;
        this.field154 = arg1;
        this.field155 = arg2;
    }

    @ObfuscatedName("ay.v(FB)Z")
    public boolean method232(float arg0) {
        return arg0 >= (float) this.field155;
    }

    @ObfuscatedName("ay.d(IB)Lay;")
    public static class27 method243(int arg0) {
        class27[] var1 = method246();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class27 var3 = var1[var2];
            if (var3.field154 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
