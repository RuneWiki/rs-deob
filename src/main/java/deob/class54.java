package deob;

@ObfuscatedName("bl")
public class class54 {

    @ObfuscatedName("bl.l")
    public class149 field1115;

    @ObfuscatedName("bl.y")
    public class149 field1110;

    @ObfuscatedName("bl.g")
    public class177 field1109 = new class177(256);

    @ObfuscatedName("bl.j")
    public class177 field1112 = new class177(256);

    public class54(class149 arg0, class149 arg1) {
        this.field1115 = arg0;
        this.field1110 = arg1;
    }

    @ObfuscatedName("bl.l(II[II)Lbe;")
    public class57 method1041(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class57 var8 = (class57) this.field1112.method3254(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = class53.method1027(this.field1115, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class57 var10 = var9.method1029();
            this.field1112.method3260(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1129.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bl.y(II[II)Lbe;")
    public class57 method1042(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class57 var8 = (class57) this.field1112.method3254(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class65 var9 = (class65) this.field1109.method3254(var6);
            if (var9 == null) {
                var9 = class65.method1276(this.field1110, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1109.method3260(var9, var6);
            }
            class57 var10 = var9.method1277(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3375();
                this.field1112.method3260(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bl.g(I[II)Lbe;")
    public class57 method1043(int arg0, int[] arg1) {
        if (this.field1115.method2760() == 1) {
            return this.method1041(0, arg0, arg1);
        } else if (this.field1115.method2799(arg0) == 1) {
            return this.method1041(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bl.j(I[II)Lbe;")
    public class57 method1059(int arg0, int[] arg1) {
        if (this.field1110.method2760() == 1) {
            return this.method1042(0, arg0, arg1);
        } else if (this.field1110.method2799(arg0) == 1) {
            return this.method1042(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
