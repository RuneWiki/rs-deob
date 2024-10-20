package deob;

@ObfuscatedName("ap")
public class class43 {

    @ObfuscatedName("ap.s")
    public class316 field318;

    @ObfuscatedName("ap.h")
    public class316 field319;

    @ObfuscatedName("ap.w")
    public class421 field320 = new class421(256);

    @ObfuscatedName("ap.v")
    public class421 field321 = new class421(256);

    public class43(class316 arg0, class316 arg1) {
        this.field318 = arg0;
        this.field319 = arg1;
    }

    @ObfuscatedName("ap.s(II[II)Lag;")
    public class38 method718(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class38 var8 = (class38) this.field321.method6695(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class37 var9 = class37.method628(this.field318, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class38 var10 = var9.method630();
            this.field321.method6683(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field264.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("ap.h(II[II)Lag;")
    public class38 method719(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class38 var8 = (class38) this.field321.method6695(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class50 var9 = (class50) this.field320.method6695(var6);
            if (var9 == null) {
                var9 = class50.method910(this.field319, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field320.method6683(var9, var6);
            }
            class38 var10 = var9.method898(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method6409();
                this.field321.method6683(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ap.w(I[II)Lag;")
    public class38 method720(int arg0, int[] arg1) {
        if (this.field318.method5243() == 1) {
            return this.method718(0, arg0, arg1);
        } else if (this.field318.method5184(arg0) == 1) {
            return this.method718(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ap.v(I[II)Lag;")
    public class38 method727(int arg0, int[] arg1) {
        if (this.field319.method5243() == 1) {
            return this.method719(0, arg0, arg1);
        } else if (this.field319.method5184(arg0) == 1) {
            return this.method719(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
