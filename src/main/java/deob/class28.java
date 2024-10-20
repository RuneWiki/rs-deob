package deob;

@ObfuscatedName("an")
public class class28 {

    @ObfuscatedName("an.s")
    public class277 field223;

    @ObfuscatedName("an.t")
    public class277 field222;

    @ObfuscatedName("an.v")
    public class364 field228 = new class364(256);

    @ObfuscatedName("an.j")
    public class364 field221 = new class364(256);

    public class28(class277 arg0, class277 arg1) {
        this.field223 = arg0;
        this.field222 = arg1;
    }

    @ObfuscatedName("an.s(II[II)Lz;")
    public class23 method508(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class23 var8 = (class23) this.field221.method5756(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class22 var9 = class22.method413(this.field223, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class23 var10 = var9.method407();
            this.field221.method5747(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field165.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("an.t(II[II)Lz;")
    public class23 method512(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class23 var8 = (class23) this.field221.method5756(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class35 var9 = (class35) this.field228.method5756(var6);
            if (var9 == null) {
                var9 = class35.method703(this.field222, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field228.method5747(var9, var6);
            }
            class23 var10 = var9.method693(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method5447();
                this.field221.method5747(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("an.v(I[IS)Lz;")
    public class23 method510(int arg0, int[] arg1) {
        if (this.field223.method4470() == 1) {
            return this.method508(0, arg0, arg1);
        } else if (this.field223.method4484(arg0) == 1) {
            return this.method508(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("an.j(I[II)Lz;")
    public class23 method511(int arg0, int[] arg1) {
        if (this.field222.method4470() == 1) {
            return this.method512(0, arg0, arg1);
        } else if (this.field222.method4484(arg0) == 1) {
            return this.method512(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
