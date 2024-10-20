package deob;

@ObfuscatedName("bb")
public class class46 {

    @ObfuscatedName("bb.aj")
    public class340 field326;

    @ObfuscatedName("bb.al")
    public class340 field323;

    @ObfuscatedName("bb.ac")
    public class455 field324 = new class455(256);

    @ObfuscatedName("bb.ab")
    public class455 field325 = new class455(256);

    public class46(class340 arg0, class340 arg1) {
        this.field326 = arg0;
        this.field323 = arg1;
    }

    @ObfuscatedName("bb.aj(II[II)Lbe;")
    public class41 method819(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class41 var8 = (class41) this.field325.method7619(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class40 var9 = class40.method725(this.field326, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class41 var10 = var9.method719();
            this.field325.method7616(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field268.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bb.al(II[IS)Lbe;")
    public class41 method806(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class41 var8 = (class41) this.field325.method7619(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class53 var9 = (class53) this.field324.method7619(var6);
            if (var9 == null) {
                var9 = class53.method1030(this.field323, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field324.method7616(var9, var6);
            }
            class41 var10 = var9.method1029(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method7335();
                this.field325.method7616(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bb.ac(I[II)Lbe;")
    public class41 method807(int arg0, int[] arg1) {
        if (this.field326.method5870() == 1) {
            return this.method819(0, arg0, arg1);
        } else if (this.field326.method5934(arg0) == 1) {
            return this.method819(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bb.ab(I[II)Lbe;")
    public class41 method808(int arg0, int[] arg1) {
        if (this.field323.method5870() == 1) {
            return this.method806(0, arg0, arg1);
        } else if (this.field323.method5934(arg0) == 1) {
            return this.method806(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
