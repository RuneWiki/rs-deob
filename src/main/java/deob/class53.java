package deob;

@ObfuscatedName("bp")
public class class53 {

    @ObfuscatedName("bp.z")
    public class146 field1081;

    @ObfuscatedName("bp.j")
    public class146 field1082;

    @ObfuscatedName("bp.a")
    public class174 field1085 = new class174(256);

    @ObfuscatedName("bp.y")
    public class174 field1084 = new class174(256);

    public class53(class146 arg0, class146 arg1) {
        this.field1081 = arg0;
        this.field1082 = arg1;
    }

    @ObfuscatedName("bp.z(II[II)Lbi;")
    public class56 method1019(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1084.method3204(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class52 var9 = class52.method1008(this.field1081, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method1009();
            this.field1084.method3205(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1100.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bp.j(II[IS)Lbi;")
    public class56 method1020(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1084.method3204(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class64 var9 = (class64) this.field1085.method3204(var6);
            if (var9 == null) {
                var9 = class64.method1248(this.field1082, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1085.method3205(var9, var6);
            }
            class56 var10 = var9.method1241(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3311();
                this.field1084.method3205(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bp.a(I[IB)Lbi;")
    public class56 method1021(int arg0, int[] arg1) {
        if (this.field1081.method2716() == 1) {
            return this.method1019(0, arg0, arg1);
        } else if (this.field1081.method2738(arg0) == 1) {
            return this.method1019(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bp.y(I[II)Lbi;")
    public class56 method1022(int arg0, int[] arg1) {
        if (this.field1082.method2716() == 1) {
            return this.method1020(0, arg0, arg1);
        } else if (this.field1082.method2738(arg0) == 1) {
            return this.method1020(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
