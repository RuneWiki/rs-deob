package deob;

@ObfuscatedName("wl")
public class class578 {

    @ObfuscatedName("wl.ap")
    public static final class578 field5621 = new class578(0);

    @ObfuscatedName("wl.aw")
    public static final class578 field5620 = new class578(1);

    @ObfuscatedName("wl.ak")
    public static final class578 field5622 = new class578(2);

    @ObfuscatedName("wl.aj")
    public final int field5619;

    public class578(int arg0) {
        this.field5619 = arg0;
    }

    @ObfuscatedName("vi.ap(II)Lwl;")
    public static class578 method9186(int arg0) {
        class578[] var1 = new class578[] { field5621, field5622, field5620 };
        class578[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class578 var4 = var2[var3];
            if (var4.field5619 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
