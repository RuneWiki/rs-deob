package deob;

@ObfuscatedName("hj")
public class class185 extends class444 {

    @ObfuscatedName("hj.ac")
    public static class280 field1945 = new class280(64);

    @ObfuscatedName("hj.au")
    public int field1952 = -1;

    @ObfuscatedName("hj.ab")
    public int[] field1956;

    @ObfuscatedName("hj.aq")
    public short[] field1948;

    @ObfuscatedName("hj.al")
    public short[] field1949;

    @ObfuscatedName("hj.at")
    public short[] field1942;

    @ObfuscatedName("hj.aa")
    public short[] field1943;

    @ObfuscatedName("hj.ay")
    public int[] field1947 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("hj.ao")
    public boolean field1953 = false;

    @ObfuscatedName("client.af(Lnm;Lnm;B)V")
    public static void method1674(class344 arg0, class344 arg1) {
        Statics.field1951 = arg0;
        Statics.field1946 = arg1;
        Statics.field1944 = Statics.field1951.method6081(3);
    }

    @ObfuscatedName("dn.an(II)Lhj;")
    public static class185 method2539(int arg0) {
        class185 var1 = (class185) field1945.method5119((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1951.method6090(3, arg0);
        class185 var3 = new class185();
        if (var2 != null) {
            var3.method3396(new class489(var2));
        }
        field1945.method5121(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hj.aw(Lsg;I)V")
    public void method3396(class489 arg0) {
        while (true) {
            int var2 = arg0.method8248();
            if (var2 == 0) {
                return;
            }
            this.method3377(arg0, var2);
        }
    }

    @ObfuscatedName("hj.ac(Lsg;IB)V")
    public void method3377(class489 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1952 = arg0.method8248();
        } else if (arg1 == 2) {
            int var3 = arg0.method8248();
            this.field1956 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1956[var4] = arg0.method8250();
            }
        } else if (arg1 == 3) {
            this.field1953 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method8248();
            this.field1948 = new short[var5];
            this.field1949 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1948[var6] = (short) arg0.method8250();
                this.field1949[var6] = (short) arg0.method8250();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method8248();
            this.field1942 = new short[var7];
            this.field1943 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1942[var8] = (short) arg0.method8250();
                this.field1943[var8] = (short) arg0.method8250();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1947[arg1 - 60] = arg0.method8250();
        }
    }

    @ObfuscatedName("hj.au(I)Z")
    public boolean method3384() {
        if (this.field1956 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1956.length; var2++) {
            if (!Statics.field1946.method6073(this.field1956[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("hj.ab(I)Liz;")
    public class214 method3378() {
        if (this.field1956 == null) {
            return null;
        }
        class214[] var1 = new class214[this.field1956.length];
        for (int var2 = 0; var2 < this.field1956.length; var2++) {
            var1[var2] = class214.method4017(Statics.field1946, this.field1956[var2], 0);
        }
        class214 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class214(var1, var1.length);
        }
        if (this.field1948 != null) {
            for (int var4 = 0; var4 < this.field1948.length; var4++) {
                var3.method3971(this.field1948[var4], this.field1949[var4]);
            }
        }
        if (this.field1942 != null) {
            for (int var5 = 0; var5 < this.field1942.length; var5++) {
                var3.method4022(this.field1942[var5], this.field1943[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("hj.aq(B)Z")
    public boolean method3379() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1947[var2] != -1 && !Statics.field1946.method6073(this.field1947[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("hj.al(B)Liz;")
    public class214 method3380() {
        class214[] var1 = new class214[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1947[var3] != -1) {
                var1[var2++] = class214.method4017(Statics.field1946, this.field1947[var3], 0);
            }
        }
        class214 var4 = new class214(var1, var2);
        if (this.field1948 != null) {
            for (int var5 = 0; var5 < this.field1948.length; var5++) {
                var4.method3971(this.field1948[var5], this.field1949[var5]);
            }
        }
        if (this.field1942 != null) {
            for (int var6 = 0; var6 < this.field1942.length; var6++) {
                var4.method4022(this.field1942[var6], this.field1943[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("au.at(I)V")
    public static void method16() {
        field1945.method5125();
    }
}
