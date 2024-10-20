package deob;

@ObfuscatedName("ho")
public class class207 extends class504 {

    @ObfuscatedName("ho.ae")
    public static class317 field2137 = new class317(64);

    @ObfuscatedName("ho.ag")
    public class523 field2134;

    @ObfuscatedName("mm.ac(IB)Lho;")
    public static class207 method5825(int arg0) {
        class207 var1 = (class207) field2137.method5733((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2136.method6782(34, arg0);
        class207 var3 = new class207();
        if (var2 != null) {
            var3.method3730(new class551(var2));
        }
        var3.method3732();
        field2137.method5735(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ho.ae(I)V")
    public void method3732() {
    }

    @ObfuscatedName("ho.ag(Lvf;I)V")
    public void method3730(class551 arg0) {
        while (true) {
            int var2 = arg0.method8955();
            if (var2 == 0) {
                return;
            }
            this.method3733(arg0, var2);
        }
    }

    @ObfuscatedName("ho.am(Lvf;IB)V")
    public void method3733(class551 arg0, int arg1) {
        if (arg1 == 249) {
            this.field2134 = class188.method3374(arg0, this.field2134);
        }
    }

    @ObfuscatedName("ho.ax(III)I")
    public int method3734(int arg0, int arg1) {
        return class188.method414(this.field2134, arg0, arg1);
    }

    @ObfuscatedName("ho.aq(ILjava/lang/String;B)Ljava/lang/String;")
    public String method3735(int arg0, String arg1) {
        class523 var3 = this.field2134;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class505 var5 = (class505) var3.method8666((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field5118;
            }
        }
        return var4;
    }

    @ObfuscatedName("fi.af(I)V")
    public static void method3258() {
        field2137.method5736();
    }
}
