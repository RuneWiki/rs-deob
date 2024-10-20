package deob;

@ObfuscatedName("ob")
public class class373 {

    @ObfuscatedName("ob.ak")
    public static final class373 field4049 = new class373("LIVE", 0);

    @ObfuscatedName("ob.al")
    public static final class373 field4050 = new class373("BUILDLIVE", 3);

    @ObfuscatedName("ob.aj")
    public static final class373 field4051 = new class373("RC", 1);

    @ObfuscatedName("ob.az")
    public static final class373 field4052 = new class373("WIP", 2);

    @ObfuscatedName("ob.af")
    public final String field4053;

    @ObfuscatedName("ob.aa")
    public final int field4054;

    public class373(String arg0, int arg1) {
        this.field4053 = arg0;
        this.field4054 = arg1;
    }

    @ObfuscatedName("ck.ak(II)Lob;")
    public static class373 method1023(int arg0) {
        class373[] var1 = new class373[] { field4049, field4050, field4051, field4052 };
        class373[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class373 var4 = var2[var3];
            if (var4.field4054 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
