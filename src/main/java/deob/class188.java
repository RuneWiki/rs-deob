package deob;

@ObfuscatedName("hn")
public class class188 extends class439 {

    @ObfuscatedName("hn.ac")
    public static class276 field1953 = new class276(64);

    @ObfuscatedName("hn.ab")
    public static class276 field1946 = new class276(64);

    @ObfuscatedName("hn.an")
    public int field1947;

    @ObfuscatedName("hn.aq")
    public int field1950 = 255;

    @ObfuscatedName("hn.ap")
    public int field1951 = 255;

    @ObfuscatedName("hn.ar")
    public int field1952 = -1;

    @ObfuscatedName("hn.ak")
    public int field1943 = 1;

    @ObfuscatedName("hn.ax")
    public int field1956 = 70;

    @ObfuscatedName("hn.as")
    public int field1955 = -1;

    @ObfuscatedName("hn.ay")
    public int field1954 = -1;

    @ObfuscatedName("hn.am")
    public int field1957 = 30;

    @ObfuscatedName("hn.az")
    public int field1958 = 0;

    @ObfuscatedName("dm.aj(II)Lhn;")
    public static class188 method2424(int arg0) {
        class188 var1 = (class188) field1953.method4921((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1945.method5860(33, arg0);
        class188 var3 = new class188();
        if (var2 != null) {
            var3.method3314(new class478(var2));
        }
        field1953.method4923(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hn.al(Lsy;B)V")
    public void method3314(class478 arg0) {
        while (true) {
            int var2 = arg0.method7909();
            if (var2 == 0) {
                return;
            }
            this.method3315(arg0, var2);
        }
    }

    @ObfuscatedName("hn.ac(Lsy;II)V")
    public void method3315(class478 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method7905();
        } else if (arg1 == 2) {
            this.field1950 = arg0.method7909();
        } else if (arg1 == 3) {
            this.field1951 = arg0.method7909();
        } else if (arg1 == 4) {
            this.field1952 = 0;
        } else if (arg1 == 5) {
            this.field1956 = arg0.method7905();
        } else if (arg1 == 6) {
            arg0.method7909();
        } else if (arg1 == 7) {
            this.field1955 = arg0.method7922();
        } else if (arg1 == 8) {
            this.field1954 = arg0.method7922();
        } else if (arg1 == 11) {
            this.field1952 = arg0.method7905();
        } else if (arg1 == 14) {
            this.field1957 = arg0.method7909();
        } else if (arg1 == 15) {
            this.field1958 = arg0.method7909();
        }
    }

    @ObfuscatedName("hn.ab(S)Lsn;")
    public class492 method3316() {
        if (this.field1955 < 0) {
            return null;
        }
        class492 var1 = (class492) field1946.method4921((long) this.field1955);
        if (var1 != null) {
            return var1;
        }
        class492 var2 = class493.method4861(Statics.field1948, this.field1955, 0);
        if (var2 != null) {
            field1946.method4923(var2, (long) this.field1955);
        }
        return var2;
    }

    @ObfuscatedName("hn.an(B)Lsn;")
    public class492 method3323() {
        if (this.field1954 < 0) {
            return null;
        }
        class492 var1 = (class492) field1946.method4921((long) this.field1954);
        if (var1 != null) {
            return var1;
        }
        class492 var2 = class493.method4861(Statics.field1948, this.field1954, 0);
        if (var2 != null) {
            field1946.method4923(var2, (long) this.field1954);
        }
        return var2;
    }
}
