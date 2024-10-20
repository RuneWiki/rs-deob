package deob;

@ObfuscatedName("bw")
public class class58 {

    @ObfuscatedName("bw.i")
    public class152 field1208;

    @ObfuscatedName("bw.p")
    public class152 field1205;

    @ObfuscatedName("bw.a")
    public class175 field1210 = new class175(256);

    @ObfuscatedName("bw.l")
    public class175 field1207 = new class175(256);

    public class58(class152 arg0, class152 arg1) {
        this.field1208 = arg0;
        this.field1205 = arg1;
    }

    @ObfuscatedName("bw.i(II[IB)Lbh;")
    public class63 method1224(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1207.method3268(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class57 var9 = class57.method1215(this.field1208, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1218();
            this.field1207.method3269(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1238.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bw.p(II[II)Lbh;")
    public class63 method1219(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1207.method3268(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = (class53) this.field1210.method3268(var6);
            if (var9 == null) {
                var9 = class53.method1156(this.field1205, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1210.method3269(var9, var6);
            }
            class63 var10 = var9.method1157(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3319();
                this.field1207.method3269(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bw.a(I[II)Lbh;")
    public class63 method1222(int arg0, int[] arg1) {
        if (this.field1208.method2964() == 1) {
            return this.method1224(0, arg0, arg1);
        } else if (this.field1208.method2945(arg0) == 1) {
            return this.method1224(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bw.l(I[II)Lbh;")
    public class63 method1220(int arg0, int[] arg1) {
        if (this.field1205.method2964() == 1) {
            return this.method1219(0, arg0, arg1);
        } else if (this.field1205.method2945(arg0) == 1) {
            return this.method1219(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
