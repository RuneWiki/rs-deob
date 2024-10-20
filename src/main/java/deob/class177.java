package deob;

@ObfuscatedName("gi")
public class class177 extends class504 {

    @ObfuscatedName("gi.ae")
    public static class317 field1871 = new class317(64);

    @ObfuscatedName("gi.ag")
    public int field1873 = 0;

    @ObfuscatedName("client.ac(IB)Lgi;")
    public static class177 method1718(int arg0) {
        class177 var1 = (class177) field1871.method5733((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1872.method6782(5, arg0);
        class177 var3 = new class177();
        if (var2 != null) {
            var3.method3422(new class551(var2));
        }
        field1871.method5735(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gi.ae(Lvf;I)V")
    public void method3422(class551 arg0) {
        while (true) {
            int var2 = arg0.method8955();
            if (var2 == 0) {
                return;
            }
            this.method3423(arg0, var2);
        }
    }

    @ObfuscatedName("gi.ag(Lvf;II)V")
    public void method3423(class551 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1873 = arg0.method9119();
        }
    }
}
