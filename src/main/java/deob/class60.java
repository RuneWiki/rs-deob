package deob;

@ObfuscatedName("bw")
public class class60 {

    @ObfuscatedName("bw.k")
    public class167 field1193;

    @ObfuscatedName("bw.h")
    public class167 field1192;

    @ObfuscatedName("bw.o")
    public class196 field1194 = new class196(256);

    @ObfuscatedName("bw.z")
    public class196 field1195 = new class196(256);

    public class60(class167 arg0, class167 arg1) {
        this.field1193 = arg0;
        this.field1192 = arg1;
    }

    @ObfuscatedName("bw.k(II[II)Lbx;")
    public class63 method1204(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class63 var8 = (class63) this.field1195.method3559(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class59 var9 = class59.method1184(this.field1193, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class63 var10 = var9.method1179();
            this.field1195.method3560(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1210.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bw.h(II[II)Lbx;")
    public class63 method1197(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class63 var8 = (class63) this.field1195.method3559(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class71 var9 = (class71) this.field1194.method3559(var6);
            if (var9 == null) {
                var9 = class71.method1418(this.field1192, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1194.method3560(var9, var6);
            }
            class63 var10 = var9.method1410(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3679();
                this.field1195.method3560(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bw.o(I[II)Lbx;")
    public class63 method1198(int arg0, int[] arg1) {
        if (this.field1193.method3060() == 1) {
            return this.method1204(0, arg0, arg1);
        } else if (this.field1193.method3059(arg0) == 1) {
            return this.method1204(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bw.z(I[IS)Lbx;")
    public class63 method1199(int arg0, int[] arg1) {
        if (this.field1192.method3060() == 1) {
            return this.method1197(0, arg0, arg1);
        } else if (this.field1192.method3059(arg0) == 1) {
            return this.method1197(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
