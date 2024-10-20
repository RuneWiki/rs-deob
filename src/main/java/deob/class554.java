package deob;

@ObfuscatedName("vc")
public class class554 {

    @ObfuscatedName("vc.az")
    public static final class554 field5372 = new class554(0);

    @ObfuscatedName("vc.ah")
    public static final class554 field5373 = new class554(1);

    @ObfuscatedName("vc.af")
    public static final class554 field5374 = new class554(2);

    @ObfuscatedName("vc.at")
    public final int field5375;

    @ObfuscatedName("fe.az(I)[Lvc;")
    public static class554[] method2927() {
        return new class554[] { field5373, field5372, field5374 };
    }

    public class554(int arg0) {
        this.field5375 = arg0;
    }

    @ObfuscatedName("vi.ah(II)Lvc;")
    public static class554 method9040(int arg0) {
        class554[] var1 = method2927();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class554 var3 = var1[var2];
            if (var3.field5375 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
