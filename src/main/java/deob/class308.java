package deob;

@ObfuscatedName("ld")
public class class308 extends class485 {

    @ObfuscatedName("ld.at")
    public class306 field3241;

    @ObfuscatedName("ld.ah")
    public int field3247;

    @ObfuscatedName("ld.ar")
    public class526 field3243;

    @ObfuscatedName("ld.ao")
    public int field3242;

    @ObfuscatedName("ld.ab")
    public static class308[] field3245 = new class308[300];

    @ObfuscatedName("ld.au")
    public static int field3244 = 0;

    @ObfuscatedName("kp.at(I)Lld;")
    public static class308 method4978() {
        return field3244 == 0 ? new class308() : field3245[--field3244];
    }

    @ObfuscatedName("es.ah(Llq;Luy;I)Lld;")
    public static class308 method2768(class306 arg0, class544 arg1) {
        class308 var2 = method4978();
        var2.field3241 = arg0;
        var2.field3247 = arg0.field3177;
        if (var2.field3247 == -1) {
            var2.field3243 = new class526(260);
        } else if (var2.field3247 == -2) {
            var2.field3243 = new class526(10000);
        } else if (var2.field3247 <= 18) {
            var2.field3243 = new class526(20);
        } else if (var2.field3247 <= 98) {
            var2.field3243 = new class526(100);
        } else {
            var2.field3243 = new class526(260);
        }
        var2.field3243.method8353(arg1);
        var2.field3243.method8364(var2.field3241.field3132);
        var2.field3242 = 0;
        return var2;
    }

    @ObfuscatedName("hq.ar(I)Lld;")
    public static class308 method3373() {
        class308 var0;
        if (field3244 == 0) {
            var0 = new class308();
        } else {
            var0 = field3245[--field3244];
        }
        var0.field3241 = null;
        var0.field3247 = 0;
        var0.field3243 = new class526(5000);
        return var0;
    }

    @ObfuscatedName("ld.ao(I)V")
    public void method5324() {
        if (field3244 < field3245.length) {
            field3245[++field3244 - 1] = this;
        }
    }
}
