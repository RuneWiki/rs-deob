package deob;

@ObfuscatedName("hq")
public class class203 extends class470 {

    @ObfuscatedName("hq.ay")
    public static class289 field2098 = new class289(64);

    @ObfuscatedName("hq.ar")
    public char field2099;

    @ObfuscatedName("hq.am")
    public int field2100;

    @ObfuscatedName("hq.as")
    public String field2097;

    @ObfuscatedName("hq.aj")
    public boolean field2102 = true;

    @ObfuscatedName("mw.aw(II)Lhq;")
    public static class203 method5455(int arg0) {
        class203 var1 = (class203) field2098.method5152((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2101.method6117(11, arg0);
        class203 var3 = new class203();
        if (var2 != null) {
            var3.method3510(new class514(var2));
        }
        var3.method3495();
        field2098.method5149(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hq.ay(S)V")
    public void method3495() {
    }

    @ObfuscatedName("hq.ar(Lty;I)V")
    public void method3510(class514 arg0) {
        while (true) {
            int var2 = arg0.method8244();
            if (var2 == 0) {
                return;
            }
            this.method3497(arg0, var2);
        }
    }

    @ObfuscatedName("hq.am(Lty;II)V")
    public void method3497(class514 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2099 = class386.method251(arg0.method8264());
        } else if (arg1 == 2) {
            this.field2100 = arg0.method8496();
        } else if (arg1 == 4) {
            this.field2102 = false;
        } else if (arg1 == 5) {
            this.field2097 = arg0.method8369();
        }
    }

    @ObfuscatedName("hq.as(I)Z")
    public boolean method3498() {
        return this.field2099 == 's';
    }
}
