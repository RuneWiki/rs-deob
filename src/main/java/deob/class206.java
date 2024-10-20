package deob;

@ObfuscatedName("hh")
public class class206 extends class511 {

    @ObfuscatedName("hh.aw")
    public static class316 field2133 = new class316(64);

    @ObfuscatedName("hh.ak")
    public char field2134;

    @ObfuscatedName("hh.aj")
    public int field2135;

    @ObfuscatedName("hh.ai")
    public String field2137;

    @ObfuscatedName("hh.ay")
    public boolean field2136 = true;

    @ObfuscatedName("lo.ap(IB)Lhh;")
    public static class206 method5812(int arg0) {
        class206 var1 = (class206) field2133.method5928((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2132.method7009(11, arg0);
        class206 var3 = new class206();
        if (var2 != null) {
            var3.method3873(new class558(var2));
        }
        var3.method3880();
        field2133.method5931(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hh.aw(I)V")
    public void method3880() {
    }

    @ObfuscatedName("hh.ak(Lvl;I)V")
    public void method3873(class558 arg0) {
        while (true) {
            int var2 = arg0.method9258();
            if (var2 == 0) {
                return;
            }
            this.method3874(arg0, var2);
        }
    }

    @ObfuscatedName("hh.aj(Lvl;IB)V")
    public void method3874(class558 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method9259();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(var4, 16));
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class418.field4743[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field2134 = var6;
        } else if (arg1 == 2) {
            this.field2135 = arg0.method9264();
        } else if (arg1 == 4) {
            this.field2136 = false;
        } else if (arg1 == 5) {
            this.field2137 = arg0.method9269();
        }
    }

    @ObfuscatedName("hh.ai(I)Z")
    public boolean method3875() {
        return this.field2134 == 's';
    }

    @ObfuscatedName("db.ay(S)V")
    public static void method2501() {
        field2133.method5930();
    }
}
