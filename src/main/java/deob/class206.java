package deob;

@ObfuscatedName("hx")
public class class206 extends class504 {

    @ObfuscatedName("hx.ae")
    public static class317 field2126 = new class317(64);

    @ObfuscatedName("hx.ag")
    public char field2127;

    @ObfuscatedName("hx.am")
    public int field2128;

    @ObfuscatedName("hx.ax")
    public String field2129;

    @ObfuscatedName("hx.aq")
    public boolean field2125 = true;

    @ObfuscatedName("ly.ac(Lpo;I)V")
    public static void method5633(class391 arg0) {
        Statics.field2130 = arg0;
    }

    @ObfuscatedName("qz.ae(II)Lhx;")
    public static class206 method7467(int arg0) {
        class206 var1 = (class206) field2126.method5733((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2130.method6782(11, arg0);
        class206 var3 = new class206();
        if (var2 != null) {
            var3.method3712(new class551(var2));
        }
        var3.method3710();
        field2126.method5735(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hx.ag(I)V")
    public void method3710() {
    }

    @ObfuscatedName("hx.am(Lvf;I)V")
    public void method3712(class551 arg0) {
        while (true) {
            int var2 = arg0.method8955();
            if (var2 == 0) {
                return;
            }
            this.method3717(arg0, var2);
        }
    }

    @ObfuscatedName("hx.ax(Lvf;II)V")
    public void method3717(class551 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method8975();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(var4, 16));
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class417.field4694[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field2127 = var6;
        } else if (arg1 == 2) {
            this.field2128 = arg0.method9110();
        } else if (arg1 == 4) {
            this.field2125 = false;
        } else if (arg1 == 5) {
            this.field2129 = arg0.method9166();
        }
    }

    @ObfuscatedName("hx.aq(B)Z")
    public boolean method3714() {
        return this.field2127 == 's';
    }

    @ObfuscatedName("gg.af(I)V")
    public static void method3447() {
        field2126.method5736();
    }
}
