package deob;

@ObfuscatedName("ho")
public class class198 extends class444 {

    @ObfuscatedName("ho.an")
    public static class280 field2115 = new class280(64);

    @ObfuscatedName("ho.aw")
    public char field2116;

    @ObfuscatedName("ho.ac")
    public int field2121;

    @ObfuscatedName("ho.au")
    public String field2118;

    @ObfuscatedName("ho.ab")
    public boolean field2117 = true;

    @ObfuscatedName("hc.af(Lnm;I)V")
    public static void method3555(class344 arg0) {
        Statics.field2114 = arg0;
    }

    @ObfuscatedName("bz.an(II)Lho;")
    public static class198 method505(int arg0) {
        class198 var1 = (class198) field2115.method5119((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2114.method6090(11, arg0);
        class198 var3 = new class198();
        if (var2 != null) {
            var3.method3575(new class489(var2));
        }
        var3.method3584();
        field2115.method5121(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ho.aw(I)V")
    public void method3584() {
    }

    @ObfuscatedName("ho.ac(Lsg;B)V")
    public void method3575(class489 arg0) {
        while (true) {
            int var2 = arg0.method8248();
            if (var2 == 0) {
                return;
            }
            this.method3574(arg0, var2);
        }
    }

    @ObfuscatedName("ho.au(Lsg;II)V")
    public void method3574(class489 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method8249();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(var4, 16));
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class370.field4373[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field2116 = var6;
        } else if (arg1 == 2) {
            this.field2121 = arg0.method8254();
        } else if (arg1 == 4) {
            this.field2117 = false;
        } else if (arg1 == 5) {
            this.field2118 = arg0.method8259();
        }
    }

    @ObfuscatedName("ho.ab(I)Z")
    public boolean method3577() {
        return this.field2116 == 's';
    }

    @ObfuscatedName("gh.aq(I)V")
    public static void method3195() {
        field2115.method5125();
    }
}
