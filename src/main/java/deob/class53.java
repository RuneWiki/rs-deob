package deob;

@ObfuscatedName("bu")
public class class53 {

    @ObfuscatedName("bu.g")
    public class146 field1110;

    @ObfuscatedName("bu.v")
    public class146 field1111;

    @ObfuscatedName("bu.z")
    public class174 field1112 = new class174(256);

    @ObfuscatedName("bu.h")
    public class174 field1114 = new class174(256);

    public class53(class146 arg0, class146 arg1) {
        this.field1110 = arg0;
        this.field1111 = arg1;
    }

    @ObfuscatedName("bu.g(II[II)Lbq;")
    public class56 method1079(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1114.method3201(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class52 var9 = class52.method1066(this.field1110, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method1065();
            this.field1114.method3202(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1124.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bu.v(II[II)Lbq;")
    public class56 method1090(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1114.method3201(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class64 var9 = (class64) this.field1112.method3201(var6);
            if (var9 == null) {
                var9 = class64.method1278(this.field1111, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1112.method3202(var9, var6);
            }
            class56 var10 = var9.method1279(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3322();
                this.field1114.method3202(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bu.z(I[II)Lbq;")
    public class56 method1080(int arg0, int[] arg1) {
        if (this.field1110.method2719() == 1) {
            return this.method1079(0, arg0, arg1);
        } else if (this.field1110.method2718(arg0) == 1) {
            return this.method1079(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bu.h(I[II)Lbq;")
    public class56 method1092(int arg0, int[] arg1) {
        if (this.field1111.method2719() == 1) {
            return this.method1090(0, arg0, arg1);
        } else if (this.field1111.method2718(arg0) == 1) {
            return this.method1090(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
