package deob;

@ObfuscatedName("rw")
public class class482 {

    @ObfuscatedName("rw.a")
    public static final class482 field5003 = new class482(0);

    @ObfuscatedName("rw.f")
    public static final class482 field5001 = new class482(1);

    @ObfuscatedName("rw.c")
    public static final class482 field5002 = new class482(2);

    @ObfuscatedName("rw.x")
    public final int field5000;

    public class482(int arg0) {
        this.field5000 = arg0;
    }

    @ObfuscatedName("my.a(II)Lrw;")
    public static class482 method6258(int arg0) {
        class482[] var1 = new class482[] { field5003, field5001, field5002 };
        class482[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class482 var4 = var2[var3];
            if (var4.field5000 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
