package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("eh")
public class class79 {

    @ObfuscatedName("eh.f")
    public static class20 field913 = new class20();

    @ObfuscatedName("eh.g")
    public static int field908 = 0;

    @ObfuscatedName("eh.d")
    public static class3 field911 = new class3(32);

    @ObfuscatedName("eh.a")
    public static byte field922 = 0;

    @ObfuscatedName("eh.n")
    public static CRC32 field917 = new CRC32();

    @ObfuscatedName("eh.l")
    public static int field921 = 0;

    @ObfuscatedName("eh.m")
    public static int field912 = 0;

    @ObfuscatedName("eh.j")
    public static int field915 = 0;

    @ObfuscatedName("eh.h")
    public static int field923 = 0;

    @ObfuscatedName("eh.i")
    public static int field919 = 0;

    @ObfuscatedName("eh.w")
    public static class3 field909 = new class3(4096);

    @ObfuscatedName("eh.t")
    public static int field918 = 0;

    @ObfuscatedName("eh.s")
    public static class3 field914 = new class3(4096);

    @ObfuscatedName("eh.q")
    public static class50 field920 = new class50(8);

    @ObfuscatedName("eh.p")
    public static int field907 = 0;

    @ObfuscatedName("eh.y")
    public static class34[] field916 = new class34[256];

    @ObfuscatedName("eh.x")
    public static class3 field910 = new class3(4096);

    public class79() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dl.k(B)V")
    public static void method601() {
        if (Statics.field924 != null) {
            Statics.field924.method2290();
        }
    }

    @ObfuscatedName("m.b(ZI)V")
    public static void method1151(boolean arg0) {
        if (Statics.field924 == null) {
            return;
        }
        try {
            class50 var1 = new class50(4);
            var1.method666(arg0 ? 2 : 3);
            var1.method668(0);
            Statics.field924.method2293(var1.field541, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field924.method2290();
            } catch (Exception var4) {
            }
            field912++;
            Statics.field924 = null;
        }
    }

    @ObfuscatedName("ej.h(Leb;IIIBZI)V")
    public static void method1359(class34 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class81 var8 = (class81) field909.method20(var6);
        if (var8 != null) {
            return;
        }
        class81 var9 = (class81) field911.method20(var6);
        if (var9 != null) {
            return;
        }
        class81 var10 = (class81) field914.method20(var6);
        if (var10 == null) {
            if (!arg5) {
                class81 var11 = (class81) field910.method20(var6);
                if (var11 != null) {
                    return;
                }
            }
            class81 var12 = new class81();
            var12.field937 = arg0;
            var12.field935 = arg3;
            var12.field934 = arg4;
            if (arg5) {
                field909.method14(var12, var6);
                field918++;
            } else {
                field913.method247(var12);
                field914.method14(var12, var6);
                field915++;
            }
        } else if (arg5) {
            var10.method51();
            field909.method14(var10, var6);
            field915--;
            field918++;
        }
    }
}
