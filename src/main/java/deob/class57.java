package deob;

@ObfuscatedName("ba")
public class class57 {

    @ObfuscatedName("ba.p")
    public class151 field1196;

    @ObfuscatedName("ba.j")
    public class151 field1194;

    @ObfuscatedName("ba.w")
    public class174 field1195 = new class174(256);

    @ObfuscatedName("ba.h")
    public class174 field1197 = new class174(256);

    public class57(class151 arg0, class151 arg1) {
        this.field1196 = arg0;
        this.field1194 = arg1;
    }

    @ObfuscatedName("ba.p(II[II)Lbl;")
    public class62 method1230(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class62 var8 = (class62) this.field1197.method3261(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class56 var9 = class56.method1217(this.field1196, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class62 var10 = var9.method1219();
            this.field1197.method3262(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1230.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("ba.j(II[IS)Lbl;")
    public class62 method1239(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class62 var8 = (class62) this.field1197.method3261(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class52 var9 = (class52) this.field1195.method3261(var6);
            if (var9 == null) {
                var9 = class52.method1159(this.field1194, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1195.method3262(var9, var6);
            }
            class62 var10 = var9.method1182(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3327();
                this.field1197.method3262(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ba.w(I[IB)Lbl;")
    public class62 method1231(int arg0, int[] arg1) {
        if (this.field1196.method2924() == 1) {
            return this.method1230(0, arg0, arg1);
        } else if (this.field1196.method2923(arg0) == 1) {
            return this.method1230(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ba.h(I[II)Lbl;")
    public class62 method1246(int arg0, int[] arg1) {
        if (this.field1194.method2924() == 1) {
            return this.method1239(0, arg0, arg1);
        } else if (this.field1194.method2923(arg0) == 1) {
            return this.method1239(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
