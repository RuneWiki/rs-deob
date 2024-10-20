package deob;

@ObfuscatedName("hh")
public class class201 extends class488 {

    @ObfuscatedName("hh.aw")
    public static class304 field2082 = new class304(64);

    @ObfuscatedName("hh.al")
    public class507 field2083;

    @ObfuscatedName("ft.aq(IB)Lhh;")
    public static class201 method3041(int arg0) {
        class201 var1 = (class201) field2082.method5414((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2081.method6489(34, arg0);
        class201 var3 = new class201();
        if (var2 != null) {
            var3.method3527(new class534(var2));
        }
        var3.method3526();
        field2082.method5421(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hh.aw(B)V")
    public void method3526() {
    }

    @ObfuscatedName("hh.al(Luq;I)V")
    public void method3527(class534 arg0) {
        while (true) {
            int var2 = arg0.method8591();
            if (var2 == 0) {
                return;
            }
            this.method3528(arg0, var2);
        }
    }

    @ObfuscatedName("hh.ai(Luq;IB)V")
    public void method3528(class534 arg0, int arg1) {
        if (arg1 == 249) {
            this.field2083 = class183.method5700(arg0, this.field2083);
        }
    }

    @ObfuscatedName("hh.ar(III)I")
    public int method3533(int arg0, int arg1) {
        class507 var3 = this.field2083;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class491 var5 = (class491) var3.method8299((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4917;
            }
        }
        return var4;
    }

    @ObfuscatedName("hh.as(ILjava/lang/String;B)Ljava/lang/String;")
    public String method3539(int arg0, String arg1) {
        class507 var3 = this.field2083;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class489 var5 = (class489) var3.method8299((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4915;
            }
        }
        return var4;
    }
}
