package deob;

@ObfuscatedName("gx")
public class class175 extends class501 {

    @ObfuscatedName("gx.ad")
    public static class313 field1858 = new class313(64);

    @ObfuscatedName("gx.ag")
    public int field1856 = 0;

    @ObfuscatedName("fz.aq(Lok;I)V")
    public static void method3040(class388 arg0) {
        Statics.field3080 = arg0;
    }

    @ObfuscatedName("kf.ad(II)Lgx;")
    public static class175 method4610(int arg0) {
        class175 var1 = (class175) field1858.method5495((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3080.method6539(5, arg0);
        class175 var3 = new class175();
        if (var2 != null) {
            var3.method3252(new class547(var2));
        }
        field1858.method5498(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gx.ag(Lvp;B)V")
    public void method3252(class547 arg0) {
        while (true) {
            int var2 = arg0.method8804();
            if (var2 == 0) {
                return;
            }
            this.method3247(arg0, var2);
        }
    }

    @ObfuscatedName("gx.ak(Lvp;IS)V")
    public void method3247(class547 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1856 = arg0.method8899();
        }
    }

    @ObfuscatedName("nd.ap(I)V")
    public static void method5912() {
        field1858.method5500();
    }
}
