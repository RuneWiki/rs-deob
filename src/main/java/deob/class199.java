package deob;

@ObfuscatedName("hc")
public class class199 extends class485 {

    @ObfuscatedName("hc.ap")
    public static class302 field2059 = new class302(64);

    @ObfuscatedName("hc.af")
    public char field2061;

    @ObfuscatedName("hc.aj")
    public int field2063;

    @ObfuscatedName("hc.aq")
    public String field2064;

    @ObfuscatedName("hc.ar")
    public boolean field2060 = true;

    @ObfuscatedName("lz.am(Low;I)V")
    public static void method5417(class375 arg0) {
        Statics.field2062 = arg0;
    }

    @ObfuscatedName("ag.ap(II)Lhc;")
    public static class199 method37(int arg0) {
        class199 var1 = (class199) field2059.method5400((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2062.method6396(11, arg0);
        class199 var3 = new class199();
        if (var2 != null) {
            var3.method3543(new class531(var2));
        }
        var3.method3534();
        field2059.method5402(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hc.af(I)V")
    public void method3534() {
    }

    @ObfuscatedName("hc.aj(Luk;I)V")
    public void method3543(class531 arg0) {
        while (true) {
            int var2 = arg0.method8561();
            if (var2 == 0) {
                return;
            }
            this.method3545(arg0, var2);
        }
    }

    @ObfuscatedName("hc.aq(Luk;II)V")
    public void method3545(class531 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method8562();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(var4, 16));
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class401.field4492[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field2061 = var6;
        } else if (arg1 == 2) {
            this.field2063 = arg0.method8566();
        } else if (arg1 == 4) {
            this.field2060 = false;
        } else if (arg1 == 5) {
            this.field2064 = arg0.method8641();
        }
    }

    @ObfuscatedName("hc.ar(I)Z")
    public boolean method3537() {
        return this.field2061 == 's';
    }
}
