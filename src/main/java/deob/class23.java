package deob;

@ObfuscatedName("n")
public class class23 {

    @ObfuscatedName("n.q")
    public class87 field313;

    @ObfuscatedName("n.l")
    public class87 field312;

    @ObfuscatedName("n.a")
    public class104 field311 = new class104(256);

    @ObfuscatedName("n.o")
    public class104 field314 = new class104(256);

    public class23(class87 arg0, class87 arg1) {
        this.field313 = arg0;
        this.field312 = arg1;
    }

    @ObfuscatedName("n.q(II[IB)Leg;")
    public class146 method268(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class146 var8 = (class146) this.field314.method1290(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class22 var9 = class22.method263(this.field313, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class146 var10 = var9.method256();
            this.field314.method1279(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field2200.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("n.l(II[II)Leg;")
    public class146 method269(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class146 var8 = (class146) this.field314.method1290(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class131 var9 = (class131) this.field311.method1290(var6);
            if (var9 == null) {
                var9 = class131.method1545(this.field312, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field311.method1279(var9, var6);
            }
            class146 var10 = var9.method1543(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method1328();
                this.field314.method1279(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("n.a(I[II)Leg;")
    public class146 method271(int arg0, int[] arg1) {
        if (this.field313.method1030() == 1) {
            return this.method268(0, arg0, arg1);
        } else if (this.field313.method1028(arg0) == 1) {
            return this.method268(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("n.o(I[IB)Leg;")
    public class146 method267(int arg0, int[] arg1) {
        if (this.field312.method1030() == 1) {
            return this.method269(0, arg0, arg1);
        } else if (this.field312.method1028(arg0) == 1) {
            return this.method269(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
