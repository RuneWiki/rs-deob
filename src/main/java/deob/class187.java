package deob;

@ObfuscatedName("hk")
public class class187 extends class504 {

    @ObfuscatedName("hk.ag")
    public static class317 field1944 = new class317(64);

    @ObfuscatedName("hk.am")
    public static class317 field1949 = new class317(64);

    @ObfuscatedName("hk.ax")
    public int field1946;

    @ObfuscatedName("hk.at")
    public int field1945 = 255;

    @ObfuscatedName("hk.au")
    public int field1956 = 255;

    @ObfuscatedName("hk.ar")
    public int field1950 = -1;

    @ObfuscatedName("hk.al")
    public int field1951 = 1;

    @ObfuscatedName("hk.ad")
    public int field1952 = 70;

    @ObfuscatedName("hk.ah")
    public int field1943 = -1;

    @ObfuscatedName("hk.ap")
    public int field1954 = -1;

    @ObfuscatedName("hk.ab")
    public int field1955 = 30;

    @ObfuscatedName("hk.az")
    public int field1942 = 0;

    @ObfuscatedName("go.ac(II)Lhk;")
    public static class187 method3329(int arg0) {
        class187 var1 = (class187) field1944.method5733((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1948.method6782(33, arg0);
        class187 var3 = new class187();
        var3.field1946 = arg0;
        if (var2 != null) {
            var3.method3550(new class551(var2));
        }
        field1944.method5735(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hk.ae(Lvf;B)V")
    public void method3550(class551 arg0) {
        while (true) {
            int var2 = arg0.method8955();
            if (var2 == 0) {
                return;
            }
            this.method3539(arg0, var2);
        }
    }

    @ObfuscatedName("hk.ag(Lvf;IB)V")
    public void method3539(class551 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method9119();
        } else if (arg1 == 2) {
            this.field1945 = arg0.method8955();
        } else if (arg1 == 3) {
            this.field1956 = arg0.method8955();
        } else if (arg1 == 4) {
            this.field1950 = 0;
        } else if (arg1 == 5) {
            this.field1952 = arg0.method9119();
        } else if (arg1 == 6) {
            arg0.method8955();
        } else if (arg1 == 7) {
            this.field1943 = arg0.method9205();
        } else if (arg1 == 8) {
            this.field1954 = arg0.method9205();
        } else if (arg1 == 11) {
            this.field1950 = arg0.method9119();
        } else if (arg1 == 14) {
            this.field1955 = arg0.method8955();
        } else if (arg1 == 15) {
            this.field1942 = arg0.method8955();
        }
    }

    @ObfuscatedName("hk.am(I)Lvv;")
    public class565 method3537() {
        if (this.field1943 < 0) {
            return null;
        }
        class565 var1 = (class565) field1949.method5733((long) this.field1943);
        if (var1 != null) {
            return var1;
        }
        class565 var2 = class566.method8084(Statics.field1953, this.field1943, 0);
        if (var2 != null) {
            field1949.method5735(var2, (long) this.field1943);
        }
        return var2;
    }

    @ObfuscatedName("hk.ax(I)Lvv;")
    public class565 method3538() {
        if (this.field1954 < 0) {
            return null;
        }
        class565 var1 = (class565) field1949.method5733((long) this.field1954);
        if (var1 != null) {
            return var1;
        }
        class565 var2 = class566.method8084(Statics.field1953, this.field1954, 0);
        if (var2 != null) {
            field1949.method5735(var2, (long) this.field1954);
        }
        return var2;
    }
}
