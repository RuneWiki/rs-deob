package deob;

@ObfuscatedName("bh")
public class class53 {

    @ObfuscatedName("bh.k")
    public class146 field1120;

    @ObfuscatedName("bh.r")
    public class146 field1116;

    @ObfuscatedName("bh.y")
    public class174 field1115 = new class174(256);

    @ObfuscatedName("bh.w")
    public class174 field1113 = new class174(256);

    public class53(class146 arg0, class146 arg1) {
        this.field1120 = arg0;
        this.field1116 = arg1;
    }

    @ObfuscatedName("bh.k(II[II)Lbw;")
    public class56 method1067(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1113.method3163(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class52 var9 = class52.method1053(this.field1120, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method1051();
            this.field1113.method3164(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1131.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bh.r(II[II)Lbw;")
    public class56 method1068(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1113.method3163(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class64 var9 = (class64) this.field1115.method3163(var6);
            if (var9 == null) {
                var9 = class64.method1310(this.field1116, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1115.method3164(var9, var6);
            }
            class56 var10 = var9.method1316(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3275();
                this.field1113.method3164(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bh.y(I[IB)Lbw;")
    public class56 method1069(int arg0, int[] arg1) {
        if (this.field1120.method2735() == 1) {
            return this.method1067(0, arg0, arg1);
        } else if (this.field1120.method2688(arg0) == 1) {
            return this.method1067(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bh.w(I[II)Lbw;")
    public class56 method1076(int arg0, int[] arg1) {
        if (this.field1116.method2735() == 1) {
            return this.method1068(0, arg0, arg1);
        } else if (this.field1116.method2688(arg0) == 1) {
            return this.method1068(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
