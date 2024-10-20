package deob;

@ObfuscatedName("bf")
public class class53 {

    @ObfuscatedName("bf.t")
    public class146 field1103;

    @ObfuscatedName("bf.s")
    public class146 field1104;

    @ObfuscatedName("bf.f")
    public class174 field1105 = new class174(256);

    @ObfuscatedName("bf.e")
    public class174 field1106 = new class174(256);

    public class53(class146 arg0, class146 arg1) {
        this.field1103 = arg0;
        this.field1104 = arg1;
    }

    @ObfuscatedName("bf.t(II[IB)Lba;")
    public class56 method1024(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class56 var8 = (class56) this.field1106.method3204(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class52 var9 = class52.method1014(this.field1103, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class56 var10 = var9.method1010();
            this.field1106.method3212(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1121.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bf.s(II[II)Lba;")
    public class56 method1025(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class56 var8 = (class56) this.field1106.method3204(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class64 var9 = (class64) this.field1105.method3204(var6);
            if (var9 == null) {
                var9 = class64.method1260(this.field1104, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1105.method3212(var9, var6);
            }
            class56 var10 = var9.method1261(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3316();
                this.field1106.method3212(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bf.f(I[IB)Lba;")
    public class56 method1026(int arg0, int[] arg1) {
        if (this.field1103.method2734() == 1) {
            return this.method1024(0, arg0, arg1);
        } else if (this.field1103.method2719(arg0) == 1) {
            return this.method1024(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bf.e(I[II)Lba;")
    public class56 method1023(int arg0, int[] arg1) {
        if (this.field1104.method2734() == 1) {
            return this.method1025(0, arg0, arg1);
        } else if (this.field1104.method2719(arg0) == 1) {
            return this.method1025(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
