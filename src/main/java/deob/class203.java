package deob;

@ObfuscatedName("hx")
public class class203 extends class469 {

    @ObfuscatedName("hx.ae")
    public static class288 field2136 = new class288(64);

    @ObfuscatedName("hx.ao")
    public char field2135;

    @ObfuscatedName("hx.at")
    public int field2133;

    @ObfuscatedName("hx.ac")
    public String field2137;

    @ObfuscatedName("hx.ai")
    public boolean field2134 = true;

    @ObfuscatedName("fr.au(Lnu;I)V")
    public static void method2946(class359 arg0) {
        Statics.field2138 = arg0;
    }

    @ObfuscatedName("ho.ae(II)Lhx;")
    public static class203 method3266(int arg0) {
        class203 var1 = (class203) field2136.method5182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2138.method6128(11, arg0);
        class203 var3 = new class203();
        if (var2 != null) {
            var3.method3516(new class515(var2));
        }
        var3.method3515();
        field2136.method5177(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hx.ao(I)V")
    public void method3515() {
    }

    @ObfuscatedName("hx.at(Ltm;B)V")
    public void method3516(class515 arg0) {
        while (true) {
            int var2 = arg0.method8300();
            if (var2 == 0) {
                return;
            }
            this.method3517(arg0, var2);
        }
    }

    @ObfuscatedName("hx.ac(Ltm;II)V")
    public void method3517(class515 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2135 = class385.method4588(arg0.method8301());
        } else if (arg1 == 2) {
            this.field2133 = arg0.method8306();
        } else if (arg1 == 4) {
            this.field2134 = false;
        } else if (arg1 == 5) {
            this.field2137 = arg0.method8311();
        }
    }

    @ObfuscatedName("hx.ai(I)Z")
    public boolean method3518() {
        return this.field2135 == 's';
    }

    @ObfuscatedName("ex.az(I)V")
    public static void method2816() {
        field2136.method5175();
    }
}
