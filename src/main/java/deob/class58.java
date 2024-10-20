package deob;

@ObfuscatedName("bt")
public class class58 {

    @ObfuscatedName("bt.q")
    public class153 field1193;

    @ObfuscatedName("bt.c")
    public class153 field1197;

    @ObfuscatedName("bt.p")
    public class175 field1192 = new class175(256);

    @ObfuscatedName("bt.z")
    public class175 field1194 = new class175(256);

    public class58(class153 arg0, class153 arg1) {
        this.field1193 = arg0;
        this.field1197 = arg1;
    }

    @ObfuscatedName("bt.q(II[II)Lby;")
    public class63 method1296(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1194.method3260(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class57 var9 = class57.method1281(this.field1193, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1274();
            this.field1194.method3261(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1226.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bt.c(II[II)Lby;")
    public class63 method1289(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1194.method3260(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = (class53) this.field1192.method3260(var6);
            if (var9 == null) {
                var9 = class53.method1217(this.field1197, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1192.method3261(var9, var6);
            }
            class63 var10 = var9.method1212(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3309();
                this.field1194.method3261(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bt.p(I[IS)Lby;")
    public class63 method1290(int arg0, int[] arg1) {
        if (this.field1193.method2963() == 1) {
            return this.method1296(0, arg0, arg1);
        } else if (this.field1193.method2962(arg0) == 1) {
            return this.method1296(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bt.z(I[II)Lby;")
    public class63 method1291(int arg0, int[] arg1) {
        if (this.field1197.method2963() == 1) {
            return this.method1289(0, arg0, arg1);
        } else if (this.field1197.method2962(arg0) == 1) {
            return this.method1289(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
