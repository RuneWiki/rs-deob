package deob;

@ObfuscatedName("hp")
public class class199 extends class439 {

    @ObfuscatedName("hp.al")
    public static class276 field2088 = new class276(64);

    @ObfuscatedName("hp.ac")
    public char field2084;

    @ObfuscatedName("hp.ab")
    public int field2083;

    @ObfuscatedName("hp.an")
    public String field2087;

    @ObfuscatedName("hp.ao")
    public boolean field2085 = true;

    @ObfuscatedName("fd.aj(IB)Lhp;")
    public static class199 method3048(int arg0) {
        class199 var1 = (class199) field2088.method4921((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4345.method5860(11, arg0);
        class199 var3 = new class199();
        if (var2 != null) {
            var3.method3452(new class478(var2));
        }
        var3.method3451();
        field2088.method4923(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hp.al(I)V")
    public void method3451() {
    }

    @ObfuscatedName("hp.ac(Lsy;I)V")
    public void method3452(class478 arg0) {
        while (true) {
            int var2 = arg0.method7909();
            if (var2 == 0) {
                return;
            }
            this.method3458(arg0, var2);
        }
    }

    @ObfuscatedName("hp.ab(Lsy;IB)V")
    public void method3458(class478 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2084 = Statics.method4629(arg0.method8163());
        } else if (arg1 == 2) {
            this.field2083 = arg0.method7908();
        } else if (arg1 == 4) {
            this.field2085 = false;
        } else if (arg1 == 5) {
            this.field2087 = arg0.method7950();
        }
    }

    @ObfuscatedName("hp.an(B)Z")
    public boolean method3465() {
        return this.field2084 == 's';
    }

    @ObfuscatedName("eo.ao(I)V")
    public static void method2700() {
        field2088.method4930();
    }
}
