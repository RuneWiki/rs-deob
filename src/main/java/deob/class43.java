package deob;

@ObfuscatedName("an")
public class class43 {

    @ObfuscatedName("an.o")
    public class316 field321;

    @ObfuscatedName("an.q")
    public class316 field323;

    @ObfuscatedName("an.l")
    public class421 field322 = new class421(256);

    @ObfuscatedName("an.k")
    public class421 field320 = new class421(256);

    public class43(class316 arg0, class316 arg1) {
        this.field321 = arg0;
        this.field323 = arg1;
    }

    @ObfuscatedName("an.o(II[II)Lak;")
    public class38 method758(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class38 var8 = (class38) this.field320.method6687(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class37 var9 = class37.method643(this.field321, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class38 var10 = var9.method635();
            this.field320.method6688(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field264.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("an.q(II[II)Lak;")
    public class38 method755(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class38 var8 = (class38) this.field320.method6687(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class50 var9 = (class50) this.field322.method6687(var6);
            if (var9 == null) {
                var9 = class50.method932(this.field323, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field322.method6688(var9, var6);
            }
            class38 var10 = var9.method934(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method6399();
                this.field320.method6688(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("an.l(I[II)Lak;")
    public class38 method756(int arg0, int[] arg1) {
        if (this.field321.method5197() == 1) {
            return this.method758(0, arg0, arg1);
        } else if (this.field321.method5200(arg0) == 1) {
            return this.method758(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("an.k(I[II)Lak;")
    public class38 method757(int arg0, int[] arg1) {
        if (this.field323.method5197() == 1) {
            return this.method755(0, arg0, arg1);
        } else if (this.field323.method5200(arg0) == 1) {
            return this.method755(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
