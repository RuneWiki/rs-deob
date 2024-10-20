package deob;

@ObfuscatedName("eo")
public class class139 {

    @ObfuscatedName("eo.p")
    public static int field2351 = 0;

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ey.g(Leu;IIIZI)V")
    public static void method3193(class153 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2351 = 1;
        Statics.field2352 = arg0;
        Statics.field2349 = arg1;
        Statics.field2354 = arg2;
        Statics.field2355 = arg3;
        Statics.field2356 = arg4;
        Statics.field2020 = 10000;
    }

    @ObfuscatedName("at.h(I)V")
    public static void method565() {
        Statics.field2361.method2863();
        field2351 = 1;
        Statics.field2352 = null;
    }

    @ObfuscatedName("r.s(S)Z")
    public static boolean method64() {
        return field2351 == 0 ? Statics.field2361.method2821() : true;
    }

    @ObfuscatedName("ah.o(S)V")
    public static void method895() {
        try {
            if (field2351 == 1) {
                int var0 = Statics.field2361.method2815();
                if (var0 > 0 && Statics.field2361.method2821()) {
                    int var1 = var0 - Statics.field2020;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2361.method2832(var1);
                    return;
                }
                Statics.field2361.method2863();
                Statics.field2361.method2866();
                if (Statics.field2352 == null) {
                    field2351 = 0;
                } else {
                    field2351 = 2;
                }
                Statics.field2357 = null;
                Statics.field79 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2361.method2863();
            field2351 = 0;
            Statics.field2357 = null;
            Statics.field79 = null;
            Statics.field2352 = null;
        }
    }

    @ObfuscatedName("dr.p(I)Z")
    public static boolean method2423() {
        try {
            if (field2351 == 2) {
                if (Statics.field2357 == null) {
                    Statics.field2357 = class140.method2799(Statics.field2352, Statics.field2349, Statics.field2354);
                    if (Statics.field2357 == null) {
                        return false;
                    }
                }
                if (Statics.field79 == null) {
                    Statics.field79 = new class58(Statics.field2362, Statics.field2348);
                }
                if (Statics.field2361.method2816(Statics.field2357, Statics.field1271, Statics.field79, 22050)) {
                    Statics.field2361.method2817();
                    Statics.field2361.method2832(Statics.field2355);
                    Statics.field2361.method2819(Statics.field2357, Statics.field2356);
                    field2351 = 0;
                    Statics.field2357 = null;
                    Statics.field79 = null;
                    Statics.field2352 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2361.method2863();
            field2351 = 0;
            Statics.field2357 = null;
            Statics.field79 = null;
            Statics.field2352 = null;
        }
        return false;
    }
}
