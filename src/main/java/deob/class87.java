package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ck")
public class class87 {

    @ObfuscatedName("ck.n")
    public static int field1178 = 0;

    @ObfuscatedName("ck.h")
    public static class103 field1180 = new class103(4096);

    @ObfuscatedName("ck.k")
    public static int field1181 = 0;

    @ObfuscatedName("ck.r")
    public static class103 field1182 = new class103(32);

    @ObfuscatedName("ck.l")
    public static int field1183 = 0;

    @ObfuscatedName("ck.i")
    public static class101 field1184 = new class101();

    @ObfuscatedName("ck.e")
    public static class103 field1185 = new class103(4096);

    @ObfuscatedName("ck.a")
    public static int field1186 = 0;

    @ObfuscatedName("ck.g")
    public static class103 field1187 = new class103(4096);

    @ObfuscatedName("ck.w")
    public static int field1188 = 0;

    @ObfuscatedName("ck.m")
    public static class135 field1189 = new class135(8);

    @ObfuscatedName("ck.f")
    public static int field1191 = 0;

    @ObfuscatedName("ck.x")
    public static CRC32 field1193 = new CRC32();

    @ObfuscatedName("ck.o")
    public static class120[] field1194 = new class120[256];

    @ObfuscatedName("ck.c")
    public static byte field1195 = 0;

    @ObfuscatedName("ck.y")
    public static int field1196 = 0;

    @ObfuscatedName("ck.j")
    public static int field1197 = 0;

    public class87() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bp.n(Ldy;II)V")
    public static void method862(class120 arg0, int arg1) {
        if (Statics.field2398 == null) {
            method539((class120) null, 255, 255, 0, (byte) 0, true);
            field1194[arg1] = arg0;
        } else {
            Statics.field2398.field1722 = arg1 * 8 + 5;
            int var2 = Statics.field2398.method1616();
            int var3 = Statics.field2398.method1616();
            arg0.method1445(var2, var3);
        }
    }

    @ObfuscatedName("ay.q(Ldy;IIIBZI)V")
    public static void method539(class120 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class167 var8 = (class167) field1180.method1259(var6);
        if (var8 != null) {
            return;
        }
        class167 var9 = (class167) field1182.method1259(var6);
        if (var9 != null) {
            return;
        }
        class167 var10 = (class167) field1185.method1259(var6);
        if (var10 == null) {
            if (!arg5) {
                class167 var11 = (class167) field1187.method1259(var6);
                if (var11 != null) {
                    return;
                }
            }
            class167 var12 = new class167();
            var12.field2490 = arg0;
            var12.field2491 = arg3;
            var12.field2492 = arg4;
            if (arg5) {
                field1180.method1265(var12, var6);
                field1181++;
            } else {
                field1184.method1235(var12);
                field1185.method1265(var12, var6);
                field1186++;
            }
        } else if (arg5) {
            var10.method1805();
            field1180.method1265(var10, var6);
            field1186--;
            field1181++;
        }
    }
}
