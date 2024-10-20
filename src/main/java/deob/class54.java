package deob;

@ObfuscatedName("br")
public class class54 {

    @ObfuscatedName("br.f")
    public class149 field1129;

    @ObfuscatedName("br.k")
    public class149 field1128;

    @ObfuscatedName("br.y")
    public class177 field1136 = new class177(256);

    @ObfuscatedName("br.e")
    public class177 field1130 = new class177(256);

    public class54(class149 arg0, class149 arg1) {
        this.field1129 = arg0;
        this.field1128 = arg1;
    }

    @ObfuscatedName("br.f(II[IB)Lbu;")
    public class57 method1090(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class57 var8 = (class57) this.field1130.method3244(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = class53.method1073(this.field1129, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class57 var10 = var9.method1085();
            this.field1130.method3245(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1147.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("br.k(II[IB)Lbu;")
    public class57 method1088(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class57 var8 = (class57) this.field1130.method3244(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class65 var9 = (class65) this.field1136.method3244(var6);
            if (var9 == null) {
                var9 = class65.method1325(this.field1128, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1136.method3245(var9, var6);
            }
            class57 var10 = var9.method1316(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3367();
                this.field1130.method3245(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("br.y(I[II)Lbu;")
    public class57 method1089(int arg0, int[] arg1) {
        if (this.field1129.method2774() == 1) {
            return this.method1090(0, arg0, arg1);
        } else if (this.field1129.method2773(arg0) == 1) {
            return this.method1090(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("br.e(I[II)Lbu;")
    public class57 method1086(int arg0, int[] arg1) {
        if (this.field1128.method2774() == 1) {
            return this.method1088(0, arg0, arg1);
        } else if (this.field1128.method2773(arg0) == 1) {
            return this.method1088(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
