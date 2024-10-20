package deob;

@ObfuscatedName("hi")
public class class198 extends class489 {

    @ObfuscatedName("hi.ah")
    public static class304 field2030 = new class304(64);

    @ObfuscatedName("hi.af")
    public boolean field2029 = false;

    @ObfuscatedName("ce.az(Loc;B)V")
    public static void method1120(class379 arg0) {
        Statics.field2027 = arg0;
    }

    @ObfuscatedName("jq.ah(II)Lhi;")
    public static class198 method4106(int arg0) {
        class198 var1 = (class198) field2030.method5336((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2027.method6328(19, arg0);
        class198 var3 = new class198();
        if (var2 != null) {
            var3.method3448(new class535(var2));
        }
        field2030.method5346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hi.af(Lur;I)V")
    public void method3448(class535 arg0) {
        while (true) {
            int var2 = arg0.method8462();
            if (var2 == 0) {
                return;
            }
            this.method3450(arg0, var2);
        }
    }

    @ObfuscatedName("hi.at(Lur;II)V")
    public void method3450(class535 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2029 = true;
        }
    }
}
