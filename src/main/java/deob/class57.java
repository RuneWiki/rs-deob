package deob;

@ObfuscatedName("bu")
public class class57 {

    @ObfuscatedName("bu.z")
    public class150 field1205;

    @ObfuscatedName("bu.h")
    public class150 field1199;

    @ObfuscatedName("bu.c")
    public class173 field1204 = new class173(256);

    @ObfuscatedName("bu.p")
    public class173 field1200 = new class173(256);

    public class57(class150 arg0, class150 arg1) {
        this.field1205 = arg0;
        this.field1199 = arg1;
    }

    @ObfuscatedName("bu.z(II[II)Lbe;")
    public class62 method1254(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class62 var8 = (class62) this.field1200.method3281(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class56 var9 = class56.method1245(this.field1205, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class62 var10 = var9.method1250();
            this.field1200.method3283(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1236.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bu.h(II[II)Lbe;")
    public class62 method1255(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class62 var8 = (class62) this.field1200.method3281(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class52 var9 = (class52) this.field1204.method3281(var6);
            if (var9 == null) {
                var9 = class52.method1191(this.field1199, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1204.method3283(var9, var6);
            }
            class62 var10 = var9.method1192(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3346();
                this.field1200.method3283(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bu.c(I[II)Lbe;")
    public class62 method1256(int arg0, int[] arg1) {
        if (this.field1205.method2962() == 1) {
            return this.method1254(0, arg0, arg1);
        } else if (this.field1205.method2961(arg0) == 1) {
            return this.method1254(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bu.p(I[II)Lbe;")
    public class62 method1257(int arg0, int[] arg1) {
        if (this.field1199.method2962() == 1) {
            return this.method1255(0, arg0, arg1);
        } else if (this.field1199.method2961(arg0) == 1) {
            return this.method1255(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
