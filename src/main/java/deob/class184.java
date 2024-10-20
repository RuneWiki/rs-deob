package deob;

@ObfuscatedName("hc")
public class class184 extends class439 {

    @ObfuscatedName("hc.ac")
    public static class276 field1897 = new class276(64);

    @ObfuscatedName("hc.ab")
    public int field1894 = 0;

    @ObfuscatedName("je.aj(Lne;I)V")
    public static void method4730(class340 arg0) {
        Statics.field1893 = arg0;
        Statics.field1891 = Statics.field1893.method5934(16);
    }

    @ObfuscatedName("br.al(II)Lhc;")
    public static class184 method620(int arg0) {
        class184 var1 = (class184) field1897.method4921((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1893.method5860(16, arg0);
        class184 var3 = new class184();
        if (var2 != null) {
            var3.method3238(new class478(var2));
        }
        field1897.method4923(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hc.ac(Lsy;I)V")
    public void method3238(class478 arg0) {
        while (true) {
            int var2 = arg0.method7909();
            if (var2 == 0) {
                return;
            }
            this.method3243(arg0, var2);
        }
    }

    @ObfuscatedName("hc.ab(Lsy;IS)V")
    public void method3243(class478 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1894 = arg0.method7905();
        }
    }
}
