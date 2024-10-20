package deob;

@ObfuscatedName("hv")
public class class189 extends class457 {

    @ObfuscatedName("hv.as")
    public static class287 field1941 = new class287(64);

    @ObfuscatedName("hv.ax")
    public int field1942 = -1;

    @ObfuscatedName("hv.ap")
    public int[] field1938;

    @ObfuscatedName("hv.ab")
    public short[] field1944;

    @ObfuscatedName("hv.ak")
    public short[] field1951;

    @ObfuscatedName("hv.ae")
    public short[] field1946;

    @ObfuscatedName("hv.af")
    public short[] field1947;

    @ObfuscatedName("hv.ao")
    public int[] field1948 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("hv.aa")
    public boolean field1949 = false;

    @ObfuscatedName("ew.at(Lnq;Lnq;I)V")
    public static void method2732(class357 arg0, class357 arg1) {
        Statics.field1939 = arg0;
        Statics.field1943 = arg1;
        Statics.field1940 = Statics.field1939.method6135(3);
    }

    @ObfuscatedName("fn.an(IS)Lhv;")
    public static class189 method3043(int arg0) {
        class189 var1 = (class189) field1941.method5121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1939.method6080(3, arg0);
        class189 var3 = new class189();
        if (var2 != null) {
            var3.method3323(new class501(var2));
        }
        field1941.method5123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hv.av(Ltz;B)V")
    public void method3323(class501 arg0) {
        while (true) {
            int var2 = arg0.method8129();
            if (var2 == 0) {
                return;
            }
            this.method3321(arg0, var2);
        }
    }

    @ObfuscatedName("hv.as(Ltz;IB)V")
    public void method3321(class501 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1942 = arg0.method8129();
        } else if (arg1 == 2) {
            int var3 = arg0.method8129();
            this.field1938 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1938[var4] = arg0.method8195();
            }
        } else if (arg1 == 3) {
            this.field1949 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method8129();
            this.field1944 = new short[var5];
            this.field1951 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1944[var6] = (short) arg0.method8195();
                this.field1951[var6] = (short) arg0.method8195();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method8129();
            this.field1946 = new short[var7];
            this.field1947 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1946[var8] = (short) arg0.method8195();
                this.field1947[var8] = (short) arg0.method8195();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1948[arg1 - 60] = arg0.method8195();
        }
    }

    @ObfuscatedName("hv.ax(B)Z")
    public boolean method3307() {
        if (this.field1938 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1938.length; var2++) {
            if (!Statics.field1943.method6082(this.field1938[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("hv.ap(I)Lit;")
    public class221 method3308() {
        if (this.field1938 == null) {
            return null;
        }
        class221[] var1 = new class221[this.field1938.length];
        for (int var2 = 0; var2 < this.field1938.length; var2++) {
            var1[var2] = class221.method3913(Statics.field1943, this.field1938[var2], 0);
        }
        class221 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class221(var1, var1.length);
        }
        if (this.field1944 != null) {
            for (int var4 = 0; var4 < this.field1944.length; var4++) {
                var3.method3995(this.field1944[var4], this.field1951[var4]);
            }
        }
        if (this.field1946 != null) {
            for (int var5 = 0; var5 < this.field1946.length; var5++) {
                var3.method3965(this.field1946[var5], this.field1947[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("hv.ab(I)Z")
    public boolean method3304() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1948[var2] != -1 && !Statics.field1943.method6082(this.field1948[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("hv.ak(B)Lit;")
    public class221 method3309() {
        class221[] var1 = new class221[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1948[var3] != -1) {
                var1[var2++] = class221.method3913(Statics.field1943, this.field1948[var3], 0);
            }
        }
        class221 var4 = new class221(var1, var2);
        if (this.field1944 != null) {
            for (int var5 = 0; var5 < this.field1944.length; var5++) {
                var4.method3995(this.field1944[var5], this.field1951[var5]);
            }
        }
        if (this.field1946 != null) {
            for (int var6 = 0; var6 < this.field1946.length; var6++) {
                var4.method3965(this.field1946[var6], this.field1947[var6]);
            }
        }
        return var4;
    }
}
