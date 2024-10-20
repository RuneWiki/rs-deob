package deob;

@ObfuscatedName("gn")
public class class198 extends class435 {

    @ObfuscatedName("gn.w")
    public static class273 field2126 = new class273(64);

    @ObfuscatedName("gn.v")
    public class450 field2127;

    @ObfuscatedName("cb.f(II)Lgn;")
    public static class198 method2325(int arg0) {
        class198 var1 = (class198) field2126.method5028((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2125.method5990(34, arg0);
        class198 var3 = new class198();
        if (var2 != null) {
            var3.method3545(new class474(var2));
        }
        var3.method3556();
        field2126.method5027(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gn.w(I)V")
    public void method3556() {
    }

    @ObfuscatedName("gn.v(Lrd;B)V")
    public void method3545(class474 arg0) {
        while (true) {
            int var2 = arg0.method7964();
            if (var2 == 0) {
                return;
            }
            this.method3546(arg0, var2);
        }
    }

    @ObfuscatedName("gn.s(Lrd;II)V")
    public void method3546(class474 arg0, int arg1) {
        if (arg1 == 249) {
            this.field2127 = class187.method2938(arg0, this.field2127);
        }
    }

    @ObfuscatedName("gn.z(IIB)I")
    public int method3547(int arg0, int arg1) {
        class450 var3 = this.field2127;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class439 var5 = (class439) var3.method7691((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4708;
            }
        }
        return var4;
    }

    @ObfuscatedName("gn.j(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3544(int arg0, String arg1) {
        return class187.method3012(this.field2127, arg0, arg1);
    }

    @ObfuscatedName("dg.i(B)V")
    public static void method2751() {
        field2126.method5033();
    }
}
