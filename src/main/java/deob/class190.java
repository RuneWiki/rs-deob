package deob;

@ObfuscatedName("hx")
public class class190 extends class470 {

    @ObfuscatedName("hx.am")
    public static class289 field1941 = new class289(64);

    @ObfuscatedName("hx.as")
    public int field1942 = -1;

    @ObfuscatedName("hx.aj")
    public int[] field1943;

    @ObfuscatedName("hx.ag")
    public short[] field1945;

    @ObfuscatedName("hx.az")
    public short[] field1939;

    @ObfuscatedName("hx.av")
    public short[] field1946;

    @ObfuscatedName("hx.ap")
    public short[] field1944;

    @ObfuscatedName("hx.aq")
    public int[] field1948 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("hx.at")
    public boolean field1952 = false;

    @ObfuscatedName("eq.aw(Lnd;Lnd;B)V")
    public static void method2743(class360 arg0, class360 arg1) {
        Statics.field837 = arg0;
        Statics.field1947 = arg1;
        Statics.field1940 = Statics.field837.method6127(3);
    }

    @ObfuscatedName("fg.ay(IB)Lhx;")
    public static class190 method2893(int arg0) {
        class190 var1 = (class190) field1941.method5152((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field837.method6117(3, arg0);
        class190 var3 = new class190();
        if (var2 != null) {
            var3.method3314(new class514(var2));
        }
        field1941.method5149(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hx.ar(Lty;I)V")
    public void method3314(class514 arg0) {
        while (true) {
            int var2 = arg0.method8244();
            if (var2 == 0) {
                return;
            }
            this.method3315(arg0, var2);
        }
    }

    @ObfuscatedName("hx.am(Lty;II)V")
    public void method3315(class514 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1942 = arg0.method8244();
        } else if (arg1 == 2) {
            int var3 = arg0.method8244();
            this.field1943 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1943[var4] = arg0.method8246();
            }
        } else if (arg1 == 3) {
            this.field1952 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method8244();
            this.field1945 = new short[var5];
            this.field1939 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1945[var6] = (short) arg0.method8246();
                this.field1939[var6] = (short) arg0.method8246();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method8244();
            this.field1946 = new short[var7];
            this.field1944 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1946[var8] = (short) arg0.method8246();
                this.field1944[var8] = (short) arg0.method8246();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1948[arg1 - 60] = arg0.method8246();
        }
    }

    @ObfuscatedName("hx.as(B)Z")
    public boolean method3316() {
        if (this.field1943 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1943.length; var2++) {
            if (!Statics.field1947.method6190(this.field1943[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("hx.aj(I)Lie;")
    public class223 method3324() {
        if (this.field1943 == null) {
            return null;
        }
        class223[] var1 = new class223[this.field1943.length];
        for (int var2 = 0; var2 < this.field1943.length; var2++) {
            var1[var2] = class223.method3926(Statics.field1947, this.field1943[var2], 0);
        }
        class223 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class223(var1, var1.length);
        }
        if (this.field1945 != null) {
            for (int var4 = 0; var4 < this.field1945.length; var4++) {
                var3.method3942(this.field1945[var4], this.field1939[var4]);
            }
        }
        if (this.field1946 != null) {
            for (int var5 = 0; var5 < this.field1946.length; var5++) {
                var3.method3943(this.field1946[var5], this.field1944[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("hx.ag(I)Z")
    public boolean method3318() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1948[var2] != -1 && !Statics.field1947.method6190(this.field1948[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("hx.az(B)Lie;")
    public class223 method3320() {
        class223[] var1 = new class223[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1948[var3] != -1) {
                var1[var2++] = class223.method3926(Statics.field1947, this.field1948[var3], 0);
            }
        }
        class223 var4 = new class223(var1, var2);
        if (this.field1945 != null) {
            for (int var5 = 0; var5 < this.field1945.length; var5++) {
                var4.method3942(this.field1945[var5], this.field1939[var5]);
            }
        }
        if (this.field1946 != null) {
            for (int var6 = 0; var6 < this.field1946.length; var6++) {
                var4.method3943(this.field1946[var6], this.field1944[var6]);
            }
        }
        return var4;
    }
}
