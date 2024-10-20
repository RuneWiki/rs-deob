package deob;

@ObfuscatedName("ha")
public class class187 extends class511 {

    @ObfuscatedName("ha.ak")
    public static class316 field1950 = new class316(64);

    @ObfuscatedName("ha.aj")
    public static class316 field1951 = new class316(64);

    @ObfuscatedName("ha.ai")
    public int field1952;

    @ObfuscatedName("ha.ae")
    public int field1953 = 255;

    @ObfuscatedName("ha.am")
    public int field1954 = 255;

    @ObfuscatedName("ha.at")
    public int field1955 = -1;

    @ObfuscatedName("ha.au")
    public int field1961 = 1;

    @ObfuscatedName("ha.an")
    public int field1956 = 70;

    @ObfuscatedName("ha.ao")
    public int field1958 = -1;

    @ObfuscatedName("ha.af")
    public int field1960 = -1;

    @ObfuscatedName("ha.ar")
    public int field1957 = 30;

    @ObfuscatedName("ha.ab")
    public int field1949 = 0;

    @ObfuscatedName("id.ap(IS)Lha;")
    public static class187 method4241(int arg0) {
        class187 var1 = (class187) field1950.method5928((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1959.method7009(33, arg0);
        class187 var3 = new class187();
        var3.field1952 = arg0;
        if (var2 != null) {
            var3.method3693(new class558(var2));
        }
        field1950.method5931(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ha.aw(Lvl;I)V")
    public void method3693(class558 arg0) {
        while (true) {
            int var2 = arg0.method9258();
            if (var2 == 0) {
                return;
            }
            this.method3679(arg0, var2);
        }
    }

    @ObfuscatedName("ha.ak(Lvl;IB)V")
    public void method3679(class558 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method9260();
        } else if (arg1 == 2) {
            this.field1953 = arg0.method9258();
        } else if (arg1 == 3) {
            this.field1954 = arg0.method9258();
        } else if (arg1 == 4) {
            this.field1955 = 0;
        } else if (arg1 == 5) {
            this.field1956 = arg0.method9260();
        } else if (arg1 == 6) {
            arg0.method9258();
        } else if (arg1 == 7) {
            this.field1958 = arg0.method9278();
        } else if (arg1 == 8) {
            this.field1960 = arg0.method9278();
        } else if (arg1 == 11) {
            this.field1955 = arg0.method9260();
        } else if (arg1 == 14) {
            this.field1957 = arg0.method9258();
        } else if (arg1 == 15) {
            this.field1949 = arg0.method9258();
        }
    }

    @ObfuscatedName("ha.aj(I)Lvv;")
    public class572 method3691() {
        if (this.field1958 < 0) {
            return null;
        }
        class572 var1 = (class572) field1951.method5928((long) this.field1958);
        if (var1 != null) {
            return var1;
        }
        class572 var2 = class573.method8571(Statics.field342, this.field1958, 0);
        if (var2 != null) {
            field1951.method5931(var2, (long) this.field1958);
        }
        return var2;
    }

    @ObfuscatedName("ha.ai(B)Lvv;")
    public class572 method3681() {
        if (this.field1960 < 0) {
            return null;
        }
        class572 var1 = (class572) field1951.method5928((long) this.field1960);
        if (var1 != null) {
            return var1;
        }
        class572 var2 = class573.method8571(Statics.field342, this.field1960, 0);
        if (var2 != null) {
            field1951.method5931(var2, (long) this.field1960);
        }
        return var2;
    }
}
