package deob;

@ObfuscatedName("hm")
public class class188 extends class484 {

    @ObfuscatedName("hm.al")
    public static class302 field1903 = new class302(64);

    @ObfuscatedName("hm.ak")
    public int field1904 = 0;

    @ObfuscatedName("gb.al(IB)Lhm;")
    public static class188 method3116(int arg0) {
        class188 var1 = (class188) field1903.method5286((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1908.method6342(5, arg0);
        class188 var3 = new class188();
        if (var2 != null) {
            var3.method3301(new class530(var2));
        }
        field1903.method5289(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hm.ak(Lul;I)V")
    public void method3301(class530 arg0) {
        while (true) {
            int var2 = arg0.method8365();
            if (var2 == 0) {
                return;
            }
            this.method3300(arg0, var2);
        }
    }

    @ObfuscatedName("hm.ax(Lul;II)V")
    public void method3300(class530 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1904 = arg0.method8598();
        }
    }

    @ObfuscatedName("hy.ao(I)V")
    public static void method3292() {
        field1903.method5288();
    }
}
