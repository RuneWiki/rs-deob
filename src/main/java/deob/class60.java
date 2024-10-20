package deob;

@ObfuscatedName("be")
public class class60 {

    @ObfuscatedName("be.h")
    public class167 field1230;

    @ObfuscatedName("be.m")
    public class167 field1224;

    @ObfuscatedName("be.i")
    public class196 field1225 = new class196(256);

    @ObfuscatedName("be.q")
    public class196 field1226 = new class196(256);

    public class60(class167 arg0, class167 arg1) {
        this.field1230 = arg0;
        this.field1224 = arg1;
    }

    @ObfuscatedName("be.h(II[II)Lby;")
    public class63 method1207(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1226.method3519(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1204(this.field1230, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1196();
            this.field1226.method3513(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1241.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("be.m(II[II)Lby;")
    public class63 method1209(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1226.method3519(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1225.method3519(var6);
            if (var9 == null) {
                var9 = class71.method1422(this.field1224, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1225.method3513(var9, var6);
            }
            class63 var10 = var9.method1436(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3625();
                this.field1226.method3513(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("be.i(I[II)Lby;")
    public class63 method1220(int arg0, int[] arg1) {
        if (this.field1230.method3053() == 1) {
            return this.method1207(0, arg0, arg1);
        } else if (this.field1230.method3017(arg0) == 1) {
            return this.method1207(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("be.q(I[II)Lby;")
    public class63 method1210(int arg0, int[] arg1) {
        if (this.field1224.method3053() == 1) {
            return this.method1209(0, arg0, arg1);
        } else if (this.field1224.method3017(arg0) == 1) {
            return this.method1209(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
