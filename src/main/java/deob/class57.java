package deob;

@ObfuscatedName("by")
public class class57 {

    @ObfuscatedName("by.j")
    public class150 field1184;

    @ObfuscatedName("by.y")
    public class150 field1182;

    @ObfuscatedName("by.x")
    public class173 field1183 = new class173(256);

    @ObfuscatedName("by.z")
    public class173 field1181 = new class173(256);

    public class57(class150 arg0, class150 arg1) {
        this.field1184 = arg0;
        this.field1182 = arg1;
    }

    @ObfuscatedName("by.j(II[II)Lbb;")
    public class62 method1245(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class62 var8 = (class62) this.field1181.method3222(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class56 var9 = class56.method1240(this.field1184, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class62 var10 = var9.method1229();
            this.field1181.method3223(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1211.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("by.y(II[IS)Lbb;")
    public class62 method1246(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class62 var8 = (class62) this.field1181.method3222(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class52 var9 = (class52) this.field1183.method3222(var6);
            if (var9 == null) {
                var9 = class52.method1183(this.field1182, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1183.method3223(var9, var6);
            }
            class62 var10 = var9.method1173(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3289();
                this.field1181.method3223(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("by.x(I[IB)Lbb;")
    public class62 method1250(int arg0, int[] arg1) {
        if (this.field1184.method2923() == 1) {
            return this.method1245(0, arg0, arg1);
        } else if (this.field1184.method2913(arg0) == 1) {
            return this.method1245(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("by.z(I[II)Lbb;")
    public class62 method1258(int arg0, int[] arg1) {
        if (this.field1182.method2923() == 1) {
            return this.method1246(0, arg0, arg1);
        } else if (this.field1182.method2913(arg0) == 1) {
            return this.method1246(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
