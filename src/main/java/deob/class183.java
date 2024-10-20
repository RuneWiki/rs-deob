package deob;

@ObfuscatedName("hr")
public class class183 extends class501 {

    @ObfuscatedName("hr.ad")
    public static class313 field1916 = new class313(64);

    @ObfuscatedName("hr.ag")
    public boolean field1915 = false;

    @ObfuscatedName("hr.aq(Lvp;I)V")
    public void method3313(class547 arg0) {
        while (true) {
            int var2 = arg0.method8804();
            if (var2 == 0) {
                return;
            }
            this.method3314(arg0, var2);
        }
    }

    @ObfuscatedName("hr.ad(Lvp;IB)V")
    public void method3314(class547 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1915 = true;
        }
    }

    @ObfuscatedName("ao.ag(B)V")
    public static void method275() {
        field1916.method5500();
    }
}
