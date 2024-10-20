package deob;

@ObfuscatedName("ix")
public class class216 extends class484 {

    @ObfuscatedName("ix.al")
    public static class302 field2150 = new class302(64);

    @ObfuscatedName("ix.ak")
    public char field2152;

    @ObfuscatedName("ix.ax")
    public int field2149;

    @ObfuscatedName("ix.ao")
    public String field2154;

    @ObfuscatedName("ix.ah")
    public boolean field2153 = true;

    @ObfuscatedName("io.ac(Lom;I)V")
    public static void method3840(class374 arg0) {
        Statics.field2151 = arg0;
    }

    @ObfuscatedName("gu.al(IB)Lix;")
    public static class216 method3279(int arg0) {
        class216 var1 = (class216) field2150.method5286((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2151.method6342(11, arg0);
        class216 var3 = new class216();
        if (var2 != null) {
            var3.method3614(new class530(var2));
        }
        var3.method3615();
        field2150.method5289(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ix.ak(I)V")
    public void method3615() {
    }

    @ObfuscatedName("ix.ax(Lul;I)V")
    public void method3614(class530 arg0) {
        while (true) {
            int var2 = arg0.method8365();
            if (var2 == 0) {
                return;
            }
            this.method3598(arg0, var2);
        }
    }

    @ObfuscatedName("ix.ao(Lul;II)V")
    public void method3598(class530 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2152 = class400.method2995(arg0.method8366());
        } else if (arg1 == 2) {
            this.field2149 = arg0.method8371();
        } else if (arg1 == 4) {
            this.field2153 = false;
        } else if (arg1 == 5) {
            this.field2154 = arg0.method8588();
        }
    }

    @ObfuscatedName("ix.ah(B)Z")
    public boolean method3596() {
        return this.field2152 == 's';
    }

    @ObfuscatedName("aw.ar(I)V")
    public static void method288() {
        field2150.method5288();
    }
}
