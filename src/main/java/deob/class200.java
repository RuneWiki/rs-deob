package deob;

@ObfuscatedName("hp")
public class class200 extends class488 {

    @ObfuscatedName("hp.aw")
    public static class304 field2076 = new class304(64);

    @ObfuscatedName("hp.al")
    public char field2077;

    @ObfuscatedName("hp.ai")
    public int field2078;

    @ObfuscatedName("hp.ar")
    public String field2075;

    @ObfuscatedName("hp.as")
    public boolean field2080 = true;

    @ObfuscatedName("bv.aq(Lof;I)V")
    public static void method655(class378 arg0) {
        Statics.field2079 = arg0;
    }

    @ObfuscatedName("ev.aw(II)Lhp;")
    public static class200 method2797(int arg0) {
        class200 var1 = (class200) field2076.method5414((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2079.method6489(11, arg0);
        class200 var3 = new class200();
        if (var2 != null) {
            var3.method3505(new class534(var2));
        }
        var3.method3513();
        field2076.method5421(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hp.al(B)V")
    public void method3513() {
    }

    @ObfuscatedName("hp.ai(Luq;S)V")
    public void method3505(class534 arg0) {
        while (true) {
            int var2 = arg0.method8591();
            if (var2 == 0) {
                return;
            }
            this.method3506(arg0, var2);
        }
    }

    @ObfuscatedName("hp.ar(Luq;IB)V")
    public void method3506(class534 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method8592();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(var4, 16));
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class404.field4534[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field2077 = var6;
        } else if (arg1 == 2) {
            this.field2078 = arg0.method8597();
        } else if (arg1 == 4) {
            this.field2080 = false;
        } else if (arg1 == 5) {
            this.field2075 = arg0.method8741();
        }
    }

    @ObfuscatedName("hp.as(I)Z")
    public boolean method3507() {
        return this.field2077 == 's';
    }
}
