package deob;

@ObfuscatedName("jm")
public class class279 extends class219 {

    @ObfuscatedName("jm.z")
    public static class213 field3542 = new class213(64);

    @ObfuscatedName("jm.n")
    public char field3545;

    @ObfuscatedName("jm.r")
    public int field3543;

    @ObfuscatedName("jm.e")
    public String field3544;

    @ObfuscatedName("jm.y")
    public boolean field3546 = true;

    @ObfuscatedName("ff.d(II)Ljm;")
    public static class279 method3077(int arg0) {
        class279 var1 = (class279) field3542.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3548.method4273(11, arg0);
        class279 var3 = new class279();
        if (var2 != null) {
            var3.method4627(new class195(var2));
        }
        var3.method4624();
        field3542.method3697(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jm.z(I)V")
    public void method4624() {
    }

    @ObfuscatedName("jm.n(Lgy;B)V")
    public void method4627(class195 arg0) {
        while (true) {
            int var2 = arg0.method3330();
            if (var2 == 0) {
                return;
            }
            this.method4626(arg0, var2);
        }
    }

    @ObfuscatedName("jm.r(Lgy;IB)V")
    public void method4626(class195 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method3421();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("");
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class315.field3909[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3545 = var6;
        } else if (arg1 == 2) {
            this.field3543 = arg0.method3264();
        } else if (arg1 == 4) {
            this.field3546 = false;
        } else if (arg1 == 5) {
            this.field3544 = arg0.method3268();
        }
    }

    @ObfuscatedName("jm.e(I)Z")
    public boolean method4635() {
        return this.field3545 == 's';
    }
}
